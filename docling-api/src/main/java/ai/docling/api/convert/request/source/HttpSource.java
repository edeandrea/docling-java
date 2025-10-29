package ai.docling.api.convert.request.source;

import static ai.docling.api.util.ValidationUtils.ensureNotNull;

import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an HTTP-based data source.
 * This class is a concrete implementation of {@link Source} and provides
 * functionality for configuring an HTTP endpoint with optional headers.
 *
 * <p>JSON serialization/deserialization:
 * <ul>
 *   <li>{@code url} - Represents the URI of the HTTP source.</li>
 *   <li>{@code headers} - A map of custom HTTP headers for the request.</li>
 * </ul>
 *
 * <p>By default, JSON includes non-empty fields only.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public final class HttpSource extends Source<HttpSource> {
  @JsonProperty("url")
  private URI url;

  @JsonProperty("headers")
  private Map<String, Object> headers = new HashMap<>();

  public HttpSource() {
    super();
    setKind(Kind.HTTP);
  }

  /**
   * Retrieves the URL associated with this HTTP source.
   *
   * @return the {@link URI} representing the URL of the HTTP source, or {@code null} if not set.
   */
  @Nullable
  public URI getUrl() {
    return url;
  }

  /**
   * Sets the {@code url} for this HTTP source. The URL represents the endpoint
   * to be used by this HTTP-based source.
   *
   * @param url the {@link URI} of the HTTP source; may be {@code null}.
   *            A {@code null} value indicates that the URL is unset.
   */
  public void setUrl(URI url) {
    this.url = ensureNotNull(url, "url");
  }

  /**
   * Sets the {@code url} for this {@code HttpSource} and returns the updated instance.
   * This method allows chaining while configuring the {@link HttpSource}.
   *
   * @param url the {@link URI} representing the HTTP source's endpoint; may be {@code null},
   *            indicating that the URL is unset.
   * @return the updated {@code HttpSource} instance with the specified {@code url}.
   */
  public HttpSource withUrl(URI url) {
    setUrl(url);
    return this;
  }

  /**
   * Retrieves an unmodifiable view of the HTTP headers associated with the {@link HttpSource}.
   * The returned map contains key-value pairs representing the custom headers configured
   * for this HTTP source.
   *
   * @return an unmodifiable {@link Map} containing the HTTP headers, where the keys are
   *         {@link String} objects representing header names, and the values are
   *         {@link Object} objects representing header values. Never {@code null}.
   */
  public Map<String, Object> getHeaders() {
    return Collections.unmodifiableMap(headers);
  }

  /**
   * Configures the HTTP headers for this {@link HttpSource}.
   * If a non-{@code null} map is provided, it replaces the existing headers with the new ones.
   * If {@code null} is supplied, all headers are cleared.
   *
   * @param headers a {@link Map} where keys are {@link String} objects representing header names,
   *                and values are {@link Object} instances representing header values; may be {@code null}.
   */
  public void setHeaders(@Nullable Map<String, Object> headers) {
    this.headers.clear();

    if (headers != null) {
      this.headers.putAll(headers);
    }
  }

  /**
   * Updates the {@link HttpSource} with the specified HTTP headers and returns the updated instance.
   * This method replaces the existing headers with the ones provided in the supplied map.
   *
   * @param headers a {@link Map} where keys are {@link String} objects representing header names,
   *                and values are {@link Object} instances representing header values;
   *                may be {@code null} to clear all headers.
   * @return the updated {@link HttpSource} instance with the provided headers configuration.
   */
  public HttpSource withHeaders(@Nullable Map<String, Object> headers) {
    setHeaders(headers);
    return this;
  }

  @Override
  public String toString() {
    return "HttpSource{" +
        "kind='" + getKind() + "'" +
        ", url=" + (url == null ? "null" : url.toString()) +
        ", headers=" + (headers == null ? "null" : headers.toString()) +
        '}';
  }

  @Override
  public void setKind(@Nullable Kind kind) {
    super.setKind(Kind.HTTP);
  }
}
