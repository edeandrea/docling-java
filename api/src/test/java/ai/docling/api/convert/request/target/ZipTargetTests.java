package ai.docling.api.convert.request.target;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for {@link ZipTarget}.
 */
class ZipTargetTests {

  @Test
  void whenValidParametersThenCreateZipTarget() {
    ZipTarget zipTarget = new ZipTarget();

    assertThat(zipTarget.getKind()).isEqualTo(Target.Kind.ZIP);
  }

  @Test
  void kindIsAlwaysSetToZip() {
    ZipTarget zipTarget = new ZipTarget().withKind(Target.Kind.PUT);

    assertThat(zipTarget.getKind()).isEqualTo(Target.Kind.ZIP);
  }

}
