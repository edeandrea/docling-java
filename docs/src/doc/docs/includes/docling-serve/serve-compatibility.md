# Results for ghcr.io/docling-project/docling-serve as of 2025-11-20T00:45:32.858394978Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
| v0.7.0 | ❌ FAILURE | [Click for run details](#v0.7.0-details) |
| v0.8.0 | ❌ FAILURE | [Click for run details](#v0.8.0-details) |
| v0.6.0 | ❌ FAILURE | [Click for run details](#v0.6.0-details) |
| v0.10.0 | ❌ FAILURE | [Click for run details](#v0.10.0-details) |
| v0.9.0 | ❌ FAILURE | [Click for run details](#v0.9.0-details) |
| v0.10.1 | ❌ FAILURE | [Click for run details](#v0.10.1-details) |
| v0.13.0 | ❌ FAILURE | [Click for run details](#v0.13.0-details) |
| v0.12.0 | ❌ FAILURE | [Click for run details](#v0.12.0-details) |
| v0.11.0 | ❌ FAILURE | [Click for run details](#v0.11.0-details) |
| v0.16.0 | ❌ FAILURE | [Click for run details](#v0.16.0-details) |
| v0.15.0 | ❌ FAILURE | [Click for run details](#v0.15.0-details) |
| v0.14.0 | ❌ FAILURE | [Click for run details](#v0.14.0-details) |
| v0.16.1 | ❌ FAILURE | [Click for run details](#v0.16.1-details) |
| v1.0.1 | ✅ SUCCESS | [Click for run details](#v1.0.1-details) |
| v1.0.0 | ✅ SUCCESS | [Click for run details](#v1.0.0-details) |
| v1.1.0 | ✅ SUCCESS | [Click for run details](#v1.1.0-details) |
| v1.2.0 | ✅ SUCCESS | [Click for run details](#v1.2.0-details) |
| v1.2.1 | ✅ SUCCESS | [Click for run details](#v1.2.1-details) |
| v1.2.2 | ✅ SUCCESS | [Click for run details](#v1.2.2-details) |
| v1.3.0 | ✅ SUCCESS | [Click for run details](#v1.3.0-details) |
| v1.3.1 | ✅ SUCCESS | [Click for run details](#v1.3.1-details) |
| v1.4.0 | ✅ SUCCESS | [Click for run details](#v1.4.0-details) |
| v1.4.1 | ✅ SUCCESS | [Click for run details](#v1.4.1-details) |
| v1.5.0 | ✅ SUCCESS | [Click for run details](#v1.5.0-details) |
| v1.5.1 | ✅ SUCCESS | [Click for run details](#v1.5.1-details) |
| v1.6.0 | ✅ SUCCESS | [Click for run details](#v1.6.0-details) |
| v1.7.0 | ✅ SUCCESS | [Click for run details](#v1.7.0-details) |
| v1.7.1 | ✅ SUCCESS | [Click for run details](#v1.7.1-details) |
| v1.7.2 | ✅ SUCCESS | [Click for run details](#v1.7.2-details) |
| v1.8.0 | ✅ SUCCESS | [Click for run details](#v1.8.0-details) |

## Details

### ghcr.io/docling-project/docling-serve:v0.7.0

<details id="v0.7.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:45228 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45230 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45230 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v0.8.0

<details id="v0.8.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:55520 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55530 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55530 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v0.6.0

<details id="v0.6.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:48420 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48436 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:48436 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v0.10.0

<details id="v0.10.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:38806 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38814 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38814 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v0.9.0

<details id="v0.9.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:57150 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57164 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57164 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v0.10.1

<details id="v0.10.1-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:49774 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49782 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49782 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v0.13.0

<details id="v0.13.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:38940 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38942 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38942 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v0.12.0

<details id="v0.12.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:46382 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46394 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46394 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v0.11.0

<details id="v0.11.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:41680 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41692 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:41692 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v0.16.0

<details id="v0.16.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
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
INFO:     172.17.0.1:53054 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53064 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53064 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v0.15.0

<details id="v0.15.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
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
INFO:     172.17.0.1:49752 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49756 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49756 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v0.14.0

<details id="v0.14.0-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
<summary>click to expand</summary>

```
Starting production server 🚀

Server started at http://0.0.0.0:5001
Documentation at http://0.0.0.0:5001/docs

Logs:
INFO:     Started server process [1]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:34826 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34842 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34842 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

### ghcr.io/docling-project/docling-serve:v0.16.1

<details id="v0.16.1-details">
<summary>Click to expand</summary>

#### Message

<details open>
<summary>Click to collapse</summary>

~~~markdown
[Response status should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response status should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:120)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:108)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:63)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:42)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)

```

</details>

#### Docling server logs

<details>
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
INFO:     172.17.0.1:54670 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54672 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54672 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
INFO:     172.17.0.1:55512 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55518 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55518 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:35478 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35484 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35484 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:58614 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58626 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58626 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:57390 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:57404 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:57404 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:55024 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55032 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55032 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:51646 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:51650 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:51650 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:49088 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49096 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49096 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:49424 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49434 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:49434 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:58866 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58872 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:58872 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:56960 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56970 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56970 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:53370 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:53378 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:53378 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:42388 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42404 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42404 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:50472 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50484 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:50484 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:34020 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:34030 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:34030 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
[INFO] 2025-11-20 00:42:33,132 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-20 00:42:33,134 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2025-11-20 00:42:33,245 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-20 00:42:33,245 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2025-11-20 00:42:33,282 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-20 00:42:33,283 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:35552 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35558 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:35558 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
[INFO] 2025-11-20 00:43:31,878 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-20 00:43:31,879 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2025-11-20 00:43:31,931 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-20 00:43:31,931 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2025-11-20 00:43:31,956 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-20 00:43:31,956 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:47230 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:47244 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:47244 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
[INFO] 2025-11-20 00:45:24,654 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-20 00:45:24,655 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2025-11-20 00:45:24,705 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-20 00:45:24,705 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2025-11-20 00:45:24,729 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-20 00:45:24,729 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:43374 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:43390 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:43390 - "POST /v1/convert/source HTTP/1.1" 200 OK

```

</details>

</details>

