package ai.docling.api.convert.request.source;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Source of the document.
 */
public sealed abstract class Source<S extends Source<S>> permits FileSource, HttpSource {
  /**
   * Enum representing the type of {@link Source}.
   * <ul>
   *   <li>{@code HTTP} - Represents an HTTP-based source (identified by {@code "http"}).</li>
   *   <li>{@code FILE} - Represents a file-based source (identified by {@code "file"}).</li>
   * </ul>
   * The enum values are serialized and deserialized using their respective JSON property
   * values as defined by the {@link JsonProperty} annotation.
   */
  enum Kind {
    @JsonProperty("http") HTTP,
    @JsonProperty("file") FILE
  }

  @JsonProperty("kind")
  private Kind kind = Kind.FILE;

  /**
   * Retrieves the {@link Kind} of this {@link Source}.
   *
   * @return the {@link Kind} of this {@code Source}, or {@code null} if not set.
   */
  @Nullable
  public Kind getKind() {
    return kind;
  }

  /**
   * Sets the {@link Kind} of this {@code Source}.
   *
   * @param kind the {@link Kind} representing the type of this source; may be {@code null}.
   */
  public void setKind(@Nullable Kind kind) {
    this.kind = kind;
  }

  /**
   * Sets the {@link Kind} of this {@link Source} and returns the updated instance of {@link Source}.
   *
   * @param kind the {@link Kind} representing the type of this source; may be {@code null}.
   * @return the updated {@code Source} instance with the newly set {@link Kind}.
   */
  public S withKind(@Nullable Kind kind) {
    setKind(kind);
    return (S) this;
  }
}
