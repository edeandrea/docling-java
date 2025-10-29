package ai.docling.api.convert.request.target;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Represents a specific {@link Target} that delivers the converted document as a zipped resource.
 *
 * <p>{@code ZipTarget} is one of the concrete implementations of the abstract {@link Target} class.
 * It supports the zipped delivery method, denoted by the {@link Kind#ZIP} value.
 *
 * <p>This class overrides methods to specialize the behavior for the ZIP delivery kind:
 * <ul>
 *   <li>{@link #withKind(Kind)}: Returns a {@code ZipTarget} instance with the specified delivery kind.</li>
 *   <li>{@link #toString()}: Produces a string representation of the {@code ZipTarget} instance.</li>
 * </ul>
 *
 * <p>Instances of this class will only include non-empty JSON fields during serialization,
 * as governed by {@link JsonInclude.Include#NON_EMPTY}.
 *
 * <p>The {@link ZipTarget} instances are immutable and final.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public final class ZipTarget extends Target<ZipTarget> {
  public ZipTarget() {
    super();
    setKind(Kind.ZIP);
  }

  @Override
  public String toString() {
    return "ZipTarget{" +
        "kind='" + getKind() + "'" +
        '}';
  }

  @Override
  public void setKind(@Nullable Kind kind) {
    super.setKind(Kind.ZIP);
  }
}
