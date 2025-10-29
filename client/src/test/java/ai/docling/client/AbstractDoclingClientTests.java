package ai.docling.client;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.Duration;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import ai.docling.api.DoclingApi;
import ai.docling.api.convert.request.ConvertDocumentRequest;
import ai.docling.api.convert.request.options.ConvertDocumentOptions;
import ai.docling.api.convert.request.options.TableFormerMode;
import ai.docling.api.convert.request.source.FileSource;
import ai.docling.api.convert.request.source.HttpSource;
import ai.docling.api.convert.response.ConvertDocumentResponse;
import ai.docling.api.health.HealthCheckResponse;
import ai.docling.testcontainers.DoclingContainer;
import ai.docling.testcontainers.config.DoclingContainerConfig;

abstract class AbstractDoclingClientTests {
  protected static final DoclingContainer doclingContainer = new DoclingContainer(
    DoclingContainerConfig.builder()
        .imageName(DoclingContainerConfig.DOCLING_IMAGE)
        .enableUi(true)
        .build(),
      Optional.of(Duration.ofMinutes(2))
  );

  static {
    doclingContainer.start();
  }

  protected abstract DoclingApi getDoclingClient();

  @Test
  void shouldSuccessfullyCallHealthEndpoint() {
    HealthCheckResponse response = getDoclingClient().health();

    assertThat(response)
        .isNotNull()
        .extracting(HealthCheckResponse::getStatus)
        .isEqualTo("ok");
  }

  @Test
  void shouldConvertHttpSourceSuccessfully() {
    ConvertDocumentRequest request = new ConvertDocumentRequest()
        .withSources(List.of(new HttpSource().withUrl(URI.create("https://docs.arconia.io/arconia-cli/latest/development/dev/"))));

    ConvertDocumentResponse response = getDoclingClient().convertSource(request);

    assertThat(response).isNotNull();

    assertThat(response.getStatus()).isNotEmpty();
    assertThat(response.getDocument()).isNotNull();
    assertThat(response.getDocument().getFilename()).isNotEmpty();

    if (response.getProcessingTime() != null) {
      assertThat(response.getProcessingTime()).isPositive();
    }

    assertThat(response.getDocument().getMarkdownContent()).isNotEmpty();
  }

  @Test
  void shouldConvertFileSourceSuccessfully() throws IOException {
    var fileResource = readFileFromClasspath("story.pdf");
    ConvertDocumentRequest request = new ConvertDocumentRequest()
        .withSources(List.of(new FileSource().withFilename("story.pdf").withBase64String(Base64.getEncoder().encodeToString(fileResource))));

    ConvertDocumentResponse response = getDoclingClient().convertSource(request);

    assertThat(response).isNotNull();
    assertThat(response.getStatus()).isNotEmpty();
    assertThat(response.getDocument()).isNotNull();
    assertThat(response.getDocument().getFilename()).isEqualTo("story.pdf");

    if (response.getProcessingTime() != null) {
      assertThat(response.getProcessingTime()).isPositive();
    }

    assertThat(response.getDocument().getMarkdownContent()).isNotEmpty();
  }

  @Test
  void shouldHandleConversionWithDifferentDocumentOptions() {
    ConvertDocumentOptions options = new ConvertDocumentOptions()
        .withDoOcr(true)
        .withIncludeImages(true)
        .withTableMode(TableFormerMode.FAST);

    ConvertDocumentRequest request = new ConvertDocumentRequest()
        .withSources(List.of(new HttpSource().withUrl(URI.create("https://docs.arconia.io/arconia-cli/latest/development/dev/"))))
        .withOptions(options);

    ConvertDocumentResponse response = getDoclingClient().convertSource(request);

    assertThat(response).isNotNull();
    assertThat(response.getStatus()).isNotEmpty();
    assertThat(response.getDocument()).isNotNull();
  }

  private static byte[] readFileFromClasspath(String filePath) throws IOException {
    try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(filePath)) {
      if (inputStream == null) {
        throw new IOException("File not found in classpath: " + filePath);
      }
      return inputStream.readAllBytes();
    }
  }
}
