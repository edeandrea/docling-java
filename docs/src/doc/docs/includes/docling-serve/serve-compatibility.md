# Results for ghcr.io/docling-project/docling-serve as of 2026-08-17T13:10:37.153488382Z

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
INFO:	13:10:18 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:10:18 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	13:10:18 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	13:10:19 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	13:10:19 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	13:10:19 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	13:10:19 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	13:10:19 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	13:10:19 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	13:10:19 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	13:10:19 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/readyz$,/healthz$,/health$,/livez$,/metrics$)
INFO:	13:10:19 - uvicorn.error - Started server process [1]
INFO:	13:10:19 - uvicorn.error - Waiting for application startup.
INFO:	13:10:22 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:10:22 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	13:10:22 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:10:22 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	13:10:22 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:10:22 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e2db689ab35ca52a08b5b7fa25de8cc8
INFO:	13:10:22 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:10:22 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	13:10:22 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-17 13:10:22.614978911 [W:onnxruntime:Default, device_discovery.cc:134 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	13:10:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:10:22,845 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:10:22,847 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:10:22,903 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:10:22,903 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:10:22,945 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:10:22,945 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	13:10:23 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:10:23 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	13:10:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[transformers] `torch_dtype` is deprecated! Use `dtype` instead!
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 475/770 [00:00<00:00, 4730.43it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4766.83it/s]
INFO:	13:10:24 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	13:10:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:10:25 - uvicorn.error - Application startup complete.
INFO:	13:10:25 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	13:10:26 - docling_serve.app - Health check requested
INFO:	13:10:26 - uvicorn.access - 172.17.0.1:40802 - "GET /health HTTP/1.1" 200
INFO:	13:10:26 - docling_serve.app - Health check requested
INFO:	13:10:26 - uvicorn.access - 172.17.0.1:40808 - "GET /health HTTP/1.1" 200
INFO:	13:10:26 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:10:26 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:10:26 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:10:26 - docling_serve.app - [TENANT_ID] Task 54e7ee3d-bd53-403f-8212-8cfe5fda61c3 created with tenant_id='default'
INFO:	13:10:26 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 54e7ee3d-bd53-403f-8212-8cfe5fda61c3
INFO:	13:10:26 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:10:26 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	13:10:26 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:10:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:10:26,183 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:10:26,183 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:10:26,234 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:10:26,234 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:10:26,275 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:10:26,275 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	13:10:26 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:10:26 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	13:10:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 485/770 [00:00<00:00, 4849.55it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4873.76it/s]
INFO:	13:10:26 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	13:10:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:10:27 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:10:27 - docling.document_converter - Going to convert document batch...
INFO:	13:10:27 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	13:10:27 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:10:27 - docling.document_converter - Finished converting document file in 0.40 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	13:10:27 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	13:10:27 - docling_jobkit.convert.results - Processed 1 docs in 0.44 seconds.
INFO:	13:10:27 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 54e7ee3d-bd53-403f-8212-8cfe5fda61c3 in 0.44 seconds
INFO:	13:10:28 - uvicorn.access - 172.17.0.1:40808 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:10:28 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:10:28 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:10:28 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:10:28 - docling_serve.app - [TENANT_ID] Task ba972c3c-e35a-472d-a553-94609d1ba3e2 created with tenant_id='default'
INFO:	13:10:28 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task ba972c3c-e35a-472d-a553-94609d1ba3e2
INFO:	13:10:28 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:10:28 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	13:10:28 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:10:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:10:28,205 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:10:28,205 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:10:28,257 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:10:28,257 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:10:28,321 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:10:28,321 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	13:10:28 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:10:28 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	13:10:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 484/770 [00:00<00:00, 4839.76it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4821.43it/s]
INFO:	13:10:28 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	13:10:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:10:29 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:10:29 - docling.document_converter - Going to convert document batch...
INFO:	13:10:29 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	13:10:29 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:10:29 - docling.document_converter - Finished converting document file in 0.39 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	13:10:29 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	13:10:29 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job ba972c3c-e35a-472d-a553-94609d1ba3e2 in 0.39 seconds
INFO:	13:10:30 - uvicorn.access - 172.17.0.1:40808 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:10:30 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:10:30 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:10:30 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:10:30 - docling_serve.app - [TENANT_ID] Task a45832fa-2409-4a1b-8c7c-32ebe272b41b created with tenant_id='default'
INFO:	13:10:30 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task a45832fa-2409-4a1b-8c7c-32ebe272b41b
INFO:	13:10:30 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:10:30 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 9df8df3fc03c33cf6e8bd583e67dce64
INFO:	13:10:30 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:10:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:10:30,215 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:10:30,215 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:10:30,266 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:10:30,266 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:10:30,309 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:10:30,309 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	13:10:30 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:10:30 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	13:10:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 484/770 [00:00<00:00, 4831.79it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4840.64it/s]
INFO:	13:10:31 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	13:10:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:10:31 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:10:31 - docling.document_converter - Going to convert document batch...
INFO:	13:10:31 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 9df8df3fc03c33cf6e8bd583e67dce64
INFO:	13:10:31 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:10:31 - docling.document_converter - Finished converting document file in 0.38 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	13:10:31 - docling_jobkit.convert.results - Processed 1 docs in 0.40 seconds.
INFO:	13:10:31 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job a45832fa-2409-4a1b-8c7c-32ebe272b41b in 0.40 seconds
INFO:	13:10:32 - uvicorn.access - 172.17.0.1:40808 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:10:32 - uvicorn.access - 172.17.0.1:40808 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	13:10:32 - uvicorn.access - 172.17.0.1:40808 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	13:08:44 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:08:44 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	13:08:44 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	13:08:45 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	13:08:45 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	13:08:45 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	13:08:45 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	13:08:45 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/healthz$,/health$,/livez$,/readyz$,/metrics$,/ready$)
INFO:	13:08:45 - uvicorn.error - Started server process [1]
INFO:	13:08:45 - uvicorn.error - Waiting for application startup.
INFO:	13:08:48 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:08:48 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	13:08:49 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:08:49 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	13:08:49 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:08:49 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash caff667a02b7f037838d32d34acfe0b0
INFO:	13:08:49 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:08:49 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	13:08:49 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-17 13:08:49.200480219 [W:onnxruntime:Default, device_discovery.cc:134 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	13:08:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:08:49,470 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:08:49,472 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:08:49,528 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:08:49,528 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:08:49,572 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:08:49,572 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	13:08:49 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:08:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 484/770 [00:00<00:00, 4816.02it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4847.27it/s]
INFO:	13:08:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:08:50 - uvicorn.error - Application startup complete.
INFO:	13:08:50 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	13:08:51 - docling_serve.app - Health check requested
INFO:	13:08:51 - uvicorn.access - 172.17.0.1:55010 - "GET /health HTTP/1.1" 200
INFO:	13:08:51 - docling_serve.app - Health check requested
INFO:	13:08:51 - uvicorn.access - 172.17.0.1:55020 - "GET /health HTTP/1.1" 200
INFO:	13:08:51 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:08:51 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:08:51 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:08:51 - docling_serve.app - [TENANT_ID] Task 1702ef89-de0f-4d14-995e-e8a937841be1 created with tenant_id='default'
INFO:	13:08:51 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 1702ef89-de0f-4d14-995e-e8a937841be1
INFO:	13:08:51 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:08:51 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash ab12ef348c8fc273bf2be7a49773b303
INFO:	13:08:51 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:08:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:08:51,309 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:08:51,310 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:08:51,364 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:08:51,365 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:08:51,418 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:08:51,418 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	13:08:51 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:08:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 488/770 [00:00<00:00, 4829.31it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4831.86it/s]
INFO:	13:08:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:08:52 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:08:52 - docling.document_converter - Going to convert document batch...
INFO:	13:08:52 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:08:52 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:08:52 - docling.document_converter - Finished converting document file in 0.42 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	13:08:53 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	13:08:53 - docling_jobkit.convert.results - Processed 1 docs in 0.46 seconds.
INFO:	13:08:53 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 1702ef89-de0f-4d14-995e-e8a937841be1 in 0.46 seconds
INFO:	13:08:53 - uvicorn.access - 172.17.0.1:55020 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:08:53 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:08:53 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:08:53 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:08:53 - docling_serve.app - [TENANT_ID] Task f71f5798-c675-48d9-b86e-00dfb5aa0139 created with tenant_id='default'
INFO:	13:08:53 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task f71f5798-c675-48d9-b86e-00dfb5aa0139
INFO:	13:08:53 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:08:53 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash ab12ef348c8fc273bf2be7a49773b303
INFO:	13:08:53 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:08:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:08:53,319 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:08:53,319 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:08:53,375 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:08:53,375 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:08:53,429 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:08:53,429 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	13:08:53 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:08:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 498/770 [00:00<00:00, 4970.86it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4895.79it/s]
INFO:	13:08:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:08:54 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:08:54 - docling.document_converter - Going to convert document batch...
INFO:	13:08:54 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:08:54 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:08:54 - docling.document_converter - Finished converting document file in 0.39 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	13:08:54 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	13:08:54 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job f71f5798-c675-48d9-b86e-00dfb5aa0139 in 0.39 seconds
INFO:	13:08:55 - uvicorn.access - 172.17.0.1:55020 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:08:55 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:08:55 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:08:55 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:08:55 - docling_serve.app - [TENANT_ID] Task c66164aa-4710-4523-84d0-f68cb62185c3 created with tenant_id='default'
INFO:	13:08:55 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task c66164aa-4710-4523-84d0-f68cb62185c3
INFO:	13:08:55 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:08:55 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash b3849eabdc7ecae5f3d54428a0162342
INFO:	13:08:55 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:08:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:08:55,349 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:08:55,350 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:08:55,400 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:08:55,401 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:08:55,453 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:08:55,453 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	13:08:55 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:08:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 517/770 [00:00<00:00, 5152.07it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5049.74it/s]
INFO:	13:08:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:08:56 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:08:56 - docling.document_converter - Going to convert document batch...
INFO:	13:08:56 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:08:56 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:08:56 - docling.document_converter - Finished converting document file in 0.23 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	13:08:56 - docling_jobkit.convert.results - Processed 1 docs in 0.26 seconds.
INFO:	13:08:56 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job c66164aa-4710-4523-84d0-f68cb62185c3 in 0.26 seconds
INFO:	13:08:57 - uvicorn.access - 172.17.0.1:55020 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:08:57 - uvicorn.access - 172.17.0.1:55020 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	13:08:57 - uvicorn.access - 172.17.0.1:55020 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	13:07:02 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:07:02 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	13:07:02 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	13:07:03 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	13:07:03 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	13:07:03 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	13:07:03 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/readyz$,/metrics$,/healthz$,/ready$,/health$)
INFO:	13:07:03 - uvicorn.error - Started server process [1]
INFO:	13:07:03 - uvicorn.error - Waiting for application startup.
INFO:	13:07:06 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:07:06 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	13:07:06 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:07:06 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	13:07:06 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:07:07 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	13:07:07 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:07:07 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	13:07:07 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-17 13:07:07.104341798 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	13:07:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:07:07,390 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:07:07,392 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:07:07,454 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:07:07,455 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:07:07,503 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:07:07,503 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	13:07:07 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:07:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 501/770 [00:00<00:00, 4993.36it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4833.89it/s]
INFO:	13:07:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:07:08 - uvicorn.error - Application startup complete.
INFO:	13:07:08 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	13:07:09 - docling_serve.app - Health check requested
INFO:	13:07:09 - uvicorn.access - 172.17.0.1:48176 - "GET /health HTTP/1.1" 200
INFO:	13:07:09 - docling_serve.app - Health check requested
INFO:	13:07:09 - uvicorn.access - 172.17.0.1:48178 - "GET /health HTTP/1.1" 200
INFO:	13:07:09 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:07:09 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:07:09 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:07:09 - docling_serve.app - [TENANT_ID] Task 7ad07b55-a053-4fbf-86fc-2c4326ca1712 created with tenant_id='default'
INFO:	13:07:09 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 7ad07b55-a053-4fbf-86fc-2c4326ca1712
INFO:	13:07:09 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:07:09 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	13:07:09 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:07:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:07:09,219 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:07:09,219 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:07:09,285 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:07:09,285 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:07:09,348 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:07:09,349 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	13:07:09 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:07:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 492/770 [00:00<00:00, 4907.53it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4856.39it/s]
INFO:	13:07:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:07:10 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:07:10 - docling.document_converter - Going to convert document batch...
INFO:	13:07:10 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:07:10 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:07:10 - docling.document_converter - Finished converting document file in 0.41 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	13:07:10 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	13:07:10 - docling_jobkit.convert.results - Processed 1 docs in 0.45 seconds.
INFO:	13:07:10 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 7ad07b55-a053-4fbf-86fc-2c4326ca1712 in 0.45 seconds
INFO:	13:07:11 - uvicorn.access - 172.17.0.1:48178 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:07:11 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:07:11 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:07:11 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:07:11 - docling_serve.app - [TENANT_ID] Task 3b7b6a45-dbe3-46b8-89de-ff0d0c2b68bb created with tenant_id='default'
INFO:	13:07:11 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 3b7b6a45-dbe3-46b8-89de-ff0d0c2b68bb
INFO:	13:07:11 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:07:11 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	13:07:11 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:07:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:07:11,245 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:07:11,245 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:07:11,302 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:07:11,302 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:07:11,351 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:07:11,351 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	13:07:11 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:07:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 484/770 [00:00<00:00, 4824.32it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4844.44it/s]
INFO:	13:07:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:07:12 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:07:12 - docling.document_converter - Going to convert document batch...
INFO:	13:07:12 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:07:12 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:07:12 - docling.document_converter - Finished converting document file in 0.24 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	13:07:12 - docling_jobkit.convert.results - Processed 1 docs in 0.24 seconds.
INFO:	13:07:12 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 3b7b6a45-dbe3-46b8-89de-ff0d0c2b68bb in 0.24 seconds
INFO:	13:07:13 - uvicorn.access - 172.17.0.1:48178 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:07:13 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:07:13 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:07:13 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:07:13 - docling_serve.app - [TENANT_ID] Task 80b2e282-7b86-4df5-ae00-f6887a1effb4 created with tenant_id='default'
INFO:	13:07:13 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 80b2e282-7b86-4df5-ae00-f6887a1effb4
INFO:	13:07:13 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:07:13 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	13:07:13 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:07:13 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:07:13,257 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:07:13,257 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:07:13,315 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:07:13,316 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:07:13,378 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:07:13,379 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	13:07:13 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:07:13 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 449/770 [00:00<00:00, 4487.33it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4765.19it/s]
INFO:	13:07:13 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:07:14 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:07:14 - docling.document_converter - Going to convert document batch...
INFO:	13:07:14 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:07:14 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:07:14 - docling.document_converter - Finished converting document file in 0.42 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	13:07:14 - docling_jobkit.convert.results - Processed 1 docs in 0.44 seconds.
INFO:	13:07:14 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 80b2e282-7b86-4df5-ae00-f6887a1effb4 in 0.44 seconds
INFO:	13:07:15 - uvicorn.access - 172.17.0.1:48178 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:07:15 - uvicorn.access - 172.17.0.1:48178 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	13:07:15 - uvicorn.access - 172.17.0.1:48178 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	13:05:14 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:05:14 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	13:05:14 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	13:05:14 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	13:05:14 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/health$,/livez$,/healthz$,/readyz$,/metrics$)
INFO:	13:05:14 - uvicorn.error - Started server process [1]
INFO:	13:05:14 - uvicorn.error - Waiting for application startup.
INFO:	13:05:18 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:05:18 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	13:05:18 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:05:18 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	13:05:18 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:05:18 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	13:05:18 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:05:18 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	13:05:18 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-17 13:05:18.510671776 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	13:05:18 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:05:18,766 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:05:18,768 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:05:18,830 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:05:18,830 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:05:18,878 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:05:18,878 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	13:05:18 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:05:18 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 466/770 [00:00<00:00, 4657.88it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4781.41it/s]
INFO:	13:05:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:05:19 - uvicorn.error - Application startup complete.
INFO:	13:05:19 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	13:05:20 - docling_serve.app - Health check requested
INFO:	13:05:20 - uvicorn.access - 172.17.0.1:46640 - "GET /health HTTP/1.1" 200
INFO:	13:05:20 - docling_serve.app - Health check requested
INFO:	13:05:20 - uvicorn.access - 172.17.0.1:46654 - "GET /health HTTP/1.1" 200
INFO:	13:05:20 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:05:20 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:05:20 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:05:20 - docling_serve.app - [TENANT_ID] Task d867e3e8-d986-487c-8644-1bdb5b6ec3a9 created with tenant_id='default'
INFO:	13:05:20 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task d867e3e8-d986-487c-8644-1bdb5b6ec3a9
INFO:	13:05:20 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:05:20 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	13:05:20 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:05:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:05:20,873 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:05:20,873 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:05:20,931 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:05:20,931 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:05:20,980 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:05:20,980 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	13:05:21 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:05:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 497/770 [00:00<00:00, 4946.90it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4971.83it/s]
INFO:	13:05:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:05:22 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:05:22 - docling.document_converter - Going to convert document batch...
INFO:	13:05:22 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:05:22 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:05:22 - docling.document_converter - Finished converting document file in 0.43 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	13:05:22 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	13:05:22 - docling_jobkit.convert.results - Processed 1 docs in 0.47 seconds.
INFO:	13:05:22 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job d867e3e8-d986-487c-8644-1bdb5b6ec3a9 in 0.47 seconds
INFO:	13:05:22 - uvicorn.access - 172.17.0.1:46654 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:05:22 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:05:22 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:05:22 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:05:22 - docling_serve.app - [TENANT_ID] Task ce340aa2-09b7-4a4f-813f-6067b2a22ac2 created with tenant_id='default'
INFO:	13:05:22 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task ce340aa2-09b7-4a4f-813f-6067b2a22ac2
INFO:	13:05:22 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:05:22 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	13:05:22 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:05:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:05:22,891 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:05:22,891 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:05:22,947 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:05:22,947 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:05:22,996 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:05:22,996 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	13:05:23 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:05:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 475/770 [00:00<00:00, 4741.02it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4827.62it/s]
INFO:	13:05:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:05:24 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:05:24 - docling.document_converter - Going to convert document batch...
INFO:	13:05:24 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:05:24 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:05:24 - docling.document_converter - Finished converting document file in 0.38 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	13:05:24 - docling_jobkit.convert.results - Processed 1 docs in 0.38 seconds.
INFO:	13:05:24 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job ce340aa2-09b7-4a4f-813f-6067b2a22ac2 in 0.38 seconds
INFO:	13:05:24 - uvicorn.access - 172.17.0.1:46654 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:05:24 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:05:24 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:05:24 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:05:24 - docling_serve.app - [TENANT_ID] Task 74f42551-7e32-420d-ae09-a19b5e599616 created with tenant_id='default'
INFO:	13:05:24 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 74f42551-7e32-420d-ae09-a19b5e599616
INFO:	13:05:24 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:05:24 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	13:05:24 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:05:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:05:24,934 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:05:24,935 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-17 13:05:24,996 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:05:24,997 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:05:25,054 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:05:25,055 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	13:05:25 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:05:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 505/770 [00:00<00:00, 5046.66it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5055.43it/s]
INFO:	13:05:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:05:26 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:05:26 - docling.document_converter - Going to convert document batch...
INFO:	13:05:26 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:05:26 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:05:26 - docling.document_converter - Finished converting document file in 0.38 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	13:05:26 - docling_jobkit.convert.results - Processed 1 docs in 0.40 seconds.
INFO:	13:05:26 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 74f42551-7e32-420d-ae09-a19b5e599616 in 0.40 seconds
INFO:	13:05:26 - uvicorn.access - 172.17.0.1:46654 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:05:27 - uvicorn.access - 172.17.0.1:46654 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	13:05:27 - uvicorn.access - 172.17.0.1:46654 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	13:03:29 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:03:29 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	13:03:29 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	13:03:29 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	13:03:29 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/readyz$,/metrics$,/livez$,/ready$,/healthz$)
INFO:	13:03:29 - uvicorn.error - Started server process [1]
INFO:	13:03:29 - uvicorn.error - Waiting for application startup.
INFO:	13:03:33 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:03:33 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	13:03:33 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:03:33 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	13:03:33 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:03:33 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c4d6547d10e26a777a530d63ca01a1a1
INFO:	13:03:33 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:03:33 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	13:03:33 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-17 13:03:33.511836816 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	13:03:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:03:34,016 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:03:34,018 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 13:03:34,116 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:03:34,117 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:03:34,165 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:03:34,165 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	13:03:34 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:03:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 504/770 [00:00<00:00, 4960.19it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5063.34it/s]
INFO:	13:03:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:03:35 - uvicorn.error - Application startup complete.
INFO:	13:03:35 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	13:03:35 - docling_serve.app - Health check requested
INFO:	13:03:35 - uvicorn.access - 172.17.0.1:48102 - "GET /health HTTP/1.1" 200
INFO:	13:03:35 - docling_serve.app - Health check requested
INFO:	13:03:35 - uvicorn.access - 172.17.0.1:48118 - "GET /health HTTP/1.1" 200
INFO:	13:03:35 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:03:35 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:03:35 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:03:35 - docling_serve.app - [TENANT_ID] Task 48fa076f-eff5-4676-afd7-1c7e840b7872 created with tenant_id='default'
INFO:	13:03:35 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 48fa076f-eff5-4676-afd7-1c7e840b7872
INFO:	13:03:35 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:03:35 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	13:03:35 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:03:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:03:35,400 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:03:35,400 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 13:03:35,501 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:03:35,501 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:03:35,549 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:03:35,549 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	13:03:35 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:03:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 500/770 [00:00<00:00, 4973.86it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4965.54it/s]
INFO:	13:03:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:03:36 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:03:36 - docling.document_converter - Going to convert document batch...
INFO:	13:03:36 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:03:36 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:03:36 - docling.document_converter - Finished converting document file in 0.42 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	13:03:36 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	13:03:36 - docling_jobkit.convert.results - Processed 1 docs in 0.46 seconds.
INFO:	13:03:36 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 48fa076f-eff5-4676-afd7-1c7e840b7872 in 0.46 seconds
INFO:	13:03:37 - uvicorn.access - 172.17.0.1:48118 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:03:37 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:03:37 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:03:37 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:03:37 - docling_serve.app - [TENANT_ID] Task 522dc9bb-2db5-43bf-9c60-a98337d1b2ab created with tenant_id='default'
INFO:	13:03:37 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 522dc9bb-2db5-43bf-9c60-a98337d1b2ab
INFO:	13:03:37 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:03:37 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	13:03:37 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:03:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:03:37,425 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:03:37,425 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 13:03:37,543 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:03:37,543 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:03:37,591 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:03:37,591 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	13:03:37 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:03:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 486/770 [00:00<00:00, 4812.90it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4964.64it/s]
INFO:	13:03:38 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:03:38 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:03:38 - docling.document_converter - Going to convert document batch...
INFO:	13:03:38 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:03:38 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:03:38 - docling.document_converter - Finished converting document file in 0.39 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	13:03:38 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	13:03:38 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 522dc9bb-2db5-43bf-9c60-a98337d1b2ab in 0.39 seconds
INFO:	13:03:39 - uvicorn.access - 172.17.0.1:48118 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:03:39 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:03:39 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:03:39 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:03:39 - docling_serve.app - [TENANT_ID] Task 9d11c878-d211-4186-a542-9b36b63c9352 created with tenant_id='default'
INFO:	13:03:39 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 9d11c878-d211-4186-a542-9b36b63c9352
INFO:	13:03:39 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:03:39 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 63e8839d1103b03d45382915dba33c89
INFO:	13:03:39 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	13:03:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:03:39,428 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:03:39,428 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 13:03:39,548 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:03:39,548 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:03:39,595 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:03:39,596 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	13:03:39 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:03:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 477/770 [00:00<00:00, 4753.07it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4876.96it/s]
INFO:	13:03:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:03:41 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:03:41 - docling.document_converter - Going to convert document batch...
INFO:	13:03:41 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:03:41 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:03:41 - docling.document_converter - Finished converting document file in 0.40 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	13:03:41 - docling_jobkit.convert.results - Processed 1 docs in 0.42 seconds.
INFO:	13:03:41 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 9d11c878-d211-4186-a542-9b36b63c9352 in 0.42 seconds
INFO:	13:03:41 - uvicorn.access - 172.17.0.1:48118 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:03:41 - uvicorn.access - 172.17.0.1:48118 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	13:03:41 - uvicorn.access - 172.17.0.1:48118 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	13:01:52 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:01:52 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	13:01:52 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	13:01:52 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	13:01:52 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/health$,/livez$,/ready$,/healthz$,/metrics$)
INFO:	13:01:52 - uvicorn.error - Started server process [1]
INFO:	13:01:52 - uvicorn.error - Waiting for application startup.
INFO:	13:01:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:01:56 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	13:01:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:01:56 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	13:01:56 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:01:56 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash f446dcc5a1a7c6aff458e30cab474a9e
INFO:	13:01:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:01:56 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-17 13:01:56.746332079 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	13:01:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:01:57,063 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:01:57,065 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 13:01:57,159 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:01:57,159 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:01:57,208 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:01:57,208 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	13:01:57 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:01:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 485/770 [00:00<00:00, 4825.33it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4688.07it/s]
INFO:	13:01:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:01:58 - uvicorn.error - Application startup complete.
INFO:	13:01:58 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	13:01:58 - docling_serve.app - Health check requested
INFO:	13:01:58 - uvicorn.access - 172.17.0.1:46038 - "GET /health HTTP/1.1" 200
INFO:	13:01:58 - docling_serve.app - Health check requested
INFO:	13:01:58 - uvicorn.access - 172.17.0.1:46044 - "GET /health HTTP/1.1" 200
INFO:	13:01:58 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:01:58 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:01:58 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:01:58 - docling_serve.app - [TENANT_ID] Task 71d83fd7-e8cd-493d-a245-a5ec1b527502 created with tenant_id='default'
INFO:	13:01:58 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 71d83fd7-e8cd-493d-a245-a5ec1b527502
INFO:	13:01:58 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:01:59 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	13:01:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:01:59,043 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:01:59,043 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 13:01:59,145 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:01:59,145 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:01:59,191 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:01:59,191 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	13:01:59 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:01:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 517/770 [00:00<00:00, 5166.13it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5015.13it/s]
INFO:	13:01:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:02:00 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:02:00 - docling.document_converter - Going to convert document batch...
INFO:	13:02:00 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:02:00 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:02:00 - docling.document_converter - Finished converting document file in 0.44 sec.
WARNING:	13:02:00 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	13:02:00 - docling_jobkit.convert.results - Processed 1 docs in 0.48 seconds.
INFO:	13:02:00 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 71d83fd7-e8cd-493d-a245-a5ec1b527502 in 0.48 seconds
INFO:	13:02:00 - uvicorn.access - 172.17.0.1:46044 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:02:00 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:02:00 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:02:00 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:02:00 - docling_serve.app - [TENANT_ID] Task c57c129a-ff25-4a8e-b5b7-f9becac7e959 created with tenant_id='default'
INFO:	13:02:00 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task c57c129a-ff25-4a8e-b5b7-f9becac7e959
INFO:	13:02:00 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:02:01 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	13:02:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:02:01,065 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:02:01,066 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 13:02:01,191 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:02:01,191 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:02:01,242 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:02:01,242 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	13:02:01 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:02:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 507/770 [00:00<00:00, 5055.31it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5109.24it/s]
INFO:	13:02:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:02:02 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:02:02 - docling.document_converter - Going to convert document batch...
INFO:	13:02:02 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:02:02 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:02:02 - docling.document_converter - Finished converting document file in 0.40 sec.
INFO:	13:02:02 - docling_jobkit.convert.results - Processed 1 docs in 0.40 seconds.
INFO:	13:02:02 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job c57c129a-ff25-4a8e-b5b7-f9becac7e959 in 0.40 seconds
INFO:	13:02:03 - uvicorn.access - 172.17.0.1:46044 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:02:03 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:02:03 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:02:03 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:02:03 - docling_serve.app - [TENANT_ID] Task 3b683012-c377-460e-8dd5-f414b079fb57 created with tenant_id='default'
INFO:	13:02:03 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 3b683012-c377-460e-8dd5-f414b079fb57
INFO:	13:02:03 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:02:03 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e50b6140ec7ee9be0d0fea6ba20c9795
INFO:	13:02:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:02:03,084 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:02:03,084 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 13:02:03,181 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:02:03,181 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:02:03,229 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:02:03,229 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	13:02:03 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:02:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 467/770 [00:00<00:00, 4659.87it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4700.73it/s]
INFO:	13:02:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:02:04 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:02:04 - docling.document_converter - Going to convert document batch...
INFO:	13:02:04 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:02:04 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:02:04 - docling.document_converter - Finished converting document file in 0.37 sec.
INFO:	13:02:04 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	13:02:04 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 3b683012-c377-460e-8dd5-f414b079fb57 in 0.39 seconds
INFO:	13:02:05 - uvicorn.access - 172.17.0.1:46044 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:02:05 - uvicorn.access - 172.17.0.1:46044 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	13:02:05 - uvicorn.access - 172.17.0.1:46044 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	13:00:02 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:00:02 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	13:00:02 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	13:00:02 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	13:00:02 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/livez$,/health$,/metrics$,/readyz$,/healthz$)
INFO:	13:00:02 - uvicorn.error - Started server process [1]
INFO:	13:00:02 - uvicorn.error - Waiting for application startup.
INFO:	13:00:06 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:00:06 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	13:00:06 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:00:06 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	13:00:06 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:00:06 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	13:00:06 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	13:00:06 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-17 13:00:06.662880127 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	13:00:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:00:06,975 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:00:06,977 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 13:00:07,072 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:00:07,072 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:00:07,119 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:00:07,119 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	13:00:07 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:00:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 475/770 [00:00<00:00, 4730.92it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4874.18it/s]
INFO:	13:00:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:00:08 - uvicorn.error - Application startup complete.
INFO:	13:00:08 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	13:00:08 - docling_serve.app - Health check requested
INFO:	13:00:08 - uvicorn.access - 172.17.0.1:55406 - "GET /health HTTP/1.1" 200
INFO:	13:00:08 - docling_serve.app - Health check requested
INFO:	13:00:08 - uvicorn.access - 172.17.0.1:55422 - "GET /health HTTP/1.1" 200
INFO:	13:00:08 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:00:08 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:00:08 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:00:08 - docling_serve.app - [TENANT_ID] Task 235f7cdd-86c3-4870-9818-0122fdf00983 created with tenant_id='default'
INFO:	13:00:08 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 235f7cdd-86c3-4870-9818-0122fdf00983
INFO:	13:00:08 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:00:08 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	13:00:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:00:08,387 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:00:08,387 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 13:00:08,482 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:00:08,483 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:00:08,530 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:00:08,530 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	13:00:08 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:00:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 487/770 [00:00<00:00, 4857.42it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4794.44it/s]
INFO:	13:00:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:00:09 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:00:09 - docling.document_converter - Going to convert document batch...
INFO:	13:00:09 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:00:09 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:00:09 - docling.document_converter - Finished converting document file in 0.44 sec.
WARNING:	13:00:09 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	13:00:09 - docling_jobkit.convert.results - Processed 1 docs in 0.48 seconds.
INFO:	13:00:09 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 235f7cdd-86c3-4870-9818-0122fdf00983 in 0.48 seconds
INFO:	13:00:10 - uvicorn.access - 172.17.0.1:55422 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:00:10 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:00:10 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:00:10 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:00:10 - docling_serve.app - [TENANT_ID] Task e496c771-5102-4016-9a30-a145e58559ad created with tenant_id='default'
INFO:	13:00:10 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task e496c771-5102-4016-9a30-a145e58559ad
INFO:	13:00:10 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:00:10 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	13:00:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:00:10,401 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:00:10,401 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 13:00:10,495 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:00:10,495 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:00:10,541 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:00:10,541 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	13:00:10 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:00:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 504/770 [00:00<00:00, 5029.49it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5039.00it/s]
INFO:	13:00:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:00:11 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:00:12 - docling.document_converter - Going to convert document batch...
INFO:	13:00:12 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:00:12 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:00:12 - docling.document_converter - Finished converting document file in 0.37 sec.
INFO:	13:00:12 - docling_jobkit.convert.results - Processed 1 docs in 0.37 seconds.
INFO:	13:00:12 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job e496c771-5102-4016-9a30-a145e58559ad in 0.37 seconds
INFO:	13:00:12 - uvicorn.access - 172.17.0.1:55422 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:00:12 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	13:00:12 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	13:00:12 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	13:00:12 - docling_serve.app - [TENANT_ID] Task ca8fa13e-8746-425e-bde8-c001dd4263b0 created with tenant_id='default'
INFO:	13:00:12 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task ca8fa13e-8746-425e-bde8-c001dd4263b0
INFO:	13:00:12 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	13:00:12 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	13:00:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 13:00:12,423 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:00:12,424 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 13:00:12,525 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:00:12,526 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 13:00:12,576 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 13:00:12,576 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	13:00:12 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	13:00:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 482/770 [00:00<00:00, 4816.26it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4860.29it/s]
INFO:	13:00:13 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	13:00:13 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	13:00:13 - docling.document_converter - Going to convert document batch...
INFO:	13:00:13 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	13:00:13 - docling.pipeline.base_pipeline - Processing document file
INFO:	13:00:13 - docling.document_converter - Finished converting document file in 0.23 sec.
INFO:	13:00:13 - docling_jobkit.convert.results - Processed 1 docs in 0.25 seconds.
INFO:	13:00:13 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job ca8fa13e-8746-425e-bde8-c001dd4263b0 in 0.25 seconds
INFO:	13:00:14 - uvicorn.access - 172.17.0.1:55422 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	13:00:14 - uvicorn.access - 172.17.0.1:55422 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	13:00:14 - uvicorn.access - 172.17.0.1:55422 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	12:58:37 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:58:37 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	12:58:37 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	12:58:37 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	12:58:37 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/healthz$,/readyz$,/metrics$,/ready$,/livez$)
INFO:	12:58:37 - uvicorn.error - Started server process [1]
INFO:	12:58:37 - uvicorn.error - Waiting for application startup.
INFO:	12:58:40 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:58:41 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	12:58:41 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:58:41 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	12:58:41 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:58:41 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	12:58:41 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:58:41 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-17 12:58:41.143898183 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	12:58:41 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 12:58:41,442 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:58:41,444 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:58:41,539 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:58:41,539 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:58:41,585 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:58:41,586 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:58:41 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:58:41 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 513/770 [00:00<00:00, 5126.25it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4951.92it/s]
INFO:	12:58:42 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:58:42 - uvicorn.error - Application startup complete.
INFO:	12:58:42 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	12:58:43 - docling_serve.app - Health check requested
INFO:	12:58:43 - uvicorn.access - 172.17.0.1:55114 - "GET /health HTTP/1.1" 200
INFO:	12:58:43 - docling_serve.app - Health check requested
INFO:	12:58:43 - uvicorn.access - 172.17.0.1:55122 - "GET /health HTTP/1.1" 200
INFO:	12:58:43 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:58:43 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:58:43 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:58:43 - docling_serve.app - [TENANT_ID] Task 7c9ac428-2dc8-4831-9c68-cab07ef32a3f created with tenant_id='default'
INFO:	12:58:43 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 7c9ac428-2dc8-4831-9c68-cab07ef32a3f
INFO:	12:58:43 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:58:43 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	12:58:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 12:58:43,263 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:58:43,263 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:58:43,398 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:58:43,399 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:58:43,490 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:58:43,491 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:58:43 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:58:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|██████    | 463/770 [00:00<00:00, 4555.27it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4892.52it/s]
INFO:	12:58:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:58:44 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:58:44 - docling.document_converter - Going to convert document batch...
INFO:	12:58:44 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:58:44 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:58:45 - docling.document_converter - Finished converting document file in 0.43 sec.
WARNING:	12:58:45 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	12:58:45 - docling_jobkit.convert.results - Processed 1 docs in 0.49 seconds.
INFO:	12:58:45 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 7c9ac428-2dc8-4831-9c68-cab07ef32a3f in 0.49 seconds
INFO:	12:58:45 - uvicorn.access - 172.17.0.1:55122 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:58:45 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:58:45 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:58:45 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:58:45 - docling_serve.app - [TENANT_ID] Task 40d5df01-4bcc-4650-b091-0bf8b7c56589 created with tenant_id='default'
INFO:	12:58:45 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 40d5df01-4bcc-4650-b091-0bf8b7c56589
INFO:	12:58:45 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:58:45 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	12:58:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 12:58:45,302 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:58:45,303 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:58:45,436 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:58:45,436 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:58:45,491 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:58:45,492 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:58:45 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:58:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  56%|█████▌    | 430/770 [00:00<00:00, 4293.18it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4390.02it/s]
INFO:	12:58:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:58:47 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:58:47 - docling.document_converter - Going to convert document batch...
INFO:	12:58:47 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:58:47 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:58:47 - docling.document_converter - Finished converting document file in 0.28 sec.
INFO:	12:58:47 - docling_jobkit.convert.results - Processed 1 docs in 0.28 seconds.
INFO:	12:58:47 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 40d5df01-4bcc-4650-b091-0bf8b7c56589 in 0.28 seconds
INFO:	12:58:47 - uvicorn.access - 172.17.0.1:55122 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:58:47 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:58:47 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:58:47 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:58:47 - docling_serve.app - [TENANT_ID] Task 4a122485-1d1b-4b3d-994e-b6dc26f103a6 created with tenant_id='default'
INFO:	12:58:47 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 4a122485-1d1b-4b3d-994e-b6dc26f103a6
INFO:	12:58:47 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:58:47 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	12:58:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 12:58:47,304 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:58:47,305 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:58:47,438 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:58:47,438 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:58:47,491 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:58:47,492 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:58:47 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:58:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 470/770 [00:00<00:00, 4681.72it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4799.23it/s]
INFO:	12:58:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:58:48 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:58:48 - docling.document_converter - Going to convert document batch...
INFO:	12:58:48 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:58:48 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:58:48 - docling.document_converter - Finished converting document file in 0.40 sec.
INFO:	12:58:48 - docling_jobkit.convert.results - Processed 1 docs in 0.43 seconds.
INFO:	12:58:48 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 4a122485-1d1b-4b3d-994e-b6dc26f103a6 in 0.43 seconds
INFO:	12:58:49 - uvicorn.access - 172.17.0.1:55122 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:58:49 - uvicorn.access - 172.17.0.1:55122 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	12:58:49 - uvicorn.access - 172.17.0.1:55122 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	12:56:39 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:56:39 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	12:56:39 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	12:56:39 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	12:56:39 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/livez$,/healthz$,/readyz$,/metrics$,/ready$)
INFO:	12:56:39 - uvicorn.error - Started server process [1]
INFO:	12:56:39 - uvicorn.error - Waiting for application startup.
INFO:	12:56:43 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:56:43 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	12:56:43 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:56:43 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	12:56:43 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:56:43 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	12:56:43 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:56:43 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-17 12:56:43.288821848 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	12:56:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 12:56:43,560 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:56:43,561 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:56:43,661 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:56:43,661 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:56:43,709 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:56:43,709 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:56:43 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:56:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 502/770 [00:00<00:00, 4994.14it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4892.65it/s]
INFO:	12:56:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:56:44 - uvicorn.error - Application startup complete.
INFO:	12:56:44 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	12:56:45 - docling_serve.app - Health check requested
INFO:	12:56:45 - uvicorn.access - 172.17.0.1:57742 - "GET /health HTTP/1.1" 200
INFO:	12:56:45 - docling_serve.app - Health check requested
INFO:	12:56:45 - uvicorn.access - 172.17.0.1:57746 - "GET /health HTTP/1.1" 200
INFO:	12:56:45 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:56:45 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:56:45 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:56:45 - docling_serve.app - [TENANT_ID] Task 41e37d3f-cf4a-4f16-816f-c32f8a882245 created with tenant_id='default'
INFO:	12:56:45 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 41e37d3f-cf4a-4f16-816f-c32f8a882245
INFO:	12:56:45 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:56:45 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	12:56:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 12:56:45,151 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:56:45,152 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:56:45,250 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:56:45,251 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:56:45,300 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:56:45,300 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:56:45 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:56:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 479/770 [00:00<00:00, 4765.79it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4887.08it/s]
INFO:	12:56:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:56:46 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:56:46 - docling.document_converter - Going to convert document batch...
INFO:	12:56:46 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:56:46 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:56:46 - docling.document_converter - Finished converting document file in 0.40 sec.
WARNING:	12:56:46 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	12:56:46 - docling_jobkit.convert.results - Processed 1 docs in 0.43 seconds.
INFO:	12:56:46 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 41e37d3f-cf4a-4f16-816f-c32f8a882245 in 0.43 seconds
INFO:	12:56:47 - uvicorn.access - 172.17.0.1:57746 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:56:47 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:56:47 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:56:47 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:56:47 - docling_serve.app - [TENANT_ID] Task 3fce9aec-c640-4bea-a584-2d4959fa2961 created with tenant_id='default'
INFO:	12:56:47 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 3fce9aec-c640-4bea-a584-2d4959fa2961
INFO:	12:56:47 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:56:47 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	12:56:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 12:56:47,171 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:56:47,171 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:56:47,266 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:56:47,267 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:56:47,316 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:56:47,317 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:56:47 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:56:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 513/770 [00:00<00:00, 5125.50it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5168.84it/s]
INFO:	12:56:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:56:48 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:56:48 - docling.document_converter - Going to convert document batch...
INFO:	12:56:48 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:56:48 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:56:48 - docling.document_converter - Finished converting document file in 0.53 sec.
INFO:	12:56:48 - docling_jobkit.convert.results - Processed 1 docs in 0.53 seconds.
INFO:	12:56:48 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 3fce9aec-c640-4bea-a584-2d4959fa2961 in 0.53 seconds
INFO:	12:56:49 - uvicorn.access - 172.17.0.1:57746 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:56:49 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:56:49 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:56:49 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:56:49 - docling_serve.app - [TENANT_ID] Task 42c98e06-99c8-48db-b0a6-215129f4c524 created with tenant_id='default'
INFO:	12:56:49 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 42c98e06-99c8-48db-b0a6-215129f4c524
INFO:	12:56:49 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:56:49 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash fb1751b09de6bdbe35ede48676ca8f82
INFO:	12:56:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 12:56:49,197 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:56:49,197 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:56:49,294 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:56:49,294 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:56:49,342 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:56:49,342 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:56:49 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:56:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 523/770 [00:00<00:00, 5228.96it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5192.12it/s]
INFO:	12:56:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:56:50 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:56:50 - docling.document_converter - Going to convert document batch...
INFO:	12:56:50 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:56:50 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:56:50 - docling.document_converter - Finished converting document file in 0.36 sec.
INFO:	12:56:50 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	12:56:50 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 42c98e06-99c8-48db-b0a6-215129f4c524 in 0.39 seconds
INFO:	12:56:51 - uvicorn.access - 172.17.0.1:57746 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:56:51 - uvicorn.access - 172.17.0.1:57746 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	12:56:51 - uvicorn.access - 172.17.0.1:57746 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	12:55:23 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:55:23 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	12:55:23 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	12:55:23 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	12:55:23 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/metrics$,/readyz$,/livez$,/ready$,/healthz$)
INFO:	12:55:23 - uvicorn.error - Started server process [1]
INFO:	12:55:23 - uvicorn.error - Waiting for application startup.
INFO:	12:55:27 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:55:27 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	12:55:27 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:55:27 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	12:55:27 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:55:27 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash bcb2e23b24bd94a42b5c00d662a7c1cf
INFO:	12:55:27 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:55:27 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-17 12:55:27.965703229 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	12:55:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 12:55:28,360 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:55:28,362 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:55:28,497 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:55:28,497 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:55:28,567 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:55:28,568 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:55:28 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:55:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 448/770 [00:00<00:00, 4451.18it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5194.88it/s]
INFO:	12:55:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:55:29 - uvicorn.error - Application startup complete.
INFO:	12:55:29 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	12:55:30 - docling_serve.app - Health check requested
INFO:	12:55:30 - uvicorn.access - 172.17.0.1:36974 - "GET /health HTTP/1.1" 200
INFO:	12:55:30 - docling_serve.app - Health check requested
INFO:	12:55:30 - uvicorn.access - 172.17.0.1:36990 - "GET /health HTTP/1.1" 200
INFO:	12:55:30 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:55:30 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:55:30 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:55:30 - docling_serve.app - [TENANT_ID] Task b8495b58-463c-40fd-bbb9-e2668f14aa3b created with tenant_id='default'
INFO:	12:55:30 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task b8495b58-463c-40fd-bbb9-e2668f14aa3b
INFO:	12:55:30 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:55:30 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	12:55:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 12:55:30,241 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:55:30,241 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:55:30,359 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:55:30,359 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:55:30,411 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:55:30,412 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:55:30 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:55:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 445/770 [00:00<00:00, 4447.12it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4315.66it/s]
INFO:	12:55:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:55:32 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:55:32 - docling.document_converter - Going to convert document batch...
INFO:	12:55:32 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:55:32 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:55:32 - docling.document_converter - Finished converting document file in 0.60 sec.
WARNING:	12:55:32 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	12:55:32 - docling_jobkit.convert.results - Processed 1 docs in 0.67 seconds.
INFO:	12:55:32 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job b8495b58-463c-40fd-bbb9-e2668f14aa3b in 0.67 seconds
INFO:	12:55:34 - uvicorn.access - 172.17.0.1:36990 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:55:34 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:55:34 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:55:34 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:55:34 - docling_serve.app - [TENANT_ID] Task a6039d02-6581-438e-a1f9-eb59be25e0aa created with tenant_id='default'
INFO:	12:55:34 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task a6039d02-6581-438e-a1f9-eb59be25e0aa
INFO:	12:55:34 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:55:34 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	12:55:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 12:55:34,267 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:55:34,268 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:55:34,396 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:55:34,396 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:55:34,452 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:55:34,453 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:55:34 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:55:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 455/770 [00:00<00:00, 4532.83it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4561.65it/s]
INFO:	12:55:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:55:36 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:55:36 - docling.document_converter - Going to convert document batch...
INFO:	12:55:36 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:55:36 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:55:36 - docling.document_converter - Finished converting document file in 0.71 sec.
INFO:	12:55:36 - docling_jobkit.convert.results - Processed 1 docs in 0.71 seconds.
INFO:	12:55:36 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job a6039d02-6581-438e-a1f9-eb59be25e0aa in 0.71 seconds
INFO:	12:55:38 - uvicorn.access - 172.17.0.1:36990 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:55:38 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:55:38 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:55:38 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:55:38 - docling_serve.app - [TENANT_ID] Task e8ce8ce9-1026-49b1-8ba0-d43d1353e8b2 created with tenant_id='default'
INFO:	12:55:38 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task e8ce8ce9-1026-49b1-8ba0-d43d1353e8b2
INFO:	12:55:38 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:55:38 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 3eabf304acb4a56e9ef52b02ef69bccb
INFO:	12:55:38 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-17 12:55:38,262 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:55:38,262 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:55:38,366 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:55:38,366 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:55:38,415 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:55:38,416 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:55:38 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:55:38 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  71%|███████   | 546/770 [00:00<00:00, 5458.20it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5827.92it/s]
INFO:	12:55:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:55:39 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:55:39 - docling.document_converter - Going to convert document batch...
INFO:	12:55:39 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:55:39 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:55:40 - docling.document_converter - Finished converting document file in 0.56 sec.
INFO:	12:55:40 - docling_jobkit.convert.results - Processed 1 docs in 0.59 seconds.
INFO:	12:55:40 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job e8ce8ce9-1026-49b1-8ba0-d43d1353e8b2 in 0.59 seconds
INFO:	12:55:40 - uvicorn.access - 172.17.0.1:36990 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:55:40 - uvicorn.access - 172.17.0.1:36990 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	12:55:40 - uvicorn.access - 172.17.0.1:36990 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
2026-08-17 12:53:28.325152274 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:53:28,645 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:53:28,647 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:53:28,747 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:53:28,747 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:53:28,794 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:53:28,795 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 500/770 [00:00<00:00, 4969.92it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4990.70it/s]
[INFO] 2026-08-17 12:53:29,932 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:53:29,932 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:53:30,047 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:53:30,047 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:53:30,137 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:53:30,138 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 522/770 [00:00<00:00, 5212.01it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5177.69it/s]
WARNING:	12:53:31 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
WARNING:	12:53:31 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
[INFO] 2026-08-17 12:53:31,955 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:53:31,955 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:53:32,063 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:53:32,064 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:53:32,111 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:53:32,111 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▎   | 490/770 [00:00<00:00, 4865.90it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4934.21it/s]
[INFO] 2026-08-17 12:53:33,971 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:53:33,971 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:53:34,068 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:53:34,068 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:53:34,116 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:53:34,116 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 455/770 [00:00<00:00, 4548.62it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4746.44it/s]

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
2026-08-17 12:52:20.525073600 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:52:20,921 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:52:20,923 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:52:21,058 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:52:21,059 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:52:21,116 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:52:21,116 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 523/770 [00:00<00:00, 5226.84it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5094.18it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51324 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51328 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:52:23,613 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:52:23,614 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:52:23,743 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:52:23,743 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:52:23,846 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:52:23,846 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  72%|███████▏  | 554/770 [00:00<00:00, 5535.82it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5201.63it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51328 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:52:25,640 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:52:25,640 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:52:25,738 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:52:25,738 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:52:25,787 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:52:25,788 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  54%|█████▍    | 415/770 [00:00<00:00, 3920.42it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6152.78it/s]
INFO:     172.17.0.1:51328 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:52:27,655 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:52:27,656 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:52:27,757 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:52:27,758 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:52:27,807 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:52:27,808 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|█████▉    | 461/770 [00:00<00:00, 4609.17it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4853.21it/s]
INFO:     172.17.0.1:51328 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51328 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51328 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-17 12:50:14.916461031 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:50:15,231 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:50:15,234 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:50:15,345 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:50:15,345 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:50:15,405 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:50:15,406 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 502/770 [00:00<00:00, 5018.53it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5031.93it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43764 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43780 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:50:17,391 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:50:17,391 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:50:17,502 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:50:17,503 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:50:17,553 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:50:17,553 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 487/770 [00:00<00:00, 4867.85it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4826.23it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43780 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:50:19,403 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:50:19,403 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:50:19,504 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:50:19,504 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:50:19,551 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:50:19,552 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 509/770 [00:00<00:00, 5075.41it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4936.59it/s]
INFO:     172.17.0.1:43780 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:50:21,422 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:50:21,422 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:50:21,533 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:50:21,533 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:50:21,582 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:50:21,582 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 477/770 [00:00<00:00, 4768.56it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4804.08it/s]
INFO:     172.17.0.1:43780 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43780 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43780 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-17 12:48:54.268691875 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:48:54,644 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:48:54,646 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:48:54,770 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:48:54,771 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:48:54,824 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:48:54,824 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 523/770 [00:00<00:00, 5226.60it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5226.01it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51046 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51054 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:48:57,543 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:48:57,544 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:48:57,696 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:48:57,697 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:48:57,773 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:48:57,773 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 466/770 [00:00<00:00, 4649.79it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4970.99it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51054 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:48:59,625 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:48:59,625 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:48:59,748 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:48:59,749 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:48:59,870 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:48:59,871 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  57%|█████▋    | 436/770 [00:00<00:00, 4354.45it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4427.40it/s]
INFO:     172.17.0.1:51054 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:49:03,600 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:49:03,600 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:49:03,764 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:49:03,764 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:49:03,846 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:49:03,846 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  57%|█████▋    | 441/770 [00:00<00:00, 4376.20it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4841.57it/s]
INFO:     172.17.0.1:51054 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51054 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51054 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-17 12:46:40.123602361 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:46:40,749 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:46:40,751 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:46:40,850 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:46:40,851 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:46:40,896 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:46:40,897 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▎   | 490/770 [00:00<00:00, 4887.04it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4880.38it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43156 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43166 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:46:42,785 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:46:42,786 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:46:42,889 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:46:42,889 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:46:42,936 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:46:42,936 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 470/770 [00:00<00:00, 4695.99it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4714.01it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43166 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:46:44,795 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:46:44,796 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:46:44,907 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:46:44,908 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:46:44,955 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:46:44,955 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 456/770 [00:00<00:00, 4518.52it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4593.03it/s]
INFO:     172.17.0.1:43166 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:46:46,820 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:46:46,820 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-17 12:46:46,929 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:46:46,930 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-17 12:46:46,977 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:46:46,978 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|█████▉    | 461/770 [00:00<00:00, 4606.71it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4788.49it/s]
INFO:     172.17.0.1:43166 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43166 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43166 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-17 12:45:37.870897940 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:45:38,702 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:45:38,706 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:45:38,897 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:45:38,898 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:45:38,979 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:45:38,980 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  41%|████      | 313/770 [00:00<00:00, 3106.91it/s]Loading weights:  81%|████████  | 624/770 [00:00<00:00, 2865.64it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 3012.04it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46694 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46708 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:45:43,170 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:45:43,170 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:45:43,318 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:45:43,318 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:45:43,369 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:45:43,370 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 455/770 [00:00<00:00, 4543.14it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4387.68it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46708 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:45:45,204 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:45:45,205 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:45:45,321 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:45:45,321 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:45:45,370 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:45:45,370 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 527/770 [00:00<00:00, 5252.11it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5833.48it/s]
INFO:     172.17.0.1:46708 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-17 12:45:47,230 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:45:47,230 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:45:47,348 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:45:47,349 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:45:47,409 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:45:47,409 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 535/770 [00:00<00:00, 5333.75it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5220.79it/s]
INFO:     172.17.0.1:46708 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46708 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46708 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-17 12:43:07.665849613 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:43:08,179 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:43:08,181 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:43:08,276 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:43:08,276 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:43:08,332 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:43:08,332 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59772 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59788 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59788 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59788 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59788 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59788 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59788 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-17 12:40:58.671355253 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:40:59,208 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:40:59,209 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:40:59,307 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:40:59,307 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:40:59,350 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:40:59,351 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55866 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55882 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55882 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55882 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55882 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55882 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55882 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-17 12:38:56.335575378 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:38:56,878 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:38:56,880 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:38:56,984 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:38:56,985 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:38:57,032 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:38:57,032 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59312 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59316 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59316 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59316 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59316 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59316 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59316 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-17 12:36:54.669224098 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:36:55,215 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:36:55,216 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:36:55,309 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:36:55,310 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:36:55,352 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:36:55,353 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54936 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54938 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54938 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54938 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54938 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54938 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54938 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-17 12:34:53.813205265 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:34:54,372 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:34:54,376 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:34:54,464 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:34:54,464 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:34:54,508 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:34:54,508 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:44756 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44766 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44766 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44766 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44766 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44766 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44766 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-17 12:32:53.739672715 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:32:54,272 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:32:54,274 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:32:54,380 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:32:54,380 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:32:54,438 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:32:54,438 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:49784 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49796 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49796 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49796 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49796 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49796 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49796 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-17 12:30:43.385364302 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:30:43,889 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:30:43,890 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:30:43,989 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:30:43,989 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:30:44,039 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:30:44,039 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:42424 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42436 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42436 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42436 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42436 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42436 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42436 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-17 12:28:52.081015615 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-17 12:28:52,582 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:28:52,584 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:28:52,682 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:28:52,683 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:28:52,732 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:28:52,732 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:40182 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40192 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40192 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40192 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40192 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40192 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40192 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-08-17 12:26:40,060 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:26:40,061 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:26:40,127 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:26:40,127 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:26:40,163 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:26:40,163 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55046 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55052 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55052 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55052 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55052 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55052 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55052 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-08-17 12:24:46,424 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:24:46,426 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:24:46,504 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:24:46,504 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:24:46,542 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:24:46,543 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:32824 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:32826 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:32826 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:32826 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:32826 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:32826 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:32826 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-08-17 12:22:13,227 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:22:13,228 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:22:13,308 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:22:13,309 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:22:13,345 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:22:13,345 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:40370 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40374 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40374 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40374 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40374 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40374 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40374 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-08-17 12:19:42,075 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:19:42,076 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:19:42,147 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:19:42,148 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:19:42,186 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:19:42,186 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:42672 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42676 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42676 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42676 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42676 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42676 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42676 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-08-17 12:17:15,071 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:17:15,073 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:17:15,146 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:17:15,146 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:17:15,184 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:17:15,184 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:60302 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60310 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60310 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60310 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60310 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60310 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60310 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-08-17 12:14:54,796 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:14:54,798 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-17 12:14:54,875 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:14:54,875 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-17 12:14:54,911 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-17 12:14:54,912 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56406 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56414 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56414 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56414 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56414 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56414 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56414 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50080 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50086 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50086 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50086 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50086 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50086 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50086 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:48920 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48922 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48922 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48922 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48922 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48922 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48922 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:44246 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44252 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44252 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44252 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44252 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44252 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44252 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:41126 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41130 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41130 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41130 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41130 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41130 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41130 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:42682 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42686 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42686 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42686 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42686 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42686 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42686 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:38016 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38032 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38032 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38032 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38032 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38032 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38032 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52002 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52018 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52018 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52018 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52018 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52018 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52018 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:57932 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57946 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57946 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57946 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57946 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57946 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57946 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:47088 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47098 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47098 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47098 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47098 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47098 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47098 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:37942 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37956 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37956 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37956 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37956 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37956 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37956 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:33114 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33120 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33120 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33120 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33120 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33120 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33120 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:56024 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56034 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56034 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56034 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:37156 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37172 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37172 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37172 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37172 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37172 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37172 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:37892 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37896 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37896 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37896 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

