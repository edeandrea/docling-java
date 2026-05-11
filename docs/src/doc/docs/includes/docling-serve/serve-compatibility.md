# Results for ghcr.io/docling-project/docling-serve as of 2026-05-11T07:30:56.294965521Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
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
2026-05-11 07:30:44.891116907 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-11 07:30:45,243 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:30:45,246 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-11 07:30:45,328 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:30:45,328 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-11 07:30:45,371 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:30:45,371 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  71%|███████   | 543/770 [00:00<00:00, 5427.09it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5514.50it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51660 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51668 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-05-11 07:30:46,592 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:30:46,592 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-11 07:30:46,676 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:30:46,676 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-11 07:30:46,720 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:30:46,720 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 535/770 [00:00<00:00, 5332.68it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5351.53it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51668 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-11 07:30:48,607 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:30:48,608 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-11 07:30:48,689 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:30:48,690 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-11 07:30:48,733 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:30:48,734 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|███████   | 539/770 [00:00<00:00, 5349.57it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5461.75it/s]
INFO:     172.17.0.1:51668 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-11 07:30:50,618 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:30:50,618 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-11 07:30:50,699 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:30:50,699 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-11 07:30:50,743 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:30:50,743 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|██████▉   | 537/770 [00:00<00:00, 5365.14it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5390.90it/s]
INFO:     172.17.0.1:51668 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51668 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51668 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-11 07:28:08.580726797 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-11 07:28:09,107 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:09,109 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-11 07:28:09,196 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:09,196 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-11 07:28:09,243 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:09,243 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 481/770 [00:00<00:00, 4809.05it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4878.95it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55340 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55344 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-05-11 07:28:11,286 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:11,286 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-11 07:28:11,403 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:11,403 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-11 07:28:11,447 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:11,447 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  71%|███████   | 545/770 [00:00<00:00, 5448.46it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5793.79it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55344 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-11 07:28:13,306 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:13,306 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-11 07:28:13,411 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:13,411 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-11 07:28:13,458 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:13,458 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  79%|███████▊  | 605/770 [00:00<00:00, 6046.03it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5902.14it/s]
INFO:     172.17.0.1:55344 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-11 07:28:15,319 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:15,320 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-11 07:28:15,423 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:15,423 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-11 07:28:15,481 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:15,481 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 488/770 [00:00<00:00, 4778.56it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5178.78it/s]
INFO:     172.17.0.1:55344 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55344 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55344 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-11 07:28:04.680615097 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-11 07:28:05,248 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:05,250 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:28:05,330 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:05,330 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:28:05,375 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:05,376 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 511/770 [00:00<00:00, 5108.48it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5061.79it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59910 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59914 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-05-11 07:28:07,270 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:07,271 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:28:07,355 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:07,355 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:28:07,406 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:07,407 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 512/770 [00:00<00:00, 5089.38it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5059.70it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59914 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-11 07:28:09,324 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:09,324 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:28:09,494 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:09,494 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:28:09,552 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:09,553 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  74%|███████▍  | 571/770 [00:00<00:00, 5705.65it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5672.60it/s]
INFO:     172.17.0.1:59914 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-11 07:28:11,336 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:11,336 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:28:11,457 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:11,457 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:28:11,537 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:28:11,537 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  74%|███████▎  | 567/770 [00:00<00:00, 5662.71it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5698.43it/s]
INFO:     172.17.0.1:59914 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59914 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59914 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-11 07:25:41.947612323 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-11 07:25:42,516 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:25:42,518 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:25:42,611 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:25:42,611 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:25:42,662 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:25:42,662 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:36652 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36654 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36654 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36654 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36654 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36654 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36654 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-11 07:22:56.157254472 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-11 07:22:56,816 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:22:56,819 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:22:56,951 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:22:56,951 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:22:57,001 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:22:57,002 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59868 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59870 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59870 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59870 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59870 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59870 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59870 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-11 07:23:47.175661437 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-11 07:23:48,672 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:23:48,674 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:23:48,776 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:23:48,776 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:23:48,841 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:23:48,841 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:41410 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41424 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41424 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41424 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41424 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41424 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41424 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-11 07:19:55.826036577 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-11 07:19:56,633 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:19:56,635 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:19:56,796 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:19:56,796 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:19:56,837 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:19:56,837 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:42514 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42524 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42524 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42524 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42524 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42524 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42524 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-11 07:19:55.751917978 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-11 07:19:56,555 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:19:56,558 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:19:56,669 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:19:56,669 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:19:56,712 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:19:56,712 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39074 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39084 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39084 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39084 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39084 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39084 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39084 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-11 07:16:59.089788598 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-11 07:16:59,639 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:16:59,641 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:16:59,749 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:16:59,749 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:16:59,813 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:16:59,814 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58898 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58908 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58908 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58908 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58908 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58908 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58908 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-11 07:17:01.240788783 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-11 07:17:01,790 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:17:01,792 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:17:01,918 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:17:01,918 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:17:01,984 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:17:01,984 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35178 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35190 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35190 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35190 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35190 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35190 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35190 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-11 07:14:00.660256047 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-11 07:14:01,362 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:14:01,364 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:14:01,507 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:14:01,507 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:14:01,589 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:14:01,590 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50466 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50476 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50476 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50476 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50476 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50476 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50476 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-11 07:13:18,969 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:13:18,972 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:13:19,083 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:13:19,083 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:13:19,135 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:13:19,135 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:38194 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38206 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38206 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38206 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38206 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38206 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38206 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-11 07:11:05,501 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:11:05,503 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:11:05,576 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:11:05,576 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:11:05,613 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:11:05,613 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:60844 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60856 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60856 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60856 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60856 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60856 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60856 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-11 07:09:27,168 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:09:27,171 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:09:27,287 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:09:27,288 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:09:27,361 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:09:27,362 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35788 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35798 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35798 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35798 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
[INFO] 2026-05-11 07:07:03,511 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:07:03,513 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:07:03,584 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:07:03,585 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:07:03,620 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:07:03,620 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57044 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57054 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57054 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57054 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57054 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57054 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57054 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-11 07:05:29,551 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:05:29,554 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:05:29,662 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:05:29,662 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:05:29,735 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:05:29,735 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:40464 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40470 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40470 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40470 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40470 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40470 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40470 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-11 07:03:07,886 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:03:07,888 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-11 07:03:07,958 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:03:07,958 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-11 07:03:07,995 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-11 07:03:07,996 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35052 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35056 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35056 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35056 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35056 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35056 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35056 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:44780 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44794 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44794 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44794 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44794 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44794 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44794 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:55024 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55034 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55034 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55034 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:33866 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33868 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33868 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33868 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33868 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33868 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33868 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:42276 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42282 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42282 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42282 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42282 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42282 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42282 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:56538 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56548 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56548 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56548 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56548 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56548 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56548 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:34014 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34028 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34028 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34028 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34028 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34028 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34028 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:33668 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33678 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33678 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33678 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33678 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33678 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33678 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:45908 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45924 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45924 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45924 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45924 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45924 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45924 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:48724 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48728 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48728 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48728 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48728 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48728 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48728 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:49260 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49274 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49274 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49274 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49274 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49274 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49274 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:41552 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41568 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41568 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41568 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41568 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41568 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41568 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50718 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50730 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50730 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50730 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50730 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50730 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50730 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:44280 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44292 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44292 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44292 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44292 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44292 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44292 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:44758 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44762 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44762 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44762 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44762 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44762 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44762 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

