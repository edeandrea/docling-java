package ai.docling.api.convert.request.target;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an abstract target for defining where and how the converted document should be delivered.
 *
 * <p>The {@link Target} class is a sealed type that is extended by specific concrete implementations:
 * {@link InBodyTarget}, {@link PutTarget}, and {@link ZipTarget}. These implementations specify different
 * delivery methods, such as including the document in the response body, sending it to a specified URI, or
 * zipping it for inclusion in the response.
 *
 * @param <T> The specific subtype of {@link Target}, enabling type-safe chaining.
 */
public sealed abstract class Target<T extends Target> permits InBodyTarget, PutTarget, ZipTarget {
  enum Kind {
    @JsonProperty("inbody") INBODY,
    @JsonProperty("put") PUT,
    @JsonProperty("zip") ZIP
  }

  @JsonProperty("kind")
  private Kind kind = Kind.INBODY;

  /**
   * Retrieves the {@code Kind} associated with this {@link Target} instance.
   *
   * @return the {@link Kind} that represents the method of document delivery,
   *         or {@code null} if no kind is set.
   */
  @Nullable
  public Kind getKind() {
    return kind;
  }

  /**
   * Sets the {@link Kind} for this {@link Target}. The {@code Kind} specifies the delivery method for
   * the converted document, such as including it in the response body, sending it to a URI, or zipping it.
   *
   * @param kind the {@link Kind} representing the delivery method, or {@code null} to unset the kind.
   */
  public void setKind(@Nullable Kind kind) {
    this.kind = kind;
  }

  /**
   * Sets the {@link Kind} for this {@link Target} instance and returns the current instance for method chaining.
   *
   * @param kind the {@link Kind} representing the delivery method (e.g., {@code INBODY}, {@code PUT}, {@code ZIP}),
   *             or {@code null} to unset the kind.
   * @return the current instance of {@code T}, enabling method chaining.
   */
  public T withKind(@Nullable Kind kind) {
    setKind(kind);
    return (T) this;
  }
}
