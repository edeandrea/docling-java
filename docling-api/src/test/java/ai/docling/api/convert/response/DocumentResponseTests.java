package ai.docling.api.convert.response;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for {@link DocumentResponse}.
 */
class DocumentResponseTests {
  @Test
  void createResponseWithAllFields() {
    String doctagsContent = "doctags content";
    String filename = "test-document.pdf";
    String htmlContent = "<html><body>Test content</body></html>";
    Map<String, Object> jsonContent = Map.of(
        "title", "Test Document",
        "author", "Test Author",
        "pages", 5
    );
    String markdownContent = "# Test Document\n\nThis is a test document.";
    String textContent = "Test Document\n\nThis is a test document.";

    DocumentResponse response = new DocumentResponse()
        .withDoctagsContent(doctagsContent)
        .withFilename(filename)
        .withHtmlContent(htmlContent)
        .withJsonContent(new HashMap<>(jsonContent))
        .withMarkdownContent(markdownContent)
        .withTextContent(textContent);

    assertThat(response.getDoctagsContent()).isEqualTo(doctagsContent);
    assertThat(response.getFilename()).isEqualTo(filename);
    assertThat(response.getHtmlContent()).isEqualTo(htmlContent);
    assertThat(response.getJsonContent()).containsExactlyInAnyOrderEntriesOf(jsonContent);
    assertThat(response.getMarkdownContent()).isEqualTo(markdownContent);
    assertThat(response.getTextContent()).isEqualTo(textContent);
  }

  @Test
  void createResponseWithNullFields() {
    DocumentResponse response = new DocumentResponse();

    assertThat(response.getDoctagsContent()).isNull();
    assertThat(response.getFilename()).isNull();
    assertThat(response.getHtmlContent()).isNull();
    assertThat(response.getJsonContent()).isNotNull().isEmpty();
    assertThat(response.getMarkdownContent()).isNull();
    assertThat(response.getTextContent()).isNull();
  }

  @Test
  void createResponseWithEmptyFields() {
    String filename = "empty-document.txt";
    String markdownContent = "";
    String textContent = "";

    DocumentResponse response = new DocumentResponse()
        .withFilename(filename)
        .withMarkdownContent(markdownContent)
        .withTextContent(textContent);

    assertThat(response.getDoctagsContent()).isNull();
    assertThat(response.getFilename()).isEqualTo(filename);
    assertThat(response.getHtmlContent()).isNull();
    assertThat(response.getJsonContent()).isNotNull().isEmpty();
    assertThat(response.getMarkdownContent()).isEmpty();
    assertThat(response.getTextContent()).isEmpty();
  }

  @Test
  void documentResponseJsonContentReflectsOriginalMapChanges() {
    Map<String, Object> jsonContent = new HashMap<>(Map.of(
        "original", "value",
        "count", 1
    ));

    DocumentResponse response = new DocumentResponse();
    response.setJsonContent(jsonContent);

    assertThat(response.getJsonContent()).containsExactlyInAnyOrderEntriesOf(jsonContent);

    jsonContent.put("modified", "new value");

    assertThat(response.getJsonContent()).hasSize(2);

    response.setJsonContent(jsonContent);
    assertThat(response.getJsonContent()).hasSize(3);

    assertThat(response.getJsonContent().get("original")).isEqualTo("value");
    assertThat(response.getJsonContent().get("count")).isEqualTo(1);
    assertThat(response.getJsonContent()).containsKey("modified");
  }

}
