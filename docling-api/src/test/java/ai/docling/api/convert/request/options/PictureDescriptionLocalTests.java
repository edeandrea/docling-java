package ai.docling.api.convert.request.options;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit tests for {@link PictureDescriptionLocal}.
 */
class PictureDescriptionLocalTests {

  @Test
  void createLocalWithAllFields() {
    String repoId = "microsoft/Florence-2-large";
    String prompt = "Describe this image in detail";
    Map<String, Object> generationConfig = Map.of("max_length", 100, "temperature", 0.7);

    PictureDescriptionLocal local = new PictureDescriptionLocal()
        .withRepoId(repoId)
        .withPrompt(prompt)
        .withGenerationConfig(generationConfig);

    assertThat(local.getRepoId()).isEqualTo(repoId);
    assertThat(local.getPrompt()).isEqualTo(prompt);
    assertThat(local.getGenerationConfig()).isEqualTo(generationConfig);
  }

  @Test
  void createLocalWithOnlyRequiredFields() {
    String repoId = "microsoft/Florence-2-large";

    PictureDescriptionLocal local = new PictureDescriptionLocal()
        .withRepoId(repoId);

    assertThat(local.getRepoId()).isEqualTo(repoId);
    assertThat(local.getPrompt()).isNull();
    assertThat(local.getGenerationConfig()).isNotNull().isEmpty();
  }

  @ParameterizedTest
  @NullAndEmptySource
  @ValueSource(strings = "   ")
  void createLocalWithNullRepoIdThrowsException(String repoId) {
    assertThatThrownBy(() -> new PictureDescriptionLocal().withRepoId(null))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("repoId cannot be null or empty");
  }

  @Test
  void pictureDescriptionLocalIsImmutable() {
    String repoId = "microsoft/Florence-2-large";
    Map<String, Object> generationConfig = new HashMap<>(Map.of("max_length", 100));

    PictureDescriptionLocal local = new PictureDescriptionLocal()
        .withRepoId(repoId)
        .withPrompt("Original prompt")
        .withGenerationConfig(generationConfig);

    assertThat(local.getGenerationConfig()).isEqualTo(generationConfig);

    generationConfig.put("temperature", 0.8);

    assertThat(local.getGenerationConfig()).hasSize(1);
    assertThat(local.getGenerationConfig().get("max_length")).isEqualTo(100);
    assertThat(local.getGenerationConfig()).doesNotContainKey("temperature");
  }

}
