# Results for ghcr.io/docling-project/docling-serve as of 2026-07-20T05:24:58.250779869Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
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
INFO:	05:24:42 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:24:42 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:24:42 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:24:42 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:24:42 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/metrics$,/livez$,/health$,/healthz$,/ready$,/readyz$)
INFO:	05:24:43 - uvicorn.error - Started server process [1]
INFO:	05:24:43 - uvicorn.error - Waiting for application startup.
INFO:	05:24:46 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:24:46 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:24:46 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:24:46 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:24:46 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:24:46 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c4d6547d10e26a777a530d63ca01a1a1
INFO:	05:24:46 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:24:46 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	05:24:46 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-07-20 05:24:46.409905893 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:24:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:24:46,876 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:46,878 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:24:46,967 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:46,967 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:24:47,014 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:47,014 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:24:47 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:24:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 503/770 [00:00<00:00, 5016.24it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5014.99it/s]
INFO:	05:24:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:24:47 - uvicorn.error - Application startup complete.
INFO:	05:24:47 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:24:47 - docling_serve.app - Health check requested
INFO:	05:24:47 - uvicorn.access - 172.17.0.1:34896 - "GET /health HTTP/1.1" 200
INFO:	05:24:47 - docling_serve.app - Health check requested
INFO:	05:24:47 - uvicorn.access - 172.17.0.1:34902 - "GET /health HTTP/1.1" 200
INFO:	05:24:47 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:24:47 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:24:47 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:24:47 - docling_serve.app - [TENANT_ID] Task 2b9b0f19-3cb1-4c8d-9c12-2feafe211db7 created with tenant_id='default'
INFO:	05:24:47 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 2b9b0f19-3cb1-4c8d-9c12-2feafe211db7
INFO:	05:24:47 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:24:47 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	05:24:47 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:24:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:24:47,985 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:47,985 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:24:48,079 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:48,079 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:24:48,128 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:48,128 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:24:48 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:24:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 513/770 [00:00<00:00, 5116.96it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5102.39it/s]
INFO:	05:24:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:24:49 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:24:49 - docling.document_converter - Going to convert document batch...
INFO:	05:24:49 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:24:49 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:24:49 - docling.document_converter - Finished converting document file in 0.54 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	05:24:49 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:24:49 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	05:24:49 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 2b9b0f19-3cb1-4c8d-9c12-2feafe211db7 in 0.58 seconds
INFO:	05:24:49 - uvicorn.access - 172.17.0.1:34902 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:24:49 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:24:49 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:24:49 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:24:49 - docling_serve.app - [TENANT_ID] Task 5442cbf4-ef6e-46f0-b338-30670d7e03ca created with tenant_id='default'
INFO:	05:24:49 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 5442cbf4-ef6e-46f0-b338-30670d7e03ca
INFO:	05:24:49 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:24:49 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	05:24:49 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:24:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:24:49,999 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:49,999 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:24:50,090 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:50,090 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:24:50,136 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:50,136 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:24:50 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:24:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 503/770 [00:00<00:00, 5023.53it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5046.58it/s]
INFO:	05:24:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:24:51 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:24:51 - docling.document_converter - Going to convert document batch...
INFO:	05:24:51 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:24:51 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:24:51 - docling.document_converter - Finished converting document file in 0.50 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:24:51 - docling_jobkit.convert.results - Processed 1 docs in 0.50 seconds.
INFO:	05:24:51 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 5442cbf4-ef6e-46f0-b338-30670d7e03ca in 0.50 seconds
INFO:	05:24:51 - uvicorn.access - 172.17.0.1:34902 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:24:51 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:24:51 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:24:51 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:24:51 - docling_serve.app - [TENANT_ID] Task 4239baf7-6f77-4410-ab2b-8534e4a8f970 created with tenant_id='default'
INFO:	05:24:51 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 4239baf7-6f77-4410-ab2b-8534e4a8f970
INFO:	05:24:51 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:24:51 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 63e8839d1103b03d45382915dba33c89
INFO:	05:24:51 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:24:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:24:52,011 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:52,011 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:24:52,101 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:52,102 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:24:52,149 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:52,150 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:24:52 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:24:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 509/770 [00:00<00:00, 5086.79it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5091.84it/s]
INFO:	05:24:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:24:53 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:24:53 - docling.document_converter - Going to convert document batch...
INFO:	05:24:53 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:24:53 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:24:53 - docling.document_converter - Finished converting document file in 0.47 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:24:53 - docling_jobkit.convert.results - Processed 1 docs in 0.49 seconds.
INFO:	05:24:53 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 4239baf7-6f77-4410-ab2b-8534e4a8f970 in 0.49 seconds
INFO:	05:24:53 - uvicorn.access - 172.17.0.1:34902 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:24:54 - uvicorn.access - 172.17.0.1:34902 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:24:54 - uvicorn.access - 172.17.0.1:34902 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:23:54 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:23:54 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:23:54 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:23:54 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:23:54 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/healthz$,/metrics$,/health$,/ready$,/readyz$)
INFO:	05:23:55 - uvicorn.error - Started server process [1]
INFO:	05:23:55 - uvicorn.error - Waiting for application startup.
INFO:	05:24:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:24:01 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:24:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:24:01 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:24:01 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:24:01 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash f446dcc5a1a7c6aff458e30cab474a9e
INFO:	05:24:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:24:01 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-07-20 05:24:01.431791896 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:24:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:24:03,018 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:03,021 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:24:03,573 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:03,573 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:24:03,666 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:03,666 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:24:03 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:24:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  44%|████▍     | 341/770 [00:00<00:00, 3361.35it/s]Loading weights:  88%|████████▊ | 678/770 [00:00<00:00, 2925.83it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 3008.46it/s]
INFO:	05:24:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:24:05 - uvicorn.error - Application startup complete.
INFO:	05:24:05 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:24:05 - docling_serve.app - Health check requested
INFO:	05:24:05 - uvicorn.access - 172.17.0.1:48210 - "GET /health HTTP/1.1" 200
INFO:	05:24:05 - docling_serve.app - Health check requested
INFO:	05:24:05 - uvicorn.access - 172.17.0.1:48224 - "GET /health HTTP/1.1" 200
INFO:	05:24:05 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:24:05 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:24:05 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:24:05 - docling_serve.app - [TENANT_ID] Task 486782e6-7095-420c-8e60-2b52c05db547 created with tenant_id='default'
INFO:	05:24:05 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 486782e6-7095-420c-8e60-2b52c05db547
INFO:	05:24:05 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:24:05 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	05:24:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:24:05,992 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:05,992 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:24:06,125 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:06,125 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:24:06,207 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:06,207 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:24:06 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:24:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 445/770 [00:00<00:00, 4449.34it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4493.25it/s]
INFO:	05:24:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:24:08 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:24:08 - docling.document_converter - Going to convert document batch...
INFO:	05:24:08 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:24:08 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:24:08 - docling.document_converter - Finished converting document file in 0.79 sec.
WARNING:	05:24:08 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:24:08 - docling_jobkit.convert.results - Processed 1 docs in 0.85 seconds.
INFO:	05:24:08 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 486782e6-7095-420c-8e60-2b52c05db547 in 0.85 seconds
INFO:	05:24:09 - uvicorn.access - 172.17.0.1:48224 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:24:09 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:24:09 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:24:09 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:24:09 - docling_serve.app - [TENANT_ID] Task 0d817ef0-b53b-4237-b988-f8effa6f8265 created with tenant_id='default'
INFO:	05:24:09 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 0d817ef0-b53b-4237-b988-f8effa6f8265
INFO:	05:24:09 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:24:09 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	05:24:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:24:10,020 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:10,020 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:24:10,151 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:10,151 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:24:10,198 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:10,198 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:24:10 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:24:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 454/770 [00:00<00:00, 4522.50it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4424.34it/s]
INFO:	05:24:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:24:11 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:24:11 - docling.document_converter - Going to convert document batch...
INFO:	05:24:11 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:24:11 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:24:12 - docling.document_converter - Finished converting document file in 0.43 sec.
INFO:	05:24:12 - docling_jobkit.convert.results - Processed 1 docs in 0.44 seconds.
INFO:	05:24:12 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 0d817ef0-b53b-4237-b988-f8effa6f8265 in 0.44 seconds
INFO:	05:24:13 - uvicorn.access - 172.17.0.1:48224 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:24:13 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:24:13 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:24:13 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:24:13 - docling_serve.app - [TENANT_ID] Task 1b91ebd1-3aa7-493b-95ac-64bc8094e1cf created with tenant_id='default'
INFO:	05:24:13 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 1b91ebd1-3aa7-493b-95ac-64bc8094e1cf
INFO:	05:24:13 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:24:13 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e50b6140ec7ee9be0d0fea6ba20c9795
INFO:	05:24:13 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:24:13,993 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:13,993 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:24:14,131 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:14,131 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:24:14,204 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:24:14,205 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:24:14 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:24:14 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 8306.96it/s]
INFO:	05:24:14 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:24:16 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:24:16 - docling.document_converter - Going to convert document batch...
INFO:	05:24:16 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:24:16 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:24:16 - docling.document_converter - Finished converting document file in 0.50 sec.
INFO:	05:24:16 - docling_jobkit.convert.results - Processed 1 docs in 0.52 seconds.
INFO:	05:24:16 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 1b91ebd1-3aa7-493b-95ac-64bc8094e1cf in 0.52 seconds
INFO:	05:24:17 - uvicorn.access - 172.17.0.1:48224 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:24:18 - uvicorn.access - 172.17.0.1:48224 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:24:18 - uvicorn.access - 172.17.0.1:48224 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:22:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:22:01 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:22:01 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:22:01 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:22:01 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/readyz$,/health$,/ready$,/metrics$,/healthz$)
INFO:	05:22:02 - uvicorn.error - Started server process [1]
INFO:	05:22:02 - uvicorn.error - Waiting for application startup.
INFO:	05:22:05 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:22:05 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:22:05 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:22:05 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:22:05 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:22:05 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	05:22:05 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:22:05 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-07-20 05:22:05.958359085 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:22:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:22:06,284 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:22:06,285 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:22:06,391 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:22:06,391 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:22:06,438 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:22:06,438 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:22:06 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:22:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|██████    | 465/770 [00:00<00:00, 4642.95it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4802.65it/s]
INFO:	05:22:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:22:07 - uvicorn.error - Application startup complete.
INFO:	05:22:07 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:22:07 - docling_serve.app - Health check requested
INFO:	05:22:07 - uvicorn.access - 172.17.0.1:55040 - "GET /health HTTP/1.1" 200
INFO:	05:22:07 - docling_serve.app - Health check requested
INFO:	05:22:07 - uvicorn.access - 172.17.0.1:55056 - "GET /health HTTP/1.1" 200
INFO:	05:22:07 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:22:07 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:22:07 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:22:07 - docling_serve.app - [TENANT_ID] Task 46956949-824d-4d2f-b7ff-a20a9eaa0a4b created with tenant_id='default'
INFO:	05:22:07 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 46956949-824d-4d2f-b7ff-a20a9eaa0a4b
INFO:	05:22:07 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:22:07 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	05:22:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:22:07,910 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:22:07,910 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:22:08,011 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:22:08,012 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:22:08,064 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:22:08,064 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:22:08 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:22:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 483/770 [00:00<00:00, 4819.74it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4934.89it/s]
INFO:	05:22:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:22:09 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:22:09 - docling.document_converter - Going to convert document batch...
INFO:	05:22:09 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:22:09 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:22:09 - docling.document_converter - Finished converting document file in 1.04 sec.
WARNING:	05:22:09 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:22:10 - docling_jobkit.convert.results - Processed 1 docs in 1.08 seconds.
INFO:	05:22:10 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 46956949-824d-4d2f-b7ff-a20a9eaa0a4b in 1.08 seconds
INFO:	05:22:11 - uvicorn.access - 172.17.0.1:55056 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:22:11 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:22:11 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:22:11 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:22:11 - docling_serve.app - [TENANT_ID] Task b5f9061c-4d63-4017-aa46-5b5b792655e5 created with tenant_id='default'
INFO:	05:22:11 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task b5f9061c-4d63-4017-aa46-5b5b792655e5
INFO:	05:22:11 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:22:11 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	05:22:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:22:11,951 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:22:11,951 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:22:12,065 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:22:12,065 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:22:12,115 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:22:12,115 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:22:12 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:22:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|██████    | 464/770 [00:00<00:00, 4630.22it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4806.72it/s]
INFO:	05:22:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:22:13 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:22:13 - docling.document_converter - Going to convert document batch...
INFO:	05:22:13 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:22:13 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:22:14 - docling.document_converter - Finished converting document file in 0.74 sec.
INFO:	05:22:14 - docling_jobkit.convert.results - Processed 1 docs in 0.74 seconds.
INFO:	05:22:14 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job b5f9061c-4d63-4017-aa46-5b5b792655e5 in 0.74 seconds
INFO:	05:22:15 - uvicorn.access - 172.17.0.1:55056 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:22:15 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:22:15 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:22:15 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:22:15 - docling_serve.app - [TENANT_ID] Task 8247e99b-f8c0-4ea3-8c4e-8349183f0054 created with tenant_id='default'
INFO:	05:22:15 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8247e99b-f8c0-4ea3-8c4e-8349183f0054
INFO:	05:22:15 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:22:15 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	05:22:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:22:15,968 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:22:15,969 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:22:16,063 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:22:16,063 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:22:16,118 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:22:16,118 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:22:16 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:22:16 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|█████▉    | 459/770 [00:00<00:00, 4577.82it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4663.77it/s]
INFO:	05:22:16 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:22:17 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:22:17 - docling.document_converter - Going to convert document batch...
INFO:	05:22:17 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:22:17 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:22:17 - docling.document_converter - Finished converting document file in 0.39 sec.
INFO:	05:22:17 - docling_jobkit.convert.results - Processed 1 docs in 0.42 seconds.
INFO:	05:22:17 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8247e99b-f8c0-4ea3-8c4e-8349183f0054 in 0.42 seconds
INFO:	05:22:17 - uvicorn.access - 172.17.0.1:55056 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:22:18 - uvicorn.access - 172.17.0.1:55056 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:22:18 - uvicorn.access - 172.17.0.1:55056 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:21:06 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:21:06 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:21:06 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:21:06 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:21:06 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/metrics$,/livez$,/healthz$,/health$,/readyz$,/ready$)
INFO:	05:21:07 - uvicorn.error - Started server process [1]
INFO:	05:21:07 - uvicorn.error - Waiting for application startup.
INFO:	05:21:12 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:21:12 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:21:12 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:21:12 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:21:12 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:12 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	05:21:12 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:21:12 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-07-20 05:21:12.404963671 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:21:13 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:21:13,124 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:21:13,126 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:21:13,268 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:21:13,268 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:21:13,316 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:21:13,316 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:21:13 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:13 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▎   | 490/770 [00:00<00:00, 4875.21it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4741.61it/s]
INFO:	05:21:14 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:14 - uvicorn.error - Application startup complete.
INFO:	05:21:14 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:21:14 - docling_serve.app - Health check requested
INFO:	05:21:14 - uvicorn.access - 172.17.0.1:50458 - "GET /health HTTP/1.1" 200
INFO:	05:21:14 - docling_serve.app - Health check requested
INFO:	05:21:14 - uvicorn.access - 172.17.0.1:50466 - "GET /health HTTP/1.1" 200
INFO:	05:21:14 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:21:14 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:21:14 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:21:14 - docling_serve.app - [TENANT_ID] Task 43fb0f0a-0041-498a-b0a5-dcffdbf1264c created with tenant_id='default'
INFO:	05:21:14 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 43fb0f0a-0041-498a-b0a5-dcffdbf1264c
INFO:	05:21:14 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:15 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	05:21:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:21:15,062 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:21:15,062 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:21:15,230 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:21:15,231 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:21:15,285 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:21:15,285 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:21:15 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 486/770 [00:00<00:00, 4823.29it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4878.81it/s]
INFO:	05:21:16 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:16 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:21:16 - docling.document_converter - Going to convert document batch...
INFO:	05:21:16 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:21:16 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:21:16 - docling.document_converter - Finished converting document file in 0.47 sec.
WARNING:	05:21:17 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:21:17 - docling_jobkit.convert.results - Processed 1 docs in 0.53 seconds.
INFO:	05:21:17 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 43fb0f0a-0041-498a-b0a5-dcffdbf1264c in 0.53 seconds
INFO:	05:21:18 - uvicorn.access - 172.17.0.1:50466 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:21:19 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:21:19 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:21:19 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:21:19 - docling_serve.app - [TENANT_ID] Task e3cb83d6-95d0-4710-948a-531741da6e1b created with tenant_id='default'
INFO:	05:21:19 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task e3cb83d6-95d0-4710-948a-531741da6e1b
INFO:	05:21:19 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:19 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	05:21:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:21:19,091 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:21:19,091 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:21:19,211 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:21:19,211 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:21:19,261 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:21:19,262 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:21:19 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 496/770 [00:00<00:00, 4922.86it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5425.47it/s]
INFO:	05:21:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:20 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:21:20 - docling.document_converter - Going to convert document batch...
INFO:	05:21:20 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:21:20 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:21:21 - docling.document_converter - Finished converting document file in 0.51 sec.
INFO:	05:21:21 - docling_jobkit.convert.results - Processed 1 docs in 0.52 seconds.
INFO:	05:21:21 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job e3cb83d6-95d0-4710-948a-531741da6e1b in 0.52 seconds
INFO:	05:21:23 - uvicorn.access - 172.17.0.1:50466 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:21:23 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:21:23 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:21:23 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:21:23 - docling_serve.app - [TENANT_ID] Task a28ecf4a-70da-4c4c-8be0-5376a3860aec created with tenant_id='default'
INFO:	05:21:23 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task a28ecf4a-70da-4c4c-8be0-5376a3860aec
INFO:	05:21:23 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:23 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	05:21:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:21:23,139 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:21:23,140 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:21:23,293 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:21:23,293 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:21:23,381 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:21:23,381 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:21:23 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 496/770 [00:00<00:00, 4920.61it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5221.92it/s]
INFO:	05:21:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:24 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:21:24 - docling.document_converter - Going to convert document batch...
INFO:	05:21:24 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:21:24 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:21:24 - docling.document_converter - Finished converting document file in 0.32 sec.
INFO:	05:21:24 - docling_jobkit.convert.results - Processed 1 docs in 0.34 seconds.
INFO:	05:21:24 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job a28ecf4a-70da-4c4c-8be0-5376a3860aec in 0.34 seconds
INFO:	05:21:25 - uvicorn.access - 172.17.0.1:50466 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:21:25 - uvicorn.access - 172.17.0.1:50466 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:21:25 - uvicorn.access - 172.17.0.1:50466 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:19:15 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:19:15 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:19:15 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:19:15 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:19:15 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/ready$,/health$,/livez$,/healthz$,/metrics$)
INFO:	05:19:15 - uvicorn.error - Started server process [1]
INFO:	05:19:15 - uvicorn.error - Waiting for application startup.
INFO:	05:19:19 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:19:19 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:19:19 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:19:19 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:19:19 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:19:19 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	05:19:19 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:19:19 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-07-20 05:19:19.546529119 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:19:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:19:19,875 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:19:19,877 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:19:19,975 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:19:19,975 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:19:20,021 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:19:20,021 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:19:20 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:19:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 487/770 [00:00<00:00, 4869.24it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5016.32it/s]
INFO:	05:19:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:19:20 - uvicorn.error - Application startup complete.
INFO:	05:19:20 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:19:21 - docling_serve.app - Health check requested
INFO:	05:19:21 - uvicorn.access - 172.17.0.1:56700 - "GET /health HTTP/1.1" 200
INFO:	05:19:21 - docling_serve.app - Health check requested
INFO:	05:19:21 - uvicorn.access - 172.17.0.1:56704 - "GET /health HTTP/1.1" 200
INFO:	05:19:21 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:19:21 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:19:21 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:19:21 - docling_serve.app - [TENANT_ID] Task 8caab8f7-be84-4304-afd7-2a9052d06b60 created with tenant_id='default'
INFO:	05:19:21 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8caab8f7-be84-4304-afd7-2a9052d06b60
INFO:	05:19:21 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:19:21 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	05:19:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:19:21,711 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:19:21,712 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:19:21,811 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:19:21,812 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:19:21,857 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:19:21,858 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:19:21 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:19:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 508/770 [00:00<00:00, 5064.37it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4989.61it/s]
INFO:	05:19:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:19:23 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:19:23 - docling.document_converter - Going to convert document batch...
INFO:	05:19:23 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:19:23 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:19:23 - docling.document_converter - Finished converting document file in 0.70 sec.
WARNING:	05:19:23 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:19:23 - docling_jobkit.convert.results - Processed 1 docs in 0.74 seconds.
INFO:	05:19:23 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8caab8f7-be84-4304-afd7-2a9052d06b60 in 0.74 seconds
INFO:	05:19:23 - uvicorn.access - 172.17.0.1:56704 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:19:23 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:19:23 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:19:23 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:19:23 - docling_serve.app - [TENANT_ID] Task df0a4b07-e24b-4532-961d-bc418cef21b0 created with tenant_id='default'
INFO:	05:19:23 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task df0a4b07-e24b-4532-961d-bc418cef21b0
INFO:	05:19:23 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:19:23 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	05:19:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:19:23,733 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:19:23,734 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:19:23,826 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:19:23,826 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:19:23,874 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:19:23,875 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:19:24 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:19:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 486/770 [00:00<00:00, 4812.87it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4826.46it/s]
INFO:	05:19:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:19:25 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:19:25 - docling.document_converter - Going to convert document batch...
INFO:	05:19:25 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:19:25 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:19:25 - docling.document_converter - Finished converting document file in 0.76 sec.
INFO:	05:19:25 - docling_jobkit.convert.results - Processed 1 docs in 0.77 seconds.
INFO:	05:19:25 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job df0a4b07-e24b-4532-961d-bc418cef21b0 in 0.77 seconds
INFO:	05:19:27 - uvicorn.access - 172.17.0.1:56704 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:19:27 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:19:27 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:19:27 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:19:27 - docling_serve.app - [TENANT_ID] Task ff7055cf-6d64-4545-b23d-b4c6b14d8c56 created with tenant_id='default'
INFO:	05:19:27 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task ff7055cf-6d64-4545-b23d-b4c6b14d8c56
INFO:	05:19:27 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:19:27 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash fb1751b09de6bdbe35ede48676ca8f82
INFO:	05:19:27 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:19:27,738 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:19:27,738 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:19:27,844 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:19:27,844 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:19:27,894 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:19:27,894 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:19:28 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:19:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 484/770 [00:00<00:00, 4837.26it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4838.00it/s]
INFO:	05:19:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:19:28 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:19:28 - docling.document_converter - Going to convert document batch...
INFO:	05:19:28 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:19:28 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:19:29 - docling.document_converter - Finished converting document file in 0.32 sec.
INFO:	05:19:29 - docling_jobkit.convert.results - Processed 1 docs in 0.34 seconds.
INFO:	05:19:29 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job ff7055cf-6d64-4545-b23d-b4c6b14d8c56 in 0.34 seconds
INFO:	05:19:29 - uvicorn.access - 172.17.0.1:56704 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:19:29 - uvicorn.access - 172.17.0.1:56704 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:19:29 - uvicorn.access - 172.17.0.1:56704 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:18:27 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:18:27 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:18:27 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:18:27 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:18:27 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/healthz$,/livez$,/health$,/metrics$,/ready$,/readyz$)
INFO:	05:18:27 - uvicorn.error - Started server process [1]
INFO:	05:18:27 - uvicorn.error - Waiting for application startup.
INFO:	05:18:32 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:18:32 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:18:32 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:18:32 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:18:32 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:18:32 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash bcb2e23b24bd94a42b5c00d662a7c1cf
INFO:	05:18:32 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:18:32 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-07-20 05:18:33.055870533 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:18:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:18:33,586 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:18:33,589 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:18:33,733 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:18:33,733 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:18:33,780 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:18:33,781 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:18:33 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:18:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 498/770 [00:00<00:00, 4972.70it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5043.79it/s]
INFO:	05:18:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:18:35 - uvicorn.error - Application startup complete.
INFO:	05:18:35 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:18:36 - docling_serve.app - Health check requested
INFO:	05:18:36 - uvicorn.access - 172.17.0.1:59184 - "GET /health HTTP/1.1" 200
INFO:	05:18:36 - docling_serve.app - Health check requested
INFO:	05:18:36 - uvicorn.access - 172.17.0.1:59198 - "GET /health HTTP/1.1" 200
INFO:	05:18:36 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:18:36 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:18:36 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:18:36 - docling_serve.app - [TENANT_ID] Task 38eff3aa-f1b0-4845-8afb-b8ba988301c1 created with tenant_id='default'
INFO:	05:18:36 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 38eff3aa-f1b0-4845-8afb-b8ba988301c1
INFO:	05:18:36 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:18:36 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	05:18:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:18:36,837 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:18:36,837 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:18:36,959 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:18:36,959 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:18:37,040 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:18:37,040 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:18:37 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:18:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  57%|█████▋    | 442/770 [00:00<00:00, 4418.49it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4304.96it/s]
INFO:	05:18:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:18:38 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:18:38 - docling.document_converter - Going to convert document batch...
INFO:	05:18:38 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:18:38 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:18:38 - docling.document_converter - Finished converting document file in 0.77 sec.
WARNING:	05:18:38 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:18:38 - docling_jobkit.convert.results - Processed 1 docs in 0.83 seconds.
INFO:	05:18:38 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 38eff3aa-f1b0-4845-8afb-b8ba988301c1 in 0.83 seconds
INFO:	05:18:40 - uvicorn.access - 172.17.0.1:59198 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:18:40 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:18:40 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:18:40 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:18:40 - docling_serve.app - [TENANT_ID] Task 5269e11a-8b1d-49bc-9ffd-c58fc08a92cc created with tenant_id='default'
INFO:	05:18:40 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 5269e11a-8b1d-49bc-9ffd-c58fc08a92cc
INFO:	05:18:40 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:18:40 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	05:18:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:18:40,910 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:18:40,910 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:18:41,067 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:18:41,068 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:18:41,174 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:18:41,174 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:18:41 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:18:41 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  52%|█████▏    | 400/770 [00:00<00:00, 3978.75it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5152.81it/s]
INFO:	05:18:42 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:18:43 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:18:43 - docling.document_converter - Going to convert document batch...
INFO:	05:18:43 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:18:43 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:18:43 - docling.document_converter - Finished converting document file in 0.69 sec.
INFO:	05:18:43 - docling_jobkit.convert.results - Processed 1 docs in 0.70 seconds.
INFO:	05:18:43 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 5269e11a-8b1d-49bc-9ffd-c58fc08a92cc in 0.70 seconds
INFO:	05:18:44 - uvicorn.access - 172.17.0.1:59198 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:18:44 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:18:44 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:18:44 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:18:44 - docling_serve.app - [TENANT_ID] Task 0301461a-2d61-4926-915f-0163b7fe800d created with tenant_id='default'
INFO:	05:18:44 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 0301461a-2d61-4926-915f-0163b7fe800d
INFO:	05:18:44 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:18:44 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 3eabf304acb4a56e9ef52b02ef69bccb
INFO:	05:18:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-20 05:18:44,924 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:18:44,924 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:18:45,070 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:18:45,071 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:18:45,161 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:18:45,162 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:18:45 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:18:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 454/770 [00:00<00:00, 4504.12it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4622.76it/s]
INFO:	05:18:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:18:46 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:18:46 - docling.document_converter - Going to convert document batch...
INFO:	05:18:46 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:18:46 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:18:46 - docling.document_converter - Finished converting document file in 0.41 sec.
INFO:	05:18:46 - docling_jobkit.convert.results - Processed 1 docs in 0.45 seconds.
INFO:	05:18:46 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 0301461a-2d61-4926-915f-0163b7fe800d in 0.45 seconds
INFO:	05:18:46 - uvicorn.access - 172.17.0.1:59198 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:18:47 - uvicorn.access - 172.17.0.1:59198 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:18:47 - uvicorn.access - 172.17.0.1:59198 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
2026-07-20 05:16:30.823050927 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 05:16:31,119 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:16:31,121 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:16:31,213 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:16:31,214 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:16:31,260 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:16:31,260 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 497/770 [00:00<00:00, 4964.45it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5031.67it/s]
[INFO] 2026-07-20 05:16:32,551 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:16:32,552 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:16:32,652 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:16:32,653 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:16:32,700 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:16:32,700 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 500/770 [00:00<00:00, 4949.69it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4912.25it/s]
WARNING:	05:16:33 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
WARNING:	05:16:33 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
[INFO] 2026-07-20 05:16:34,562 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:16:34,563 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:16:34,659 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:16:34,659 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:16:34,706 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:16:34,707 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▎   | 489/770 [00:00<00:00, 4886.58it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4897.99it/s]
[INFO] 2026-07-20 05:16:36,582 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:16:36,582 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:16:36,681 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:16:36,681 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:16:36,737 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:16:36,737 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 507/770 [00:00<00:00, 5037.96it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5003.53it/s]

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
2026-07-20 05:15:42.281782332 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 05:15:42,723 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:15:42,726 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:15:42,856 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:15:42,857 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:15:42,920 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:15:42,921 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  57%|█████▋    | 438/770 [00:00<00:00, 4249.09it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4236.62it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:37052 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37062 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:15:45,071 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:15:45,071 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:15:45,196 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:15:45,196 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:15:45,257 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:15:45,258 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  57%|█████▋    | 436/770 [00:00<00:00, 4340.60it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5521.27it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37062 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:15:49,106 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:15:49,107 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:15:49,307 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:15:49,308 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:15:49,441 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:15:49,442 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  54%|█████▎    | 412/770 [00:00<00:00, 4003.92it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4864.91it/s]
INFO:     172.17.0.1:37062 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:15:53,115 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:15:53,115 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:15:53,251 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:15:53,251 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:15:53,307 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:15:53,307 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 448/770 [00:00<00:00, 4468.94it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4682.20it/s]
INFO:     172.17.0.1:37062 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37062 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37062 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-20 05:13:48.617910943 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 05:13:49,074 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:49,076 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:13:49,195 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:49,195 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:13:49,242 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:49,242 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 477/770 [00:00<00:00, 4760.64it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4841.88it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:44802 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44816 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:13:50,895 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:50,896 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:13:51,000 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:51,001 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:13:51,048 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:51,048 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 493/770 [00:00<00:00, 4915.37it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4916.72it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44816 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:13:52,908 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:52,908 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:13:53,008 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:53,008 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:13:53,057 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:53,057 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 506/770 [00:00<00:00, 5033.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4812.16it/s]
INFO:     172.17.0.1:44816 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:13:54,923 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:54,924 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:13:55,019 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:55,019 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:13:55,066 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:55,066 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 499/770 [00:00<00:00, 4988.79it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4885.91it/s]
INFO:     172.17.0.1:44816 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44816 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44816 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-20 05:13:08.214535062 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 05:13:08,680 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:08,683 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:13:08,826 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:08,826 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:13:08,897 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:08,897 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 477/770 [00:00<00:00, 4742.30it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4791.14it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55412 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55426 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:13:10,520 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:10,520 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:13:10,647 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:10,647 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:13:10,726 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:10,726 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  74%|███████▍  | 573/770 [00:00<00:00, 5723.81it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5729.02it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55426 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:13:14,565 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:14,565 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:13:14,667 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:14,668 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:13:14,718 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:14,719 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 8836.61it/s]
INFO:     172.17.0.1:55426 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:13:18,690 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:18,691 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:13:18,822 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:18,823 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:13:18,914 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:13:18,914 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 450/770 [00:00<00:00, 4489.83it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4689.33it/s]
INFO:     172.17.0.1:55426 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55426 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55426 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-20 05:11:00.888334018 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 05:11:01,540 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:11:01,543 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:11:01,669 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:11:01,669 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:11:01,741 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:11:01,742 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 455/770 [00:00<00:00, 4546.48it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4835.51it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56300 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56310 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:11:04,055 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:11:04,055 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:11:04,190 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:11:04,190 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:11:04,247 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:11:04,247 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 482/770 [00:00<00:00, 4811.03it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5255.26it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56310 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:11:08,054 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:11:08,054 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:11:08,164 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:11:08,164 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:11:08,210 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:11:08,210 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 469/770 [00:00<00:00, 4660.59it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4642.64it/s]
INFO:     172.17.0.1:56310 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:11:10,062 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:11:10,063 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-20 05:11:10,156 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:11:10,157 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-20 05:11:10,202 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:11:10,202 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▊    | 452/770 [00:00<00:00, 4514.75it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4514.57it/s]
INFO:     172.17.0.1:56310 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56310 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56310 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-20 05:10:33.891679401 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 05:10:34,666 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:10:34,668 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 05:10:34,831 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:10:34,831 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 05:10:34,874 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:10:34,874 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  74%|███████▍  | 569/770 [00:00<00:00, 5681.12it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5333.66it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50556 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50568 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:10:37,104 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:10:37,104 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 05:10:37,188 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:10:37,188 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 05:10:37,231 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:10:37,231 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 515/770 [00:00<00:00, 5149.61it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5170.10it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50568 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:10:41,113 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:10:41,113 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 05:10:41,231 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:10:41,232 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 05:10:41,306 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:10:41,306 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|██████    | 463/770 [00:00<00:00, 4585.21it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4721.09it/s]
INFO:     172.17.0.1:50568 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-20 05:10:43,144 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:10:43,145 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 05:10:43,227 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:10:43,228 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 05:10:43,272 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:10:43,272 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▊   | 529/770 [00:00<00:00, 5268.20it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5215.94it/s]
INFO:     172.17.0.1:50568 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50568 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50568 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-20 05:08:13.831026742 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 05:08:14,326 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:08:14,328 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 05:08:14,416 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:08:14,416 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 05:08:14,464 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:08:14,464 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:49944 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49954 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49954 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49954 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49954 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49954 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49954 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-20 05:06:54.462228989 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 05:06:55,135 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:06:55,137 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 05:06:55,285 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:06:55,285 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 05:06:55,363 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:06:55,363 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58006 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58008 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58008 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58008 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58008 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58008 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58008 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-20 05:04:58.632600704 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 05:04:59,120 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:04:59,121 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 05:04:59,225 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:04:59,226 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 05:04:59,274 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:04:59,274 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56894 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56896 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56896 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56896 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-20 05:03:51.514435758 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 05:03:52,282 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:03:52,284 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 05:03:52,452 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:03:52,453 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 05:03:52,531 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:03:52,531 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:37398 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37402 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37402 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37402 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37402 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37402 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37402 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-20 05:01:49.374540242 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 05:01:49,902 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:01:49,904 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 05:01:50,006 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:01:50,006 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 05:01:50,049 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:01:50,049 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:37084 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37088 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37088 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37088 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37088 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37088 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37088 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-20 05:00:50.129898238 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 05:00:50,855 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:00:50,857 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 05:00:51,032 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:00:51,032 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 05:00:51,104 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 05:00:51,105 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:34676 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34680 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34680 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34680 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34680 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34680 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34680 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-20 04:58:33.697896258 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 04:58:34,212 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:58:34,213 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 04:58:34,310 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:58:34,311 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 04:58:34,358 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:58:34,358 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:60902 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60914 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60914 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60914 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60914 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60914 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60914 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-20 04:57:42.640870026 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-20 04:57:45,261 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:57:45,264 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 04:57:45,435 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:57:45,435 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 04:57:45,511 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:57:45,511 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54820 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54830 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54830 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54830 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54830 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54830 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54830 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-07-20 04:55:16,417 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:55:16,419 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 04:55:16,524 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:55:16,524 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 04:55:16,597 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:55:16,598 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:40170 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40184 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40184 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40184 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40184 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40184 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40184 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-07-20 04:54:25,636 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:54:25,638 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 04:54:25,760 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:54:25,760 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 04:54:25,808 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:54:25,808 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35644 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35658 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35658 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35658 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35658 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35658 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35658 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-07-20 04:51:51,718 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:51:51,720 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 04:51:51,817 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:51:51,817 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 04:51:51,856 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:51:51,856 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51316 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51330 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51330 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51330 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51330 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51330 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51330 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-07-20 04:50:16,406 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:50:16,409 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 04:50:16,551 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:50:16,552 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 04:50:16,632 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:50:16,633 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57040 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57048 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57048 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57048 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57048 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57048 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57048 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-07-20 04:47:59,895 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:47:59,898 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 04:47:59,993 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:47:59,994 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 04:48:00,031 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:48:00,032 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35710 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35718 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35718 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35718 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35718 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35718 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35718 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-07-20 04:46:22,213 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:46:22,216 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-20 04:46:22,353 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:46:22,353 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-20 04:46:22,433 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-20 04:46:22,433 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:34968 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34978 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34978 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34978 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34978 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34978 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34978 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:38790 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38804 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38804 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38804 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38804 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38804 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38804 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:54068 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54080 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54080 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54080 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:40380 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40388 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40388 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40388 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40388 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40388 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40388 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:36064 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36076 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36076 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36076 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36076 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36076 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36076 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:47270 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47276 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47276 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47276 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47276 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47276 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47276 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:36980 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36992 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36992 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36992 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36992 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36992 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36992 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:53484 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53488 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53488 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53488 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53488 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53488 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53488 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:44594 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44608 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44608 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44608 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44608 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44608 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44608 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:40406 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40420 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40420 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40420 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40420 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40420 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40420 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:55360 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55370 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55370 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55370 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55370 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55370 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55370 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:33480 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33482 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33482 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33482 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33482 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33482 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33482 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:46782 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46794 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46794 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46794 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46794 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46794 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46794 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:49032 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49048 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49048 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49048 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49048 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49048 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49048 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:48064 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48074 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48074 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48074 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48074 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48074 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48074 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

