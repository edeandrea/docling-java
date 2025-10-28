package ai.docling.client;

import static ai.docling.api.util.ValidationUtils.ensureNotNull;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;

/**
 * A specialized implementation of {@link DoclingClient} that integrates with the Jackson
 * library for JSON serialization and deserialization using {@link com.fasterxml.jackson.databind.json.JsonMapper}.
 * <p>
 * This client provides methods to convert objects to JSON strings and parse JSON strings
 * into Java objects, leveraging the capabilities of Jackson's {@link com.fasterxml.jackson.databind.json.JsonMapper}.
 *
 * <p>Instances of this client can be created through the {@link Builder} by configuring
 * properties such as the {@link com.fasterxml.jackson.databind.json.JsonMapper.Builder}.
 */
public class DoclingJackson2Client extends DoclingClient {
  private final JsonMapper jsonMapper;

  private DoclingJackson2Client(Builder builder) {
    super(builder);;
    this.jsonMapper = ensureNotNull(builder.jsonMapperBuilder, "jsonMapperBuilder").build();
  }

  @Override
  public Builder toBuilder() {
    return new Builder(this);
  }

  /**
   * Creates and returns a new {@link Builder} instance for configuring and constructing
   * a {@link DoclingJackson2Client}.
   *
   * <p>The returned {@link Builder} can be used to customize the client by setting
   * various properties, such as the JSON mapper builder, before creating a new
   * {@link DoclingJackson2Client}.
   *
   * @return a new {@link Builder} instance for configuring and building a {@link DoclingJackson2Client}
   */
  static Builder builder() {
    return new Builder();
  }

  @Override
  protected <T> T readValue(String json, Class<T> valueType) {
    try {
      return this.jsonMapper.readValue(json, valueType);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  protected <T> String writeValueAsString(T value) {
    try {
      return this.jsonMapper.writeValueAsString(value);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * A builder class for constructing instances of {@link DoclingJackson2Client}.
   *
   * <p>This builder extends {@link DoclingClientBuilder} to provide additional configuration
   * specific to {@link DoclingJackson2Client}, such as customizing the JSON mapper.
   * Use this builder to configure and create a new, immutable {@link DoclingJackson2Client} instance.
   *
   * <p>The builder supports method chaining for fluent configuration.
   */
  public static final class Builder extends DoclingClientBuilder<DoclingJackson2Client, Builder> {
    private JsonMapper.Builder jsonMapperBuilder = JsonMapper.builder();

    private Builder() {
    }

    private Builder(DoclingJackson2Client doclingClient) {
      super(doclingClient);
      this.jsonMapperBuilder = doclingClient.jsonMapper.rebuild();
    }

    /**
     * Sets the JSON mapper builder to be used for creating the JSON mapper.
     *
     * <p>This allows customization of JSON serialization and deserialization behavior,
     * such as configuring features, modules, or property naming strategies.
     *
     * @param jsonMapperBuilder the {@link JsonMapper.Builder} to use
     * @return this {@link Builder} instance for method chaining
     */
    public Builder jsonParser(JsonMapper.Builder jsonMapperBuilder) {
      this.jsonMapperBuilder = jsonMapperBuilder;
      return this;
    }

    /**
     * Builds and returns a new {@link DoclingJackson2Client} instance with the configured properties.
     *
     * <p>This method validates all required parameters and constructs the client.
     *
     * @return a new {@link DoclingJackson2Client} instance
     * @throws IllegalArgumentException if any required parameter is null
     */
    @Override
    public DoclingJackson2Client build() {
      return new DoclingJackson2Client(this);
    }
  }
}
