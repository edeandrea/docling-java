package ai.docling.api.convert.request.target;

import static ai.docling.api.util.ValidationUtils.ensureNotNull;

import java.net.URI;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A concrete {@link Target} implementation for delivering a converted document to a specified URI via an HTTP PUT operation.
 *
 * <p>The {@link PutTarget} class represents a delivery method where the document is sent to the given {@code URL}.
 * Supported serialized fields include:
 * <ul>
 *   <li>{@code kind} - inherited from the {@link Target} base class and always set to {@code PUT} for this implementation.</li>
 *   <li>{@code url} - the URI to which the document should be delivered.</li>
 * </ul>
 *
 * <p>This class provides JSON serialization annotations to include only non-empty fields in the serialization output.
 * The {@code url} is nullable, allowing the absence of a URI to be explicitly represented.
 *
 * <p>The {@link #withUrl(URI)} method enables method chaining for setting the {@code url}.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public final class PutTarget extends Target<PutTarget> {
  @JsonProperty("url")
  private URI url;

  public PutTarget() {
    super();
    setKind(Kind.PUT);
  }

  /**
   * Retrieves the {@code URI} to which the converted document should be delivered.
   *
   * <p>The {@code url} represents the target location for sending the document using an HTTP PUT
   * operation. It may be {@code null} if no URI has been specified.
   *
   * @return the {@link URI} representing the document's delivery destination, or {@code null}
   *         if no target URI is set.
   */
  @Nullable
  public URI getUrl() {
    return url;
  }

  /**
   * Sets the {@code URI} to which the converted document should be delivered.
   *
   * <p>The {@code url} specifies the target location for sending the document using an HTTP PUT operation.
   *
   * @param url the {@link URI} representing the delivery location, or {@code null} to explicitly unset the target URI.
   */
  public void setUrl(URI url) {
    this.url = ensureNotNull(url, "url");
  }

  /**
   * Sets the {@code URL} to which the converted document should be delivered and returns the current
   * {@link PutTarget} instance for method chaining.
   *
   * <p>This method allows convenient chaining by setting the {@code url} and returning the same instance.
   *
   * @param url the {@link URI} representing the delivery location, or {@code null} to explicitly unset the target URI.
   * @return the current {@link PutTarget} instance with the updated {@code url}.
   */
  public PutTarget withUrl(URI url) {
    setUrl(url);
    return this;
  }

  @Override
  public String toString() {
    return "PutTarget{" +
        "kind='" + getKind() + "'" +
        ", url=" + (url == null ? "null" : url.toString()) +
        '}';
  }

  @Override
  public void setKind(@Nullable Kind kind) {
    super.setKind(Kind.PUT);
  }
}
