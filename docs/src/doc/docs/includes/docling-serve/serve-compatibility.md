# Results for ghcr.io/docling-project/docling-serve as of 2026-05-04T06:45:07.775508973Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
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
2026-05-04 06:44:46.739245083 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-04 06:44:47,981 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:47,983 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-04 06:44:48,099 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:48,099 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-04 06:44:48,163 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:48,163 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  72%|███████▏  | 551/770 [00:00<00:00, 5501.35it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5602.54it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54846 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54858 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-05-04 06:44:49,670 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:49,670 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-04 06:44:49,770 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:49,771 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-04 06:44:49,814 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:49,814 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  74%|███████▎  | 567/770 [00:00<00:00, 5648.87it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6193.57it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54858 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-04 06:44:51,719 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:51,719 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-04 06:44:51,838 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:51,838 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-04 06:44:51,886 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:51,886 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  72%|███████▏  | 557/770 [00:00<00:00, 5568.68it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5622.83it/s]
INFO:     172.17.0.1:54858 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-04 06:44:53,733 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:53,733 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-04 06:44:53,860 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:53,860 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-04 06:44:53,923 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:53,923 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 532/770 [00:00<00:00, 5290.72it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5317.33it/s]
INFO:     172.17.0.1:54858 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54858 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54858 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-04 06:44:54.749387513 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-04 06:44:55,423 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:55,425 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:44:55,512 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:55,512 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:44:55,554 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:55,554 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  82%|████████▏ | 632/770 [00:00<00:00, 6290.37it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6316.97it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:39228 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39230 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-05-04 06:44:57,691 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:57,692 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:44:57,779 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:57,779 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:44:57,821 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:57,821 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  77%|███████▋  | 593/770 [00:00<00:00, 5928.08it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6004.00it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39230 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-04 06:44:59,734 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:59,735 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:44:59,835 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:59,836 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:44:59,879 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:44:59,879 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▌   | 502/770 [00:00<00:00, 5014.28it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5175.46it/s]
INFO:     172.17.0.1:39230 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-04 06:45:01,720 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:45:01,721 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:45:01,806 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:45:01,806 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:45:01,848 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:45:01,848 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  77%|███████▋  | 591/770 [00:00<00:00, 5877.44it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5747.63it/s]
INFO:     172.17.0.1:39230 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39230 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39230 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-04 06:42:03.651383906 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-04 06:42:04,397 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:42:04,403 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:42:04,525 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:42:04,525 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:42:04,584 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:42:04,584 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:53166 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53172 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53172 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53172 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53172 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53172 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53172 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-04 06:42:03.639130053 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-04 06:42:04,382 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:42:04,384 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:42:04,516 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:42:04,517 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:42:04,601 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:42:04,602 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:38854 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38866 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38866 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38866 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38866 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38866 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38866 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-04 06:39:11.659097631 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-04 06:39:12,533 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:39:12,535 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:39:12,628 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:39:12,628 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:39:12,669 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:39:12,669 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51286 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51292 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51292 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51292 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51292 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51292 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51292 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-04 06:39:11.683820746 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-04 06:39:12,546 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:39:12,548 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:39:12,717 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:39:12,718 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:39:12,779 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:39:12,780 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:45242 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45254 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45254 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45254 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45254 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45254 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45254 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-04 06:36:26.245284786 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-04 06:36:26,854 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:36:26,858 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:36:26,948 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:36:26,948 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:36:26,989 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:36:26,989 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55208 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55218 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55218 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55218 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55218 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55218 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55218 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-04 06:36:26.522181139 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-04 06:36:27,179 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:36:27,182 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:36:27,292 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:36:27,292 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:36:27,365 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:36:27,365 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46920 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46926 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46926 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46926 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46926 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46926 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46926 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-04 06:33:33.017078403 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-04 06:33:33,656 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:33:33,658 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:33:33,800 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:33:33,800 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:33:33,849 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:33:33,849 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50608 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50616 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50616 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50616 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50616 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50616 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50616 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-04 06:33:32.708721794 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-04 06:33:33,331 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:33:33,334 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:33:33,441 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:33:33,441 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:33:33,511 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:33:33,512 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50030 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50040 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50040 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50040 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50040 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50040 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50040 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-04 06:30:37,915 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:30:37,917 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:30:38,005 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:30:38,005 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:30:38,063 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:30:38,063 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:52394 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52408 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52408 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52408 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52408 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52408 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52408 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-04 06:30:43,108 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:30:43,110 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:30:43,176 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:30:43,176 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:30:43,209 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:30:43,210 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:60130 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60144 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60144 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60144 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60144 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60144 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60144 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-04 06:27:29,908 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:27:29,910 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:27:29,979 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:27:29,979 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:27:30,014 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:27:30,015 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35202 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35214 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35214 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35214 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35214 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35214 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35214 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-04 06:27:29,873 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:27:29,875 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:27:30,013 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:27:30,016 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:27:30,100 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:27:30,101 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57762 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57776 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57776 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57776 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57776 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57776 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57776 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-04 06:24:07,503 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:24:07,505 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:24:07,576 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:24:07,576 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:24:07,611 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:24:07,611 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:54942 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54944 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54944 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54944 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54944 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54944 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54944 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-04 06:24:07,573 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:24:07,576 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-04 06:24:07,709 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:24:07,711 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-04 06:24:07,770 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-04 06:24:07,771 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:45000 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45016 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45016 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45016 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45016 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45016 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45016 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:42642 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42652 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42652 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42652 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42652 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42652 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42652 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:58162 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58166 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58166 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58166 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58166 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58166 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58166 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:40766 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40772 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40772 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40772 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40772 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40772 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40772 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:43000 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43014 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43014 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43014 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43014 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43014 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43014 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:39424 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39426 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39426 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39426 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39426 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39426 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39426 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:43372 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43374 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43374 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43374 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43374 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43374 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43374 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:56948 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56954 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56954 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56954 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56954 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56954 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56954 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:44880 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44896 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:44896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44896 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:44896 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:44896 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:46280 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46286 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46286 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46286 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46286 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46286 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46286 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:42348 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42364 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42364 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42364 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42364 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42364 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42364 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52080 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52086 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52086 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52086 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52086 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52086 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52086 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:57454 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57458 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57458 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57458 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57458 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57458 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57458 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:47998 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48002 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48002 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48002 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48002 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48002 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48002 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:58294 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58306 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58306 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58306 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58306 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58306 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58306 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

