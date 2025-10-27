package ai.docling.testcontainers.config;

import java.util.Map;

/**
 * A configuration interface for defining properties and settings related
 * to the Docling container. This interface provides methods for retrieving
 * configuration options, such as enabling or disabling DevServices, specifying
 * the container image name, toggling the UI, and setting environment variables
 * for the container.
 */
public interface DoclingContainerConfig {
  /**
   * Default image name
   */
  String DOCLING_IMAGE = "ghcr.io/docling-project/docling-serve:v1.6.0";

  /**
   * The default container port that docling runs on
   */
  int DEFAULT_DOCLING_PORT = 5001;

  /**
   * The container image name to use.
   */
  String imageName();

  /**
   * Whether or not to enable the docling UI
   * <p>
   * See https://github.com/docling-project/docling-serve?tab=readme-ov-file#demonstration-ui
   * </p>
   */
  boolean enableUi();

  /**
   * Environment variables that are passed to the container
   */
  Map<String, String> containerEnv();

  /**
   * Creates a new instance of {@link Builder} initialized with the current configuration values.
   *
   * @return a new {@link Builder} instance with the properties of the current configuration.
   */
  default Builder toBuilder() {
    return new Builder(this);
  }

  /**
   * Creates and returns a new instance of the {@link Builder} class.
   *
   * @return a new {@link Builder} instance for configuring and building a {@link DoclingContainerConfig}.
   */
  static Builder builder() {
    return new Builder();
  }

  /**
   * A builder class for constructing instances of {@link DoclingContainerConfig}.
   * This class provides methods for setting various configurations and properties
   * needed to create a {@link DoclingContainerConfig} instance.
   */
  class Builder {
    /**
     * The name of the container image to be used in the configuration.
     * This variable holds the identifier or tag of the container image
     * that will be utilized when creating or configuring container instances.
     * It is a required field and must be set to a non-null, non-empty value.
     */
    protected String imageName;

    /**
     * A flag indicating whether the Docling UI should be enabled or disabled.
     * When set to {@code true}, the UI will be enabled; otherwise, it will remain disabled.
     * This field is used during the configuration process within the builder to control
     * the activation state of the UI feature in the container.
     */
    protected boolean enableUi;

    /**
     * A map representing the environment variables to be passed to the container.
     * The keys in the map represent the names of the environment variables,
     * and the corresponding values represent their assigned values.
     *
     * This field is used to configure additional environment-specific settings
     * during the container's initialization and execution.
     *
     * Modifications to this map may be reflected in the container's runtime environment,
     * affecting its behavior as defined by the provided environment variables.
     */
    protected Map<String, String> containerEnv;

    /**
     * Initializes a new instance of the {@link Builder} class.
     * This constructor is protected to restrict direct instantiation outside the package
     * and is primarily used for creating builder instances within the {@link DoclingContainerConfig} implementation.
     */
    protected Builder() {
    }

    /**
     * Constructs a {@link Builder} instance initialized with the settings from the given {@link DoclingContainerConfig}.
     * This constructor populates the builder fields using the corresponding values from the provided configuration.
     *
     * @param config the {@link DoclingContainerConfig} instance whose properties will be used to initialize the builder
     */
    protected Builder(DoclingContainerConfig config) {
      this.imageName = config.imageName();
      this.enableUi = config.enableUi();
      this.containerEnv = config.containerEnv();
    }

    /**
     * Sets the name of the container image to use for the configuration.
     * This value is required and must not be null or empty.
     *
     * @param imageName the name of the container image
     * @return the builder instance for method chaining
     * @throws IllegalArgumentException if the provided imageName is null or empty
     */
    public Builder imageName(String imageName) {
      this.imageName = imageName;
      return this;
    }

    /**
     * Configures whether the Docling UI is enabled or disabled.
     *
     * @param enableUi a boolean indicating whether to enable the Docling UI
     * @return the builder instance for method chaining
     */
    public Builder enableUi(boolean enableUi) {
      this.enableUi = enableUi;
      return this;
    }

    /**
     * Sets the environment variables to be passed to the container.
     *
     * @param containerEnv a map containing the environment variable names and their corresponding values
     * @return the builder instance for method chaining
     */
    public Builder containerEnv(Map<String, String> containerEnv) {
      this.containerEnv = containerEnv;
      return this;
    }

    /**
     * Adds an environment variable to the container's configuration.
     * This method allows setting a single key-value pair representing
     * an environment variable and its value to be passed to the container.
     *
     * @param key the name of the environment variable
     * @param value the value of the environment variable
     * @return the builder instance for method chaining
     * @throws NullPointerException if the key or value is null
     */
    public Builder containerEnv(String key, String value) {
      this.containerEnv.put(key, value);
      return this;
    }

    /**
     * Builds and returns a new instance of {@link DoclingContainerConfig} based on the current builder state.
     *
     * @return a newly constructed {@link DoclingContainerConfig} instance containing the configuration
     *         properties and values set within this builder.
     */
    public DoclingContainerConfig build() {
      return new DefaultDoclingContainerConfig(this);
    }
  }
}
