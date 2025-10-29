package ai.docling.api.convert.request.target;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import ai.docling.api.convert.request.target.Target.Kind;

/**
 * Unit tests for {@link InBodyTarget}.
 */
class InBodyTargetTests {

  @Test
  void whenValidParametersThenCreateInBodyTarget() {
    InBodyTarget inBodyTarget = new InBodyTarget();

    assertThat(inBodyTarget.getKind()).isEqualTo(Kind.INBODY);
  }

  @Test
  void kindIsAlwaysSetToInBody() {
    InBodyTarget inBodyTarget = new InBodyTarget().withKind(Kind.PUT);

    assertThat(inBodyTarget.getKind()).isEqualTo(Kind.INBODY);
  }

}
