package ai.docling.api.convert.response;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response returned by the Convert API for a single conversion request.
 *
 * <p>Serialization uses {@link JsonInclude.Include#NON_EMPTY}, so nulls and empty
 * collections/strings are omitted from JSON output.</p>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ConvertDocumentResponse {

  @JsonProperty("document")
  private DocumentResponse document;

  @JsonProperty("errors")
  private List<ErrorItem> errors = new ArrayList<>();

  @JsonProperty("processing_time")
  private Double processingTime;

  @JsonProperty("status")
  private String status;

  @JsonProperty("timings")
  private Map<String, Object> timings = new HashMap<>();

  // Getters/setters
  /**
   * The converted document payload.
   * @return document or {@code null}
   */
  @Nullable
  public DocumentResponse getDocument() {
    return document;
  }

  /**
   * Sets the converted document payload.
   * @param document document; may be {@code null}
   */
  public void setDocument(@Nullable DocumentResponse document) {
    this.document = document;
  }

  /**
   * Fluent setter for {@link #setDocument(DocumentResponse)}.
   * @param document document; may be {@code null}
   * @return this instance for chaining
   */
  public ConvertDocumentResponse withDocument(@Nullable DocumentResponse document) {
    setDocument(document);
    return this;
  }

  /**
   * List of errors, if any. When non-null, returned as an unmodifiable view.
   * @return errors list or {@code null}
   */
  public List<ErrorItem> getErrors() {
    return Collections.unmodifiableList(errors);
  }

  /**
   * Sets the errors list; defensively copies when non-null.
   * @param errors list of errors; may be {@code null}
   */
  public void setErrors(@Nullable List<ErrorItem> errors) {
    this.errors.clear();

    if (errors != null) {
      this.errors.addAll(errors);
    }
  }

  /**
   * Fluent setter for {@link #setErrors(List)}.
   * @param errors list of errors; may be {@code null}
   * @return this instance for chaining
   */
  public ConvertDocumentResponse withErrors(@Nullable List<ErrorItem> errors) {
    setErrors(errors);
    return this;
  }

  /**
   * Total processing time in seconds.
   * @return processing time or {@code null}
   */
  @Nullable
  public Double getProcessingTime() {
    return processingTime;
  }

  /**
   * Sets the processing time in seconds.
   * @param processingTime processing time; may be {@code null}
   */
  public void setProcessingTime(@Nullable Double processingTime) {
    this.processingTime = processingTime;
  }

  /**
   * Fluent setter for {@link #setProcessingTime(Double)}.
   * @param processingTime processing time; may be {@code null}
   * @return this instance for chaining
   */
  public ConvertDocumentResponse withProcessingTime(@Nullable Double processingTime) {
    setProcessingTime(processingTime);
    return this;
  }

  /**
   * Status string of the conversion.
   * @return status or {@code null}
   */
  @Nullable
  public String getStatus() {
    return status;
  }

  /**
   * Sets the status string of the conversion.
   * @param status status; may be {@code null}
   */
  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  /**
   * Fluent setter for {@link #setStatus(String)}.
   * @param status status; may be {@code null}
   * @return this instance for chaining
   */
  public ConvertDocumentResponse withStatus(@Nullable String status) {
    setStatus(status);
    return this;
  }

  /**
   * Timings map with detailed timing information. When non-null, returned as an
   * unmodifiable view.
   * @return timings or {@code null}
   */
  @Nullable
  public Map<String, Object> getTimings() {
    return Collections.unmodifiableMap(timings);
  }

  /**
   * Sets the timings map; defensively copies when non-null.
   * @param timings timings; may be {@code null}
   */
  public void setTimings(@Nullable Map<String, Object> timings) {
    this.timings.clear();

    if (timings != null) {
      this.timings.putAll(timings);
    }
  }

  /**
   * Fluent setter for {@link #setTimings(Map)}.
   * @param timings timings; may be {@code null}
   * @return this instance for chaining
   */
  public ConvertDocumentResponse withTimings(@Nullable Map<String, Object> timings) {
    setTimings(timings);
    return this;
  }

  /**
   * Returns a string representation with actual values.
   */
  @Override
  public String toString() {
    return "ConvertDocumentResponse{" +
        "document=" + (document == null ? "null" : document.toString()) +
        ", errors=" + (errors == null ? "null" : errors.toString()) +
        ", processingTime=" + (processingTime == null ? "null" : processingTime.toString()) +
        ", status=" + (status == null ? "null" : "'" + status + "'") +
        ", timings=" + (timings == null ? "null" : timings.toString()) +
        '}';
  }
}
