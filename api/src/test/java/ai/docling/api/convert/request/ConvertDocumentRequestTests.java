package ai.docling.api.convert.request;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.InstanceOfAssertFactories.type;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ai.docling.api.convert.request.options.ConvertDocumentOptions;
import ai.docling.api.convert.request.source.FileSource;
import ai.docling.api.convert.request.source.HttpSource;
import ai.docling.api.convert.request.target.InBodyTarget;
import ai.docling.api.convert.request.target.ZipTarget;

/**
 * Unit tests for {@link ConvertDocumentRequest}.
 */
class ConvertDocumentRequestTests {
  @Test
  void whenOptionsIsNullThenThrow() {
    var uri = URI.create("http://example.com");
    var httpSource = new HttpSource().withUrl(uri);

    assertThatThrownBy(() -> new ConvertDocumentRequest().withSources(List.of(httpSource)).withOptions(null))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("options cannot be null");
  }

  @Test
  void buildWithHttpSourcesAsList() {
    ConvertDocumentRequest request = new ConvertDocumentRequest()
        .withSources(List.of(new HttpSource().withUrl(URI.create("http://example.com"))))
        .withTarget(new InBodyTarget());
    assertThat(request.getSources()).hasSize(1);
    assertThat(request.getSources().get(0)).isInstanceOf(HttpSource.class);
  }

  @Test
  void buildWithHttpSourcesAsVarargs() {
    ConvertDocumentRequest request = new ConvertDocumentRequest()
        .withSources(List.of(new HttpSource().withUrl(URI.create("http://example.com")), new HttpSource().withUrl(URI.create("http://example.org"))));

    assertThat(request.getSources())
        .hasSize(2)
        .allSatisfy(source -> assertThat(source).isInstanceOf(HttpSource.class));
  }

  @Test
  void buildWithFileSourcesAsList() {
    ConvertDocumentRequest request = new ConvertDocumentRequest()
        .withSources(List.of(new FileSource().withFilename("file:///path/to/file.txt").withBase64String("content")));

    assertThat(request.getSources())
        .hasSize(1)
        .allSatisfy(source -> assertThat(source).isInstanceOf(FileSource.class));
  }

  @Test
  void buildWithFileSourcesAsVarargs() {
    ConvertDocumentRequest request = new ConvertDocumentRequest()
        .withSources(List.of(
            new FileSource().withFilename("file1.txt").withBase64String("base64string1"),
            new FileSource().withFilename("file2.txt").withBase64String("base64string2")
            )
        )
        .withTarget(new ZipTarget());

    assertThat(request.getSources())
        .hasSize(2)
        .allSatisfy(source -> assertThat(source).isInstanceOf(FileSource.class));
  }

  @Test
  void whenMixedSourcesThenThrow() {
    var sources = List.of(
        new HttpSource().withUrl(URI.create("http://example.com")),
        new FileSource().withFilename("file.txt").withBase64String("base64string")
    );
    assertThatThrownBy(() -> new ConvertDocumentRequest().withSources(sources))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("All sources must be of the same type (HttpSource or FileSource)");
  }

  @Test
  void convertDocumentRequestIsImmutable() {
    List<FileSource> sources = new ArrayList<>(List.of(new FileSource().withFilename("test.txt").withBase64String("dGVzdCBjb250ZW50")));

    ConvertDocumentRequest request = new ConvertDocumentRequest()
        .withSources(sources)
        .withOptions(new ConvertDocumentOptions().withDoOcr(true))
        .withTarget(new InBodyTarget());

    assertThat(request.getSources())
        .usingRecursiveFieldByFieldElementComparator()
        .containsExactlyInAnyOrderElementsOf(sources);

    sources.add(new FileSource().withFilename("changed.txt").withBase64String("Y2hhbmdlZA=="));

    assertThat(request.getSources())
        .singleElement()
        .asInstanceOf(type(FileSource.class))
        .extracting(FileSource::getFilename, FileSource::getBase64String)
        .containsExactly("test.txt", "dGVzdCBjb250ZW50");
  }
}
