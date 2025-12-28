package ai.docling.serve.client;

import org.junit.jupiter.api.BeforeAll;

import ai.docling.serve.api.DoclingServeApi;

/**
 * Integration tests for {@link DoclingServeJackson2Client}.
 */
class DoclingServeJackson2ClientTests extends AbstractDoclingServeClientTests {
  private static DoclingServeApi doclingClient;
  private static DoclingServeApi authDoclingClient;
  private static DoclingServeApi wiremockDoclingClient;

  @BeforeAll
  static void setUp() {
    doclingClient = DoclingServeJackson2Client.builder()
        .logRequests()
        .logResponses()
        .prettyPrint()
        .baseUrl(doclingContainer.getApiUrl())
        .build();

    authDoclingClient = doclingClient.toBuilder().apiKey("key").build();
    wiremockDoclingClient = doclingClient.toBuilder().baseUrl("http://localhost:%d".formatted(wireMockExtension.getPort())).build();
  }

  @Override
  protected DoclingServeApi getDoclingClient(boolean requiresAuth, boolean useWiremock) {
    if (requiresAuth) {
      return authDoclingClient;
    }

    return useWiremock ? wiremockDoclingClient : doclingClient;
  }
}
