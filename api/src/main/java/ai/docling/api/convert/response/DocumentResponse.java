package ai.docling.api.convert.response;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A simple mutable POJO representing the converted document returned by the
 * Docling Convert API. The properties map 1:1 to the JSON payload using the
 * {@link JsonProperty} names declared on each field.
 *
 * <p>Serialization is configured with {@link JsonInclude.Include#NON_EMPTY},
 * meaning nulls, empty strings, and empty collections/maps are omitted from the
 * serialized JSON.</p>
 *
 * <p>Notes on mutability and maps:</p>
 * <ul>
 *   <li>{@code jsonContent} defaults to an empty map and is never exposed as
 *   {@code null}. The getter returns an unmodifiable view.</li>
 *   <li>When setting {@code jsonContent} with a non-null map, the reference is
 *   preserved; subsequent external modifications to the provided map are
 *   observable via {@link #getJsonContent()}.</li>
 * </ul>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DocumentResponse {

  @JsonProperty("doctags_content")
  private String doctagsContent;

  @JsonProperty("filename")
  private String filename;

  @JsonProperty("html_content")
  private String htmlContent;

  @JsonProperty("json_content")
  private Map<String, Object> jsonContent = new HashMap<>();

  @JsonProperty("md_content")
  private String markdownContent;

  @JsonProperty("text_content")
  private String textContent;

  // Getters and setters
  /**
   * Returns the DocTags representation of the document, if available.
   *
   * @return doctags content, or {@code null} if not present
   */
  @Nullable
  public String getDoctagsContent() {
    return doctagsContent;
  }

  /**
   * Sets the DocTags representation of the document.
   *
   * @param doctagsContent the DocTags content; may be {@code null}
   */
  public void setDoctagsContent(@Nullable String doctagsContent) {
    this.doctagsContent = doctagsContent;
  }

  /**
   * Returns the original filename of the processed document.
   *
   * @return filename, or {@code null} if unknown
   */
  @Nullable
  public String getFilename() {
    return filename;
  }

  /**
   * Sets the original filename of the processed document.
   *
   * @param filename the filename; may be {@code null}
   */
  public void setFilename(@Nullable String filename) {
    this.filename = filename;
  }

  /**
   * Returns the HTML content produced by the conversion.
   *
   * @return HTML content, or {@code null} if not produced
   */
  @Nullable
  public String getHtmlContent() {
    return htmlContent;
  }

  /**
   * Sets the HTML content produced by the conversion.
   *
   * @param htmlContent the HTML content; may be {@code null}
   */
  public void setHtmlContent(@Nullable String htmlContent) {
    this.htmlContent = htmlContent;
  }

  /**
   * Returns an unmodifiable view of the JSON content map. Never {@code null}.
   * When set via {@link #setJsonContent(Map)}, the provided map reference is
   * preserved (if non-null), so external changes to that map will be reflected
   * here.
   *
   * @return unmodifiable view of the JSON content map (possibly empty)
   */
  public Map<String, Object> getJsonContent() {
    return Collections.unmodifiableMap(jsonContent);
  }

  /**
   * Sets the JSON content map. If {@code jsonContent} is {@code null}, an empty
   * map is assigned. Otherwise, the provided map reference is preserved so that
   * subsequent modifications to the same map are visible via
   * {@link #getJsonContent()}.
   *
   * @param jsonContent the JSON content map; may be {@code null}
   */
  public void setJsonContent(@Nullable Map<String, Object> jsonContent) {
    this.jsonContent.clear();

    if (jsonContent != null) {
      this.jsonContent.putAll(jsonContent);
    }
  }

  /**
   * Returns the Markdown content produced by the conversion.
   *
   * @return Markdown content, or {@code null} if not produced
   */
  @Nullable
  public String getMarkdownContent() {
    return markdownContent;
  }

  /**
   * Sets the Markdown content produced by the conversion.
   *
   * @param markdownContent the Markdown content; may be {@code null}
   */
  public void setMarkdownContent(@Nullable String markdownContent) {
    this.markdownContent = markdownContent;
  }

  /**
   * Returns the plain text content produced by the conversion.
   *
   * @return plain text content, or {@code null} if not produced
   */
  @Nullable
  public String getTextContent() {
    return textContent;
  }

  /**
   * Sets the plain text content produced by the conversion.
   *
   * @param textContent the text content; may be {@code null}
   */
  public void setTextContent(@Nullable String textContent) {
    this.textContent = textContent;
  }

  // Fluent builder-style methods
  /**
   * Fluent setter for {@link #setDoctagsContent(String)}.
   *
   * @param doctagsContent the DocTags content; may be {@code null}
   * @return this instance for chaining
   */
  public DocumentResponse withDoctagsContent(@Nullable String doctagsContent) {
    setDoctagsContent(doctagsContent);
    return this;
  }

  /**
   * Fluent setter for {@link #setFilename(String)}.
   *
   * @param filename the filename; may be {@code null}
   * @return this instance for chaining
   */
  public DocumentResponse withFilename(@Nullable String filename) {
    setFilename(filename);
    return this;
  }

  /**
   * Fluent setter for {@link #setHtmlContent(String)}.
   *
   * @param htmlContent the HTML content; may be {@code null}
   * @return this instance for chaining
   */
  public DocumentResponse withHtmlContent(@Nullable String htmlContent) {
    setHtmlContent(htmlContent);
    return this;
  }

  /**
   * Fluent setter for {@link #setJsonContent(Map)}.
   *
   * @param jsonContent the JSON content map; may be {@code null}
   * @return this instance for chaining
   */
  public DocumentResponse withJsonContent(@Nullable Map<String, Object> jsonContent) {
    setJsonContent(jsonContent);
    return this;
  }

  /**
   * Fluent setter for {@link #setMarkdownContent(String)}.
   *
   * @param markdownContent the Markdown content; may be {@code null}
   * @return this instance for chaining
   */
  public DocumentResponse withMarkdownContent(@Nullable String markdownContent) {
    setMarkdownContent(markdownContent);
    return this;
  }

  /**
   * Fluent setter for {@link #setTextContent(String)}.
   *
   * @param textContent the text content; may be {@code null}
   * @return this instance for chaining
   */
  public DocumentResponse withTextContent(@Nullable String textContent) {
    setTextContent(textContent);
    return this;
  }

  /**
   * Returns a string representation containing the actual values of all fields.
   *
   * @return string representation of this response
   */
  @Override
  public String toString() {
    return "DocumentResponse{" +
        "doctagsContent=" + (doctagsContent == null ? "null" : "'" + doctagsContent + "'") +
        ", filename=" + (filename == null ? "null" : "'" + filename + "'") +
        ", htmlContent=" + (htmlContent == null ? "null" : "'" + htmlContent + "'") +
        ", jsonContent=" + (jsonContent == null ? "null" : jsonContent.toString()) +
        ", markdownContent=" + (markdownContent == null ? "null" : "'" + markdownContent + "'") +
        ", textContent=" + (textContent == null ? "null" : "'" + textContent + "'") +
        '}';
  }
}
