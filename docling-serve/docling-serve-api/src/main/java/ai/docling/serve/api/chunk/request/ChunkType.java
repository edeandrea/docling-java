package ai.docling.serve.api.chunk.request;

/**
 * Defines the types of chunking mechanisms supported for document processing.
 *
 * The enum provides options for selecting distinct strategies to parse and divide
 * documents into manageable segments for further processing or analysis.
 */
public enum ChunkType {
  /**
   * Represents a hybrid chunking type, which combines features of multiple
   * chunking strategies to process documents in a flexible manner.
   *
   * Used in scenarios where the benefits of both sequential and hierarchical
   * chunking approaches are desired, enabling customization based on specific
   * processing requirements.
   */
  HYBRID,

  /**
   * Represents a hierarchical chunking type, which processes documents by
   * breaking them into a nested structure of smaller chunks.
   *
   * Used in scenarios where maintaining a clear hierarchy within the document
   * structure is critical, enabling processing at multiple levels of granularity.
   */
  HIERARCHICAL
}
