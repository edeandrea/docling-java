# Results for ghcr.io/docling-project/docling-serve as of 2026-04-20T06:32:24.935046178Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
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
2026-04-20 06:32:12.610770034 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-20 06:32:13,192 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:32:13,194 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:32:13,272 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:32:13,273 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:32:13,314 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:32:13,314 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|██████▉   | 537/770 [00:00<00:00, 5366.65it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5405.62it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56914 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56920 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-04-20 06:32:15,099 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:32:15,099 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:32:15,178 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:32:15,178 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:32:15,220 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:32:15,220 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 534/770 [00:00<00:00, 5331.78it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5426.52it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56920 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-04-20 06:32:17,120 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:32:17,120 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:32:17,199 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:32:17,199 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:32:17,242 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:32:17,242 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 521/770 [00:00<00:00, 5206.22it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5311.62it/s]
INFO:     172.17.0.1:56920 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-04-20 06:32:19,125 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:32:19,126 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:32:19,206 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:32:19,206 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:32:19,249 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:32:19,249 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 527/770 [00:00<00:00, 5225.98it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5228.65it/s]
INFO:     172.17.0.1:56920 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56920 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56920 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-20 06:30:19.582226866 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-20 06:30:20,194 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:30:20,196 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:30:20,281 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:30:20,281 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:30:20,324 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:30:20,324 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:41934 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41936 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41936 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41936 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41936 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41936 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41936 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-20 06:28:26.122358567 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-20 06:28:26,787 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:28:26,790 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:28:26,892 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:28:26,893 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:28:26,939 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:28:26,939 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39858 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39870 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39870 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39870 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39870 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39870 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39870 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-20 06:27:33.706467411 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-20 06:27:34,468 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:27:34,471 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:27:34,597 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:27:34,597 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:27:34,668 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:27:34,668 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59048 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59058 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59058 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59058 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59058 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59058 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59058 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-20 06:24:42.547893474 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-20 06:24:43,167 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:24:43,170 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:24:43,266 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:24:43,267 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:24:43,317 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:24:43,318 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:40162 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40166 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40166 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40166 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40166 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40166 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40166 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-20 06:23:51.607477813 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-20 06:23:52,368 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:23:52,372 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:23:52,500 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:23:52,500 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:23:52,565 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:23:52,565 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50176 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50192 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50192 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50192 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50192 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50192 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50192 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-20 06:20:55.343813624 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-20 06:20:55,983 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:20:55,985 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:20:56,094 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:20:56,095 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:20:56,143 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:20:56,143 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35412 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35414 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35414 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35414 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35414 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35414 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35414 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-20 06:20:05.719048355 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-20 06:20:06,502 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:20:06,505 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:20:06,638 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:20:06,639 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:20:06,698 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:20:06,699 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39352 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39364 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39364 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39364 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39364 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39364 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39364 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-20 06:17:08.482509501 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-20 06:17:09,083 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:17:09,085 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:17:09,208 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:17:09,208 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:17:09,278 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:17:09,278 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:47880 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47884 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47884 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47884 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47884 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47884 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47884 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-04-20 06:17:08,192 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:17:08,194 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:17:08,283 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:17:08,283 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:17:08,320 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:17:08,320 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43602 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43608 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43608 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43608 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43608 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43608 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43608 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-04-20 06:13:56,259 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:13:56,261 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:13:56,338 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:13:56,339 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:13:56,383 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:13:56,383 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46070 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46084 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46084 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46084 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46084 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46084 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46084 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-04-20 06:13:36,489 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:13:36,492 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:13:36,597 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:13:36,597 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:13:36,710 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:13:36,711 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:48532 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48542 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48542 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48542 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48542 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48542 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48542 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-04-20 06:09:47,349 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:09:47,351 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:09:47,421 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:09:47,421 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:09:47,456 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:09:47,457 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51460 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51464 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51464 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51464 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51464 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51464 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51464 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-04-20 06:09:27,926 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:09:27,929 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:09:28,043 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:09:28,043 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:09:28,121 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:09:28,121 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58366 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58382 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58382 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58382 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58382 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58382 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58382 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-04-20 06:05:32,112 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:05:32,114 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-20 06:05:32,185 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:05:32,185 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-20 06:05:32,223 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-20 06:05:32,224 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54702 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54704 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54704 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54704 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54704 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54704 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54704 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50152 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50160 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50160 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50160 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50160 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50160 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50160 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:60620 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60630 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60630 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60630 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60630 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60630 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60630 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:41266 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41282 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41282 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41282 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41282 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41282 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41282 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:43834 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43836 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43836 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43836 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43836 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43836 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43836 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:51450 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51454 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51454 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51454 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51454 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51454 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51454 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:58124 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58132 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58132 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58132 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58132 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58132 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58132 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:55108 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55114 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55114 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55114 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55114 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55114 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55114 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:59102 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59118 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59118 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59118 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59118 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59118 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59118 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:51774 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51786 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51786 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51786 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51786 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51786 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51786 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:60110 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60118 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60118 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60118 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60118 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60118 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60118 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:34640 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34644 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34644 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34644 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34644 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34644 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34644 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50220 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50226 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50226 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50226 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50226 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50226 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50226 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:54300 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54314 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54314 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54314 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54314 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54314 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54314 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:57064 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57072 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57072 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57072 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57072 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57072 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57072 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

