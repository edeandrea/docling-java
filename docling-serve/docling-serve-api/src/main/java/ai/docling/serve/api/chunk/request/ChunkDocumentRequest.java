package ai.docling.serve.api.chunk.request;

import java.util.List;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import ai.docling.serve.api.convert.request.options.ConvertDocumentOptions;
import ai.docling.serve.api.convert.request.source.Source;
import ai.docling.serve.api.convert.request.target.Target;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@tools.jackson.databind.annotation.JsonDeserialize(builder = ChunkDocumentRequest.ChunkDocumentRequestBuilder.class)
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.Getter
@lombok.ToString
public sealed abstract class ChunkDocumentRequest permits HierarchicalChunkDocumentRequest, HybridChunkDocumentRequest {
  /**
   * List of input document sources to process.
   *
   * @param sources the list of document sources
   * @return the list of document sources
   */
  @JsonProperty("sources")
  @JsonSetter(nulls = Nulls.AS_EMPTY)
  @lombok.Singular
  private List<Source> sources;

  /**
   * Conversion options.
   *
   * @param options the conversion options
   * @return the conversion options
   */
  @JsonProperty("convert_options")
  @lombok.NonNull
  @lombok.Builder.Default
  private ConvertDocumentOptions options = ConvertDocumentOptions.builder().build();

  /**
   * Specification for the type of output target.
   *
   * @param target the output target specification, or null if not specified
   * @return the output target specification, or null if not specified
   */
  @JsonProperty("target")
  @Nullable
  private Target target;

  /**
   * If true, the output will include both the chunks and the converted document.
   *
   * @param includeConvertedDoc true if the converted document should be included, false otherwise
   * @return true if the converted document should be included, false otherwise
   */
  @JsonProperty("include_converted_doc")
  private boolean includeConvertedDoc;

  @tools.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
  public static abstract class ChunkDocumentRequestBuilder<C extends ChunkDocumentRequest, B extends ChunkDocumentRequestBuilder<C, B>> {
    // Lombok's @SuperBuilder generates the actual implementation
  }
}
