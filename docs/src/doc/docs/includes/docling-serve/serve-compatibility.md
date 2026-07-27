# Results for ghcr.io/docling-project/docling-serve as of 2026-07-27T05:21:16.757408873Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
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
INFO:	05:20:59 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:20:59 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:20:59 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:20:59 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:20:59 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/healthz$,/health$,/livez$,/metrics$,/readyz$)
INFO:	05:21:00 - uvicorn.error - Started server process [1]
INFO:	05:21:00 - uvicorn.error - Waiting for application startup.
INFO:	05:21:03 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:21:03 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:21:03 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:21:03 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:21:03 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:03 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	05:21:03 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:21:03 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	05:21:03 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-07-27 05:21:03.571250156 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:21:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:21:03,779 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:21:03,780 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-07-27 05:21:03,837 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:21:03,837 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:21:03,882 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:21:03,882 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:21:03 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  79%|███████▉  | 611/770 [00:00<00:00, 6087.06it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6208.40it/s]
INFO:	05:21:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:04 - uvicorn.error - Application startup complete.
INFO:	05:21:04 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:21:05 - docling_serve.app - Health check requested
INFO:	05:21:05 - uvicorn.access - 172.17.0.1:39374 - "GET /health HTTP/1.1" 200
INFO:	05:21:05 - docling_serve.app - Health check requested
INFO:	05:21:05 - uvicorn.access - 172.17.0.1:39382 - "GET /health HTTP/1.1" 200
INFO:	05:21:05 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:21:05 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:21:05 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:21:05 - docling_serve.app - [TENANT_ID] Task c021b464-0ec3-4c18-9a3f-0b4f407d9935 created with tenant_id='default'
INFO:	05:21:05 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task c021b464-0ec3-4c18-9a3f-0b4f407d9935
INFO:	05:21:05 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:05 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	05:21:05 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:21:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:21:05,694 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:21:05,694 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-07-27 05:21:05,748 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:21:05,748 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:21:05,793 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:21:05,793 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:21:05 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  80%|███████▉  | 615/770 [00:00<00:00, 6127.39it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6132.70it/s]
INFO:	05:21:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:07 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:21:07 - docling.document_converter - Going to convert document batch...
INFO:	05:21:07 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:21:07 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:21:07 - docling.document_converter - Finished converting document file in 0.80 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	05:21:07 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:21:07 - docling_jobkit.convert.results - Processed 1 docs in 0.83 seconds.
INFO:	05:21:07 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job c021b464-0ec3-4c18-9a3f-0b4f407d9935 in 0.83 seconds
INFO:	05:21:07 - uvicorn.access - 172.17.0.1:39382 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:21:07 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:21:07 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:21:07 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:21:07 - docling_serve.app - [TENANT_ID] Task ef84dead-7d15-4fb8-b6c3-6d084dbcf9a1 created with tenant_id='default'
INFO:	05:21:07 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task ef84dead-7d15-4fb8-b6c3-6d084dbcf9a1
INFO:	05:21:07 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:07 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	05:21:07 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:21:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:21:07,709 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:21:07,709 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-07-27 05:21:07,759 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:21:07,760 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:21:07,816 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:21:07,816 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:21:07 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  79%|███████▉  | 608/770 [00:00<00:00, 6073.37it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6143.66it/s]
INFO:	05:21:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:09 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:21:09 - docling.document_converter - Going to convert document batch...
INFO:	05:21:09 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:21:09 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:21:09 - docling.document_converter - Finished converting document file in 0.60 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:21:09 - docling_jobkit.convert.results - Processed 1 docs in 0.60 seconds.
INFO:	05:21:09 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job ef84dead-7d15-4fb8-b6c3-6d084dbcf9a1 in 0.60 seconds
INFO:	05:21:09 - uvicorn.access - 172.17.0.1:39382 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:21:09 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:21:09 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:21:09 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:21:09 - docling_serve.app - [TENANT_ID] Task 4aacc374-3dca-41a8-84e9-80632f602f54 created with tenant_id='default'
INFO:	05:21:09 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 4aacc374-3dca-41a8-84e9-80632f602f54
INFO:	05:21:09 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:21:09 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	05:21:09 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:21:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:21:09,725 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:21:09,726 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-07-27 05:21:09,774 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:21:09,775 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:21:09,821 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:21:09,821 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	05:21:09 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:21:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  79%|███████▉  | 611/770 [00:00<00:00, 6083.30it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6169.87it/s]
INFO:	05:21:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:21:11 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:21:11 - docling.document_converter - Going to convert document batch...
INFO:	05:21:11 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:21:11 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:21:11 - docling.document_converter - Finished converting document file in 0.62 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:21:11 - docling_jobkit.convert.results - Processed 1 docs in 0.64 seconds.
INFO:	05:21:11 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 4aacc374-3dca-41a8-84e9-80632f602f54 in 0.64 seconds
INFO:	05:21:11 - uvicorn.access - 172.17.0.1:39382 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:21:11 - uvicorn.access - 172.17.0.1:39382 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:21:11 - uvicorn.access - 172.17.0.1:39382 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:19:52 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:19:52 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:19:52 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:19:52 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:19:52 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/readyz$,/healthz$,/livez$,/metrics$,/health$)
INFO:	05:19:52 - uvicorn.error - Started server process [1]
INFO:	05:19:52 - uvicorn.error - Waiting for application startup.
INFO:	05:19:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:19:56 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:19:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:19:56 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:19:56 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:19:56 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c4d6547d10e26a777a530d63ca01a1a1
INFO:	05:19:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:19:56 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	05:19:56 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-07-27 05:19:56.439706321 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:19:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:19:57,062 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:19:57,064 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:19:57,214 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:19:57,215 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:19:57,305 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:19:57,305 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:19:57 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:19:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  83%|████████▎ | 637/770 [00:00<00:00, 6368.06it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6112.78it/s]
INFO:	05:19:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:19:58 - uvicorn.error - Application startup complete.
INFO:	05:19:58 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:19:59 - docling_serve.app - Health check requested
INFO:	05:19:59 - uvicorn.access - 172.17.0.1:49232 - "GET /health HTTP/1.1" 200
INFO:	05:19:59 - docling_serve.app - Health check requested
INFO:	05:19:59 - uvicorn.access - 172.17.0.1:49246 - "GET /health HTTP/1.1" 200
INFO:	05:19:59 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:19:59 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:19:59 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:19:59 - docling_serve.app - [TENANT_ID] Task 4931a440-7157-4e8b-9c47-314eef9c0cda created with tenant_id='default'
INFO:	05:19:59 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 4931a440-7157-4e8b-9c47-314eef9c0cda
INFO:	05:19:59 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:19:59 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	05:19:59 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:19:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:19:59,690 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:19:59,690 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:19:59,803 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:19:59,803 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:19:59,856 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:19:59,856 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:20:00 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:20:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7872.56it/s]
INFO:	05:20:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:20:01 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:20:01 - docling.document_converter - Going to convert document batch...
INFO:	05:20:01 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:20:01 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:20:01 - docling.document_converter - Finished converting document file in 0.38 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	05:20:01 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:20:01 - docling_jobkit.convert.results - Processed 1 docs in 0.43 seconds.
INFO:	05:20:01 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 4931a440-7157-4e8b-9c47-314eef9c0cda in 0.43 seconds
INFO:	05:20:01 - uvicorn.access - 172.17.0.1:49246 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:20:01 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:20:01 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:20:01 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:20:01 - docling_serve.app - [TENANT_ID] Task 5b5f5280-9043-46f4-8d43-33f2051ae8d1 created with tenant_id='default'
INFO:	05:20:01 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 5b5f5280-9043-46f4-8d43-33f2051ae8d1
INFO:	05:20:01 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:20:01 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	05:20:01 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:20:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:20:01,709 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:20:01,709 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:20:01,884 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:20:01,885 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:20:01,953 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:20:01,954 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:20:02 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:20:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  78%|███████▊  | 603/770 [00:00<00:00, 6017.01it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5858.85it/s]
INFO:	05:20:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:20:03 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:20:03 - docling.document_converter - Going to convert document batch...
INFO:	05:20:03 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:20:03 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:20:03 - docling.document_converter - Finished converting document file in 0.44 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:20:03 - docling_jobkit.convert.results - Processed 1 docs in 0.44 seconds.
INFO:	05:20:03 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 5b5f5280-9043-46f4-8d43-33f2051ae8d1 in 0.44 seconds
INFO:	05:20:03 - uvicorn.access - 172.17.0.1:49246 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:20:03 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:20:03 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:20:03 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:20:03 - docling_serve.app - [TENANT_ID] Task 09c78499-c469-4373-a3c9-8c414dbe994c created with tenant_id='default'
INFO:	05:20:03 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 09c78499-c469-4373-a3c9-8c414dbe994c
INFO:	05:20:03 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:20:03 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 63e8839d1103b03d45382915dba33c89
INFO:	05:20:03 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	05:20:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:20:03,725 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:20:03,726 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:20:03,836 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:20:03,836 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:20:03,923 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:20:03,923 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:20:04 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:20:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  72%|███████▏  | 556/770 [00:00<00:00, 5518.89it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5393.86it/s]
INFO:	05:20:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:20:05 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:20:05 - docling.document_converter - Going to convert document batch...
INFO:	05:20:05 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:20:05 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:20:05 - docling.document_converter - Finished converting document file in 0.55 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	05:20:05 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	05:20:05 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 09c78499-c469-4373-a3c9-8c414dbe994c in 0.58 seconds
INFO:	05:20:07 - uvicorn.access - 172.17.0.1:49246 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:20:08 - uvicorn.access - 172.17.0.1:49246 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:20:08 - uvicorn.access - 172.17.0.1:49246 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:18:43 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:18:43 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:18:43 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:18:43 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:18:43 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/healthz$,/health$,/ready$,/livez$,/metrics$,/readyz$)
INFO:	05:18:44 - uvicorn.error - Started server process [1]
INFO:	05:18:44 - uvicorn.error - Waiting for application startup.
INFO:	05:18:49 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:18:49 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:18:49 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:18:49 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:18:49 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:18:50 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash f446dcc5a1a7c6aff458e30cab474a9e
INFO:	05:18:50 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:18:50 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-07-27 05:18:50.164893945 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:18:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:18:50,609 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:18:50,611 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:18:50,751 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:18:50,752 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:18:50,815 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:18:50,815 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:18:51 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:18:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 509/770 [00:00<00:00, 5072.82it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5228.76it/s]
INFO:	05:18:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:18:52 - uvicorn.error - Application startup complete.
INFO:	05:18:52 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:18:52 - docling_serve.app - Health check requested
INFO:	05:18:52 - uvicorn.access - 172.17.0.1:36580 - "GET /health HTTP/1.1" 200
INFO:	05:18:52 - docling_serve.app - Health check requested
INFO:	05:18:52 - uvicorn.access - 172.17.0.1:36590 - "GET /health HTTP/1.1" 200
INFO:	05:18:52 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:18:52 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:18:52 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:18:52 - docling_serve.app - [TENANT_ID] Task 70775e7a-0a2b-4117-8207-7c8e16f0ee4f created with tenant_id='default'
INFO:	05:18:52 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 70775e7a-0a2b-4117-8207-7c8e16f0ee4f
INFO:	05:18:52 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:18:52 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	05:18:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:18:52,488 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:18:52,489 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:18:52,588 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:18:52,588 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:18:52,632 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:18:52,632 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:18:52 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:18:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  79%|███████▉  | 609/770 [00:00<00:00, 6085.99it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6087.64it/s]
INFO:	05:18:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:18:54 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:18:54 - docling.document_converter - Going to convert document batch...
INFO:	05:18:54 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:18:54 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:18:54 - docling.document_converter - Finished converting document file in 1.03 sec.
WARNING:	05:18:54 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:18:54 - docling_jobkit.convert.results - Processed 1 docs in 1.08 seconds.
INFO:	05:18:54 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 70775e7a-0a2b-4117-8207-7c8e16f0ee4f in 1.08 seconds
INFO:	05:18:56 - uvicorn.access - 172.17.0.1:36590 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:18:56 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:18:56 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:18:56 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:18:56 - docling_serve.app - [TENANT_ID] Task b25b520d-be0f-4473-82a5-d021fcc38f6e created with tenant_id='default'
INFO:	05:18:56 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task b25b520d-be0f-4473-82a5-d021fcc38f6e
INFO:	05:18:56 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:18:56 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	05:18:56 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:18:56,533 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:18:56,533 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:18:56,653 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:18:56,654 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:18:56,742 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:18:56,742 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:18:56 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:18:56 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  82%|████████▏ | 633/770 [00:00<00:00, 6309.22it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6197.27it/s]
INFO:	05:18:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:18:58 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:18:58 - docling.document_converter - Going to convert document batch...
INFO:	05:18:58 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:18:58 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:18:58 - docling.document_converter - Finished converting document file in 0.38 sec.
INFO:	05:18:58 - docling_jobkit.convert.results - Processed 1 docs in 0.38 seconds.
INFO:	05:18:58 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job b25b520d-be0f-4473-82a5-d021fcc38f6e in 0.38 seconds
INFO:	05:19:00 - uvicorn.access - 172.17.0.1:36590 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:19:00 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:19:00 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:19:00 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:19:00 - docling_serve.app - [TENANT_ID] Task e3ef2c06-3f56-4a10-809b-799151e7be5b created with tenant_id='default'
INFO:	05:19:00 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task e3ef2c06-3f56-4a10-809b-799151e7be5b
INFO:	05:19:00 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:19:00 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e50b6140ec7ee9be0d0fea6ba20c9795
INFO:	05:19:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:19:00,555 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:19:00,555 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:19:00,710 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:19:00,711 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:19:00,757 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:19:00,758 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:19:00 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:19:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 535/770 [00:00<00:00, 5338.55it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5873.58it/s]
INFO:	05:19:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:19:02 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:19:02 - docling.document_converter - Going to convert document batch...
INFO:	05:19:02 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:19:02 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:19:02 - docling.document_converter - Finished converting document file in 0.69 sec.
INFO:	05:19:02 - docling_jobkit.convert.results - Processed 1 docs in 0.71 seconds.
INFO:	05:19:02 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job e3ef2c06-3f56-4a10-809b-799151e7be5b in 0.71 seconds
INFO:	05:19:04 - uvicorn.access - 172.17.0.1:36590 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:19:04 - uvicorn.access - 172.17.0.1:36590 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:19:04 - uvicorn.access - 172.17.0.1:36590 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:17:13 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:17:13 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:17:13 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:17:13 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:17:13 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/livez$,/readyz$,/metrics$,/healthz$,/health$)
INFO:	05:17:14 - uvicorn.error - Started server process [1]
INFO:	05:17:14 - uvicorn.error - Waiting for application startup.
INFO:	05:17:18 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:17:18 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:17:18 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:17:18 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:17:18 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:17:18 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	05:17:18 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:17:18 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-07-27 05:17:18.400430280 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:17:18 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:17:18,728 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:17:18,730 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:17:18,857 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:17:18,857 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:17:18,945 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:17:18,946 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:17:19 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:17:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7963.40it/s]
INFO:	05:17:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:17:20 - uvicorn.error - Application startup complete.
INFO:	05:17:20 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:17:20 - docling_serve.app - Health check requested
INFO:	05:17:20 - uvicorn.access - 172.17.0.1:45594 - "GET /health HTTP/1.1" 200
INFO:	05:17:20 - docling_serve.app - Health check requested
INFO:	05:17:20 - uvicorn.access - 172.17.0.1:45596 - "GET /health HTTP/1.1" 200
INFO:	05:17:20 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:17:20 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:17:20 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:17:20 - docling_serve.app - [TENANT_ID] Task 208998fc-b062-4ab9-9c58-076a87a73c7b created with tenant_id='default'
INFO:	05:17:20 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 208998fc-b062-4ab9-9c58-076a87a73c7b
INFO:	05:17:20 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:17:20 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	05:17:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:17:20,585 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:17:20,585 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:17:20,744 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:17:20,745 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:17:20,795 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:17:20,795 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:17:21 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:17:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  75%|███████▌  | 579/770 [00:00<00:00, 5786.76it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6931.11it/s]
INFO:	05:17:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:17:22 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:17:22 - docling.document_converter - Going to convert document batch...
INFO:	05:17:22 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:17:22 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:17:22 - docling.document_converter - Finished converting document file in 0.86 sec.
WARNING:	05:17:22 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:17:22 - docling_jobkit.convert.results - Processed 1 docs in 0.90 seconds.
INFO:	05:17:22 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 208998fc-b062-4ab9-9c58-076a87a73c7b in 0.90 seconds
INFO:	05:17:24 - uvicorn.access - 172.17.0.1:45596 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:17:24 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:17:24 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:17:24 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:17:24 - docling_serve.app - [TENANT_ID] Task 97b272d3-3b90-4bf1-af2e-91c2e1fef929 created with tenant_id='default'
INFO:	05:17:24 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 97b272d3-3b90-4bf1-af2e-91c2e1fef929
INFO:	05:17:24 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:17:24 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	05:17:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:17:24,597 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:17:24,597 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:17:24,758 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:17:24,758 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:17:24,809 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:17:24,809 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:17:25 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:17:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 535/770 [00:00<00:00, 5319.23it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5636.36it/s]
INFO:	05:17:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:17:26 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:17:26 - docling.document_converter - Going to convert document batch...
INFO:	05:17:26 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:17:26 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:17:26 - docling.document_converter - Finished converting document file in 0.36 sec.
INFO:	05:17:26 - docling_jobkit.convert.results - Processed 1 docs in 0.36 seconds.
INFO:	05:17:26 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 97b272d3-3b90-4bf1-af2e-91c2e1fef929 in 0.36 seconds
INFO:	05:17:28 - uvicorn.access - 172.17.0.1:45596 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:17:28 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:17:28 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:17:28 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:17:28 - docling_serve.app - [TENANT_ID] Task 14f8bb7b-6ec9-4938-8beb-73346f7982c9 created with tenant_id='default'
INFO:	05:17:28 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 14f8bb7b-6ec9-4938-8beb-73346f7982c9
INFO:	05:17:28 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:17:28 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	05:17:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:17:28,631 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:17:28,631 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:17:28,744 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:17:28,744 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:17:28,829 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:17:28,829 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:17:29 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:17:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  76%|███████▌  | 585/770 [00:00<00:00, 5788.58it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6260.60it/s]
INFO:	05:17:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:17:30 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:17:30 - docling.document_converter - Going to convert document batch...
INFO:	05:17:30 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:17:30 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:17:30 - docling.document_converter - Finished converting document file in 0.61 sec.
INFO:	05:17:30 - docling_jobkit.convert.results - Processed 1 docs in 0.64 seconds.
INFO:	05:17:30 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 14f8bb7b-6ec9-4938-8beb-73346f7982c9 in 0.64 seconds
INFO:	05:17:32 - uvicorn.access - 172.17.0.1:45596 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:17:33 - uvicorn.access - 172.17.0.1:45596 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:17:33 - uvicorn.access - 172.17.0.1:45596 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:16:19 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:16:19 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:16:19 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:16:19 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:16:19 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/health$,/healthz$,/metrics$,/ready$,/livez$)
INFO:	05:16:19 - uvicorn.error - Started server process [1]
INFO:	05:16:19 - uvicorn.error - Waiting for application startup.
INFO:	05:16:24 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:16:24 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:16:24 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:16:24 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:16:24 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:16:24 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	05:16:24 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:16:24 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-07-27 05:16:24.867381595 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:16:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:16:25,207 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:16:25,209 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:16:25,371 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:16:25,371 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:16:25,462 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:16:25,462 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:16:25 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:16:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  82%|████████▏ | 635/770 [00:00<00:00, 6339.29it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6187.07it/s]
INFO:	05:16:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:16:26 - uvicorn.error - Application startup complete.
INFO:	05:16:26 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:16:27 - docling_serve.app - Health check requested
INFO:	05:16:27 - uvicorn.access - 172.17.0.1:57304 - "GET /health HTTP/1.1" 200
INFO:	05:16:27 - docling_serve.app - Health check requested
INFO:	05:16:27 - uvicorn.access - 172.17.0.1:57308 - "GET /health HTTP/1.1" 200
INFO:	05:16:27 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:16:27 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:16:27 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:16:27 - docling_serve.app - [TENANT_ID] Task 2ec89373-2896-4972-8166-ae1ca4df8a9c created with tenant_id='default'
INFO:	05:16:27 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 2ec89373-2896-4972-8166-ae1ca4df8a9c
INFO:	05:16:27 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:16:27 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	05:16:27 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:16:27,440 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:16:27,440 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:16:27,562 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:16:27,562 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:16:27,607 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:16:27,608 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:16:27 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:16:27 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 533/770 [00:00<00:00, 5329.37it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5334.76it/s]
INFO:	05:16:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:16:29 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:16:29 - docling.document_converter - Going to convert document batch...
INFO:	05:16:29 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:16:29 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:16:29 - docling.document_converter - Finished converting document file in 0.73 sec.
WARNING:	05:16:29 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:16:29 - docling_jobkit.convert.results - Processed 1 docs in 0.78 seconds.
INFO:	05:16:29 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 2ec89373-2896-4972-8166-ae1ca4df8a9c in 0.78 seconds
INFO:	05:16:31 - uvicorn.access - 172.17.0.1:57308 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:16:31 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:16:31 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:16:31 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:16:31 - docling_serve.app - [TENANT_ID] Task 7c190721-d2b3-41e5-932c-4bec850b632b created with tenant_id='default'
INFO:	05:16:31 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 7c190721-d2b3-41e5-932c-4bec850b632b
INFO:	05:16:31 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:16:31 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	05:16:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:16:31,487 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:16:31,487 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:16:31,650 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:16:31,650 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:16:31,722 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:16:31,722 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:16:31 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:16:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 8357.85it/s]
INFO:	05:16:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:16:34 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:16:34 - docling.document_converter - Going to convert document batch...
INFO:	05:16:34 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:16:34 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:16:34 - docling.document_converter - Finished converting document file in 1.19 sec.
INFO:	05:16:34 - docling_jobkit.convert.results - Processed 1 docs in 1.19 seconds.
INFO:	05:16:34 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 7c190721-d2b3-41e5-932c-4bec850b632b in 1.19 seconds
INFO:	05:16:35 - uvicorn.access - 172.17.0.1:57308 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:16:35 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:16:35 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:16:35 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:16:35 - docling_serve.app - [TENANT_ID] Task 44fb0d52-ea01-483e-9133-602fd226433c created with tenant_id='default'
INFO:	05:16:35 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 44fb0d52-ea01-483e-9133-602fd226433c
INFO:	05:16:35 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:16:35 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	05:16:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:16:35,506 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:16:35,507 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:16:35,645 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:16:35,645 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:16:35,727 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:16:35,728 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:16:35 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:16:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  82%|████████▏ | 633/770 [00:00<00:00, 6308.89it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6369.56it/s]
INFO:	05:16:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:16:37 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:16:37 - docling.document_converter - Going to convert document batch...
INFO:	05:16:37 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:16:37 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:16:37 - docling.document_converter - Finished converting document file in 0.84 sec.
INFO:	05:16:37 - docling_jobkit.convert.results - Processed 1 docs in 0.86 seconds.
INFO:	05:16:37 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 44fb0d52-ea01-483e-9133-602fd226433c in 0.86 seconds
INFO:	05:16:39 - uvicorn.access - 172.17.0.1:57308 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:16:39 - uvicorn.access - 172.17.0.1:57308 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:16:39 - uvicorn.access - 172.17.0.1:57308 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:14:40 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:14:40 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:14:40 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:14:40 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:14:40 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/metrics$,/livez$,/ready$,/readyz$,/healthz$)
INFO:	05:14:40 - uvicorn.error - Started server process [1]
INFO:	05:14:40 - uvicorn.error - Waiting for application startup.
INFO:	05:14:44 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:14:44 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:14:44 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:14:44 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:14:44 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:14:44 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	05:14:44 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:14:44 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-07-27 05:14:44.771474330 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:14:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:14:45,282 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:45,283 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:14:45,390 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:45,390 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:14:45,436 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:45,436 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:14:45 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:14:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  75%|███████▌  | 581/770 [00:00<00:00, 5807.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5896.11it/s]
INFO:	05:14:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:14:46 - uvicorn.error - Application startup complete.
INFO:	05:14:46 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:14:46 - docling_serve.app - Health check requested
INFO:	05:14:46 - uvicorn.access - 172.17.0.1:45850 - "GET /health HTTP/1.1" 200
INFO:	05:14:46 - docling_serve.app - Health check requested
INFO:	05:14:46 - uvicorn.access - 172.17.0.1:45852 - "GET /health HTTP/1.1" 200
INFO:	05:14:46 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:14:46 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:14:46 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:14:46 - docling_serve.app - [TENANT_ID] Task 8b2bf131-d0ec-4716-a26d-12b6689a9b30 created with tenant_id='default'
INFO:	05:14:46 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8b2bf131-d0ec-4716-a26d-12b6689a9b30
INFO:	05:14:46 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:14:46 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	05:14:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:14:46,472 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:46,472 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:14:46,585 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:46,585 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:14:46,662 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:46,662 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:14:46 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:14:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  77%|███████▋  | 591/770 [00:00<00:00, 5858.99it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5981.62it/s]
INFO:	05:14:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:14:48 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:14:48 - docling.document_converter - Going to convert document batch...
INFO:	05:14:48 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:14:48 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:14:48 - docling.document_converter - Finished converting document file in 0.75 sec.
WARNING:	05:14:48 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:14:48 - docling_jobkit.convert.results - Processed 1 docs in 0.79 seconds.
INFO:	05:14:48 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8b2bf131-d0ec-4716-a26d-12b6689a9b30 in 0.79 seconds
INFO:	05:14:48 - uvicorn.access - 172.17.0.1:45852 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:14:48 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:14:48 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:14:48 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:14:48 - docling_serve.app - [TENANT_ID] Task 90b8336b-f42d-46c5-b291-dac3eb6ace44 created with tenant_id='default'
INFO:	05:14:48 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 90b8336b-f42d-46c5-b291-dac3eb6ace44
INFO:	05:14:48 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:14:48 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	05:14:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:14:48,490 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:48,490 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:14:48,592 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:48,593 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:14:48,639 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:48,639 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:14:48 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:14:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  77%|███████▋  | 593/770 [00:00<00:00, 5910.01it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5996.34it/s]
INFO:	05:14:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:14:50 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:14:50 - docling.document_converter - Going to convert document batch...
INFO:	05:14:50 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:14:50 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:14:50 - docling.document_converter - Finished converting document file in 0.69 sec.
INFO:	05:14:50 - docling_jobkit.convert.results - Processed 1 docs in 0.70 seconds.
INFO:	05:14:50 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 90b8336b-f42d-46c5-b291-dac3eb6ace44 in 0.70 seconds
INFO:	05:14:52 - uvicorn.access - 172.17.0.1:45852 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:14:52 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:14:52 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:14:52 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:14:52 - docling_serve.app - [TENANT_ID] Task ff805c2c-dc60-4036-8baf-0a7051e8eb82 created with tenant_id='default'
INFO:	05:14:52 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task ff805c2c-dc60-4036-8baf-0a7051e8eb82
INFO:	05:14:52 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:14:52 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash fb1751b09de6bdbe35ede48676ca8f82
INFO:	05:14:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:14:52,506 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:52,506 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:14:52,618 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:52,619 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:14:52,666 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:52,666 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:14:52 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:14:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  93%|█████████▎| 718/770 [00:00<00:00, 7150.28it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7099.47it/s]
INFO:	05:14:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:14:53 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:14:53 - docling.document_converter - Going to convert document batch...
INFO:	05:14:53 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:14:53 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:14:53 - docling.document_converter - Finished converting document file in 0.44 sec.
INFO:	05:14:53 - docling_jobkit.convert.results - Processed 1 docs in 0.46 seconds.
INFO:	05:14:53 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job ff805c2c-dc60-4036-8baf-0a7051e8eb82 in 0.46 seconds
INFO:	05:14:54 - uvicorn.access - 172.17.0.1:45852 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:14:54 - uvicorn.access - 172.17.0.1:45852 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:14:54 - uvicorn.access - 172.17.0.1:45852 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	05:13:54 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:13:54 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	05:13:54 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	05:13:54 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	05:13:54 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/livez$,/metrics$,/healthz$,/ready$,/health$)
INFO:	05:13:54 - uvicorn.error - Started server process [1]
INFO:	05:13:54 - uvicorn.error - Waiting for application startup.
INFO:	05:13:59 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:13:59 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	05:13:59 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:13:59 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	05:13:59 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:13:59 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash bcb2e23b24bd94a42b5c00d662a7c1cf
INFO:	05:13:59 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	05:13:59 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-07-27 05:13:59.484703381 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	05:13:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:13:59,860 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:13:59,862 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:14:00,010 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:00,011 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:14:00,080 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:00,080 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:14:00 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:14:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  86%|████████▌ | 663/770 [00:00<00:00, 6625.39it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6431.82it/s]
INFO:	05:14:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:14:01 - uvicorn.error - Application startup complete.
INFO:	05:14:01 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	05:14:01 - docling_serve.app - Health check requested
INFO:	05:14:01 - uvicorn.access - 172.17.0.1:49444 - "GET /health HTTP/1.1" 200
INFO:	05:14:01 - docling_serve.app - Health check requested
INFO:	05:14:01 - uvicorn.access - 172.17.0.1:49452 - "GET /health HTTP/1.1" 200
INFO:	05:14:01 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:14:01 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:14:01 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:14:01 - docling_serve.app - [TENANT_ID] Task 7fb50f4b-5965-41da-b3cf-c630f20fbb78 created with tenant_id='default'
INFO:	05:14:01 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 7fb50f4b-5965-41da-b3cf-c630f20fbb78
INFO:	05:14:01 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:14:01 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	05:14:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:14:01,574 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:01,575 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:14:01,691 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:01,691 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:14:01,792 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:01,799 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:14:01 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:14:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  82%|████████▏ | 629/770 [00:00<00:00, 6286.63it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6173.51it/s]
INFO:	05:14:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:14:03 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:14:03 - docling.document_converter - Going to convert document batch...
INFO:	05:14:03 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:14:03 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:14:03 - docling.document_converter - Finished converting document file in 0.89 sec.
WARNING:	05:14:03 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	05:14:03 - docling_jobkit.convert.results - Processed 1 docs in 0.96 seconds.
INFO:	05:14:03 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 7fb50f4b-5965-41da-b3cf-c630f20fbb78 in 0.96 seconds
INFO:	05:14:05 - uvicorn.access - 172.17.0.1:49452 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:14:05 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:14:05 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:14:05 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:14:05 - docling_serve.app - [TENANT_ID] Task bfbe5087-37c6-4196-bf63-474fe13ff6e9 created with tenant_id='default'
INFO:	05:14:05 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task bfbe5087-37c6-4196-bf63-474fe13ff6e9
INFO:	05:14:05 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:14:05 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	05:14:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:14:05,601 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:05,601 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:14:05,722 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:05,723 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:14:05,769 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:05,769 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:14:05 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:14:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 9692.37it/s]
INFO:	05:14:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:14:07 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:14:07 - docling.document_converter - Going to convert document batch...
INFO:	05:14:07 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:14:07 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:14:07 - docling.document_converter - Finished converting document file in 0.72 sec.
INFO:	05:14:07 - docling_jobkit.convert.results - Processed 1 docs in 0.73 seconds.
INFO:	05:14:07 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job bfbe5087-37c6-4196-bf63-474fe13ff6e9 in 0.73 seconds
INFO:	05:14:09 - uvicorn.access - 172.17.0.1:49452 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:14:09 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	05:14:09 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	05:14:09 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	05:14:09 - docling_serve.app - [TENANT_ID] Task 7524822a-e738-4004-bff1-aed3ea04cea6 created with tenant_id='default'
INFO:	05:14:09 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 7524822a-e738-4004-bff1-aed3ea04cea6
INFO:	05:14:09 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	05:14:09 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 3eabf304acb4a56e9ef52b02ef69bccb
INFO:	05:14:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-07-27 05:14:09,620 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:09,621 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:14:09,759 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:09,759 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:14:09,870 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:14:09,871 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	05:14:10 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	05:14:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 9817.02it/s]
INFO:	05:14:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	05:14:11 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	05:14:11 - docling.document_converter - Going to convert document batch...
INFO:	05:14:11 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	05:14:11 - docling.pipeline.base_pipeline - Processing document file
INFO:	05:14:11 - docling.document_converter - Finished converting document file in 0.44 sec.
INFO:	05:14:11 - docling_jobkit.convert.results - Processed 1 docs in 0.47 seconds.
INFO:	05:14:11 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 7524822a-e738-4004-bff1-aed3ea04cea6 in 0.47 seconds
INFO:	05:14:11 - uvicorn.access - 172.17.0.1:49452 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	05:14:11 - uvicorn.access - 172.17.0.1:49452 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	05:14:11 - uvicorn.access - 172.17.0.1:49452 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
2026-07-27 05:12:17.787234199 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 05:12:18,071 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:12:18,072 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:12:18,175 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:12:18,176 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:12:18,220 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:12:18,220 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  76%|███████▌  | 587/770 [00:00<00:00, 5860.32it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5940.82it/s]
[INFO] 2026-07-27 05:12:20,266 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:12:20,266 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:12:20,368 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:12:20,368 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:12:20,411 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:12:20,412 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  78%|███████▊  | 598/770 [00:00<00:00, 5976.87it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6024.74it/s]
WARNING:	05:12:21 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
WARNING:	05:12:21 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
[INFO] 2026-07-27 05:12:22,287 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:12:22,288 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:12:22,389 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:12:22,389 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:12:22,433 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:12:22,433 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  76%|███████▌  | 585/770 [00:00<00:00, 5847.83it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5920.18it/s]
[INFO] 2026-07-27 05:12:24,301 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:12:24,302 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:12:24,404 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:12:24,404 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:12:24,450 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:12:24,450 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  76%|███████▌  | 587/770 [00:00<00:00, 5864.82it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5849.40it/s]

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
2026-07-27 05:11:27.353676715 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 05:11:27,750 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:11:27,753 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:11:27,889 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:11:27,889 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:11:27,958 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:11:27,959 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 8194.81it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46030 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46032 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:11:29,973 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:11:29,974 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:11:30,131 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:11:30,132 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:11:30,176 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:11:30,176 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 476/770 [00:00<00:00, 4755.89it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5201.24it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46032 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:11:31,988 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:11:31,988 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:11:32,132 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:11:32,133 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:11:32,181 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:11:32,181 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  78%|███████▊  | 600/770 [00:00<00:00, 5999.33it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6032.77it/s]
INFO:     172.17.0.1:46032 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:11:36,012 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:11:36,012 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:11:36,213 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:11:36,213 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:11:36,266 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:11:36,267 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  81%|████████  | 621/770 [00:00<00:00, 6206.19it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6751.05it/s]
INFO:     172.17.0.1:46032 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46032 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46032 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-27 05:09:44.015344776 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 05:09:44,332 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:44,334 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:09:44,487 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:44,488 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:09:44,540 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:44,540 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  78%|███████▊  | 598/770 [00:00<00:00, 5976.10it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5997.85it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:36856 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36870 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:09:46,907 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:46,907 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:09:46,997 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:46,998 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:09:47,040 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:47,041 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  76%|███████▌  | 584/770 [00:00<00:00, 5817.16it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5825.32it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36870 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:09:48,945 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:48,945 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:09:49,047 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:49,048 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:09:49,094 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:49,094 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  75%|███████▍  | 576/770 [00:00<00:00, 5745.61it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5918.77it/s]
INFO:     172.17.0.1:36870 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:09:52,961 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:52,961 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:09:53,070 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:53,070 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:09:53,116 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:53,117 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  71%|███████   | 548/770 [00:00<00:00, 5470.43it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5613.31it/s]
INFO:     172.17.0.1:36870 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36870 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36870 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-27 05:09:03.854146187 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 05:09:04,370 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:04,373 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:09:04,512 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:04,513 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:09:04,560 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:04,561 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  87%|████████▋ | 669/770 [00:00<00:00, 6657.97it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6653.70it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39900 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39908 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:09:06,544 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:06,544 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:09:06,664 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:06,664 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:09:06,710 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:06,710 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  75%|███████▌  | 578/770 [00:00<00:00, 5757.63it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6395.47it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39908 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:09:10,581 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:10,582 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:09:10,732 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:10,733 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:09:10,816 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:10,817 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  77%|███████▋  | 592/770 [00:00<00:00, 5873.54it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6127.57it/s]
INFO:     172.17.0.1:39908 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:09:14,570 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:14,570 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:09:14,658 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:14,658 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:09:14,702 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:09:14,702 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  74%|███████▍  | 568/770 [00:00<00:00, 5669.00it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6368.03it/s]
INFO:     172.17.0.1:39908 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39908 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39908 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-27 05:07:11.733402402 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 05:07:12,398 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:07:12,400 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:07:12,501 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:07:12,501 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:07:12,547 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:07:12,547 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  82%|████████▏ | 629/770 [00:00<00:00, 6263.02it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6521.67it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:34042 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34046 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:07:14,690 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:07:14,690 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:07:14,794 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:07:14,795 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:07:14,841 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:07:14,842 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  79%|███████▉  | 610/770 [00:00<00:00, 6098.83it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6601.45it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34046 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:07:16,708 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:07:16,709 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:07:16,805 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:07:16,805 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:07:16,850 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:07:16,850 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  77%|███████▋  | 596/770 [00:00<00:00, 5951.80it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5923.78it/s]
INFO:     172.17.0.1:34046 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:07:18,715 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:07:18,715 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-07-27 05:07:18,824 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:07:18,824 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-07-27 05:07:18,880 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:07:18,881 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  77%|███████▋  | 590/770 [00:00<00:00, 5896.51it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5899.89it/s]
INFO:     172.17.0.1:34046 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34046 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34046 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-27 05:06:32.891789257 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 05:06:34,269 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:06:34,272 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 05:06:34,413 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:06:34,413 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 05:06:34,485 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:06:34,486 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 9692.22it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:36874 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36888 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:06:36,100 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:06:36,100 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 05:06:36,238 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:06:36,238 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 05:06:36,340 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:06:36,340 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  76%|███████▌  | 585/770 [00:00<00:00, 5838.10it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6758.62it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36888 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:06:40,286 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:06:40,287 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 05:06:40,370 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:06:40,370 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 05:06:40,411 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:06:40,411 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  79%|███████▉  | 612/770 [00:00<00:00, 6117.89it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6317.41it/s]
INFO:     172.17.0.1:36888 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-07-27 05:06:42,320 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:06:42,320 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 05:06:42,446 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:06:42,446 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 05:06:42,512 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:06:42,512 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▊   | 529/770 [00:00<00:00, 5276.90it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5473.92it/s]
INFO:     172.17.0.1:36888 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36888 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36888 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-27 05:04:31.268528737 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 05:04:31,945 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:04:31,948 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 05:04:32,092 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:04:32,093 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 05:04:32,145 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:04:32,145 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:52744 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52756 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52756 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52756 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-27 05:03:09.214706608 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 05:03:09,928 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:03:09,930 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 05:03:10,087 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:03:10,087 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 05:03:10,131 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:03:10,131 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:48606 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48608 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48608 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48608 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48608 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48608 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48608 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-27 05:01:20.196699981 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 05:01:20,724 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:01:20,725 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 05:01:20,824 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:01:20,825 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 05:01:20,867 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:01:20,867 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:34642 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34650 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34650 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34650 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34650 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34650 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34650 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-27 05:00:18.846108002 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 05:00:19,535 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:00:19,537 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 05:00:19,689 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:00:19,689 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 05:00:19,770 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 05:00:19,770 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:53300 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53316 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53316 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53316 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53316 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53316 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53316 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-27 04:58:23.481761135 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 04:58:24,035 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:58:24,037 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 04:58:24,133 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:58:24,133 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 04:58:24,178 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:58:24,178 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59668 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59684 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59684 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59684 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59684 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59684 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59684 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-27 04:57:25.755441912 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 04:57:28,249 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:57:28,252 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 04:57:28,425 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:57:28,425 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 04:57:28,497 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:57:28,498 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:60980 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60990 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60990 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60990 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60990 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60990 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60990 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-27 04:55:16.270225936 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 04:55:16,805 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:55:16,807 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 04:55:16,904 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:55:16,904 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 04:55:16,956 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:55:16,956 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43562 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43576 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43576 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43576 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43576 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43576 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43576 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-07-27 04:54:24.068105983 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-07-27 04:54:26,306 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:54:26,309 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 04:54:26,466 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:54:26,466 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 04:54:26,537 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:54:26,538 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:36716 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36732 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36732 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36732 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36732 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36732 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36732 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-07-27 04:52:14,632 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:52:14,634 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 04:52:14,704 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:52:14,705 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 04:52:14,739 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:52:14,739 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54876 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54882 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54882 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54882 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54882 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54882 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54882 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-07-27 04:51:21,162 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:51:21,165 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 04:51:21,267 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:51:21,267 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 04:51:21,331 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:51:21,331 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35560 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35572 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35572 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35572 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35572 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35572 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35572 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-07-27 04:49:03,671 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:49:03,674 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 04:49:03,799 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:49:03,799 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 04:49:03,877 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:49:03,877 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58054 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58058 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58058 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58058 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58058 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58058 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58058 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-07-27 04:47:19,155 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:47:19,157 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 04:47:19,571 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:47:19,572 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 04:47:20,014 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:47:20,014 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:41938 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41946 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41946 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41946 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41946 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41946 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41946 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-07-27 04:45:23,263 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:45:23,265 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 04:45:23,377 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:45:23,378 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 04:45:23,449 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:45:23,449 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:45108 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45110 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45110 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45110 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45110 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45110 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45110 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-07-27 04:43:43,224 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:43:43,227 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-07-27 04:43:43,347 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:43:43,347 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-07-27 04:43:43,406 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-07-27 04:43:43,407 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:38234 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38242 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38242 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38242 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38242 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38242 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38242 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:37822 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37832 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37832 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37832 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37832 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37832 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37832 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:38490 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38504 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38504 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38504 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38504 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38504 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38504 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52894 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52902 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52902 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52902 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52902 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52902 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52902 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:46740 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46756 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46756 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46756 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:35710 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35724 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35724 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35724 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35724 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35724 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35724 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50362 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50368 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50368 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50368 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50368 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50368 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50368 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:51294 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51298 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51298 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51298 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51298 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51298 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51298 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:44888 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44904 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44904 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44904 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44904 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44904 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44904 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:58686 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58702 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58702 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58702 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58702 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58702 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58702 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:39004 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39018 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39018 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39018 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39018 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39018 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39018 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:37808 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37812 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37812 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37812 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37812 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37812 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37812 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:58062 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58068 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58068 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58068 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58068 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58068 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58068 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:35750 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35756 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35756 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35756 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35756 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:33234 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33242 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33242 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33242 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33242 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33242 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33242 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

