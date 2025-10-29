package ai.docling.api.convert.request.source;

import static ai.docling.api.util.ValidationUtils.ensureNotBlank;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a file-based data source.
 * This class provides functionality to handle Base64-encoded file content and filenames
 * for file sources. Inherits from {@link Source}.
 *
 * <p>JSON serialization/deserialization:
 * <ul>
 *   <li>{@code base64_string} - Represents the Base64-encoded content of the file.</li>
 *   <li>{@code filename} - Represents the name of the uploaded file.</li>
 * </ul>
 *
 * <p>By default, JSON includes non-empty fields only.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public final class FileSource extends Source<FileSource> {
  @JsonProperty("base64_string")
  private String base64String;

  @JsonProperty("filename")
  private String filename;

  public FileSource() {
    super();
    setKind(Kind.FILE);
  }

  /**
   * Base64 content of the file.
   * @return base64 content or {@code null}
   */
  @Nullable
  public String getBase64String() {
    return base64String;
  }

  /**
   * Sets the base64 content of the file.
   * @param base64String may be {@code null}
   */
  public void setBase64String(String base64String) {
    this.base64String = ensureNotBlank(base64String, "base64String");
  }

  public FileSource withBase64String(String base64String) {
    setBase64String(base64String);
    return this;
  }

  /**
   * Filename of the uploaded document.
   * @return filename or {@code null}
   */
  @Nullable
  public String getFilename() {
    return filename;
  }

  /**
   * Sets the filename of the uploaded document.
   * @param filename may be {@code null}
   */
  public void setFilename(String filename) {
    this.filename = ensureNotBlank(filename, "filename");
  }

  public FileSource withFilename(String filename) {
    setFilename(filename);
    return this;
  }

  @Override
  public String toString() {
    return "FileSource{" +
        "kind='" + getKind() + "'" +
        ", base64String=" + (base64String == null ? "null" : "'" + base64String + "'") +
        ", filename=" + (filename == null ? "null" : "'" + filename + "'") +
        '}';
  }

  @Override
  public void setKind(@Nullable Kind kind) {
    super.setKind(Kind.FILE);
  }
}
