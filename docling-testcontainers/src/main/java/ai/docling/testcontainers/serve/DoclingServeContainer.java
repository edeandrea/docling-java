package ai.docling.testcontainers.serve;

import java.time.Duration;
import java.util.Optional;
import java.util.logging.Logger;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;

import ai.docling.testcontainers.serve.config.DoclingServeContainerConfig;

/**
 * A container wrapper class designed to work with the Docling service.
 * The class extends {@link GenericContainer} and provides functionality
 * specific to managing and configuring the Docling container. It allows
 * users to set environment variables, handle port mappings, and configure
 * health checks for the container.
 */
public class DoclingServeContainer extends GenericContainer<DoclingServeContainer> {
    private static final Logger LOG = Logger.getLogger(DoclingServeContainer.class.getName());

    /**
     * The dynamic host name determined from TestContainers
     */
    private DoclingServeContainerConfig config;

  /**
   * Constructs a new DoclingServeContainer instance with the specified configuration and optional timeout.
   * The container is set up with the necessary environment variables, exposed ports,
   * health check configuration, and an optional timeout for container startup.
   *
   * @param config the configuration details for the Docling container, including image name, environment variables, and other settings
   * @param timeout an optional duration specifying the maximum timeout for the container startup; a default timeout of 1 minute is used if not specified
   */
  public DoclingServeContainer(DoclingServeContainerConfig config, Optional<Duration> timeout) {
        super(DockerImageName.parse(config.imageName()).asCompatibleSubstituteFor(DoclingServeContainerConfig.DOCLING_SERVE_IMAGE));
        this.config = config;

        // Configure the container
        withExposedPorts(DoclingServeContainerConfig.DEFAULT_DOCLING_SERVE_PORT);
        withEnv(config.containerEnv());
        waitingFor(Wait.forHttp("/health"));

        if (config.enableUi()) {
            withEnv("DOCLING_SERVE_ENABLE_UI", "true");
        }

        timeout.ifPresentOrElse(super::withStartupTimeout, () -> withStartupTimeout(Duration.ofMinutes(1)));
    }

  /**
   * Returns the dynamically mapped host port corresponding to the default Docling container port.
   *
   * @return the dynamically mapped port on the host machine for the Docling container
   */
  public int getPort() {
        return getMappedPort(DoclingServeContainerConfig.DEFAULT_DOCLING_SERVE_PORT);
    }
}
