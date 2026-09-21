# Results for ghcr.io/docling-project/docling-serve as of 2026-09-21T04:37:05.137924490Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
| v1.34.0 | ✅ SUCCESS | [Click for run details](#v1.34.0-details) |
| v1.33.0 | ✅ SUCCESS | [Click for run details](#v1.33.0-details) |
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

### ghcr.io/docling-project/docling-serve:v1.34.0

<details id="v1.34.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.34.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:	04:36:48 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:36:48 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:36:48 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:36:48 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:36:48 - docling_jobkit.connectors.plugins.defaults - Connector 'BoxSourceProcessor' skipped — optional dependency not installed (No module named 'box_sdk_gen'). Install the matching extra to enable it.
INFO:	04:36:48 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:36:48 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:36:48 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	04:36:48 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:36:48 - docling_jobkit.connectors.plugins.defaults - Connector 'KafkaTargetProcessor' skipped — optional dependency not installed (No module named 'confluent_kafka'). Install the matching extra to enable it.
INFO:	04:36:48 - docling_jobkit.connectors.plugins.defaults - Connector 'BoxTargetProcessor' skipped — optional dependency not installed (No module named 'box_sdk_gen'). Install the matching extra to enable it.
INFO:	04:36:49 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:36:49 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:36:49 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/livez$,/healthz$,/metrics$,/health$,/ready$)
INFO:	04:36:49 - uvicorn.error - Started server process [1]
INFO:	04:36:49 - uvicorn.error - Waiting for application startup.
INFO:	04:36:51 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:36:52 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:36:52 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:36:52 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:36:52 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:36:52 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4b071d1415ad1ebea85cea80f4d6fa7b
INFO:	04:36:52 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:36:52 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:36:52 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-21 04:36:52.382300273 [W:onnxruntime:Default, device_discovery.cc:146 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:36:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:36:52,888 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:36:52,889 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:36:52,943 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:36:52,943 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:36:52,982 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:36:52,982 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:36:53 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:36:53 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:36:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 511/770 [00:00<00:00, 5105.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5084.16it/s]
INFO:	04:36:53 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:36:53 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:36:53 - uvicorn.error - Application startup complete.
INFO:	04:36:53 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:36:54 - docling_serve.app - Health check requested
INFO:	04:36:54 - uvicorn.access - 172.17.0.1:53750 - "GET /health HTTP/1.1" 200
INFO:	04:36:54 - docling_serve.app - Health check requested
INFO:	04:36:54 - uvicorn.access - 172.17.0.1:53754 - "GET /health HTTP/1.1" 200
INFO:	04:36:54 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:36:54 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:36:54 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:36:54 - docling_serve.app - [TENANT_ID] Task a9185a83-9ec7-4988-a5b8-d130aff2acf4 created with tenant_id='default'
INFO:	04:36:54 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task a9185a83-9ec7-4988-a5b8-d130aff2acf4
INFO:	04:36:54 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:36:54 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a2e22ed4b71003a02ccc48074bc1ab74
INFO:	04:36:54 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:36:54 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:36:54,654 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:36:54,654 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:36:54,703 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:36:54,704 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:36:54,750 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:36:54,750 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:36:54 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:36:54 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:36:54 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 511/770 [00:00<00:00, 5109.59it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5099.84it/s]
INFO:	04:36:55 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:36:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:36:55 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:36:55 - docling.document_converter - Going to convert document batch...
INFO:	04:36:55 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash a2e22ed4b71003a02ccc48074bc1ab74
INFO:	04:36:55 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:36:56 - docling.document_converter - Finished converting document file in 0.53 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:661: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:36:56 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:36:56 - docling_jobkit.convert.results - Processed 1 docs in 0.60 seconds.
INFO:	04:36:56 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job a9185a83-9ec7-4988-a5b8-d130aff2acf4 in 0.60 seconds
INFO:	04:36:56 - uvicorn.access - 172.17.0.1:53754 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:36:56 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:36:56 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:36:56 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:36:56 - docling_serve.app - [TENANT_ID] Task f318ee76-90bb-48d4-baeb-554d86aab388 created with tenant_id='default'
INFO:	04:36:56 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task f318ee76-90bb-48d4-baeb-554d86aab388
INFO:	04:36:56 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:36:56 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a2e22ed4b71003a02ccc48074bc1ab74
INFO:	04:36:56 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:36:56 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:36:56,670 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:36:56,670 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:36:56,715 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:36:56,715 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:36:56,755 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:36:56,756 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:36:56 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:36:56 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:36:56 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 516/770 [00:00<00:00, 5155.67it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5158.15it/s]
INFO:	04:36:57 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:36:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:36:58 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:36:58 - docling.document_converter - Going to convert document batch...
INFO:	04:36:58 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash a2e22ed4b71003a02ccc48074bc1ab74
INFO:	04:36:58 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:36:58 - docling.document_converter - Finished converting document file in 0.64 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:661: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:36:58 - docling_jobkit.convert.results - Processed 1 docs in 0.65 seconds.
INFO:	04:36:58 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job f318ee76-90bb-48d4-baeb-554d86aab388 in 0.65 seconds
INFO:	04:36:58 - uvicorn.access - 172.17.0.1:53754 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:36:58 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:36:58 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:36:58 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:36:58 - docling_serve.app - [TENANT_ID] Task 76008a99-b409-422e-a551-805b203041e3 created with tenant_id='default'
INFO:	04:36:58 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 76008a99-b409-422e-a551-805b203041e3
INFO:	04:36:58 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:36:58 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 78cb5ade368814d0813875c101ee149b
INFO:	04:36:58 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:36:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:36:58,684 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:36:58,684 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:36:58,729 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:36:58,729 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:36:58,769 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:36:58,769 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:36:58 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:36:58 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:36:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 500/770 [00:00<00:00, 4988.66it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5020.12it/s]
INFO:	04:36:59 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:36:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:37:00 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:37:00 - docling.document_converter - Going to convert document batch...
INFO:	04:37:00 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 78cb5ade368814d0813875c101ee149b
INFO:	04:37:00 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:37:00 - docling.document_converter - Finished converting document file in 0.35 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:661: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:37:00 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	04:37:00 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 76008a99-b409-422e-a551-805b203041e3 in 0.39 seconds
INFO:	04:37:00 - uvicorn.access - 172.17.0.1:53754 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:37:00 - uvicorn.access - 172.17.0.1:53754 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:37:00 - uvicorn.access - 172.17.0.1:53754 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v1.33.0

<details id="v1.33.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
Tag v1.33.0 is ok
~~~

</details>


#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs
Scalar docs at http://0.0.0.0:5001/scalar

Logs:
INFO:	04:35:17 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:35:18 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:35:18 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:35:18 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:35:18 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:35:18 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:35:18 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	04:35:18 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:35:18 - docling_jobkit.connectors.plugins.defaults - Connector 'KafkaTargetProcessor' skipped — optional dependency not installed (No module named 'confluent_kafka'). Install the matching extra to enable it.
INFO:	04:35:18 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:35:18 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:35:18 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/metrics$,/readyz$,/ready$,/health$,/healthz$,/livez$)
INFO:	04:35:18 - uvicorn.error - Started server process [1]
INFO:	04:35:18 - uvicorn.error - Waiting for application startup.
INFO:	04:35:21 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:35:22 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:35:22 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:35:22 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:35:22 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:35:22 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4b071d1415ad1ebea85cea80f4d6fa7b
INFO:	04:35:22 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:35:22 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:35:22 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-21 04:35:22.376614995 [W:onnxruntime:Default, device_discovery.cc:146 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:35:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:35:22,896 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:35:22,897 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:35:22,972 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:35:22,972 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:35:23,015 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:35:23,015 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:35:23 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:35:23 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:35:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 496/770 [00:00<00:00, 4936.64it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4824.88it/s]
INFO:	04:35:23 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:35:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:35:24 - uvicorn.error - Application startup complete.
INFO:	04:35:24 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:35:24 - docling_serve.app - Health check requested
INFO:	04:35:24 - uvicorn.access - 172.17.0.1:41524 - "GET /health HTTP/1.1" 200
INFO:	04:35:24 - docling_serve.app - Health check requested
INFO:	04:35:24 - uvicorn.access - 172.17.0.1:41530 - "GET /health HTTP/1.1" 200
INFO:	04:35:24 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:35:24 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:35:24 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:35:24 - docling_serve.app - [TENANT_ID] Task 8a3c8e63-dfb0-42cb-8118-f30a2eacf0f0 created with tenant_id='default'
INFO:	04:35:24 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8a3c8e63-dfb0-42cb-8118-f30a2eacf0f0
INFO:	04:35:24 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:35:24 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a2e22ed4b71003a02ccc48074bc1ab74
INFO:	04:35:24 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:35:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:35:24,658 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:35:24,658 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:35:24,711 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:35:24,711 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:35:24,777 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:35:24,777 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:35:24 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:35:24 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:35:24 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 476/770 [00:00<00:00, 4755.90it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4907.71it/s]
INFO:	04:35:25 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:35:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:35:25 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:35:26 - docling.document_converter - Going to convert document batch...
INFO:	04:35:26 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash a2e22ed4b71003a02ccc48074bc1ab74
INFO:	04:35:26 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:35:26 - docling.document_converter - Finished converting document file in 0.51 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:655: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:35:26 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:35:26 - docling_jobkit.convert.results - Processed 1 docs in 0.59 seconds.
INFO:	04:35:26 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8a3c8e63-dfb0-42cb-8118-f30a2eacf0f0 in 0.59 seconds
INFO:	04:35:26 - uvicorn.access - 172.17.0.1:41530 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:35:26 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:35:26 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:35:26 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:35:26 - docling_serve.app - [TENANT_ID] Task 1d9bc61a-7579-4366-a4aa-a8a867d609f0 created with tenant_id='default'
INFO:	04:35:26 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 1d9bc61a-7579-4366-a4aa-a8a867d609f0
INFO:	04:35:26 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:35:26 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a2e22ed4b71003a02ccc48074bc1ab74
INFO:	04:35:26 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:35:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:35:26,686 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:35:26,687 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:35:26,738 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:35:26,738 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:35:26,805 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:35:26,805 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:35:26 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:35:26 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:35:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 491/770 [00:00<00:00, 4877.54it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4964.25it/s]
INFO:	04:35:27 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:35:27 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:35:27 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:35:28 - docling.document_converter - Going to convert document batch...
INFO:	04:35:28 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash a2e22ed4b71003a02ccc48074bc1ab74
INFO:	04:35:28 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:35:28 - docling.document_converter - Finished converting document file in 0.48 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:655: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:35:28 - docling_jobkit.convert.results - Processed 1 docs in 0.48 seconds.
INFO:	04:35:28 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 1d9bc61a-7579-4366-a4aa-a8a867d609f0 in 0.48 seconds
INFO:	04:35:28 - uvicorn.access - 172.17.0.1:41530 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:35:28 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:35:28 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:35:28 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:35:28 - docling_serve.app - [TENANT_ID] Task f8487ffa-c010-4ec4-b364-7e121cadb134 created with tenant_id='default'
INFO:	04:35:28 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task f8487ffa-c010-4ec4-b364-7e121cadb134
INFO:	04:35:28 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:35:28 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 78cb5ade368814d0813875c101ee149b
INFO:	04:35:28 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:35:28 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:35:28,705 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:35:28,705 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:35:28,755 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:35:28,756 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:35:29,100 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:35:29,100 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:35:29 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:35:29 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:35:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 478/770 [00:00<00:00, 4776.52it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4880.10it/s]
INFO:	04:35:29 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:35:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:35:30 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:35:30 - docling.document_converter - Going to convert document batch...
INFO:	04:35:30 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 78cb5ade368814d0813875c101ee149b
INFO:	04:35:30 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:35:30 - docling.document_converter - Finished converting document file in 0.35 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:655: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:35:30 - docling_jobkit.convert.results - Processed 1 docs in 0.40 seconds.
INFO:	04:35:30 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job f8487ffa-c010-4ec4-b364-7e121cadb134 in 0.40 seconds
INFO:	04:35:30 - uvicorn.access - 172.17.0.1:41530 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:35:30 - uvicorn.access - 172.17.0.1:41530 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:35:30 - uvicorn.access - 172.17.0.1:41530 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

```

</details>

</details>

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
INFO:	04:33:50 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:33:50 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:33:50 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:33:51 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:33:51 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:33:51 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:33:51 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	04:33:51 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:33:51 - docling_jobkit.connectors.plugins.defaults - Connector 'KafkaTargetProcessor' skipped — optional dependency not installed (No module named 'confluent_kafka'). Install the matching extra to enable it.
INFO:	04:33:51 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:33:51 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:33:51 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/healthz$,/metrics$,/readyz$,/livez$,/health$)
INFO:	04:33:52 - uvicorn.error - Started server process [1]
INFO:	04:33:52 - uvicorn.error - Waiting for application startup.
INFO:	04:33:55 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:33:56 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:33:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:33:56 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:33:56 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:33:56 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 019ac48c98c19d19127e62d9a66de678
INFO:	04:33:56 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:33:56 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:33:56 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-21 04:33:56.564138079 [W:onnxruntime:Default, device_discovery.cc:146 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:33:56 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:33:56,904 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:33:56,906 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:33:56,988 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:33:56,988 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:33:57,078 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:33:57,078 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:33:57 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:33:57 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:33:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|█████▉    | 459/770 [00:00<00:00, 4561.02it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6276.99it/s]
INFO:	04:33:57 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:33:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:33:58 - uvicorn.error - Application startup complete.
INFO:	04:33:58 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:33:59 - docling_serve.app - Health check requested
INFO:	04:33:59 - uvicorn.access - 172.17.0.1:52930 - "GET /health HTTP/1.1" 200
INFO:	04:33:59 - docling_serve.app - Health check requested
INFO:	04:33:59 - uvicorn.access - 172.17.0.1:52932 - "GET /health HTTP/1.1" 200
INFO:	04:33:59 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:33:59 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:33:59 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:33:59 - docling_serve.app - [TENANT_ID] Task 586ad673-fdfb-4e54-a957-f32c6efb56c6 created with tenant_id='default'
INFO:	04:33:59 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 586ad673-fdfb-4e54-a957-f32c6efb56c6
INFO:	04:33:59 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:33:59 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6b5aa9d49bf5933a22591c3559b94bfd
INFO:	04:33:59 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:33:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:33:59,332 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:33:59,332 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:33:59,436 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:33:59,437 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:33:59,520 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:33:59,520 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:33:59 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:33:59 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:33:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 467/770 [00:00<00:00, 4668.09it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4620.43it/s]
INFO:	04:34:00 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:34:00 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:34:01 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:34:01 - docling.document_converter - Going to convert document batch...
INFO:	04:34:01 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 6b5aa9d49bf5933a22591c3559b94bfd
INFO:	04:34:01 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:34:01 - docling.document_converter - Finished converting document file in 0.64 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:645: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:34:01 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:34:01 - docling_jobkit.convert.results - Processed 1 docs in 0.75 seconds.
INFO:	04:34:01 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 586ad673-fdfb-4e54-a957-f32c6efb56c6 in 0.75 seconds
INFO:	04:34:03 - uvicorn.access - 172.17.0.1:52932 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:34:03 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:34:03 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:34:03 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:34:03 - docling_serve.app - [TENANT_ID] Task 18459cfc-f5bf-4141-a100-743079b30224 created with tenant_id='default'
INFO:	04:34:03 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 18459cfc-f5bf-4141-a100-743079b30224
INFO:	04:34:03 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:34:03 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6b5aa9d49bf5933a22591c3559b94bfd
INFO:	04:34:03 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:34:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:34:03,410 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:34:03,410 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:34:03,513 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:34:03,513 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:34:03,595 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:34:03,595 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:34:03 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:34:03 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:34:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 457/770 [00:00<00:00, 4379.36it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6619.46it/s]
INFO:	04:34:04 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:34:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:34:05 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:34:05 - docling.document_converter - Going to convert document batch...
INFO:	04:34:05 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 6b5aa9d49bf5933a22591c3559b94bfd
INFO:	04:34:05 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:34:05 - docling.document_converter - Finished converting document file in 0.57 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:645: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:34:05 - docling_jobkit.convert.results - Processed 1 docs in 0.57 seconds.
INFO:	04:34:05 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 18459cfc-f5bf-4141-a100-743079b30224 in 0.57 seconds
INFO:	04:34:07 - uvicorn.access - 172.17.0.1:52932 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:34:07 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:34:07 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:34:07 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:34:07 - docling_serve.app - [TENANT_ID] Task 7d1d5dba-022e-4320-8f9c-ba961b86d4d6 created with tenant_id='default'
INFO:	04:34:07 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 7d1d5dba-022e-4320-8f9c-ba961b86d4d6
INFO:	04:34:07 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:34:07 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 345bf8d309571831952bb6d347d0f005
INFO:	04:34:07 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:34:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:34:07,423 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:34:07,423 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:34:07,474 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:34:07,474 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:34:07,519 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:34:07,519 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:34:07 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:34:07 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:34:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 469/770 [00:00<00:00, 4679.22it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5197.03it/s]
INFO:	04:34:08 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:34:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:34:09 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:34:09 - docling.document_converter - Going to convert document batch...
INFO:	04:34:09 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 345bf8d309571831952bb6d347d0f005
INFO:	04:34:09 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:34:09 - docling.document_converter - Finished converting document file in 0.46 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:645: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:34:09 - docling_jobkit.convert.results - Processed 1 docs in 0.49 seconds.
INFO:	04:34:09 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 7d1d5dba-022e-4320-8f9c-ba961b86d4d6 in 0.49 seconds
INFO:	04:34:11 - uvicorn.access - 172.17.0.1:52932 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:34:11 - uvicorn.access - 172.17.0.1:52932 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:34:11 - uvicorn.access - 172.17.0.1:52932 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:32:03 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:32:03 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:32:03 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:32:04 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:32:04 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:32:04 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:32:04 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	04:32:04 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:32:04 - docling_jobkit.connectors.plugins.defaults - Connector 'KafkaTargetProcessor' skipped — optional dependency not installed (No module named 'confluent_kafka'). Install the matching extra to enable it.
INFO:	04:32:04 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:32:04 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:32:04 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/health$,/metrics$,/livez$,/healthz$,/readyz$)
INFO:	04:32:04 - uvicorn.error - Started server process [1]
INFO:	04:32:04 - uvicorn.error - Waiting for application startup.
INFO:	04:32:07 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:32:08 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:32:08 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:32:08 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:32:08 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:32:08 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 9d06178a9f1c8aeb9889d1e46440f3fa
INFO:	04:32:08 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:32:08 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:32:08 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-21 04:32:08.390402008 [W:onnxruntime:Default, device_discovery.cc:146 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:32:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:32:08,646 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:32:08,648 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:32:08,700 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:32:08,701 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:32:08,765 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:32:08,766 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:32:08 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:32:08 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:32:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 483/770 [00:00<00:00, 4822.81it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4817.41it/s]
INFO:	04:32:09 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:32:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:32:10 - uvicorn.error - Application startup complete.
INFO:	04:32:10 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:32:10 - docling_serve.app - Health check requested
INFO:	04:32:10 - uvicorn.access - 172.17.0.1:46948 - "GET /health HTTP/1.1" 200
INFO:	04:32:10 - docling_serve.app - Health check requested
INFO:	04:32:10 - uvicorn.access - 172.17.0.1:46956 - "GET /health HTTP/1.1" 200
INFO:	04:32:10 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:32:10 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:32:10 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:32:10 - docling_serve.app - [TENANT_ID] Task 981d9bc4-fe6c-4e67-9180-031177aee1b6 created with tenant_id='default'
INFO:	04:32:10 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 981d9bc4-fe6c-4e67-9180-031177aee1b6
INFO:	04:32:10 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:32:10 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1d02772fb798c5f3e06aa82e0d32e7d
INFO:	04:32:10 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:32:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:32:10,626 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:32:10,627 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:32:10,681 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:32:10,682 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:32:10,723 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:32:10,723 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:32:10 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:32:10 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:32:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▊    | 452/770 [00:00<00:00, 4518.64it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4610.97it/s]
INFO:	04:32:11 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:32:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:32:11 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:32:12 - docling.document_converter - Going to convert document batch...
INFO:	04:32:12 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash a1d02772fb798c5f3e06aa82e0d32e7d
INFO:	04:32:12 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:32:12 - docling.document_converter - Finished converting document file in 0.56 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:641: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:32:12 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:32:12 - docling_jobkit.convert.results - Processed 1 docs in 0.63 seconds.
INFO:	04:32:12 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 981d9bc4-fe6c-4e67-9180-031177aee1b6 in 0.63 seconds
INFO:	04:32:12 - uvicorn.access - 172.17.0.1:46956 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:32:12 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:32:12 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:32:12 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:32:12 - docling_serve.app - [TENANT_ID] Task 53fc9194-92ef-4a27-84fd-c97439f800b3 created with tenant_id='default'
INFO:	04:32:12 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 53fc9194-92ef-4a27-84fd-c97439f800b3
INFO:	04:32:12 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:32:12 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1d02772fb798c5f3e06aa82e0d32e7d
INFO:	04:32:12 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:32:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:32:12,662 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:32:12,662 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:32:12,737 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:32:12,737 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:32:12,781 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:32:12,781 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:32:12 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:32:12 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:32:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 479/770 [00:00<00:00, 4784.89it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4869.11it/s]
INFO:	04:32:13 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:32:13 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:32:14 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:32:14 - docling.document_converter - Going to convert document batch...
INFO:	04:32:14 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash a1d02772fb798c5f3e06aa82e0d32e7d
INFO:	04:32:14 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:32:14 - docling.document_converter - Finished converting document file in 0.51 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:641: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:32:14 - docling_jobkit.convert.results - Processed 1 docs in 0.52 seconds.
INFO:	04:32:14 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 53fc9194-92ef-4a27-84fd-c97439f800b3 in 0.52 seconds
INFO:	04:32:14 - uvicorn.access - 172.17.0.1:46956 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:32:14 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:32:14 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:32:14 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:32:14 - docling_serve.app - [TENANT_ID] Task ce1b6b1f-e175-4a10-8717-c42edfbf2e20 created with tenant_id='default'
INFO:	04:32:14 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task ce1b6b1f-e175-4a10-8717-c42edfbf2e20
INFO:	04:32:14 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:32:14 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 21c1cdafbd5b48f9b0cfcb806e9e9d57
INFO:	04:32:14 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:32:14 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:32:14,681 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:32:14,681 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:32:14,732 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:32:14,733 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:32:14,789 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:32:14,789 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:32:14 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:32:14 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:32:14 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 486/770 [00:00<00:00, 4797.27it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4924.11it/s]
INFO:	04:32:15 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:32:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:32:15 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:32:15 - docling.document_converter - Going to convert document batch...
INFO:	04:32:15 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 21c1cdafbd5b48f9b0cfcb806e9e9d57
INFO:	04:32:15 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:32:15 - docling.document_converter - Finished converting document file in 0.36 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:641: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:32:16 - docling_jobkit.convert.results - Processed 1 docs in 0.41 seconds.
INFO:	04:32:16 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job ce1b6b1f-e175-4a10-8717-c42edfbf2e20 in 0.41 seconds
INFO:	04:32:16 - uvicorn.access - 172.17.0.1:46956 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:32:16 - uvicorn.access - 172.17.0.1:46956 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:32:16 - uvicorn.access - 172.17.0.1:46956 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:30:45 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:30:45 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:30:45 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:30:46 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointSourceProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:30:46 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:30:46 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:30:46 - docling_jobkit.connectors.plugins.defaults - Connector 'AstraDBTargetProcessor' skipped — optional dependency not installed (No module named 'astrapy'). Install the matching extra to enable it.
INFO:	04:30:46 - docling_jobkit.connectors.plugins.defaults - Connector 'SharePointTargetProcessor' skipped — optional dependency not installed (No module named 'office365'). Install the matching extra to enable it.
INFO:	04:30:46 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:30:46 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:30:46 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/healthz$,/readyz$,/ready$,/metrics$,/livez$,/health$)
INFO:	04:30:47 - uvicorn.error - Started server process [1]
INFO:	04:30:47 - uvicorn.error - Waiting for application startup.
INFO:	04:30:50 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:30:51 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:30:51 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:30:51 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:30:51 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:30:51 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e2db689ab35ca52a08b5b7fa25de8cc8
INFO:	04:30:51 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:30:51 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:30:51 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-21 04:30:51.530387931 [W:onnxruntime:Default, device_discovery.cc:134 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:30:51 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:30:51,880 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:30:51,882 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:30:52,000 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:30:52,001 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:30:52,111 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:30:52,111 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:30:52 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:30:52 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:30:52 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[transformers] `torch_dtype` is deprecated! Use `dtype` instead!
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 470/770 [00:00<00:00, 4676.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4738.55it/s]
INFO:	04:30:55 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:30:55 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:30:56 - uvicorn.error - Application startup complete.
INFO:	04:30:56 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:30:57 - docling_serve.app - Health check requested
INFO:	04:30:57 - uvicorn.access - 172.17.0.1:42822 - "GET /health HTTP/1.1" 200
INFO:	04:30:57 - docling_serve.app - Health check requested
INFO:	04:30:57 - uvicorn.access - 172.17.0.1:42826 - "GET /health HTTP/1.1" 200
INFO:	04:30:57 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:30:57 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:30:57 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:30:57 - docling_serve.app - [TENANT_ID] Task 0b8c79be-2eae-4eb3-9100-abb2aafe30cd created with tenant_id='default'
INFO:	04:30:57 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 0b8c79be-2eae-4eb3-9100-abb2aafe30cd
INFO:	04:30:57 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:30:57 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	04:30:57 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:30:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:30:57,269 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:30:57,270 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:30:57,369 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:30:57,369 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:30:57,516 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:30:57,516 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:30:57 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:30:57 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:30:57 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 508/770 [00:00<00:00, 5062.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5018.00it/s]
INFO:	04:30:58 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:30:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:30:59 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:30:59 - docling.document_converter - Going to convert document batch...
INFO:	04:30:59 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	04:30:59 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:30:59 - docling.document_converter - Finished converting document file in 0.75 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:30:59 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:30:59 - docling_jobkit.convert.results - Processed 1 docs in 0.88 seconds.
INFO:	04:30:59 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 0b8c79be-2eae-4eb3-9100-abb2aafe30cd in 0.88 seconds
INFO:	04:31:01 - uvicorn.access - 172.17.0.1:42826 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:31:01 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:31:01 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:31:01 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:31:01 - docling_serve.app - [TENANT_ID] Task 6c803198-c59a-4c92-86f1-b450db20a857 created with tenant_id='default'
INFO:	04:31:01 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 6c803198-c59a-4c92-86f1-b450db20a857
INFO:	04:31:01 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:31:01 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	04:31:01 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:31:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:31:01,282 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:31:01,283 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:31:01,393 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:31:01,393 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:31:01,435 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:31:01,435 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:31:01 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:31:01 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:31:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 519/770 [00:00<00:00, 5178.20it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5659.32it/s]
INFO:	04:31:02 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:31:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:31:03 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:31:03 - docling.document_converter - Going to convert document batch...
INFO:	04:31:03 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 5cd3e3811d2e4d7d996fcfcbbe327b1d
INFO:	04:31:03 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:31:03 - docling.document_converter - Finished converting document file in 0.45 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:31:03 - docling_jobkit.convert.results - Processed 1 docs in 0.46 seconds.
INFO:	04:31:03 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 6c803198-c59a-4c92-86f1-b450db20a857 in 0.46 seconds
INFO:	04:31:05 - uvicorn.access - 172.17.0.1:42826 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:31:05 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:31:05 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:31:05 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:31:05 - docling_serve.app - [TENANT_ID] Task d5b186a1-5f8b-4594-849e-4c8b3957a633 created with tenant_id='default'
INFO:	04:31:05 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task d5b186a1-5f8b-4594-849e-4c8b3957a633
INFO:	04:31:05 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:31:05 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 9df8df3fc03c33cf6e8bd583e67dce64
INFO:	04:31:05 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:31:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:31:05,295 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:31:05,295 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:31:05,356 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:31:05,357 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:31:05,494 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:31:05,495 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/PP-OCRv6_rec_small.onnx
INFO:	04:31:05 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:31:05 - docling.models.inference_engines.object_detection.transformers_engine - Initializing Transformers object-detection engine
INFO:	04:31:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|██████▉   | 536/770 [00:00<00:00, 5322.43it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5295.00it/s]
INFO:	04:31:06 - docling.models.inference_engines.object_detection.transformers_engine - Transformers engine ready (device=cpu, dtype=torch.float32)
INFO:	04:31:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:31:07 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:31:07 - docling.document_converter - Going to convert document batch...
INFO:	04:31:07 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 9df8df3fc03c33cf6e8bd583e67dce64
INFO:	04:31:07 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:31:07 - docling.document_converter - Finished converting document file in 0.54 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:635: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:31:07 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	04:31:07 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job d5b186a1-5f8b-4594-849e-4c8b3957a633 in 0.58 seconds
INFO:	04:31:09 - uvicorn.access - 172.17.0.1:42826 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:31:09 - uvicorn.access - 172.17.0.1:42826 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:31:09 - uvicorn.access - 172.17.0.1:42826 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:29:03 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:29:03 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:29:03 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:29:04 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:29:04 - docling_jobkit.connectors.plugins.defaults - Connector 'OpenSearchTargetProcessor' skipped — optional dependency not installed (No module named 'opensearchpy'). Install the matching extra to enable it.
INFO:	04:29:04 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:29:04 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:29:04 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/health$,/healthz$,/livez$,/metrics$,/ready$)
INFO:	04:29:04 - uvicorn.error - Started server process [1]
INFO:	04:29:04 - uvicorn.error - Waiting for application startup.
INFO:	04:29:07 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:29:07 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:29:07 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:29:07 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:29:07 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:29:07 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash caff667a02b7f037838d32d34acfe0b0
INFO:	04:29:07 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:29:07 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:29:07 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-21 04:29:07.784563311 [W:onnxruntime:Default, device_discovery.cc:134 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:29:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:29:08,047 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:29:08,049 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:29:08,100 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:29:08,101 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:29:08,150 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:29:08,150 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:29:08 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:29:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 491/770 [00:00<00:00, 4906.31it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4935.88it/s]
INFO:	04:29:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:29:09 - uvicorn.error - Application startup complete.
INFO:	04:29:09 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:29:09 - docling_serve.app - Health check requested
INFO:	04:29:09 - uvicorn.access - 172.17.0.1:47816 - "GET /health HTTP/1.1" 200
INFO:	04:29:09 - docling_serve.app - Health check requested
INFO:	04:29:09 - uvicorn.access - 172.17.0.1:47832 - "GET /health HTTP/1.1" 200
INFO:	04:29:09 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:29:09 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:29:09 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:29:09 - docling_serve.app - [TENANT_ID] Task 31de2c40-415a-4c76-8a55-4c4a5b020eb1 created with tenant_id='default'
INFO:	04:29:09 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 31de2c40-415a-4c76-8a55-4c4a5b020eb1
INFO:	04:29:09 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:29:09 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash ab12ef348c8fc273bf2be7a49773b303
INFO:	04:29:09 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:29:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:29:09,728 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:29:09,728 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:29:09,807 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:29:09,807 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:29:09,847 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:29:09,847 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:29:09 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:29:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 499/770 [00:00<00:00, 4981.06it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4972.60it/s]
INFO:	04:29:10 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:29:11 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:29:11 - docling.document_converter - Going to convert document batch...
INFO:	04:29:11 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:29:11 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:29:11 - docling.document_converter - Finished converting document file in 0.51 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:29:11 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:29:11 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	04:29:11 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 31de2c40-415a-4c76-8a55-4c4a5b020eb1 in 0.58 seconds
INFO:	04:29:11 - uvicorn.access - 172.17.0.1:47832 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:29:11 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:29:11 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:29:11 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:29:11 - docling_serve.app - [TENANT_ID] Task 503b2177-fbf5-42db-909d-73af071d3746 created with tenant_id='default'
INFO:	04:29:11 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 503b2177-fbf5-42db-909d-73af071d3746
INFO:	04:29:11 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:29:11 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash ab12ef348c8fc273bf2be7a49773b303
INFO:	04:29:11 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:29:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:29:11,750 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:29:11,750 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:29:11,802 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:29:11,802 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:29:11,846 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:29:11,847 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:29:11 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:29:11 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 532/770 [00:00<00:00, 5273.98it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5211.38it/s]
INFO:	04:29:12 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:29:13 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:29:13 - docling.document_converter - Going to convert document batch...
INFO:	04:29:13 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:29:13 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:29:13 - docling.document_converter - Finished converting document file in 0.47 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:29:13 - docling_jobkit.convert.results - Processed 1 docs in 0.48 seconds.
INFO:	04:29:13 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 503b2177-fbf5-42db-909d-73af071d3746 in 0.48 seconds
INFO:	04:29:13 - uvicorn.access - 172.17.0.1:47832 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:29:13 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:29:13 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:29:13 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:29:13 - docling_serve.app - [TENANT_ID] Task cca403db-9ee8-4298-bf29-725ddf6ea537 created with tenant_id='default'
INFO:	04:29:13 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task cca403db-9ee8-4298-bf29-725ddf6ea537
INFO:	04:29:13 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:29:13 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash b3849eabdc7ecae5f3d54428a0162342
INFO:	04:29:13 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:29:13 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:29:13,760 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:29:13,760 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:29:13,818 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:29:13,819 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:29:13,863 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:29:13,863 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:29:13 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:29:13 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 523/770 [00:00<00:00, 5226.98it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5166.85it/s]
INFO:	04:29:14 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:29:14 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:29:14 - docling.document_converter - Going to convert document batch...
INFO:	04:29:14 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:29:14 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:29:15 - docling.document_converter - Finished converting document file in 0.34 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:632: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:29:15 - docling_jobkit.convert.results - Processed 1 docs in 0.38 seconds.
INFO:	04:29:15 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job cca403db-9ee8-4298-bf29-725ddf6ea537 in 0.38 seconds
INFO:	04:29:15 - uvicorn.access - 172.17.0.1:47832 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:29:15 - uvicorn.access - 172.17.0.1:47832 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:29:15 - uvicorn.access - 172.17.0.1:47832 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:27:50 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:27:50 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:27:50 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:27:51 - docling_jobkit.connectors.connector_factory - Loading connector plugin 'docling_jobkit_defaults'
INFO:	04:27:51 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:27:51 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:27:51 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/metrics$,/livez$,/healthz$,/readyz$,/health$,/ready$)
INFO:	04:27:51 - uvicorn.error - Started server process [1]
INFO:	04:27:51 - uvicorn.error - Waiting for application startup.
INFO:	04:27:57 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:27:57 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:27:57 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:27:57 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:27:57 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:27:57 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	04:27:57 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:27:57 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:27:57 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-21 04:27:57.866052233 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:27:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:27:58,257 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:27:58,259 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:27:58,407 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:27:58,407 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:27:58,496 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:27:58,496 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:27:58 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:27:58 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  43%|████▎     | 332/770 [00:00<00:00, 3293.95it/s]Loading weights:  86%|████████▌ | 662/770 [00:00<00:00, 2863.26it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 3256.71it/s]
INFO:	04:27:59 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:28:01 - uvicorn.error - Application startup complete.
INFO:	04:28:01 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:28:02 - docling_serve.app - Health check requested
INFO:	04:28:02 - uvicorn.access - 172.17.0.1:55736 - "GET /health HTTP/1.1" 200
INFO:	04:28:02 - docling_serve.app - Health check requested
INFO:	04:28:02 - uvicorn.access - 172.17.0.1:55750 - "GET /health HTTP/1.1" 200
INFO:	04:28:02 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:28:02 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:28:02 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:28:02 - docling_serve.app - [TENANT_ID] Task 04d1771c-c43e-4a97-82ac-8fe868815918 created with tenant_id='default'
INFO:	04:28:02 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 04d1771c-c43e-4a97-82ac-8fe868815918
INFO:	04:28:02 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:28:02 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	04:28:02 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:28:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:28:02,364 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:28:02,365 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:28:02,453 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:28:02,454 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:28:02,509 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:28:02,509 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:28:02 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:28:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 514/770 [00:00<00:00, 5136.60it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5216.39it/s]
INFO:	04:28:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:28:04 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:28:04 - docling.document_converter - Going to convert document batch...
INFO:	04:28:04 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:28:04 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:28:04 - docling.document_converter - Finished converting document file in 0.63 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:28:04 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:28:04 - docling_jobkit.convert.results - Processed 1 docs in 0.75 seconds.
INFO:	04:28:04 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 04d1771c-c43e-4a97-82ac-8fe868815918 in 0.75 seconds
INFO:	04:28:06 - uvicorn.access - 172.17.0.1:55750 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:28:06 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:28:06 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:28:06 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:28:06 - docling_serve.app - [TENANT_ID] Task 9ed82124-b06d-438d-83d8-40a20a21b43c created with tenant_id='default'
INFO:	04:28:06 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 9ed82124-b06d-438d-83d8-40a20a21b43c
INFO:	04:28:06 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:28:06 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	04:28:06 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:28:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:28:06,410 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:28:06,410 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:28:06,468 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:28:06,468 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:28:06,547 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:28:06,547 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:28:06 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:28:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|██████▉   | 536/770 [00:00<00:00, 5285.80it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5245.30it/s]
INFO:	04:28:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:28:08 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:28:08 - docling.document_converter - Going to convert document batch...
INFO:	04:28:08 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:28:08 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:28:08 - docling.document_converter - Finished converting document file in 0.57 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:28:08 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	04:28:08 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 9ed82124-b06d-438d-83d8-40a20a21b43c in 0.58 seconds
INFO:	04:28:08 - uvicorn.access - 172.17.0.1:55750 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:28:08 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:28:08 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:28:08 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:28:08 - docling_serve.app - [TENANT_ID] Task 9f068d41-1379-4b27-bf3f-d99ec5c830bb created with tenant_id='default'
INFO:	04:28:08 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 9f068d41-1379-4b27-bf3f-d99ec5c830bb
INFO:	04:28:08 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:28:08 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	04:28:08 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:28:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:28:08,437 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:28:08,437 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:28:08,502 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:28:08,503 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:28:08,627 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:28:08,627 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:28:08 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:28:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 502/770 [00:00<00:00, 4985.27it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5094.12it/s]
INFO:	04:28:09 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:28:10 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:28:10 - docling.document_converter - Going to convert document batch...
INFO:	04:28:10 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:28:10 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:28:10 - docling.document_converter - Finished converting document file in 0.44 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:611: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:28:10 - docling_jobkit.convert.results - Processed 1 docs in 0.50 seconds.
INFO:	04:28:10 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 9f068d41-1379-4b27-bf3f-d99ec5c830bb in 0.50 seconds
INFO:	04:28:12 - uvicorn.access - 172.17.0.1:55750 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:28:12 - uvicorn.access - 172.17.0.1:55750 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:28:12 - uvicorn.access - 172.17.0.1:55750 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:25:57 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:25:57 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:25:57 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:25:57 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:25:57 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/health$,/readyz$,/livez$,/healthz$,/metrics$,/ready$)
INFO:	04:25:58 - uvicorn.error - Started server process [1]
INFO:	04:25:58 - uvicorn.error - Waiting for application startup.
INFO:	04:26:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:26:01 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:26:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:26:01 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:26:01 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:26:01 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 118619a1d3ed3b201b814dac997d6742
INFO:	04:26:01 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:26:01 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:26:01 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-21 04:26:01.743069118 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:26:01 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:26:02,005 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:26:02,007 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:26:02,064 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:26:02,064 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:26:02,115 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:26:02,115 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:26:02 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:26:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 517/770 [00:00<00:00, 5148.63it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5200.98it/s]
INFO:	04:26:02 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:26:03 - uvicorn.error - Application startup complete.
INFO:	04:26:03 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:26:03 - docling_serve.app - Health check requested
INFO:	04:26:03 - uvicorn.access - 172.17.0.1:37924 - "GET /health HTTP/1.1" 200
INFO:	04:26:03 - docling_serve.app - Health check requested
INFO:	04:26:03 - uvicorn.access - 172.17.0.1:37940 - "GET /health HTTP/1.1" 200
INFO:	04:26:03 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:26:03 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:26:03 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:26:03 - docling_serve.app - [TENANT_ID] Task 662f6a73-c439-4aca-a81e-3d8019d8dcf4 created with tenant_id='default'
INFO:	04:26:03 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 662f6a73-c439-4aca-a81e-3d8019d8dcf4
INFO:	04:26:03 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:26:03 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	04:26:03 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:26:03 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:26:03,879 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:26:03,880 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:26:03,939 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:26:03,940 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:26:03,988 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:26:03,988 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:26:04 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:26:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 514/770 [00:00<00:00, 5137.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5097.37it/s]
INFO:	04:26:04 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:26:05 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:26:05 - docling.document_converter - Going to convert document batch...
INFO:	04:26:05 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:26:05 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:26:05 - docling.document_converter - Finished converting document file in 0.38 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:26:05 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:26:05 - docling_jobkit.convert.results - Processed 1 docs in 0.46 seconds.
INFO:	04:26:05 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 662f6a73-c439-4aca-a81e-3d8019d8dcf4 in 0.46 seconds
INFO:	04:26:05 - uvicorn.access - 172.17.0.1:37940 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:26:05 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:26:05 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:26:05 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:26:05 - docling_serve.app - [TENANT_ID] Task 7d4e5e9b-05ce-4e60-855d-05430148041b created with tenant_id='default'
INFO:	04:26:05 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 7d4e5e9b-05ce-4e60-855d-05430148041b
INFO:	04:26:05 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:26:05 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 83f6e7119a1499def48d21cd30b03869
INFO:	04:26:05 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:26:05 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:26:05,893 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:26:05,893 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:26:05,945 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:26:05,946 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:26:06,010 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:26:06,011 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:26:06 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:26:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 504/770 [00:00<00:00, 5018.93it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5156.84it/s]
INFO:	04:26:06 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:26:07 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:26:07 - docling.document_converter - Going to convert document batch...
INFO:	04:26:07 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:26:07 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:26:07 - docling.document_converter - Finished converting document file in 0.35 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:26:07 - docling_jobkit.convert.results - Processed 1 docs in 0.35 seconds.
INFO:	04:26:07 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 7d4e5e9b-05ce-4e60-855d-05430148041b in 0.35 seconds
INFO:	04:26:07 - uvicorn.access - 172.17.0.1:37940 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:26:07 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:26:07 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:26:07 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:26:07 - docling_serve.app - [TENANT_ID] Task 8c09d3e9-ff99-426f-a2a4-a58d72079a4c created with tenant_id='default'
INFO:	04:26:07 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8c09d3e9-ff99-426f-a2a4-a58d72079a4c
INFO:	04:26:07 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:26:07 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 528ff53b5cc66cd5f7f61ef2cd72a8fc
INFO:	04:26:07 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:26:07 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:26:07,913 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:26:07,913 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/det/PP-OCRv6_det_small.onnx
[INFO] 2026-09-21 04:26:07,963 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:26:07,964 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:26:08,034 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:26:08,035 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv6/rec/PP-OCRv6_rec_small.onnx
INFO:	04:26:08 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:26:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 513/770 [00:00<00:00, 5106.90it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5081.06it/s]
INFO:	04:26:08 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:26:09 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:26:09 - docling.document_converter - Going to convert document batch...
INFO:	04:26:09 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:26:09 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:26:09 - docling.document_converter - Finished converting document file in 0.36 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:588: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:26:09 - docling_jobkit.convert.results - Processed 1 docs in 0.40 seconds.
INFO:	04:26:09 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8c09d3e9-ff99-426f-a2a4-a58d72079a4c in 0.40 seconds
INFO:	04:26:09 - uvicorn.access - 172.17.0.1:37940 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:26:10 - uvicorn.access - 172.17.0.1:37940 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:26:10 - uvicorn.access - 172.17.0.1:37940 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:24:26 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:24:26 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'nemotron-ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:24:26 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:24:26 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:24:26 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/healthz$,/ready$,/metrics$,/livez$,/health$)
INFO:	04:24:27 - uvicorn.error - Started server process [1]
INFO:	04:24:27 - uvicorn.error - Waiting for application startup.
INFO:	04:24:30 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:24:30 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:24:30 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:24:30 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:24:30 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:24:30 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c4d6547d10e26a777a530d63ca01a1a1
INFO:	04:24:30 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:24:30 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
INFO:	04:24:30 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
2026-09-21 04:24:30.704712991 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:24:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:24:30,934 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:24:30,935 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:24:31,035 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:24:31,036 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:24:31,082 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:24:31,082 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:24:31 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:24:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 527/770 [00:00<00:00, 5243.53it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5215.51it/s]
INFO:	04:24:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:24:32 - uvicorn.error - Application startup complete.
INFO:	04:24:32 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:24:32 - docling_serve.app - Health check requested
INFO:	04:24:32 - uvicorn.access - 172.17.0.1:45764 - "GET /health HTTP/1.1" 200
INFO:	04:24:32 - docling_serve.app - Health check requested
INFO:	04:24:32 - uvicorn.access - 172.17.0.1:45778 - "GET /health HTTP/1.1" 200
INFO:	04:24:32 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:24:32 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:24:32 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:24:32 - docling_serve.app - [TENANT_ID] Task 8d8ba594-1513-4f80-9070-65fce245d199 created with tenant_id='default'
INFO:	04:24:32 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 8d8ba594-1513-4f80-9070-65fce245d199
INFO:	04:24:32 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:24:32 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	04:24:32 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:24:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:24:32,653 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:24:32,653 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:24:32,757 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:24:32,757 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:24:32,803 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:24:32,803 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:24:32 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:24:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 533/770 [00:00<00:00, 5285.41it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5149.67it/s]
INFO:	04:24:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:24:33 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:24:34 - docling.document_converter - Going to convert document batch...
INFO:	04:24:34 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:24:34 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:24:34 - docling.document_converter - Finished converting document file in 0.50 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
WARNING:	04:24:34 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:24:34 - docling_jobkit.convert.results - Processed 1 docs in 0.58 seconds.
INFO:	04:24:34 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 8d8ba594-1513-4f80-9070-65fce245d199 in 0.58 seconds
INFO:	04:24:34 - uvicorn.access - 172.17.0.1:45778 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:24:34 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:24:34 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:24:34 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:24:34 - docling_serve.app - [TENANT_ID] Task 83c63c64-3c1e-4638-9c8e-d74031eee37d created with tenant_id='default'
INFO:	04:24:34 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 83c63c64-3c1e-4638-9c8e-d74031eee37d
INFO:	04:24:34 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:24:34 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 4ef9920c0fc80ed745870d6025fc17ac
INFO:	04:24:34 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:24:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:24:34,678 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:24:34,678 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:24:34,792 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:24:34,792 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:24:34,851 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:24:34,851 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:24:34 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:24:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 511/770 [00:00<00:00, 5036.98it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5138.57it/s]
INFO:	04:24:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:24:36 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:24:36 - docling.document_converter - Going to convert document batch...
INFO:	04:24:36 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:24:36 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:24:36 - docling.document_converter - Finished converting document file in 0.79 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:24:36 - docling_jobkit.convert.results - Processed 1 docs in 0.79 seconds.
INFO:	04:24:36 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 83c63c64-3c1e-4638-9c8e-d74031eee37d in 0.79 seconds
INFO:	04:24:36 - uvicorn.access - 172.17.0.1:45778 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:24:36 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:24:36 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:24:36 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:24:36 - docling_serve.app - [TENANT_ID] Task 6ec353fc-9c4a-43e4-81d0-3963c4e1a084 created with tenant_id='default'
INFO:	04:24:36 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 6ec353fc-9c4a-43e4-81d0-3963c4e1a084
INFO:	04:24:36 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:24:36 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 63e8839d1103b03d45382915dba33c89
INFO:	04:24:36 - docling.models.stages.ocr.auto_ocr_model - Nemotron cannot be used because it is not installed.
INFO:	04:24:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:24:36,713 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:24:36,713 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:24:36,816 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:24:36,816 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:24:36,864 [RapidOCR] base.py:23: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:24:36,864 [RapidOCR] main.py:63: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:24:36 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:24:36 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|███████   | 539/770 [00:00<00:00, 5387.22it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5223.29it/s]
INFO:	04:24:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:24:37 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:24:38 - docling.document_converter - Going to convert document batch...
INFO:	04:24:38 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:24:38 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:24:38 - docling.document_converter - Finished converting document file in 0.47 sec.
/opt/app-root/lib64/python3.12/site-packages/docling/datamodel/base_models.py:556: RuntimeWarning: Mean of empty slice
  np.nanmean(
/opt/app-root/lib64/python3.12/site-packages/numpy/lib/_nanfunctions_impl.py:1573: RuntimeWarning: All-NaN slice encountered
  return _nanquantile_unchecked(
INFO:	04:24:38 - docling_jobkit.convert.results - Processed 1 docs in 0.51 seconds.
INFO:	04:24:38 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 6ec353fc-9c4a-43e4-81d0-3963c4e1a084 in 0.51 seconds
INFO:	04:24:38 - uvicorn.access - 172.17.0.1:45778 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:24:38 - uvicorn.access - 172.17.0.1:45778 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:24:38 - uvicorn.access - 172.17.0.1:45778 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:23:08 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:23:08 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:23:08 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:23:08 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:23:08 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/ready$,/health$,/healthz$,/readyz$,/livez$,/metrics$)
INFO:	04:23:08 - uvicorn.error - Started server process [1]
INFO:	04:23:08 - uvicorn.error - Waiting for application startup.
INFO:	04:23:14 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:23:14 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:23:14 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:23:14 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:23:14 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:23:14 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash f446dcc5a1a7c6aff458e30cab474a9e
INFO:	04:23:14 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:23:14 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-21 04:23:14.900228210 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:23:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:23:15,365 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:23:15,367 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:23:15,533 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:23:15,534 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:23:15,619 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:23:15,619 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:23:15 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:23:15 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  44%|████▍     | 341/770 [00:00<00:00, 3340.95it/s]Loading weights:  88%|████████▊ | 676/770 [00:00<00:00, 961.41it/s] Loading weights: 100%|██████████| 770/770 [00:00<00:00, 1176.86it/s]
INFO:	04:23:17 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:23:20 - uvicorn.error - Application startup complete.
INFO:	04:23:20 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:23:21 - docling_serve.app - Health check requested
INFO:	04:23:21 - uvicorn.access - 172.17.0.1:57510 - "GET /health HTTP/1.1" 200
INFO:	04:23:21 - docling_serve.app - Health check requested
INFO:	04:23:21 - uvicorn.access - 172.17.0.1:57512 - "GET /health HTTP/1.1" 200
INFO:	04:23:21 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:23:21 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:23:21 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:23:21 - docling_serve.app - [TENANT_ID] Task 0db4b80d-71f1-40dc-84c3-b56a4bbe6c4f created with tenant_id='default'
INFO:	04:23:21 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 0db4b80d-71f1-40dc-84c3-b56a4bbe6c4f
INFO:	04:23:21 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:23:21 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	04:23:21 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:23:21,660 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:23:21,660 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:23:21,816 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:23:21,816 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:23:21,907 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:23:21,907 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:23:22 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:23:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 503/770 [00:00<00:00, 5013.44it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6506.70it/s]
INFO:	04:23:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:23:23 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:23:23 - docling.document_converter - Going to convert document batch...
INFO:	04:23:23 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:23:23 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:23:23 - docling.document_converter - Finished converting document file in 0.72 sec.
WARNING:	04:23:23 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:23:23 - docling_jobkit.convert.results - Processed 1 docs in 0.83 seconds.
INFO:	04:23:23 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 0db4b80d-71f1-40dc-84c3-b56a4bbe6c4f in 0.83 seconds
INFO:	04:23:25 - uvicorn.access - 172.17.0.1:57512 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:23:25 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:23:25 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:23:25 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:23:25 - docling_serve.app - [TENANT_ID] Task c7e5166c-78ed-4834-82ee-e8eec29294d8 created with tenant_id='default'
INFO:	04:23:25 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task c7e5166c-78ed-4834-82ee-e8eec29294d8
INFO:	04:23:25 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:23:25 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c639c48e78aacd42b6243acf42ab1c3a
INFO:	04:23:25 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:23:25,699 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:23:25,699 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:23:25,865 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:23:25,865 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:23:25,916 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:23:25,917 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:23:26 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:23:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 470/770 [00:00<00:00, 4691.05it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4730.52it/s]
INFO:	04:23:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:23:27 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:23:27 - docling.document_converter - Going to convert document batch...
INFO:	04:23:27 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:23:27 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:23:28 - docling.document_converter - Finished converting document file in 0.65 sec.
INFO:	04:23:28 - docling_jobkit.convert.results - Processed 1 docs in 0.65 seconds.
INFO:	04:23:28 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job c7e5166c-78ed-4834-82ee-e8eec29294d8 in 0.65 seconds
INFO:	04:23:29 - uvicorn.access - 172.17.0.1:57512 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:23:29 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:23:29 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:23:29 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:23:29 - docling_serve.app - [TENANT_ID] Task 247798bf-1402-49ba-9a23-c6eb6a54d18c created with tenant_id='default'
INFO:	04:23:29 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 247798bf-1402-49ba-9a23-c6eb6a54d18c
INFO:	04:23:29 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:23:29 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash e50b6140ec7ee9be0d0fea6ba20c9795
INFO:	04:23:29 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:23:29,682 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:23:29,682 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:23:29,832 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:23:29,832 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:23:29,925 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:23:29,925 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:23:30 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:23:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 482/770 [00:00<00:00, 4818.26it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4911.45it/s]
INFO:	04:23:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:23:31 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:23:31 - docling.document_converter - Going to convert document batch...
INFO:	04:23:31 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:23:31 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:23:31 - docling.document_converter - Finished converting document file in 0.43 sec.
INFO:	04:23:31 - docling_jobkit.convert.results - Processed 1 docs in 0.49 seconds.
INFO:	04:23:31 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 247798bf-1402-49ba-9a23-c6eb6a54d18c in 0.49 seconds
INFO:	04:23:31 - uvicorn.access - 172.17.0.1:57512 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:23:31 - uvicorn.access - 172.17.0.1:57512 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:23:31 - uvicorn.access - 172.17.0.1:57512 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:21:28 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:21:28 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:21:28 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:21:28 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:21:28 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/health$,/ready$,/metrics$,/healthz$,/readyz$)
INFO:	04:21:28 - uvicorn.error - Started server process [1]
INFO:	04:21:28 - uvicorn.error - Waiting for application startup.
INFO:	04:21:32 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:21:32 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:21:32 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:21:32 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:21:32 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:21:32 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	04:21:32 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:21:32 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-21 04:21:32.215245966 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:21:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:21:32,526 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:21:32,527 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:21:32,630 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:21:32,630 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:21:32,679 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:21:32,680 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:21:32 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:21:32 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 515/770 [00:00<00:00, 5106.09it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5100.93it/s]
INFO:	04:21:33 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:21:33 - uvicorn.error - Application startup complete.
INFO:	04:21:33 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:21:34 - docling_serve.app - Health check requested
INFO:	04:21:34 - uvicorn.access - 172.17.0.1:56374 - "GET /health HTTP/1.1" 200
INFO:	04:21:34 - docling_serve.app - Health check requested
INFO:	04:21:34 - uvicorn.access - 172.17.0.1:56384 - "GET /health HTTP/1.1" 200
INFO:	04:21:34 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:21:34 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:21:34 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:21:34 - docling_serve.app - [TENANT_ID] Task 6da388e5-c36b-4efb-acd0-a8fba16d65d8 created with tenant_id='default'
INFO:	04:21:34 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 6da388e5-c36b-4efb-acd0-a8fba16d65d8
INFO:	04:21:34 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:21:34 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:21:34 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:21:34,763 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:21:34,763 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:21:34,878 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:21:34,878 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:21:34,927 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:21:34,927 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:21:35 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:21:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 514/770 [00:00<00:00, 5138.25it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5177.07it/s]
INFO:	04:21:35 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:21:36 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:21:36 - docling.document_converter - Going to convert document batch...
INFO:	04:21:36 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:21:36 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:21:36 - docling.document_converter - Finished converting document file in 0.53 sec.
WARNING:	04:21:36 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:21:36 - docling_jobkit.convert.results - Processed 1 docs in 0.60 seconds.
INFO:	04:21:36 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 6da388e5-c36b-4efb-acd0-a8fba16d65d8 in 0.60 seconds
INFO:	04:21:36 - uvicorn.access - 172.17.0.1:56384 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:21:36 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:21:36 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:21:36 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:21:36 - docling_serve.app - [TENANT_ID] Task 9dcfabb4-5e2b-4f85-811a-fb67e0d30ebf created with tenant_id='default'
INFO:	04:21:36 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 9dcfabb4-5e2b-4f85-811a-fb67e0d30ebf
INFO:	04:21:36 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:21:37 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:21:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:21:37,061 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:21:37,061 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:21:37,166 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:21:37,166 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:21:37,213 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:21:37,213 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:21:37 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:21:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 511/770 [00:00<00:00, 5101.18it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5213.12it/s]
INFO:	04:21:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:21:38 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:21:38 - docling.document_converter - Going to convert document batch...
INFO:	04:21:38 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:21:38 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:21:38 - docling.document_converter - Finished converting document file in 0.47 sec.
INFO:	04:21:38 - docling_jobkit.convert.results - Processed 1 docs in 0.48 seconds.
INFO:	04:21:38 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 9dcfabb4-5e2b-4f85-811a-fb67e0d30ebf in 0.48 seconds
INFO:	04:21:38 - uvicorn.access - 172.17.0.1:56384 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:21:39 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:21:39 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:21:39 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:21:39 - docling_serve.app - [TENANT_ID] Task 30aeef96-6f6d-4a2e-b2bd-c9f515dea9ad created with tenant_id='default'
INFO:	04:21:39 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 30aeef96-6f6d-4a2e-b2bd-c9f515dea9ad
INFO:	04:21:39 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:21:39 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	04:21:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:21:39,103 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:21:39,104 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:21:39,194 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:21:39,194 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:21:39,262 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:21:39,262 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:21:39 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:21:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 504/770 [00:00<00:00, 5037.21it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5129.27it/s]
INFO:	04:21:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:21:40 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:21:40 - docling.document_converter - Going to convert document batch...
INFO:	04:21:40 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:21:40 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:21:40 - docling.document_converter - Finished converting document file in 0.35 sec.
INFO:	04:21:40 - docling_jobkit.convert.results - Processed 1 docs in 0.39 seconds.
INFO:	04:21:40 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 30aeef96-6f6d-4a2e-b2bd-c9f515dea9ad in 0.39 seconds
INFO:	04:21:41 - uvicorn.access - 172.17.0.1:56384 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:21:41 - uvicorn.access - 172.17.0.1:56384 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:21:41 - uvicorn.access - 172.17.0.1:56384 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:20:13 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:20:13 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:20:13 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:20:13 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:20:13 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/metrics$,/ready$,/healthz$,/livez$,/health$,/readyz$)
INFO:	04:20:14 - uvicorn.error - Started server process [1]
INFO:	04:20:14 - uvicorn.error - Waiting for application startup.
INFO:	04:20:18 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:20:18 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:20:18 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:20:18 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:20:18 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:20:18 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	04:20:18 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:20:18 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-21 04:20:19.043992225 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:20:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:20:19,463 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:20:19,464 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:20:19,614 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:20:19,615 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:20:19,689 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:20:19,690 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:20:19 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:20:19 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  88%|████████▊ | 678/770 [00:00<00:00, 6778.54it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7400.26it/s]
INFO:	04:20:20 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:20:21 - uvicorn.error - Application startup complete.
INFO:	04:20:21 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:20:22 - docling_serve.app - Health check requested
INFO:	04:20:22 - uvicorn.access - 172.17.0.1:37086 - "GET /health HTTP/1.1" 200
INFO:	04:20:22 - docling_serve.app - Health check requested
INFO:	04:20:22 - uvicorn.access - 172.17.0.1:37102 - "GET /health HTTP/1.1" 200
INFO:	04:20:22 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:20:22 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:20:22 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:20:22 - docling_serve.app - [TENANT_ID] Task 69e95517-ebd1-4730-88eb-bc3db4c90e0b created with tenant_id='default'
INFO:	04:20:22 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 69e95517-ebd1-4730-88eb-bc3db4c90e0b
INFO:	04:20:22 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:20:22 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:20:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:20:22,144 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:20:22,144 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:20:22,279 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:20:22,280 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:20:22,410 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:20:22,410 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:20:22 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:20:22 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  74%|███████▍  | 569/770 [00:00<00:00, 5649.53it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5630.34it/s]
INFO:	04:20:23 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:20:24 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:20:24 - docling.document_converter - Going to convert document batch...
INFO:	04:20:24 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:20:24 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:20:24 - docling.document_converter - Finished converting document file in 0.65 sec.
WARNING:	04:20:24 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:20:24 - docling_jobkit.convert.results - Processed 1 docs in 0.77 seconds.
INFO:	04:20:24 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 69e95517-ebd1-4730-88eb-bc3db4c90e0b in 0.77 seconds
INFO:	04:20:26 - uvicorn.access - 172.17.0.1:37102 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:20:26 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:20:26 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:20:26 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:20:26 - docling_serve.app - [TENANT_ID] Task 0502109f-cd6b-451c-ae42-cf5803f7a004 created with tenant_id='default'
INFO:	04:20:26 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 0502109f-cd6b-451c-ae42-cf5803f7a004
INFO:	04:20:26 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:20:26 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 447bb8cb2d04f05cb199adb5a03148da
INFO:	04:20:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:20:26,520 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:20:26,521 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:20:26,700 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:20:26,700 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:20:26,770 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:20:26,770 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:20:26 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:20:26 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 519/770 [00:00<00:00, 5185.34it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5927.64it/s]
INFO:	04:20:27 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:20:28 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:20:28 - docling.document_converter - Going to convert document batch...
INFO:	04:20:28 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:20:28 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:20:28 - docling.document_converter - Finished converting document file in 0.36 sec.
INFO:	04:20:28 - docling_jobkit.convert.results - Processed 1 docs in 0.36 seconds.
INFO:	04:20:28 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 0502109f-cd6b-451c-ae42-cf5803f7a004 in 0.36 seconds
INFO:	04:20:30 - uvicorn.access - 172.17.0.1:37102 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:20:30 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:20:30 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:20:30 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:20:30 - docling_serve.app - [TENANT_ID] Task 9de1741d-88e4-4e9a-8d9c-16e196ad9f69 created with tenant_id='default'
INFO:	04:20:30 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 9de1741d-88e4-4e9a-8d9c-16e196ad9f69
INFO:	04:20:30 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:20:30 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 6102b5a2a09ce02f29b31fc27cc3d04f
INFO:	04:20:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:20:30,197 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:20:30,197 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:20:30,375 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:20:30,376 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:20:30,463 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:20:30,464 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:20:30 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:20:30 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  54%|█████▍    | 414/770 [00:00<00:00, 4137.39it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5046.94it/s]
INFO:	04:20:31 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:20:31 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:20:32 - docling.document_converter - Going to convert document batch...
INFO:	04:20:32 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:20:32 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:20:32 - docling.document_converter - Finished converting document file in 0.59 sec.
INFO:	04:20:32 - docling_jobkit.convert.results - Processed 1 docs in 0.63 seconds.
INFO:	04:20:32 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 9de1741d-88e4-4e9a-8d9c-16e196ad9f69 in 0.63 seconds
INFO:	04:20:34 - uvicorn.access - 172.17.0.1:37102 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:20:34 - uvicorn.access - 172.17.0.1:37102 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:20:34 - uvicorn.access - 172.17.0.1:37102 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:18:40 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:18:40 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:18:40 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:18:40 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:18:40 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/livez$,/healthz$,/readyz$,/health$,/ready$,/metrics$)
INFO:	04:18:40 - uvicorn.error - Started server process [1]
INFO:	04:18:40 - uvicorn.error - Waiting for application startup.
INFO:	04:18:44 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:18:44 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:18:44 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:18:44 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:18:44 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:18:44 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 1743cd6dac10356c82ba7dfffff4ed02
INFO:	04:18:44 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:18:44 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-21 04:18:44.177466241 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:18:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:18:44,478 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:18:44,479 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:18:44,575 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:18:44,575 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:18:44,620 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:18:44,620 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:18:44 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:18:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 491/770 [00:00<00:00, 4900.70it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4964.02it/s]
INFO:	04:18:45 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:18:45 - uvicorn.error - Application startup complete.
INFO:	04:18:45 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:18:46 - docling_serve.app - Health check requested
INFO:	04:18:46 - uvicorn.access - 172.17.0.1:47856 - "GET /health HTTP/1.1" 200
INFO:	04:18:46 - docling_serve.app - Health check requested
INFO:	04:18:46 - uvicorn.access - 172.17.0.1:47858 - "GET /health HTTP/1.1" 200
INFO:	04:18:46 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:18:46 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:18:46 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:18:46 - docling_serve.app - [TENANT_ID] Task 1af72347-1cbf-40bf-a92d-03bf3d3a8882 created with tenant_id='default'
INFO:	04:18:46 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 1af72347-1cbf-40bf-a92d-03bf3d3a8882
INFO:	04:18:46 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:18:46 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	04:18:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:18:46,299 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:18:46,300 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:18:46,404 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:18:46,404 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:18:46,468 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:18:46,468 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:18:46 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:18:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 531/770 [00:00<00:00, 5171.04it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5280.91it/s]
INFO:	04:18:46 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:18:47 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:18:47 - docling.document_converter - Going to convert document batch...
INFO:	04:18:47 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:18:47 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:18:47 - docling.document_converter - Finished converting document file in 0.37 sec.
WARNING:	04:18:47 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:18:47 - docling_jobkit.convert.results - Processed 1 docs in 0.44 seconds.
INFO:	04:18:47 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 1af72347-1cbf-40bf-a92d-03bf3d3a8882 in 0.44 seconds
INFO:	04:18:48 - uvicorn.access - 172.17.0.1:47858 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:18:48 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:18:48 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:18:48 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:18:48 - docling_serve.app - [TENANT_ID] Task f21c3cd1-15b7-4319-ae90-aa0277ad9322 created with tenant_id='default'
INFO:	04:18:48 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task f21c3cd1-15b7-4319-ae90-aa0277ad9322
INFO:	04:18:48 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:18:48 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash a1cb01c48360ff351eb870dc682aac59
INFO:	04:18:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:18:48,326 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:18:48,326 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:18:48,425 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:18:48,425 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:18:48,472 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:18:48,472 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:18:48 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:18:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 513/770 [00:00<00:00, 5105.82it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5013.84it/s]
INFO:	04:18:49 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:18:49 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:18:50 - docling.document_converter - Going to convert document batch...
INFO:	04:18:50 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:18:50 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:18:50 - docling.document_converter - Finished converting document file in 0.47 sec.
INFO:	04:18:50 - docling_jobkit.convert.results - Processed 1 docs in 0.48 seconds.
INFO:	04:18:50 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job f21c3cd1-15b7-4319-ae90-aa0277ad9322 in 0.48 seconds
INFO:	04:18:50 - uvicorn.access - 172.17.0.1:47858 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:18:50 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:18:50 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:18:50 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:18:50 - docling_serve.app - [TENANT_ID] Task 35f03b1e-0154-456f-8d49-a02e06a9b878 created with tenant_id='default'
INFO:	04:18:50 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 35f03b1e-0154-456f-8d49-a02e06a9b878
INFO:	04:18:50 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:18:50 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash fb1751b09de6bdbe35ede48676ca8f82
INFO:	04:18:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:18:50,335 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:18:50,336 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:18:50,449 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:18:50,450 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:18:50,496 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:18:50,496 [RapidOCR] main.py:65: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:18:50 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:18:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 492/770 [00:00<00:00, 4906.21it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4857.56it/s]
INFO:	04:18:50 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:18:51 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:18:51 - docling.document_converter - Going to convert document batch...
INFO:	04:18:51 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:18:51 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:18:51 - docling.document_converter - Finished converting document file in 0.49 sec.
INFO:	04:18:51 - docling_jobkit.convert.results - Processed 1 docs in 0.54 seconds.
INFO:	04:18:51 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 35f03b1e-0154-456f-8d49-a02e06a9b878 in 0.54 seconds
INFO:	04:18:52 - uvicorn.access - 172.17.0.1:47858 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:18:52 - uvicorn.access - 172.17.0.1:47858 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:18:52 - uvicorn.access - 172.17.0.1:47858 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
INFO:	04:17:30 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:17:30 - docling.models.factories - Registered ocr engines: ['auto', 'easyocr', 'kserve_v2_ocr', 'ocrmac', 'rapidocr', 'tesserocr', 'tesseract']
INFO:	04:17:30 - docling_serve.otel_instrumentation - Setting up OpenTelemetry metrics
INFO:	04:17:30 - docling_serve.otel_instrumentation - Enabling Prometheus metrics export
INFO:	04:17:30 - docling_serve.otel_instrumentation - Instrumenting FastAPI with OpenTelemetry (excluded_urls=/readyz$,/healthz$,/livez$,/metrics$,/ready$,/health$)
INFO:	04:17:30 - uvicorn.error - Started server process [1]
INFO:	04:17:30 - uvicorn.error - Waiting for application startup.
INFO:	04:17:36 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:17:36 - docling.models.factories - Registered table structure engines: ['docling_tableformer', 'docling_tableformer_v2', 'granite_vision_table']
INFO:	04:17:36 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:17:36 - docling.models.factories - Registered layout engines: ['layout_object_detection', 'docling_layout_default', 'docling_experimental_table_crops_layout']
INFO:	04:17:36 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:17:36 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash bcb2e23b24bd94a42b5c00d662a7c1cf
INFO:	04:17:36 - docling.models.factories.base_factory - Loading plugin 'docling_defaults'
INFO:	04:17:36 - docling.models.factories - Registered picture descriptions: ['picture_description_vlm_engine', 'vlm', 'api']
2026-09-21 04:17:36.851355374 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
INFO:	04:17:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:17:37,311 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:17:37,313 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:17:37,493 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:17:37,494 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:17:37,579 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:17:37,583 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:17:37 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:17:37 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 497/770 [00:00<00:00, 4949.61it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5442.87it/s]
INFO:	04:17:38 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:17:39 - uvicorn.error - Application startup complete.
INFO:	04:17:39 - uvicorn.error - Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:	04:17:39 - docling_serve.app - Health check requested
INFO:	04:17:39 - uvicorn.access - 172.17.0.1:42472 - "GET /health HTTP/1.1" 200
INFO:	04:17:39 - docling_serve.app - Health check requested
INFO:	04:17:39 - uvicorn.access - 172.17.0.1:42474 - "GET /health HTTP/1.1" 200
INFO:	04:17:39 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:17:39 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:17:39 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:17:39 - docling_serve.app - [TENANT_ID] Task 74821385-46a0-455c-a8cc-b195db55fddf created with tenant_id='default'
INFO:	04:17:39 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 74821385-46a0-455c-a8cc-b195db55fddf
INFO:	04:17:39 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:17:39 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	04:17:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:17:39,506 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:17:39,507 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:17:39,630 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:17:39,631 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:17:39,680 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:17:39,681 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:17:39 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:17:39 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 498/770 [00:00<00:00, 4967.20it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5081.46it/s]
INFO:	04:17:40 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:17:41 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:17:41 - docling.document_converter - Going to convert document batch...
INFO:	04:17:41 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:17:41 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:17:41 - docling.document_converter - Finished converting document file in 0.61 sec.
WARNING:	04:17:41 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
INFO:	04:17:41 - docling_jobkit.convert.results - Processed 1 docs in 1.01 seconds.
INFO:	04:17:41 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 74821385-46a0-455c-a8cc-b195db55fddf in 1.01 seconds
INFO:	04:17:43 - uvicorn.access - 172.17.0.1:42474 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:17:43 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:17:43 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:17:43 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:17:43 - docling_serve.app - [TENANT_ID] Task 790f4f2c-48de-43e8-852f-6eb7de1ff8c5 created with tenant_id='default'
INFO:	04:17:43 - docling_jobkit.orchestrators.local.worker - Worker 1 processing task 790f4f2c-48de-43e8-852f-6eb7de1ff8c5
INFO:	04:17:43 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:17:43 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash c835e945376007df084ecda847e91f5b
INFO:	04:17:43 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:17:43,856 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:17:43,856 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:17:44,004 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:17:44,004 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:17:44,056 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:17:44,057 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:17:44 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:17:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 447/770 [00:00<00:00, 4456.60it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5090.73it/s]
INFO:	04:17:44 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:17:46 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:17:46 - docling.document_converter - Going to convert document batch...
INFO:	04:17:46 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:17:46 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:17:46 - docling.document_converter - Finished converting document file in 0.42 sec.
INFO:	04:17:46 - docling_jobkit.convert.results - Processed 1 docs in 0.44 seconds.
INFO:	04:17:46 - docling_jobkit.orchestrators.local.worker - Worker 1 completed job 790f4f2c-48de-43e8-852f-6eb7de1ff8c5 in 0.44 seconds
INFO:	04:17:47 - uvicorn.access - 172.17.0.1:42474 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:17:47 - docling_serve.app - [TENANT_ID] Extracted tenant_id from header: 'default' (header_value: 'None')
INFO:	04:17:47 - docling_serve.app - [TENANT_ID] process_url endpoint received tenant_id='default'
INFO:	04:17:47 - docling_serve.app - [TENANT_ID] Preparing to enqueue with tenant_id='default' in metadata
INFO:	04:17:47 - docling_serve.app - [TENANT_ID] Task 73393eb0-5074-4be7-b168-5088c1210e15 created with tenant_id='default'
INFO:	04:17:47 - docling_jobkit.orchestrators.local.worker - Worker 0 processing task 73393eb0-5074-4be7-b168-5088c1210e15
INFO:	04:17:47 - docling_jobkit.convert.manager - artifacts_path is set to a valid directory. No model weights will be downloaded at runtime.
INFO:	04:17:47 - docling.document_converter - Initializing pipeline for StandardPdfPipeline with options hash 3eabf304acb4a56e9ef52b02ef69bccb
INFO:	04:17:47 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
[INFO] 2026-09-21 04:17:47,928 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:17:47,928 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:17:48,087 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:17:48,087 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:17:48,138 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:17:48,138 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
INFO:	04:17:48 - docling.models.stages.ocr.auto_ocr_model - Auto OCR model selected rapidocr with onnxruntime.
INFO:	04:17:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 522/770 [00:00<00:00, 5217.87it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6047.47it/s]
INFO:	04:17:48 - docling.utils.accelerator_utils - Accelerator device: 'cpu'
INFO:	04:17:49 - docling.datamodel.document - detected formats: [<InputFormat.HTML: 'html'>]
INFO:	04:17:49 - docling.document_converter - Going to convert document batch...
INFO:	04:17:49 - docling.document_converter - Initializing pipeline for SimplePipeline with options hash 7d306d2d021deac65a97d1a5f925362a
INFO:	04:17:49 - docling.pipeline.base_pipeline - Processing document file
INFO:	04:17:49 - docling.document_converter - Finished converting document file in 0.42 sec.
INFO:	04:17:49 - docling_jobkit.convert.results - Processed 1 docs in 0.49 seconds.
INFO:	04:17:49 - docling_jobkit.orchestrators.local.worker - Worker 0 completed job 73393eb0-5074-4be7-b168-5088c1210e15 in 0.49 seconds
INFO:	04:17:51 - uvicorn.access - 172.17.0.1:42474 - "POST /v1/convert/source HTTP/1.1" 200
INFO:	04:17:52 - uvicorn.access - 172.17.0.1:42474 - "GET /v1/clear/converters HTTP/1.1" 200
INFO:	04:17:52 - uvicorn.access - 172.17.0.1:42474 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200

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
2026-09-21 04:15:39.514006660 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 04:15:39,840 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:15:39,842 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:15:39,936 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:15:39,936 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:15:39,983 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:15:39,983 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 523/770 [00:00<00:00, 5226.98it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5313.57it/s]
[INFO] 2026-09-21 04:15:41,687 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:15:41,687 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:15:41,785 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:15:41,785 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:15:41,833 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:15:41,834 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 504/770 [00:00<00:00, 5031.56it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5053.43it/s]
WARNING:	04:15:43 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
WARNING:	04:15:43 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
[INFO] 2026-09-21 04:15:43,983 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:15:43,984 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:15:44,081 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:15:44,082 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:15:44,134 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:15:44,134 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 515/770 [00:00<00:00, 5145.74it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5099.89it/s]
[INFO] 2026-09-21 04:15:45,718 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:15:45,718 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:15:45,844 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:15:45,844 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:15:45,891 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:15:45,892 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 534/770 [00:00<00:00, 5337.74it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5257.47it/s]

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
2026-09-21 04:14:46.065150666 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 04:14:46,539 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:14:46,542 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:14:46,690 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:14:46,690 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:14:46,739 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:14:46,740 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 504/770 [00:00<00:00, 5034.66it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5670.52it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50178 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50190 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:14:49,138 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:14:49,138 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:14:49,271 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:14:49,271 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:14:49,318 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:14:49,319 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████▏   | 473/770 [00:00<00:00, 4708.51it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4849.92it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50190 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:14:53,171 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:14:53,171 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:14:53,303 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:14:53,303 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:14:53,396 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:14:53,396 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  52%|█████▏    | 404/770 [00:00<00:00, 4029.06it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6324.05it/s]
INFO:     172.17.0.1:50190 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:14:57,190 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:14:57,190 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:14:57,350 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:14:57,350 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:14:57,441 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:14:57,441 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 7706.53it/s]
INFO:     172.17.0.1:50190 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50190 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50190 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-21 04:12:44.771904728 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 04:12:45,062 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:45,064 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:12:45,161 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:45,161 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:12:45,206 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:45,206 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 506/770 [00:00<00:00, 4998.91it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5178.94it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46726 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46742 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:12:46,819 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:46,819 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:12:46,920 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:46,920 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:12:46,986 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:46,987 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  57%|█████▋    | 442/770 [00:00<00:00, 4417.19it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4705.70it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46742 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:12:48,838 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:48,838 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:12:48,935 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:48,935 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:12:48,981 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:48,981 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 509/770 [00:00<00:00, 5085.45it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5156.75it/s]
INFO:     172.17.0.1:46742 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:12:50,855 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:50,856 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:12:50,945 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:50,945 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:12:50,998 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:50,999 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 499/770 [00:00<00:00, 4987.97it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5006.34it/s]
INFO:     172.17.0.1:46742 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46742 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46742 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-21 04:11:56.354938085 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 04:11:56,799 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:11:56,801 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:11:56,928 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:11:56,929 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:11:56,975 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:11:56,975 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▊    | 451/770 [00:00<00:00, 4505.34it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4398.46it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57264 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57272 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:11:58,832 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:11:58,832 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:11:58,927 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:11:58,927 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:11:58,971 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:11:58,971 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  73%|███████▎  | 561/770 [00:00<00:00, 5472.03it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5635.80it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57272 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:12:00,821 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:00,821 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:12:00,931 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:00,932 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:12:01,012 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:01,012 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  75%|███████▍  | 576/770 [00:00<00:00, 5758.34it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6928.85it/s]
INFO:     172.17.0.1:57272 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:12:04,864 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:04,865 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:12:04,986 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:04,986 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:12:05,057 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:12:05,057 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  56%|█████▌    | 431/770 [00:00<00:00, 4286.31it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4459.89it/s]
INFO:     172.17.0.1:57272 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57272 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57272 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-21 04:09:06.917022491 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 04:09:07,694 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:07,697 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:09:07,871 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:07,872 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:09:07,926 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:07,926 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|██████▉   | 538/770 [00:00<00:00, 5376.79it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5255.72it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39040 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39050 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:09:10,184 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:10,185 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:09:10,316 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:10,317 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:09:10,398 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:10,398 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  73%|███████▎  | 561/770 [00:00<00:00, 5607.71it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6091.86it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39050 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:09:14,586 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:14,586 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:09:14,673 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:14,674 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:09:14,720 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:14,720 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 512/770 [00:00<00:00, 5113.31it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5014.59it/s]
INFO:     172.17.0.1:39050 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:09:18,651 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:18,651 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-09-21 04:09:18,795 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:18,795 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-09-21 04:09:18,894 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:18,895 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 511/770 [00:00<00:00, 5025.65it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5156.70it/s]
INFO:     172.17.0.1:39050 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39050 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39050 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-21 04:09:36.127638846 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 04:09:36,825 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:36,827 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 04:09:36,952 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:36,953 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 04:09:37,011 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:37,011 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████    | 469/770 [00:00<00:00, 4685.96it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5900.75it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:45854 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45868 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:09:38,987 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:38,988 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 04:09:39,118 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:39,119 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 04:09:39,216 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:39,217 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  50%|████▉     | 384/770 [00:00<00:00, 3837.53it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5284.14it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45868 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:09:40,973 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:40,973 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 04:09:41,067 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:41,068 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 04:09:41,123 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:41,123 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 510/770 [00:00<00:00, 5054.54it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5003.78it/s]
INFO:     172.17.0.1:45868 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-09-21 04:09:44,989 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:44,989 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 04:09:45,076 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:45,076 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 04:09:45,127 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:09:45,128 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 482/770 [00:00<00:00, 4784.87it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4953.62it/s]
INFO:     172.17.0.1:45868 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45868 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45868 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-21 04:05:55.375483614 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 04:05:55,815 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:05:55,816 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 04:05:55,901 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:05:55,902 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 04:05:55,944 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:05:55,944 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59470 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59476 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59476 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59476 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59476 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59476 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59476 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-21 04:05:42.152628433 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 04:05:42,847 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:05:42,850 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 04:05:43,018 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:05:43,019 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 04:05:43,099 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:05:43,100 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58696 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58708 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58708 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58708 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58708 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58708 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58708 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-21 04:02:06.586213140 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 04:02:07,103 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:02:07,104 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 04:02:07,185 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:02:07,185 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 04:02:07,228 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:02:07,228 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58686 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58688 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58688 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58688 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58688 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58688 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58688 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-21 04:02:02.104819275 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 04:02:02,606 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:02:02,608 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 04:02:02,707 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:02:02,707 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 04:02:02,768 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 04:02:02,768 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50628 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50632 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50632 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50632 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50632 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50632 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50632 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-21 03:58:21.257302148 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 03:58:21,756 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:58:21,759 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 03:58:21,863 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:58:21,863 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 03:58:21,924 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:58:21,924 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43970 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43978 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43978 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43978 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43978 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43978 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43978 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-21 03:58:14.251119945 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 03:58:14,796 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:58:14,797 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 03:58:14,930 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:58:14,930 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 03:58:14,989 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:58:14,990 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46986 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46996 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46996 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46996 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46996 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46996 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46996 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-21 03:54:35.902172957 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 03:54:36,387 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:54:36,389 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 03:54:36,484 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:54:36,484 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 03:54:36,532 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:54:36,532 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:52618 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52630 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52630 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52630 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52630 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52630 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52630 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-09-21 03:53:21.831209368 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-09-21 03:53:22,499 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:53:22,502 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 03:53:22,669 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:53:22,669 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 03:53:22,763 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:53:22,764 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54368 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54382 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54382 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54382 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54382 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54382 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54382 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-21 03:50:54,447 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:50:54,449 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 03:50:54,520 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:50:54,520 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 03:50:54,558 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:50:54,558 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35200 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35208 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35208 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35208 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35208 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35208 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35208 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-21 03:49:45,631 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:49:45,633 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 03:49:45,764 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:49:45,764 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 03:49:45,843 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:49:45,843 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:44216 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44228 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44228 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44228 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44228 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44228 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44228 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-21 03:47:00,137 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:47:00,140 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 03:47:00,225 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:47:00,226 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 03:47:00,263 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:47:00,263 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:37246 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37262 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37262 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37262 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37262 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37262 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37262 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-21 03:45:08,444 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:45:08,446 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 03:45:08,614 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:45:08,614 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 03:45:08,700 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:45:08,700 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:42090 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42092 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42092 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42092 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42092 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42092 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42092 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-21 03:42:38,441 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:42:38,442 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 03:42:38,512 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:42:38,512 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 03:42:38,549 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:42:38,549 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:44198 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44210 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44210 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44210 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44210 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44210 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44210 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-09-21 03:40:57,646 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:40:57,648 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-09-21 03:40:57,772 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:40:57,773 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-09-21 03:40:57,850 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-09-21 03:40:57,850 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:38922 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38928 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38928 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38928 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38928 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38928 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38928 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:48728 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48736 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48736 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48736 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48736 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48736 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48736 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:40354 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40356 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40356 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40356 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40356 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40356 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40356 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:55814 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55826 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55826 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55826 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55826 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55826 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55826 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:53790 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53798 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53798 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53798 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53798 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53798 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53798 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:37198 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37214 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37214 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37214 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37214 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37214 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37214 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:47082 - "GET /health HTTP/1.1" 200 OK
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
INFO:     172.17.0.1:46592 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46596 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46596 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46596 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46596 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46596 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46596 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:40868 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40878 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40878 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40878 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40878 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40878 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40878 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:45680 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45684 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45684 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45684 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45684 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45684 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45684 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52438 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52452 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52452 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52452 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52452 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52452 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52452 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:49430 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49444 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49444 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49444 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49444 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49444 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49444 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:55078 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55084 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55084 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55084 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55084 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55084 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55084 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:57468 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57470 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57470 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57470 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57470 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57470 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57470 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:33420 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33434 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33434 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33434 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33434 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33434 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33434 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

