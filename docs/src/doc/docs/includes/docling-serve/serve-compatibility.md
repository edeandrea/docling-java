# Results for ghcr.io/docling-project/docling-serve as of 2025-11-19T21:55:37.041610819Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
| v0.7.0 | ❌ FAILURE | [Click for run details](#v0.7.0-details) |
| v0.6.0 | ❌ FAILURE | [Click for run details](#v0.6.0-details) |
| v0.8.0 | ❌ FAILURE | [Click for run details](#v0.8.0-details) |
| v0.9.0 | ❌ FAILURE | [Click for run details](#v0.9.0-details) |
| v0.10.0 | ❌ FAILURE | [Click for run details](#v0.10.0-details) |
| v0.10.1 | ❌ FAILURE | [Click for run details](#v0.10.1-details) |
| v0.11.0 | ❌ FAILURE | [Click for run details](#v0.11.0-details) |
| v0.12.0 | ❌ FAILURE | [Click for run details](#v0.12.0-details) |
| v0.13.0 | ❌ FAILURE | [Click for run details](#v0.13.0-details) |
| v0.14.0 | ❌ FAILURE | [Click for run details](#v0.14.0-details) |
| v0.15.0 | ❌ FAILURE | [Click for run details](#v0.15.0-details) |
| v0.16.0 | ❌ FAILURE | [Click for run details](#v0.16.0-details) |
| v1.0.0 | ✅ SUCCESS | [Click for run details](#v1.0.0-details) |
| v0.16.1 | ❌ FAILURE | [Click for run details](#v0.16.1-details) |
| v1.1.0 | ✅ SUCCESS | [Click for run details](#v1.1.0-details) |
| v1.0.1 | ✅ SUCCESS | [Click for run details](#v1.0.1-details) |
| v1.2.1 | ✅ SUCCESS | [Click for run details](#v1.2.1-details) |
| v1.2.0 | ✅ SUCCESS | [Click for run details](#v1.2.0-details) |
| v1.2.2 | ✅ SUCCESS | [Click for run details](#v1.2.2-details) |
| v1.3.0 | ✅ SUCCESS | [Click for run details](#v1.3.0-details) |
| v1.3.1 | ✅ SUCCESS | [Click for run details](#v1.3.1-details) |
| v1.4.0 | ✅ SUCCESS | [Click for run details](#v1.4.0-details) |
| v1.4.1 | ✅ SUCCESS | [Click for run details](#v1.4.1-details) |
| v1.5.0 | ✅ SUCCESS | [Click for run details](#v1.5.0-details) |
| v1.5.1 | ✅ SUCCESS | [Click for run details](#v1.5.1-details) |
| v1.6.0 | ✅ SUCCESS | [Click for run details](#v1.6.0-details) |
| v1.7.1 | ✅ SUCCESS | [Click for run details](#v1.7.1-details) |
| v1.7.0 | ✅ SUCCESS | [Click for run details](#v1.7.0-details) |
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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:46696 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46708 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46708 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:46730 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46740 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46740 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:42042 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42048 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42048 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:33610 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33624 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33624 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:58280 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58288 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:58288 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:45976 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45982 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:45982 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:44062 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44066 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44066 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:40612 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40626 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40626 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:59426 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59440 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59440 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:37158 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37168 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:37168 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:49170 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49184 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:49184 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:44688 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44690 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:44690 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
INFO:     172.17.0.1:40254 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40256 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40256 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
[Response tatus should not be null or empty] 
Expecting actual not to be null
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
java.lang.AssertionError: [Response tatus should not be null or empty] 
Expecting actual not to be null
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:111)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:99)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:60)
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
INFO:     172.17.0.1:40902 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40918 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40918 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
INFO:     172.17.0.1:36032 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36038 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36038 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:54282 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:54290 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:54290 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52278 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52280 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52280 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:56468 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:56472 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:56472 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:33610 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:33626 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:33626 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:52530 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:52544 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:52544 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:39654 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:39662 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:39662 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:42240 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:42242 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:42242 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:40616 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40632 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40632 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:60140 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:60150 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:60150 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:46982 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:46994 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:46994 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:36424 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36440 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:36440 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
[INFO] 2025-11-19 21:49:25,666 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-19 21:49:25,668 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2025-11-19 21:49:25,800 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-19 21:49:25,800 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2025-11-19 21:49:25,854 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-19 21:49:25,854 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:59944 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:59960 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:59960 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
INFO:     172.17.0.1:55238 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55248 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:55248 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
[INFO] 2025-11-19 21:54:45,282 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-19 21:54:45,284 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2025-11-19 21:54:45,406 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-19 21:54:45,407 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2025-11-19 21:54:45,452 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-19 21:54:45,452 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:38686 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:38690 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:38690 - "POST /v1/convert/source HTTP/1.1" 200 OK

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
[INFO] 2025-11-19 21:55:26,709 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-19 21:55:26,710 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/det/ch_PP-OCRv4_det_infer.onnx
[INFO] 2025-11-19 21:55:26,776 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-19 21:55:26,776 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/cls/ch_ppocr_mobile_v2.0_cls_infer.onnx
[INFO] 2025-11-19 21:55:26,811 [RapidOCR] base.py:22: Using engine_name: onnxruntime
[INFO] 2025-11-19 21:55:26,811 [RapidOCR] main.py:53: Using /opt/app-root/src/.cache/docling/models/RapidOcr/onnx/PP-OCRv4/rec/ch_PP-OCRv4_rec_infer.onnx
INFO:     Application startup complete.
INFO:     Uvicorn running on http://0.0.0.0:5001 (Press CTRL+C to quit)
INFO:     172.17.0.1:40182 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:40198 - "GET /health HTTP/1.1" 200 OK
WARNING:docling_core.types.doc.document:Parameter `strict_text` has been deprecated and will be ignored.
INFO:     172.17.0.1:40198 - "POST /v1/convert/source HTTP/1.1" 200 OK

```

</details>

</details>

