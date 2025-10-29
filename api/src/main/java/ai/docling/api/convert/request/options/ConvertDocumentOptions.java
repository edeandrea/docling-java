package ai.docling.api.convert.request.options;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jspecify.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Options for configuring the document conversion process with Docling.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ConvertDocumentOptions {
  @JsonProperty("from_formats")
  private List<InputFormat> fromFormats = new ArrayList<>();

  @JsonProperty("to_formats")
  private List<OutputFormat> toFormats = new ArrayList<>();

  @JsonProperty("image_export_mode")
  private ImageRefMode imageExportMode;

  @JsonProperty("do_ocr")
  private Boolean doOcr;

  @JsonProperty("force_ocr")
  private Boolean forceOcr;

  @JsonProperty("ocr_engine")
  private OcrEngine ocrEngine;

  @JsonProperty("ocr_lang")
  private List<String> ocrLang = new ArrayList<>();

  @JsonProperty("pdf_backend")
  private PdfBackend pdfBackend;

  @JsonProperty("table_mode")
  private TableFormerMode tableMode;

  @JsonProperty("table_cell_matching")
  private Boolean tableCellMatching;

  @JsonProperty("pipeline")
  private ProcessingPipeline pipeline;

  @JsonProperty("page_range")
  private List<Integer> pageRange = new ArrayList<>();

  @JsonProperty("document_timeout")
  private Duration documentTimeout;

  @JsonProperty("abort_on_error")
  private Boolean abortOnError;

  @JsonProperty("do_table_structure")
  private Boolean doTableStructure;

  @JsonProperty("include_images")
  private Boolean includeImages;

  @JsonProperty("images_scale")
  private Double imagesScale;

  @JsonProperty("md_page_break_placeholder")
  private String mdPageBreakPlaceholder;

  @JsonProperty("do_code_enrichment")
  private Boolean doCodeEnrichment;

  @JsonProperty("do_formula_enrichment")
  private Boolean doFormulaEnrichment;

  @JsonProperty("do_picture_classification")
  private Boolean doPictureClassification;

  @JsonProperty("do_picture_description")
  private Boolean doPictureDescription;

  @JsonProperty("picture_description_area_threshold")
  private Double pictureDescriptionAreaThreshold;

  @JsonProperty("picture_description_local")
  private PictureDescriptionLocal pictureDescriptionLocal;

  @JsonProperty("picture_description_api")
  private PictureDescriptionApi pictureDescriptionApi;

  @JsonProperty("vlm_pipeline_model")
  private VlmModelType vlmPipelineModel;

  @JsonProperty("vlm_pipeline_model_local")
  private String vlmPipelineModelLocal;

  @JsonProperty("vlm_pipeline_model_api")
  private String vlmPipelineModelApi;

  /**
   * Gets whether to abort document conversion on error.
   *
   * @return true if conversion should abort on error, false otherwise, or null if not set
   */
  @Nullable
  public Boolean getAbortOnError() {
    return abortOnError;
  }

  /**
   * Sets whether to abort document conversion on error.
   *
   * @param abortOnError true to abort on error, false to continue, or null to use default
   */
  public void setAbortOnError(@Nullable Boolean abortOnError) {
    this.abortOnError = abortOnError;
  }

  /**
   * Gets whether code enrichment is enabled during conversion.
   *
   * @return true if code enrichment is enabled, false otherwise, or null if not set
   */
  @Nullable
  public Boolean getDoCodeEnrichment() {
    return doCodeEnrichment;
  }

  /**
   * Sets whether to enable code enrichment during conversion.
   *
   * @param doCodeEnrichment true to enable code enrichment, false to disable, or null to use default
   */
  public void setDoCodeEnrichment(@Nullable Boolean doCodeEnrichment) {
    this.doCodeEnrichment = doCodeEnrichment;
  }

  /**
   * Gets the timeout duration for document conversion.
   *
   * @return the timeout duration, or null if not set
   */
  @Nullable
  public Duration getDocumentTimeout() {
    return documentTimeout;
  }

  /**
   * Sets the timeout duration for document conversion.
   *
   * @param documentTimeout the timeout duration, or null to use default
   */
  public void setDocumentTimeout(@Nullable Duration documentTimeout) {
    this.documentTimeout = documentTimeout;
  }

  /**
   * Gets whether formula enrichment is enabled during conversion.
   *
   * @return true if formula enrichment is enabled, false otherwise, or null if not set
   */
  @Nullable
  public Boolean getDoFormulaEnrichment() {
    return doFormulaEnrichment;
  }

  /**
   * Sets whether to enable formula enrichment during conversion.
   *
   * @param doFormulaEnrichment true to enable formula enrichment, false to disable, or null to use default
   */
  public void setDoFormulaEnrichment(@Nullable Boolean doFormulaEnrichment) {
    this.doFormulaEnrichment = doFormulaEnrichment;
  }

  /**
   * Gets whether OCR (Optical Character Recognition) is enabled.
   *
   * @return true if OCR is enabled, false otherwise, or null if not set
   */
  @Nullable
  public Boolean getDoOcr() {
    return doOcr;
  }

  /**
   * Sets whether to enable OCR (Optical Character Recognition).
   *
   * @param doOcr true to enable OCR, false to disable, or null to use default
   */
  public void setDoOcr(@Nullable Boolean doOcr) {
    this.doOcr = doOcr;
  }

  /**
   * Gets whether picture classification is enabled during conversion.
   *
   * @return true if picture classification is enabled, false otherwise, or null if not set
   */
  @Nullable
  public Boolean getDoPictureClassification() {
    return doPictureClassification;
  }

  /**
   * Sets whether to enable picture classification during conversion.
   *
   * @param doPictureClassification true to enable picture classification, false to disable, or null to use default
   */
  public void setDoPictureClassification(@Nullable Boolean doPictureClassification) {
    this.doPictureClassification = doPictureClassification;
  }

  /**
   * Gets whether picture description is enabled during conversion.
   *
   * @return true if picture description is enabled, false otherwise, or null if not set
   */
  @Nullable
  public Boolean getDoPictureDescription() {
    return doPictureDescription;
  }

  /**
   * Sets whether to enable picture description during conversion.
   *
   * @param doPictureDescription true to enable picture description, false to disable, or null to use default
   */
  public void setDoPictureDescription(@Nullable Boolean doPictureDescription) {
    this.doPictureDescription = doPictureDescription;
  }

  /**
   * Gets whether table structure analysis is enabled during conversion.
   *
   * @return true if table structure analysis is enabled, false otherwise, or null if not set
   */
  @Nullable
  public Boolean getDoTableStructure() {
    return doTableStructure;
  }

  /**
   * Sets whether to enable table structure analysis during conversion.
   *
   * @param doTableStructure true to enable table structure analysis, false to disable, or null to use default
   */
  public void setDoTableStructure(@Nullable Boolean doTableStructure) {
    this.doTableStructure = doTableStructure;
  }

  /**
   * Gets whether OCR should be forced even if text is already available.
   *
   * @return true if OCR is forced, false otherwise, or null if not set
   */
  @Nullable
  public Boolean getForceOcr() {
    return forceOcr;
  }

  /**
   * Sets whether to force OCR even if text is already available.
   *
   * @param forceOcr true to force OCR, false otherwise, or null to use default
   */
  public void setForceOcr(@Nullable Boolean forceOcr) {
    this.forceOcr = forceOcr;
  }

  /**
   * Gets the list of input document formats to process.
   *
   * @return an unmodifiable list of input formats
   */
  public List<InputFormat> getFromFormats() {
    return Collections.unmodifiableList(fromFormats);
  }

  /**
   * Sets the list of input document formats to process.
   *
   * @param fromFormats the list of input formats, or null to clear
   */
  public void setFromFormats(@Nullable List<InputFormat> fromFormats) {
    this.fromFormats.clear();

    if (fromFormats != null) {
      this.fromFormats.addAll(fromFormats);
    }
  }

  /**
   * Gets the image export mode for handling images during conversion.
   *
   * @return the image export mode, or null if not set
   */
  @Nullable
  public ImageRefMode getImageExportMode() {
    return imageExportMode;
  }

  /**
   * Sets the image export mode for handling images during conversion.
   *
   * @param imageExportMode the image export mode, or null to use default
   */
  public void setImageExportMode(@Nullable ImageRefMode imageExportMode) {
    this.imageExportMode = imageExportMode;
  }

  /**
   * Gets the scale factor for exported images.
   *
   * @return the image scale factor, or null if not set
   */
  @Nullable
  public Double getImagesScale() {
    return imagesScale;
  }

  /**
   * Sets the scale factor for exported images.
   *
   * @param imagesScale the image scale factor, or null to use default
   */
  public void setImagesScale(@Nullable Double imagesScale) {
    this.imagesScale = imagesScale;
  }

  /**
   * Gets whether images should be included in the converted output.
   *
   * @return true if images should be included, false otherwise, or null if not set
   */
  @Nullable
  public Boolean getIncludeImages() {
    return includeImages;
  }

  /**
   * Sets whether images should be included in the converted output.
   *
   * @param includeImages true to include images, false to exclude, or null to use default
   */
  public void setIncludeImages(@Nullable Boolean includeImages) {
    this.includeImages = includeImages;
  }

  /**
   * Gets the placeholder string for page breaks in Markdown output.
   *
   * @return the page break placeholder string, or null if not set
   */
  @Nullable
  public String getMdPageBreakPlaceholder() {
    return mdPageBreakPlaceholder;
  }

  /**
   * Sets the placeholder string for page breaks in Markdown output.
   *
   * @param mdPageBreakPlaceholder the page break placeholder string, or null to use default
   */
  public void setMdPageBreakPlaceholder(@Nullable String mdPageBreakPlaceholder) {
    this.mdPageBreakPlaceholder = mdPageBreakPlaceholder;
  }

  /**
   * Gets the OCR engine to use for text recognition.
   *
   * @return the OCR engine, or null if not set
   */
  @Nullable
  public OcrEngine getOcrEngine() {
    return ocrEngine;
  }

  /**
   * Sets the OCR engine to use for text recognition.
   *
   * @param ocrEngine the OCR engine, or null to use default
   */
  public void setOcrEngine(@Nullable OcrEngine ocrEngine) {
    this.ocrEngine = ocrEngine;
  }

  /**
   * Gets the list of language codes for OCR processing.
   *
   * @return an unmodifiable list of language codes
   */
  public List<String> getOcrLang() {
    return Collections.unmodifiableList(ocrLang);
  }

  /**
   * Sets the list of language codes for OCR processing.
   *
   * @param ocrLang the list of language codes, or null to clear
   */
  public void setOcrLang(@Nullable List<String> ocrLang) {
    this.ocrLang.clear();

    if (ocrLang != null) {
      this.ocrLang.addAll(ocrLang);
    }
  }

  /**
   * Gets the page range to process during conversion.
   *
   * @return an unmodifiable list containing the page range (from and to page numbers)
   */
  public List<Integer> getPageRange() {
    return Collections.unmodifiableList(pageRange);
  }

  /**
   * Sets the page range to process during conversion.
   *
   * @param pageRange a list containing the page range (from and to page numbers), or null to clear
   */
  public void setPageRange(@Nullable List<Integer> pageRange) {
    this.pageRange.clear();

    if (pageRange != null) {
      this.pageRange.addAll(pageRange);
    }
  }

  /**
   * Gets the PDF backend to use for processing PDF documents.
   *
   * @return the PDF backend, or null if not set
   */
  @Nullable
  public PdfBackend getPdfBackend() {
    return pdfBackend;
  }

  /**
   * Sets the PDF backend to use for processing PDF documents.
   *
   * @param pdfBackend the PDF backend, or null to use default
   */
  public void setPdfBackend(@Nullable PdfBackend pdfBackend) {
    this.pdfBackend = pdfBackend;
  }

  /**
   * Gets the API-based picture description configuration.
   *
   * @return the picture description API configuration, or null if not set
   */
  @Nullable
  public PictureDescriptionApi getPictureDescriptionApi() {
    return pictureDescriptionApi;
  }
  
  private static void checkPictureDescription(PictureDescriptionApi pictureDescriptionApi, PictureDescriptionLocal pictureDescriptionLocal) {
    if ((pictureDescriptionLocal != null) && (pictureDescriptionApi != null)) {
      throw new IllegalArgumentException("picture_description_local and picture_description_api cannot both be set");
    }
  }

  /**
   * Sets the API-based picture description configuration.
   *
   * @param pictureDescriptionApi the picture description API configuration, or null to disable
   * @throws IllegalArgumentException if both API and local picture description are set
   */
  public void setPictureDescriptionApi(@Nullable PictureDescriptionApi pictureDescriptionApi) {
    checkPictureDescription(pictureDescriptionApi, pictureDescriptionLocal);
    this.pictureDescriptionApi = pictureDescriptionApi;
  }

  /**
   * Gets the area threshold for picture description.
   *
   * @return the area threshold value, or null if not set
   */
  @Nullable
  public Double getPictureDescriptionAreaThreshold() {
    return pictureDescriptionAreaThreshold;
  }

  /**
   * Sets the area threshold for picture description.
   *
   * @param pictureDescriptionAreaThreshold the area threshold value, or null to use default
   */
  public void setPictureDescriptionAreaThreshold(@Nullable Double pictureDescriptionAreaThreshold) {
    this.pictureDescriptionAreaThreshold = pictureDescriptionAreaThreshold;
  }

  /**
   * Gets the local picture description configuration.
   *
   * @return the picture description local configuration, or null if not set
   */
  @Nullable
  public PictureDescriptionLocal getPictureDescriptionLocal() {
    return pictureDescriptionLocal;
  }

  /**
   * Sets the local picture description configuration.
   *
   * @param pictureDescriptionLocal the picture description local configuration, or null to disable
   * @throws IllegalArgumentException if both API and local picture description are set
   */
  public void setPictureDescriptionLocal(@Nullable PictureDescriptionLocal pictureDescriptionLocal) {
    checkPictureDescription(pictureDescriptionApi, pictureDescriptionLocal);
    this.pictureDescriptionLocal = pictureDescriptionLocal;
  }

  /**
   * Gets the processing pipeline to use for document conversion.
   *
   * @return the processing pipeline, or null if not set
   */
  @Nullable
  public ProcessingPipeline getPipeline() {
    return pipeline;
  }

  /**
   * Sets the processing pipeline to use for document conversion.
   *
   * @param pipeline the processing pipeline, or null to use default
   */
  public void setPipeline(@Nullable ProcessingPipeline pipeline) {
    this.pipeline = pipeline;
  }

  /**
   * Gets whether table cell matching is enabled.
   *
   * @return true if table cell matching is enabled, false otherwise, or null if not set
   */
  @Nullable
  public Boolean getTableCellMatching() {
    return tableCellMatching;
  }

  /**
   * Sets whether to enable table cell matching.
   *
   * @param tableCellMatching true to enable table cell matching, false to disable, or null to use default
   */
  public void setTableCellMatching(@Nullable Boolean tableCellMatching) {
    this.tableCellMatching = tableCellMatching;
  }

  /**
   * Gets the table processing mode.
   *
   * @return the table mode, or null if not set
   */
  @Nullable
  public TableFormerMode getTableMode() {
    return tableMode;
  }

  /**
   * Sets the table processing mode.
   *
   * @param tableMode the table mode, or null to use default
   */
  public void setTableMode(@Nullable TableFormerMode tableMode) {
    this.tableMode = tableMode;
  }

  /**
   * Gets the list of output formats for the converted document.
   *
   * @return the list of output formats, or null if not set
   */
  public List<OutputFormat> getToFormats() {
    return Collections.unmodifiableList(toFormats);
  }

  /**
   * Sets the list of output formats for the converted document.
   *
   * @param toFormats the list of output formats, or null to use default
   */
  public void setToFormats(@Nullable List<OutputFormat> toFormats) {
    this.toFormats.clear();

    if (toFormats != null) {
      this.toFormats.addAll(toFormats);
    }
  }

  /**
   * Gets the Vision-Language Model (VLM) pipeline model type.
   *
   * @return the VLM model type, or null if not set
   */
  @Nullable
  public VlmModelType getVlmPipelineModel() {
    return vlmPipelineModel;
  }

  /**
   * Sets the Vision-Language Model (VLM) pipeline model type.
   *
   * @param vlmPipelineModel the VLM model type, or null to use default
   */
  public void setVlmPipelineModel(@Nullable VlmModelType vlmPipelineModel) {
    this.vlmPipelineModel = vlmPipelineModel;
  }

  /**
   * Gets the API-based VLM pipeline model identifier.
   *
   * @return the API model identifier, or null if not set
   */
  @Nullable
  public String getVlmPipelineModelApi() {
    return vlmPipelineModelApi;
  }

  /**
   * Sets the API-based VLM pipeline model identifier.
   *
   * @param vlmPipelineModelApi the API model identifier, or null to use default
   */
  public void setVlmPipelineModelApi(@Nullable String vlmPipelineModelApi) {
    this.vlmPipelineModelApi = vlmPipelineModelApi;
  }

  /**
   * Gets the local VLM pipeline model identifier.
   *
   * @return the local model identifier, or null if not set
   */
  @Nullable
  public String getVlmPipelineModelLocal() {
    return vlmPipelineModelLocal;
  }

  /**
   * Sets the local VLM pipeline model identifier.
   *
   * @param vlmPipelineModelLocal the local model identifier, or null to use default
   */
  public void setVlmPipelineModelLocal(@Nullable String vlmPipelineModelLocal) {
    this.vlmPipelineModelLocal = vlmPipelineModelLocal;
  }

  /**
   * Sets whether to abort document conversion on error and returns this instance for method chaining.
   *
   * @param abortOnError true to abort on error, false to continue, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withAbortOnError(@Nullable Boolean abortOnError) {
    setAbortOnError(abortOnError);
    return this;
  }

  /**
   * Sets whether to enable code enrichment and returns this instance for method chaining.
   *
   * @param doCodeEnrichment true to enable code enrichment, false to disable, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withDoCodeEnrichment(@Nullable Boolean doCodeEnrichment) {
    setDoCodeEnrichment(doCodeEnrichment);
    return this;
  }

  /**
   * Sets the timeout duration for document conversion and returns this instance for method chaining.
   *
   * @param documentTimeout the timeout duration, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withDocumentTimeout(@Nullable Duration documentTimeout) {
    setDocumentTimeout(documentTimeout);
    return this;
  }

  /**
   * Sets whether to enable formula enrichment and returns this instance for method chaining.
   *
   * @param doFormulaEnrichment true to enable formula enrichment, false to disable, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withDoFormulaEnrichment(@Nullable Boolean doFormulaEnrichment) {
    setDoFormulaEnrichment(doFormulaEnrichment);
    return this;
  }

  /**
   * Sets whether to enable OCR and returns this instance for method chaining.
   *
   * @param doOcr true to enable OCR, false to disable, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withDoOcr(@Nullable Boolean doOcr) {
    setDoOcr(doOcr);
    return this;
  }

  /**
   * Sets whether to enable picture classification and returns this instance for method chaining.
   *
   * @param doPictureClassification true to enable picture classification, false to disable, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withDoPictureClassification(@Nullable Boolean doPictureClassification) {
    setDoPictureClassification(doPictureClassification);
    return this;
  }

  /**
   * Sets whether to enable picture description and returns this instance for method chaining.
   *
   * @param doPictureDescription true to enable picture description, false to disable, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withDoPictureDescription(@Nullable Boolean doPictureDescription) {
    setDoPictureDescription(doPictureDescription);
    return this;
  }

  /**
   * Sets whether to enable table structure analysis and returns this instance for method chaining.
   *
   * @param doTableStructure true to enable table structure analysis, false to disable, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withDoTableStructure(@Nullable Boolean doTableStructure) {
    setDoTableStructure(doTableStructure);
    return this;
  }

  /**
   * Sets whether to force OCR and returns this instance for method chaining.
   *
   * @param forceOcr true to force OCR, false otherwise, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withForceOcr(@Nullable Boolean forceOcr) {
    setForceOcr(forceOcr);
    return this;
  }

  /**
   * Sets the list of input formats and returns this instance for method chaining.
   *
   * @param fromFormats the list of input formats, or null to clear
   * @return this options instance
   */
  public ConvertDocumentOptions withFromFormats(@Nullable List<InputFormat> fromFormats) {
    setFromFormats(fromFormats);
    return this;
  }

  /**
   * Sets the image export mode and returns this instance for method chaining.
   *
   * @param imageExportMode the image export mode, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withImageExportMode(@Nullable ImageRefMode imageExportMode) {
    setImageExportMode(imageExportMode);
    return this;
  }

  /**
   * Sets the image scale factor and returns this instance for method chaining.
   *
   * @param imagesScale the image scale factor, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withImagesScale(@Nullable Double imagesScale) {
    setImagesScale(imagesScale);
    return this;
  }

  /**
   * Sets whether to include images and returns this instance for method chaining.
   *
   * @param includeImages true to include images, false to exclude, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withIncludeImages(@Nullable Boolean includeImages) {
    setIncludeImages(includeImages);
    return this;
  }

  /**
   * Sets the Markdown page break placeholder and returns this instance for method chaining.
   *
   * @param mdPageBreakPlaceholder the page break placeholder string, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withMdPageBreakPlaceholder(@Nullable String mdPageBreakPlaceholder) {
    setMdPageBreakPlaceholder(mdPageBreakPlaceholder);
    return this;
  }

  /**
   * Sets the OCR engine and returns this instance for method chaining.
   *
   * @param ocrEngine the OCR engine, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withOcrEngine(@Nullable OcrEngine ocrEngine) {
    setOcrEngine(ocrEngine);
    return this;
  }

  /**
   * Sets the OCR language codes and returns this instance for method chaining.
   *
   * @param ocrLang the list of language codes, or null to clear
   * @return this options instance
   */
  public ConvertDocumentOptions withOcrLang(@Nullable List<String> ocrLang) {
    setOcrLang(ocrLang);
    return this;
  }

  /**
   * Sets the page range using from and to page numbers and returns this instance for method chaining.
   *
   * @param fromPage the starting page number, or null to clear the range
   * @param toPage the ending page number, or null to clear the range
   * @return this options instance
   * @throws IllegalArgumentException if only one of fromPage or toPage is null
   */
  public ConvertDocumentOptions withPageRange(@Nullable Integer fromPage, @Nullable Integer toPage) {
    if (((fromPage == null) && (toPage != null)) || ((fromPage != null) && (toPage == null))) {
      throw new IllegalArgumentException("fromPage and toPage must both be null or both not null");
    }

    if (fromPage != null) {
      setPageRange(List.of(fromPage, toPage));
    }
    else {
      setPageRange(List.of());
    }
    
    return this;
  }

  /**
   * Sets the page range and returns this instance for method chaining.
   *
   * @param pageRange a list containing the page range (from and to page numbers), or null to clear
   * @return this options instance
   */
  public ConvertDocumentOptions withPageRange(@Nullable List<Integer> pageRange) {
    setPageRange(pageRange);
    return this;
  }

  /**
   * Sets the PDF backend and returns this instance for method chaining.
   *
   * @param pdfBackend the PDF backend, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withPdfBackend(@Nullable PdfBackend pdfBackend) {
    setPdfBackend(pdfBackend);
    return this;
  }

  /**
   * Sets the API-based picture description configuration and returns this instance for method chaining.
   *
   * @param pictureDescriptionApi the picture description API configuration, or null to disable
   * @return this options instance
   * @throws IllegalArgumentException if both API and local picture description are set
   */
  public ConvertDocumentOptions withPictureDescriptionApi(@Nullable PictureDescriptionApi pictureDescriptionApi) {
    setPictureDescriptionApi(pictureDescriptionApi);
    return this;
  }

  /**
   * Sets the picture description area threshold and returns this instance for method chaining.
   *
   * @param pictureDescriptionAreaThreshold the area threshold value, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withPictureDescriptionAreaThreshold(@Nullable Double pictureDescriptionAreaThreshold) {
    setPictureDescriptionAreaThreshold(pictureDescriptionAreaThreshold);
    return this;
  }

  /**
   * Sets the local picture description configuration and returns this instance for method chaining.
   *
   * @param pictureDescriptionLocal the picture description local configuration, or null to disable
   * @return this options instance
   * @throws IllegalArgumentException if both API and local picture description are set
   */
  public ConvertDocumentOptions withPictureDescriptionLocal(@Nullable PictureDescriptionLocal pictureDescriptionLocal) {
    setPictureDescriptionLocal(pictureDescriptionLocal);
    return this;
  }

  /**
   * Sets the processing pipeline and returns this instance for method chaining.
   *
   * @param pipeline the processing pipeline, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withPipeline(@Nullable ProcessingPipeline pipeline) {
    setPipeline(pipeline);
    return this;
  }

  /**
   * Sets whether to enable table cell matching and returns this instance for method chaining.
   *
   * @param tableCellMatching true to enable table cell matching, false to disable, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withTableCellMatching(@Nullable Boolean tableCellMatching) {
    setTableCellMatching(tableCellMatching);
    return this;
  }

  /**
   * Sets the table processing mode and returns this instance for method chaining.
   *
   * @param tableMode the table mode, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withTableMode(@Nullable TableFormerMode tableMode) {
    setTableMode(tableMode);
    return this;
  }

  /**
   * Sets the list of output formats and returns this instance for method chaining.
   *
   * @param toFormats the list of output formats, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withToFormats(@Nullable List<OutputFormat> toFormats) {
    setToFormats(toFormats);
    return this;
  }

  /**
   * Sets the VLM pipeline model type and returns this instance for method chaining.
   *
   * @param vlmPipelineModel the VLM model type, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withVlmPipelineModel(@Nullable VlmModelType vlmPipelineModel) {
    setVlmPipelineModel(vlmPipelineModel);
    return this;
  }

  /**
   * Sets the API-based VLM pipeline model identifier and returns this instance for method chaining.
   *
   * @param vlmPipelineModelApi the API model identifier, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withVlmPipelineModelApi(@Nullable String vlmPipelineModelApi) {
    setVlmPipelineModelApi(vlmPipelineModelApi);
    return this;
  }

  /**
   * Sets the local VLM pipeline model identifier and returns this instance for method chaining.
   *
   * @param vlmPipelineModelLocal the local model identifier, or null to use default
   * @return this options instance
   */
  public ConvertDocumentOptions withVlmPipelineModelLocal(@Nullable String vlmPipelineModelLocal) {
    setVlmPipelineModelLocal(vlmPipelineModelLocal);
    return this;
  }

  @Override
  public String toString() {
    return "ConvertDocumentOptions{" +
        "abortOnError=" + abortOnError +
        ", fromFormats=" + fromFormats +
        ", toFormats=" + toFormats +
        ", imageExportMode=" + imageExportMode +
        ", doOcr=" + doOcr +
        ", forceOcr=" + forceOcr +
        ", ocrEngine=" + ocrEngine +
        ", ocrLang=" + ocrLang +
        ", pdfBackend=" + pdfBackend +
        ", tableMode=" + tableMode +
        ", tableCellMatching=" + tableCellMatching +
        ", pipeline=" + pipeline +
        ", pageRange=" + pageRange +
        ", documentTimeout=" + documentTimeout +
        ", doTableStructure=" + doTableStructure +
        ", includeImages=" + includeImages +
        ", imagesScale=" + imagesScale +
        ", mdPageBreakPlaceholder='" + mdPageBreakPlaceholder + '\'' +
        ", doCodeEnrichment=" + doCodeEnrichment +
        ", doFormulaEnrichment=" + doFormulaEnrichment +
        ", doPictureClassification=" + doPictureClassification +
        ", doPictureDescription=" + doPictureDescription +
        ", pictureDescriptionAreaThreshold=" + pictureDescriptionAreaThreshold +
        ", pictureDescriptionLocal=" + pictureDescriptionLocal +
        ", pictureDescriptionApi=" + pictureDescriptionApi +
        ", vlmPipelineModel=" + vlmPipelineModel +
        ", vlmPipelineModelLocal='" + vlmPipelineModelLocal + '\'' +
        ", vlmPipelineModelApi='" + vlmPipelineModelApi + '\'' +
        '}';
  }
}
