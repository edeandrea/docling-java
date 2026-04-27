# Results for ghcr.io/docling-project/docling-serve as of 2026-04-27T06:39:53.079588421Z

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
2026-04-27 06:37:47.798176545 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-27 06:37:48,428 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:37:48,430 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-04-27 06:37:48,521 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:37:48,521 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-04-27 06:37:48,568 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:37:48,568 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 498/770 [00:00<00:00, 4971.01it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5046.69it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:36360 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36374 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-04-27 06:37:49,803 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:37:49,804 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-04-27 06:37:49,890 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:37:49,891 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-04-27 06:37:49,936 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:37:49,936 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▌   | 506/770 [00:00<00:00, 5058.93it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5029.49it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36374 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-04-27 06:37:51,825 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:37:51,825 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-04-27 06:37:51,933 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:37:51,934 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-04-27 06:37:51,978 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:37:51,979 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  65%|██████▍   | 497/770 [00:00<00:00, 4941.27it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5054.82it/s]
INFO:     172.17.0.1:36374 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-04-27 06:37:53,838 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:37:53,838 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-04-27 06:37:53,928 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:37:53,929 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-04-27 06:37:53,974 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:37:53,974 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  64%|██████▎   | 490/770 [00:00<00:00, 4870.97it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5109.33it/s]
INFO:     172.17.0.1:36374 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36374 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36374 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-27 06:39:41.060137462 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-27 06:39:41,638 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:39:41,640 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:39:41,718 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:39:41,719 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:39:41,760 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:39:41,760 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 535/770 [00:00<00:00, 5347.44it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5320.17it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57606 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57614 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-04-27 06:39:43,439 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:39:43,439 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:39:43,517 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:39:43,517 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:39:43,558 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:39:43,559 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▊   | 529/770 [00:00<00:00, 5282.88it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5361.33it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57614 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-04-27 06:39:45,459 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:39:45,459 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:39:45,536 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:39:45,537 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:39:45,578 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:39:45,578 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▊   | 528/770 [00:00<00:00, 5275.78it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5314.11it/s]
INFO:     172.17.0.1:57614 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-04-27 06:39:47,465 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:39:47,465 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:39:47,546 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:39:47,546 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:39:47,588 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:39:47,588 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  70%|██████▉   | 536/770 [00:00<00:00, 5359.44it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5372.58it/s]
INFO:     172.17.0.1:57614 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57614 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57614 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-27 06:35:49.370325304 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-27 06:35:49,915 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:35:49,917 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:35:50,007 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:35:50,007 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:35:50,053 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:35:50,053 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:41402 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41404 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41404 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41404 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41404 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41404 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41404 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-27 06:34:57.235661388 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-27 06:34:58,009 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:34:58,012 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:34:58,153 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:34:58,153 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:34:58,238 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:34:58,238 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:53316 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53320 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53320 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53320 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53320 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53320 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53320 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-27 06:33:07.021955594 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-27 06:33:08,055 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:33:08,058 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:33:08,165 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:33:08,165 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:33:08,235 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:33:08,235 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51374 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51378 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51378 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51378 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51378 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51378 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51378 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-27 06:32:13.433775736 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-27 06:32:14,115 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:32:14,118 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:32:14,230 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:32:14,231 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:32:14,295 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:32:14,296 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57350 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57362 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57362 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57362 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57362 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57362 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57362 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-27 06:30:31.106985961 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-27 06:30:31,876 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:30:31,879 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:30:32,020 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:30:32,021 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:30:32,103 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:30:32,103 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50032 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50034 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50034 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50034 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-27 06:27:43.740854285 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-27 06:27:44,507 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:27:44,509 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:27:44,660 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:27:44,660 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:27:44,732 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:27:44,732 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51456 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51468 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51468 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51468 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51468 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51468 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51468 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-27 06:29:13.255710899 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-27 06:29:14,009 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:29:14,012 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:29:14,185 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:29:14,186 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:29:14,283 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:29:14,283 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46576 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46584 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46584 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46584 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46584 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46584 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46584 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-04-27 06:25:19.338398195 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-04-27 06:25:19,892 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:25:19,895 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:25:19,991 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:25:19,991 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:25:20,081 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:25:20,086 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:52286 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52292 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52292 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52292 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52292 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52292 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52292 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-04-27 06:25:20,566 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:25:20,568 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:25:20,650 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:25:20,651 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:25:20,687 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:25:20,687 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:58306 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58320 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58320 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58320 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58320 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58320 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58320 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-04-27 06:22:27,316 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:22:27,318 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:22:27,414 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:22:27,415 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:22:27,451 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:22:27,451 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:50780 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50794 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50794 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50794 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50794 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50794 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50794 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-04-27 06:22:27,344 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:22:27,349 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:22:27,482 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:22:27,482 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:22:27,554 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:22:27,555 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:53596 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53598 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53598 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53598 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53598 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53598 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53598 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-04-27 06:18:56,698 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:18:56,722 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:18:56,809 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:18:56,809 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:18:56,864 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:18:56,864 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:52946 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52948 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52948 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52948 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52948 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52948 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52948 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-04-27 06:18:25,027 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:18:25,030 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:18:25,118 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:18:25,119 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:18:25,221 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:18:25,222 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:51912 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51916 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51916 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51916 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51916 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51916 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51916 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-04-27 06:15:20,784 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:15:20,923 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-04-27 06:15:21,316 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:15:21,316 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-04-27 06:15:21,360 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-04-27 06:15:21,360 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56354 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56356 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56356 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56356 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56356 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56356 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56356 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:54960 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54974 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54974 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54974 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54974 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:54974 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:54974 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:53192 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53200 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53200 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53200 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53200 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53200 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53200 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:58246 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58262 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58262 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58262 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58262 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58262 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58262 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:45570 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45576 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:45576 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45576 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45576 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:45576 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:45576 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:48454 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48456 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48456 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48456 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48456 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48456 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48456 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:43230 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43234 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43234 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43234 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43234 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:43234 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:43234 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:42548 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42558 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42558 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42558 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42558 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42558 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42558 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:33200 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33212 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33212 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33212 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33212 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:33212 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:33212 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:47648 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47664 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47664 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47664 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47664 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47664 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47664 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:48466 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48476 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48476 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48476 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48476 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48476 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48476 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:48912 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48916 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:48916 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48916 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48916 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:48916 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:48916 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:51272 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51286 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51286 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51286 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51286 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:51286 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:51286 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50630 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50638 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50638 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50638 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50638 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:50638 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:50638 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:41164 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41174 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:41174 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41174 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41174 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:41174 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:41174 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

