# Results for ghcr.io/docling-project/docling-serve as of 2026-05-25T07:59:04.158898214Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
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
2026-05-25 07:58:51.522898363 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-25 07:58:51,835 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:51,837 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-25 07:58:51,963 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:51,964 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-25 07:58:52,009 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:52,010 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 523/770 [00:00<00:00, 5109.96it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5614.58it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:44092 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44108 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-05-25 07:58:53,770 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:53,770 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-25 07:58:53,909 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:53,909 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-25 07:58:53,977 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:53,977 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  77%|███████▋  | 595/770 [00:00<00:00, 5943.46it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5758.40it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44108 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-25 07:58:55,791 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:55,791 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-25 07:58:55,906 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:55,906 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-25 07:58:55,975 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:55,975 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|██████    | 464/770 [00:00<00:00, 4624.88it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4789.74it/s]
INFO:     172.17.0.1:44108 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-25 07:58:57,831 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:57,832 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-25 07:58:57,959 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:57,959 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-25 07:58:58,014 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:58,014 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  59%|█████▉    | 458/770 [00:00<00:00, 4549.04it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4686.58it/s]
INFO:     172.17.0.1:44108 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44108 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44108 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-25 07:58:45.211323219 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-25 07:58:45,566 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:45,568 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-25 07:58:45,697 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:45,698 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-25 07:58:45,743 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:45,743 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 498/770 [00:00<00:00, 4976.74it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4821.73it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:53238 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53242 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-05-25 07:58:47,770 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:47,771 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-25 07:58:47,859 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:47,859 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-25 07:58:47,904 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:47,905 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 502/770 [00:00<00:00, 5015.68it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5034.53it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53242 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-25 07:58:49,784 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:49,784 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-25 07:58:49,920 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:49,921 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-25 07:58:49,965 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:49,966 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  78%|███████▊  | 598/770 [00:00<00:00, 5974.83it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5712.91it/s]
INFO:     172.17.0.1:53242 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-25 07:58:51,802 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:51,803 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-25 07:58:51,981 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:51,981 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-25 07:58:52,075 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:58:52,076 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 521/770 [00:00<00:00, 5209.71it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5015.74it/s]
INFO:     172.17.0.1:53242 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53242 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53242 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-25 07:56:16.963764323 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-25 07:56:17,538 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:17,540 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-25 07:56:17,704 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:17,704 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-25 07:56:17,750 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:17,751 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▍   | 496/770 [00:00<00:00, 4957.17it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4871.48it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:37812 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37826 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-05-25 07:56:19,714 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:19,715 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-25 07:56:19,820 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:19,820 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-25 07:56:19,870 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:19,870 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  61%|██████▏   | 473/770 [00:00<00:00, 4717.86it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4581.56it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37826 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-25 07:56:21,730 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:21,730 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-25 07:56:21,829 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:21,829 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-25 07:56:21,873 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:21,873 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 511/770 [00:00<00:00, 5108.36it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5138.10it/s]
INFO:     172.17.0.1:37826 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-25 07:56:23,751 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:23,751 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-25 07:56:23,842 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:23,843 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-25 07:56:23,889 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:23,889 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 505/770 [00:00<00:00, 5027.37it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4940.51it/s]
INFO:     172.17.0.1:37826 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37826 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37826 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-25 07:56:28.619017714 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-25 07:56:29,271 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:29,272 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:56:29,366 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:29,366 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:56:29,410 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:29,410 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 485/770 [00:00<00:00, 4825.48it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4883.11it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:42070 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42080 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-05-25 07:56:31,797 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:31,798 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:56:31,981 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:31,981 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:56:32,054 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:32,054 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  45%|████▍     | 345/770 [00:00<00:00, 3319.94it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5064.23it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42080 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-25 07:56:35,761 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:35,761 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:56:35,872 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:35,872 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:56:35,917 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:35,917 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 507/770 [00:00<00:00, 5025.16it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5161.22it/s]
INFO:     172.17.0.1:42080 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-25 07:56:37,794 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:37,794 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:56:37,912 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:37,912 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:56:37,969 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:56:37,969 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 501/770 [00:00<00:00, 5008.00it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5072.40it/s]
INFO:     172.17.0.1:42080 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42080 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42080 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-25 07:53:33.256047398 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-25 07:53:33,771 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:53:33,772 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:53:33,877 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:53:33,877 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:53:33,952 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:53:33,952 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59478 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59492 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59492 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59492 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59492 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59492 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59492 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-25 07:53:33.185221050 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-25 07:53:33,697 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:53:33,699 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:53:33,823 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:53:33,823 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:53:33,887 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:53:33,887 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58376 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58384 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58384 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58384 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58384 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58384 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58384 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-25 07:50:40.145014599 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-25 07:50:40,669 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:50:40,670 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:50:40,798 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:50:40,799 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:50:40,907 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:50:40,907 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:47754 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47766 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47766 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47766 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47766 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47766 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47766 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-25 07:50:40.184720052 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-25 07:50:40,707 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:50:40,709 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:50:40,798 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:50:40,798 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:50:40,844 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:50:40,844 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:52418 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52422 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52422 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52422 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52422 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52422 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52422 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-25 07:47:53.229967918 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-25 07:47:53,761 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:47:53,763 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:47:53,868 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:47:53,868 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:47:53,918 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:47:53,918 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:48892 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48908 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48908 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48908 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48908 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48908 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48908 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-25 07:47:53.265279498 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-25 07:47:53,807 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:47:53,809 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:47:53,981 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:47:53,981 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:47:54,055 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:47:54,055 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:38828 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38834 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38834 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38834 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38834 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38834 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38834 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-25 07:45:03.347693929 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-25 07:45:03,863 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:45:03,865 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:45:03,973 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:45:03,973 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:45:04,041 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:45:04,041 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43042 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43046 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43046 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43046 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43046 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43046 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43046 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-25 07:45:01.082783829 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/VMBUS:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-25 07:45:01,583 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:45:01,585 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:45:01,696 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:45:01,697 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:45:01,769 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:45:01,770 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55738 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55744 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55744 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55744 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55744 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55744 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55744 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-25 07:42:05,723 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:42:05,725 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:42:05,858 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:42:05,858 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:42:05,899 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:42:05,902 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:32908 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:32914 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:32914 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:32914 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:32914 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:32914 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:32914 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-25 07:42:15,928 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:42:15,930 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:42:16,036 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:42:16,036 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:42:16,076 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:42:16,077 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43214 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43226 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43226 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43226 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43226 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43226 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43226 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-25 07:38:57,099 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:38:57,101 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:38:57,216 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:38:57,216 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:38:57,290 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:38:57,290 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46404 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46406 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46406 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46406 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46406 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46406 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46406 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-25 07:38:56,922 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:38:56,924 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:38:57,047 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:38:57,047 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:38:57,102 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:38:57,103 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:34660 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34666 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34666 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34666 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34666 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34666 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34666 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-25 07:35:29,190 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:35:29,192 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:35:29,312 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:35:29,312 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:35:29,375 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:35:29,376 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:47116 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47118 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47118 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47118 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47118 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47118 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47118 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-25 07:35:29,321 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:35:29,325 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-25 07:35:29,456 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:35:29,457 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-25 07:35:29,493 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-25 07:35:29,494 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:53066 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53072 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53072 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53072 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53072 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53072 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53072 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:38720 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38728 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38728 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38728 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38728 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38728 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38728 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:58230 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58244 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58244 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58244 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58244 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58244 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58244 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52298 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52302 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52302 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52302 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52302 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52302 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52302 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:44728 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44740 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44740 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44740 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44740 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44740 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44740 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:34054 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34058 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34058 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34058 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34058 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34058 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34058 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:35486 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35500 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35500 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35500 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35500 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35500 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35500 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50260 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50276 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50276 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50276 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50276 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50276 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50276 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:36780 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36790 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36790 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36790 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36790 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36790 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36790 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52242 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52248 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52248 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52248 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52248 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52248 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52248 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:49366 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49380 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49380 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49380 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49380 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:49380 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:49380 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:47022 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47034 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47034 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47034 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:51974 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51982 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51982 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51982 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51982 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51982 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51982 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:35732 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35738 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35738 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35738 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35738 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35738 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35738 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:44992 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45000 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45000 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45000 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45000 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45000 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45000 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

