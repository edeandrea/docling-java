package ai.docling.api.convert.response;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an individual error produced during document conversion.
 *
 * <p>Serialization uses {@link JsonInclude.Include#NON_EMPTY}, so nulls and empty
 * strings are omitted from JSON output.</p>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ErrorItem {

  @JsonProperty("component_type")
  private String componentType;

  @JsonProperty("error_message")
  private String errorMessage;

  @JsonProperty("module_name")
  private String moduleName;

  /**
   * Returns the component type that produced the error.
   *
   * @return component type or {@code null}
   */
  @Nullable
  public String getComponentType() {
    return componentType;
  }

  /**
   * Sets the component type that produced the error.
   *
   * @param componentType component type; may be {@code null}
   */
  public void setComponentType(@Nullable String componentType) {
    this.componentType = componentType;
  }

  /**
   * Fluent setter for {@link #setComponentType(String)}.
   *
   * @param componentType component type; may be {@code null}
   * @return this for chaining
   */
  public ErrorItem withComponentType(@Nullable String componentType) {
    setComponentType(componentType);
    return this;
  }

  /**
   * Returns the human-readable error message.
   *
   * @return error message or {@code null}
   */
  @Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Sets the human-readable error message.
   *
   * @param errorMessage error message; may be {@code null}
   */
  public void setErrorMessage(@Nullable String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Fluent setter for {@link #setErrorMessage(String)}.
   *
   * @param errorMessage error message; may be {@code null}
   * @return this for chaining
   */
  public ErrorItem withErrorMessage(@Nullable String errorMessage) {
    setErrorMessage(errorMessage);
    return this;
  }

  /**
   * Returns the module name where the error originated.
   *
   * @return module name or {@code null}
   */
  @Nullable
  public String getModuleName() {
    return moduleName;
  }

  /**
   * Sets the module name where the error originated.
   *
   * @param moduleName module name; may be {@code null}
   */
  public void setModuleName(@Nullable String moduleName) {
    this.moduleName = moduleName;
  }

  /**
   * Fluent setter for {@link #setModuleName(String)}.
   *
   * @param moduleName module name; may be {@code null}
   * @return this for chaining
   */
  public ErrorItem withModuleName(@Nullable String moduleName) {
    setModuleName(moduleName);
    return this;
  }

  /**
   * Returns a string representation with actual field values.
   */
  @Override
  public String toString() {
    return "ErrorItem{" +
        "componentType=" + (componentType == null ? "null" : "'" + componentType + "'") +
        ", errorMessage=" + (errorMessage == null ? "null" : "'" + errorMessage + "'") +
        ", moduleName=" + (moduleName == null ? "null" : "'" + moduleName + "'") +
        '}';
  }
}
