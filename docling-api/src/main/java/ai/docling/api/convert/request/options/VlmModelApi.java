package ai.docling.api.convert.request.options;

import java.net.URI;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API details for using a vision-language model for the VLM pipeline.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VlmModelApi {
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

    @JsonProperty("scale")
    private Integer scale;

    @JsonProperty("response_format")
    private ResponseFormat responseFormat;

    /**
     * Gets the endpoint which accepts OpenAI API compatible requests.
     *
     * @return the API endpoint URL
     */
    @Nullable
    public URI getUrl() {
        return url;
    }

    /**
     * Sets the endpoint which accepts OpenAI API compatible requests.
     *
     * @param url the API endpoint URL
     */
    public void setUrl(@Nullable URI url) {
        this.url = url;
    }

    /**
     * Sets the endpoint which accepts OpenAI API compatible requests.
     *
     * @param url the API endpoint URL
     * @return this instance for method chaining
     */
    public VlmModelApi withUrl(@Nullable URI url) {
        setUrl(url);
        return this;
    }

    /**
     * Gets the headers used for calling the API endpoint.
     * For example, it could include authentication headers.
     *
     * @return the headers map
     */
    public Map<String, Object> getHeaders() {
        return Collections.unmodifiableMap(headers);
    }

    /**
     * Sets the headers used for calling the API endpoint.
     * For example, it could include authentication headers.
     *
     * @param headers the headers map
     */
    public void setHeaders(@Nullable Map<String, Object> headers) {
      this.headers.clear();
      
      if (headers != null) {
        this.headers.putAll(headers);
      }
    }

    /**
     * Sets the headers used for calling the API endpoint.
     * For example, it could include authentication headers.
     *
     * @param headers the headers map
     * @return this instance for method chaining
     */
    public VlmModelApi withHeaders(@Nullable Map<String, Object> headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * Gets the model parameters.
     *
     * @return the model parameters
     */
    public Map<String, Object> getParams() {
        return Collections.unmodifiableMap(params);
    }

    /**
     * Sets the model parameters.
     *
     * @param params the model parameters
     */
    public void setParams(@Nullable Map<String, Object> params) {
      this.params.clear();
      
      if (params != null) {
        this.params.putAll(params);
      }
    }

    /**
     * Sets the model parameters.
     *
     * @param params the model parameters
     * @return this instance for method chaining
     */
    public VlmModelApi withParams(@Nullable Map<String, Object> params) {
        setParams(params);
        return this;
    }

    /**
     * Gets the timeout for the API request.
     *
     * @return the timeout duration
     */
    @Nullable
    public Duration getTimeout() {
        return timeout;
    }

    /**
     * Sets the timeout for the API request.
     *
     * @param timeout the timeout duration
     */
    public void setTimeout(@Nullable Duration timeout) {
        this.timeout = timeout;
    }

    /**
     * Sets the timeout for the API request.
     *
     * @param timeout the timeout duration
     * @return this instance for method chaining
     */
    public VlmModelApi withTimeout(@Nullable Duration timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * Gets the maximum number of concurrent requests to the API.
     *
     * @return the concurrency limit
     */
    @Nullable
    public Integer getConcurrency() {
        return concurrency;
    }

    /**
     * Sets the maximum number of concurrent requests to the API.
     *
     * @param concurrency the concurrency limit
     */
    public void setConcurrency(@Nullable Integer concurrency) {
        this.concurrency = concurrency;
    }

    /**
     * Sets the maximum number of concurrent requests to the API.
     *
     * @param concurrency the concurrency limit
     * @return this instance for method chaining
     */
    public VlmModelApi withConcurrency(@Nullable Integer concurrency) {
        setConcurrency(concurrency);
        return this;
    }

    /**
     * Gets the prompt used when calling the vision-language model.
     *
     * @return the prompt
     */
    @Nullable
    public String getPrompt() {
        return prompt;
    }

    /**
     * Sets the prompt used when calling the vision-language model.
     *
     * @param prompt the prompt
     */
    public void setPrompt(@Nullable String prompt) {
        this.prompt = prompt;
    }

    /**
     * Sets the prompt used when calling the vision-language model.
     *
     * @param prompt the prompt
     * @return this instance for method chaining
     */
    public VlmModelApi withPrompt(@Nullable String prompt) {
        setPrompt(prompt);
        return this;
    }

    /**
     * Gets the scale factor of the images used.
     *
     * @return the scale factor
     */
    @Nullable
    public Integer getScale() {
        return scale;
    }

    /**
     * Sets the scale factor of the images used.
     *
     * @param scale the scale factor
     */
    public void setScale(@Nullable Integer scale) {
        this.scale = scale;
    }

    /**
     * Sets the scale factor of the images used.
     *
     * @param scale the scale factor
     * @return this instance for method chaining
     */
    public VlmModelApi withScale(@Nullable Integer scale) {
        setScale(scale);
        return this;
    }

    /**
     * Gets the type of response generated by the model.
     *
     * @return the response format
     */
    @Nullable
    public ResponseFormat getResponseFormat() {
        return responseFormat;
    }

    /**
     * Sets the type of response generated by the model.
     *
     * @param responseFormat the response format
     */
    public void setResponseFormat(@Nullable ResponseFormat responseFormat) {
        this.responseFormat = responseFormat;
    }

    /**
     * Sets the type of response generated by the model.
     *
     * @param responseFormat the response format
     * @return this instance for method chaining
     */
    public VlmModelApi withResponseFormat(@Nullable ResponseFormat responseFormat) {
        setResponseFormat(responseFormat);
        return this;
    }

    @Override
    public String toString() {
        return "VlmModelApi{" +
                "url=" + url +
                ", headers=" + headers +
                ", params=" + params +
                ", timeout=" + timeout +
                ", concurrency=" + concurrency +
                ", prompt='" + prompt + '\'' +
                ", scale=" + scale +
                ", responseFormat=" + responseFormat +
                '}';
    }
}
