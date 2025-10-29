package ai.docling.api.convert.request;

import static ai.docling.api.util.ValidationUtils.ensureNotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import ai.docling.api.convert.request.options.ConvertDocumentOptions;
import ai.docling.api.convert.request.source.FileSource;
import ai.docling.api.convert.request.source.HttpSource;
import ai.docling.api.convert.request.source.Source;
import ai.docling.api.convert.request.target.Target;

/**
 * Represents a request to convert a document. The request includes the source(s) of the document,
 * options for the conversion process, and the target specification for the converted output.
 *
 * <p>This class is serialized into JSON to conform to the API specification using
 * {@link JsonProperty} annotations. Fields with {@code null} values or empty collections
 * are omitted from the serialized JSON using {@link JsonInclude}.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ConvertDocumentRequest {
  @JsonProperty("sources")
  private List<Source> sources = new ArrayList<>();

  @JsonProperty("options")
  private ConvertDocumentOptions options;

  @JsonProperty("target")
  private Target target;

  private static void checkSources(List<? extends Source> sources) {
    if ((sources == null) || sources.isEmpty()) {
      throw new IllegalArgumentException("sources must not be null or empty");
    }

    if (!(sources.stream().allMatch(HttpSource.class::isInstance) || sources.stream().allMatch(FileSource.class::isInstance))) {
      throw new IllegalArgumentException("All sources must be of the same type (HttpSource or FileSource)");
    }
  }

  /**
   * Retrieves an unmodifiable view of the list of document sources associated with this request.
   * Modifications to the returned list will result in an {@link UnsupportedOperationException}.
   *
   * @return an unmodifiable {@link List} of {@link Source} objects representing the document sources.
   */
  public List<Source> getSources() {
    return Collections.unmodifiableList(sources);
  }

  /**
   * Sets the list of sources for the document conversion request. The existing list of sources
   * will be cleared before adding the provided sources. If the provided list is {@code null},
   * the sources list will remain cleared.
   *
   * @param sources a {@link List} of {@link Source} objects representing the document sources to set.
   *                Elements in the list must not be {@code null}, but the list itself may be
   *                {@code null}.
   * @throws IllegalArgumentException if the resulting sources list is empty after processing.
   */
  public void setSources(@Nullable List<? extends Source> sources) {
    checkSources(sources);
    this.sources.clear();

    if (sources != null) {
      this.sources.addAll(sources);
    }
  }

  /**
   * Adds a list of document sources to this {@link ConvertDocumentRequest} and returns the updated instance.
   *
   * <p>This method modifies the list of document sources for the current request using the provided
   * {@code sources} list. The list replaces any existing sources. If the provided list is {@code null},
   * the sources are cleared.
   *
   * @param sources a {@link List} of {@link Source} objects to set as the new document sources for the request.
   *                The list itself may be {@code null}, but individual elements within the list must not be {@code null}.
   * @return the updated {@link ConvertDocumentRequest} instance.
   */
  public ConvertDocumentRequest withSources(@Nullable List<? extends Source> sources) {
    setSources(sources);
    return this;
  }

  /**
   * Retrieves the document conversion options associated with this request.
   *
   * @return the {@link ConvertDocumentOptions} object representing the conversion options,
   * or {@code null} if no options have been set.
   */
  @Nullable
  public ConvertDocumentOptions getOptions() {
    return options;
  }

  /**
   * Sets the document conversion options for this request.
   *
   * <p>The provided {@link ConvertDocumentOptions} object defines the specific
   * settings to be applied during the document conversion process. If {@code options}
   * is {@code null}, the current options will be cleared.
   *
   * @param options a {@link ConvertDocumentOptions} object representing the conversion
   *                settings to apply, or {@code null} to clear the options.
   */
  public void setOptions(ConvertDocumentOptions options) {
    this.options = ensureNotNull(options, "options");
  }

  /**
   * Updates the document conversion options for this request and returns the updated instance.
   *
   * <p>This method modifies the {@link ConvertDocumentOptions} associated with the current
   * {@link ConvertDocumentRequest}. If the provided {@code options} is {@code null}, the options
   * will be cleared.
   *
   * @param options a {@link ConvertDocumentOptions} object specifying the settings to apply
   *                for the document conversion, or {@code null} to clear the options.
   * @return the updated {@link ConvertDocumentRequest} instance.
   */
  public ConvertDocumentRequest withOptions(ConvertDocumentOptions options) {
    setOptions(options);
    return this;
  }

  /**
   * Retrieves the {@link Target} associated with this {@link ConvertDocumentRequest}.
   *
   * <p>The {@link Target} defines where and how the converted document should be delivered.
   * For example, it may specify delivery in the response body, uploading to a URI, or
   * zipping the document for inclusion in the response.
   *
   * @return the {@link Target} instance representing the delivery method for the converted
   *         document, or {@code null} if no target has been set.
   */
  @Nullable
  public Target getTarget() {
    return target;
  }

  /**
   * Sets the {@link Target} for this {@link ConvertDocumentRequest}.
   *
   * <p>The {@link Target} defines how and where the converted document should be delivered. It may
   * represent delivery in the response body, uploading to a specified URI, or zipping for inclusion
   * in the response.
   *
   * @param target the {@link Target} instance representing the delivery method and destination
   *               for the converted document, or {@code null} to unset the existing target.
   */
  public void setTarget(@Nullable Target target) {
    this.target = target;
  }

  /**
   * Updates the {@link Target} for this {@link ConvertDocumentRequest} and returns the updated instance.
   *
   * <p>The {@link Target} specifies how and where the converted document will be delivered, such as
   * including it in the response body, uploading it to a specific URI, or zipping it.
   *
   * @param target the {@link Target} instance indicating the delivery method and destination for the
   *               converted document, or {@code null} to clear the existing target.
   * @return the updated {@link ConvertDocumentRequest} instance for method chaining.
   */
  public ConvertDocumentRequest withTarget(@Nullable Target target) {
    setTarget(target);
    return this;
  }

  @Override
  public String toString() {
    return "ConvertDocumentRequest{" +
        "sources=" + (sources == null ? "null" : sources.toString()) +
        ", options=" + (options == null ? "null" : options.toString()) +
        ", target=" + (target == null ? "null" : target.toString()) +
        '}';
  }
}
