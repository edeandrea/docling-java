package ai.docling.api.health;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Simple health check response returned by the API.
 *
 * <p>Serialization uses {@link JsonInclude.Include#NON_EMPTY} so nulls and empty strings
 * are omitted from JSON.</p>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HealthCheckResponse {

  @JsonProperty("status")
  private String status;

  /**
   * Returns the health status string.
   * @return status or {@code null}
   */
  @Nullable
  public String getStatus() {
    return status;
  }

  /**
   * Sets the health status string.
   * @param status may be {@code null}
   */
  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  /**
   * Fluent setter for {@link #setStatus(String)}.
   * @param status may be {@code null}
   * @return this instance for chaining
   */
  public HealthCheckResponse withStatus(@Nullable String status) {
    setStatus(status);
    return this;
  }

  @Override
  public String toString() {
    return "HealthCheckResponse{" +
        "status=" + (status == null ? "null" : "'" + status + "'") +
        '}';
  }
}
