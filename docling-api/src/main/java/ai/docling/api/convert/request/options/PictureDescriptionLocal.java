package ai.docling.api.convert.request.options;

import static ai.docling.api.util.ValidationUtils.ensureNotEmpty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration for local picture description generation.
 * This class contains settings for generating descriptions of pictures using a local model.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PictureDescriptionLocal {
  @JsonProperty("repo_id")
  private String repoId;

  @JsonProperty("prompt")
  private String prompt;

  @JsonProperty("generation_config")
  private Map<String, Object> generationConfig = new HashMap<>();

  /**
   * Gets the repository identifier for the local model.
   *
   * @return the repository ID, or null if not set
   */
  @Nullable
  public String getRepoId() {
    return repoId;
  }

  /**
   * Sets the repository identifier for the local model.
   *
   * @param repoId the repository ID to set, or null to clear
   */
  public void setRepoId(String repoId) {
    this.repoId = ensureNotEmpty(repoId, "repoId");
  }

  /**
   * Sets the repository identifier for the local model (fluent API).
   *
   * @param repoId the repository ID to set, or null to clear
   * @return this instance for method chaining
   */
  public PictureDescriptionLocal withRepoId(String repoId) {
    setRepoId(repoId);
    return this;
  }

  /**
   * Gets the prompt used for picture description generation.
   *
   * @return the prompt, or null if not set
   */
  @Nullable
  public String getPrompt() {
    return prompt;
  }

  /**
   * Sets the prompt used for picture description generation.
   *
   * @param prompt the prompt to set, or null to clear
   */
  public void setPrompt(@Nullable String prompt) {
    this.prompt = prompt;
  }

  /**
   * Sets the prompt used for picture description generation (fluent API).
   *
   * @param prompt the prompt to set, or null to clear
   * @return this instance for method chaining
   */
  public PictureDescriptionLocal withPrompt(@Nullable String prompt) {
    setPrompt(prompt);
    return this;
  }

  /**
   * Gets an unmodifiable view of the generation configuration parameters.
   *
   * @return an unmodifiable map of generation configuration parameters
   */
  @Nullable
  public Map<String, Object> getGenerationConfig() {
    return Collections.unmodifiableMap(generationConfig);
  }

  /**
   * Sets the generation configuration parameters.
   * The provided map is copied to avoid external modifications.
   *
   * @param generationConfig the generation configuration parameters to set, or null to clear
   */
  public void setGenerationConfig(@Nullable Map<String, Object> generationConfig) {
    this.generationConfig.clear();
    
    if (generationConfig != null) {
      this.generationConfig.putAll(generationConfig);
    }
  }

  /**
   * Sets the generation configuration parameters (fluent API).
   * The provided map is copied to avoid external modifications.
   *
   * @param generationConfig the generation configuration parameters to set, or null to clear
   * @return this instance for method chaining
   */
  public PictureDescriptionLocal withGenerationConfig(@Nullable Map<String, Object> generationConfig) {
    setGenerationConfig(generationConfig);
    return this;
  }

  @Override
  public String toString() {
    return "PictureDescriptionLocal{" +
        "repoId=" + (repoId == null ? "null" : "'" + repoId + "'") +
        ", prompt=" + (prompt == null ? "null" : "'" + prompt + "'") +
        ", generationConfig=" + (generationConfig == null ? "null" : generationConfig.toString()) +
        '}';
  }
}
