package ai.docling.api.convert.request.target;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for {@link InBodyTarget}.
 */
class InBodyTargetTests {

  @Test
  void whenValidParametersThenCreateInBodyTarget() {
    InBodyTarget inBodyTarget = InBodyTarget.create();

    assertThat(inBodyTarget.kind()).isEqualTo(Target.Kind.INBODY);
  }

  @Test
  void kindIsAlwaysSetToInBody() {
    InBodyTarget inBodyTarget = new InBodyTarget(Target.Kind.PUT);

    assertThat(inBodyTarget.kind()).isEqualTo(Target.Kind.INBODY);
  }

}
