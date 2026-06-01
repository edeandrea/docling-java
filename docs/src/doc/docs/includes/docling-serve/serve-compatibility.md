# Results for ghcr.io/docling-project/docling-serve as of 2026-06-01T09:21:40.475067240Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
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
2026-06-01 09:21:27.887227861 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:21:28,136 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:21:28,137 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:21:28,225 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:21:28,226 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:21:28,271 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:21:28,271 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|██████▉   | 537/770 [00:00<00:00, 5355.87it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5385.59it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51932 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51936 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:21:29,941 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:21:29,941 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:21:30,033 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:21:30,033 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:21:30,079 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:21:30,079 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 535/770 [00:00<00:00, 5313.36it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5332.63it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51936 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:21:31,980 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:21:31,980 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:21:32,074 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:21:32,074 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:21:32,120 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:21:32,120 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  71%|███████   | 543/770 [00:00<00:00, 5356.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5419.85it/s]
INFO:     172.17.0.1:51936 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:21:33,984 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:21:33,984 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:21:34,075 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:21:34,076 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:21:34,123 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:21:34,123 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 531/770 [00:00<00:00, 5308.40it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5320.76it/s]
INFO:     172.17.0.1:51936 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51936 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51936 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-01 09:20:29.946158446 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:20:30,318 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:20:30,320 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:20:30,484 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:20:30,484 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:20:30,592 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:20:30,593 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 517/770 [00:00<00:00, 5142.75it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6183.38it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55312 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55322 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:20:32,806 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:20:32,806 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:20:32,932 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:20:32,932 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:20:33,100 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:20:33,101 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 444/770 [00:00<00:00, 4425.18it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5130.75it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55322 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:20:34,823 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:20:34,823 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:20:34,929 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:20:34,929 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:20:35,060 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:20:35,060 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 531/770 [00:00<00:00, 5301.12it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5416.24it/s]
INFO:     172.17.0.1:55322 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:20:38,845 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:20:38,845 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:20:38,969 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:20:38,969 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:20:39,114 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:20:39,115 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 533/770 [00:00<00:00, 5283.30it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5717.02it/s]
INFO:     172.17.0.1:55322 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55322 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55322 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-01 09:19:29.132274327 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:19:29,598 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:19:29,601 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:19:29,758 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:19:29,758 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:19:29,814 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:19:29,814 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 512/770 [00:00<00:00, 5036.57it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4979.22it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51556 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51570 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:19:31,658 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:19:31,658 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:19:31,818 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:19:31,818 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:19:31,872 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:19:31,872 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 530/770 [00:00<00:00, 5298.15it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5825.87it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51570 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:19:33,703 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:19:33,704 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:19:33,854 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:19:33,854 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:19:33,945 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:19:33,945 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  81%|████████▏ | 627/770 [00:00<00:00, 6254.10it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6149.19it/s]
INFO:     172.17.0.1:51570 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:19:37,731 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:19:37,732 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:19:37,864 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:19:37,865 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:19:37,915 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:19:37,915 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  67%|██████▋   | 518/770 [00:00<00:00, 5168.26it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5384.90it/s]
INFO:     172.17.0.1:51570 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51570 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51570 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-01 09:18:06.741148678 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:18:07,513 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:18:07,515 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:18:07,677 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:18:07,678 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:18:07,731 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:18:07,731 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 453/770 [00:00<00:00, 4516.18it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5603.47it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:40976 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40988 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:18:09,885 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:18:09,885 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:18:09,992 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:18:09,992 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:18:10,038 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:18:10,038 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  56%|█████▋    | 435/770 [00:00<00:00, 4348.30it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4836.29it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40988 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:18:11,925 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:18:11,925 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:18:12,095 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:18:12,095 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:18:12,167 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:18:12,168 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 448/770 [00:00<00:00, 4477.89it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5112.69it/s]
INFO:     172.17.0.1:40988 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:18:13,939 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:18:13,939 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-06-01 09:18:14,092 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:18:14,093 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-06-01 09:18:14,144 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:18:14,145 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  57%|█████▋    | 440/770 [00:00<00:00, 4377.43it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5509.81it/s]
INFO:     172.17.0.1:40988 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40988 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40988 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-01 09:17:01.491261045 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:17:02,566 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:17:02,569 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:17:02,745 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:17:02,745 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:17:02,820 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:17:02,820 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|███████   | 539/770 [00:00<00:00, 5316.55it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5481.29it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57554 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57560 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:17:04,869 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:17:04,869 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:17:04,995 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:17:04,996 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:17:05,038 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:17:05,038 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|██████    | 463/770 [00:00<00:00, 4628.40it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5581.99it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57560 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:17:08,917 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:17:08,917 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:17:09,058 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:17:09,058 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:17:09,104 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:17:09,105 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 485/770 [00:00<00:00, 4823.23it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4769.20it/s]
INFO:     172.17.0.1:57560 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-06-01 09:17:10,917 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:17:10,918 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:17:11,011 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:17:11,011 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:17:11,057 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:17:11,058 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 447/770 [00:00<00:00, 4449.00it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4445.27it/s]
INFO:     172.17.0.1:57560 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57560 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57560 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-01 09:15:46.210966364 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:15:46,840 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:15:46,842 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:15:46,995 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:15:46,995 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:15:47,041 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:15:47,041 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:42174 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42180 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42180 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42180 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42180 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42180 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42180 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-01 09:13:56.312317362 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:13:57,023 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:13:57,026 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:13:57,184 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:13:57,185 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:13:57,265 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:13:57,265 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43358 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43368 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43368 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43368 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43368 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43368 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43368 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-01 09:12:45.994947185 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:12:46,676 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:12:46,678 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:12:46,835 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:12:46,835 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:12:46,924 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:12:46,925 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54650 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54656 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54656 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54656 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54656 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54656 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54656 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-01 09:11:02.631868718 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:11:03,180 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:11:03,182 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:11:03,289 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:11:03,290 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:11:03,338 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:11:03,338 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:34660 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34676 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34676 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34676 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34676 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34676 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34676 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-01 09:10:06.634647582 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:10:07,343 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:10:07,346 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:10:07,500 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:10:07,501 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:10:07,559 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:10:07,559 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59050 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59054 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59054 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59054 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59054 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59054 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59054 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-01 09:08:16.693420871 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:08:17,412 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:08:17,414 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:08:17,591 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:08:17,592 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:08:17,672 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:08:17,672 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:53656 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53658 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53658 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53658 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53658 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53658 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53658 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-01 09:07:06.331267019 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:07:07,049 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:07:07,052 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:07:07,232 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:07:07,233 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:07:07,311 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:07:07,312 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:33452 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33468 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33468 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33468 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33468 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33468 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33468 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-06-01 09:05:42.186473871 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-06-01 09:05:42,943 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:05:42,946 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:05:43,109 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:05:43,109 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:05:43,164 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:05:43,164 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:48104 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48108 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48108 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48108 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48108 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48108 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48108 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-01 09:02:54,453 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:02:54,456 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:02:54,576 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:02:54,576 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:02:54,635 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:02:54,635 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:37868 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37876 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37876 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37876 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37876 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37876 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37876 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-01 09:04:03,670 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:04:03,673 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:04:03,795 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:04:03,795 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:04:03,869 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:04:03,869 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43846 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43860 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43860 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43860 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43860 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43860 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43860 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-01 09:00:01,817 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:00:01,819 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 09:00:01,909 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:00:01,909 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 09:00:01,947 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 09:00:01,947 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56150 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56156 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56156 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56156 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56156 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56156 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56156 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-01 08:59:55,793 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 08:59:55,795 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 08:59:55,903 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 08:59:55,903 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 08:59:55,961 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 08:59:55,961 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51196 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51212 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51212 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51212 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51212 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51212 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51212 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-01 08:56:39,714 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 08:56:39,718 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 08:56:39,826 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 08:56:39,826 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 08:56:39,885 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 08:56:39,886 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:48844 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48854 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48854 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48854 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48854 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48854 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48854 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-06-01 08:56:27,023 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 08:56:27,025 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-06-01 08:56:27,157 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 08:56:27,158 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-06-01 08:56:27,227 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-06-01 08:56:27,227 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:49992 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40432 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40432 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40432 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40432 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40432 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40432 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:33254 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33256 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33256 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33256 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33256 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33256 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33256 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:41800 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41806 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41806 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41806 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41806 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41806 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41806 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:49686 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49696 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49696 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49696 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49696 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49696 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49696 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:42368 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42372 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42372 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42372 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42372 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42372 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42372 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:54702 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54718 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54718 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54718 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54718 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54718 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54718 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:53978 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53982 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53982 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53982 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53982 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53982 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53982 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:35288 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35302 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35302 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35302 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35302 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35302 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35302 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:60282 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60290 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60290 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60290 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60290 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60290 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60290 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52472 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52486 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52486 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52486 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52486 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52486 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52486 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:54008 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54024 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54024 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54024 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54024 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54024 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54024 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:53478 - "GET /health HTTP/1.1" 200 OK
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
INFO:     172.17.0.1:40296 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40306 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40306 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40306 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40306 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40306 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40306 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:60632 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60648 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60648 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60648 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60648 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60648 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60648 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50224 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50228 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50228 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50228 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50228 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50228 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50228 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

