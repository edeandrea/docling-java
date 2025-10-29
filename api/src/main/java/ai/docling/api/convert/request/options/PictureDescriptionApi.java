package ai.docling.api.convert.request.options;

import static ai.docling.api.util.ValidationUtils.ensureNotNull;

import java.net.URI;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration options for picture description API integration.
 * This class encapsulates settings for making API calls to describe pictures,
 * including URL, headers, parameters, timeout, concurrency, and custom prompts.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PictureDescriptionApi {
  @JsonProperty("url")
  private URI url;

  @JsonProperty("headers")
  private Map<String, Object> headers = new HashMap<>();

  @JsonProperty("params")
  private Map<String, Object> params = new HashMap<>();

  @JsonProperty("timeout")
  private Duration timeout;

  @JsonProperty("concurrency")
  private Integer concurrency;

  @JsonProperty("prompt")
  private String prompt;

  /**
   * Gets the URL of the picture description API endpoint.
   *
   * @return the API endpoint URL, or null if not set
   */
  @Nullable
  public URI getUrl() {
    return url;
  }

  /**
   * Sets the URL of the picture description API endpoint.
   *
   * @param url the API endpoint URL to set
   */
  public void setUrl(URI url) {
    this.url = ensureNotNull(url, "url");
  }

  /**
   * Sets the URL of the picture description API endpoint and returns this instance.
   *
   * @param url the API endpoint URL to set
   * @return this instance for method chaining
   */
  public PictureDescriptionApi withUrl(URI url) {
    setUrl(url);
    return this;
  }

  /**
   * Gets the headers to be sent with the API request.
   *
   * @return the map of headers, or null if not set
   */
  @Nullable
  public Map<String, Object> getHeaders() {
    return Collections.unmodifiableMap(headers);
  }

  /**
   * Sets the headers to be sent with the API request.
   *
   * @param headers the map of headers to set
   */
  public void setHeaders(@Nullable Map<String, Object> headers) {
    this.headers.clear();

    if (headers != null) {
      this.headers.putAll(headers);
    }
  }

  /**
   * Sets the headers to be sent with the API request and returns this instance.
   *
   * @param headers the map of headers to set
   * @return this instance for method chaining
   */
  public PictureDescriptionApi withHeaders(@Nullable Map<String, Object> headers) {
    setHeaders(headers);
    return this;
  }

  /**
   * Gets the parameters to be sent with the API request.
   *
   * @return the map of parameters, or null if not set
   */
  @Nullable
  public Map<String, Object> getParams() {
    return Collections.unmodifiableMap(params);
  }

  /**
   * Sets the parameters to be sent with the API request.
   *
   * @param params the map of parameters to set
   */
  public void setParams(@Nullable Map<String, Object> params) {
    this.params.clear();

    if (params != null) {
      this.params.putAll(params);
    }
  }

  /**
   * Sets the parameters to be sent with the API request and returns this instance.
   *
   * @param params the map of parameters to set
   * @return this instance for method chaining
   */
  public PictureDescriptionApi withParams(@Nullable Map<String, Object> params) {
    setParams(params);
    return this;
  }

  /**
   * Gets the timeout duration for the API request.
   *
   * @return the timeout duration, or null if not set
   */
  @Nullable
  public Duration getTimeout() {
    return timeout;
  }

  /**
   * Sets the timeout duration for the API request.
   *
   * @param timeout the timeout duration to set
   */
  public void setTimeout(@Nullable Duration timeout) {
    this.timeout = timeout;
  }

  /**
   * Sets the timeout duration for the API request and returns this instance.
   *
   * @param timeout the timeout duration to set
   * @return this instance for method chaining
   */
  public PictureDescriptionApi withTimeout(@Nullable Duration timeout) {
    setTimeout(timeout);
    return this;
  }

  /**
   * Gets the maximum number of concurrent API requests allowed.
   *
   * @return the concurrency limit, or null if not set
   */
  @Nullable
  public Integer getConcurrency() {
    return concurrency;
  }

  /**
   * Sets the maximum number of concurrent API requests allowed.
   *
   * @param concurrency the concurrency limit to set
   */
  public void setConcurrency(@Nullable Integer concurrency) {
    this.concurrency = concurrency;
  }

  /**
   * Sets the maximum number of concurrent API requests allowed and returns this instance.
   *
   * @param concurrency the concurrency limit to set
   * @return this instance for method chaining
   */
  public PictureDescriptionApi withConcurrency(@Nullable Integer concurrency) {
    setConcurrency(concurrency);
    return this;
  }

  /**
   * Gets the custom prompt to be used for picture description.
   *
   * @return the custom prompt, or null if not set
   */
  @Nullable
  public String getPrompt() {
    return prompt;
  }

  /**
   * Sets the custom prompt to be used for picture description.
   *
   * @param prompt the custom prompt to set
   */
  public void setPrompt(@Nullable String prompt) {
    this.prompt = prompt;
  }

  /**
   * Sets the custom prompt to be used for picture description and returns this instance.
   *
   * @param prompt the custom prompt to set
   * @return this instance for method chaining
   */
  public PictureDescriptionApi withPrompt(@Nullable String prompt) {
    setPrompt(prompt);
    return this;
  }

  @Override
  public String toString() {
    return "PictureDescriptionApi{" +
        "url=" + (url == null ? "null" : url.toString()) +
        ", headers=" + (headers == null ? "null" : headers.toString()) +
        ", params=" + (params == null ? "null" : params.toString()) +
        ", timeout=" + (timeout == null ? "null" : timeout.toString()) +
        ", concurrency=" + (concurrency == null ? "null" : concurrency.toString()) +
        ", prompt=" + (prompt == null ? "null" : "'" + prompt + "'") +
        '}';
  }
}
