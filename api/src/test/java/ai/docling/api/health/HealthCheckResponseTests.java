package ai.docling.api.health;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for {@link HealthCheckResponse}.
 */
class HealthCheckResponseTests {

  @Test
  void whenValidParametersThenCreateHealthCheckResponse() {
    String status = "healthy";

    HealthCheckResponse response = new HealthCheckResponse().withStatus(status);

    assertThat(response.getStatus()).isEqualTo(status);
  }

  @Test
  void whenStatusIsNullThenCreateHealthCheckResponse() {
    HealthCheckResponse response = new HealthCheckResponse().withStatus(null);

    assertThat(response.getStatus()).isNull();
  }

  @Test
  void whenEmptyStatusThenCreateHealthCheckResponse() {
    String status = "";

    HealthCheckResponse response = new HealthCheckResponse().withStatus(status);

    assertThat(response.getStatus()).isEqualTo(status);
  }

}
