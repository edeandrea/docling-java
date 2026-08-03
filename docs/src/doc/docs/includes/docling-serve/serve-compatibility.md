# Results for ghcr.io/docling-project/docling-serve as of 2026-08-03T05:21:58.408167679Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
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
INFO:	05:21:44 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:21:44 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:21:44 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	05:21:44 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	05:21:45 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	05:21:45 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:21:45 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:21:45 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/healthz$,/readyz$,/health$,/metrics$,/livez$,/ready$)
INFO:	05:21:45 - uvicorn.error - Started server process [1]
INFO:	05:21:45 - uvicorn.error - Waiting for application startup.
INFO:	05:21:47 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:21:47 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:21:47 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:21:47 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:21:47 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:47 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash caff667a02b7f037838d32d34acfe0b0
INFO:	05:21:47 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:21:47 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	05:21:47 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-03 05:21:47.903196848 [W:onnxruntime:Default, device_discovery.cc:134 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:21:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:21:48,094 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:48,095 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-03 05:21:48,138 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:48,138 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:21:48,175 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:48,176 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:21:48 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▌ | 658/770 [00:00<00:00, 6561.72it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6673.85it/s]
INFO:	05:21:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:48 - uvicorn.error - Application startup complete.
INFO:	05:21:48 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:21:49 - docling_serve.app - Health check requested
INFO:	05:21:49 - uvicorn.access - 172.17.0.1:55880 - "GET /health HTTP/1.1" 200
INFO:	05:21:49 - docling_serve.app - Health check requested
INFO:	05:21:49 - uvicorn.access - 172.17.0.1:55888 - "GET /health HTTP/1.1" 200
INFO:	05:21:49 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:21:49 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:21:49 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:21:49 - docling_serve.app - [TENANT_ID] Task 0ee427cf-5177-4c8e-9754-c900cb520787 created with tenant_id='default'
INFO:	05:21:49 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 0ee427cf-5177-4c8e-9754-c900cb520787
INFO:	05:21:49 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:49 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash ab12ef348c8fc273bf2be7a49773b303
INFO:	05:21:49 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:21:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:21:49,888 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:49,888 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-03 05:21:49,937 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:49,938 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:21:49,976 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:49,977 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:21:50 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▌ | 657/770 [00:00<00:00, 6564.25it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6613.63it/s]
INFO:	05:21:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:51 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:21:51 - docling.document_converter - Going to convert document batch...
INFO:	05:21:51 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:21:51 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:21:51 - docling.document_converter - Finished converting document file in 0.39 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	05:21:51 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:21:51 - docling_jobkit.convert.results - Processed 1 docs in 0.43 seconds.
INFO:	05:21:51 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 0ee427cf-5177-4c8e-9754-c900cb520787 in 0.43 seconds
INFO:	05:21:51 - uvicorn.access - 172.17.0.1:55888 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:21:51 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:21:51 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:21:51 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:21:51 - docling_serve.app - [TENANT_ID] Task b2598167-aa8d-46d1-950f-f7afe1ef7109 created with tenant_id='default'
INFO:	05:21:51 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task b2598167-aa8d-46d1-950f-f7afe1ef7109
INFO:	05:21:51 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:51 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash ab12ef348c8fc273bf2be7a49773b303
INFO:	05:21:51 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:21:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:21:51,924 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:51,924 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-03 05:21:51,974 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:51,974 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:21:52,013 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:52,013 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:21:52 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▌ | 656/770 [00:00<00:00, 6536.10it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6679.57it/s]
INFO:	05:21:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:52 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:21:52 - docling.document_converter - Going to convert document batch...
INFO:	05:21:52 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:21:52 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:21:52 - docling.document_converter - Finished converting document file in 0.24 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:21:52 - docling_jobkit.convert.results - Processed 1 docs in 0.24 seconds.
INFO:	05:21:52 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job b2598167-aa8d-46d1-950f-f7afe1ef7109 in 0.24 seconds
INFO:	05:21:53 - uvicorn.access - 172.17.0.1:55888 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:21:53 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:21:53 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:21:53 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:21:53 - docling_serve.app - [TENANT_ID] Task a49d8a5f-be97-4b69-b18f-bfda61e1cfbc created with tenant_id='default'
INFO:	05:21:53 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task a49d8a5f-be97-4b69-b18f-bfda61e1cfbc
INFO:	05:21:53 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:53 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash b3849eabdc7ecae5f3d54428a0162342
INFO:	05:21:53 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:21:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:21:53,932 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:53,933 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-03 05:21:53,980 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:53,980 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:21:54,020 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:54,021 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:21:54 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:54 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▍ | 654/770 [00:00<00:00, 6520.34it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6598.90it/s]
INFO:	05:21:54 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:54 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:21:54 - docling.document_converter - Going to convert document batch...
INFO:	05:21:54 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:21:54 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:21:54 - docling.document_converter - Finished converting document file in 0.21 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:21:54 - docling_jobkit.convert.results - Processed 1 docs in 0.23 seconds.
INFO:	05:21:54 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job a49d8a5f-be97-4b69-b18f-bfda61e1cfbc in 0.23 seconds
INFO:	05:21:55 - uvicorn.access - 172.17.0.1:55888 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:21:56 - uvicorn.access - 172.17.0.1:55888 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:21:56 - uvicorn.access - 172.17.0.1:55888 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:20:49 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:20:49 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:20:49 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	05:20:50 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	05:20:50 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:20:50 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:20:50 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/metrics$,/ready$,/healthz$,/health$,/livez$)
INFO:	05:20:50 - uvicorn.error - Started server process [1]
INFO:	05:20:50 - uvicorn.error - Waiting for application startup.
INFO:	05:20:53 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:20:54 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:20:54 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:20:54 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:20:54 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:20:54 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	05:20:54 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:20:54 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	05:20:54 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-03 05:20:54.377505519 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:20:54 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:20:54,673 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:20:54,674 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-03 05:20:54,767 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:20:54,768 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:20:54,852 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:20:54,852 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:20:55 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:20:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 8066.45it/s]
INFO:	05:20:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:20:56 - uvicorn.error - Application startup complete.
INFO:	05:20:56 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:20:57 - docling_serve.app - Health check requested
INFO:	05:20:57 - uvicorn.access - 172.17.0.1:52988 - "GET /health HTTP/1.1" 200
INFO:	05:20:57 - docling_serve.app - Health check requested
INFO:	05:20:57 - uvicorn.access - 172.17.0.1:53000 - "GET /health HTTP/1.1" 200
INFO:	05:20:57 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:20:57 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:20:57 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:20:57 - docling_serve.app - [TENANT_ID] Task 198b1270-88f6-4e9a-842e-6abebc3dd254 created with tenant_id='default'
INFO:	05:20:57 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 198b1270-88f6-4e9a-842e-6abebc3dd254
INFO:	05:20:57 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:20:57 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	05:20:57 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:20:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:20:57,318 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:20:57,319 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-03 05:20:57,420 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:20:57,420 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:20:57,473 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:20:57,474 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:20:57 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:20:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7936.94it/s]
INFO:	05:20:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:20:59 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:20:59 - docling.document_converter - Going to convert document batch...
INFO:	05:20:59 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:20:59 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:20:59 - docling.document_converter - Finished converting document file in 0.64 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	05:20:59 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:20:59 - docling_jobkit.convert.results - Processed 1 docs in 0.69 seconds.
INFO:	05:20:59 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 198b1270-88f6-4e9a-842e-6abebc3dd254 in 0.69 seconds
INFO:	05:21:01 - uvicorn.access - 172.17.0.1:53000 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:21:01 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:21:01 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:21:01 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:21:01 - docling_serve.app - [TENANT_ID] Task 3bfde75c-1148-4d85-8146-850afdd417fa created with tenant_id='default'
INFO:	05:21:01 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 3bfde75c-1148-4d85-8146-850afdd417fa
INFO:	05:21:01 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:01 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	05:21:01 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:21:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:21:01,349 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:01,349 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-03 05:21:01,411 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:01,411 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:21:01,552 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:01,552 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:21:01 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  82%|████████▏ | 634/770 [00:00<00:00, 6336.79it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6419.87it/s]
INFO:	05:21:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:03 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:21:03 - docling.document_converter - Going to convert document batch...
INFO:	05:21:03 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:21:03 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:21:03 - docling.document_converter - Finished converting document file in 0.32 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:21:03 - docling_jobkit.convert.results - Processed 1 docs in 0.32 seconds.
INFO:	05:21:03 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 3bfde75c-1148-4d85-8146-850afdd417fa in 0.32 seconds
INFO:	05:21:05 - uvicorn.access - 172.17.0.1:53000 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:21:05 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:21:05 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:21:05 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:21:05 - docling_serve.app - [TENANT_ID] Task 86fc525a-040c-4a49-86dd-b347bf0687d8 created with tenant_id='default'
INFO:	05:21:05 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 86fc525a-040c-4a49-86dd-b347bf0687d8
INFO:	05:21:05 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:05 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	05:21:05 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:21:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:21:05,358 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:05,358 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-03 05:21:05,468 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:05,468 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:21:05,528 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:21:05,528 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:21:05 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  93%|█████████▎| 716/770 [00:00<00:00, 7155.69it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7361.28it/s]
INFO:	05:21:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:07 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:21:07 - docling.document_converter - Going to convert document batch...
INFO:	05:21:07 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:21:07 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:21:07 - docling.document_converter - Finished converting document file in 0.35 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:21:07 - docling_jobkit.convert.results - Processed 1 docs in 0.38 seconds.
INFO:	05:21:07 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 86fc525a-040c-4a49-86dd-b347bf0687d8 in 0.38 seconds
INFO:	05:21:09 - uvicorn.access - 172.17.0.1:53000 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:21:09 - uvicorn.access - 172.17.0.1:53000 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:21:09 - uvicorn.access - 172.17.0.1:53000 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:19:24 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:19:24 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:19:24 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:19:24 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:19:24 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/ready$,/metrics$,/livez$,/healthz$,/readyz$)
INFO:	05:19:24 - uvicorn.error - Started server process [1]
INFO:	05:19:24 - uvicorn.error - Waiting for application startup.
INFO:	05:19:28 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:19:28 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:19:28 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:19:28 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:19:28 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:19:28 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	05:19:28 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:19:28 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	05:19:29 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-03 05:19:29.035405552 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:19:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:19:29,339 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:19:29,340 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-03 05:19:29,417 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:19:29,417 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:19:29,504 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:19:29,505 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:19:29 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:19:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  83%|████████▎ | 640/770 [00:00<00:00, 6317.21it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6385.20it/s]
INFO:	05:19:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:19:30 - uvicorn.error - Application startup complete.
INFO:	05:19:30 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:19:31 - docling_serve.app - Health check requested
INFO:	05:19:31 - uvicorn.access - 172.17.0.1:35196 - "GET /health HTTP/1.1" 200
INFO:	05:19:31 - docling_serve.app - Health check requested
INFO:	05:19:31 - uvicorn.access - 172.17.0.1:35210 - "GET /health HTTP/1.1" 200
INFO:	05:19:31 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:19:31 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:19:31 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:19:31 - docling_serve.app - [TENANT_ID] Task 7dc617e5-7c7e-4add-a1f8-dcdf59b358f0 created with tenant_id='default'
INFO:	05:19:31 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 7dc617e5-7c7e-4add-a1f8-dcdf59b358f0
INFO:	05:19:31 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:19:31 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	05:19:31 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:19:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:19:31,491 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:19:31,492 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-03 05:19:31,548 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:19:31,549 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:19:31,595 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:19:31,595 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:19:31 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:19:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  80%|████████  | 618/770 [00:00<00:00, 6159.01it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5978.71it/s]
INFO:	05:19:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:19:32 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:19:32 - docling.document_converter - Going to convert document batch...
INFO:	05:19:32 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:19:32 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:19:32 - docling.document_converter - Finished converting document file in 0.37 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	05:19:32 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:19:32 - docling_jobkit.convert.results - Processed 1 docs in 0.42 seconds.
INFO:	05:19:32 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 7dc617e5-7c7e-4add-a1f8-dcdf59b358f0 in 0.42 seconds
INFO:	05:19:33 - uvicorn.access - 172.17.0.1:35210 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:19:33 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:19:33 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:19:33 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:19:33 - docling_serve.app - [TENANT_ID] Task 0757bfc0-3ef3-4e0e-a568-ac7f73849039 created with tenant_id='default'
INFO:	05:19:33 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 0757bfc0-3ef3-4e0e-a568-ac7f73849039
INFO:	05:19:33 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:19:33 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	05:19:33 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:19:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:19:33,534 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:19:33,534 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-03 05:19:33,591 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:19:33,591 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:19:33,721 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:19:33,721 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:19:33 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:19:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  91%|█████████ | 702/770 [00:00<00:00, 7011.33it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7006.72it/s]
INFO:	05:19:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:19:35 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:19:35 - docling.document_converter - Going to convert document batch...
INFO:	05:19:35 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:19:35 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:19:35 - docling.document_converter - Finished converting document file in 0.37 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:19:35 - docling_jobkit.convert.results - Processed 1 docs in 0.38 seconds.
INFO:	05:19:35 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 0757bfc0-3ef3-4e0e-a568-ac7f73849039 in 0.38 seconds
INFO:	05:19:35 - uvicorn.access - 172.17.0.1:35210 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:19:35 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:19:35 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:19:35 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:19:35 - docling_serve.app - [TENANT_ID] Task 772fa526-e719-4acf-95fa-ee8e5a6c50f6 created with tenant_id='default'
INFO:	05:19:35 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 772fa526-e719-4acf-95fa-ee8e5a6c50f6
INFO:	05:19:35 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:19:35 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	05:19:35 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:19:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:19:35,529 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:19:35,529 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-08-03 05:19:35,634 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:19:35,634 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:19:35,734 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:19:35,734 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:19:35 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:19:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 10255.25it/s]
INFO:	05:19:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:19:36 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:19:37 - docling.document_converter - Going to convert document batch...
INFO:	05:19:37 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:19:37 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:19:37 - docling.document_converter - Finished converting document file in 0.31 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:19:37 - docling_jobkit.convert.results - Processed 1 docs in 0.34 seconds.
INFO:	05:19:37 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 772fa526-e719-4acf-95fa-ee8e5a6c50f6 in 0.34 seconds
INFO:	05:19:37 - uvicorn.access - 172.17.0.1:35210 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:19:37 - uvicorn.access - 172.17.0.1:35210 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:19:37 - uvicorn.access - 172.17.0.1:35210 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:17:53 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:17:53 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:17:53 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:17:53 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:17:53 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/metrics$,/healthz$,/ready$,/livez$,/readyz$)
INFO:	05:17:53 - uvicorn.error - Started server process [1]
INFO:	05:17:53 - uvicorn.error - Waiting for application startup.
INFO:	05:17:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:17:56 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:17:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:17:56 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:17:56 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:17:56 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c4d6547d10e26a777a530d63ca01a1a1
INFO:	05:17:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:17:56 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	05:17:56 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-08-03 05:17:57.033463411 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:17:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:17:57,450 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:17:57,452 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:17:57,561 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:17:57,562 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:17:57,607 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:17:57,607 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:17:57 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:17:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  83%|████████▎ | 640/770 [00:00<00:00, 6398.95it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6353.28it/s]
INFO:	05:17:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:17:58 - uvicorn.error - Application startup complete.
INFO:	05:17:58 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:17:59 - docling_serve.app - Health check requested
INFO:	05:17:59 - uvicorn.access - 172.17.0.1:36056 - "GET /health HTTP/1.1" 200
INFO:	05:17:59 - docling_serve.app - Health check requested
INFO:	05:17:59 - uvicorn.access - 172.17.0.1:36072 - "GET /health HTTP/1.1" 200
INFO:	05:17:59 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:17:59 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:17:59 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:17:59 - docling_serve.app - [TENANT_ID] Task ba8613e8-d220-4aad-927d-8dfd021a9f57 created with tenant_id='default'
INFO:	05:17:59 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task ba8613e8-d220-4aad-927d-8dfd021a9f57
INFO:	05:17:59 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:17:59 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	05:17:59 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:17:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:17:59,101 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:17:59,101 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:17:59,187 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:17:59,187 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:17:59,233 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:17:59,233 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:17:59 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:17:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  80%|███████▉  | 614/770 [00:00<00:00, 6100.11it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6185.99it/s]
INFO:	05:17:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:18:00 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:18:00 - docling.document_converter - Going to convert document batch...
INFO:	05:18:00 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:18:00 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:18:00 - docling.document_converter - Finished converting document file in 0.55 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	05:18:00 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:18:00 - docling_jobkit.convert.results - Processed 1 docs in 0.59 seconds.
INFO:	05:18:00 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job ba8613e8-d220-4aad-927d-8dfd021a9f57 in 0.59 seconds
INFO:	05:18:01 - uvicorn.access - 172.17.0.1:36072 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:18:01 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:18:01 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:18:01 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:18:01 - docling_serve.app - [TENANT_ID] Task 6302cb3a-1ebc-4cea-9a64-75d48cbfd188 created with tenant_id='default'
INFO:	05:18:01 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 6302cb3a-1ebc-4cea-9a64-75d48cbfd188
INFO:	05:18:01 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:18:01 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	05:18:01 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:18:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:18:01,117 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:18:01,117 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:18:01,209 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:18:01,209 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:18:01,257 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:18:01,257 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:18:01 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:18:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▌ | 657/770 [00:00<00:00, 6527.35it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6477.57it/s]
INFO:	05:18:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:18:02 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:18:02 - docling.document_converter - Going to convert document batch...
INFO:	05:18:02 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:18:02 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:18:02 - docling.document_converter - Finished converting document file in 0.37 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:18:02 - docling_jobkit.convert.results - Processed 1 docs in 0.37 seconds.
INFO:	05:18:02 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 6302cb3a-1ebc-4cea-9a64-75d48cbfd188 in 0.37 seconds
INFO:	05:18:03 - uvicorn.access - 172.17.0.1:36072 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:18:03 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:18:03 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:18:03 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:18:03 - docling_serve.app - [TENANT_ID] Task ee4a1ce6-f6ce-4cde-a534-f1a6f1eb596b created with tenant_id='default'
INFO:	05:18:03 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task ee4a1ce6-f6ce-4cde-a534-f1a6f1eb596b
INFO:	05:18:03 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:18:03 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 63e8839d1103b03d45382915dba33c89
INFO:	05:18:03 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:18:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:18:03,128 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:18:03,128 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:18:03,212 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:18:03,212 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:18:03,259 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:18:03,259 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:18:03 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:18:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  73%|███████▎  | 564/770 [00:00<00:00, 5632.61it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5745.05it/s]
INFO:	05:18:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:18:04 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:18:04 - docling.document_converter - Going to convert document batch...
INFO:	05:18:04 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:18:04 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:18:04 - docling.document_converter - Finished converting document file in 0.33 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:18:04 - docling_jobkit.convert.results - Processed 1 docs in 0.35 seconds.
INFO:	05:18:04 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job ee4a1ce6-f6ce-4cde-a534-f1a6f1eb596b in 0.35 seconds
INFO:	05:18:05 - uvicorn.access - 172.17.0.1:36072 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:18:05 - uvicorn.access - 172.17.0.1:36072 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:18:05 - uvicorn.access - 172.17.0.1:36072 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:16:39 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:16:39 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:16:39 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:16:39 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:16:39 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/metrics$,/health$,/livez$,/ready$,/healthz$,/readyz$)
INFO:	05:16:39 - uvicorn.error - Started server process [1]
INFO:	05:16:39 - uvicorn.error - Waiting for application startup.
INFO:	05:16:43 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:16:43 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:16:43 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:16:43 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:16:43 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:16:43 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash f446dcc5a1a7c6aff458e30cab474a9e
INFO:	05:16:43 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:16:43 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-03 05:16:43.122080895 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:16:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:16:43,397 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:16:43,398 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:16:43,494 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:16:43,494 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:16:43,536 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:16:43,536 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:16:43 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:16:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  81%|████████  | 623/770 [00:00<00:00, 6208.48it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6382.21it/s]
INFO:	05:16:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:16:44 - uvicorn.error - Application startup complete.
INFO:	05:16:44 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:16:44 - docling_serve.app - Health check requested
INFO:	05:16:44 - uvicorn.access - 172.17.0.1:48960 - "GET /health HTTP/1.1" 200
INFO:	05:16:44 - docling_serve.app - Health check requested
INFO:	05:16:44 - uvicorn.access - 172.17.0.1:48976 - "GET /health HTTP/1.1" 200
INFO:	05:16:44 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:16:44 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:16:44 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:16:44 - docling_serve.app - [TENANT_ID] Task c31e2555-d63a-44d8-a069-5b20ac7587c5 created with tenant_id='default'
INFO:	05:16:44 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task c31e2555-d63a-44d8-a069-5b20ac7587c5
INFO:	05:16:44 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:16:44 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	05:16:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:16:44,619 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:16:44,619 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:16:44,720 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:16:44,720 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:16:44,766 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:16:44,767 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:16:44 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:16:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  91%|█████████ | 699/770 [00:00<00:00, 6986.48it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6983.19it/s]
INFO:	05:16:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:16:46 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:16:46 - docling.document_converter - Going to convert document batch...
INFO:	05:16:46 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:16:46 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:16:46 - docling.document_converter - Finished converting document file in 0.43 sec.
WARNING:	05:16:46 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:16:46 - docling_jobkit.convert.results - Processed 1 docs in 0.48 seconds.
INFO:	05:16:46 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job c31e2555-d63a-44d8-a069-5b20ac7587c5 in 0.48 seconds
INFO:	05:16:46 - uvicorn.access - 172.17.0.1:48976 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:16:46 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:16:46 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:16:46 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:16:46 - docling_serve.app - [TENANT_ID] Task 7cc7908f-b194-4967-8e9e-cd03db30222a created with tenant_id='default'
INFO:	05:16:46 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 7cc7908f-b194-4967-8e9e-cd03db30222a
INFO:	05:16:46 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:16:46 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	05:16:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:16:46,709 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:16:46,709 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:16:46,826 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:16:46,826 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:16:46,911 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:16:46,911 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:16:47 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:16:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  87%|████████▋ | 670/770 [00:00<00:00, 6696.96it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6606.78it/s]
INFO:	05:16:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:16:48 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:16:48 - docling.document_converter - Going to convert document batch...
INFO:	05:16:48 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:16:48 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:16:48 - docling.document_converter - Finished converting document file in 0.58 sec.
INFO:	05:16:48 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	05:16:48 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 7cc7908f-b194-4967-8e9e-cd03db30222a in 0.58 seconds
INFO:	05:16:50 - uvicorn.access - 172.17.0.1:48976 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:16:50 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:16:50 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:16:50 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:16:50 - docling_serve.app - [TENANT_ID] Task b9200fef-cc36-4a09-8eb0-0c5b8b91c987 created with tenant_id='default'
INFO:	05:16:50 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task b9200fef-cc36-4a09-8eb0-0c5b8b91c987
INFO:	05:16:50 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:16:50 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e50b6140ec7ee9be0d0fea6ba20c9795
INFO:	05:16:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:16:50,680 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:16:50,680 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:16:50,810 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:16:50,810 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:16:50,860 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:16:50,861 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:16:51 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:16:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  77%|███████▋  | 590/770 [00:00<00:00, 5897.07it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5816.65it/s]
INFO:	05:16:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:16:52 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:16:52 - docling.document_converter - Going to convert document batch...
INFO:	05:16:52 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:16:52 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:16:52 - docling.document_converter - Finished converting document file in 0.40 sec.
INFO:	05:16:52 - docling_jobkit.convert.results - Processed 1 docs in 0.42 seconds.
INFO:	05:16:52 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job b9200fef-cc36-4a09-8eb0-0c5b8b91c987 in 0.42 seconds
INFO:	05:16:52 - uvicorn.access - 172.17.0.1:48976 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:16:52 - uvicorn.access - 172.17.0.1:48976 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:16:52 - uvicorn.access - 172.17.0.1:48976 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:15:16 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:15:16 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:15:16 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:15:16 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:15:16 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/metrics$,/healthz$,/readyz$,/livez$,/health$,/ready$)
INFO:	05:15:16 - uvicorn.error - Started server process [1]
INFO:	05:15:16 - uvicorn.error - Waiting for application startup.
INFO:	05:15:19 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:15:19 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:15:19 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:15:19 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:15:19 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:15:19 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	05:15:19 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:15:19 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-03 05:15:20.000182693 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:15:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:15:20,285 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:15:20,286 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:15:20,383 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:15:20,383 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:15:20,429 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:15:20,429 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:15:20 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:15:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  80%|████████  | 616/770 [00:00<00:00, 6155.54it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6139.68it/s]
INFO:	05:15:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:15:21 - uvicorn.error - Application startup complete.
INFO:	05:15:21 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:15:21 - docling_serve.app - Health check requested
INFO:	05:15:21 - uvicorn.access - 172.17.0.1:44434 - "GET /health HTTP/1.1" 200
INFO:	05:15:21 - docling_serve.app - Health check requested
INFO:	05:15:21 - uvicorn.access - 172.17.0.1:44444 - "GET /health HTTP/1.1" 200
INFO:	05:15:21 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:15:21 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:15:21 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:15:21 - docling_serve.app - [TENANT_ID] Task 69b8b682-08a5-44fe-be03-5cdebc43ac60 created with tenant_id='default'
INFO:	05:15:21 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 69b8b682-08a5-44fe-be03-5cdebc43ac60
INFO:	05:15:21 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:15:21 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	05:15:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:15:21,530 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:15:21,531 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:15:21,625 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:15:21,626 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:15:21,671 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:15:21,672 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:15:21 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:15:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  83%|████████▎ | 642/770 [00:00<00:00, 6407.49it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6375.71it/s]
INFO:	05:15:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:15:22 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:15:22 - docling.document_converter - Going to convert document batch...
INFO:	05:15:22 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:15:22 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:15:22 - docling.document_converter - Finished converting document file in 0.38 sec.
WARNING:	05:15:22 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:15:22 - docling_jobkit.convert.results - Processed 1 docs in 0.41 seconds.
INFO:	05:15:22 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 69b8b682-08a5-44fe-be03-5cdebc43ac60 in 0.41 seconds
INFO:	05:15:23 - uvicorn.access - 172.17.0.1:44444 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:15:23 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:15:23 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:15:23 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:15:23 - docling_serve.app - [TENANT_ID] Task e40ed713-5ec2-4d84-b136-3fcded81f6b6 created with tenant_id='default'
INFO:	05:15:23 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task e40ed713-5ec2-4d84-b136-3fcded81f6b6
INFO:	05:15:23 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:15:23 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	05:15:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:15:23,546 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:15:23,546 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:15:23,633 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:15:23,633 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:15:23,679 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:15:23,679 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:15:23 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:15:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  80%|████████  | 619/770 [00:00<00:00, 6187.75it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6257.61it/s]
INFO:	05:15:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:15:24 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:15:24 - docling.document_converter - Going to convert document batch...
INFO:	05:15:24 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:15:24 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:15:24 - docling.document_converter - Finished converting document file in 0.21 sec.
INFO:	05:15:24 - docling_jobkit.convert.results - Processed 1 docs in 0.21 seconds.
INFO:	05:15:24 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job e40ed713-5ec2-4d84-b136-3fcded81f6b6 in 0.21 seconds
INFO:	05:15:25 - uvicorn.access - 172.17.0.1:44444 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:15:25 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:15:25 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:15:25 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:15:25 - docling_serve.app - [TENANT_ID] Task 4be5e046-7eb6-4adf-8ca5-99eaf61ea61c created with tenant_id='default'
INFO:	05:15:25 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 4be5e046-7eb6-4adf-8ca5-99eaf61ea61c
INFO:	05:15:25 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:15:25 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	05:15:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:15:25,562 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:15:25,562 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:15:25,648 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:15:25,649 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:15:25,695 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:15:25,695 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:15:25 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:15:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  81%|████████  | 625/770 [00:00<00:00, 6249.04it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6245.33it/s]
INFO:	05:15:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:15:26 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:15:26 - docling.document_converter - Going to convert document batch...
INFO:	05:15:26 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:15:26 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:15:26 - docling.document_converter - Finished converting document file in 0.21 sec.
INFO:	05:15:26 - docling_jobkit.convert.results - Processed 1 docs in 0.22 seconds.
INFO:	05:15:26 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 4be5e046-7eb6-4adf-8ca5-99eaf61ea61c in 0.22 seconds
INFO:	05:15:27 - uvicorn.access - 172.17.0.1:44444 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:15:27 - uvicorn.access - 172.17.0.1:44444 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:15:27 - uvicorn.access - 172.17.0.1:44444 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:14:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:14:01 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:14:01 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:14:01 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:14:01 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/livez$,/healthz$,/metrics$,/health$,/ready$)
INFO:	05:14:01 - uvicorn.error - Started server process [1]
INFO:	05:14:01 - uvicorn.error - Waiting for application startup.
INFO:	05:14:04 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:14:04 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:14:04 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:14:04 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:14:04 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:14:04 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	05:14:04 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:14:04 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-03 05:14:04.466457342 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:14:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:14:04,727 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:14:04,729 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:14:04,815 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:14:04,816 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:14:04,863 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:14:04,863 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:14:04 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:14:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▌ | 656/770 [00:00<00:00, 6557.66it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6647.92it/s]
INFO:	05:14:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:14:05 - uvicorn.error - Application startup complete.
INFO:	05:14:05 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:14:05 - docling_serve.app - Health check requested
INFO:	05:14:05 - uvicorn.access - 172.17.0.1:40058 - "GET /health HTTP/1.1" 200
INFO:	05:14:05 - docling_serve.app - Health check requested
INFO:	05:14:05 - uvicorn.access - 172.17.0.1:40062 - "GET /health HTTP/1.1" 200
INFO:	05:14:05 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:14:05 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:14:05 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:14:05 - docling_serve.app - [TENANT_ID] Task 8d0b937f-b877-4082-8666-078f59278d17 created with tenant_id='default'
INFO:	05:14:05 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8d0b937f-b877-4082-8666-078f59278d17
INFO:	05:14:05 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:14:05 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	05:14:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:14:05,893 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:14:05,894 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:14:05,982 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:14:05,983 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:14:06,028 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:14:06,028 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:14:06 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:14:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  78%|███████▊  | 603/770 [00:00<00:00, 6022.21it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6433.88it/s]
INFO:	05:14:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:14:07 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:14:07 - docling.document_converter - Going to convert document batch...
INFO:	05:14:07 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:14:07 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:14:07 - docling.document_converter - Finished converting document file in 0.39 sec.
WARNING:	05:14:07 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:14:07 - docling_jobkit.convert.results - Processed 1 docs in 0.43 seconds.
INFO:	05:14:07 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8d0b937f-b877-4082-8666-078f59278d17 in 0.43 seconds
INFO:	05:14:07 - uvicorn.access - 172.17.0.1:40062 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:14:07 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:14:07 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:14:07 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:14:07 - docling_serve.app - [TENANT_ID] Task c967807d-2a75-4f28-98e4-0c998e55f8d3 created with tenant_id='default'
INFO:	05:14:07 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task c967807d-2a75-4f28-98e4-0c998e55f8d3
INFO:	05:14:07 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:14:07 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	05:14:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:14:07,933 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:14:07,933 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:14:08,050 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:14:08,050 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:14:08,100 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:14:08,100 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:14:08 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:14:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  76%|███████▌  | 586/770 [00:00<00:00, 5827.83it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5850.37it/s]
INFO:	05:14:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:14:09 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:14:09 - docling.document_converter - Going to convert document batch...
INFO:	05:14:09 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:14:09 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:14:09 - docling.document_converter - Finished converting document file in 0.35 sec.
INFO:	05:14:09 - docling_jobkit.convert.results - Processed 1 docs in 0.35 seconds.
INFO:	05:14:09 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job c967807d-2a75-4f28-98e4-0c998e55f8d3 in 0.35 seconds
INFO:	05:14:09 - uvicorn.access - 172.17.0.1:40062 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:14:09 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:14:09 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:14:09 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:14:09 - docling_serve.app - [TENANT_ID] Task 6a35a727-f94d-4942-af5d-d2bead917836 created with tenant_id='default'
INFO:	05:14:09 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 6a35a727-f94d-4942-af5d-d2bead917836
INFO:	05:14:09 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:14:09 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	05:14:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:14:09,947 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:14:09,947 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:14:10,086 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:14:10,086 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:14:10,136 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:14:10,136 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:14:10 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:14:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  88%|████████▊ | 678/770 [00:00<00:00, 6778.36it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6732.32it/s]
INFO:	05:14:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:14:11 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:14:11 - docling.document_converter - Going to convert document batch...
INFO:	05:14:11 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:14:11 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:14:11 - docling.document_converter - Finished converting document file in 0.44 sec.
INFO:	05:14:11 - docling_jobkit.convert.results - Processed 1 docs in 0.46 seconds.
INFO:	05:14:11 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 6a35a727-f94d-4942-af5d-d2bead917836 in 0.46 seconds
INFO:	05:14:11 - uvicorn.access - 172.17.0.1:40062 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:14:12 - uvicorn.access - 172.17.0.1:40062 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:14:12 - uvicorn.access - 172.17.0.1:40062 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:12:42 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:12:42 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:12:42 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:12:42 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:12:42 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/healthz$,/health$,/livez$,/readyz$,/metrics$)
INFO:	05:12:42 - uvicorn.error - Started server process [1]
INFO:	05:12:42 - uvicorn.error - Waiting for application startup.
INFO:	05:12:45 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:12:45 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:12:45 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:12:45 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:12:45 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:12:45 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	05:12:45 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:12:45 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-03 05:12:45.456696598 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:12:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:12:45,725 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:12:45,726 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:12:45,812 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:12:45,812 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:12:45,858 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:12:45,859 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:12:45 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:12:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▌ | 657/770 [00:00<00:00, 6526.19it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6572.12it/s]
INFO:	05:12:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:12:46 - uvicorn.error - Application startup complete.
INFO:	05:12:46 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:12:47 - docling_serve.app - Health check requested
INFO:	05:12:47 - uvicorn.access - 172.17.0.1:57640 - "GET /health HTTP/1.1" 200
INFO:	05:12:47 - docling_serve.app - Health check requested
INFO:	05:12:47 - uvicorn.access - 172.17.0.1:57648 - "GET /health HTTP/1.1" 200
INFO:	05:12:47 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:12:47 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:12:47 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:12:47 - docling_serve.app - [TENANT_ID] Task b9c007ff-65fa-4cb0-ab19-0979d5cc508a created with tenant_id='default'
INFO:	05:12:47 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task b9c007ff-65fa-4cb0-ab19-0979d5cc508a
INFO:	05:12:47 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:12:47 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	05:12:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:12:47,377 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:12:47,378 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:12:47,477 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:12:47,478 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:12:47,530 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:12:47,531 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:12:47 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:12:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  81%|████████  | 621/770 [00:00<00:00, 6209.50it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6372.21it/s]
INFO:	05:12:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:12:48 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:12:48 - docling.document_converter - Going to convert document batch...
INFO:	05:12:48 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:12:48 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:12:48 - docling.document_converter - Finished converting document file in 0.36 sec.
WARNING:	05:12:48 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:12:48 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	05:12:48 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job b9c007ff-65fa-4cb0-ab19-0979d5cc508a in 0.39 seconds
INFO:	05:12:49 - uvicorn.access - 172.17.0.1:57648 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:12:49 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:12:49 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:12:49 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:12:49 - docling_serve.app - [TENANT_ID] Task b88a9136-9075-4f1b-8571-f3e88592078d created with tenant_id='default'
INFO:	05:12:49 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task b88a9136-9075-4f1b-8571-f3e88592078d
INFO:	05:12:49 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:12:49 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	05:12:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:12:49,399 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:12:49,399 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:12:49,490 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:12:49,490 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:12:49,543 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:12:49,543 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:12:49 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:12:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▍ | 651/770 [00:00<00:00, 6473.95it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6564.38it/s]
INFO:	05:12:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:12:50 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:12:50 - docling.document_converter - Going to convert document batch...
INFO:	05:12:50 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:12:50 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:12:50 - docling.document_converter - Finished converting document file in 0.36 sec.
INFO:	05:12:50 - docling_jobkit.convert.results - Processed 1 docs in 0.36 seconds.
INFO:	05:12:50 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job b88a9136-9075-4f1b-8571-f3e88592078d in 0.36 seconds
INFO:	05:12:51 - uvicorn.access - 172.17.0.1:57648 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:12:51 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:12:51 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:12:51 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:12:51 - docling_serve.app - [TENANT_ID] Task e4df515c-1f1e-4780-bf70-badbaf91bb88 created with tenant_id='default'
INFO:	05:12:51 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task e4df515c-1f1e-4780-bf70-badbaf91bb88
INFO:	05:12:51 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:12:51 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash fb1751b09de6bdbe35ede48676ca8f82
INFO:	05:12:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:12:51,418 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:12:51,418 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:12:51,506 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:12:51,507 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:12:51,555 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:12:51,556 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:12:51 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:12:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  83%|████████▎ | 638/770 [00:00<00:00, 6372.42it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6379.86it/s]
INFO:	05:12:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:12:52 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:12:52 - docling.document_converter - Going to convert document batch...
INFO:	05:12:52 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:12:52 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:12:52 - docling.document_converter - Finished converting document file in 0.24 sec.
INFO:	05:12:52 - docling_jobkit.convert.results - Processed 1 docs in 0.26 seconds.
INFO:	05:12:52 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job e4df515c-1f1e-4780-bf70-badbaf91bb88 in 0.26 seconds
INFO:	05:12:53 - uvicorn.access - 172.17.0.1:57648 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:12:53 - uvicorn.access - 172.17.0.1:57648 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:12:53 - uvicorn.access - 172.17.0.1:57648 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:11:33 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:11:33 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:11:33 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:11:33 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:11:33 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/health$,/livez$,/metrics$,/readyz$,/healthz$)
INFO:	05:11:33 - uvicorn.error - Started server process [1]
INFO:	05:11:33 - uvicorn.error - Waiting for application startup.
INFO:	05:11:37 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:11:37 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:11:37 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:11:37 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:11:37 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:11:37 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash bcb2e23b24bd94a42b5c00d662a7c1cf
INFO:	05:11:37 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:11:37 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-08-03 05:11:37.169986153 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:11:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:11:37,520 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:11:37,521 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:11:37,640 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:11:37,640 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:11:37,710 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:11:37,710 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:11:37 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:11:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 9216.88it/s]
INFO:	05:11:38 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:11:38 - uvicorn.error - Application startup complete.
INFO:	05:11:38 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:11:39 - docling_serve.app - Health check requested
INFO:	05:11:39 - uvicorn.access - 172.17.0.1:55236 - "GET /health HTTP/1.1" 200
INFO:	05:11:39 - docling_serve.app - Health check requested
INFO:	05:11:39 - uvicorn.access - 172.17.0.1:55238 - "GET /health HTTP/1.1" 200
INFO:	05:11:39 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:11:39 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:11:39 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:11:39 - docling_serve.app - [TENANT_ID] Task 8a6352da-eff1-4936-92a4-1bcfbb9c9b2f created with tenant_id='default'
INFO:	05:11:39 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8a6352da-eff1-4936-92a4-1bcfbb9c9b2f
INFO:	05:11:39 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:11:39 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	05:11:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:11:39,838 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:11:39,838 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:11:39,940 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:11:39,941 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:11:39,989 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:11:39,989 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:11:40 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:11:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  77%|███████▋  | 592/770 [00:00<00:00, 5914.66it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5830.68it/s]
INFO:	05:11:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:11:41 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:11:41 - docling.document_converter - Going to convert document batch...
INFO:	05:11:41 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:11:41 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:11:41 - docling.document_converter - Finished converting document file in 0.67 sec.
WARNING:	05:11:41 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:11:41 - docling_jobkit.convert.results - Processed 1 docs in 0.72 seconds.
INFO:	05:11:41 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8a6352da-eff1-4936-92a4-1bcfbb9c9b2f in 0.72 seconds
INFO:	05:11:41 - uvicorn.access - 172.17.0.1:55238 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:11:41 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:11:41 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:11:41 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:11:41 - docling_serve.app - [TENANT_ID] Task 6eded513-2bc2-49f4-a8f8-30dfe68b2c55 created with tenant_id='default'
INFO:	05:11:41 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 6eded513-2bc2-49f4-a8f8-30dfe68b2c55
INFO:	05:11:41 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:11:41 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	05:11:41 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:11:41,857 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:11:41,857 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:11:41,972 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:11:41,973 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:11:42,036 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:11:42,036 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:11:42 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:11:42 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  79%|███████▉  | 611/770 [00:00<00:00, 6037.27it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7107.36it/s]
INFO:	05:11:42 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:11:43 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:11:43 - docling.document_converter - Going to convert document batch...
INFO:	05:11:43 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:11:43 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:11:43 - docling.document_converter - Finished converting document file in 0.44 sec.
INFO:	05:11:43 - docling_jobkit.convert.results - Processed 1 docs in 0.45 seconds.
INFO:	05:11:43 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 6eded513-2bc2-49f4-a8f8-30dfe68b2c55 in 0.45 seconds
INFO:	05:11:43 - uvicorn.access - 172.17.0.1:55238 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:11:43 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:11:43 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:11:43 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:11:43 - docling_serve.app - [TENANT_ID] Task ffcdfaf6-58f1-45be-b996-773c317c8ffe created with tenant_id='default'
INFO:	05:11:43 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task ffcdfaf6-58f1-45be-b996-773c317c8ffe
INFO:	05:11:43 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:11:43 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 3eabf304acb4a56e9ef52b02ef69bccb
INFO:	05:11:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-08-03 05:11:43,887 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:11:43,887 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:11:44,045 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:11:44,045 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:11:44,194 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:11:44,194 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:11:44 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:11:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  86%|████████▋ | 665/770 [00:00<00:00, 6573.83it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6731.97it/s]
INFO:	05:11:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:11:45 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:11:45 - docling.document_converter - Going to convert document batch...
INFO:	05:11:45 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:11:45 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:11:45 - docling.document_converter - Finished converting document file in 0.26 sec.
INFO:	05:11:45 - docling_jobkit.convert.results - Processed 1 docs in 0.28 seconds.
INFO:	05:11:45 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job ffcdfaf6-58f1-45be-b996-773c317c8ffe in 0.28 seconds
INFO:	05:11:45 - uvicorn.access - 172.17.0.1:55238 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:11:46 - uvicorn.access - 172.17.0.1:55238 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:11:46 - uvicorn.access - 172.17.0.1:55238 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
2026-08-03 05:10:13.696514246 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 05:10:13,970 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:10:13,971 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:10:14,057 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:10:14,057 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:10:14,110 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:10:14,110 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  80%|███████▉  | 615/770 [00:00<00:00, 6148.33it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6312.90it/s]
[INFO] 2026-08-03 05:10:15,521 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:10:15,522 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:10:15,610 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:10:15,610 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:10:15,655 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:10:15,656 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▍ | 653/770 [00:00<00:00, 6496.10it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6543.89it/s]
WARNING:	05:10:16 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
WARNING:	05:10:16 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
[INFO] 2026-08-03 05:10:17,538 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:10:17,538 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:10:17,627 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:10:17,627 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:10:17,673 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:10:17,673 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  77%|███████▋  | 594/770 [00:00<00:00, 5929.73it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6053.56it/s]
[INFO] 2026-08-03 05:10:19,552 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:10:19,552 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:10:19,638 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:10:19,639 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:10:19,694 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:10:19,694 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▍ | 651/770 [00:00<00:00, 6494.15it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6461.53it/s]

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
2026-08-03 05:09:08.050247684 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 05:09:08,421 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:09:08,423 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:09:08,545 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:09:08,545 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:09:08,597 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:09:08,597 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  86%|████████▌ | 659/770 [00:00<00:00, 6586.90it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6976.25it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:41584 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41592 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:09:11,327 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:09:11,328 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:09:11,487 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:09:11,487 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:09:11,579 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:09:11,579 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 11746.19it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41592 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:09:13,250 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:09:13,250 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:09:13,402 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:09:13,402 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:09:13,462 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:09:13,462 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  89%|████████▉ | 688/770 [00:00<00:00, 6868.54it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6874.71it/s]
INFO:     172.17.0.1:41592 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:09:17,286 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:09:17,287 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:09:17,420 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:09:17,421 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:09:17,512 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:09:17,513 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  87%|████████▋ | 668/770 [00:00<00:00, 6652.85it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7059.51it/s]
INFO:     172.17.0.1:41592 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41592 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41592 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-03 05:07:39.470395298 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 05:07:39,732 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:07:39,733 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:07:39,826 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:07:39,826 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:07:39,873 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:07:39,873 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  80%|████████  | 619/770 [00:00<00:00, 6186.79it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6380.44it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50892 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50896 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:07:41,281 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:07:41,281 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:07:41,379 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:07:41,379 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:07:41,426 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:07:41,426 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▍ | 652/770 [00:00<00:00, 6519.46it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6529.78it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50896 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:07:43,293 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:07:43,293 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:07:43,387 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:07:43,387 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:07:43,435 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:07:43,435 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  80%|████████  | 618/770 [00:00<00:00, 6171.68it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6176.46it/s]
INFO:     172.17.0.1:50896 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:07:45,314 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:07:45,314 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:07:45,401 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:07:45,401 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:07:45,450 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:07:45,451 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  83%|████████▎ | 638/770 [00:00<00:00, 6371.62it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6451.11it/s]
INFO:     172.17.0.1:50896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50896 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50896 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-03 05:06:40.439026690 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 05:06:40,841 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:06:40,843 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:06:40,984 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:06:40,985 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:06:41,055 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:06:41,055 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  97%|█████████▋| 748/770 [00:00<00:00, 7470.58it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7558.67it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59302 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59316 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:06:43,336 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:06:43,337 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:06:43,477 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:06:43,477 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:06:43,543 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:06:43,543 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:   9%|▊         | 66/770 [00:00<00:03, 192.44it/s]Loading weights:  21%|██        | 162/770 [00:00<00:02, 298.34it/s]Loading weights:  26%|██▌       | 200/770 [00:00<00:01, 310.17it/s]Loading weights:  36%|███▌      | 276/770 [00:00<00:01, 381.77it/s]Loading weights:  41%|████▏     | 318/770 [00:01<00:01, 310.67it/s]Loading weights:  46%|████▌     | 352/770 [00:01<00:02, 168.95it/s]Loading weights:  89%|████████▊ | 683/770 [00:01<00:00, 609.70it/s]Loading weights: 100%|██████████| 770/770 [00:01<00:00, 463.34it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59316 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:06:49,404 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:06:49,404 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:06:49,527 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:06:49,527 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:06:49,572 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:06:49,573 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  91%|█████████ | 699/770 [00:00<00:00, 6979.01it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6832.53it/s]
INFO:     172.17.0.1:59316 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:06:53,408 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:06:53,408 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:06:53,530 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:06:53,530 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:06:53,597 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:06:53,597 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  82%|████████▏ | 633/770 [00:00<00:00, 6308.62it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6426.82it/s]
INFO:     172.17.0.1:59316 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59316 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59316 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-03 05:04:58.662484479 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 05:04:59,129 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:59,130 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:04:59,222 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:59,222 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:04:59,268 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:59,268 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▍ | 654/770 [00:00<00:00, 6515.74it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6547.95it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:34608 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34616 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:05:00,447 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:05:00,448 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:05:00,527 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:05:00,527 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:05:00,570 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:05:00,571 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  86%|████████▌ | 659/770 [00:00<00:00, 6579.98it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6615.66it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34616 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:05:02,462 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:05:02,463 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:05:02,556 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:05:02,556 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:05:02,598 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:05:02,598 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  84%|████████▍ | 647/770 [00:00<00:00, 6451.01it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6446.80it/s]
INFO:     172.17.0.1:34616 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:05:04,477 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:05:04,477 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-08-03 05:05:04,557 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:05:04,557 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-08-03 05:05:04,603 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:05:04,604 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▍ | 652/770 [00:00<00:00, 6513.28it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6499.21it/s]
INFO:     172.17.0.1:34616 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34616 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34616 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-03 05:04:18.203336642 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 05:04:18,841 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:18,843 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 05:04:19,002 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:19,003 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 05:04:19,049 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:19,050 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  87%|████████▋ | 669/770 [00:00<00:00, 6681.83it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6484.41it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:42814 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42822 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:04:21,237 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:21,238 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 05:04:21,385 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:21,385 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 05:04:21,431 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:21,431 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  88%|████████▊ | 681/770 [00:00<00:00, 6806.36it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6834.57it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42822 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:04:23,275 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:23,276 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 05:04:23,388 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:23,388 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 05:04:23,441 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:23,441 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  75%|███████▍  | 574/770 [00:00<00:00, 5728.94it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5778.64it/s]
INFO:     172.17.0.1:42822 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-08-03 05:04:25,307 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:25,307 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 05:04:25,429 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:25,429 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 05:04:25,479 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:04:25,480 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  88%|████████▊ | 675/770 [00:00<00:00, 6728.41it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6759.80it/s]
INFO:     172.17.0.1:42822 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42822 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42822 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-03 05:02:11.018445153 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 05:02:11,418 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:02:11,419 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 05:02:11,497 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:02:11,498 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 05:02:11,536 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:02:11,536 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39710 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39726 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39726 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39726 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39726 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39726 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39726 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-03 05:00:34.980562629 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 05:00:35,418 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:00:35,420 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 05:00:35,496 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:00:35,496 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 05:00:35,525 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 05:00:35,525 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:41060 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41072 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41072 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41072 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41072 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41072 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41072 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-03 04:58:57.031302705 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 04:58:57,465 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:58:57,466 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 04:58:57,545 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:58:57,546 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 04:58:57,579 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:58:57,579 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:42926 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42932 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42932 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42932 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42932 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42932 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42932 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-03 04:57:23.405672505 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 04:57:23,856 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:57:23,857 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 04:57:23,934 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:57:23,934 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 04:57:23,971 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:57:23,971 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:47838 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47846 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47846 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47846 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47846 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47846 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47846 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-03 04:55:54.034483090 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 04:55:54,468 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:55:54,469 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 04:55:54,544 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:55:54,544 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 04:55:54,574 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:55:54,575 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:40934 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40936 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40936 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40936 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40936 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40936 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40936 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-03 04:54:13.966575190 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 04:54:14,393 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:54:14,394 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 04:54:14,487 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:54:14,487 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 04:54:14,528 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:54:14,528 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50064 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50080 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50080 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50080 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50080 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50080 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50080 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-03 04:52:35.817306395 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 04:52:36,257 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:52:36,258 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 04:52:36,345 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:52:36,345 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 04:52:36,390 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:52:36,390 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:53946 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53948 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53948 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53948 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53948 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53948 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53948 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-08-03 04:51:06.378889815 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-08-03 04:51:06,790 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:51:06,791 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 04:51:06,875 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:51:06,875 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 04:51:06,909 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:51:06,910 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:49304 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49308 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49308 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49308 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49308 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49308 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49308 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-08-03 04:49:18,063 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:49:18,064 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 04:49:18,128 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:49:18,128 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 04:49:18,165 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:49:18,165 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39710 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39720 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39720 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39720 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39720 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39720 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39720 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-08-03 04:47:53,350 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:47:53,352 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 04:47:53,459 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:47:53,459 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 04:47:53,503 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:47:53,503 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55968 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55980 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55980 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55980 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55980 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55980 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55980 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-08-03 04:45:51,091 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:45:51,092 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 04:45:51,150 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:45:51,151 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 04:45:51,175 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:45:51,175 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:49200 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49214 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49214 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49214 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49214 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49214 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49214 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-08-03 04:43:48,217 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:43:48,219 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 04:43:48,279 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:43:48,279 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 04:43:48,308 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:43:48,308 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:49996 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50004 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50004 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50004 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50004 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50004 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50004 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-08-03 04:41:56,252 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:41:56,253 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 04:41:56,314 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:41:56,314 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 04:41:56,344 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:41:56,344 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58300 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58304 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58304 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58304 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58304 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58304 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58304 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-08-03 04:40:00,387 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:40:00,388 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-08-03 04:40:00,439 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:40:00,439 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-08-03 04:40:00,466 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-08-03 04:40:00,466 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39376 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39390 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39390 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39390 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39390 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39390 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39390 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:42530 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42534 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42534 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42534 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42534 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42534 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42534 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:56274 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56284 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56284 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56284 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56284 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56284 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56284 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:42736 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42748 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42748 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42748 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42748 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42748 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42748 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:54820 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54822 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54822 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54822 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54822 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54822 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54822 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:39376 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39388 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39388 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39388 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39388 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39388 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39388 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:44672 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44674 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44674 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44674 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44674 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44674 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44674 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50744 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50756 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50756 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50756 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:35774 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35780 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35780 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35780 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35780 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35780 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35780 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:36778 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36782 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36782 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36782 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36782 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36782 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36782 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:32988 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:32990 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:32990 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:32990 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:32990 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:32990 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:32990 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:58172 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58184 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58184 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58184 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58184 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58184 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58184 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:51838 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51844 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51844 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51844 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51844 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51844 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51844 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:35112 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35116 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35116 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35116 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35116 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35116 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35116 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:39136 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39140 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39140 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39140 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39140 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39140 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39140 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

