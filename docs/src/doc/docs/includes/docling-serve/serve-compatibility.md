# Results for ghcr.io/docling-project/docling-serve as of 2026-09-07T04:54:16.779490127Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
| v1.32.0 | ✅ SUCCESS | [Click for run details](#v1.32.0-details) |
| v1.31.0 | ✅ SUCCESS | [Click for run details](#v1.31.0-details) |
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

### ghcr.io/docling-project/docling-serve:v1.32.0

<details id="v1.32.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.32.0 is ok
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
INFO:	04:53:58 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:53:58 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:53:58 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:53:58 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:53:58 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:53:58 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:53:58 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	04:53:58 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:53:58 - docling_jobkit.connectors.plugins.defaults - Connector 'KafkaTargetProcessor' skipped — optional dependency not installed (No module named 'confluent_kafka'). Install the matching extra to enable it.
INFO:	04:53:58 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:53:58 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:53:58 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/health$,/healthz$,/metrics$,/readyz$,/livez$)
INFO:	04:53:59 - uvicorn.error - Started server process [1]
INFO:	04:53:59 - uvicorn.error - Waiting for application startup.
INFO:	04:54:00 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:54:01 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:54:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:54:01 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:54:01 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:54:01 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 019ac48c98c19d19127e62d9a66de678
INFO:	04:54:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:54:01 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:54:01 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-07 04:54:01.389204278 [W:onnxruntime:Default, device_discovery.cc:146 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:54:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:54:01,543 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:54:01,544 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:54:01,586 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:54:01,586 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:54:01,613 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:54:01,613 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:54:01 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:54:01 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:54:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 10693.41it/s]
INFO:	04:54:02 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:54:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:54:03 - uvicorn.error - Application startup complete.
INFO:	04:54:03 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:54:03 - docling_serve.app - Health check requested
INFO:	04:54:03 - uvicorn.access - 172.17.0.1:60840 - "GET /health HTTP/1.1" 200
INFO:	04:54:03 - docling_serve.app - Health check requested
INFO:	04:54:03 - uvicorn.access - 172.17.0.1:60848 - "GET /health HTTP/1.1" 200
INFO:	04:54:03 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:54:03 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:54:03 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:54:03 - docling_serve.app - [TENANT_ID] Task b61787f8-5cd0-446a-a6af-c663dac2aeb6 created with tenant_id='default'
INFO:	04:54:03 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task b61787f8-5cd0-446a-a6af-c663dac2aeb6
INFO:	04:54:03 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:54:03 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6b5aa9d49bf5933a22591c3559b94bfd
INFO:	04:54:03 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:54:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:54:03,946 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:54:03,947 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:54:03,989 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:54:03,990 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:54:04,045 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:54:04,045 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:54:04 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:54:04 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:54:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  89%|████████▊ | 683/770 [00:00<00:00, 6825.19it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6853.82it/s]
INFO:	04:54:05 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:54:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:54:06 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:54:06 - docling.document_converter - Going to convert document batch...
INFO:	04:54:06 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 6b5aa9d49bf5933a22591c3559b94bfd
INFO:	04:54:06 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:54:06 - docling.document_converter - Finished converting document file in 0.78 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:645: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:54:06 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:54:06 - docling_jobkit.convert.results - Processed 1 docs in 0.83 seconds.
INFO:	04:54:06 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job b61787f8-5cd0-446a-a6af-c663dac2aeb6 in 0.83 seconds
INFO:	04:54:07 - uvicorn.access - 172.17.0.1:60848 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:54:07 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:54:07 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:54:07 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:54:07 - docling_serve.app - [TENANT_ID] Task 5b791e24-a83d-4e2b-b5dc-27efef786444 created with tenant_id='default'
INFO:	04:54:07 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 5b791e24-a83d-4e2b-b5dc-27efef786444
INFO:	04:54:07 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:54:07 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6b5aa9d49bf5933a22591c3559b94bfd
INFO:	04:54:07 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:54:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:54:07,964 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:54:07,965 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:54:08,007 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:54:08,007 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:54:08,036 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:54:08,036 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:54:08 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:54:08 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:54:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 12135.84it/s]
INFO:	04:54:08 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:54:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:54:10 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:54:10 - docling.document_converter - Going to convert document batch...
INFO:	04:54:10 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 6b5aa9d49bf5933a22591c3559b94bfd
INFO:	04:54:10 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:54:10 - docling.document_converter - Finished converting document file in 0.83 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:645: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:54:10 - docling_jobkit.convert.results - Processed 1 docs in 0.83 seconds.
INFO:	04:54:10 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 5b791e24-a83d-4e2b-b5dc-27efef786444 in 0.83 seconds
INFO:	04:54:11 - uvicorn.access - 172.17.0.1:60848 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:54:11 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:54:11 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:54:11 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:54:11 - docling_serve.app - [TENANT_ID] Task 0e5246d6-4f2f-44ae-870b-490da493fefe created with tenant_id='default'
INFO:	04:54:11 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 0e5246d6-4f2f-44ae-870b-490da493fefe
INFO:	04:54:11 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:54:11 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 345bf8d309571831952bb6d347d0f005
INFO:	04:54:11 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:54:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:54:11,974 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:54:11,974 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:54:12,013 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:54:12,013 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:54:12,042 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:54:12,042 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:54:12 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:54:12 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:54:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 13122.59it/s]
INFO:	04:54:12 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:54:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:54:13 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:54:13 - docling.document_converter - Going to convert document batch...
INFO:	04:54:13 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 345bf8d309571831952bb6d347d0f005
INFO:	04:54:13 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:54:13 - docling.document_converter - Finished converting document file in 0.30 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:645: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:54:13 - docling_jobkit.convert.results - Processed 1 docs in 0.32 seconds.
INFO:	04:54:13 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 0e5246d6-4f2f-44ae-870b-490da493fefe in 0.32 seconds
INFO:	04:54:13 - uvicorn.access - 172.17.0.1:60848 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:54:14 - uvicorn.access - 172.17.0.1:60848 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:54:14 - uvicorn.access - 172.17.0.1:60848 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.31.0

