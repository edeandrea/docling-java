package ai.docling.testcontainers.serve;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import ai.docling.testcontainers.serve.config.DoclingServeContainerConfig;

import tools.jackson.databind.json.JsonMapper;

@Testcontainers
class DoclingServeContainerAvailableTests {
  private static final JsonMapper JSON_MAPPER = JsonMapper.builder().build();
  private record HealthResponse(String status) {}

  @Container
  private final DoclingServeContainer doclingContainer = new DoclingServeContainer(
    DoclingServeContainerConfig.builder()
        .image(DoclingServeContainerConfig.DOCLING_IMAGE)
        .enableUi(true)
        .build()
  );

  @Container
  private final DoclingServeContainer noUiDoclingContainer = new DoclingServeContainer(
    DoclingServeContainerConfig.builder()
        .image(DoclingServeContainerConfig.DOCLING_IMAGE)
        .enableUi(false)
        .build()
  );

  @Test
  void containerNoUI() throws IOException, InterruptedException {
    var healthRequest = HttpRequest.newBuilder(URI.create("%s/health".formatted(this.noUiDoclingContainer.getApiUrl())))
        .header("Accept", "application/json")
        .timeout(Duration.ofSeconds(10))
        .GET()
        .build();

    var response = HttpClient.newHttpClient()
        .send(healthRequest, jsonBodyHandler(HealthResponse.class))
        .body();

    assertThat(response)
        .isNotNull()
        .usingRecursiveComparison()
        .isEqualTo(new HealthResponse("ok"));

    assertThat(this.noUiDoclingContainer.getUiUrl())
        .isNotNull()
        .isEmpty();
  }

  @Test
  void containerAvailable() throws IOException, InterruptedException {
    var healthRequest = HttpRequest.newBuilder(URI.create("%s/health".formatted(this.doclingContainer.getApiUrl())))
        .header("Accept", "application/json")
        .timeout(Duration.ofSeconds(10))
        .GET()
        .build();

    var response = HttpClient.newHttpClient()
        .send(healthRequest, jsonBodyHandler(DoclingServeContainerAvailableTests.HealthResponse.class))
        .body();

    assertThat(response)
        .isNotNull()
        .usingRecursiveComparison()
        .isEqualTo(new HealthResponse("ok"));

    assertThat(this.doclingContainer.getUiUrl())
        .get()
        .isEqualTo("%s/ui".formatted(this.doclingContainer.getApiUrl()));
  }

  private static <T> HttpResponse.BodyHandler<T> jsonBodyHandler(Class<T> type) {
    return responseInfo -> HttpResponse.BodySubscribers.mapping(
        HttpResponse.BodySubscribers.ofByteArray(),
        bytes -> {
          try {
            return JSON_MAPPER.readValue(bytes, type);
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
    );
  }
}
