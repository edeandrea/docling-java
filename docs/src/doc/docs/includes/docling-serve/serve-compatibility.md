# Results for ghcr.io/docling-project/docling-serve as of 2026-08-10T05:06:54.019032013Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
| v1.30.0 | ✅ SUCCESS | [Click for run details](#v1.30.0-details) |
| v1.29.0 | ✅ SUCCESS | [Click for run details](#v1.29.0-details) |
| v1.28.0 | ✅ SUCCESS | [Click for run details](#v1.28.0-details) |
| v1.27.0 | ✅ SUCCESS | [Click for run details](#v1.27.0-details) |
| v1.26.0 | ✅ SUCCESS | [Click for run details](#v1.26.0-details) |
| v1.25.0 | ✅ SUCCESS | [Click for run details](#v1.25.0-details) |
| v1.24.0 | ✅ SUCCESS | [Click for run details](#v1.24.0-details) |
| v1.23.0 | ✅ SUCCESS | [Click for run details](#v1.23.0-details) |
| v1.22.1 | ✅ SUCCESS | [Click for run details](#v1.22.1-details) |
| v1.22.0 | ✅ SUCCESS | [Click for run details](#v1.22.0-details) |
| v1.21.0 | ✅ SUCCESS | [Click for run details](#v1.21.0-details) |
| v1.20.0 | ✅ SUCCESS | [Click for run details](#v1.20.0-details) |
| v1.19.0 | ✅ SUCCESS | [Click for run details](#v1.19.0-details) |
| v1.18.0 | ✅ SUCCESS | [Click for run details](#v1.18.0-details) |
| v1.17.0 | ✅ SUCCESS | [Click for run details](#v1.17.0-details) |
| v1.16.1 | ✅ SUCCESS | [Click for run details](#v1.16.1-details) |
| v1.15.0 | ✅ SUCCESS | [Click for run details](#v1.15.0-details) |
| v1.14.3 | ✅ SUCCESS | [Click for run details](#v1.14.3-details) |
| v1.14.2 | ✅ SUCCESS | [Click for run details](#v1.14.2-details) |
| v1.14.1 | ✅ SUCCESS | [Click for run details](#v1.14.1-details) |
| v1.14.0 | ✅ SUCCESS | [Click for run details](#v1.14.0-details) |
| v1.13.1 | ✅ SUCCESS | [Click for run details](#v1.13.1-details) |
| v1.13.0 | ✅ SUCCESS | [Click for run details](#v1.13.0-details) |
| v1.12.0 | ✅ SUCCESS | [Click for run details](#v1.12.0-details) |
| v1.11.0 | ✅ SUCCESS | [Click for run details](#v1.11.0-details) |
| v1.10.0 | ✅ SUCCESS | [Click for run details](#v1.10.0-details) |
| v1.9.0 | ✅ SUCCESS | [Click for run details](#v1.9.0-details) |
| v1.8.0 | ✅ SUCCESS | [Click for run details](#v1.8.0-details) |
| v1.7.2 | ✅ SUCCESS | [Click for run details](#v1.7.2-details) |
| v1.7.1 | ✅ SUCCESS | [Click for run details](#v1.7.1-details) |
| v1.7.0 | ✅ SUCCESS | [Click for run details](#v1.7.0-details) |
| v1.6.0 | ✅ SUCCESS | [Click for run details](#v1.6.0-details) |
| v1.5.1 | ✅ SUCCESS | [Click for run details](#v1.5.1-details) |
| v1.5.0 | ✅ SUCCESS | [Click for run details](#v1.5.0-details) |
| v1.4.1 | ✅ SUCCESS | [Click for run details](#v1.4.1-details) |
| v1.4.0 | ✅ SUCCESS | [Click for run details](#v1.4.0-details) |
| v1.3.1 | ✅ SUCCESS | [Click for run details](#v1.3.1-details) |
| v1.3.0 | ✅ SUCCESS | [Click for run details](#v1.3.0-details) |
| v1.2.2 | ✅ SUCCESS | [Click for run details](#v1.2.2-details) |
| v1.2.1 | ✅ SUCCESS | [Click for run details](#v1.2.1-details) |
| v1.2.0 | ✅ SUCCESS | [Click for run details](#v1.2.0-details) |
| v1.1.0 | ✅ SUCCESS | [Click for run details](#v1.1.0-details) |
| v1.0.1 | ✅ SUCCESS | [Click for run details](#v1.0.1-details) |
| v1.0.0 | ✅ SUCCESS | [Click for run details](#v1.0.0-details) |

## Details

### ghcr.io/docling-project/docling-serve:v1.30.0

<details id="v1.30.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.30.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:	05:06:35 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:06:35 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:06:35 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	05:06:36 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	05:06:36 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	05:06:36 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	05:06:36 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	05:06:36 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	05:06:36 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:06:36 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:06:36 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/healthz$,/readyz$,/health$,/ready$,/metrics$)
INFO:	05:06:36 - uvicorn.error - Started server process [1]
INFO:	05:06:36 - uvicorn.error - Waiting for application startup.
INFO:	05:06:39 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:06:39 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:06:39 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:06:39 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:06:39 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:06:39 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e2db689ab35ca52a08b5b7fa25de8cc8
INFO:	05:06:39 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:06:39 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	05:06:39 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-10 05:06:39.586077239 [W:onnxruntime:Default, device_discovery.cc:134 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:06:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:06:39,811 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:06:39,812 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:06:39,868 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:06:39,868 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:06:39,910 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:06:39,911 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	05:06:39 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:06:39 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	05:06:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[transformers] `torch_dtype` is deprecated! Use `dtype` instead!
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 477/770 [00:00<00:00, 4742.61it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4776.31it/s]
INFO:	05:06:41 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	05:06:41 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:06:42 - uvicorn.error - Application startup complete.
INFO:	05:06:42 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:06:43 - docling_serve.app - Health check requested
INFO:	05:06:43 - uvicorn.access - 172.17.0.1:55992 - "GET /health HTTP/1.1" 200
INFO:	05:06:43 - docling_serve.app - Health check requested
INFO:	05:06:43 - uvicorn.access - 172.17.0.1:56006 - "GET /health HTTP/1.1" 200
INFO:	05:06:43 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:06:43 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:06:43 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:06:43 - docling_serve.app - [TENANT_ID] Task 88dfb9ba-1c13-4337-a6d5-6b0c36152492 created with tenant_id='default'
INFO:	05:06:43 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 88dfb9ba-1c13-4337-a6d5-6b0c36152492
INFO:	05:06:43 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:06:43 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	05:06:43 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:06:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:06:43,189 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:06:43,190 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:06:43,242 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:06:43,242 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:06:43,284 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:06:43,284 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	05:06:43 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:06:43 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	05:06:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 474/770 [00:00<00:00, 4730.98it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4798.09it/s]
INFO:	05:06:43 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	05:06:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:06:44 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:06:44 - docling.document_converter - Going to convert document batch...
INFO:	05:06:44 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	05:06:44 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:06:44 - docling.document_converter - Finished converting document file in 0.48 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	05:06:44 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:06:44 - docling_jobkit.convert.results - Processed 1 docs in 0.52 seconds.
INFO:	05:06:44 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 88dfb9ba-1c13-4337-a6d5-6b0c36152492 in 0.52 seconds
INFO:	05:06:45 - uvicorn.access - 172.17.0.1:56006 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:06:45 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:06:45 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:06:45 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:06:45 - docling_serve.app - [TENANT_ID] Task a6547b75-8c65-404f-ba86-6ea716120c16 created with tenant_id='default'
INFO:	05:06:45 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task a6547b75-8c65-404f-ba86-6ea716120c16
INFO:	05:06:45 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:06:45 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	05:06:45 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:06:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:06:45,223 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:06:45,223 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:06:45,273 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:06:45,273 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:06:45,319 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:06:45,320 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	05:06:45 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:06:45 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	05:06:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 475/770 [00:00<00:00, 4738.56it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4744.88it/s]
INFO:	05:06:45 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	05:06:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:06:46 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:06:46 - docling.document_converter - Going to convert document batch...
INFO:	05:06:46 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	05:06:46 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:06:46 - docling.document_converter - Finished converting document file in 0.39 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:06:46 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	05:06:46 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job a6547b75-8c65-404f-ba86-6ea716120c16 in 0.39 seconds
INFO:	05:06:47 - uvicorn.access - 172.17.0.1:56006 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:06:47 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:06:47 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:06:47 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:06:47 - docling_serve.app - [TENANT_ID] Task e94d811e-f57d-425a-82d4-3d1232cb69eb created with tenant_id='default'
INFO:	05:06:47 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task e94d811e-f57d-425a-82d4-3d1232cb69eb
INFO:	05:06:47 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:06:47 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 9df8df3fc03c33cf6e8bd583e67dce64
INFO:	05:06:47 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:06:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:06:47,229 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:06:47,229 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:06:47,277 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:06:47,277 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:06:47,319 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:06:47,319 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	05:06:47 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:06:47 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	05:06:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 481/770 [00:00<00:00, 4805.60it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4821.15it/s]
INFO:	05:06:48 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	05:06:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:06:48 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:06:48 - docling.document_converter - Going to convert document batch...
INFO:	05:06:48 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 9df8df3fc03c33cf6e8bd583e67dce64
INFO:	05:06:48 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:06:48 - docling.document_converter - Finished converting document file in 0.23 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:06:48 - docling_jobkit.convert.results - Processed 1 docs in 0.25 seconds.
INFO:	05:06:48 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job e94d811e-f57d-425a-82d4-3d1232cb69eb in 0.25 seconds
INFO:	05:06:49 - uvicorn.access - 172.17.0.1:56006 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:06:49 - uvicorn.access - 172.17.0.1:56006 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:06:49 - uvicorn.access - 172.17.0.1:56006 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.29.0

<details id="v1.29.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.29.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:	05:05:10 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:05:10 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:05:10 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	05:05:11 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	05:05:11 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	05:05:11 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:05:11 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:05:11 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/health$,/healthz$,/readyz$,/ready$,/metrics$)
INFO:	05:05:11 - uvicorn.error - Started server process [1]
INFO:	05:05:11 - uvicorn.error - Waiting for application startup.
INFO:	05:05:14 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:05:15 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:05:15 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:05:15 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:05:15 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:05:15 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash caff667a02b7f037838d32d34acfe0b0
INFO:	05:05:15 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:05:15 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	05:05:15 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-10 05:05:15.309805148 [W:onnxruntime:Default, device_discovery.cc:134 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:05:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:05:15,567 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:05:15,569 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:05:15,624 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:05:15,624 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:05:15,671 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:05:15,672 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:05:15 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:05:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▎   | 490/770 [00:00<00:00, 4899.42it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4917.11it/s]
INFO:	05:05:16 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:05:16 - uvicorn.error - Application startup complete.
INFO:	05:05:16 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:05:17 - docling_serve.app - Health check requested
INFO:	05:05:17 - uvicorn.access - 172.17.0.1:57120 - "GET /health HTTP/1.1" 200
INFO:	05:05:17 - docling_serve.app - Health check requested
INFO:	05:05:17 - uvicorn.access - 172.17.0.1:57136 - "GET /health HTTP/1.1" 200
INFO:	05:05:17 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:05:17 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:05:17 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:05:17 - docling_serve.app - [TENANT_ID] Task 8934e76a-1abe-4681-9e28-a67ca2efc4fe created with tenant_id='default'
INFO:	05:05:17 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8934e76a-1abe-4681-9e28-a67ca2efc4fe
INFO:	05:05:17 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:05:17 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash ab12ef348c8fc273bf2be7a49773b303
INFO:	05:05:17 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:05:17 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:05:17,488 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:05:17,488 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:05:17,531 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:05:17,531 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:05:17,602 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:05:17,602 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:05:17 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:05:17 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 511/770 [00:00<00:00, 5072.98it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5040.07it/s]
INFO:	05:05:18 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:05:19 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:05:19 - docling.document_converter - Going to convert document batch...
INFO:	05:05:19 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:05:19 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:05:19 - docling.document_converter - Finished converting document file in 0.41 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	05:05:19 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:05:19 - docling_jobkit.convert.results - Processed 1 docs in 0.45 seconds.
INFO:	05:05:19 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8934e76a-1abe-4681-9e28-a67ca2efc4fe in 0.45 seconds
INFO:	05:05:19 - uvicorn.access - 172.17.0.1:57136 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:05:19 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:05:19 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:05:19 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:05:19 - docling_serve.app - [TENANT_ID] Task c0f2a389-f5a6-4f97-a530-dd583170fae1 created with tenant_id='default'
INFO:	05:05:19 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task c0f2a389-f5a6-4f97-a530-dd583170fae1
INFO:	05:05:19 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:05:19 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash ab12ef348c8fc273bf2be7a49773b303
INFO:	05:05:19 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:05:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:05:19,513 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:05:19,513 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:05:19,566 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:05:19,566 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:05:19,608 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:05:19,608 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:05:19 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:05:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 504/770 [00:00<00:00, 5034.18it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5020.00it/s]
INFO:	05:05:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:05:20 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:05:20 - docling.document_converter - Going to convert document batch...
INFO:	05:05:20 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:05:20 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:05:20 - docling.document_converter - Finished converting document file in 0.21 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:05:20 - docling_jobkit.convert.results - Processed 1 docs in 0.21 seconds.
INFO:	05:05:20 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job c0f2a389-f5a6-4f97-a530-dd583170fae1 in 0.21 seconds
INFO:	05:05:21 - uvicorn.access - 172.17.0.1:57136 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:05:21 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:05:21 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:05:21 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:05:21 - docling_serve.app - [TENANT_ID] Task 3072118e-ccf7-4114-bdc8-0d332d1e64ba created with tenant_id='default'
INFO:	05:05:21 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 3072118e-ccf7-4114-bdc8-0d332d1e64ba
INFO:	05:05:21 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:05:21 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash b3849eabdc7ecae5f3d54428a0162342
INFO:	05:05:21 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:05:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:05:21,538 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:05:21,538 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:05:21,584 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:05:21,584 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:05:21,637 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:05:21,638 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:05:21 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:05:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 475/770 [00:00<00:00, 4745.28it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4828.66it/s]
INFO:	05:05:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:05:22 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:05:22 - docling.document_converter - Going to convert document batch...
INFO:	05:05:22 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:05:22 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:05:22 - docling.document_converter - Finished converting document file in 0.37 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:05:22 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	05:05:22 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 3072118e-ccf7-4114-bdc8-0d332d1e64ba in 0.39 seconds
INFO:	05:05:23 - uvicorn.access - 172.17.0.1:57136 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:05:23 - uvicorn.access - 172.17.0.1:57136 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:05:23 - uvicorn.access - 172.17.0.1:57136 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.28.0

<details id="v1.28.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.28.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:	05:03:21 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:03:21 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:03:21 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	05:03:22 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	05:03:22 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:03:22 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:03:22 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/healthz$,/readyz$,/metrics$,/livez$,/ready$,/health$)
INFO:	05:03:22 - uvicorn.error - Started server process [1]
INFO:	05:03:22 - uvicorn.error - Waiting for application startup.
INFO:	05:03:25 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:03:25 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:03:25 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:03:25 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:03:25 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:03:25 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	05:03:25 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:03:25 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	05:03:25 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-10 05:03:25.993341799 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:03:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:03:26,264 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:03:26,266 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:03:26,325 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:03:26,326 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:03:26,375 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:03:26,375 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:03:26 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:03:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 500/770 [00:00<00:00, 4979.19it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4903.98it/s]
INFO:	05:03:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:03:27 - uvicorn.error - Application startup complete.
INFO:	05:03:27 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:03:28 - docling_serve.app - Health check requested
INFO:	05:03:28 - uvicorn.access - 172.17.0.1:42920 - "GET /health HTTP/1.1" 200
INFO:	05:03:28 - docling_serve.app - Health check requested
INFO:	05:03:28 - uvicorn.access - 172.17.0.1:42928 - "GET /health HTTP/1.1" 200
INFO:	05:03:28 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:03:28 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:03:28 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:03:28 - docling_serve.app - [TENANT_ID] Task 61b8de55-eaff-4536-a9d2-1ecae326737c created with tenant_id='default'
INFO:	05:03:28 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 61b8de55-eaff-4536-a9d2-1ecae326737c
INFO:	05:03:28 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:03:28 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	05:03:28 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:03:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:03:28,353 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:03:28,354 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:03:28,407 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:03:28,408 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:03:28,469 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:03:28,470 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:03:28 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:03:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 501/770 [00:00<00:00, 4981.52it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5030.58it/s]
INFO:	05:03:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:03:29 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:03:29 - docling.document_converter - Going to convert document batch...
INFO:	05:03:29 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:03:29 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:03:29 - docling.document_converter - Finished converting document file in 0.39 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	05:03:30 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:03:30 - docling_jobkit.convert.results - Processed 1 docs in 0.44 seconds.
INFO:	05:03:30 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 61b8de55-eaff-4536-a9d2-1ecae326737c in 0.44 seconds
INFO:	05:03:30 - uvicorn.access - 172.17.0.1:42928 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:03:30 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:03:30 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:03:30 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:03:30 - docling_serve.app - [TENANT_ID] Task 62177a87-b74c-4e43-9252-6c8c0f94a214 created with tenant_id='default'
INFO:	05:03:30 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 62177a87-b74c-4e43-9252-6c8c0f94a214
INFO:	05:03:30 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:03:30 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	05:03:30 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:03:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:03:30,382 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:03:30,382 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:03:30,441 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:03:30,441 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:03:30,492 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:03:30,492 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:03:30 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:03:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████▏   | 472/770 [00:00<00:00, 4693.86it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4826.95it/s]
INFO:	05:03:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:03:31 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:03:31 - docling.document_converter - Going to convert document batch...
INFO:	05:03:31 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:03:31 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:03:31 - docling.document_converter - Finished converting document file in 0.39 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:03:31 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	05:03:31 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 62177a87-b74c-4e43-9252-6c8c0f94a214 in 0.39 seconds
INFO:	05:03:32 - uvicorn.access - 172.17.0.1:42928 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:03:32 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:03:32 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:03:32 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:03:32 - docling_serve.app - [TENANT_ID] Task a9391271-7fc7-46e0-93a1-6a22803570d5 created with tenant_id='default'
INFO:	05:03:32 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task a9391271-7fc7-46e0-93a1-6a22803570d5
INFO:	05:03:32 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:03:32 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	05:03:32 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:03:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:03:32,385 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:03:32,385 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:03:32,439 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:03:32,439 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:03:32,508 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:03:32,509 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:03:32 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:03:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 466/770 [00:00<00:00, 4656.61it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4759.39it/s]
INFO:	05:03:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:03:33 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:03:33 - docling.document_converter - Going to convert document batch...
INFO:	05:03:33 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:03:33 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:03:33 - docling.document_converter - Finished converting document file in 0.45 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:03:33 - docling_jobkit.convert.results - Processed 1 docs in 0.47 seconds.
INFO:	05:03:33 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job a9391271-7fc7-46e0-93a1-6a22803570d5 in 0.47 seconds
INFO:	05:03:34 - uvicorn.access - 172.17.0.1:42928 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:03:34 - uvicorn.access - 172.17.0.1:42928 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:03:34 - uvicorn.access - 172.17.0.1:42928 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.27.0

<details id="v1.27.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.27.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:	05:01:37 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:01:37 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:01:37 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:01:37 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:01:37 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/healthz$,/health$,/readyz$,/livez$,/metrics$,/ready$)
INFO:	05:01:37 - uvicorn.error - Started server process [1]
INFO:	05:01:37 - uvicorn.error - Waiting for application startup.
INFO:	05:01:41 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:01:41 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:01:41 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:01:41 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:01:41 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:01:41 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	05:01:41 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:01:41 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	05:01:41 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-10 05:01:41.681574334 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:01:41 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:01:41,948 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:01:41,950 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:01:42,009 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:01:42,009 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:01:42,058 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:01:42,058 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:01:42 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:01:42 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 479/770 [00:00<00:00, 4781.90it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4802.38it/s]
INFO:	05:01:42 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:01:42 - uvicorn.error - Application startup complete.
INFO:	05:01:42 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:01:43 - docling_serve.app - Health check requested
INFO:	05:01:43 - uvicorn.access - 172.17.0.1:57592 - "GET /health HTTP/1.1" 200
INFO:	05:01:43 - docling_serve.app - Health check requested
INFO:	05:01:43 - uvicorn.access - 172.17.0.1:57608 - "GET /health HTTP/1.1" 200
INFO:	05:01:43 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:01:43 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:01:43 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:01:43 - docling_serve.app - [TENANT_ID] Task 56d8c661-99da-4641-90e2-e6c66ba6f61a created with tenant_id='default'
INFO:	05:01:43 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 56d8c661-99da-4641-90e2-e6c66ba6f61a
INFO:	05:01:43 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:01:44 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	05:01:44 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:01:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:01:44,075 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:01:44,075 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:01:44,131 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:01:44,131 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:01:44,183 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:01:44,183 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:01:44 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:01:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 485/770 [00:00<00:00, 4846.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4893.97it/s]
INFO:	05:01:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:01:45 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:01:45 - docling.document_converter - Going to convert document batch...
INFO:	05:01:45 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:01:45 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:01:45 - docling.document_converter - Finished converting document file in 0.41 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	05:01:45 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:01:45 - docling_jobkit.convert.results - Processed 1 docs in 0.46 seconds.
INFO:	05:01:45 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 56d8c661-99da-4641-90e2-e6c66ba6f61a in 0.46 seconds
INFO:	05:01:45 - uvicorn.access - 172.17.0.1:57608 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:01:45 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:01:45 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:01:45 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:01:45 - docling_serve.app - [TENANT_ID] Task a3b81865-5b5a-48bf-8bd7-99b1a67b3363 created with tenant_id='default'
INFO:	05:01:45 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task a3b81865-5b5a-48bf-8bd7-99b1a67b3363
INFO:	05:01:45 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:01:46 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	05:01:46 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:01:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:01:46,089 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:01:46,090 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:01:46,137 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:01:46,137 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:01:46,219 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:01:46,219 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:01:46 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:01:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 506/770 [00:00<00:00, 5057.38it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5105.28it/s]
INFO:	05:01:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:01:47 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:01:47 - docling.document_converter - Going to convert document batch...
INFO:	05:01:47 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:01:47 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:01:47 - docling.document_converter - Finished converting document file in 0.38 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:01:47 - docling_jobkit.convert.results - Processed 1 docs in 0.38 seconds.
INFO:	05:01:47 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job a3b81865-5b5a-48bf-8bd7-99b1a67b3363 in 0.38 seconds
INFO:	05:01:47 - uvicorn.access - 172.17.0.1:57608 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:01:47 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:01:47 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:01:47 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:01:47 - docling_serve.app - [TENANT_ID] Task c9177aac-ae58-4a78-a341-6797b9a5bf0a created with tenant_id='default'
INFO:	05:01:47 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task c9177aac-ae58-4a78-a341-6797b9a5bf0a
INFO:	05:01:47 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:01:48 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	05:01:48 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:01:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:01:48,103 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:01:48,103 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-10 05:01:48,155 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:01:48,155 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:01:48,204 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:01:48,204 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:01:48 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:01:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▎   | 489/770 [00:00<00:00, 4866.88it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4800.39it/s]
INFO:	05:01:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:01:49 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:01:49 - docling.document_converter - Going to convert document batch...
INFO:	05:01:49 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:01:49 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:01:49 - docling.document_converter - Finished converting document file in 0.40 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:01:49 - docling_jobkit.convert.results - Processed 1 docs in 0.42 seconds.
INFO:	05:01:49 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job c9177aac-ae58-4a78-a341-6797b9a5bf0a in 0.42 seconds
INFO:	05:01:49 - uvicorn.access - 172.17.0.1:57608 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:01:50 - uvicorn.access - 172.17.0.1:57608 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:01:50 - uvicorn.access - 172.17.0.1:57608 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.26.0

<details id="v1.26.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.26.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:	04:59:55 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:59:55 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:59:55 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:59:55 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:59:55 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/readyz$,/livez$,/metrics$,/healthz$,/health$)
INFO:	04:59:55 - uvicorn.error - Started server process [1]
INFO:	04:59:55 - uvicorn.error - Waiting for application startup.
INFO:	04:59:59 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:59:59 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:59:59 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:59:59 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:59:59 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:59:59 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c4d6547d10e26a777a530d63ca01a1a1
INFO:	04:59:59 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:59:59 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:59:59 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-10 04:59:59.609208829 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:00:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:00:00,104 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:00:00,106 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 05:00:00,204 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:00:00,204 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:00:00,253 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:00:00,254 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:00:00 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:00:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 476/770 [00:00<00:00, 4748.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4742.40it/s]
INFO:	05:00:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:00:01 - uvicorn.error - Application startup complete.
INFO:	05:00:01 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:00:01 - docling_serve.app - Health check requested
INFO:	05:00:01 - uvicorn.access - 172.17.0.1:48238 - "GET /health HTTP/1.1" 200
INFO:	05:00:01 - docling_serve.app - Health check requested
INFO:	05:00:01 - uvicorn.access - 172.17.0.1:48242 - "GET /health HTTP/1.1" 200
INFO:	05:00:01 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:00:01 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:00:01 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:00:01 - docling_serve.app - [TENANT_ID] Task aab5452e-10e5-48b6-9d31-a90e0414b142 created with tenant_id='default'
INFO:	05:00:01 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task aab5452e-10e5-48b6-9d31-a90e0414b142
INFO:	05:00:01 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:00:01 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	05:00:01 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:00:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:00:01,989 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:00:01,989 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 05:00:02,080 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:00:02,081 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:00:02,131 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:00:02,131 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:00:02 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:00:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 466/770 [00:00<00:00, 4655.96it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4648.58it/s]
INFO:	05:00:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:00:03 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:00:03 - docling.document_converter - Going to convert document batch...
INFO:	05:00:03 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:00:03 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:00:03 - docling.document_converter - Finished converting document file in 0.53 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	05:00:03 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:00:03 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	05:00:03 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job aab5452e-10e5-48b6-9d31-a90e0414b142 in 0.58 seconds
INFO:	05:00:03 - uvicorn.access - 172.17.0.1:48242 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:00:03 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:00:03 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:00:03 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:00:03 - docling_serve.app - [TENANT_ID] Task 6ac2248c-1370-43d9-b1fe-ba2bf7fa5213 created with tenant_id='default'
INFO:	05:00:03 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 6ac2248c-1370-43d9-b1fe-ba2bf7fa5213
INFO:	05:00:03 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:00:03 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	05:00:03 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:00:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:00:04,006 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:00:04,007 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 05:00:04,105 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:00:04,106 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:00:04,154 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:00:04,154 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:00:04 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:00:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 494/770 [00:00<00:00, 4931.74it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4894.52it/s]
INFO:	05:00:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:00:05 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:00:05 - docling.document_converter - Going to convert document batch...
INFO:	05:00:05 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:00:05 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:00:05 - docling.document_converter - Finished converting document file in 0.37 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:00:05 - docling_jobkit.convert.results - Processed 1 docs in 0.37 seconds.
INFO:	05:00:05 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 6ac2248c-1370-43d9-b1fe-ba2bf7fa5213 in 0.37 seconds
INFO:	05:00:05 - uvicorn.access - 172.17.0.1:48242 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:00:05 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:00:05 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:00:05 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:00:05 - docling_serve.app - [TENANT_ID] Task 16e8869d-0619-44be-864a-77f5562eb589 created with tenant_id='default'
INFO:	05:00:05 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 16e8869d-0619-44be-864a-77f5562eb589
INFO:	05:00:05 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:00:05 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 63e8839d1103b03d45382915dba33c89
INFO:	05:00:05 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:00:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 05:00:06,025 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:00:06,026 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 05:00:06,117 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:00:06,118 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 05:00:06,166 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-10 05:00:06,167 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:00:06 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:00:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 466/770 [00:00<00:00, 4649.44it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4810.93it/s]
INFO:	05:00:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:00:07 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:00:07 - docling.document_converter - Going to convert document batch...
INFO:	05:00:07 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:00:07 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:00:07 - docling.document_converter - Finished converting document file in 0.36 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:00:07 - docling_jobkit.convert.results - Processed 1 docs in 0.38 seconds.
INFO:	05:00:07 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 16e8869d-0619-44be-864a-77f5562eb589 in 0.38 seconds
INFO:	05:00:07 - uvicorn.access - 172.17.0.1:48242 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:00:08 - uvicorn.access - 172.17.0.1:48242 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:00:08 - uvicorn.access - 172.17.0.1:48242 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.25.0

<details id="v1.25.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.25.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:	04:58:11 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:58:11 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:58:11 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:58:11 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:58:11 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/livez$,/healthz$,/readyz$,/metrics$,/ready$)
INFO:	04:58:11 - uvicorn.error - Started server process [1]
INFO:	04:58:11 - uvicorn.error - Waiting for application startup.
INFO:	04:58:14 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:58:14 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:58:14 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:58:14 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:58:14 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:58:14 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash f446dcc5a1a7c6aff458e30cab474a9e
INFO:	04:58:15 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:58:15 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-10 04:58:15.079732377 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:58:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:58:15,390 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:58:15,392 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:58:15,485 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:58:15,485 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:58:15,532 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:58:15,532 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:58:15 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:58:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 508/770 [00:00<00:00, 5077.84it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4997.54it/s]
INFO:	04:58:16 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:58:16 - uvicorn.error - Application startup complete.
INFO:	04:58:16 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:58:17 - docling_serve.app - Health check requested
INFO:	04:58:17 - uvicorn.access - 172.17.0.1:35190 - "GET /health HTTP/1.1" 200
INFO:	04:58:17 - docling_serve.app - Health check requested
INFO:	04:58:17 - uvicorn.access - 172.17.0.1:35198 - "GET /health HTTP/1.1" 200
INFO:	04:58:17 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:58:17 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:58:17 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:58:17 - docling_serve.app - [TENANT_ID] Task 8547fb06-e25a-4e7c-8366-20d36e9f71cb created with tenant_id='default'
INFO:	04:58:17 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8547fb06-e25a-4e7c-8366-20d36e9f71cb
INFO:	04:58:17 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:58:17 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	04:58:17 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:58:17,291 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:58:17,291 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:58:17,406 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:58:17,407 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:58:17,453 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:58:17,454 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:58:17 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:58:17 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 496/770 [00:00<00:00, 4940.57it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4884.84it/s]
INFO:	04:58:17 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:58:18 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:58:18 - docling.document_converter - Going to convert document batch...
INFO:	04:58:18 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:58:18 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:58:18 - docling.document_converter - Finished converting document file in 0.40 sec.
WARNING:	04:58:18 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:58:18 - docling_jobkit.convert.results - Processed 1 docs in 0.43 seconds.
INFO:	04:58:18 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8547fb06-e25a-4e7c-8366-20d36e9f71cb in 0.43 seconds
INFO:	04:58:19 - uvicorn.access - 172.17.0.1:35198 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:58:19 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:58:19 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:58:19 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:58:19 - docling_serve.app - [TENANT_ID] Task 5bae2f7d-a19a-42bb-9c8a-a39dbcd48ddf created with tenant_id='default'
INFO:	04:58:19 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 5bae2f7d-a19a-42bb-9c8a-a39dbcd48ddf
INFO:	04:58:19 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:58:19 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	04:58:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:58:19,316 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:58:19,317 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:58:19,429 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:58:19,429 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:58:19,493 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:58:19,493 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:58:19 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:58:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 507/770 [00:00<00:00, 4965.99it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4908.65it/s]
INFO:	04:58:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:58:20 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:58:20 - docling.document_converter - Going to convert document batch...
INFO:	04:58:20 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:58:20 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:58:20 - docling.document_converter - Finished converting document file in 0.38 sec.
INFO:	04:58:20 - docling_jobkit.convert.results - Processed 1 docs in 0.38 seconds.
INFO:	04:58:20 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 5bae2f7d-a19a-42bb-9c8a-a39dbcd48ddf in 0.38 seconds
INFO:	04:58:21 - uvicorn.access - 172.17.0.1:35198 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:58:21 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:58:21 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:58:21 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:58:21 - docling_serve.app - [TENANT_ID] Task b6863976-0111-43eb-aeac-88ccf9c1f7b1 created with tenant_id='default'
INFO:	04:58:21 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task b6863976-0111-43eb-aeac-88ccf9c1f7b1
INFO:	04:58:21 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:58:21 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e50b6140ec7ee9be0d0fea6ba20c9795
INFO:	04:58:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:58:21,321 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:58:21,321 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:58:21,412 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:58:21,412 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:58:21,459 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:58:21,459 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:58:21 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:58:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 485/770 [00:00<00:00, 4847.37it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4859.32it/s]
INFO:	04:58:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:58:22 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:58:22 - docling.document_converter - Going to convert document batch...
INFO:	04:58:22 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:58:22 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:58:22 - docling.document_converter - Finished converting document file in 0.58 sec.
INFO:	04:58:22 - docling_jobkit.convert.results - Processed 1 docs in 0.60 seconds.
INFO:	04:58:22 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job b6863976-0111-43eb-aeac-88ccf9c1f7b1 in 0.60 seconds
INFO:	04:58:23 - uvicorn.access - 172.17.0.1:35198 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:58:23 - uvicorn.access - 172.17.0.1:35198 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:58:23 - uvicorn.access - 172.17.0.1:35198 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.24.0

<details id="v1.24.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.24.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:	04:56:32 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:56:32 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:56:32 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:56:32 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:56:32 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/ready$,/livez$,/metrics$,/readyz$,/healthz$)
INFO:	04:56:32 - uvicorn.error - Started server process [1]
INFO:	04:56:32 - uvicorn.error - Waiting for application startup.
INFO:	04:56:36 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:56:36 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:56:36 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:56:36 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:56:36 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:56:36 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	04:56:36 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:56:36 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-10 04:56:36.287603766 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:56:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:56:36,596 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:56:36,597 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:56:36,693 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:56:36,693 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:56:36,741 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:56:36,741 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:56:36 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:56:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 505/770 [00:00<00:00, 4991.41it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5093.36it/s]
INFO:	04:56:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:56:37 - uvicorn.error - Application startup complete.
INFO:	04:56:37 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:56:37 - docling_serve.app - Health check requested
INFO:	04:56:37 - uvicorn.access - 172.17.0.1:45330 - "GET /health HTTP/1.1" 200
INFO:	04:56:37 - docling_serve.app - Health check requested
INFO:	04:56:37 - uvicorn.access - 172.17.0.1:45332 - "GET /health HTTP/1.1" 200
INFO:	04:56:37 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:56:37 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:56:37 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:56:37 - docling_serve.app - [TENANT_ID] Task d9a1c869-d904-4b6d-ad0e-b4100a026c83 created with tenant_id='default'
INFO:	04:56:37 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task d9a1c869-d904-4b6d-ad0e-b4100a026c83
INFO:	04:56:37 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:56:37 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:56:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:56:37,899 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:56:37,899 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:56:38,006 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:56:38,006 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:56:38,053 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:56:38,054 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:56:38 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:56:38 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 497/770 [00:00<00:00, 4954.09it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4909.41it/s]
INFO:	04:56:38 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:56:39 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:56:39 - docling.document_converter - Going to convert document batch...
INFO:	04:56:39 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:56:39 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:56:39 - docling.document_converter - Finished converting document file in 0.38 sec.
WARNING:	04:56:39 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:56:39 - docling_jobkit.convert.results - Processed 1 docs in 0.41 seconds.
INFO:	04:56:39 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job d9a1c869-d904-4b6d-ad0e-b4100a026c83 in 0.41 seconds
INFO:	04:56:39 - uvicorn.access - 172.17.0.1:45332 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:56:39 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:56:39 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:56:39 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:56:39 - docling_serve.app - [TENANT_ID] Task 8e14946e-c1c1-4085-8877-fdf3c25ac0ee created with tenant_id='default'
INFO:	04:56:39 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 8e14946e-c1c1-4085-8877-fdf3c25ac0ee
INFO:	04:56:39 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:56:39 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:56:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:56:39,918 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:56:39,918 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:56:40,018 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:56:40,019 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:56:40,067 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:56:40,067 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:56:40 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:56:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 526/770 [00:00<00:00, 5233.44it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5188.83it/s]
INFO:	04:56:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:56:41 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:56:41 - docling.document_converter - Going to convert document batch...
INFO:	04:56:41 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:56:41 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:56:41 - docling.document_converter - Finished converting document file in 0.49 sec.
INFO:	04:56:41 - docling_jobkit.convert.results - Processed 1 docs in 0.49 seconds.
INFO:	04:56:41 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 8e14946e-c1c1-4085-8877-fdf3c25ac0ee in 0.49 seconds
INFO:	04:56:41 - uvicorn.access - 172.17.0.1:45332 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:56:41 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:56:41 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:56:41 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:56:41 - docling_serve.app - [TENANT_ID] Task c450ab20-1e91-4222-963b-b5ff199595a1 created with tenant_id='default'
INFO:	04:56:41 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task c450ab20-1e91-4222-963b-b5ff199595a1
INFO:	04:56:41 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:56:41 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	04:56:41 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:56:41,935 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:56:41,935 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:56:42,029 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:56:42,029 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:56:42,079 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:56:42,079 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:56:42 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:56:42 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 488/770 [00:00<00:00, 4861.59it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4972.76it/s]
INFO:	04:56:42 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:56:43 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:56:43 - docling.document_converter - Going to convert document batch...
INFO:	04:56:43 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:56:43 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:56:43 - docling.document_converter - Finished converting document file in 0.36 sec.
INFO:	04:56:43 - docling_jobkit.convert.results - Processed 1 docs in 0.37 seconds.
INFO:	04:56:43 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job c450ab20-1e91-4222-963b-b5ff199595a1 in 0.37 seconds
INFO:	04:56:43 - uvicorn.access - 172.17.0.1:45332 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:56:44 - uvicorn.access - 172.17.0.1:45332 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:56:44 - uvicorn.access - 172.17.0.1:45332 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.23.0

<details id="v1.23.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.23.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:	04:54:50 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:54:50 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:54:50 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:54:50 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:54:50 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/readyz$,/ready$,/metrics$,/health$,/healthz$)
INFO:	04:54:50 - uvicorn.error - Started server process [1]
INFO:	04:54:50 - uvicorn.error - Waiting for application startup.
INFO:	04:54:54 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:54:54 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:54:54 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:54:54 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:54:54 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:54:54 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	04:54:54 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:54:54 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-10 04:54:54.932666000 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:54:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:54:55,314 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:54:55,316 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:54:55,427 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:54:55,428 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:54:55,478 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:54:55,478 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:54:55 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:54:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 485/770 [00:00<00:00, 4844.17it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4744.87it/s]
INFO:	04:54:56 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:54:56 - uvicorn.error - Application startup complete.
INFO:	04:54:56 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:54:56 - docling_serve.app - Health check requested
INFO:	04:54:56 - uvicorn.access - 172.17.0.1:34308 - "GET /health HTTP/1.1" 200
INFO:	04:54:56 - docling_serve.app - Health check requested
INFO:	04:54:56 - uvicorn.access - 172.17.0.1:34318 - "GET /health HTTP/1.1" 200
INFO:	04:54:56 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:54:56 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:54:56 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:54:56 - docling_serve.app - [TENANT_ID] Task a9d80ce5-0e8b-4003-b3a2-64ae7a1f8f25 created with tenant_id='default'
INFO:	04:54:56 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task a9d80ce5-0e8b-4003-b3a2-64ae7a1f8f25
INFO:	04:54:56 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:54:56 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:54:56 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:54:56,616 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:54:56,616 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:54:56,715 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:54:56,716 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:54:56,765 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:54:56,765 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:54:56 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:54:56 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 477/770 [00:00<00:00, 4752.13it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4852.01it/s]
INFO:	04:54:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:54:57 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:54:57 - docling.document_converter - Going to convert document batch...
INFO:	04:54:57 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:54:57 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:54:57 - docling.document_converter - Finished converting document file in 0.39 sec.
WARNING:	04:54:58 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:54:58 - docling_jobkit.convert.results - Processed 1 docs in 0.43 seconds.
INFO:	04:54:58 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job a9d80ce5-0e8b-4003-b3a2-64ae7a1f8f25 in 0.43 seconds
INFO:	04:54:58 - uvicorn.access - 172.17.0.1:34318 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:54:58 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:54:58 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:54:58 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:54:58 - docling_serve.app - [TENANT_ID] Task 0cdbd738-2b7a-4760-9805-da4ff23d67ed created with tenant_id='default'
INFO:	04:54:58 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 0cdbd738-2b7a-4760-9805-da4ff23d67ed
INFO:	04:54:58 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:54:58 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:54:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:54:58,636 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:54:58,636 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:54:58,731 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:54:58,732 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:54:58,782 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:54:58,782 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:54:58 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:54:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|█████▉    | 460/770 [00:00<00:00, 4574.73it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4688.15it/s]
INFO:	04:54:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:55:00 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:55:00 - docling.document_converter - Going to convert document batch...
INFO:	04:55:00 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:55:00 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:55:00 - docling.document_converter - Finished converting document file in 0.37 sec.
INFO:	04:55:00 - docling_jobkit.convert.results - Processed 1 docs in 0.37 seconds.
INFO:	04:55:00 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 0cdbd738-2b7a-4760-9805-da4ff23d67ed in 0.37 seconds
INFO:	04:55:00 - uvicorn.access - 172.17.0.1:34318 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:55:00 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:55:00 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:55:00 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:55:00 - docling_serve.app - [TENANT_ID] Task 58f2c43e-64e6-4beb-8123-771b2586498a created with tenant_id='default'
INFO:	04:55:00 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 58f2c43e-64e6-4beb-8123-771b2586498a
INFO:	04:55:00 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:55:00 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	04:55:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:55:00,660 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:55:00,660 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:55:00,755 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:55:00,755 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:55:00,805 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:55:00,805 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:55:00 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:55:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 487/770 [00:00<00:00, 4859.06it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4900.10it/s]
INFO:	04:55:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:55:01 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:55:01 - docling.document_converter - Going to convert document batch...
INFO:	04:55:01 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:55:01 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:55:01 - docling.document_converter - Finished converting document file in 0.07 sec.
INFO:	04:55:01 - docling_jobkit.convert.results - Processed 1 docs in 0.10 seconds.
INFO:	04:55:01 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 58f2c43e-64e6-4beb-8123-771b2586498a in 0.10 seconds
INFO:	04:55:02 - uvicorn.access - 172.17.0.1:34318 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:55:02 - uvicorn.access - 172.17.0.1:34318 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:55:02 - uvicorn.access - 172.17.0.1:34318 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.22.1

<details id="v1.22.1-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.22.1 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:	04:53:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:53:01 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:53:01 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:53:01 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:53:01 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/metrics$,/health$,/healthz$,/ready$,/livez$)
INFO:	04:53:01 - uvicorn.error - Started server process [1]
INFO:	04:53:01 - uvicorn.error - Waiting for application startup.
INFO:	04:53:04 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:53:04 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:53:04 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:53:04 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:53:04 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:53:04 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	04:53:04 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:53:04 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-10 04:53:04.958687773 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:53:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:53:05,256 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:53:05,258 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:53:05,359 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:53:05,359 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:53:05,406 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:53:05,406 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:53:05 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:53:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 502/770 [00:00<00:00, 4966.52it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4888.41it/s]
INFO:	04:53:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:53:06 - uvicorn.error - Application startup complete.
INFO:	04:53:06 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:53:06 - docling_serve.app - Health check requested
INFO:	04:53:06 - uvicorn.access - 172.17.0.1:33882 - "GET /health HTTP/1.1" 200
INFO:	04:53:06 - docling_serve.app - Health check requested
INFO:	04:53:06 - uvicorn.access - 172.17.0.1:33894 - "GET /health HTTP/1.1" 200
INFO:	04:53:06 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:53:06 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:53:06 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:53:06 - docling_serve.app - [TENANT_ID] Task be50600e-a233-4e84-b859-01132b5e1473 created with tenant_id='default'
INFO:	04:53:06 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task be50600e-a233-4e84-b859-01132b5e1473
INFO:	04:53:06 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:53:07 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	04:53:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:53:07,030 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:53:07,030 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:53:07,124 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:53:07,125 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:53:07,173 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:53:07,173 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:53:07 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:53:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 512/770 [00:00<00:00, 5116.95it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5062.79it/s]
INFO:	04:53:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:53:08 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:53:08 - docling.document_converter - Going to convert document batch...
INFO:	04:53:08 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:53:08 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:53:08 - docling.document_converter - Finished converting document file in 0.38 sec.
WARNING:	04:53:08 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:53:08 - docling_jobkit.convert.results - Processed 1 docs in 0.42 seconds.
INFO:	04:53:08 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job be50600e-a233-4e84-b859-01132b5e1473 in 0.42 seconds
INFO:	04:53:08 - uvicorn.access - 172.17.0.1:33894 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:53:08 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:53:08 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:53:08 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:53:08 - docling_serve.app - [TENANT_ID] Task e1087234-67f1-413e-912e-4d3ae50e2f6e created with tenant_id='default'
INFO:	04:53:08 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task e1087234-67f1-413e-912e-4d3ae50e2f6e
INFO:	04:53:08 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:53:09 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	04:53:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:53:09,060 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:53:09,060 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:53:09,173 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:53:09,173 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:53:09,223 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:53:09,223 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:53:09 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:53:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 487/770 [00:00<00:00, 4844.57it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4787.39it/s]
INFO:	04:53:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:53:10 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:53:10 - docling.document_converter - Going to convert document batch...
INFO:	04:53:10 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:53:10 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:53:10 - docling.document_converter - Finished converting document file in 0.37 sec.
INFO:	04:53:10 - docling_jobkit.convert.results - Processed 1 docs in 0.38 seconds.
INFO:	04:53:10 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job e1087234-67f1-413e-912e-4d3ae50e2f6e in 0.38 seconds
INFO:	04:53:10 - uvicorn.access - 172.17.0.1:33894 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:53:11 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:53:11 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:53:11 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:53:11 - docling_serve.app - [TENANT_ID] Task 4d5a25c8-c448-46e6-a48d-330997b7e655 created with tenant_id='default'
INFO:	04:53:11 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 4d5a25c8-c448-46e6-a48d-330997b7e655
INFO:	04:53:11 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:53:11 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash fb1751b09de6bdbe35ede48676ca8f82
INFO:	04:53:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:53:11,074 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:53:11,074 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:53:11,171 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:53:11,171 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:53:11,220 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:53:11,220 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:53:11 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:53:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 484/770 [00:00<00:00, 4833.79it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4793.61it/s]
INFO:	04:53:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:53:12 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:53:12 - docling.document_converter - Going to convert document batch...
INFO:	04:53:12 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:53:12 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:53:12 - docling.document_converter - Finished converting document file in 0.08 sec.
INFO:	04:53:12 - docling_jobkit.convert.results - Processed 1 docs in 0.10 seconds.
INFO:	04:53:12 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 4d5a25c8-c448-46e6-a48d-330997b7e655 in 0.10 seconds
INFO:	04:53:13 - uvicorn.access - 172.17.0.1:33894 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:53:13 - uvicorn.access - 172.17.0.1:33894 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:53:13 - uvicorn.access - 172.17.0.1:33894 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.22.0

<details id="v1.22.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.22.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:	04:51:38 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:51:38 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:51:38 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:51:38 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:51:38 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/metrics$,/healthz$,/livez$,/health$,/readyz$)
INFO:	04:51:38 - uvicorn.error - Started server process [1]
INFO:	04:51:38 - uvicorn.error - Waiting for application startup.
INFO:	04:51:42 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:51:42 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:51:42 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:51:42 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:51:42 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:51:42 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash bcb2e23b24bd94a42b5c00d662a7c1cf
INFO:	04:51:42 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:51:42 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-10 04:51:42.453442118 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:51:42 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:51:42,754 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:51:42,755 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:51:42,849 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:51:42,849 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:51:42,895 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:51:42,896 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:51:43 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:51:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 478/770 [00:00<00:00, 4778.43it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4942.35it/s]
INFO:	04:51:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:51:43 - uvicorn.error - Application startup complete.
INFO:	04:51:43 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:51:44 - docling_serve.app - Health check requested
INFO:	04:51:44 - uvicorn.access - 172.17.0.1:37770 - "GET /health HTTP/1.1" 200
INFO:	04:51:44 - docling_serve.app - Health check requested
INFO:	04:51:44 - uvicorn.access - 172.17.0.1:37782 - "GET /health HTTP/1.1" 200
INFO:	04:51:44 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:51:44 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:51:44 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:51:44 - docling_serve.app - [TENANT_ID] Task 8ea94f5f-7ca3-431a-bfce-c509842d4729 created with tenant_id='default'
INFO:	04:51:44 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8ea94f5f-7ca3-431a-bfce-c509842d4729
INFO:	04:51:44 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:51:44 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	04:51:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:51:44,331 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:51:44,332 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:51:44,428 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:51:44,428 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:51:44,475 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:51:44,475 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:51:44 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:51:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 498/770 [00:00<00:00, 4924.41it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5020.68it/s]
INFO:	04:51:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:51:45 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:51:45 - docling.document_converter - Going to convert document batch...
INFO:	04:51:45 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:51:45 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:51:45 - docling.document_converter - Finished converting document file in 0.42 sec.
WARNING:	04:51:45 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:51:45 - docling_jobkit.convert.results - Processed 1 docs in 0.45 seconds.
INFO:	04:51:45 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8ea94f5f-7ca3-431a-bfce-c509842d4729 in 0.45 seconds
INFO:	04:51:46 - uvicorn.access - 172.17.0.1:37782 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:51:46 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:51:46 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:51:46 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:51:46 - docling_serve.app - [TENANT_ID] Task 31b66535-e601-4bbe-8745-7539cdcd0aa2 created with tenant_id='default'
INFO:	04:51:46 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 31b66535-e601-4bbe-8745-7539cdcd0aa2
INFO:	04:51:46 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:51:46 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	04:51:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:51:46,354 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:51:46,354 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:51:46,454 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:51:46,454 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:51:46,501 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:51:46,501 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:51:46 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:51:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 488/770 [00:00<00:00, 4845.75it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4823.35it/s]
INFO:	04:51:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:51:47 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:51:47 - docling.document_converter - Going to convert document batch...
INFO:	04:51:47 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:51:47 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:51:47 - docling.document_converter - Finished converting document file in 0.39 sec.
INFO:	04:51:47 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	04:51:47 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 31b66535-e601-4bbe-8745-7539cdcd0aa2 in 0.39 seconds
INFO:	04:51:48 - uvicorn.access - 172.17.0.1:37782 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:51:48 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:51:48 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:51:48 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:51:48 - docling_serve.app - [TENANT_ID] Task 7411da47-4bf1-4a93-90c1-342362742ad3 created with tenant_id='default'
INFO:	04:51:48 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 7411da47-4bf1-4a93-90c1-342362742ad3
INFO:	04:51:48 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:51:48 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 3eabf304acb4a56e9ef52b02ef69bccb
INFO:	04:51:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-10 04:51:48,360 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:51:48,361 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:51:48,450 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:51:48,450 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:51:48,498 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:51:48,498 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:51:48 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:51:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 493/770 [00:00<00:00, 4929.80it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5164.10it/s]
INFO:	04:51:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:51:49 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:51:49 - docling.document_converter - Going to convert document batch...
INFO:	04:51:49 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:51:49 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:51:49 - docling.document_converter - Finished converting document file in 0.31 sec.
INFO:	04:51:49 - docling_jobkit.convert.results - Processed 1 docs in 0.35 seconds.
INFO:	04:51:49 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 7411da47-4bf1-4a93-90c1-342362742ad3 in 0.35 seconds
INFO:	04:51:50 - uvicorn.access - 172.17.0.1:37782 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:51:50 - uvicorn.access - 172.17.0.1:37782 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:51:50 - uvicorn.access - 172.17.0.1:37782 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.21.0

<details id="v1.21.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.21.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
2026-08-10 04:49:52.908683265 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:49:53,218 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:49:53,220 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:49:53,336 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:49:53,336 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:49:53,406 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:49:53,407 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 469/770 [00:00<00:00, 4686.03it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4790.08it/s]
[INFO] 2026-08-10 04:49:54,896 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:49:54,896 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:49:55,016 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:49:55,016 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:49:55,065 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:49:55,066 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 504/770 [00:00<00:00, 5037.03it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4965.09it/s]
WARNING:	04:49:56 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
WARNING:	04:49:56 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
[INFO] 2026-08-10 04:49:56,907 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:49:56,907 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:49:57,011 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:49:57,011 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:49:57,060 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:49:57,060 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 514/770 [00:00<00:00, 5131.14it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5065.66it/s]
[INFO] 2026-08-10 04:49:58,912 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:49:58,912 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:49:59,002 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:49:59,003 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:49:59,064 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:49:59,064 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 499/770 [00:00<00:00, 4962.90it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5057.68it/s]

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.20.0

<details id="v1.20.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.20.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:48:31.052700431 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:48:31,357 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:48:31,359 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:48:31,456 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:48:31,457 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:48:31,503 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:48:31,504 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 513/770 [00:00<00:00, 5097.63it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5132.34it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54762 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54768 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:48:32,703 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:48:32,703 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:48:32,798 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:48:32,798 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:48:32,845 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:48:32,845 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 484/770 [00:00<00:00, 4799.87it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4568.49it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54768 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:48:34,747 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:48:34,748 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:48:34,867 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:48:34,868 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:48:34,917 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:48:34,917 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  56%|█████▋    | 434/770 [00:00<00:00, 4323.92it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4797.00it/s]
INFO:     172.17.0.1:54768 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:48:36,773 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:48:36,773 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:48:36,891 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:48:36,892 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:48:36,939 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:48:36,939 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 450/770 [00:00<00:00, 4457.94it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4391.94it/s]
INFO:     172.17.0.1:54768 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54768 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54768 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.19.0

<details id="v1.19.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.19.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:46:37.608868147 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:46:37,923 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:46:37,924 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:46:38,034 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:46:38,035 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:46:38,081 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:46:38,081 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 512/770 [00:00<00:00, 5106.78it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5070.79it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55406 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55422 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:46:39,450 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:46:39,450 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:46:39,555 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:46:39,555 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:46:39,607 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:46:39,607 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  56%|█████▋    | 435/770 [00:00<00:00, 4347.52it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4577.33it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55422 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:46:41,476 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:46:41,476 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:46:41,577 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:46:41,577 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:46:41,624 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:46:41,624 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 484/770 [00:00<00:00, 4829.49it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4926.80it/s]
INFO:     172.17.0.1:55422 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:46:43,486 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:46:43,487 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:46:43,583 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:46:43,583 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:46:43,630 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:46:43,630 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 515/770 [00:00<00:00, 5118.10it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5164.29it/s]
INFO:     172.17.0.1:55422 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55422 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55422 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.18.0

<details id="v1.18.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.18.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:45:21.308820296 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:45:21,695 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:45:21,696 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:45:21,829 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:45:21,829 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:45:21,881 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:45:21,881 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 498/770 [00:00<00:00, 4971.16it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4782.47it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:60622 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60638 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:45:23,952 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:45:23,952 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:45:24,056 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:45:24,057 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:45:24,110 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:45:24,110 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  55%|█████▌    | 426/770 [00:00<00:00, 4255.46it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4179.83it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60638 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:45:26,002 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:45:26,002 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:45:26,132 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:45:26,132 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:45:26,197 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:45:26,198 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 446/770 [00:00<00:00, 4429.17it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4707.08it/s]
INFO:     172.17.0.1:60638 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:45:28,010 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:45:28,010 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:45:28,147 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:45:28,148 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:45:28,254 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:45:28,254 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  52%|█████▏    | 402/770 [00:00<00:00, 4007.78it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4719.88it/s]
INFO:     172.17.0.1:60638 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60638 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60638 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.17.0

<details id="v1.17.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.17.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:43:16.902907082 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:43:17,414 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:43:17,416 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:43:17,504 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:43:17,504 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:43:17,548 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:43:17,549 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 510/770 [00:00<00:00, 5069.59it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5141.22it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58124 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58140 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:43:19,139 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:43:19,139 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:43:19,233 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:43:19,234 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:43:19,279 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:43:19,280 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 523/770 [00:00<00:00, 5223.78it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5233.36it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58140 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:43:21,179 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:43:21,179 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:43:21,279 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:43:21,279 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:43:21,323 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:43:21,324 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 483/770 [00:00<00:00, 4811.55it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4833.64it/s]
INFO:     172.17.0.1:58140 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:43:23,174 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:43:23,175 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-10 04:43:23,281 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:43:23,281 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-10 04:43:23,326 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:43:23,327 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 487/770 [00:00<00:00, 4867.52it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4984.93it/s]
INFO:     172.17.0.1:58140 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58140 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58140 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.16.1

<details id="v1.16.1-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.16.1 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:42:07.206877980 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:42:09,112 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:42:09,115 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:42:09,297 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:42:09,298 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:42:09,350 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:42:09,351 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  46%|████▌     | 356/770 [00:00<00:00, 3541.32it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4977.85it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:49206 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49216 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:42:11,903 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:42:11,903 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:42:12,039 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:42:12,039 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:42:12,104 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:42:12,104 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 454/770 [00:00<00:00, 4537.73it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4892.88it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49216 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:42:15,906 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:42:15,906 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:42:15,994 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:42:15,994 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:42:16,039 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:42:16,039 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  50%|████▉     | 384/770 [00:00<00:00, 3835.71it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4379.83it/s]
INFO:     172.17.0.1:49216 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-10 04:42:17,956 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:42:17,957 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:42:18,076 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:42:18,076 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:42:18,138 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:42:18,139 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 511/770 [00:00<00:00, 5072.21it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5240.29it/s]
INFO:     172.17.0.1:49216 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49216 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49216 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.15.0

<details id="v1.15.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.15.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:39:42.627513169 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:39:43,157 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:39:43,159 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:39:43,243 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:39:43,244 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:39:43,286 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:39:43,286 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46820 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46836 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46836 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46836 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46836 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46836 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46836 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.14.3

<details id="v1.14.3-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.14.3 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:37:38.010109570 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:37:38,518 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:37:38,519 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:37:38,610 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:37:38,611 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:37:38,657 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:37:38,657 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55090 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55102 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55102 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55102 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55102 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55102 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55102 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.14.2

<details id="v1.14.2-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.14.2 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:35:29.581838285 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:35:30,092 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:35:30,093 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:35:30,184 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:35:30,184 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:35:30,227 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:35:30,227 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:33594 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33604 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33604 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33604 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33604 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33604 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33604 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.14.1

<details id="v1.14.1-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.14.1 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:33:34.174713817 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:33:34,678 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:33:34,680 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:33:34,788 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:33:34,788 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:33:34,837 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:33:34,837 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:45508 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45518 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45518 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45518 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45518 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45518 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45518 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.14.0

<details id="v1.14.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.14.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:31:27.167362803 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:31:27,682 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:31:27,683 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:31:27,777 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:31:27,777 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:31:27,820 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:31:27,821 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:47884 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47896 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47896 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47896 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.13.1

<details id="v1.13.1-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.13.1 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:29:30.848043030 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:29:31,350 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:29:31,352 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:29:31,446 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:29:31,447 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:29:31,497 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:29:31,498 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39752 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39762 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39762 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39762 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39762 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39762 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39762 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.13.0

<details id="v1.13.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.13.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:27:15.379853405 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:27:15,905 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:27:15,907 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:27:16,005 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:27:16,005 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:27:16,052 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:27:16,053 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:53458 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53468 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53468 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53468 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53468 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53468 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53468 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.12.0

<details id="v1.12.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.12.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
2026-08-10 04:25:24.424353686 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-10 04:25:24,916 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:25:24,918 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:25:25,014 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:25:25,014 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:25:25,071 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:25:25,072 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39720 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39730 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39730 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39730 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39730 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39730 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39730 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.11.0

<details id="v1.11.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.11.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
[INFO] 2026-08-10 04:23:06,743 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:23:06,745 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:23:06,817 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:23:06,817 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:23:06,854 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:23:06,854 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:36972 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36980 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36980 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36980 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36980 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36980 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36980 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.10.0

<details id="v1.10.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.10.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
[INFO] 2026-08-10 04:21:15,580 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:21:15,581 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:21:15,662 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:21:15,662 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:21:15,718 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:21:15,718 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:53882 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53892 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53892 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53892 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53892 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53892 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53892 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.9.0

<details id="v1.9.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.9.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
[INFO] 2026-08-10 04:18:38,832 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:18:38,834 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:18:38,904 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:18:38,904 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:18:38,946 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:18:38,946 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35070 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35078 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35078 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35078 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35078 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35078 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35078 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.8.0

<details id="v1.8.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.8.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
[INFO] 2026-08-10 04:16:10,358 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:16:10,360 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:16:10,427 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:16:10,427 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:16:10,463 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:16:10,463 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56678 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56688 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56688 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56688 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56688 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56688 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56688 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.7.2

<details id="v1.7.2-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.7.2 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
[INFO] 2026-08-10 04:13:42,736 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:13:42,737 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:13:42,815 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:13:42,815 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:13:42,851 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:13:42,852 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:41064 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41074 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41074 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41074 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41074 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41074 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41074 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.7.1

<details id="v1.7.1-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.7.1 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
[INFO] 2026-08-10 04:11:21,533 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:11:21,535 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-10 04:11:21,616 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:11:21,616 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-10 04:11:21,655 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-10 04:11:21,656 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55610 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55624 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55624 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55624 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55624 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55624 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55624 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.7.0

<details id="v1.7.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.7.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:45344 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45352 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45352 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45352 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45352 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45352 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45352 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.6.0

<details id="v1.6.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.6.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50754 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50762 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50762 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50762 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50762 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50762 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50762 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.5.1

<details id="v1.5.1-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.5.1 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46420 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46436 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46436 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46436 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46436 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46436 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46436 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.5.0

<details id="v1.5.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.5.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:45626 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45642 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45642 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45642 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45642 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45642 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45642 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.4.1

<details id="v1.4.1-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.4.1 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54644 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54648 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54648 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54648 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54648 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54648 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54648 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.4.0

<details id="v1.4.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.4.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:36312 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36318 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36318 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36318 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36318 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36318 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36318 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.3.1

<details id="v1.3.1-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.3.1 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59222 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59228 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59228 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59228 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59228 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59228 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59228 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.3.0

<details id="v1.3.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.3.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:33754 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33758 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33758 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33758 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33758 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33758 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33758 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.2.2

<details id="v1.2.2-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.2.2 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:52720 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52726 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52726 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52726 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52726 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52726 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52726 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.2.1

<details id="v1.2.1-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.2.1 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:37438 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37454 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37454 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37454 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37454 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37454 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37454 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.2.0

<details id="v1.2.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.2.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:60606 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60622 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60622 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60622 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60622 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60622 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60622 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.1.0

<details id="v1.1.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.1.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:47326 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47334 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47334 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47334 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47334 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47334 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47334 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.0.1

<details id="v1.0.1-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.0.1 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:33938 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33950 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33950 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33950 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33950 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33950 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33950 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.0.0

<details id="v1.0.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.0.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57618 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57620 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57620 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57620 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57620 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57620 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57620 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

