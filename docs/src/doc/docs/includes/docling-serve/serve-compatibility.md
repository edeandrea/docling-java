# Results for ghcr.io/docling-project/docling-serve as of 2026-05-18T07:42:32.902943365Z

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
2026-05-18 07:42:20.597010453 [W:onnxruntime:Default, device_discovery.cc:133 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename "5620e0c7-8062-4dce-aeb7-520c7ef76171" did not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-18 07:42:20,855 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:42:20,856 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-18 07:42:20,947 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:42:20,947 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-18 07:42:20,992 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:42:20,992 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 520/770 [00:00<00:00, 5183.89it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5223.57it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55018 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55034 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-05-18 07:42:22,502 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:42:22,503 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-18 07:42:22,592 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:42:22,592 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-18 07:42:22,637 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:42:22,637 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▉   | 533/770 [00:00<00:00, 5314.27it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5298.96it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55034 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-18 07:42:24,516 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:42:24,517 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-18 07:42:24,607 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:42:24,608 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-18 07:42:24,653 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:42:24,653 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  69%|██████▊   | 529/770 [00:00<00:00, 5288.92it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5290.49it/s]
INFO:     172.17.0.1:55034 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-18 07:42:26,528 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:42:26,529 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-18 07:42:26,617 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:42:26,618 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-18 07:42:26,664 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:42:26,664 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  66%|██████▋   | 512/770 [00:00<00:00, 5116.99it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5168.49it/s]
INFO:     172.17.0.1:55034 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55034 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55034 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-18 07:40:37.617686745 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-18 07:40:38,386 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:40:38,389 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-18 07:40:38,575 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:40:38,575 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-18 07:40:38,623 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:40:38,623 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  51%|█████     | 390/770 [00:00<00:00, 3896.09it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4306.61it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:37976 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37990 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-05-18 07:40:40,567 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:40:40,567 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-18 07:40:40,658 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:40:40,659 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-18 07:40:40,704 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:40:40,704 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  68%|██████▊   | 525/770 [00:00<00:00, 5246.00it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5199.73it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:37990 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-18 07:40:42,613 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:40:42,614 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-18 07:40:42,713 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:40:42,714 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-18 07:40:42,761 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:40:42,761 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  62%|██████▏   | 474/770 [00:00<00:00, 4722.64it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4600.92it/s]
INFO:     172.17.0.1:37990 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-18 07:40:44,623 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:40:44,623 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_mobile.onnx
[INFO] 2026-05-18 07:40:44,761 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:40:44,762 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_mobile.onnx
[INFO] 2026-05-18 07:40:44,808 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:40:44,808 [RapidOCR] main.py:57: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_mobile.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|██████    | 463/770 [00:00<00:00, 4628.10it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4586.09it/s]
INFO:     172.17.0.1:37990 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:37990 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:37990 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-18 07:40:56.506047154 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-18 07:41:00,780 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:41:00,782 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:41:00,909 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:41:00,910 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:41:00,976 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:41:00,976 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  60%|██████    | 463/770 [00:00<00:00, 4625.19it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5014.42it/s]
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:56662 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56664 - "GET /health HTTP/1.1" 200 OK
[INFO] 2026-05-18 07:41:02,770 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:41:02,770 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:41:02,881 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:41:02,881 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:41:02,946 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:41:02,947 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  57%|█████▋    | 440/770 [00:00<00:00, 4391.21it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 4391.12it/s]
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56664 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-18 07:41:04,813 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:41:04,813 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:41:04,946 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:41:04,946 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:41:04,993 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:41:04,994 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  63%|██████▎   | 484/770 [00:00<00:00, 4828.03it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 6242.53it/s]
INFO:     172.17.0.1:56664 - "POST /v1/convert/source HTTP/1.1" 200 OK
[INFO] 2026-05-18 07:41:06,834 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:41:06,834 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:41:07,102 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:41:07,102 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:41:07,192 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:41:07,192 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
Loading weights:   0%|          | 0/770 [00:00<?, ?it/s]Loading weights:  58%|█████▊    | 443/770 [00:00<00:00, 4408.89it/s]Loading weights: 100%|██████████| 770/770 [00:00<00:00, 5244.73it/s]
INFO:     172.17.0.1:56664 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56664 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56664 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-18 07:37:57.100318951 [W:onnxruntime:Default, device_discovery.cc:132 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-18 07:37:57,606 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:37:57,608 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:37:57,724 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:37:57,724 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:37:57,838 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:37:57,839 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35876 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35890 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35890 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35890 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35890 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35890 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35890 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-18 07:37:56.214468866 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-18 07:37:56,740 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:37:56,741 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:37:56,847 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:37:56,847 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:37:56,907 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:37:56,908 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57742 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57754 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57754 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57754 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57754 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57754 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57754 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-18 07:35:01.372938773 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-18 07:35:01,842 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:35:01,844 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:35:01,934 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:35:01,934 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:35:01,976 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:35:01,976 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:53738 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53746 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53746 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53746 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53746 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53746 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53746 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-18 07:34:59.513433531 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-18 07:34:59,998 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:35:00,000 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:35:00,144 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:35:00,144 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:35:00,201 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:35:00,201 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59220 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59236 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59236 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59236 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59236 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59236 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59236 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-18 07:32:20.152977491 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-18 07:32:20,656 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:32:20,658 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:32:20,761 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:32:20,761 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:32:20,822 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:32:20,822 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:36704 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36714 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36714 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36714 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36714 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:36714 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:36714 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-18 07:32:12.726666870 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-18 07:32:13,320 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:32:13,323 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:32:13,454 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:32:13,454 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:32:13,509 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:32:13,509 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57478 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57494 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57494 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57494 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57494 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:57494 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:57494 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-18 07:29:33.967744685 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-18 07:29:34,475 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:29:34,477 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:29:34,573 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:29:34,573 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:29:34,620 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:29:34,620 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:53004 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53018 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53018 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53018 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53018 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53018 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53018 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
2026-05-18 07:29:28.097632628 [W:onnxruntime:Default, device_discovery.cc:131 GetPciBusId] Skipping pci_bus_id for PCI path at "/sys/devices/LNXSYSTM:00/LNXSYBUS:00/ACPI0004:00/MSFT1000:00/5620e0c7-8062-4dce-aeb7-520c7ef76171" because filename ""5620e0c7-8062-4dce-aeb7-520c7ef76171"" dit not match expected pattern of [0-9a-f]+:[0-9a-f]+:[0-9a-f]+[.][0-9a-f]+[m
[INFO] 2026-05-18 07:29:28,632 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:29:28,634 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:29:28,771 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:29:28,771 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:29:28,836 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:29:28,837 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:52780 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52788 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52788 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52788 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52788 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52788 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52788 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-18 07:26:27,706 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:26:27,708 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:26:27,836 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:26:27,836 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:26:27,878 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:26:27,878 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59840 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59842 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59842 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59842 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59842 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:59842 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:59842 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-18 07:26:39,726 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:26:39,729 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:26:39,821 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:26:39,822 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:26:39,859 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:26:39,859 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:42268 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42284 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42284 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42284 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42284 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42284 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42284 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-18 07:23:17,469 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:23:17,471 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:23:17,594 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:23:17,594 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:23:17,676 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:23:17,676 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:42436 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42440 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42440 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42440 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42440 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:42440 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:42440 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-18 07:23:17,427 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:23:17,430 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:23:17,556 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:23:17,557 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:23:17,594 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:23:17,594 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:52104 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52108 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52108 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52108 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52108 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52108 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52108 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-18 07:19:55,949 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:19:55,952 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:19:56,063 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:19:56,064 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:19:56,117 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:19:56,117 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:52204 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52220 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52220 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52220 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52220 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:52220 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:52220 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
[INFO] 2026-05-18 07:19:53,585 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:19:53,587 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2026-05-18 07:19:53,702 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:19:53,702 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2026-05-18 07:19:53,762 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2026-05-18 07:19:53,762 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:60664 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60672 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60672 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60672 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60672 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:60672 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:60672 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:46404 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46410 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46410 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46410 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46410 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:46410 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:46410 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:56044 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56056 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56056 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56056 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56056 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:56056 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:56056 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:47126 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47128 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47128 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47128 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47128 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:47128 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:47128 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:38848 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38864 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38864 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38864 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38864 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38864 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38864 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:34432 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34436 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34436 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34436 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34436 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:34436 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:34436 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:55656 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55658 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55658 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55658 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55658 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:55658 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:55658 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:39950 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39954 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39954 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39954 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39954 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:39954 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:39954 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:58618 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58632 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58632 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58632 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58632 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:58632 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:58632 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:35228 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35236 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35236 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35236 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35236 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:35236 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:35236 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:39996 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40002 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40002 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40002 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40002 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:40002 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:40002 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:53458 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53474 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53474 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53474 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53474 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53474 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53474 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:38376 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38384 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38384 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38384 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38384 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38384 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38384 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:38522 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38524 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38524 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38524 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38524 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:38524 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:38524 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:53238 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53242 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53242 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53242 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53242 - "POST /v1/convert/source HTTP/1.1" 200 OK
INFO:     172.17.0.1:53242 - "GET /v1/clear/converters HTTP/1.1" 200 OK
INFO:     172.17.0.1:53242 - "GET /v1/clear/results?older_then=3600 HTTP/1.1" 200 OK

```

</details>

</details>

