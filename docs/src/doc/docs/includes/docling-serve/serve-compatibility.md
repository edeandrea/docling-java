# Results for ghcr.io/docling-project/docling-serve as of 2026-06-08T12:09:04.855141543Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
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
2026-06-08 12:08:53.270955698 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 12:08:53,540 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:53,541 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:08:53,628 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:53,628 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:08:53,672 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:53,672 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  75%|███████▍  | 575/770 [00:00<00:00, 5748.00it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5794.29it/s]
[INFO] 2026-06-08 12:08:54,631 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:54,631 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:08:54,721 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:54,721 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:08:54,766 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:54,766 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  73%|███████▎  | 563/770 [00:00<00:00, 5573.42it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5672.36it/s]
WARNING:	12:08:55 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
WARNING:	12:08:55 - docling_core.types.doc.document - Parameter `strict_text` has been deprecated and will be ignored.
[INFO] 2026-06-08 12:08:56,644 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:56,645 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:08:56,736 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:56,737 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:08:56,781 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:56,781 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  74%|███████▍  | 569/770 [00:00<00:00, 5679.48it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5740.58it/s]
[INFO] 2026-06-08 12:08:58,656 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:58,656 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:08:58,745 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:58,745 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:08:58,790 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:58,790 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  72%|███████▏  | 558/770 [00:00<00:00, 5559.57it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5643.32it/s]

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
2026-06-08 12:08:16.710970537 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 12:08:17,182 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:17,184 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:08:17,355 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:17,355 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:08:17,436 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:17,436 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 501/770 [00:00<00:00, 5008.31it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5341.97it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50156 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50168 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:08:19,207 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:19,207 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:08:19,332 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:19,333 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:08:19,386 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:19,387 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|██████    | 462/770 [00:00<00:00, 4606.17it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4563.93it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50168 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:08:21,225 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:21,225 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:08:21,348 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:21,348 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:08:21,394 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:21,394 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 534/770 [00:00<00:00, 5291.17it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5548.48it/s]
INFO:     172.17.0.1:50168 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:08:25,252 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:25,253 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:08:25,417 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:25,418 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:08:25,470 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:08:25,471 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 478/770 [00:00<00:00, 4718.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6349.81it/s]
INFO:     172.17.0.1:50168 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50168 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50168 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-08 12:06:35.333472756 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 12:06:35,703 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:35,705 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:06:35,803 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:35,804 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:06:35,849 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:35,850 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|███████   | 539/770 [00:00<00:00, 5386.37it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5350.20it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:60982 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60986 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:06:37,227 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:37,227 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:06:37,331 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:37,332 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:06:37,378 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:37,379 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 533/770 [00:00<00:00, 5287.65it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5422.82it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60986 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:06:39,268 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:39,268 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:06:39,363 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:39,364 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:06:39,421 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:39,421 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 533/770 [00:00<00:00, 5274.87it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5414.26it/s]
INFO:     172.17.0.1:60986 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:06:41,276 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:41,276 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:06:41,381 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:41,381 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:06:41,430 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:41,430 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|███████   | 539/770 [00:00<00:00, 5383.78it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5383.28it/s]
INFO:     172.17.0.1:60986 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60986 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60986 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-08 12:05:54.063541884 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 12:05:54,675 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:05:54,678 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:05:54,849 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:05:54,849 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:05:54,940 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:05:54,940 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 487/770 [00:00<00:00, 4806.65it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 2917.76it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:52780 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52794 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:05:58,263 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:05:58,264 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:05:58,363 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:05:58,363 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:05:58,407 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:05:58,407 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 479/770 [00:00<00:00, 4753.07it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5223.72it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52794 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:06:00,295 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:00,295 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:06:00,421 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:00,422 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:06:00,528 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:00,528 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 476/770 [00:00<00:00, 4737.26it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4831.04it/s]
INFO:     172.17.0.1:52794 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:06:02,315 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:02,315 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:06:02,442 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:02,443 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:06:02,517 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:06:02,517 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  76%|███████▌  | 587/770 [00:00<00:00, 5867.70it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5867.59it/s]
INFO:     172.17.0.1:52794 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52794 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52794 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-08 12:04:02.019277685 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 12:04:02,675 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:04:02,677 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:04:02,792 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:04:02,793 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:04:02,870 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:04:02,870 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 481/770 [00:00<00:00, 4789.58it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5675.36it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:49592 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49606 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:04:05,079 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:04:05,079 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:04:05,217 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:04:05,217 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:04:05,265 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:04:05,266 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 534/770 [00:00<00:00, 5322.05it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5334.31it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49606 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:04:07,100 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:04:07,100 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:04:07,187 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:04:07,187 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:04:07,232 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:04:07,233 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 508/770 [00:00<00:00, 5079.02it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5297.35it/s]
INFO:     172.17.0.1:49606 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:04:09,108 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:04:09,108 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-08 12:04:09,190 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:04:09,191 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-08 12:04:09,243 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:04:09,243 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  74%|███████▍  | 569/770 [00:00<00:00, 5669.84it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5796.79it/s]
INFO:     172.17.0.1:49606 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49606 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49606 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-08 12:03:26.148628641 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 12:03:26,832 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:03:26,834 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 12:03:26,968 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:03:26,969 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 12:03:27,017 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:03:27,017 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 534/770 [00:00<00:00, 5338.88it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5202.63it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:41972 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41978 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:03:28,811 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:03:28,811 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 12:03:28,896 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:03:28,896 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 12:03:28,939 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:03:28,939 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 474/770 [00:00<00:00, 4702.46it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5033.88it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41978 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:03:30,834 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:03:30,834 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 12:03:30,980 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:03:30,981 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 12:03:31,029 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:03:31,029 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 492/770 [00:00<00:00, 4918.12it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6105.55it/s]
INFO:     172.17.0.1:41978 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-08 12:03:32,824 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:03:32,824 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 12:03:32,951 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:03:32,951 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 12:03:33,005 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:03:33,006 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  79%|███████▉  | 608/770 [00:00<00:00, 6072.00it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6063.60it/s]
INFO:     172.17.0.1:41978 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41978 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41978 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-08 12:01:25.951260517 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 12:01:26,585 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:01:26,587 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 12:01:26,724 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:01:26,724 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 12:01:26,778 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:01:26,778 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:60694 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60704 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60704 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60704 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60704 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60704 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60704 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-08 12:00:03.405167925 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 12:00:04,990 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:00:04,993 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 12:00:05,152 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:00:05,152 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 12:00:05,216 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 12:00:05,216 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35168 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35170 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35170 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35170 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35170 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35170 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35170 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-08 11:58:39.954526066 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 11:58:41,770 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:58:41,772 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 11:58:41,909 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:58:41,910 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 11:58:41,975 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:58:41,976 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58212 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58228 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58228 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58228 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58228 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58228 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58228 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-08 11:57:36.273766477 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 11:57:36,920 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:57:36,922 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 11:57:37,087 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:57:37,088 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 11:57:37,173 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:57:37,173 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:45316 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45318 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45318 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45318 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45318 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45318 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45318 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-08 11:55:58.820758354 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 11:56:01,360 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:56:01,362 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 11:56:01,530 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:56:01,530 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 11:56:01,590 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:56:01,590 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:44760 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44768 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44768 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44768 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44768 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44768 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44768 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-08 11:54:23.938626143 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 11:54:24,744 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:54:24,747 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 11:54:24,931 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:54:24,931 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 11:54:25,017 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:54:25,017 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57046 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57062 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57062 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57062 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57062 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57062 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57062 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-08 11:52:56.680487515 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 11:52:57,253 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:52:57,255 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 11:52:57,419 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:52:57,419 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 11:52:57,482 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:52:57,482 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43196 - "GET /health HTTP/1.1" 200 OK
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
2026-06-08 11:52:00.858536611 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-08 11:52:01,529 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:52:01,531 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 11:52:01,708 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:52:01,709 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 11:52:01,793 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:52:01,794 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46754 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46766 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46766 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46766 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46766 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46766 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46766 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-08 11:50:13,326 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:50:13,328 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 11:50:13,460 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:50:13,460 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 11:50:13,515 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:50:13,516 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58936 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58944 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58944 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58944 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58944 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58944 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58944 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-08 11:49:03,743 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:49:03,746 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 11:49:04,923 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:49:04,923 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 11:49:04,974 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:49:04,975 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57116 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57126 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57126 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57126 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57126 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57126 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57126 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-08 11:46:52,192 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:46:52,194 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 11:46:52,315 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:46:52,316 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 11:46:52,369 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:46:52,370 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35962 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35964 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35964 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35964 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35964 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35964 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35964 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-08 11:45:38,724 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:45:38,726 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 11:45:38,859 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:45:38,860 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 11:45:38,927 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:45:38,927 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54712 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54726 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54726 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54726 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54726 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54726 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54726 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-08 11:43:21,941 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:43:21,943 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 11:43:22,046 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:43:22,046 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 11:43:22,105 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:43:22,106 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39262 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39274 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39274 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39274 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39274 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39274 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39274 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-08 11:42:23,307 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:42:23,309 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-08 11:42:23,426 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:42:23,426 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-08 11:42:23,485 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-08 11:42:23,485 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55054 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55056 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55056 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55056 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55056 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55056 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55056 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:40030 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40036 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40036 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40036 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40036 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40036 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40036 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:34854 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34862 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34862 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34862 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34862 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34862 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34862 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:53446 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53448 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53448 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53448 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53448 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53448 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53448 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:46122 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46138 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46138 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46138 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46138 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46138 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46138 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52330 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52344 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52344 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52344 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52344 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52344 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52344 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:56056 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56058 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56058 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56058 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56058 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56058 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56058 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:49698 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49706 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49706 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49706 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49706 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49706 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49706 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:43188 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43202 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43202 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43202 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43202 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43202 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43202 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:36112 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36128 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36128 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36128 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36128 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36128 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36128 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:35378 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35380 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35380 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35380 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35380 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35380 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35380 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:37944 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37948 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37948 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37948 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37948 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37948 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37948 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:56728 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56732 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56732 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56732 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56732 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56732 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56732 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:34326 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34330 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34330 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34330 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34330 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34330 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34330 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:43088 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43096 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43096 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43096 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43096 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43096 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43096 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