<details id="v1.31.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.31.0 is ok
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
INFO:	04:52:05 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:52:05 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:52:05 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:52:06 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:52:06 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:52:06 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:52:06 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	04:52:06 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:52:06 - docling_jobkit.connectors.plugins.defaults - Connector 'KafkaTargetProcessor' skipped — optional dependency not installed (No module named 'confluent_kafka'). Install the matching extra to enable it.
INFO:	04:52:06 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:52:06 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:52:06 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/livez$,/metrics$,/ready$,/readyz$,/healthz$)
INFO:	04:52:06 - uvicorn.error - Started server process [1]
INFO:	04:52:06 - uvicorn.error - Waiting for application startup.
INFO:	04:52:09 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:52:09 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:52:09 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:52:09 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:52:09 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:52:09 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 9d06178a9f1c8aeb9889d1e46440f3fa
INFO:	04:52:09 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:52:09 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:52:09 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-07 04:52:09.837234168 [W:onnxruntime:Default, device_discovery.cc:146 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:52:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:52:10,041 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:52:10,042 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:52:10,110 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:52:10,110 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:52:10,180 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:52:10,182 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:52:10 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:52:10 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:52:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 20530.64it/s]
INFO:	04:52:11 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:52:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:52:11 - uvicorn.error - Application startup complete.
INFO:	04:52:11 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:52:12 - docling_serve.app - Health check requested
INFO:	04:52:12 - uvicorn.access - 172.17.0.1:53138 - "GET /health HTTP/1.1" 200
INFO:	04:52:12 - docling_serve.app - Health check requested
INFO:	04:52:12 - uvicorn.access - 172.17.0.1:53154 - "GET /health HTTP/1.1" 200
INFO:	04:52:12 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:52:12 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:52:12 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:52:12 - docling_serve.app - [TENANT_ID] Task 9c5afa42-2ce4-48db-bebf-636aaa0489b7 created with tenant_id='default'
INFO:	04:52:12 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 9c5afa42-2ce4-48db-bebf-636aaa0489b7
INFO:	04:52:12 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:52:12 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1d02772fb798c5f3e06aa82e0d32e7d
INFO:	04:52:12 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:52:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:52:12,433 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:52:12,433 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:52:12,475 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:52:12,476 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:52:12,535 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:52:12,535 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:52:12 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:52:12 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:52:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 9921.43it/s]
INFO:	04:52:13 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:52:13 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:52:14 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:52:14 - docling.document_converter - Going to convert document batch...
INFO:	04:52:14 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash a1d02772fb798c5f3e06aa82e0d32e7d
INFO:	04:52:14 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:52:14 - docling.document_converter - Finished converting document file in 0.48 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:641: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:52:14 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:52:14 - docling_jobkit.convert.results - Processed 1 docs in 0.54 seconds.
INFO:	04:52:14 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 9c5afa42-2ce4-48db-bebf-636aaa0489b7 in 0.54 seconds
INFO:	04:52:16 - uvicorn.access - 172.17.0.1:53154 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:52:16 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:52:16 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:52:16 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:52:16 - docling_serve.app - [TENANT_ID] Task d2d3d591-cc64-4db3-a27d-86b13def9de0 created with tenant_id='default'
INFO:	04:52:16 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task d2d3d591-cc64-4db3-a27d-86b13def9de0
INFO:	04:52:16 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:52:16 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1d02772fb798c5f3e06aa82e0d32e7d
INFO:	04:52:16 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:52:16 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:52:16,456 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:52:16,456 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:52:16,497 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:52:16,497 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:52:16,559 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:52:16,559 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:52:16 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:52:16 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:52:16 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 9856.12it/s]
INFO:	04:52:17 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:52:17 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:52:18 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:52:18 - docling.document_converter - Going to convert document batch...
INFO:	04:52:18 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash a1d02772fb798c5f3e06aa82e0d32e7d
INFO:	04:52:18 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:52:18 - docling.document_converter - Finished converting document file in 0.64 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:641: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:52:18 - docling_jobkit.convert.results - Processed 1 docs in 0.65 seconds.
INFO:	04:52:18 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job d2d3d591-cc64-4db3-a27d-86b13def9de0 in 0.65 seconds
INFO:	04:52:20 - uvicorn.access - 172.17.0.1:53154 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:52:20 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:52:20 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:52:20 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:52:20 - docling_serve.app - [TENANT_ID] Task f4b9895d-d3d7-47ca-9056-11b604861caa created with tenant_id='default'
INFO:	04:52:20 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task f4b9895d-d3d7-47ca-9056-11b604861caa
INFO:	04:52:20 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:52:20 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 21c1cdafbd5b48f9b0cfcb806e9e9d57
INFO:	04:52:20 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:52:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:52:20,454 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:52:20,454 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:52:20,493 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:52:20,493 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:52:20,552 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:52:20,552 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:52:20 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:52:20 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:52:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 13908.46it/s]
INFO:	04:52:21 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:52:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:52:21 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:52:22 - docling.document_converter - Going to convert document batch...
INFO:	04:52:22 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 21c1cdafbd5b48f9b0cfcb806e9e9d57
INFO:	04:52:22 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:52:22 - docling.document_converter - Finished converting document file in 0.28 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:641: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:52:22 - docling_jobkit.convert.results - Processed 1 docs in 0.31 seconds.
INFO:	04:52:22 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job f4b9895d-d3d7-47ca-9056-11b604861caa in 0.31 seconds
INFO:	04:52:22 - uvicorn.access - 172.17.0.1:53154 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:52:22 - uvicorn.access - 172.17.0.1:53154 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:52:22 - uvicorn.access - 172.17.0.1:53154 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

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
INFO:	04:50:22 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:50:22 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:50:22 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:50:23 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:50:23 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:50:23 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:50:23 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	04:50:23 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:50:23 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:50:23 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:50:23 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/metrics$,/healthz$,/livez$,/ready$,/health$)
INFO:	04:50:23 - uvicorn.error - Started server process [1]
INFO:	04:50:23 - uvicorn.error - Waiting for application startup.
INFO:	04:50:27 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:50:28 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:50:28 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:50:28 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:50:28 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:50:28 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e2db689ab35ca52a08b5b7fa25de8cc8
INFO:	04:50:28 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:50:28 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:50:28 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-07 04:50:28.890365178 [W:onnxruntime:Default, device_discovery.cc:134 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:50:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:50:29,170 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:50:29,172 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:50:29,273 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:50:29,274 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:50:29,343 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:50:29,344 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:50:29 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:50:29 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:50:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[transformers] `torch_dtype` is deprecated! Use `dtype` instead!
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 9565.83it/s]
INFO:	04:50:31 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:50:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:50:32 - uvicorn.error - Application startup complete.
INFO:	04:50:32 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:50:32 - docling_serve.app - Health check requested
INFO:	04:50:32 - uvicorn.access - 172.17.0.1:60482 - "GET /health HTTP/1.1" 200
INFO:	04:50:32 - docling_serve.app - Health check requested
INFO:	04:50:32 - uvicorn.access - 172.17.0.1:60486 - "GET /health HTTP/1.1" 200
INFO:	04:50:32 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:50:32 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:50:32 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:50:32 - docling_serve.app - [TENANT_ID] Task bf436eac-dfb8-40c2-b0d4-bc0221187e56 created with tenant_id='default'
INFO:	04:50:32 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task bf436eac-dfb8-40c2-b0d4-bc0221187e56
INFO:	04:50:32 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:50:32 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	04:50:32 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:50:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:50:32,677 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:50:32,677 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:50:32,727 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:50:32,728 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:50:32,760 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:50:32,761 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:50:32 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:50:32 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:50:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 11224.97it/s]
INFO:	04:50:33 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:50:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:50:34 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:50:34 - docling.document_converter - Going to convert document batch...
INFO:	04:50:34 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	04:50:34 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:50:34 - docling.document_converter - Finished converting document file in 0.48 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:50:34 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:50:34 - docling_jobkit.convert.results - Processed 1 docs in 0.53 seconds.
INFO:	04:50:34 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job bf436eac-dfb8-40c2-b0d4-bc0221187e56 in 0.53 seconds
INFO:	04:50:36 - uvicorn.access - 172.17.0.1:60486 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:50:36 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:50:36 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:50:36 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:50:36 - docling_serve.app - [TENANT_ID] Task 5e7ffca8-3215-4890-a6b6-5fe328032c00 created with tenant_id='default'
INFO:	04:50:36 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 5e7ffca8-3215-4890-a6b6-5fe328032c00
INFO:	04:50:36 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:50:36 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	04:50:36 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:50:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:50:36,737 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:50:36,737 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:50:36,779 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:50:36,779 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:50:36,898 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:50:36,898 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:50:37 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:50:37 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:50:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 15315.95it/s]
INFO:	04:50:38 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:50:38 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:50:39 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:50:39 - docling.document_converter - Going to convert document batch...
INFO:	04:50:39 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	04:50:39 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:50:39 - docling.document_converter - Finished converting document file in 0.36 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:50:39 - docling_jobkit.convert.results - Processed 1 docs in 0.37 seconds.
INFO:	04:50:39 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 5e7ffca8-3215-4890-a6b6-5fe328032c00 in 0.37 seconds
INFO:	04:50:40 - uvicorn.access - 172.17.0.1:60486 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:50:40 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:50:40 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:50:40 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:50:40 - docling_serve.app - [TENANT_ID] Task 98b8f9fb-2846-4eba-a282-5782cd2bd0c2 created with tenant_id='default'
INFO:	04:50:40 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 98b8f9fb-2846-4eba-a282-5782cd2bd0c2
INFO:	04:50:40 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:50:40 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 9df8df3fc03c33cf6e8bd583e67dce64
INFO:	04:50:40 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:50:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:50:40,779 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:50:40,780 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:50:40,827 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:50:40,827 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:50:40,992 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:50:40,994 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:50:41 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:50:41 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:50:41 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 15557.66it/s]
INFO:	04:50:42 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:50:42 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:50:43 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:50:43 - docling.document_converter - Going to convert document batch...
INFO:	04:50:43 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 9df8df3fc03c33cf6e8bd583e67dce64
INFO:	04:50:43 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:50:43 - docling.document_converter - Finished converting document file in 0.32 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:50:43 - docling_jobkit.convert.results - Processed 1 docs in 0.36 seconds.
INFO:	04:50:43 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 98b8f9fb-2846-4eba-a282-5782cd2bd0c2 in 0.36 seconds
INFO:	04:50:44 - uvicorn.access - 172.17.0.1:60486 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:50:45 - uvicorn.access - 172.17.0.1:60486 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:50:45 - uvicorn.access - 172.17.0.1:60486 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:48:33 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:48:33 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:48:33 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:48:34 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:48:34 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:48:34 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:48:34 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:48:34 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/metrics$,/healthz$,/health$,/livez$,/ready$)
INFO:	04:48:34 - uvicorn.error - Started server process [1]
INFO:	04:48:34 - uvicorn.error - Waiting for application startup.
INFO:	04:48:37 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:48:38 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:48:38 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:48:38 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:48:38 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:48:38 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash caff667a02b7f037838d32d34acfe0b0
INFO:	04:48:38 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:48:38 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:48:38 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-07 04:48:38.200232320 [W:onnxruntime:Default, device_discovery.cc:134 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:48:38 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:48:38,412 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:48:38,413 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:48:38,486 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:48:38,486 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:48:38,564 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:48:38,564 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:48:38 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:48:38 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 17793.62it/s]
INFO:	04:48:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:48:39 - uvicorn.error - Application startup complete.
INFO:	04:48:39 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:48:40 - docling_serve.app - Health check requested
INFO:	04:48:40 - uvicorn.access - 172.17.0.1:37782 - "GET /health HTTP/1.1" 200
INFO:	04:48:40 - docling_serve.app - Health check requested
INFO:	04:48:40 - uvicorn.access - 172.17.0.1:37798 - "GET /health HTTP/1.1" 200
INFO:	04:48:40 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:48:40 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:48:40 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:48:40 - docling_serve.app - [TENANT_ID] Task aad43b45-1792-46ef-a00b-012f69427237 created with tenant_id='default'
INFO:	04:48:40 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task aad43b45-1792-46ef-a00b-012f69427237
INFO:	04:48:40 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:48:40 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash ab12ef348c8fc273bf2be7a49773b303
INFO:	04:48:40 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:48:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:48:40,290 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:48:40,290 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:48:40,329 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:48:40,329 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:48:40,358 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:48:40,358 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:48:40 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:48:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 20060.71it/s]
INFO:	04:48:41 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:48:42 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:48:42 - docling.document_converter - Going to convert document batch...
INFO:	04:48:42 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:48:42 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:48:42 - docling.document_converter - Finished converting document file in 0.46 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:48:42 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:48:42 - docling_jobkit.convert.results - Processed 1 docs in 0.51 seconds.
INFO:	04:48:42 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job aad43b45-1792-46ef-a00b-012f69427237 in 0.51 seconds
INFO:	04:48:44 - uvicorn.access - 172.17.0.1:37798 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:48:44 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:48:44 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:48:44 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:48:44 - docling_serve.app - [TENANT_ID] Task cafbdc0a-143d-468e-a302-170307143f3b created with tenant_id='default'
INFO:	04:48:44 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task cafbdc0a-143d-468e-a302-170307143f3b
INFO:	04:48:44 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:48:44 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash ab12ef348c8fc273bf2be7a49773b303
INFO:	04:48:44 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:48:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:48:44,305 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:48:44,305 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:48:44,346 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:48:44,346 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:48:44,402 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:48:44,403 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:48:44 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:48:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 19102.80it/s]
INFO:	04:48:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:48:46 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:48:46 - docling.document_converter - Going to convert document batch...
INFO:	04:48:46 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:48:46 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:48:46 - docling.document_converter - Finished converting document file in 0.67 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:48:46 - docling_jobkit.convert.results - Processed 1 docs in 0.67 seconds.
INFO:	04:48:46 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job cafbdc0a-143d-468e-a302-170307143f3b in 0.67 seconds
INFO:	04:48:48 - uvicorn.access - 172.17.0.1:37798 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:48:48 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:48:48 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:48:48 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:48:48 - docling_serve.app - [TENANT_ID] Task a9409b95-2044-41ab-a236-fe26cedbf994 created with tenant_id='default'
INFO:	04:48:48 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task a9409b95-2044-41ab-a236-fe26cedbf994
INFO:	04:48:48 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:48:48 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash b3849eabdc7ecae5f3d54428a0162342
INFO:	04:48:48 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:48:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:48:48,320 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:48:48,320 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:48:48,361 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:48:48,361 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:48:48,391 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:48:48,391 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:48:48 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:48:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 13707.52it/s]
INFO:	04:48:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:48:50 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:48:50 - docling.document_converter - Going to convert document batch...
INFO:	04:48:50 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:48:50 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:48:50 - docling.document_converter - Finished converting document file in 0.42 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:48:50 - docling_jobkit.convert.results - Processed 1 docs in 0.45 seconds.
INFO:	04:48:50 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job a9409b95-2044-41ab-a236-fe26cedbf994 in 0.45 seconds
INFO:	04:48:50 - uvicorn.access - 172.17.0.1:37798 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:48:50 - uvicorn.access - 172.17.0.1:37798 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:48:50 - uvicorn.access - 172.17.0.1:37798 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:46:53 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:46:53 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:46:53 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:46:53 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:46:53 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:46:53 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:46:53 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/metrics$,/livez$,/healthz$,/readyz$,/health$,/ready$)
INFO:	04:46:53 - uvicorn.error - Started server process [1]
INFO:	04:46:53 - uvicorn.error - Waiting for application startup.
INFO:	04:46:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:46:56 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:46:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:46:56 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:46:56 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:46:56 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	04:46:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:46:56 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:46:56 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-07 04:46:56.457441919 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:46:56 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:46:56,648 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:46:56,649 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:46:56,696 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:46:56,696 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:46:56,761 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:46:56,764 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:46:56 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:46:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 14851.60it/s]
INFO:	04:46:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:46:58 - uvicorn.error - Application startup complete.
INFO:	04:46:58 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:46:58 - docling_serve.app - Health check requested
INFO:	04:46:58 - uvicorn.access - 172.17.0.1:49202 - "GET /health HTTP/1.1" 200
INFO:	04:46:58 - docling_serve.app - Health check requested
INFO:	04:46:58 - uvicorn.access - 172.17.0.1:49210 - "GET /health HTTP/1.1" 200
INFO:	04:46:58 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:46:58 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:46:58 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:46:58 - docling_serve.app - [TENANT_ID] Task 07fdb028-fa87-49e6-8333-e47439743f4b created with tenant_id='default'
INFO:	04:46:58 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 07fdb028-fa87-49e6-8333-e47439743f4b
INFO:	04:46:58 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:46:58 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	04:46:58 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:46:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:46:58,560 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:46:58,560 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:46:58,606 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:46:58,606 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:46:58,646 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:46:58,649 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:46:58 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:46:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 20475.33it/s]
INFO:	04:46:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:47:00 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:47:00 - docling.document_converter - Going to convert document batch...
INFO:	04:47:00 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:47:00 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:47:00 - docling.document_converter - Finished converting document file in 0.52 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:47:00 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:47:00 - docling_jobkit.convert.results - Processed 1 docs in 0.57 seconds.
INFO:	04:47:00 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 07fdb028-fa87-49e6-8333-e47439743f4b in 0.57 seconds
INFO:	04:47:02 - uvicorn.access - 172.17.0.1:49210 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:47:02 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:47:02 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:47:02 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:47:02 - docling_serve.app - [TENANT_ID] Task 883c90e1-4cf2-43a4-bc32-f95c350bb2b8 created with tenant_id='default'
INFO:	04:47:02 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 883c90e1-4cf2-43a4-bc32-f95c350bb2b8
INFO:	04:47:02 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:47:02 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	04:47:02 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:47:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:47:02,570 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:47:02,570 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:47:02,615 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:47:02,615 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:47:02,682 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:47:02,682 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:47:02 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:47:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 11739.57it/s]
INFO:	04:47:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:47:04 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:47:04 - docling.document_converter - Going to convert document batch...
INFO:	04:47:04 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:47:04 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:47:04 - docling.document_converter - Finished converting document file in 0.46 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:47:04 - docling_jobkit.convert.results - Processed 1 docs in 0.46 seconds.
INFO:	04:47:04 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 883c90e1-4cf2-43a4-bc32-f95c350bb2b8 in 0.46 seconds
INFO:	04:47:06 - uvicorn.access - 172.17.0.1:49210 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:47:06 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:47:06 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:47:06 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:47:06 - docling_serve.app - [TENANT_ID] Task 2638b9f9-dce9-4f02-af68-3ff4f6ca2b77 created with tenant_id='default'
INFO:	04:47:06 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 2638b9f9-dce9-4f02-af68-3ff4f6ca2b77
INFO:	04:47:06 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:47:06 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	04:47:06 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:47:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:47:06,603 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:47:06,604 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:47:06,643 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:47:06,643 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:47:06,709 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:47:06,709 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:47:07 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:47:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 10705.15it/s]
INFO:	04:47:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:47:08 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:47:08 - docling.document_converter - Going to convert document batch...
INFO:	04:47:08 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:47:08 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:47:08 - docling.document_converter - Finished converting document file in 0.47 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:47:08 - docling_jobkit.convert.results - Processed 1 docs in 0.51 seconds.
INFO:	04:47:08 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 2638b9f9-dce9-4f02-af68-3ff4f6ca2b77 in 0.51 seconds
INFO:	04:47:10 - uvicorn.access - 172.17.0.1:49210 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:47:10 - uvicorn.access - 172.17.0.1:49210 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:47:10 - uvicorn.access - 172.17.0.1:49210 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:44:57 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:44:57 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:44:57 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:44:57 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:44:57 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/metrics$,/ready$,/healthz$,/livez$,/readyz$)
INFO:	04:44:57 - uvicorn.error - Started server process [1]
INFO:	04:44:57 - uvicorn.error - Waiting for application startup.
INFO:	04:45:00 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:45:00 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:45:00 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:45:00 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:45:00 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:45:01 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	04:45:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:45:01 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:45:01 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-07 04:45:01.062321070 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:45:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:45:01,241 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:45:01,242 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:45:01,288 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:45:01,288 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:45:01,324 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:45:01,324 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:45:01 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:45:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 13425.96it/s]
INFO:	04:45:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:45:02 - uvicorn.error - Application startup complete.
INFO:	04:45:02 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:45:02 - docling_serve.app - Health check requested
INFO:	04:45:02 - uvicorn.access - 172.17.0.1:33464 - "GET /health HTTP/1.1" 200
INFO:	04:45:02 - docling_serve.app - Health check requested
INFO:	04:45:02 - uvicorn.access - 172.17.0.1:33470 - "GET /health HTTP/1.1" 200
INFO:	04:45:02 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:45:02 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:45:02 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:45:02 - docling_serve.app - [TENANT_ID] Task 244d4d1b-e327-4478-bdfa-a11a564d305b created with tenant_id='default'
INFO:	04:45:02 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 244d4d1b-e327-4478-bdfa-a11a564d305b
INFO:	04:45:02 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:45:02 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	04:45:02 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:45:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:45:03,007 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:45:03,007 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:45:03,052 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:45:03,052 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:45:03,086 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:45:03,086 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:45:03 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:45:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 16228.32it/s]
INFO:	04:45:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:45:04 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:45:04 - docling.document_converter - Going to convert document batch...
INFO:	04:45:04 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:45:04 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:45:04 - docling.document_converter - Finished converting document file in 0.55 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:45:04 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:45:04 - docling_jobkit.convert.results - Processed 1 docs in 0.60 seconds.
INFO:	04:45:04 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 244d4d1b-e327-4478-bdfa-a11a564d305b in 0.60 seconds
INFO:	04:45:06 - uvicorn.access - 172.17.0.1:33470 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:45:06 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:45:06 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:45:06 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:45:06 - docling_serve.app - [TENANT_ID] Task 9b04352a-2c49-4b2b-bddd-6b71081bd9c1 created with tenant_id='default'
INFO:	04:45:06 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 9b04352a-2c49-4b2b-bddd-6b71081bd9c1
INFO:	04:45:06 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:45:07 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	04:45:07 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:45:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:45:07,024 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:45:07,024 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:45:07,086 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:45:07,086 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:45:07,120 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:45:07,120 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:45:07 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:45:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  87%|████████▋ | 670/770 [00:00<00:00, 6693.26it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6748.88it/s]
INFO:	04:45:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:45:09 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:45:09 - docling.document_converter - Going to convert document batch...
INFO:	04:45:09 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:45:09 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:45:09 - docling.document_converter - Finished converting document file in 0.29 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:45:09 - docling_jobkit.convert.results - Processed 1 docs in 0.29 seconds.
INFO:	04:45:09 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 9b04352a-2c49-4b2b-bddd-6b71081bd9c1 in 0.29 seconds
INFO:	04:45:10 - uvicorn.access - 172.17.0.1:33470 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:45:10 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:45:10 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:45:10 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:45:10 - docling_serve.app - [TENANT_ID] Task a99be220-91f7-4f5c-bc26-f83e33cfb2ff created with tenant_id='default'
INFO:	04:45:10 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task a99be220-91f7-4f5c-bc26-f83e33cfb2ff
INFO:	04:45:10 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:45:11 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	04:45:11 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:45:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:45:11,038 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:45:11,038 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-07 04:45:11,077 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:45:11,077 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:45:11,144 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:45:11,145 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:45:11 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:45:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 13957.57it/s]
INFO:	04:45:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:45:12 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:45:12 - docling.document_converter - Going to convert document batch...
INFO:	04:45:12 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:45:12 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:45:12 - docling.document_converter - Finished converting document file in 0.41 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:45:12 - docling_jobkit.convert.results - Processed 1 docs in 0.43 seconds.
INFO:	04:45:12 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job a99be220-91f7-4f5c-bc26-f83e33cfb2ff in 0.43 seconds
INFO:	04:45:12 - uvicorn.access - 172.17.0.1:33470 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:45:13 - uvicorn.access - 172.17.0.1:33470 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:45:13 - uvicorn.access - 172.17.0.1:33470 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:43:17 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:43:17 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:43:17 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:43:17 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:43:17 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/healthz$,/ready$,/livez$,/readyz$,/health$,/metrics$)
INFO:	04:43:17 - uvicorn.error - Started server process [1]
INFO:	04:43:17 - uvicorn.error - Waiting for application startup.
INFO:	04:43:21 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:43:21 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:43:21 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:43:21 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:43:21 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:43:21 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c4d6547d10e26a777a530d63ca01a1a1
INFO:	04:43:21 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:43:21 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:43:21 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-07 04:43:21.650643948 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:43:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:43:21,831 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:43:21,832 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:43:21,944 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:43:21,945 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:43:21,988 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:43:21,988 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:43:22 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:43:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 40186.32it/s]
INFO:	04:43:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:43:23 - uvicorn.error - Application startup complete.
INFO:	04:43:23 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:43:23 - docling_serve.app - Health check requested
INFO:	04:43:23 - uvicorn.access - 172.17.0.1:54148 - "GET /health HTTP/1.1" 200
INFO:	04:43:23 - docling_serve.app - Health check requested
INFO:	04:43:23 - uvicorn.access - 172.17.0.1:54156 - "GET /health HTTP/1.1" 200
INFO:	04:43:23 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:43:23 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:43:23 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:43:23 - docling_serve.app - [TENANT_ID] Task 56499529-fb93-4362-8093-944a80811a82 created with tenant_id='default'
INFO:	04:43:23 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 56499529-fb93-4362-8093-944a80811a82
INFO:	04:43:23 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:43:23 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	04:43:23 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:43:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:43:24,006 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:43:24,006 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:43:24,364 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:43:24,365 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:43:24,514 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:43:24,515 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:43:24 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:43:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 12995.76it/s]
INFO:	04:43:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:43:26 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:43:26 - docling.document_converter - Going to convert document batch...
INFO:	04:43:26 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:43:26 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:43:26 - docling.document_converter - Finished converting document file in 0.71 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:43:26 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:43:26 - docling_jobkit.convert.results - Processed 1 docs in 0.78 seconds.
INFO:	04:43:26 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 56499529-fb93-4362-8093-944a80811a82 in 0.78 seconds
INFO:	04:43:27 - uvicorn.access - 172.17.0.1:54156 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:43:27 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:43:27 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:43:27 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:43:27 - docling_serve.app - [TENANT_ID] Task 01af4e64-33c4-4dc3-bf16-f5d3e37100d2 created with tenant_id='default'
INFO:	04:43:27 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 01af4e64-33c4-4dc3-bf16-f5d3e37100d2
INFO:	04:43:27 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:43:28 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	04:43:28 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:43:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:43:28,041 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:43:28,042 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:43:28,132 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:43:28,133 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:43:28,284 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:43:28,285 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:43:28 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:43:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 8635.49it/s]
INFO:	04:43:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:43:30 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:43:30 - docling.document_converter - Going to convert document batch...
INFO:	04:43:30 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:43:30 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:43:30 - docling.document_converter - Finished converting document file in 0.51 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:43:30 - docling_jobkit.convert.results - Processed 1 docs in 0.52 seconds.
INFO:	04:43:30 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 01af4e64-33c4-4dc3-bf16-f5d3e37100d2 in 0.52 seconds
INFO:	04:43:31 - uvicorn.access - 172.17.0.1:54156 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:43:31 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:43:31 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:43:31 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:43:31 - docling_serve.app - [TENANT_ID] Task b70c31f7-186e-482c-abbc-7e699b6520a9 created with tenant_id='default'
INFO:	04:43:31 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task b70c31f7-186e-482c-abbc-7e699b6520a9
INFO:	04:43:31 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:43:32 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 63e8839d1103b03d45382915dba33c89
INFO:	04:43:32 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:43:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:43:32,042 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:43:32,042 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:43:32,129 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:43:32,129 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:43:32,180 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:43:32,180 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:43:32 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:43:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  90%|████████▉ | 691/770 [00:00<00:00, 6908.00it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6842.77it/s]
INFO:	04:43:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:43:34 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:43:34 - docling.document_converter - Going to convert document batch...
INFO:	04:43:34 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:43:34 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:43:34 - docling.document_converter - Finished converting document file in 0.47 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:43:34 - docling_jobkit.convert.results - Processed 1 docs in 0.50 seconds.
INFO:	04:43:34 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job b70c31f7-186e-482c-abbc-7e699b6520a9 in 0.50 seconds
INFO:	04:43:35 - uvicorn.access - 172.17.0.1:54156 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:43:36 - uvicorn.access - 172.17.0.1:54156 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:43:36 - uvicorn.access - 172.17.0.1:54156 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:41:13 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:41:13 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:41:13 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:41:13 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:41:13 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/healthz$,/health$,/metrics$,/livez$,/ready$,/readyz$)
INFO:	04:41:13 - uvicorn.error - Started server process [1]
INFO:	04:41:13 - uvicorn.error - Waiting for application startup.
INFO:	04:41:17 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:41:17 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:41:17 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:41:17 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:41:17 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:41:17 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash f446dcc5a1a7c6aff458e30cab474a9e
INFO:	04:41:17 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:41:17 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-07 04:41:17.684976789 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:41:17 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:41:17,989 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:41:17,990 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:41:18,076 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:41:18,076 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:41:18,167 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:41:18,170 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:41:18 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:41:18 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 27618.65it/s]
INFO:	04:41:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:41:19 - uvicorn.error - Application startup complete.
INFO:	04:41:19 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:41:20 - docling_serve.app - Health check requested
INFO:	04:41:20 - uvicorn.access - 172.17.0.1:49720 - "GET /health HTTP/1.1" 200
INFO:	04:41:20 - docling_serve.app - Health check requested
INFO:	04:41:20 - uvicorn.access - 172.17.0.1:49732 - "GET /health HTTP/1.1" 200
INFO:	04:41:20 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:41:20 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:41:20 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:41:20 - docling_serve.app - [TENANT_ID] Task 4a465de6-35ce-422a-84ab-d45027e2a287 created with tenant_id='default'
INFO:	04:41:20 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 4a465de6-35ce-422a-84ab-d45027e2a287
INFO:	04:41:20 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:41:20 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	04:41:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:41:20,302 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:41:20,302 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:41:20,390 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:41:20,390 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:41:20,425 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:41:20,426 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:41:20 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:41:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 12773.30it/s]
INFO:	04:41:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:41:22 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:41:22 - docling.document_converter - Going to convert document batch...
INFO:	04:41:22 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:41:22 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:41:22 - docling.document_converter - Finished converting document file in 0.47 sec.
WARNING:	04:41:22 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:41:22 - docling_jobkit.convert.results - Processed 1 docs in 0.52 seconds.
INFO:	04:41:22 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 4a465de6-35ce-422a-84ab-d45027e2a287 in 0.52 seconds
INFO:	04:41:24 - uvicorn.access - 172.17.0.1:49732 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:41:24 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:41:24 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:41:24 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:41:24 - docling_serve.app - [TENANT_ID] Task 7d7470ef-bf6e-44de-b77c-ee19d45abd3e created with tenant_id='default'
INFO:	04:41:24 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 7d7470ef-bf6e-44de-b77c-ee19d45abd3e
INFO:	04:41:24 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:41:24 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	04:41:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:41:24,350 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:41:24,350 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:41:24,503 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:41:24,504 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:41:24,577 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:41:24,578 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:41:24 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:41:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  85%|████████▌ | 657/770 [00:00<00:00, 6568.53it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6390.52it/s]
INFO:	04:41:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:41:26 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:41:27 - docling.document_converter - Going to convert document batch...
INFO:	04:41:27 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:41:27 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:41:27 - docling.document_converter - Finished converting document file in 0.50 sec.
INFO:	04:41:27 - docling_jobkit.convert.results - Processed 1 docs in 0.51 seconds.
INFO:	04:41:27 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 7d7470ef-bf6e-44de-b77c-ee19d45abd3e in 0.51 seconds
INFO:	04:41:28 - uvicorn.access - 172.17.0.1:49732 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:41:28 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:41:28 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:41:28 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:41:28 - docling_serve.app - [TENANT_ID] Task d581b16f-1e40-4c52-a491-ae45b607c301 created with tenant_id='default'
INFO:	04:41:28 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task d581b16f-1e40-4c52-a491-ae45b607c301
INFO:	04:41:28 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:41:28 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e50b6140ec7ee9be0d0fea6ba20c9795
INFO:	04:41:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:41:28,366 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:41:28,367 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:41:28,458 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:41:28,459 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:41:28,589 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:41:28,590 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:41:29 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:41:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 22267.67it/s]
INFO:	04:41:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:41:30 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:41:30 - docling.document_converter - Going to convert document batch...
INFO:	04:41:30 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:41:30 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:41:30 - docling.document_converter - Finished converting document file in 0.46 sec.
INFO:	04:41:31 - docling_jobkit.convert.results - Processed 1 docs in 0.50 seconds.
INFO:	04:41:31 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job d581b16f-1e40-4c52-a491-ae45b607c301 in 0.50 seconds
INFO:	04:41:32 - uvicorn.access - 172.17.0.1:49732 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:41:32 - uvicorn.access - 172.17.0.1:49732 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:41:32 - uvicorn.access - 172.17.0.1:49732 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:39:20 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:39:20 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:39:20 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:39:20 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:39:20 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/metrics$,/readyz$,/health$,/livez$,/healthz$,/ready$)
INFO:	04:39:20 - uvicorn.error - Started server process [1]
INFO:	04:39:20 - uvicorn.error - Waiting for application startup.
INFO:	04:39:23 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:39:23 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:39:23 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:39:23 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:39:23 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:39:23 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	04:39:23 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:39:23 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-07 04:39:23.901316583 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:39:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:39:24,147 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:39:24,148 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:39:24,227 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:39:24,227 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:39:24,291 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:39:24,291 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:39:24 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:39:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 15113.55it/s]
INFO:	04:39:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:39:25 - uvicorn.error - Application startup complete.
INFO:	04:39:25 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:39:26 - docling_serve.app - Health check requested
INFO:	04:39:26 - uvicorn.access - 172.17.0.1:42008 - "GET /health HTTP/1.1" 200
INFO:	04:39:26 - docling_serve.app - Health check requested
INFO:	04:39:26 - uvicorn.access - 172.17.0.1:42010 - "GET /health HTTP/1.1" 200
INFO:	04:39:26 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:39:26 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:39:26 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:39:26 - docling_serve.app - [TENANT_ID] Task 232e9899-b153-4d8e-8721-7fefc4731dc4 created with tenant_id='default'
INFO:	04:39:26 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 232e9899-b153-4d8e-8721-7fefc4731dc4
INFO:	04:39:26 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:39:26 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:39:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:39:26,110 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:39:26,110 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:39:26,194 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:39:26,194 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:39:26,270 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:39:26,271 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:39:26 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:39:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 12118.54it/s]
INFO:	04:39:27 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:39:28 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:39:28 - docling.document_converter - Going to convert document batch...
INFO:	04:39:28 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:39:28 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:39:28 - docling.document_converter - Finished converting document file in 0.85 sec.
WARNING:	04:39:28 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:39:28 - docling_jobkit.convert.results - Processed 1 docs in 0.92 seconds.
INFO:	04:39:28 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 232e9899-b153-4d8e-8721-7fefc4731dc4 in 0.92 seconds
INFO:	04:39:30 - uvicorn.access - 172.17.0.1:42010 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:39:30 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:39:30 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:39:30 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:39:30 - docling_serve.app - [TENANT_ID] Task b859cfd4-4ac9-4ef6-b8b9-c35dae6f4d3b created with tenant_id='default'
INFO:	04:39:30 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task b859cfd4-4ac9-4ef6-b8b9-c35dae6f4d3b
INFO:	04:39:30 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:39:30 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:39:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:39:30,428 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:39:30,428 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:39:30,511 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:39:30,512 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:39:30,599 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:39:30,599 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:39:31 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:39:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 477/770 [00:00<00:00, 4676.69it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6715.42it/s]
INFO:	04:39:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:39:33 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:39:33 - docling.document_converter - Going to convert document batch...
INFO:	04:39:33 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:39:33 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:39:33 - docling.document_converter - Finished converting document file in 0.99 sec.
INFO:	04:39:33 - docling_jobkit.convert.results - Processed 1 docs in 1.00 seconds.
INFO:	04:39:33 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job b859cfd4-4ac9-4ef6-b8b9-c35dae6f4d3b in 1.00 seconds
INFO:	04:39:34 - uvicorn.access - 172.17.0.1:42010 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:39:34 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:39:34 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:39:34 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:39:34 - docling_serve.app - [TENANT_ID] Task 7caf3535-deeb-443e-a828-4f30a4e13051 created with tenant_id='default'
INFO:	04:39:34 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 7caf3535-deeb-443e-a828-4f30a4e13051
INFO:	04:39:34 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:39:34 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	04:39:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:39:34,147 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:39:34,147 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:39:34,231 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:39:34,231 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:39:34,331 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:39:34,337 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:39:34 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:39:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 22635.21it/s]
INFO:	04:39:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:39:36 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:39:36 - docling.document_converter - Going to convert document batch...
INFO:	04:39:36 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:39:36 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:39:36 - docling.document_converter - Finished converting document file in 0.46 sec.
INFO:	04:39:36 - docling_jobkit.convert.results - Processed 1 docs in 0.49 seconds.
INFO:	04:39:36 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 7caf3535-deeb-443e-a828-4f30a4e13051 in 0.49 seconds
INFO:	04:39:38 - uvicorn.access - 172.17.0.1:42010 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:39:38 - uvicorn.access - 172.17.0.1:42010 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:39:38 - uvicorn.access - 172.17.0.1:42010 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:37:25 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:37:25 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:37:25 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:37:25 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:37:25 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/healthz$,/ready$,/metrics$,/readyz$,/health$)
INFO:	04:37:26 - uvicorn.error - Started server process [1]
INFO:	04:37:26 - uvicorn.error - Waiting for application startup.
INFO:	04:37:29 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:37:29 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:37:29 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:37:29 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:37:29 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:37:29 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	04:37:29 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:37:29 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-07 04:37:29.590524609 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:37:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:37:29,819 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:37:29,820 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:37:29,909 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:37:29,909 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:37:29,942 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:37:29,943 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:37:30 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:37:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 12238.53it/s]
INFO:	04:37:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:37:31 - uvicorn.error - Application startup complete.
INFO:	04:37:31 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:37:32 - docling_serve.app - Health check requested
INFO:	04:37:32 - uvicorn.access - 172.17.0.1:51460 - "GET /health HTTP/1.1" 200
INFO:	04:37:32 - docling_serve.app - Health check requested
INFO:	04:37:32 - uvicorn.access - 172.17.0.1:51470 - "GET /health HTTP/1.1" 200
INFO:	04:37:32 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:37:32 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:37:32 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:37:32 - docling_serve.app - [TENANT_ID] Task 8d6f1a7d-092d-4199-9a14-e93c3f16f58b created with tenant_id='default'
INFO:	04:37:32 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8d6f1a7d-092d-4199-9a14-e93c3f16f58b
INFO:	04:37:32 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:37:32 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:37:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:37:32,120 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:37:32,120 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:37:32,203 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:37:32,203 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:37:32,236 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:37:32,236 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:37:32 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:37:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 19123.16it/s]
INFO:	04:37:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:37:34 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:37:34 - docling.document_converter - Going to convert document batch...
INFO:	04:37:34 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:37:34 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:37:34 - docling.document_converter - Finished converting document file in 0.58 sec.
WARNING:	04:37:34 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:37:34 - docling_jobkit.convert.results - Processed 1 docs in 0.63 seconds.
INFO:	04:37:34 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8d6f1a7d-092d-4199-9a14-e93c3f16f58b in 0.63 seconds
INFO:	04:37:36 - uvicorn.access - 172.17.0.1:51470 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:37:36 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:37:36 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:37:36 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:37:36 - docling_serve.app - [TENANT_ID] Task 9d3946b3-d496-4da9-a312-9e56f70db8f1 created with tenant_id='default'
INFO:	04:37:36 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 9d3946b3-d496-4da9-a312-9e56f70db8f1
INFO:	04:37:36 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:37:36 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:37:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:37:36,407 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:37:36,407 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:37:36,491 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:37:36,491 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:37:36,556 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:37:36,556 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:37:36 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:37:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 13742.80it/s]
INFO:	04:37:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:37:38 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:37:38 - docling.document_converter - Going to convert document batch...
INFO:	04:37:38 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:37:38 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:37:38 - docling.document_converter - Finished converting document file in 0.46 sec.
INFO:	04:37:38 - docling_jobkit.convert.results - Processed 1 docs in 0.46 seconds.
INFO:	04:37:38 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 9d3946b3-d496-4da9-a312-9e56f70db8f1 in 0.46 seconds
INFO:	04:37:40 - uvicorn.access - 172.17.0.1:51470 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:37:40 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:37:40 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:37:40 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:37:40 - docling_serve.app - [TENANT_ID] Task dc62971e-ce4e-45cf-ad3a-d61ee0f53117 created with tenant_id='default'
INFO:	04:37:40 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task dc62971e-ce4e-45cf-ad3a-d61ee0f53117
INFO:	04:37:40 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:37:40 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	04:37:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:37:40,161 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:37:40,161 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:37:40,240 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:37:40,241 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:37:40,308 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:37:40,308 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:37:40 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:37:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 19856.22it/s]
INFO:	04:37:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:37:41 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:37:41 - docling.document_converter - Going to convert document batch...
INFO:	04:37:41 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:37:41 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:37:41 - docling.document_converter - Finished converting document file in 0.43 sec.
INFO:	04:37:42 - docling_jobkit.convert.results - Processed 1 docs in 0.47 seconds.
INFO:	04:37:42 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job dc62971e-ce4e-45cf-ad3a-d61ee0f53117 in 0.47 seconds
INFO:	04:37:42 - uvicorn.access - 172.17.0.1:51470 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:37:42 - uvicorn.access - 172.17.0.1:51470 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:37:42 - uvicorn.access - 172.17.0.1:51470 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:35:55 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:35:55 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:35:55 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:35:55 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:35:55 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/metrics$,/readyz$,/ready$,/health$,/livez$,/healthz$)
INFO:	04:35:56 - uvicorn.error - Started server process [1]
INFO:	04:35:56 - uvicorn.error - Waiting for application startup.
INFO:	04:35:59 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:35:59 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:35:59 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:35:59 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:35:59 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:35:59 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	04:35:59 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:35:59 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-07 04:35:59.140707464 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:35:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:35:59,435 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:35:59,436 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:35:59,524 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:35:59,525 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:35:59,588 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:35:59,590 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:35:59 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:35:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 26513.10it/s]
INFO:	04:36:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:36:01 - uvicorn.error - Application startup complete.
INFO:	04:36:01 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:36:01 - docling_serve.app - Health check requested
INFO:	04:36:01 - uvicorn.access - 172.17.0.1:49556 - "GET /health HTTP/1.1" 200
INFO:	04:36:01 - docling_serve.app - Health check requested
INFO:	04:36:01 - uvicorn.access - 172.17.0.1:49564 - "GET /health HTTP/1.1" 200
INFO:	04:36:01 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:36:01 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:36:01 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:36:01 - docling_serve.app - [TENANT_ID] Task a81ce515-cecf-4480-93d2-9846945bc9ff created with tenant_id='default'
INFO:	04:36:01 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task a81ce515-cecf-4480-93d2-9846945bc9ff
INFO:	04:36:01 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:36:01 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	04:36:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:36:01,436 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:36:01,437 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:36:01,516 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:36:01,516 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:36:01,583 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:36:01,583 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:36:01 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:36:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 20646.27it/s]
INFO:	04:36:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:36:03 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:36:03 - docling.document_converter - Going to convert document batch...
INFO:	04:36:03 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:36:03 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:36:03 - docling.document_converter - Finished converting document file in 0.47 sec.
WARNING:	04:36:03 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:36:03 - docling_jobkit.convert.results - Processed 1 docs in 0.53 seconds.
INFO:	04:36:03 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job a81ce515-cecf-4480-93d2-9846945bc9ff in 0.53 seconds
INFO:	04:36:05 - uvicorn.access - 172.17.0.1:49564 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:36:05 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:36:05 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:36:05 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:36:05 - docling_serve.app - [TENANT_ID] Task e92e0006-b826-4b8c-a729-db1ba37a21d2 created with tenant_id='default'
INFO:	04:36:05 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task e92e0006-b826-4b8c-a729-db1ba37a21d2
INFO:	04:36:05 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:36:05 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	04:36:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:36:05,725 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:36:05,725 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:36:05,806 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:36:05,807 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:36:05,845 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:36:05,845 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:36:06 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:36:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 11519.32it/s]
INFO:	04:36:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:36:07 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:36:07 - docling.document_converter - Going to convert document batch...
INFO:	04:36:07 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:36:07 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:36:07 - docling.document_converter - Finished converting document file in 0.43 sec.
INFO:	04:36:07 - docling_jobkit.convert.results - Processed 1 docs in 0.44 seconds.
INFO:	04:36:07 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job e92e0006-b826-4b8c-a729-db1ba37a21d2 in 0.44 seconds
INFO:	04:36:09 - uvicorn.access - 172.17.0.1:49564 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:36:09 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:36:09 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:36:09 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:36:09 - docling_serve.app - [TENANT_ID] Task 1135d379-7264-4dc5-9f94-35763ee7a8e8 created with tenant_id='default'
INFO:	04:36:09 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 1135d379-7264-4dc5-9f94-35763ee7a8e8
INFO:	04:36:09 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:36:09 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash fb1751b09de6bdbe35ede48676ca8f82
INFO:	04:36:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:36:09,472 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:36:09,472 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:36:09,573 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:36:09,574 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:36:09,607 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:36:09,607 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:36:09 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:36:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 12389.14it/s]
INFO:	04:36:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:36:11 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:36:11 - docling.document_converter - Going to convert document batch...
INFO:	04:36:11 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:36:11 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:36:11 - docling.document_converter - Finished converting document file in 0.44 sec.
INFO:	04:36:11 - docling_jobkit.convert.results - Processed 1 docs in 0.47 seconds.
INFO:	04:36:11 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 1135d379-7264-4dc5-9f94-35763ee7a8e8 in 0.47 seconds
INFO:	04:36:11 - uvicorn.access - 172.17.0.1:49564 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:36:11 - uvicorn.access - 172.17.0.1:49564 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:36:11 - uvicorn.access - 172.17.0.1:49564 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:34:26 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:34:26 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:34:26 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:34:26 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:34:26 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/health$,/readyz$,/healthz$,/ready$,/metrics$)
INFO:	04:34:26 - uvicorn.error - Started server process [1]
INFO:	04:34:26 - uvicorn.error - Waiting for application startup.
INFO:	04:34:29 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:34:29 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:34:29 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:34:29 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:34:29 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:34:29 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash bcb2e23b24bd94a42b5c00d662a7c1cf
INFO:	04:34:29 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:34:29 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-07 04:34:29.974207177 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:34:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:34:30,347 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:34:30,348 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:34:30,426 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:34:30,426 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:34:30,499 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:34:30,502 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:34:30 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:34:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 17633.42it/s]
INFO:	04:34:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:34:31 - uvicorn.error - Application startup complete.
INFO:	04:34:31 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:34:32 - docling_serve.app - Health check requested
INFO:	04:34:32 - uvicorn.access - 172.17.0.1:44318 - "GET /health HTTP/1.1" 200
INFO:	04:34:32 - docling_serve.app - Health check requested
INFO:	04:34:32 - uvicorn.access - 172.17.0.1:44320 - "GET /health HTTP/1.1" 200
INFO:	04:34:32 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:34:32 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:34:32 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:34:32 - docling_serve.app - [TENANT_ID] Task 16219c87-99ea-456d-84b8-3d0dc806003c created with tenant_id='default'
INFO:	04:34:32 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 16219c87-99ea-456d-84b8-3d0dc806003c
INFO:	04:34:32 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:34:32 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	04:34:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:34:32,372 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:34:32,372 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:34:32,477 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:34:32,478 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:34:32,511 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:34:32,511 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:34:32 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:34:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 13052.32it/s]
INFO:	04:34:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:34:34 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:34:34 - docling.document_converter - Going to convert document batch...
INFO:	04:34:34 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:34:34 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:34:34 - docling.document_converter - Finished converting document file in 0.48 sec.
WARNING:	04:34:34 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:34:34 - docling_jobkit.convert.results - Processed 1 docs in 0.54 seconds.
INFO:	04:34:34 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 16219c87-99ea-456d-84b8-3d0dc806003c in 0.54 seconds
INFO:	04:34:36 - uvicorn.access - 172.17.0.1:44320 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:34:36 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:34:36 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:34:36 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:34:36 - docling_serve.app - [TENANT_ID] Task 71628b08-aa62-44f6-9212-d00b0e9f2035 created with tenant_id='default'
INFO:	04:34:36 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 71628b08-aa62-44f6-9212-d00b0e9f2035
INFO:	04:34:36 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:34:36 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	04:34:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:34:36,403 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:34:36,403 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:34:36,491 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:34:36,492 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:34:36,526 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:34:36,526 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:34:36 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:34:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 51107.96it/s]
INFO:	04:34:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:34:38 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:34:38 - docling.document_converter - Going to convert document batch...
INFO:	04:34:38 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:34:38 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:34:38 - docling.document_converter - Finished converting document file in 0.64 sec.
INFO:	04:34:38 - docling_jobkit.convert.results - Processed 1 docs in 0.64 seconds.
INFO:	04:34:38 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 71628b08-aa62-44f6-9212-d00b0e9f2035 in 0.64 seconds
INFO:	04:34:40 - uvicorn.access - 172.17.0.1:44320 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:34:40 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:34:40 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:34:40 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:34:40 - docling_serve.app - [TENANT_ID] Task 2abd54fb-a4e2-484a-9f2e-604f71c2ac40 created with tenant_id='default'
INFO:	04:34:40 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 2abd54fb-a4e2-484a-9f2e-604f71c2ac40
INFO:	04:34:40 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:34:40 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 3eabf304acb4a56e9ef52b02ef69bccb
INFO:	04:34:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-07 04:34:40,405 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:34:40,405 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:34:40,484 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:34:40,484 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:34:40,571 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:34:40,573 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:34:40 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:34:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 13508.23it/s]
INFO:	04:34:41 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:34:42 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:34:42 - docling.document_converter - Going to convert document batch...
INFO:	04:34:42 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:34:42 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:34:42 - docling.document_converter - Finished converting document file in 0.65 sec.
INFO:	04:34:42 - docling_jobkit.convert.results - Processed 1 docs in 0.68 seconds.
INFO:	04:34:42 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 2abd54fb-a4e2-484a-9f2e-604f71c2ac40 in 0.68 seconds
INFO:	04:34:44 - uvicorn.access - 172.17.0.1:44320 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:34:44 - uvicorn.access - 172.17.0.1:44320 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:34:44 - uvicorn.access - 172.17.0.1:44320 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
2026-09-07 04:32:31.944369530 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:32:32,191 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:32:32,192 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:32:32,310 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:32:32,311 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:32:32,344 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:32:32,344 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 18001.71it/s]
[INFO] 2026-09-07 04:32:34,239 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:32:34,239 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:32:34,321 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:32:34,321 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:32:34,390 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:32:34,390 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 12964.92it/s]
WARNING:	04:32:36 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
WARNING:	04:32:36 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
[INFO] 2026-09-07 04:32:38,255 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:32:38,256 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:32:38,337 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:32:38,337 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:32:38,402 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:32:38,405 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7907.04it/s]
[INFO] 2026-09-07 04:32:42,272 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:32:42,272 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:32:42,349 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:32:42,349 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:32:42,387 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:32:42,387 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 11510.12it/s]

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
2026-09-07 04:30:54.434647963 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:30:54,676 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:30:54,677 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:30:54,759 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:30:54,759 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:30:54,825 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:30:54,825 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 19338.43it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39426 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39432 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:30:56,660 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:30:56,661 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:30:56,746 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:30:56,746 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:30:56,811 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:30:56,812 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 19136.19it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39432 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:31:00,680 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:31:00,680 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:31:00,765 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:31:00,766 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:31:00,830 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:31:00,830 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  94%|█████████▍| 725/770 [00:00<00:00, 7247.52it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7280.78it/s]
INFO:     172.17.0.1:39432 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:31:04,691 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:31:04,692 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:31:04,769 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:31:04,769 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:31:04,837 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:31:04,838 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 20947.72it/s]
INFO:     172.17.0.1:39432 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39432 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39432 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-07 04:29:18.434860033 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:29:18,727 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:29:18,728 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:29:18,851 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:29:18,851 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:29:18,921 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:29:18,921 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 18862.14it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56894 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56906 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:29:20,661 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:29:20,662 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:29:20,742 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:29:20,742 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:29:20,821 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:29:20,822 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 17025.66it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56906 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:29:24,682 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:29:24,682 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:29:24,763 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:29:24,763 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:29:24,829 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:29:24,829 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 8778.03it/s]
INFO:     172.17.0.1:56906 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:29:28,698 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:29:28,698 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:29:28,781 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:29:28,781 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:29:28,880 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:29:28,881 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 9124.31it/s]
INFO:     172.17.0.1:56906 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56906 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56906 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-07 04:27:41.459081793 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:27:41,710 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:27:41,711 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:27:41,793 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:27:41,794 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:27:41,855 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:27:41,858 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 32897.17it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:41312 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41320 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:27:44,225 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:27:44,226 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:27:44,305 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:27:44,306 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:27:44,338 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:27:44,338 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 14818.14it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41320 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:27:48,250 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:27:48,250 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:27:48,331 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:27:48,331 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:27:48,419 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:27:48,422 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 12323.06it/s]
INFO:     172.17.0.1:41320 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:27:52,264 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:27:52,264 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:27:52,356 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:27:52,356 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:27:52,405 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:27:52,408 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 39455.31it/s]
INFO:     172.17.0.1:41320 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41320 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41320 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-07 04:25:58.878789264 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:25:59,316 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:25:59,317 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:25:59,393 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:25:59,393 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:25:59,457 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:25:59,457 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 21354.66it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43852 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43854 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:26:01,497 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:26:01,497 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:26:01,586 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:26:01,586 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:26:01,658 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:26:01,659 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 12278.55it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43854 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:26:05,520 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:26:05,520 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:26:05,604 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:26:05,605 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:26:05,673 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:26:05,676 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 13479.98it/s]
INFO:     172.17.0.1:43854 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:26:09,696 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:26:09,697 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-07 04:26:09,774 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:26:09,774 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-07 04:26:09,841 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:26:09,841 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 13101.56it/s]
INFO:     172.17.0.1:43854 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43854 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43854 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-07 04:24:21.898417856 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:24:23,250 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:24:23,251 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:24:23,329 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:24:23,329 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:24:23,392 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:24:23,392 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 13347.88it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:42882 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42896 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:24:26,299 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:24:26,299 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:24:26,791 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:24:26,791 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:24:26,852 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:24:26,853 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 26079.14it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42896 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:24:30,314 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:24:30,315 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:24:30,402 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:24:30,402 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:24:30,522 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:24:30,522 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 19485.79it/s]
INFO:     172.17.0.1:42896 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-07 04:24:36,314 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:24:36,314 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:24:36,495 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:24:36,495 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:24:36,572 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:24:36,573 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7792.36it/s]
INFO:     172.17.0.1:42896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42896 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42896 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-07 04:21:57.119040766 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:21:57,515 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:21:57,516 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:21:57,595 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:21:57,595 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:21:57,686 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:21:57,686 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56494 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56506 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56506 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56506 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56506 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56506 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56506 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-07 04:19:27.185580135 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:19:27,635 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:19:27,637 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:19:27,704 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:19:27,705 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:19:27,732 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:19:27,732 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46998 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47002 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47002 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47002 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47002 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47002 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47002 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-07 04:16:56.052915273 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:16:56,550 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:16:56,552 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:16:56,633 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:16:56,633 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:16:56,676 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:16:56,676 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:36010 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36012 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36012 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36012 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36012 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36012 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36012 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-07 04:14:25.512271490 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:14:25,992 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:14:25,993 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:14:26,071 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:14:26,071 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:14:26,102 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:14:26,103 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:40644 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40656 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40656 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40656 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40656 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40656 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40656 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-07 04:12:23.190948296 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:12:23,756 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:12:23,758 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:12:23,851 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:12:23,851 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:12:23,882 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:12:23,882 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:34608 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34620 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34620 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34620 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34620 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34620 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34620 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-07 04:09:51.593331024 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:09:52,101 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:09:52,103 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:09:52,179 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:09:52,179 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:09:52,211 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:09:52,211 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:41626 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41642 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41642 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41642 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41642 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41642 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41642 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-07 04:07:36.903370088 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:07:37,356 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:07:37,357 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:07:37,436 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:07:37,436 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:07:37,468 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:07:37,468 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:36822 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36828 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36828 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36828 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36828 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36828 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36828 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-07 04:05:32.254252920 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-07 04:05:32,681 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:05:32,683 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:05:32,763 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:05:32,763 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:05:32,793 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:05:32,794 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39438 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39448 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39448 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39448 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39448 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39448 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39448 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-07 04:03:21,356 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:03:21,357 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:03:21,405 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:03:21,405 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:03:21,427 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:03:21,427 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43022 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43024 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43024 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43024 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43024 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43024 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43024 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-07 04:00:51,269 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:00:51,270 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 04:00:51,328 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:00:51,328 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 04:00:51,356 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 04:00:51,356 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:44000 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44010 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44010 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44010 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44010 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44010 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44010 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-07 03:58:18,602 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 03:58:18,603 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 03:58:18,659 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 03:58:18,660 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 03:58:18,687 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 03:58:18,687 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:33590 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33600 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33600 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33600 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33600 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33600 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33600 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-07 03:55:36,134 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 03:55:36,135 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 03:55:36,188 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 03:55:36,188 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 03:55:36,214 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 03:55:36,214 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39056 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39062 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39062 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39062 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39062 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39062 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39062 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-07 03:52:44,334 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 03:52:44,335 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 03:52:44,386 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 03:52:44,386 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 03:52:44,408 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 03:52:44,408 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:40502 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40508 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40508 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40508 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40508 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40508 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40508 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-07 03:50:01,053 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 03:50:01,055 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-07 03:50:01,175 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 03:50:01,175 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-07 03:50:01,220 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-07 03:50:01,220 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55960 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55968 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55968 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55968 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55968 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55968 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55968 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50316 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50322 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50322 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50322 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50322 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50322 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50322 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:51992 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51998 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51998 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51998 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51998 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51998 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51998 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:55122 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55132 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55132 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55132 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55132 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55132 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55132 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:34006 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34020 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34020 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34020 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34020 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34020 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34020 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:53672 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53686 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53686 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53686 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53686 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53686 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53686 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:39766 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39768 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39768 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39768 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39768 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39768 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39768 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:60682 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60690 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60690 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60690 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60690 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60690 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60690 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:43028 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43034 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43034 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43034 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52004 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52010 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52010 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52010 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52010 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52010 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52010 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:57550 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57564 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57564 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57564 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57564 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57564 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57564 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:51024 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51026 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51026 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51026 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51026 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51026 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51026 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:40940 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40950 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40950 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40950 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40950 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40950 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40950 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:44548 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44554 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44554 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44554 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44554 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44554 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44554 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:47558 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47570 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47570 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47570 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47570 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47570 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47570 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

