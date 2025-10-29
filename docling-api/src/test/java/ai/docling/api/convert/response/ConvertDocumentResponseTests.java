package ai.docling.api.convert.response;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for {@link ConvertDocumentResponse}.
 */
class ConvertDocumentResponseTests {

  @Test
  void createResponseWithAllFields() {
    DocumentResponse document = new DocumentResponse()
        .withDoctagsContent("doctags content")
        .withFilename("test-file.pdf")
        .withHtmlContent("<html>content</html>")
        .withJsonContent(Map.of("key", "value"))
        .withMarkdownContent("# Markdown content")
        .withTextContent("Plain text content");

    List<ErrorItem> errors = List.of(
        new ErrorItem().withComponentType("parser").withErrorMessage("Parse error").withModuleName("pdf_module"),
        new ErrorItem().withComponentType("converter").withErrorMessage("Conversion warning").withModuleName("html_module")
    );

    Double processingTime = 1.5;
    String status = "success";
    Map<String, Object> timings = Map.of(
        "parse_time", 0.8,
        "convert_time", 0.7
    );

    ConvertDocumentResponse response = new ConvertDocumentResponse()
        .withDocument(document)
        .withErrors(errors)
        .withProcessingTime(processingTime)
        .withStatus(status)
        .withTimings(timings);

    assertThat(response.getDocument()).isEqualTo(document);
    assertThat(response.getErrors()).containsExactlyInAnyOrderElementsOf(errors);
    assertThat(response.getProcessingTime()).isEqualTo(processingTime);
    assertThat(response.getStatus()).isEqualTo(status);
    assertThat(response.getTimings()).containsExactlyInAnyOrderEntriesOf(timings);
  }

  @Test
  void createResponseWithNullFields() {
    ConvertDocumentResponse response = new ConvertDocumentResponse();

    assertThat(response.getDocument()).isNull();
    assertThat(response.getErrors()).isNotNull().isEmpty();
    assertThat(response.getProcessingTime()).isNull();
    assertThat(response.getStatus()).isNull();
    assertThat(response.getTimings()).isNotNull().isEmpty();
  }

  @Test
  void createResponseWithEmptyCollections() {
    DocumentResponse document = new DocumentResponse()
        .withFilename("empty-file.txt")
        .withTextContent("");

    ConvertDocumentResponse response = new ConvertDocumentResponse()
        .withDocument(document)
        .withProcessingTime(0.1)
        .withStatus("completed");

    assertThat(response.getDocument()).isEqualTo(document);
    assertThat(response.getErrors()).isEmpty();
    assertThat(response.getProcessingTime()).isEqualTo(0.1);
    assertThat(response.getStatus()).isEqualTo("completed");
    assertThat(response.getTimings()).isEmpty();
  }

  @Test
  void convertDocumentResponseIsImmutable() {
    List<ErrorItem> errors = new ArrayList<>(List.of(
        new ErrorItem().withComponentType("original").withErrorMessage("Original error").withModuleName("original_module")
    ));

    Map<String, Object> timings = new HashMap<>(Map.of("original_time", 1.0));

    ConvertDocumentResponse response = new ConvertDocumentResponse()
        .withErrors(errors)
        .withTimings(timings);

    assertThat(response.getErrors()).containsExactlyInAnyOrderElementsOf(errors);
    assertThat(response.getTimings()).containsExactlyInAnyOrderEntriesOf(timings);

    errors.add(new ErrorItem().withComponentType("modified").withErrorMessage("Modified error").withModuleName("modified_module"));
    timings.put("modified_time", 3.0);

    assertThat(response.getErrors()).hasSize(1);
    assertThat(response.getErrors().get(0).getErrorMessage()).isEqualTo("Original error");
    assertThat(response.getTimings()).hasSize(1);
    assertThat(response.getTimings().get("original_time")).isEqualTo(1.0);
  }

}
