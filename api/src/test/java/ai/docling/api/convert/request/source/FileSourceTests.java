package ai.docling.api.convert.request.source;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for {@link FileSource}.
 */
class FileSourceTests {

  @Test
  void whenBase64StringIsNullThenThrow() {
    assertThatThrownBy(() -> new FileSource().withFilename("test.txt").withBase64String(null))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("base64String cannot be null or blank");
  }

  @Test
  void whenBase64StringIsEmptyThenThrow() {
    assertThatThrownBy(() -> new FileSource().withFilename("test.txt").withBase64String(""))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("base64String cannot be null or blank");
  }

  @Test
  void whenBase64StringIsBlankThenThrow() {
    assertThatThrownBy(() -> new FileSource().withFilename("test.txt").withBase64String("   "))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("base64String cannot be null or blank");
  }

  @Test
  void whenFilenameIsNullThenThrow() {
    assertThatThrownBy(() -> new FileSource().withFilename(null).withBase64String("dGVzdCBjb250ZW50"))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("filename cannot be null or blank");
  }

  @Test
  void whenFilenameIsEmptyThenThrow() {
    assertThatThrownBy(() -> new FileSource().withFilename("").withBase64String("dGVzdCBjb250ZW50"))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("filename cannot be null or blank");
  }

  @Test
  void whenFilenameIsBlankThenThrow() {
    assertThatThrownBy(() -> new FileSource().withFilename("   ").withBase64String("dGVzdCBjb250ZW50"))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("filename cannot be null or blank");
  }

  @Test
  void whenValidParametersThenCreateFileSource() {
    String base64String = "dGVzdCBjb250ZW50";
    String filename = "test.txt";

    FileSource fileSource = new FileSource().withBase64String(base64String).withFilename(filename);

    assertThat(fileSource.getKind()).isEqualTo(Source.Kind.FILE);
    assertThat(fileSource.getBase64String()).isEqualTo(base64String);
    assertThat(fileSource.getFilename()).isEqualTo(filename);
  }

  @Test
  void kindIsAlwaysSetToFile() {
    FileSource fileSource = new FileSource().withKind(Source.Kind.HTTP).withBase64String("dGVzdCBjb250ZW50").withFilename("test.txt");

    assertThat(fileSource.getKind()).isEqualTo(Source.Kind.FILE);
  }

  @Test
  void fromStaticMethodCreatesFileSource() {
    String filename = "document.pdf";
    String base64String = "dGVzdCBjb250ZW50";

    FileSource fileSource = new FileSource().withFilename(filename).withBase64String(base64String);

    assertThat(fileSource.getKind()).isEqualTo(Source.Kind.FILE);
    assertThat(fileSource.getBase64String()).isEqualTo(base64String);
    assertThat(fileSource.getFilename()).isEqualTo(filename);
  }

  @Test
  void builderCreatesFileSource() {
    String filename = "presentation.pptx";
    String base64String = "dGVzdCBjb250ZW50";

    FileSource fileSource = new FileSource()
        .withFilename(filename)
        .withBase64String(base64String)
        ;

    assertThat(fileSource.getKind()).isEqualTo(Source.Kind.FILE);
    assertThat(fileSource.getBase64String()).isEqualTo(base64String);
    assertThat(fileSource.getFilename()).isEqualTo(filename);
  }

}
