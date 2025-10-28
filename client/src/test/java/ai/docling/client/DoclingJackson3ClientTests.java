package ai.docling.client;

import org.junit.jupiter.api.BeforeAll;

import ai.docling.api.DoclingApi;
import ai.docling.testcontainers.config.DoclingContainerConfig;

/**
 * Integration tests for {@link DoclingClient}.
 */
class DoclingJackson3ClientTests extends AbstractDoclingClientTests {
  private static DoclingApi doclingClient;

  @BeforeAll
  static void setUp() {
    doclingClient = DoclingJackson3Client.builder()
        .baseUrl("http://localhost:%s".formatted(doclingContainer.getMappedPort(DoclingContainerConfig.DEFAULT_DOCLING_PORT)))
        .build();
  }

  @Override
  protected DoclingApi getDoclingClient() {
    return doclingClient;
  }
}
