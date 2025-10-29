package ai.docling.api.convert.request.target;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Target for including the converted document in the response body.
 *
 * <p>This is a concrete implementation of {@link Target}, where the {@code Kind} is set to
 * {@code INBODY}. The converted document will be delivered directly in the response body.
 *
 * <p>Uses JSON serialization annotations to include only non-empty fields in the output.
 *
 * <p>This class overrides {@link Object#toString()} for a string representation of the instance.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public final class InBodyTarget extends Target<InBodyTarget> {
  public InBodyTarget() {
    super();
    setKind(Kind.INBODY);
  }

  @Override
  public String toString() {
    return "InBodyTarget{" +
        "kind='" + getKind() + "'" +
        '}';
  }

  @Override
  public void setKind(@Nullable Kind kind) {
    super.setKind(Kind.INBODY);
  }
}
