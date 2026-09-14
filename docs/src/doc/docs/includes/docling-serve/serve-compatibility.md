# Results for ghcr.io/docling-project/docling-serve as of 2026-09-14T04:33:14.810717710Z

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
INFO:	04:32:58 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:32:58 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:32:58 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:32:58 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:32:58 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:32:58 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:32:58 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	04:32:58 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:32:58 - docling_jobkit.connectors.plugins.defaults - Connector 'KafkaTargetProcessor' skipped — optional dependency not installed (No module named 'confluent_kafka'). Install the matching extra to enable it.
INFO:	04:32:58 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:32:58 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:32:58 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/healthz$,/health$,/metrics$,/ready$,/livez$,/readyz$)
INFO:	04:32:58 - uvicorn.error - Started server process [1]
INFO:	04:32:58 - uvicorn.error - Waiting for application startup.
INFO:	04:33:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:33:01 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:33:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:33:01 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:33:01 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:33:02 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 019ac48c98c19d19127e62d9a66de678
INFO:	04:33:02 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:33:02 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:33:02 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-14 04:33:02.112915208 [W:onnxruntime:Default, device_discovery.cc:146 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:33:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:33:02,348 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:33:02,349 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:33:02,406 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:33:02,406 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:33:02,447 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:33:02,447 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:33:02 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:33:02 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:33:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 477/770 [00:00<00:00, 4735.27it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4779.73it/s]
INFO:	04:33:03 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:33:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:33:03 - uvicorn.error - Application startup complete.
INFO:	04:33:03 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:33:03 - docling_serve.app - Health check requested
INFO:	04:33:03 - uvicorn.access - 172.17.0.1:45404 - "GET /health HTTP/1.1" 200
INFO:	04:33:03 - docling_serve.app - Health check requested
INFO:	04:33:03 - uvicorn.access - 172.17.0.1:45410 - "GET /health HTTP/1.1" 200
INFO:	04:33:03 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:33:03 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:33:03 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:33:03 - docling_serve.app - [TENANT_ID] Task 84f19ffb-d975-4c7d-8ec5-5ba36ec7e459 created with tenant_id='default'
INFO:	04:33:03 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 84f19ffb-d975-4c7d-8ec5-5ba36ec7e459
INFO:	04:33:03 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:33:03 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6b5aa9d49bf5933a22591c3559b94bfd
INFO:	04:33:03 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:33:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:33:03,888 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:33:03,889 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:33:03,942 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:33:03,942 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:33:04,002 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:33:04,002 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:33:04 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:33:04 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:33:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 466/770 [00:00<00:00, 4654.87it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4717.78it/s]
INFO:	04:33:04 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:33:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:33:05 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:33:05 - docling.document_converter - Going to convert document batch...
INFO:	04:33:05 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 6b5aa9d49bf5933a22591c3559b94bfd
INFO:	04:33:05 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:33:05 - docling.document_converter - Finished converting document file in 0.55 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:645: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:33:05 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:33:05 - docling_jobkit.convert.results - Processed 1 docs in 0.62 seconds.
INFO:	04:33:05 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 84f19ffb-d975-4c7d-8ec5-5ba36ec7e459 in 0.62 seconds
INFO:	04:33:05 - uvicorn.access - 172.17.0.1:45410 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:33:05 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:33:05 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:33:05 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:33:05 - docling_serve.app - [TENANT_ID] Task 89bf4717-a321-4ab4-bc4f-ed6354efab13 created with tenant_id='default'
INFO:	04:33:05 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 89bf4717-a321-4ab4-bc4f-ed6354efab13
INFO:	04:33:05 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:33:05 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6b5aa9d49bf5933a22591c3559b94bfd
INFO:	04:33:05 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:33:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:33:05,909 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:33:05,909 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:33:05,960 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:33:05,960 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:33:06,001 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:33:06,001 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:33:06 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:33:06 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:33:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████▏   | 472/770 [00:00<00:00, 4699.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4730.73it/s]
INFO:	04:33:06 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:33:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:33:07 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:33:07 - docling.document_converter - Going to convert document batch...
INFO:	04:33:07 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 6b5aa9d49bf5933a22591c3559b94bfd
INFO:	04:33:07 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:33:07 - docling.document_converter - Finished converting document file in 0.48 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:645: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:33:07 - docling_jobkit.convert.results - Processed 1 docs in 0.48 seconds.
INFO:	04:33:07 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 89bf4717-a321-4ab4-bc4f-ed6354efab13 in 0.48 seconds
INFO:	04:33:07 - uvicorn.access - 172.17.0.1:45410 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:33:07 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:33:07 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:33:07 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:33:07 - docling_serve.app - [TENANT_ID] Task 48760219-c3e1-465b-b9f9-c98246191292 created with tenant_id='default'
INFO:	04:33:07 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 48760219-c3e1-465b-b9f9-c98246191292
INFO:	04:33:07 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:33:07 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 345bf8d309571831952bb6d347d0f005
INFO:	04:33:07 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:33:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:33:07,920 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:33:07,920 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:33:07,969 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:33:07,970 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:33:08,010 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:33:08,010 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:33:08 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:33:08 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:33:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 484/770 [00:00<00:00, 4837.25it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4827.34it/s]
INFO:	04:33:08 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:33:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:33:09 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:33:09 - docling.document_converter - Going to convert document batch...
INFO:	04:33:09 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 345bf8d309571831952bb6d347d0f005
INFO:	04:33:09 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:33:09 - docling.document_converter - Finished converting document file in 0.54 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:645: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:33:09 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	04:33:09 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 48760219-c3e1-465b-b9f9-c98246191292 in 0.58 seconds
INFO:	04:33:09 - uvicorn.access - 172.17.0.1:45410 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:33:10 - uvicorn.access - 172.17.0.1:45410 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:33:10 - uvicorn.access - 172.17.0.1:45410 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:31:42 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:31:42 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:31:42 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:31:42 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:31:42 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:31:42 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:31:42 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	04:31:42 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:31:42 - docling_jobkit.connectors.plugins.defaults - Connector 'KafkaTargetProcessor' skipped — optional dependency not installed (No module named 'confluent_kafka'). Install the matching extra to enable it.
INFO:	04:31:42 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:31:42 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:31:42 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/healthz$,/readyz$,/metrics$,/health$,/ready$,/livez$)
INFO:	04:31:43 - uvicorn.error - Started server process [1]
INFO:	04:31:43 - uvicorn.error - Waiting for application startup.
INFO:	04:31:46 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:31:46 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:31:46 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:31:46 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:31:46 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:31:46 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 9d06178a9f1c8aeb9889d1e46440f3fa
INFO:	04:31:46 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:31:46 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:31:46 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-14 04:31:47.031402758 [W:onnxruntime:Default, device_discovery.cc:146 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:31:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:31:47,318 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:31:47,320 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:31:47,401 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:31:47,401 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:31:47,443 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:31:47,444 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:31:47 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:31:47 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:31:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 477/770 [00:00<00:00, 4751.74it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4720.31it/s]
INFO:	04:31:48 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:31:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:31:48 - uvicorn.error - Application startup complete.
INFO:	04:31:48 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:31:49 - docling_serve.app - Health check requested
INFO:	04:31:49 - uvicorn.access - 172.17.0.1:39500 - "GET /health HTTP/1.1" 200
INFO:	04:31:49 - docling_serve.app - Health check requested
INFO:	04:31:49 - uvicorn.access - 172.17.0.1:39502 - "GET /health HTTP/1.1" 200
INFO:	04:31:49 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:31:49 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:31:49 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:31:49 - docling_serve.app - [TENANT_ID] Task e06b35d1-355b-4b3a-afe6-ae98625ac453 created with tenant_id='default'
INFO:	04:31:49 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task e06b35d1-355b-4b3a-afe6-ae98625ac453
INFO:	04:31:49 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:31:49 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1d02772fb798c5f3e06aa82e0d32e7d
INFO:	04:31:49 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:31:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:31:49,340 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:31:49,340 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:31:49,396 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:31:49,397 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:31:49,515 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:31:49,515 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:31:49 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:31:49 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:31:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 483/770 [00:00<00:00, 4807.32it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4637.85it/s]
INFO:	04:31:50 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:31:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:31:51 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:31:51 - docling.document_converter - Going to convert document batch...
INFO:	04:31:51 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash a1d02772fb798c5f3e06aa82e0d32e7d
INFO:	04:31:51 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:31:51 - docling.document_converter - Finished converting document file in 0.58 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:641: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:31:51 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:31:51 - docling_jobkit.convert.results - Processed 1 docs in 0.68 seconds.
INFO:	04:31:51 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job e06b35d1-355b-4b3a-afe6-ae98625ac453 in 0.68 seconds
INFO:	04:31:53 - uvicorn.access - 172.17.0.1:39502 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:31:53 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:31:53 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:31:53 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:31:53 - docling_serve.app - [TENANT_ID] Task ef4578da-8f7d-44a1-8a8a-c1138d357556 created with tenant_id='default'
INFO:	04:31:53 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task ef4578da-8f7d-44a1-8a8a-c1138d357556
INFO:	04:31:53 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:31:53 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1d02772fb798c5f3e06aa82e0d32e7d
INFO:	04:31:53 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:31:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:31:53,354 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:31:53,354 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:31:53,439 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:31:53,439 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:31:53,507 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:31:53,507 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:31:53 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:31:53 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:31:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▊    | 451/770 [00:00<00:00, 4506.93it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4358.29it/s]
INFO:	04:31:54 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:31:54 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:31:55 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:31:55 - docling.document_converter - Going to convert document batch...
INFO:	04:31:55 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash a1d02772fb798c5f3e06aa82e0d32e7d
INFO:	04:31:55 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:31:55 - docling.document_converter - Finished converting document file in 0.54 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:641: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:31:55 - docling_jobkit.convert.results - Processed 1 docs in 0.54 seconds.
INFO:	04:31:55 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job ef4578da-8f7d-44a1-8a8a-c1138d357556 in 0.54 seconds
INFO:	04:31:57 - uvicorn.access - 172.17.0.1:39502 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:31:57 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:31:57 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:31:57 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:31:57 - docling_serve.app - [TENANT_ID] Task 3c86e1d8-e3f2-4a7d-b926-df3fa77061ee created with tenant_id='default'
INFO:	04:31:57 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 3c86e1d8-e3f2-4a7d-b926-df3fa77061ee
INFO:	04:31:57 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:31:57 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 21c1cdafbd5b48f9b0cfcb806e9e9d57
INFO:	04:31:57 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:31:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:31:57,370 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:31:57,370 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:31:57,447 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:31:57,448 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:31:57,526 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:31:57,526 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:31:57 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:31:57 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:31:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 445/770 [00:00<00:00, 4422.91it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4174.47it/s]
INFO:	04:31:58 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:31:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:31:58 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:31:58 - docling.document_converter - Going to convert document batch...
INFO:	04:31:58 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 21c1cdafbd5b48f9b0cfcb806e9e9d57
INFO:	04:31:58 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:31:58 - docling.document_converter - Finished converting document file in 0.30 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:641: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:31:59 - docling_jobkit.convert.results - Processed 1 docs in 0.77 seconds.
INFO:	04:31:59 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 3c86e1d8-e3f2-4a7d-b926-df3fa77061ee in 0.77 seconds
INFO:	04:32:01 - uvicorn.access - 172.17.0.1:39502 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:32:01 - uvicorn.access - 172.17.0.1:39502 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:32:01 - uvicorn.access - 172.17.0.1:39502 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:30:11 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:30:11 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:30:11 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:30:11 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:30:11 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:30:11 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:30:11 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	04:30:11 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:30:11 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:30:11 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:30:11 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/health$,/healthz$,/metrics$,/ready$,/readyz$)
INFO:	04:30:12 - uvicorn.error - Started server process [1]
INFO:	04:30:12 - uvicorn.error - Waiting for application startup.
INFO:	04:30:15 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:30:16 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:30:16 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:30:16 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:30:16 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:30:16 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e2db689ab35ca52a08b5b7fa25de8cc8
INFO:	04:30:16 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:30:16 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:30:16 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-14 04:30:16.470275589 [W:onnxruntime:Default, device_discovery.cc:134 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:30:16 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:30:16,852 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:30:16,854 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:30:16,972 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:30:16,972 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:30:17,018 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:30:17,019 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:30:17 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:30:17 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:30:17 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[transformers] `torch_dtype` is deprecated! Use `dtype` instead!
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  71%|███████▏  | 550/770 [00:00<00:00, 5455.01it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5298.99it/s]
INFO:	04:30:19 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:30:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:30:20 - uvicorn.error - Application startup complete.
INFO:	04:30:20 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:30:20 - docling_serve.app - Health check requested
INFO:	04:30:20 - uvicorn.access - 172.17.0.1:56706 - "GET /health HTTP/1.1" 200
INFO:	04:30:20 - docling_serve.app - Health check requested
INFO:	04:30:20 - uvicorn.access - 172.17.0.1:56710 - "GET /health HTTP/1.1" 200
INFO:	04:30:20 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:30:20 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:30:20 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:30:20 - docling_serve.app - [TENANT_ID] Task 5254740f-dc2a-4c88-a863-49e02a9f6254 created with tenant_id='default'
INFO:	04:30:20 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 5254740f-dc2a-4c88-a863-49e02a9f6254
INFO:	04:30:20 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:30:21 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	04:30:21 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:30:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:30:21,100 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:30:21,100 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:30:21,208 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:30:21,209 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:30:21,291 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:30:21,291 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:30:21 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:30:21 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:30:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  54%|█████▍    | 415/770 [00:00<00:00, 4140.98it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4329.23it/s]
INFO:	04:30:21 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:30:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:30:22 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:30:22 - docling.document_converter - Going to convert document batch...
INFO:	04:30:22 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	04:30:22 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:30:22 - docling.document_converter - Finished converting document file in 0.47 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:30:22 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:30:23 - docling_jobkit.convert.results - Processed 1 docs in 0.60 seconds.
INFO:	04:30:23 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 5254740f-dc2a-4c88-a863-49e02a9f6254 in 0.60 seconds
INFO:	04:30:24 - uvicorn.access - 172.17.0.1:56710 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:30:24 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:30:24 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:30:24 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:30:24 - docling_serve.app - [TENANT_ID] Task 97d35285-86de-4132-80f2-87bc4f396a37 created with tenant_id='default'
INFO:	04:30:24 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 97d35285-86de-4132-80f2-87bc4f396a37
INFO:	04:30:24 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:30:25 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	04:30:25 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:30:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:30:25,132 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:30:25,132 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:30:25,193 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:30:25,195 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:30:25,283 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:30:25,284 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:30:25 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:30:25 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:30:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  57%|█████▋    | 436/770 [00:00<00:00, 4357.60it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4932.95it/s]
INFO:	04:30:26 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:30:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:30:27 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:30:27 - docling.document_converter - Going to convert document batch...
INFO:	04:30:27 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	04:30:27 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:30:27 - docling.document_converter - Finished converting document file in 0.57 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:30:27 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	04:30:27 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 97d35285-86de-4132-80f2-87bc4f396a37 in 0.58 seconds
INFO:	04:30:28 - uvicorn.access - 172.17.0.1:56710 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:30:28 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:30:28 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:30:28 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:30:28 - docling_serve.app - [TENANT_ID] Task acd969f1-4f6f-4a2f-94a7-58a1d1d31d4c created with tenant_id='default'
INFO:	04:30:28 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task acd969f1-4f6f-4a2f-94a7-58a1d1d31d4c
INFO:	04:30:28 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:30:29 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 9df8df3fc03c33cf6e8bd583e67dce64
INFO:	04:30:29 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:30:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:30:29,160 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:30:29,160 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:30:29,224 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:30:29,225 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:30:29,351 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:30:29,354 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:30:29 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:30:29 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:30:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 519/770 [00:00<00:00, 5187.58it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5295.46it/s]
INFO:	04:30:29 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:30:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:30:30 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:30:30 - docling.document_converter - Going to convert document batch...
INFO:	04:30:30 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 9df8df3fc03c33cf6e8bd583e67dce64
INFO:	04:30:30 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:30:31 - docling.document_converter - Finished converting document file in 0.59 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:30:31 - docling_jobkit.convert.results - Processed 1 docs in 0.64 seconds.
INFO:	04:30:31 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job acd969f1-4f6f-4a2f-94a7-58a1d1d31d4c in 0.64 seconds
INFO:	04:30:32 - uvicorn.access - 172.17.0.1:56710 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:30:33 - uvicorn.access - 172.17.0.1:56710 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:30:33 - uvicorn.access - 172.17.0.1:56710 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:28:44 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:28:44 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:28:44 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:28:44 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:28:44 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:28:44 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:28:44 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:28:44 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/metrics$,/readyz$,/ready$,/health$,/livez$,/healthz$)
INFO:	04:28:45 - uvicorn.error - Started server process [1]
INFO:	04:28:45 - uvicorn.error - Waiting for application startup.
INFO:	04:28:48 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:28:49 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:28:49 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:28:49 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:28:49 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:28:49 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash caff667a02b7f037838d32d34acfe0b0
INFO:	04:28:49 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:28:49 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:28:49 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-14 04:28:49.701654612 [W:onnxruntime:Default, device_discovery.cc:134 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:28:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:28:50,082 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:28:50,084 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:28:50,185 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:28:50,185 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:28:50,271 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:28:50,271 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:28:50 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:28:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 487/770 [00:00<00:00, 4866.96it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4817.50it/s]
INFO:	04:28:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:28:51 - uvicorn.error - Application startup complete.
INFO:	04:28:51 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:28:52 - docling_serve.app - Health check requested
INFO:	04:28:52 - uvicorn.access - 172.17.0.1:44654 - "GET /health HTTP/1.1" 200
INFO:	04:28:52 - docling_serve.app - Health check requested
INFO:	04:28:52 - uvicorn.access - 172.17.0.1:44658 - "GET /health HTTP/1.1" 200
INFO:	04:28:52 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:28:52 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:28:52 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:28:52 - docling_serve.app - [TENANT_ID] Task 8e0281a1-0105-49ee-98ab-013238d112e1 created with tenant_id='default'
INFO:	04:28:52 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8e0281a1-0105-49ee-98ab-013238d112e1
INFO:	04:28:52 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:28:52 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash ab12ef348c8fc273bf2be7a49773b303
INFO:	04:28:52 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:28:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:28:52,786 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:28:52,786 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:28:52,853 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:28:52,853 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:28:52,935 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:28:52,936 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:28:53 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:28:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 485/770 [00:00<00:00, 4827.31it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5289.31it/s]
INFO:	04:28:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:28:54 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:28:54 - docling.document_converter - Going to convert document batch...
INFO:	04:28:54 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:28:54 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:28:55 - docling.document_converter - Finished converting document file in 0.69 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:28:55 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:28:55 - docling_jobkit.convert.results - Processed 1 docs in 0.81 seconds.
INFO:	04:28:55 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8e0281a1-0105-49ee-98ab-013238d112e1 in 0.81 seconds
INFO:	04:28:56 - uvicorn.access - 172.17.0.1:44658 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:28:56 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:28:56 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:28:56 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:28:56 - docling_serve.app - [TENANT_ID] Task 50924097-3ed4-437c-b863-7c6610c1d790 created with tenant_id='default'
INFO:	04:28:56 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 50924097-3ed4-437c-b863-7c6610c1d790
INFO:	04:28:56 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:28:56 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash ab12ef348c8fc273bf2be7a49773b303
INFO:	04:28:56 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:28:56 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:28:56,783 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:28:56,784 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:28:56,833 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:28:56,833 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:28:56,915 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:28:56,915 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:28:57 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:28:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 503/770 [00:00<00:00, 5024.11it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4739.56it/s]
INFO:	04:28:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:28:58 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:28:58 - docling.document_converter - Going to convert document batch...
INFO:	04:28:58 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:28:58 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:28:58 - docling.document_converter - Finished converting document file in 0.58 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:28:58 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	04:28:58 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 50924097-3ed4-437c-b863-7c6610c1d790 in 0.58 seconds
INFO:	04:28:58 - uvicorn.access - 172.17.0.1:44658 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:28:58 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:28:58 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:28:58 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:28:58 - docling_serve.app - [TENANT_ID] Task 66c0de9f-67c3-4b6a-bd60-145fbf5ebf72 created with tenant_id='default'
INFO:	04:28:58 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 66c0de9f-67c3-4b6a-bd60-145fbf5ebf72
INFO:	04:28:58 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:28:58 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash b3849eabdc7ecae5f3d54428a0162342
INFO:	04:28:58 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:28:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:28:58,804 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:28:58,804 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:28:58,859 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:28:58,859 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:28:58,958 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:28:58,959 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:28:59 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:28:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 498/770 [00:00<00:00, 4966.85it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4973.31it/s]
INFO:	04:28:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:29:00 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:29:00 - docling.document_converter - Going to convert document batch...
INFO:	04:29:00 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:29:00 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:29:00 - docling.document_converter - Finished converting document file in 0.46 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:29:00 - docling_jobkit.convert.results - Processed 1 docs in 0.51 seconds.
INFO:	04:29:00 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 66c0de9f-67c3-4b6a-bd60-145fbf5ebf72 in 0.51 seconds
INFO:	04:29:00 - uvicorn.access - 172.17.0.1:44658 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:29:01 - uvicorn.access - 172.17.0.1:44658 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:29:01 - uvicorn.access - 172.17.0.1:44658 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:27:16 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:27:16 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:27:16 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:27:16 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:27:16 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:27:16 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:27:16 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/ready$,/livez$,/health$,/metrics$,/healthz$)
INFO:	04:27:16 - uvicorn.error - Started server process [1]
INFO:	04:27:16 - uvicorn.error - Waiting for application startup.
INFO:	04:27:20 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:27:20 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:27:20 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:27:20 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:27:20 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:27:21 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	04:27:21 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:27:21 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:27:21 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-14 04:27:21.152794725 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:27:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:27:21,503 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:27:21,505 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:27:21,571 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:27:21,571 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:27:21,690 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:27:21,690 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:27:21 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:27:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  57%|█████▋    | 439/770 [00:00<00:00, 4384.52it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4454.26it/s]
INFO:	04:27:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:27:23 - uvicorn.error - Application startup complete.
INFO:	04:27:23 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:27:24 - docling_serve.app - Health check requested
INFO:	04:27:24 - uvicorn.access - 172.17.0.1:55876 - "GET /health HTTP/1.1" 200
INFO:	04:27:24 - docling_serve.app - Health check requested
INFO:	04:27:24 - uvicorn.access - 172.17.0.1:55882 - "GET /health HTTP/1.1" 200
INFO:	04:27:24 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:27:24 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:27:24 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:27:24 - docling_serve.app - [TENANT_ID] Task 88738240-1971-4d41-bc94-2e071361ee9f created with tenant_id='default'
INFO:	04:27:24 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 88738240-1971-4d41-bc94-2e071361ee9f
INFO:	04:27:24 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:27:24 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	04:27:24 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:27:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:27:24,338 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:27:24,338 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:27:24,405 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:27:24,405 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:27:24,520 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:27:24,521 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:27:24 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:27:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  71%|███████   | 544/770 [00:00<00:00, 5396.35it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5296.11it/s]
INFO:	04:27:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:27:26 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:27:26 - docling.document_converter - Going to convert document batch...
INFO:	04:27:26 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:27:26 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:27:26 - docling.document_converter - Finished converting document file in 0.61 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:27:26 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:27:26 - docling_jobkit.convert.results - Processed 1 docs in 0.72 seconds.
INFO:	04:27:26 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 88738240-1971-4d41-bc94-2e071361ee9f in 0.72 seconds
INFO:	04:27:28 - uvicorn.access - 172.17.0.1:55882 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:27:28 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:27:28 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:27:28 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:27:28 - docling_serve.app - [TENANT_ID] Task c617501b-1e97-4982-b95f-54dcf3966cb4 created with tenant_id='default'
INFO:	04:27:28 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task c617501b-1e97-4982-b95f-54dcf3966cb4
INFO:	04:27:28 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:27:28 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	04:27:28 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:27:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:27:28,354 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:27:28,354 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:27:28,420 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:27:28,420 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:27:28,550 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:27:28,550 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:27:28 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:27:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 458/770 [00:00<00:00, 4571.42it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4454.87it/s]
INFO:	04:27:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:27:29 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:27:29 - docling.document_converter - Going to convert document batch...
INFO:	04:27:29 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:27:29 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:27:29 - docling.document_converter - Finished converting document file in 0.42 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:27:29 - docling_jobkit.convert.results - Processed 1 docs in 0.43 seconds.
INFO:	04:27:29 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job c617501b-1e97-4982-b95f-54dcf3966cb4 in 0.43 seconds
INFO:	04:27:30 - uvicorn.access - 172.17.0.1:55882 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:27:30 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:27:30 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:27:30 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:27:30 - docling_serve.app - [TENANT_ID] Task e3f4c9d0-6746-4c64-bc81-07f2a1c4b7d3 created with tenant_id='default'
INFO:	04:27:30 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task e3f4c9d0-6746-4c64-bc81-07f2a1c4b7d3
INFO:	04:27:30 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:27:30 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	04:27:30 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:27:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:27:30,350 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:27:30,350 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:27:30,404 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:27:30,404 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:27:30,470 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:27:30,470 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:27:30 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:27:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 467/770 [00:00<00:00, 4660.32it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4733.52it/s]
INFO:	04:27:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:27:31 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:27:31 - docling.document_converter - Going to convert document batch...
INFO:	04:27:31 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:27:31 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:27:31 - docling.document_converter - Finished converting document file in 0.35 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:27:31 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	04:27:31 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job e3f4c9d0-6746-4c64-bc81-07f2a1c4b7d3 in 0.39 seconds
INFO:	04:27:32 - uvicorn.access - 172.17.0.1:55882 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:27:32 - uvicorn.access - 172.17.0.1:55882 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:27:32 - uvicorn.access - 172.17.0.1:55882 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:25:47 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:25:47 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:25:47 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:25:47 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:25:47 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/ready$,/metrics$,/readyz$,/livez$,/healthz$)
INFO:	04:25:47 - uvicorn.error - Started server process [1]
INFO:	04:25:47 - uvicorn.error - Waiting for application startup.
INFO:	04:25:51 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:25:51 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:25:51 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:25:51 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:25:51 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:25:51 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	04:25:51 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:25:51 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:25:51 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-14 04:25:51.819360208 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:25:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:25:52,110 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:25:52,111 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:25:52,170 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:25:52,170 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:25:52,221 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:25:52,222 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:25:52 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:25:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 510/770 [00:00<00:00, 5089.57it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5146.30it/s]
INFO:	04:25:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:25:53 - uvicorn.error - Application startup complete.
INFO:	04:25:53 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:25:53 - docling_serve.app - Health check requested
INFO:	04:25:53 - uvicorn.access - 172.17.0.1:58476 - "GET /health HTTP/1.1" 200
INFO:	04:25:53 - docling_serve.app - Health check requested
INFO:	04:25:53 - uvicorn.access - 172.17.0.1:58490 - "GET /health HTTP/1.1" 200
INFO:	04:25:53 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:25:53 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:25:53 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:25:53 - docling_serve.app - [TENANT_ID] Task a1ca9112-cb25-4652-9922-e20c104ab0f0 created with tenant_id='default'
INFO:	04:25:53 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task a1ca9112-cb25-4652-9922-e20c104ab0f0
INFO:	04:25:53 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:25:53 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	04:25:53 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:25:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:25:53,343 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:25:53,343 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:25:53,407 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:25:53,407 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:25:53,471 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:25:53,471 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:25:53 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:25:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 522/770 [00:00<00:00, 5210.10it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5226.35it/s]
INFO:	04:25:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:25:54 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:25:54 - docling.document_converter - Going to convert document batch...
INFO:	04:25:54 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:25:54 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:25:55 - docling.document_converter - Finished converting document file in 0.85 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:25:55 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:25:55 - docling_jobkit.convert.results - Processed 1 docs in 0.92 seconds.
INFO:	04:25:55 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job a1ca9112-cb25-4652-9922-e20c104ab0f0 in 0.92 seconds
INFO:	04:25:57 - uvicorn.access - 172.17.0.1:58490 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:25:57 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:25:57 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:25:57 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:25:57 - docling_serve.app - [TENANT_ID] Task 1e937bfa-f101-4a10-b189-eeebe52c1bc4 created with tenant_id='default'
INFO:	04:25:57 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 1e937bfa-f101-4a10-b189-eeebe52c1bc4
INFO:	04:25:57 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:25:57 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	04:25:57 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:25:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:25:57,402 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:25:57,402 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:25:57,495 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:25:57,495 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:25:57,546 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:25:57,547 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:25:57 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:25:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 502/770 [00:00<00:00, 5009.24it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5271.42it/s]
INFO:	04:25:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:25:58 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:25:59 - docling.document_converter - Going to convert document batch...
INFO:	04:25:59 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:25:59 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:25:59 - docling.document_converter - Finished converting document file in 0.53 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:25:59 - docling_jobkit.convert.results - Processed 1 docs in 0.54 seconds.
INFO:	04:25:59 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 1e937bfa-f101-4a10-b189-eeebe52c1bc4 in 0.54 seconds
INFO:	04:25:59 - uvicorn.access - 172.17.0.1:58490 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:25:59 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:25:59 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:25:59 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:25:59 - docling_serve.app - [TENANT_ID] Task 92cb9061-7953-42fd-9e07-dc324107f535 created with tenant_id='default'
INFO:	04:25:59 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 92cb9061-7953-42fd-9e07-dc324107f535
INFO:	04:25:59 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:25:59 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	04:25:59 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:25:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:25:59,439 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:25:59,440 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-14 04:25:59,518 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:25:59,519 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:25:59,645 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:25:59,645 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:25:59 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:25:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 449/770 [00:00<00:00, 4476.00it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4442.14it/s]
INFO:	04:26:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:26:00 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:26:00 - docling.document_converter - Going to convert document batch...
INFO:	04:26:00 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:26:00 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:26:01 - docling.document_converter - Finished converting document file in 0.45 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:26:01 - docling_jobkit.convert.results - Processed 1 docs in 0.51 seconds.
INFO:	04:26:01 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 92cb9061-7953-42fd-9e07-dc324107f535 in 0.51 seconds
INFO:	04:26:01 - uvicorn.access - 172.17.0.1:58490 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:26:01 - uvicorn.access - 172.17.0.1:58490 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:26:01 - uvicorn.access - 172.17.0.1:58490 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:24:19 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:24:19 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:24:19 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:24:19 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:24:19 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/healthz$,/ready$,/readyz$,/metrics$,/livez$,/health$)
INFO:	04:24:19 - uvicorn.error - Started server process [1]
INFO:	04:24:19 - uvicorn.error - Waiting for application startup.
INFO:	04:24:24 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:24:24 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:24:24 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:24:24 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:24:24 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:24:24 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c4d6547d10e26a777a530d63ca01a1a1
INFO:	04:24:24 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:24:24 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:24:24 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-14 04:24:24.935011350 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:24:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:24:25,257 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:24:25,259 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:24:25,428 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:24:25,428 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:24:25,491 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:24:25,491 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:24:25 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:24:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 516/770 [00:00<00:00, 5154.20it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4956.31it/s]
INFO:	04:24:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:24:26 - uvicorn.error - Application startup complete.
INFO:	04:24:26 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:24:27 - docling_serve.app - Health check requested
INFO:	04:24:27 - uvicorn.access - 172.17.0.1:49308 - "GET /health HTTP/1.1" 200
INFO:	04:24:27 - docling_serve.app - Health check requested
INFO:	04:24:27 - uvicorn.access - 172.17.0.1:49316 - "GET /health HTTP/1.1" 200
INFO:	04:24:27 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:24:27 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:24:27 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:24:27 - docling_serve.app - [TENANT_ID] Task fdf2ee22-89b4-4838-9a74-876e72071e2c created with tenant_id='default'
INFO:	04:24:27 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task fdf2ee22-89b4-4838-9a74-876e72071e2c
INFO:	04:24:27 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:24:27 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	04:24:27 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:24:27 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:24:27,361 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:24:27,361 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:24:27,481 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:24:27,481 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:24:27,540 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:24:27,541 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:24:27 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:24:27 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 508/770 [00:00<00:00, 5073.62it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5104.59it/s]
INFO:	04:24:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:24:29 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:24:29 - docling.document_converter - Going to convert document batch...
INFO:	04:24:29 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:24:29 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:24:29 - docling.document_converter - Finished converting document file in 0.64 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:24:29 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:24:29 - docling_jobkit.convert.results - Processed 1 docs in 0.76 seconds.
INFO:	04:24:29 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job fdf2ee22-89b4-4838-9a74-876e72071e2c in 0.76 seconds
INFO:	04:24:31 - uvicorn.access - 172.17.0.1:49316 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:24:31 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:24:31 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:24:31 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:24:31 - docling_serve.app - [TENANT_ID] Task 92b9ac08-b2e3-4a36-a8a0-8d497c7082f9 created with tenant_id='default'
INFO:	04:24:31 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 92b9ac08-b2e3-4a36-a8a0-8d497c7082f9
INFO:	04:24:31 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:24:31 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	04:24:31 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:24:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:24:31,496 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:24:31,497 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:24:31,721 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:24:31,722 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:24:31,770 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:24:31,771 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:24:31 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:24:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  71%|███████   | 543/770 [00:00<00:00, 5425.80it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6292.97it/s]
INFO:	04:24:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:24:33 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:24:33 - docling.document_converter - Going to convert document batch...
INFO:	04:24:33 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:24:33 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:24:34 - docling.document_converter - Finished converting document file in 1.03 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:24:34 - docling_jobkit.convert.results - Processed 1 docs in 1.03 seconds.
INFO:	04:24:34 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 92b9ac08-b2e3-4a36-a8a0-8d497c7082f9 in 1.03 seconds
INFO:	04:24:35 - uvicorn.access - 172.17.0.1:49316 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:24:35 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:24:35 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:24:35 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:24:35 - docling_serve.app - [TENANT_ID] Task 0169c04b-e5ab-4f2b-a629-68ce5ceb99aa created with tenant_id='default'
INFO:	04:24:35 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 0169c04b-e5ab-4f2b-a629-68ce5ceb99aa
INFO:	04:24:35 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:24:35 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 63e8839d1103b03d45382915dba33c89
INFO:	04:24:35 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:24:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:24:35,653 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:24:35,653 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:24:35,892 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:24:35,892 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:24:35,971 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:24:35,972 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:24:36 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:24:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|██████    | 464/770 [00:00<00:00, 4636.22it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4804.42it/s]
INFO:	04:24:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:24:37 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:24:37 - docling.document_converter - Going to convert document batch...
INFO:	04:24:37 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:24:37 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:24:37 - docling.document_converter - Finished converting document file in 0.86 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:24:37 - docling_jobkit.convert.results - Processed 1 docs in 0.90 seconds.
INFO:	04:24:37 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 0169c04b-e5ab-4f2b-a629-68ce5ceb99aa in 0.90 seconds
INFO:	04:24:39 - uvicorn.access - 172.17.0.1:49316 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:24:39 - uvicorn.access - 172.17.0.1:49316 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:24:39 - uvicorn.access - 172.17.0.1:49316 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:22:43 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:22:43 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:22:43 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:22:43 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:22:43 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/ready$,/healthz$,/livez$,/health$,/metrics$)
INFO:	04:22:43 - uvicorn.error - Started server process [1]
INFO:	04:22:43 - uvicorn.error - Waiting for application startup.
INFO:	04:22:48 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:22:48 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:22:48 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:22:48 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:22:48 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:22:48 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash f446dcc5a1a7c6aff458e30cab474a9e
INFO:	04:22:48 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:22:48 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-14 04:22:48.942413571 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:22:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:22:49,310 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:22:49,312 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:22:49,444 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:22:49,444 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:22:49,553 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:22:49,553 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:22:49 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:22:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 474/770 [00:00<00:00, 4696.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4481.32it/s]
INFO:	04:22:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:22:50 - uvicorn.error - Application startup complete.
INFO:	04:22:50 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:22:51 - docling_serve.app - Health check requested
INFO:	04:22:51 - uvicorn.access - 172.17.0.1:34780 - "GET /health HTTP/1.1" 200
INFO:	04:22:51 - docling_serve.app - Health check requested
INFO:	04:22:51 - uvicorn.access - 172.17.0.1:34790 - "GET /health HTTP/1.1" 200
INFO:	04:22:51 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:22:51 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:22:51 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:22:51 - docling_serve.app - [TENANT_ID] Task 2b58fe6d-358d-456d-b993-572bee14e704 created with tenant_id='default'
INFO:	04:22:51 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 2b58fe6d-358d-456d-b993-572bee14e704
INFO:	04:22:51 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:22:51 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	04:22:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:22:51,392 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:22:51,392 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:22:51,519 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:22:51,519 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:22:51,569 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:22:51,570 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:22:51 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:22:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 457/770 [00:00<00:00, 4549.43it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4566.13it/s]
INFO:	04:22:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:22:52 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:22:53 - docling.document_converter - Going to convert document batch...
INFO:	04:22:53 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:22:53 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:22:53 - docling.document_converter - Finished converting document file in 0.57 sec.
WARNING:	04:22:53 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:22:53 - docling_jobkit.convert.results - Processed 1 docs in 0.68 seconds.
INFO:	04:22:53 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 2b58fe6d-358d-456d-b993-572bee14e704 in 0.68 seconds
INFO:	04:22:55 - uvicorn.access - 172.17.0.1:34790 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:22:55 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:22:55 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:22:55 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:22:55 - docling_serve.app - [TENANT_ID] Task cef439f7-7925-402b-9261-fd318a36a95b created with tenant_id='default'
INFO:	04:22:55 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task cef439f7-7925-402b-9261-fd318a36a95b
INFO:	04:22:55 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:22:55 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	04:22:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:22:55,465 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:22:55,465 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:22:55,592 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:22:55,592 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:22:55,689 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:22:55,689 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:22:55 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:22:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 510/770 [00:00<00:00, 5097.26it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6737.47it/s]
INFO:	04:22:56 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:22:57 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:22:57 - docling.document_converter - Going to convert document batch...
INFO:	04:22:57 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:22:57 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:22:58 - docling.document_converter - Finished converting document file in 0.57 sec.
INFO:	04:22:58 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	04:22:58 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job cef439f7-7925-402b-9261-fd318a36a95b in 0.58 seconds
INFO:	04:22:59 - uvicorn.access - 172.17.0.1:34790 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:22:59 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:22:59 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:22:59 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:22:59 - docling_serve.app - [TENANT_ID] Task 4985bb28-269b-4bf7-8a97-7736212e201d created with tenant_id='default'
INFO:	04:22:59 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 4985bb28-269b-4bf7-8a97-7736212e201d
INFO:	04:22:59 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:22:59 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e50b6140ec7ee9be0d0fea6ba20c9795
INFO:	04:22:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:22:59,808 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:22:59,808 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:22:59,967 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:22:59,967 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:23:00,054 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:23:00,054 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:23:00 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:23:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 511/770 [00:00<00:00, 5109.74it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5154.71it/s]
INFO:	04:23:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:23:01 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:23:01 - docling.document_converter - Going to convert document batch...
INFO:	04:23:01 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:23:01 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:23:01 - docling.document_converter - Finished converting document file in 0.54 sec.
INFO:	04:23:01 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	04:23:01 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 4985bb28-269b-4bf7-8a97-7736212e201d in 0.58 seconds
INFO:	04:23:03 - uvicorn.access - 172.17.0.1:34790 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:23:03 - uvicorn.access - 172.17.0.1:34790 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:23:03 - uvicorn.access - 172.17.0.1:34790 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:21:11 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:21:11 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:21:11 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:21:11 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:21:11 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/healthz$,/metrics$,/health$,/readyz$,/ready$)
INFO:	04:21:11 - uvicorn.error - Started server process [1]
INFO:	04:21:11 - uvicorn.error - Waiting for application startup.
INFO:	04:21:15 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:21:15 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:21:15 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:21:15 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:21:15 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:21:15 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	04:21:15 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:21:15 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-14 04:21:15.567315434 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:21:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:21:15,883 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:21:15,885 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:21:15,980 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:21:15,980 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:21:16,028 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:21:16,028 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:21:16 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:21:16 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 510/770 [00:00<00:00, 5070.98it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4980.05it/s]
INFO:	04:21:16 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:21:17 - uvicorn.error - Application startup complete.
INFO:	04:21:17 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:21:17 - docling_serve.app - Health check requested
INFO:	04:21:17 - uvicorn.access - 172.17.0.1:36758 - "GET /health HTTP/1.1" 200
INFO:	04:21:17 - docling_serve.app - Health check requested
INFO:	04:21:17 - uvicorn.access - 172.17.0.1:36764 - "GET /health HTTP/1.1" 200
INFO:	04:21:17 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:21:17 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:21:17 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:21:17 - docling_serve.app - [TENANT_ID] Task 35b5513a-ec66-4ad3-be21-1fb66b250b4a created with tenant_id='default'
INFO:	04:21:17 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 35b5513a-ec66-4ad3-be21-1fb66b250b4a
INFO:	04:21:17 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:21:17 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:21:17 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:21:17,546 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:21:17,546 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:21:17,650 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:21:17,651 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:21:17,700 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:21:17,701 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:21:17 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:21:17 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|██████▉   | 536/770 [00:00<00:00, 5318.59it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5194.76it/s]
INFO:	04:21:18 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:21:18 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:21:19 - docling.document_converter - Going to convert document batch...
INFO:	04:21:19 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:21:19 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:21:19 - docling.document_converter - Finished converting document file in 0.51 sec.
WARNING:	04:21:19 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:21:19 - docling_jobkit.convert.results - Processed 1 docs in 0.60 seconds.
INFO:	04:21:19 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 35b5513a-ec66-4ad3-be21-1fb66b250b4a in 0.60 seconds
INFO:	04:21:19 - uvicorn.access - 172.17.0.1:36764 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:21:19 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:21:19 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:21:19 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:21:19 - docling_serve.app - [TENANT_ID] Task b43660f0-8b1e-4457-ba61-3da8a6c6ee65 created with tenant_id='default'
INFO:	04:21:19 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task b43660f0-8b1e-4457-ba61-3da8a6c6ee65
INFO:	04:21:19 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:21:19 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:21:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:21:19,887 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:21:19,887 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:21:19,995 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:21:19,995 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:21:20,044 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:21:20,044 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:21:20 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:21:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 484/770 [00:00<00:00, 4817.04it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5018.29it/s]
INFO:	04:21:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:21:21 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:21:21 - docling.document_converter - Going to convert document batch...
INFO:	04:21:21 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:21:21 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:21:21 - docling.document_converter - Finished converting document file in 0.57 sec.
INFO:	04:21:21 - docling_jobkit.convert.results - Processed 1 docs in 0.57 seconds.
INFO:	04:21:21 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job b43660f0-8b1e-4457-ba61-3da8a6c6ee65 in 0.57 seconds
INFO:	04:21:21 - uvicorn.access - 172.17.0.1:36764 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:21:21 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:21:21 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:21:21 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:21:21 - docling_serve.app - [TENANT_ID] Task 710bf3d5-354f-4d05-a896-bc5c9b48e23d created with tenant_id='default'
INFO:	04:21:21 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 710bf3d5-354f-4d05-a896-bc5c9b48e23d
INFO:	04:21:21 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:21:21 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	04:21:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:21:21,956 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:21:21,957 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:21:22,110 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:21:22,111 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:21:22,164 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:21:22,164 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:21:22 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:21:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▊    | 452/770 [00:00<00:00, 4515.33it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4394.81it/s]
INFO:	04:21:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:21:23 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:21:23 - docling.document_converter - Going to convert document batch...
INFO:	04:21:23 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:21:23 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:21:23 - docling.document_converter - Finished converting document file in 0.43 sec.
INFO:	04:21:23 - docling_jobkit.convert.results - Processed 1 docs in 0.50 seconds.
INFO:	04:21:23 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 710bf3d5-354f-4d05-a896-bc5c9b48e23d in 0.50 seconds
INFO:	04:21:23 - uvicorn.access - 172.17.0.1:36764 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:21:24 - uvicorn.access - 172.17.0.1:36764 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:21:24 - uvicorn.access - 172.17.0.1:36764 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:19:47 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:19:47 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:19:47 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:19:47 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:19:47 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/metrics$,/readyz$,/ready$,/healthz$,/livez$,/health$)
INFO:	04:19:47 - uvicorn.error - Started server process [1]
INFO:	04:19:47 - uvicorn.error - Waiting for application startup.
INFO:	04:19:52 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:19:52 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:19:52 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:19:52 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:19:52 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:19:52 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	04:19:52 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:19:52 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-14 04:19:52.630087738 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:19:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:19:53,101 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:19:53,103 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:19:53,277 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:19:53,277 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:19:53,371 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:19:53,371 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:19:53 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:19:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 508/770 [00:00<00:00, 5068.66it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5351.07it/s]
INFO:	04:19:54 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:19:54 - uvicorn.error - Application startup complete.
INFO:	04:19:54 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:19:55 - docling_serve.app - Health check requested
INFO:	04:19:55 - uvicorn.access - 172.17.0.1:55570 - "GET /health HTTP/1.1" 200
INFO:	04:19:55 - docling_serve.app - Health check requested
INFO:	04:19:55 - uvicorn.access - 172.17.0.1:55576 - "GET /health HTTP/1.1" 200
INFO:	04:19:55 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:19:55 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:19:55 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:19:55 - docling_serve.app - [TENANT_ID] Task 285e618d-4cc9-4a12-87f9-ecb2e95db3d1 created with tenant_id='default'
INFO:	04:19:55 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 285e618d-4cc9-4a12-87f9-ecb2e95db3d1
INFO:	04:19:55 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:19:55 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:19:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:19:55,294 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:19:55,294 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:19:55,469 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:19:55,469 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:19:55,532 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:19:55,532 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:19:55 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:19:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  78%|███████▊  | 599/770 [00:00<00:00, 5942.09it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6266.93it/s]
INFO:	04:19:56 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:19:57 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:19:57 - docling.document_converter - Going to convert document batch...
INFO:	04:19:57 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:19:57 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:19:57 - docling.document_converter - Finished converting document file in 0.60 sec.
WARNING:	04:19:57 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:19:57 - docling_jobkit.convert.results - Processed 1 docs in 0.68 seconds.
INFO:	04:19:57 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 285e618d-4cc9-4a12-87f9-ecb2e95db3d1 in 0.68 seconds
INFO:	04:19:59 - uvicorn.access - 172.17.0.1:55576 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:19:59 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:19:59 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:19:59 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:19:59 - docling_serve.app - [TENANT_ID] Task 7e7077f9-8ae1-4bc6-98d6-6c6816dd0ceb created with tenant_id='default'
INFO:	04:19:59 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 7e7077f9-8ae1-4bc6-98d6-6c6816dd0ceb
INFO:	04:19:59 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:19:59 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:19:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:19:59,712 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:19:59,712 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:19:59,881 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:19:59,881 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:19:59,947 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:19:59,947 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:20:00 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:20:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|███████   | 541/770 [00:00<00:00, 5406.04it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5267.59it/s]
INFO:	04:20:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:20:01 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:20:01 - docling.document_converter - Going to convert document batch...
INFO:	04:20:01 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:20:01 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:20:01 - docling.document_converter - Finished converting document file in 0.57 sec.
INFO:	04:20:01 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	04:20:01 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 7e7077f9-8ae1-4bc6-98d6-6c6816dd0ceb in 0.58 seconds
INFO:	04:20:03 - uvicorn.access - 172.17.0.1:55576 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:20:03 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:20:03 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:20:03 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:20:03 - docling_serve.app - [TENANT_ID] Task fda774b1-1659-4d0e-8231-791a4868d600 created with tenant_id='default'
INFO:	04:20:03 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task fda774b1-1659-4d0e-8231-791a4868d600
INFO:	04:20:03 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:20:03 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	04:20:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:20:03,356 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:20:03,357 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:20:03,520 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:20:03,521 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:20:03,582 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:20:03,583 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:20:03 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:20:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  57%|█████▋    | 442/770 [00:00<00:00, 4381.35it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4681.25it/s]
INFO:	04:20:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:20:04 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:20:04 - docling.document_converter - Going to convert document batch...
INFO:	04:20:04 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:20:04 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:20:04 - docling.document_converter - Finished converting document file in 0.30 sec.
INFO:	04:20:05 - docling_jobkit.convert.results - Processed 1 docs in 0.36 seconds.
INFO:	04:20:05 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job fda774b1-1659-4d0e-8231-791a4868d600 in 0.36 seconds
INFO:	04:20:05 - uvicorn.access - 172.17.0.1:55576 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:20:05 - uvicorn.access - 172.17.0.1:55576 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:20:05 - uvicorn.access - 172.17.0.1:55576 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:18:16 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:18:16 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:18:16 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:18:16 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:18:16 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/ready$,/healthz$,/health$,/livez$,/metrics$)
INFO:	04:18:16 - uvicorn.error - Started server process [1]
INFO:	04:18:16 - uvicorn.error - Waiting for application startup.
INFO:	04:18:20 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:18:20 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:18:20 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:18:20 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:18:20 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:18:20 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	04:18:20 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:18:20 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-14 04:18:20.398347820 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:18:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:18:20,720 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:18:20,722 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:18:20,813 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:18:20,813 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:18:20,862 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:18:20,862 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:18:20 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:18:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 524/770 [00:00<00:00, 5219.83it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5237.37it/s]
INFO:	04:18:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:18:21 - uvicorn.error - Application startup complete.
INFO:	04:18:21 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:18:22 - docling_serve.app - Health check requested
INFO:	04:18:22 - uvicorn.access - 172.17.0.1:33942 - "GET /health HTTP/1.1" 200
INFO:	04:18:22 - docling_serve.app - Health check requested
INFO:	04:18:22 - uvicorn.access - 172.17.0.1:33954 - "GET /health HTTP/1.1" 200
INFO:	04:18:22 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:18:22 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:18:22 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:18:22 - docling_serve.app - [TENANT_ID] Task 8357ec1d-e362-4690-b2fe-1f01bf581fd7 created with tenant_id='default'
INFO:	04:18:22 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8357ec1d-e362-4690-b2fe-1f01bf581fd7
INFO:	04:18:22 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:18:22 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	04:18:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:18:22,217 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:18:22,217 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:18:22,316 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:18:22,316 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:18:22,366 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:18:22,366 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:18:22 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:18:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|██████    | 464/770 [00:00<00:00, 4608.50it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4831.46it/s]
INFO:	04:18:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:18:23 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:18:23 - docling.document_converter - Going to convert document batch...
INFO:	04:18:23 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:18:23 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:18:23 - docling.document_converter - Finished converting document file in 0.53 sec.
WARNING:	04:18:23 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:18:23 - docling_jobkit.convert.results - Processed 1 docs in 0.63 seconds.
INFO:	04:18:23 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8357ec1d-e362-4690-b2fe-1f01bf581fd7 in 0.63 seconds
INFO:	04:18:24 - uvicorn.access - 172.17.0.1:33954 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:18:24 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:18:24 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:18:24 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:18:24 - docling_serve.app - [TENANT_ID] Task 5246c445-3c5a-4683-9d91-e954bed010f4 created with tenant_id='default'
INFO:	04:18:24 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 5246c445-3c5a-4683-9d91-e954bed010f4
INFO:	04:18:24 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:18:24 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	04:18:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:18:24,245 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:18:24,245 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:18:24,343 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:18:24,344 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:18:24,395 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:18:24,395 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:18:24 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:18:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 514/770 [00:00<00:00, 5139.20it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5063.04it/s]
INFO:	04:18:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:18:25 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:18:25 - docling.document_converter - Going to convert document batch...
INFO:	04:18:25 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:18:25 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:18:25 - docling.document_converter - Finished converting document file in 0.36 sec.
INFO:	04:18:25 - docling_jobkit.convert.results - Processed 1 docs in 0.38 seconds.
INFO:	04:18:25 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 5246c445-3c5a-4683-9d91-e954bed010f4 in 0.38 seconds
INFO:	04:18:26 - uvicorn.access - 172.17.0.1:33954 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:18:26 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:18:26 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:18:26 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:18:26 - docling_serve.app - [TENANT_ID] Task c3a6396f-04b1-48d5-b2df-58659f9a5dd1 created with tenant_id='default'
INFO:	04:18:26 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task c3a6396f-04b1-48d5-b2df-58659f9a5dd1
INFO:	04:18:26 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:18:26 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash fb1751b09de6bdbe35ede48676ca8f82
INFO:	04:18:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:18:26,271 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:18:26,272 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:18:26,374 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:18:26,374 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:18:26,426 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:18:26,426 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:18:26 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:18:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 485/770 [00:00<00:00, 4847.38it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4922.12it/s]
INFO:	04:18:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:18:27 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:18:27 - docling.document_converter - Going to convert document batch...
INFO:	04:18:27 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:18:27 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:18:27 - docling.document_converter - Finished converting document file in 0.42 sec.
INFO:	04:18:27 - docling_jobkit.convert.results - Processed 1 docs in 0.47 seconds.
INFO:	04:18:27 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job c3a6396f-04b1-48d5-b2df-58659f9a5dd1 in 0.47 seconds
INFO:	04:18:28 - uvicorn.access - 172.17.0.1:33954 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:18:28 - uvicorn.access - 172.17.0.1:33954 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:18:28 - uvicorn.access - 172.17.0.1:33954 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:17:02 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:17:02 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:17:02 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:17:02 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:17:02 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/metrics$,/healthz$,/health$,/readyz$,/ready$)
INFO:	04:17:03 - uvicorn.error - Started server process [1]
INFO:	04:17:03 - uvicorn.error - Waiting for application startup.
INFO:	04:17:08 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:17:08 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:17:08 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:17:08 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:17:08 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:17:08 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash bcb2e23b24bd94a42b5c00d662a7c1cf
INFO:	04:17:08 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:17:08 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-14 04:17:08.309057842 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:17:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:17:08,813 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:17:08,816 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:17:08,993 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:17:08,993 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:17:09,098 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:17:09,100 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:17:09 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:17:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 9125.76it/s]
INFO:	04:17:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:17:11 - uvicorn.error - Application startup complete.
INFO:	04:17:11 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:17:11 - docling_serve.app - Health check requested
INFO:	04:17:11 - uvicorn.access - 172.17.0.1:33578 - "GET /health HTTP/1.1" 200
INFO:	04:17:11 - docling_serve.app - Health check requested
INFO:	04:17:11 - uvicorn.access - 172.17.0.1:33582 - "GET /health HTTP/1.1" 200
INFO:	04:17:11 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:17:11 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:17:11 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:17:11 - docling_serve.app - [TENANT_ID] Task fbf64297-d646-47fb-983b-11d817e58275 created with tenant_id='default'
INFO:	04:17:11 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task fbf64297-d646-47fb-983b-11d817e58275
INFO:	04:17:11 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:17:11 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	04:17:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:17:11,261 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:17:11,261 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:17:11,432 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:17:11,433 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:17:11,537 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:17:11,538 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:17:11 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:17:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  54%|█████▍    | 419/770 [00:00<00:00, 4187.63it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5663.01it/s]
INFO:	04:17:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:17:13 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:17:13 - docling.document_converter - Going to convert document batch...
INFO:	04:17:13 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:17:13 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:17:13 - docling.document_converter - Finished converting document file in 0.63 sec.
WARNING:	04:17:13 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:17:13 - docling_jobkit.convert.results - Processed 1 docs in 1.10 seconds.
INFO:	04:17:13 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job fbf64297-d646-47fb-983b-11d817e58275 in 1.10 seconds
INFO:	04:17:15 - uvicorn.access - 172.17.0.1:33582 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:17:15 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:17:15 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:17:15 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:17:15 - docling_serve.app - [TENANT_ID] Task 01167e92-792a-42e9-82ca-7e747597ec13 created with tenant_id='default'
INFO:	04:17:15 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 01167e92-792a-42e9-82ca-7e747597ec13
INFO:	04:17:15 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:17:15 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	04:17:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:17:15,310 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:17:15,311 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:17:15,472 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:17:15,473 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:17:15,555 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:17:15,555 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:17:15 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:17:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 502/770 [00:00<00:00, 5016.19it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5083.46it/s]
INFO:	04:17:16 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:17:17 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:17:17 - docling.document_converter - Going to convert document batch...
INFO:	04:17:17 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:17:17 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:17:17 - docling.document_converter - Finished converting document file in 0.44 sec.
INFO:	04:17:17 - docling_jobkit.convert.results - Processed 1 docs in 0.46 seconds.
INFO:	04:17:17 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 01167e92-792a-42e9-82ca-7e747597ec13 in 0.46 seconds
INFO:	04:17:19 - uvicorn.access - 172.17.0.1:33582 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:17:19 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:17:19 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:17:19 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:17:19 - docling_serve.app - [TENANT_ID] Task 8f77f1d7-219b-4e0f-84fb-66861ec93992 created with tenant_id='default'
INFO:	04:17:19 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8f77f1d7-219b-4e0f-84fb-66861ec93992
INFO:	04:17:19 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:17:19 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 3eabf304acb4a56e9ef52b02ef69bccb
INFO:	04:17:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-14 04:17:19,333 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:17:19,333 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:17:19,463 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:17:19,463 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:17:19,561 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:17:19,561 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:17:19 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:17:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  75%|███████▍  | 575/770 [00:00<00:00, 5718.66it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5648.15it/s]
INFO:	04:17:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:17:20 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:17:21 - docling.document_converter - Going to convert document batch...
INFO:	04:17:21 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:17:21 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:17:21 - docling.document_converter - Finished converting document file in 0.41 sec.
INFO:	04:17:21 - docling_jobkit.convert.results - Processed 1 docs in 0.48 seconds.
INFO:	04:17:21 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8f77f1d7-219b-4e0f-84fb-66861ec93992 in 0.48 seconds
INFO:	04:17:21 - uvicorn.access - 172.17.0.1:33582 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:17:21 - uvicorn.access - 172.17.0.1:33582 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:17:21 - uvicorn.access - 172.17.0.1:33582 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
2026-09-14 04:15:11.460973055 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 04:15:11,781 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:15:11,783 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:15:11,872 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:15:11,872 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:15:11,922 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:15:11,922 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|██████    | 465/770 [00:00<00:00, 4644.88it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4870.04it/s]
[INFO] 2026-09-14 04:15:13,296 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:15:13,296 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:15:13,392 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:15:13,392 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:15:13,443 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:15:13,444 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 514/770 [00:00<00:00, 5125.84it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5196.65it/s]
WARNING:	04:15:14 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
WARNING:	04:15:14 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
[INFO] 2026-09-14 04:15:15,342 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:15:15,343 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:15:15,443 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:15:15,444 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:15:15,508 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:15:15,509 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 509/770 [00:00<00:00, 5087.76it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4960.26it/s]
[INFO] 2026-09-14 04:15:17,348 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:15:17,348 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:15:17,440 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:15:17,441 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:15:17,493 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:15:17,493 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 491/770 [00:00<00:00, 4907.65it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4960.71it/s]

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
2026-09-14 04:14:07.790435737 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 04:14:08,323 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:14:08,326 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:14:08,482 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:14:08,482 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:14:08,688 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:14:08,688 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:   0%|          | 1/770 [00:00<03:16,  3.91it/s]Loading weights:  56%|█████▌    | 429/770 [00:00<00:00, 1533.01it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 1840.37it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54022 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54032 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:14:12,823 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:14:12,823 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:14:13,018 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:14:13,018 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:14:13,086 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:14:13,087 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  54%|█████▎    | 413/770 [00:00<00:00, 4110.58it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4251.01it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54032 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:14:16,853 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:14:16,854 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:14:17,031 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:14:17,031 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:14:17,130 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:14:17,131 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 476/770 [00:00<00:00, 4755.72it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4901.46it/s]
INFO:     172.17.0.1:54032 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:14:20,880 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:14:20,880 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:14:21,024 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:14:21,024 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:14:21,114 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:14:21,115 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  79%|███████▉  | 609/770 [00:00<00:00, 6072.30it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5667.65it/s]
INFO:     172.17.0.1:54032 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54032 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54032 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-14 04:12:16.271752289 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 04:12:16,575 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:12:16,577 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:12:16,671 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:12:16,671 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:12:16,720 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:12:16,721 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 483/770 [00:00<00:00, 4829.53it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4820.10it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:44334 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44350 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:12:17,877 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:12:17,877 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:12:17,974 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:12:17,975 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:12:18,025 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:12:18,025 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 496/770 [00:00<00:00, 4957.96it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4987.39it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44350 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:12:19,898 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:12:19,898 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:12:19,997 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:12:19,998 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:12:20,047 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:12:20,047 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████▏   | 473/770 [00:00<00:00, 4714.36it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4861.56it/s]
INFO:     172.17.0.1:44350 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:12:21,905 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:12:21,905 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:12:22,001 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:12:22,002 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:12:22,052 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:12:22,052 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 471/770 [00:00<00:00, 4679.72it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4624.68it/s]
INFO:     172.17.0.1:44350 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44350 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44350 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-14 04:11:12.891645312 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 04:11:13,433 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:11:13,436 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:11:13,605 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:11:13,605 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:11:13,659 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:11:13,660 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 449/770 [00:00<00:00, 4484.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4426.43it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:34532 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34538 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:11:15,224 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:11:15,225 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:11:15,333 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:11:15,334 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:11:15,408 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:11:15,408 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▊    | 451/770 [00:00<00:00, 4485.51it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4636.60it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34538 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:11:19,266 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:11:19,266 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:11:19,401 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:11:19,402 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:11:19,489 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:11:19,489 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 479/770 [00:00<00:00, 4782.46it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4994.47it/s]
INFO:     172.17.0.1:34538 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:11:23,267 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:11:23,267 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:11:23,395 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:11:23,396 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:11:23,471 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:11:23,471 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 503/770 [00:00<00:00, 5028.73it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4855.67it/s]
INFO:     172.17.0.1:34538 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34538 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34538 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-14 04:09:12.707275779 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 04:09:13,326 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:09:13,329 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:09:13,414 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:09:13,414 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:09:13,461 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:09:13,461 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 493/770 [00:00<00:00, 4911.05it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4955.83it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:38242 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38244 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:09:15,334 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:09:15,334 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:09:15,426 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:09:15,426 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:09:15,472 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:09:15,473 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 481/770 [00:00<00:00, 4806.12it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4954.86it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38244 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:09:17,370 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:09:17,370 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:09:17,461 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:09:17,462 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:09:17,509 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:09:17,509 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 479/770 [00:00<00:00, 4779.73it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4825.04it/s]
INFO:     172.17.0.1:38244 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:09:19,384 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:09:19,385 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-14 04:09:19,493 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:09:19,493 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-14 04:09:19,540 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:09:19,540 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 468/770 [00:00<00:00, 4642.93it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4679.77it/s]
INFO:     172.17.0.1:38244 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38244 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38244 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-14 04:08:20.769277748 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 04:08:21,576 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:08:21,579 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 04:08:21,760 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:08:21,760 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 04:08:21,815 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:08:21,815 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  41%|████▏     | 319/770 [00:00<00:00, 3168.72it/s]Loading weights:  83%|████████▎ | 636/770 [00:00<00:00, 2997.31it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 3053.40it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39914 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39928 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:08:24,057 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:08:24,057 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 04:08:24,192 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:08:24,192 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 04:08:24,246 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:08:24,246 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 496/770 [00:00<00:00, 4954.77it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4916.39it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39928 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:08:28,124 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:08:28,124 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 04:08:28,246 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:08:28,246 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 04:08:28,296 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:08:28,297 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  55%|█████▍    | 422/770 [00:00<00:00, 4218.60it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4220.60it/s]
INFO:     172.17.0.1:39928 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-14 04:08:32,209 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:08:32,209 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 04:08:32,339 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:08:32,339 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 04:08:32,410 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:08:32,410 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 456/770 [00:00<00:00, 4548.87it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4540.06it/s]
INFO:     172.17.0.1:39928 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39928 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39928 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-14 04:06:01.822409837 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 04:06:02,336 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:06:02,338 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 04:06:02,426 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:06:02,426 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 04:06:02,470 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:06:02,470 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57332 - "GET /health HTTP/1.1" 200 OK
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
2026-09-14 04:04:14.135369452 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 04:04:14,712 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:04:14,713 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 04:04:14,820 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:04:14,820 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 04:04:14,869 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:04:14,869 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43194 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43198 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43198 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43198 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43198 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43198 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43198 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-14 04:02:17.018929670 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 04:02:17,571 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:02:17,572 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 04:02:17,662 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:02:17,662 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 04:02:17,716 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:02:17,716 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59206 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59222 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59222 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59222 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59222 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59222 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59222 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-14 04:00:48.760540884 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 04:00:49,430 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:00:49,432 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 04:00:49,542 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:00:49,542 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 04:00:49,595 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 04:00:49,596 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56702 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56712 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56712 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56712 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56712 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56712 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56712 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-14 03:58:42.456970901 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 03:58:43,016 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:58:43,020 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 03:58:43,110 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:58:43,110 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 03:58:43,153 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:58:43,153 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57352 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57358 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57358 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57358 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57358 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57358 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57358 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-14 03:57:21.257115843 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 03:57:22,031 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:57:22,034 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 03:57:22,202 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:57:22,203 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 03:57:22,295 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:57:22,296 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:33934 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33948 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33948 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33948 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33948 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33948 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33948 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-14 03:54:57.745084979 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 03:54:58,277 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:54:58,279 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 03:54:58,386 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:54:58,386 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 03:54:58,436 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:54:58,436 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:37490 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37504 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37504 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37504 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37504 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37504 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37504 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-14 03:53:42.601271093 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-14 03:53:44,416 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:53:44,420 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 03:53:44,610 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:53:44,610 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 03:53:44,721 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:53:44,722 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:37804 - "GET /health HTTP/1.1" 200 OK
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
[INFO] 2026-09-14 03:51:15,317 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:51:15,320 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 03:51:15,407 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:51:15,407 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 03:51:15,446 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:51:15,446 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:38804 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38810 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38810 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38810 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38810 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38810 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38810 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-14 03:50:03,301 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:50:03,304 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 03:50:03,453 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:50:03,453 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 03:50:03,514 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:50:03,515 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:52068 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52074 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52074 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52074 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52074 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52074 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52074 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-14 03:47:23,383 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:47:23,385 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 03:47:23,470 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:47:23,471 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 03:47:23,509 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:47:23,509 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:49136 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49140 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49140 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49140 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49140 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49140 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49140 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-14 03:45:18,490 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:45:18,492 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 03:45:18,566 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:45:18,566 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 03:45:18,608 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:45:18,608 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39740 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39744 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39744 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39744 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39744 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39744 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39744 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-14 03:43:07,227 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:43:07,228 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 03:43:07,306 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:43:07,307 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 03:43:07,344 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:43:07,345 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43186 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43194 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43194 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43194 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43194 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43194 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43194 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-14 03:41:02,260 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:41:02,262 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-14 03:41:02,333 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:41:02,334 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-14 03:41:02,370 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-14 03:41:02,371 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:49188 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49200 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49200 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49200 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49200 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49200 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49200 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:36114 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36122 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36122 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36122 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36122 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36122 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36122 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52930 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52934 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52934 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52934 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52934 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52934 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52934 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52732 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52734 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52734 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52734 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52734 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52734 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52734 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50322 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50328 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50328 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50328 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50328 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50328 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50328 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:54168 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54180 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54180 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54180 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54180 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54180 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54180 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:34648 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34652 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34652 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34652 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34652 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34652 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34652 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:43092 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43108 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43108 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43108 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43108 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43108 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43108 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:56448 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56458 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56458 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56458 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56458 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56458 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56458 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:33648 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33664 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33664 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33664 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33664 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33664 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33664 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:53476 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53482 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53482 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53482 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53482 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53482 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53482 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:44524 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44540 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44540 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44540 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44540 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44540 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44540 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:41718 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41734 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41734 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41734 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41734 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41734 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41734 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50818 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50834 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50834 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50834 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50834 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50834 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50834 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:35432 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35446 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35446 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35446 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35446 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35446 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35446 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

