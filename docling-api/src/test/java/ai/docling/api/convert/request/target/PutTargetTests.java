package ai.docling.api.convert.request.target;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.net.URI;

import org.junit.jupiter.api.Test;

import ai.docling.api.convert.request.target.Target.Kind;

/**
 * Unit tests for {@link PutTarget}.
 */
class PutTargetTests {

  @Test
  void whenUriIsNullThenThrow() {
    assertThatThrownBy(() -> new PutTarget().withUrl(null))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("url cannot be null");
  }

  @Test
  void whenValidParametersThenCreatePutTarget() {
    URI uri = URI.create("https://example.com/upload");

    PutTarget putTarget = new PutTarget().withUrl(uri);

    assertThat(putTarget.getKind()).isEqualTo(Target.Kind.PUT);
    assertThat(putTarget.getUrl()).isEqualTo(uri);
  }

  @Test
  void kindIsAlwaysSetToPut() {
    URI uri = URI.create("https://example.com/upload");

    PutTarget putTarget = new PutTarget().withKind(Kind.INBODY).withUrl(uri);

    assertThat(putTarget.getKind()).isEqualTo(Kind.PUT);
  }

}
