package ai.docling.api.convert.request.target;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Represents a specific {@link Target} that delivers the converted document as a zipped resource.
 *
 * <p>{@code ZipTarget} is one of the concrete implementations of the abstract {@link Target} class.
 * It supports the zipped delivery method, denoted by the {@link Kind#ZIP} value.
 *
 * <p>This class overrides methods to specialize the behavior for the ZIP delivery kind:
 * <ul>
 *   <li>{@link #toString()}: Produces a string representation of the {@code ZipTarget} instance.</li>
 * </ul>
 *
 * <p>Instances of this class will only include non-empty JSON fields during serialization,
 * as governed by {@link JsonInclude.Include#NON_EMPTY}.
 *
 * <p>The {@link ZipTarget} instances are immutable and final.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@tools.jackson.databind.annotation.JsonDeserialize(builder = ZipTarget.Builder.class)
@lombok.extern.jackson.Jacksonized
@lombok.Builder(toBuilder = true)
@lombok.Getter
@lombok.ToString
public final class ZipTarget extends Target {

  @tools.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
  public static class Builder { }
}
