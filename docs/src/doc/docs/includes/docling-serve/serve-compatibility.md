# Results for ghcr.io/docling-project/docling-serve as of 2026-06-15T12:09:16.181003427Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
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
INFO:	12:09:03 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:09:03 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	12:09:03 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	12:09:03 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	12:09:03 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/readyz$,/ready$,/livez$,/healthz$,/metrics$)
INFO:	12:09:03 - uvicorn.error - Started server process [1]
INFO:	12:09:03 - uvicorn.error - Waiting for application startup.
INFO:	12:09:06 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:09:06 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	12:09:06 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:09:06 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	12:09:06 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:09:06 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	12:09:06 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:09:06 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-06-15 12:09:06.270603246 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	12:09:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-06-15 12:09:06,492 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:09:06,493 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:09:06,581 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:09:06,581 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:09:06,626 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:09:06,627 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:09:06 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:09:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  89%|████████▉ | 689/770 [00:00<00:00, 6880.25it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6889.71it/s]
INFO:	12:09:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:09:07 - uvicorn.error - Application startup complete.
INFO:	12:09:07 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	12:09:07 - docling_serve.app - Health check requested
INFO:	12:09:07 - uvicorn.access - 172.17.0.1:49064 - "GET /health HTTP/1.1" 200
INFO:	12:09:07 - docling_serve.app - Health check requested
INFO:	12:09:07 - uvicorn.access - 172.17.0.1:49070 - "GET /health HTTP/1.1" 200
INFO:	12:09:07 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:09:07 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:09:07 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:09:07 - docling_serve.app - [TENANT_ID] Task 0c384e6c-2230-4705-80a8-8c8764f8997c created with tenant_id='default'
INFO:	12:09:07 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 0c384e6c-2230-4705-80a8-8c8764f8997c
INFO:	12:09:07 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:09:07 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	12:09:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-06-15 12:09:07,602 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:09:07,602 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:09:07,689 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:09:07,690 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:09:07,737 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:09:07,737 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:09:07 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:09:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  86%|████████▌ | 661/770 [00:00<00:00, 6602.50it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6582.09it/s]
INFO:	12:09:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:09:08 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:09:08 - docling.document_converter - Going to convert document batch...
INFO:	12:09:08 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:09:08 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:09:08 - docling.document_converter - Finished converting document file in 0.23 sec.
WARNING:	12:09:08 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	12:09:08 - docling_jobkit.convert.results - Processed 1 docs in 0.26 seconds.
INFO:	12:09:08 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 0c384e6c-2230-4705-80a8-8c8764f8997c in 0.26 seconds
INFO:	12:09:09 - uvicorn.access - 172.17.0.1:49070 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:09:09 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:09:09 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:09:09 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:09:09 - docling_serve.app - [TENANT_ID] Task a48f0555-0f97-45d8-abb9-9c6744106e4d created with tenant_id='default'
INFO:	12:09:09 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task a48f0555-0f97-45d8-abb9-9c6744106e4d
INFO:	12:09:09 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:09:09 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	12:09:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-06-15 12:09:09,625 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:09:09,626 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:09:09,712 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:09:09,713 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:09:09,759 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:09:09,760 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:09:09 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:09:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  86%|████████▌ | 660/770 [00:00<00:00, 6583.18it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6620.75it/s]
INFO:	12:09:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:09:10 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:09:10 - docling.document_converter - Going to convert document batch...
INFO:	12:09:10 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:09:10 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:09:10 - docling.document_converter - Finished converting document file in 0.21 sec.
INFO:	12:09:10 - docling_jobkit.convert.results - Processed 1 docs in 0.21 seconds.
INFO:	12:09:10 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job a48f0555-0f97-45d8-abb9-9c6744106e4d in 0.21 seconds
INFO:	12:09:11 - uvicorn.access - 172.17.0.1:49070 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:09:11 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:09:11 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:09:11 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:09:11 - docling_serve.app - [TENANT_ID] Task 2e9d61c0-d49b-4401-8b98-07b3da0e9e62 created with tenant_id='default'
INFO:	12:09:11 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 2e9d61c0-d49b-4401-8b98-07b3da0e9e62
INFO:	12:09:11 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:09:11 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	12:09:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-06-15 12:09:11,634 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:09:11,634 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:09:11,719 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:09:11,719 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:09:11,766 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:09:11,766 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:09:11 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:09:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  87%|████████▋ | 667/770 [00:00<00:00, 6664.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6667.76it/s]
INFO:	12:09:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:09:12 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:09:12 - docling.document_converter - Going to convert document batch...
INFO:	12:09:12 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:09:12 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:09:12 - docling.document_converter - Finished converting document file in 0.19 sec.
INFO:	12:09:12 - docling_jobkit.convert.results - Processed 1 docs in 0.20 seconds.
INFO:	12:09:12 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 2e9d61c0-d49b-4401-8b98-07b3da0e9e62 in 0.20 seconds
INFO:	12:09:13 - uvicorn.access - 172.17.0.1:49070 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:09:13 - uvicorn.access - 172.17.0.1:49070 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	12:09:13 - uvicorn.access - 172.17.0.1:49070 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	12:08:26 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:08:27 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	12:08:27 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	12:08:27 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	12:08:27 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/healthz$,/livez$,/metrics$,/ready$,/health$)
INFO:	12:08:27 - uvicorn.error - Started server process [1]
INFO:	12:08:27 - uvicorn.error - Waiting for application startup.
INFO:	12:08:33 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:08:33 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	12:08:33 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:08:33 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	12:08:33 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:08:33 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	12:08:33 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:08:33 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-06-15 12:08:34.090975179 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	12:08:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-06-15 12:08:34,521 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:08:34,524 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:08:34,659 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:08:34,659 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:08:34,716 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:08:34,716 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:08:34 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:08:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  93%|█████████▎| 713/770 [00:00<00:00, 7089.98it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7124.64it/s]
INFO:	12:08:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:08:35 - uvicorn.error - Application startup complete.
INFO:	12:08:35 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	12:08:36 - docling_serve.app - Health check requested
INFO:	12:08:36 - uvicorn.access - 172.17.0.1:41476 - "GET /health HTTP/1.1" 200
INFO:	12:08:36 - docling_serve.app - Health check requested
INFO:	12:08:36 - uvicorn.access - 172.17.0.1:41482 - "GET /health HTTP/1.1" 200
INFO:	12:08:36 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:08:36 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:08:36 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:08:36 - docling_serve.app - [TENANT_ID] Task c3465726-13e5-4694-91de-15b0e73bb447 created with tenant_id='default'
INFO:	12:08:36 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task c3465726-13e5-4694-91de-15b0e73bb447
INFO:	12:08:36 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:08:36 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	12:08:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-06-15 12:08:36,174 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:08:36,174 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:08:36,284 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:08:36,284 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:08:36,334 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:08:36,334 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:08:36 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:08:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  80%|████████  | 617/770 [00:00<00:00, 6138.92it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5973.34it/s]
INFO:	12:08:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:08:37 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:08:37 - docling.document_converter - Going to convert document batch...
INFO:	12:08:37 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:08:37 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:08:37 - docling.document_converter - Finished converting document file in 0.29 sec.
WARNING:	12:08:37 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	12:08:37 - docling_jobkit.convert.results - Processed 1 docs in 0.34 seconds.
INFO:	12:08:37 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job c3465726-13e5-4694-91de-15b0e73bb447 in 0.34 seconds
INFO:	12:08:38 - uvicorn.access - 172.17.0.1:41482 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:08:38 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:08:38 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:08:38 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:08:38 - docling_serve.app - [TENANT_ID] Task c8e89e33-4848-4958-a726-fc1d397a276b created with tenant_id='default'
INFO:	12:08:38 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task c8e89e33-4848-4958-a726-fc1d397a276b
INFO:	12:08:38 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:08:38 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	12:08:38 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-06-15 12:08:38,202 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:08:38,202 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:08:38,326 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:08:38,326 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:08:38,396 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:08:38,397 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:08:38 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:08:38 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  75%|███████▍  | 575/770 [00:00<00:00, 5740.33it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5809.70it/s]
INFO:	12:08:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:08:39 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:08:39 - docling.document_converter - Going to convert document batch...
INFO:	12:08:39 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:08:39 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:08:39 - docling.document_converter - Finished converting document file in 0.22 sec.
INFO:	12:08:39 - docling_jobkit.convert.results - Processed 1 docs in 0.23 seconds.
INFO:	12:08:39 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job c8e89e33-4848-4958-a726-fc1d397a276b in 0.23 seconds
INFO:	12:08:40 - uvicorn.access - 172.17.0.1:41482 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:08:40 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:08:40 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:08:40 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:08:40 - docling_serve.app - [TENANT_ID] Task 64f419e8-b117-4d46-bcf2-8bddbed90620 created with tenant_id='default'
INFO:	12:08:40 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 64f419e8-b117-4d46-bcf2-8bddbed90620
INFO:	12:08:40 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:08:40 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash fb1751b09de6bdbe35ede48676ca8f82
INFO:	12:08:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-06-15 12:08:40,208 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:08:40,208 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:08:40,375 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:08:40,375 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:08:40,468 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:08:40,468 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:08:40 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:08:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7910.25it/s]
INFO:	12:08:41 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:08:41 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:08:41 - docling.document_converter - Going to convert document batch...
INFO:	12:08:41 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:08:41 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:08:41 - docling.document_converter - Finished converting document file in 0.26 sec.
INFO:	12:08:41 - docling_jobkit.convert.results - Processed 1 docs in 0.28 seconds.
INFO:	12:08:41 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 64f419e8-b117-4d46-bcf2-8bddbed90620 in 0.28 seconds
INFO:	12:08:42 - uvicorn.access - 172.17.0.1:41482 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:08:42 - uvicorn.access - 172.17.0.1:41482 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	12:08:42 - uvicorn.access - 172.17.0.1:41482 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	12:07:20 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:07:20 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	12:07:20 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	12:07:20 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	12:07:20 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/livez$,/readyz$,/health$,/healthz$,/metrics$)
INFO:	12:07:20 - uvicorn.error - Started server process [1]
INFO:	12:07:20 - uvicorn.error - Waiting for application startup.
INFO:	12:07:25 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:07:25 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	12:07:25 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:07:25 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	12:07:25 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:07:25 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash bcb2e23b24bd94a42b5c00d662a7c1cf
INFO:	12:07:25 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	12:07:25 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-06-15 12:07:25.853137091 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	12:07:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-06-15 12:07:26,285 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:07:26,288 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:07:26,796 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:07:26,796 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:07:26,884 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:07:26,885 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:07:27 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:07:27 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  94%|█████████▍| 722/770 [00:00<00:00, 7205.99it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7442.71it/s]
INFO:	12:07:27 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:07:28 - uvicorn.error - Application startup complete.
INFO:	12:07:28 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	12:07:28 - docling_serve.app - Health check requested
INFO:	12:07:28 - uvicorn.access - 172.17.0.1:33802 - "GET /health HTTP/1.1" 200
INFO:	12:07:28 - docling_serve.app - Health check requested
INFO:	12:07:28 - uvicorn.access - 172.17.0.1:33812 - "GET /health HTTP/1.1" 200
INFO:	12:07:28 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:07:28 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:07:28 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:07:28 - docling_serve.app - [TENANT_ID] Task ecbf8bd3-04e3-475c-99f6-5e422d8d360b created with tenant_id='default'
INFO:	12:07:28 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task ecbf8bd3-04e3-475c-99f6-5e422d8d360b
INFO:	12:07:28 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:07:28 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	12:07:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-06-15 12:07:28,994 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:07:28,995 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:07:29,096 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:07:29,096 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:07:29,160 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:07:29,161 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:07:29 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:07:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  86%|████████▋ | 666/770 [00:00<00:00, 6641.76it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6887.90it/s]
INFO:	12:07:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:07:30 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:07:30 - docling.document_converter - Going to convert document batch...
INFO:	12:07:30 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:07:30 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:07:30 - docling.document_converter - Finished converting document file in 0.26 sec.
WARNING:	12:07:30 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	12:07:30 - docling_jobkit.convert.results - Processed 1 docs in 0.30 seconds.
INFO:	12:07:30 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job ecbf8bd3-04e3-475c-99f6-5e422d8d360b in 0.30 seconds
INFO:	12:07:32 - uvicorn.access - 172.17.0.1:33812 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:07:33 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:07:33 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:07:33 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:07:33 - docling_serve.app - [TENANT_ID] Task 6376a2be-3535-4a0f-92ed-2d1676a5a180 created with tenant_id='default'
INFO:	12:07:33 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 6376a2be-3535-4a0f-92ed-2d1676a5a180
INFO:	12:07:33 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:07:33 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	12:07:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-06-15 12:07:33,123 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:07:33,123 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:07:33,270 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:07:33,270 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:07:33,368 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:07:33,369 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:07:33 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:07:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  92%|█████████▏| 712/770 [00:00<00:00, 7081.44it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7267.83it/s]
INFO:	12:07:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:07:34 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:07:34 - docling.document_converter - Going to convert document batch...
INFO:	12:07:34 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:07:34 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:07:34 - docling.document_converter - Finished converting document file in 0.23 sec.
INFO:	12:07:34 - docling_jobkit.convert.results - Processed 1 docs in 0.24 seconds.
INFO:	12:07:34 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 6376a2be-3535-4a0f-92ed-2d1676a5a180 in 0.24 seconds
INFO:	12:07:35 - uvicorn.access - 172.17.0.1:33812 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:07:35 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	12:07:35 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	12:07:35 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	12:07:35 - docling_serve.app - [TENANT_ID] Task 2a061bda-f3ef-41fa-8af6-23070ba9305a created with tenant_id='default'
INFO:	12:07:35 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 2a061bda-f3ef-41fa-8af6-23070ba9305a
INFO:	12:07:35 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	12:07:35 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 3eabf304acb4a56e9ef52b02ef69bccb
INFO:	12:07:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-06-15 12:07:35,133 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:07:35,133 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:07:35,263 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:07:35,263 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:07:35,317 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:07:35,317 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	12:07:35 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	12:07:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  78%|███████▊  | 598/770 [00:00<00:00, 5978.78it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5866.98it/s]
INFO:	12:07:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	12:07:36 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	12:07:36 - docling.document_converter - Going to convert document batch...
INFO:	12:07:36 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	12:07:36 - docling.pipeline.base_pipeline - Processing document file
INFO:	12:07:36 - docling.document_converter - Finished converting document file in 0.27 sec.
INFO:	12:07:36 - docling_jobkit.convert.results - Processed 1 docs in 0.30 seconds.
INFO:	12:07:36 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 2a061bda-f3ef-41fa-8af6-23070ba9305a in 0.30 seconds
INFO:	12:07:37 - uvicorn.access - 172.17.0.1:33812 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	12:07:37 - uvicorn.access - 172.17.0.1:33812 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	12:07:37 - uvicorn.access - 172.17.0.1:33812 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
2026-06-15 12:06:03.458692420 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 12:06:03,734 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:06:03,735 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:06:03,824 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:06:03,824 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:06:03,869 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:06:03,869 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  82%|████████▏ | 633/770 [00:00<00:00, 6326.19it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6475.62it/s]
[INFO] 2026-06-15 12:06:04,867 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:06:04,867 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:06:04,956 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:06:04,957 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:06:05,002 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:06:05,002 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  87%|████████▋ | 671/770 [00:00<00:00, 6674.54it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6666.15it/s]
WARNING:	12:06:06 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
WARNING:	12:06:06 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
[INFO] 2026-06-15 12:06:06,893 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:06:06,893 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:06:06,989 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:06:06,989 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:06:07,036 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:06:07,036 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  91%|█████████ | 697/770 [00:00<00:00, 6937.24it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6988.92it/s]
[INFO] 2026-06-15 12:06:08,895 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:06:08,896 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:06:08,992 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:06:08,992 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:06:09,039 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:06:09,039 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  89%|████████▉ | 685/770 [00:00<00:00, 6844.15it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6818.98it/s]

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
2026-06-15 12:05:09.041959809 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 12:05:09,483 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:05:09,486 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:05:09,688 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:05:09,689 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:05:09,769 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:05:09,769 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  49%|████▉     | 379/770 [00:00<00:00, 3777.75it/s]Loading weights:  98%|█████████▊| 757/770 [00:00<00:00, 3622.49it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 3693.19it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50366 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50382 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:05:11,875 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:05:11,876 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:05:11,995 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:05:11,996 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:05:12,050 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:05:12,051 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▍ | 651/770 [00:00<00:00, 6475.62it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7106.02it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50382 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:05:14,187 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:05:14,187 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:05:14,320 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:05:14,320 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:05:14,367 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:05:14,367 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 8612.67it/s]
INFO:     172.17.0.1:50382 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:05:15,926 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:05:15,926 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:05:16,045 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:05:16,046 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:05:16,130 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:05:16,131 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  71%|███████▏  | 550/770 [00:00<00:00, 5495.71it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5690.53it/s]
INFO:     172.17.0.1:50382 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50382 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50382 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-15 12:03:41.404283509 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 12:03:41,682 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:03:41,683 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:03:41,768 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:03:41,768 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:03:41,814 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:03:41,815 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  89%|████████▉ | 688/770 [00:00<00:00, 6876.74it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6875.22it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:45464 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45468 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:03:42,849 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:03:42,849 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:03:42,935 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:03:42,935 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:03:42,983 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:03:42,983 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  83%|████████▎ | 642/770 [00:00<00:00, 6419.16it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6476.36it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45468 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:03:44,852 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:03:44,852 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:03:44,945 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:03:44,945 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:03:44,992 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:03:44,992 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  78%|███████▊  | 602/770 [00:00<00:00, 6016.99it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6252.02it/s]
INFO:     172.17.0.1:45468 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:03:46,872 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:03:46,872 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:03:46,973 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:03:46,974 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:03:47,020 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:03:47,020 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  79%|███████▉  | 609/770 [00:00<00:00, 6083.97it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6274.40it/s]
INFO:     172.17.0.1:45468 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45468 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45468 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-15 12:02:49.543101493 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 12:02:49,962 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:02:49,965 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:02:50,116 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:02:50,116 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:02:50,188 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:02:50,188 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  47%|████▋     | 363/770 [00:00<00:00, 3627.81it/s]Loading weights:  94%|█████████▍| 726/770 [00:00<00:00, 3382.98it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 3501.70it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35282 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47668 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:02:54,332 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:02:54,332 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:02:54,453 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:02:54,453 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:02:54,524 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:02:54,524 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  79%|███████▉  | 612/770 [00:00<00:00, 6118.68it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6471.11it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47668 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:02:56,348 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:02:56,348 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:02:56,469 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:02:56,469 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:02:56,518 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:02:56,518 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 8000.59it/s]
INFO:     172.17.0.1:47668 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:02:58,627 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:02:58,628 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:02:58,733 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:02:58,733 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:02:58,782 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:02:58,782 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  78%|███████▊  | 604/770 [00:00<00:00, 6028.67it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6690.52it/s]
INFO:     172.17.0.1:47668 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47668 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47668 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-15 12:01:06.645567614 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 12:01:07,148 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:01:07,150 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:01:07,273 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:01:07,274 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:01:07,323 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:01:07,323 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 8716.22it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56630 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56640 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:01:08,974 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:01:08,974 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:01:09,071 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:01:09,072 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:01:09,141 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:01:09,142 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 8318.09it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56640 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:01:10,983 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:01:10,983 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:01:11,072 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:01:11,072 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:01:11,113 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:01:11,113 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  81%|████████  | 622/770 [00:00<00:00, 6216.14it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6427.23it/s]
INFO:     172.17.0.1:56640 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:01:12,998 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:01:12,998 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-15 12:01:13,083 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:01:13,084 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-15 12:01:13,134 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:01:13,134 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  86%|████████▌ | 660/770 [00:00<00:00, 6581.18it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6614.27it/s]
INFO:     172.17.0.1:56640 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56640 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56640 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-15 12:00:27.868363729 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 12:00:28,524 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:00:28,526 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 12:00:28,672 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:00:28,672 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 12:00:28,715 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:00:28,715 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  91%|█████████ | 700/770 [00:00<00:00, 6987.60it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7289.24it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51682 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51686 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:00:30,424 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:00:30,424 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 12:00:30,538 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:00:30,538 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 12:00:30,609 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:00:30,609 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  72%|███████▏  | 555/770 [00:00<00:00, 5545.89it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5933.99it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51686 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:00:32,452 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:00:32,452 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 12:00:32,557 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:00:32,558 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 12:00:32,625 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:00:32,625 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  73%|███████▎  | 561/770 [00:00<00:00, 5577.48it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6060.28it/s]
INFO:     172.17.0.1:51686 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-15 12:00:34,459 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:00:34,459 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 12:00:34,583 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:00:34,583 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 12:00:34,631 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 12:00:34,631 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7745.18it/s]
INFO:     172.17.0.1:51686 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51686 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51686 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-15 11:58:55.323809457 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 11:58:56,235 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:58:56,237 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:58:56,412 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:58:56,412 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:58:56,459 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:58:56,459 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56546 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56550 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56550 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56550 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56550 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56550 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56550 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-15 11:57:09.207551530 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 11:57:09,693 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:57:09,695 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:57:09,774 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:57:09,775 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:57:09,817 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:57:09,817 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51270 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51282 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51282 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51282 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51282 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51282 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51282 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-15 11:55:49.681327929 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 11:55:50,299 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:55:50,301 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:55:50,434 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:55:50,435 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:55:50,480 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:55:50,481 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:33292 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33306 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33306 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33306 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33306 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33306 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33306 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-15 11:54:11.336740475 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 11:54:11,786 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:54:11,787 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:54:11,867 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:54:11,867 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:54:11,910 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:54:11,910 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50668 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50684 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50684 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50684 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50684 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50684 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50684 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-15 11:53:08.291603997 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 11:53:08,934 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:53:08,937 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:53:09,074 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:53:09,074 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:53:09,181 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:53:09,181 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:40402 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40404 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40404 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40404 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40404 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40404 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40404 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-15 11:51:10.784626525 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 11:51:11,336 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:51:11,339 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:51:11,459 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:51:11,459 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:51:11,502 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:51:11,502 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:36158 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36162 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36162 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36162 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36162 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36162 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36162 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-15 11:50:09.576988471 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 11:50:10,201 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:50:10,204 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:50:10,351 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:50:10,351 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:50:10,403 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:50:10,403 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50224 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50234 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50234 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50234 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50234 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50234 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50234 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-15 11:48:59.074343040 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-15 11:49:01,411 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:49:01,414 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:49:01,568 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:49:01,568 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:49:01,633 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:49:01,634 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:42246 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42250 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42250 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42250 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42250 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42250 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42250 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-15 11:46:54,597 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:46:54,599 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:46:54,649 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:46:54,649 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:46:54,673 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:46:54,674 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58212 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58224 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58224 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58224 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58224 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58224 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58224 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-15 11:46:02,978 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:46:02,981 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:46:03,098 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:46:03,098 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:46:03,136 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:46:03,136 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:34020 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34032 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34032 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34032 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34032 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34032 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34032 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-15 11:43:46,682 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:43:46,684 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:43:46,773 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:43:46,773 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:43:46,802 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:43:46,803 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46378 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46394 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46394 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46394 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46394 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46394 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46394 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-15 11:42:12,190 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:42:12,192 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:42:12,298 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:42:12,298 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:42:12,336 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:42:12,336 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55104 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55120 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55120 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55120 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55120 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55120 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55120 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-15 11:40:09,066 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:40:09,069 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:40:09,158 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:40:09,158 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:40:09,196 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:40:09,196 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54810 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54812 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54812 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54812 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54812 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54812 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54812 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-15 11:38:38,475 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:38:38,477 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-15 11:38:38,594 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:38:38,595 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-15 11:38:38,649 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-15 11:38:38,649 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:60746 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60756 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60756 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60756 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50564 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50578 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50578 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50578 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50578 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50578 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50578 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:42058 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42062 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42062 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42062 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42062 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42062 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42062 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:40222 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40230 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40230 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40230 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40230 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40230 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40230 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:57010 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57020 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57020 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57020 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57020 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57020 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57020 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:41304 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41308 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41308 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41308 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41308 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41308 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41308 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:49178 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49184 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49184 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49184 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49184 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49184 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49184 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:54674 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54680 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54680 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54680 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54680 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54680 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54680 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:53386 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53390 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53390 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53390 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53390 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53390 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53390 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:46116 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46120 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46120 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46120 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46120 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46120 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46120 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52524 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52526 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52526 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52526 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52526 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52526 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52526 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:46006 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46014 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46014 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46014 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46014 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46014 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46014 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:57342 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57344 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57344 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57344 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57344 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57344 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57344 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50114 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50122 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50122 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50122 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:48140 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48150 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48150 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48150 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48150 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48150 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48150 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

