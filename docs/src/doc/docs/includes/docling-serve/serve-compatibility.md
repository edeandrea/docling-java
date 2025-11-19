# Results for ghcr.io/docling-project/docling-serve as of 2025-11-19T20:27:10.879727657Z

Here are the results:

| Tag | Result | Details |
| --- | ------ | ------- |
| v0.9.0 | ❌ FAILURE | [Click for run details](#v0.9.0-details) |
| v0.7.0 | ❌ FAILURE | [Click for run details](#v0.7.0-details) |
| v0.6.0 | ❌ FAILURE | [Click for run details](#v0.6.0-details) |
| v0.8.0 | ❌ FAILURE | [Click for run details](#v0.8.0-details) |
| v0.10.1 | ❌ FAILURE | [Click for run details](#v0.10.1-details) |
| v0.11.0 | ❌ FAILURE | [Click for run details](#v0.11.0-details) |
| v0.12.0 | ❌ FAILURE | [Click for run details](#v0.12.0-details) |
| v0.13.0 | ❌ FAILURE | [Click for run details](#v0.13.0-details) |
| v0.14.0 | ❌ FAILURE | [Click for run details](#v0.14.0-details) |
| v0.16.0 | ❌ FAILURE | [Click for run details](#v0.16.0-details) |
| v0.16.1 | ❌ FAILURE | [Click for run details](#v0.16.1-details) |
| v1.0.1 | ❌ FAILURE | [Click for run details](#v1.0.1-details) |
| v1.0.0 | ❌ FAILURE | [Click for run details](#v1.0.0-details) |
| v0.10.0 | ❌ FAILURE | [Click for run details](#v0.10.0-details) |
| v0.15.0 | ❌ FAILURE | [Click for run details](#v0.15.0-details) |
| v1.2.0 | ❌ FAILURE | [Click for run details](#v1.2.0-details) |
| v1.2.1 | ❌ FAILURE | [Click for run details](#v1.2.1-details) |
| v1.1.0 | ❌ FAILURE | [Click for run details](#v1.1.0-details) |
| v1.3.0 | ❌ FAILURE | [Click for run details](#v1.3.0-details) |
| v1.2.2 | ❌ FAILURE | [Click for run details](#v1.2.2-details) |
| v1.3.1 | ❌ FAILURE | [Click for run details](#v1.3.1-details) |
| v1.4.0 | ❌ FAILURE | [Click for run details](#v1.4.0-details) |
| v1.5.1 | ❌ FAILURE | [Click for run details](#v1.5.1-details) |
| v1.6.0 | ❌ FAILURE | [Click for run details](#v1.6.0-details) |
| v1.7.0 | ❌ FAILURE | [Click for run details](#v1.7.0-details) |
| v1.7.1 | ❌ FAILURE | [Click for run details](#v1.7.1-details) |
| v1.4.1 | ❌ FAILURE | [Click for run details](#v1.4.1-details) |
| v1.7.2 | ❌ FAILURE | [Click for run details](#v1.7.2-details) |
| v1.5.0 | ❌ FAILURE | [Click for run details](#v1.5.0-details) |
| v1.8.0 | ❌ FAILURE | [Click for run details](#v1.8.0-details) |

## Details

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
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:101)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:89)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:58)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
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
INFO:     172.17.0.1:50378 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50384 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:50384 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

```

</details>

</details>

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
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:101)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:89)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:58)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
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
INFO:     172.17.0.1:35588 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35604 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:35604 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:101)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:89)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:58)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
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
INFO:     172.17.0.1:55868 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55880 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:55880 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
	at ai.docling.client.tester.service.TagsTester.checkDoclingResponse(TagsTester.java:101)
	at ai.docling.client.tester.service.TagsTester.doConversion(TagsTester.java:89)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:58)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
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
INFO:     172.17.0.1:36042 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36058 - "GET /health HTTP/1.1" 200 OK
INFO:     172.17.0.1:36058 - "POST /v1/convert/source HTTP/1.1" 404 Not Found

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.10.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.10.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v0.10.1
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob116722338: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.11.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.11.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v0.11.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob1510418117: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.12.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.12.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v0.12.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: failed to register layer: write /usr/share/testpage/index.html: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.13.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.13.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v0.13.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob431635688: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.14.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.14.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v0.14.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob843002040: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.16.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.16.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v0.16.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob301058486: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.16.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.16.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v0.16.1
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob3793828327: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.0.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.0.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.0.1
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob1402901219: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.0.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.0.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.0.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob192598308: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.10.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.10.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v0.10.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: failed to register layer: write /opt/app-root/lib/python3.12/site-packages/google/cloud/obsolete/__init__.py: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.15.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v0.15.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v0.15.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob2766928023: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.2.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.2.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.2.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob1161172098: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.2.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.2.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.2.1
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob3442446778: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.1.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.1.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.1.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob887966167: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.3.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.3.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.3.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob1887426520: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.2.2, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.2.2, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.2.2
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: failed to register layer: write /opt/app-root/bin/ruff: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.3.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.3.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.3.1
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: failed to register layer: write /usr/lib64/libnode.so.127: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.4.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.4.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.4.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob1608298106: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.5.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.5.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.5.1
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob1142504081: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.6.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.6.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.6.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob1226566749: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.7.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.7.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.7.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob45991829: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.7.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.7.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.7.1
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob1731279264: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.4.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.4.1, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.4.1
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob2321095705: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.7.2, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.7.2, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.7.2
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: write /var/lib/docker/tmp/GetImageBlob2303539401: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.5.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.5.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.5.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: failed to register layer: write /opt/app-root/lib/python3.12/site-packages/nvidia/cudnn/lib/libcudnn_engines_precompiled.so.9: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

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
Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.8.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
~~~

</details>

#### Full stack trace

<details open>
<summary>Click to collapse</summary>

```
org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=ghcr.io/docling-project/docling-serve:v1.8.0, imagePullPolicy=DefaultPullPolicy(), imageNameSubstitutor=org.testcontainers.utility.ImageNameSubstitutor$LogWrappedImageNameSubstitutor@185de27c)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1364)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:351)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at ai.docling.client.tester.service.TagsTester.testTag(TagsTester.java:57)
	at ai.docling.client.tester.service.TagsTester.lambda$testTags$0(TagsTester.java:40)
	at ai.docling.client.tester.service.WorkParallelizer.lambda$transformInParallelAndWait$1(WorkParallelizer.java:19)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromItemSupplier.subscribe(UniCreateFromItemSupplier.java:28)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:35)
	at io.smallrye.mutiny.operators.uni.UniRunSubscribeOn.lambda$subscribe$0(UniRunSubscribeOn.java:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for ghcr.io/docling-project/docling-serve:v1.8.0
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:128)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:35)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:41)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1362)
	... 12 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: failed to register layer: write /opt/app-root/lib/python3.12/site-packages/torch/lib/libtorch_cuda.so: no space left on device
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:58)
	at org.testcontainers.images.RemoteDockerImage.pullImage(RemoteDockerImage.java:167)
	at org.testcontainers.images.RemoteDockerImage.lambda$tryImagePullCommand$1(RemoteDockerImage.java:142)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition$ConditionEvaluationWrapper.eval(CallableCondition.java:99)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at org.testcontainers.shaded.org.awaitility.core.SameThreadExecutorService.execute(SameThreadExecutorService.java:79)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:149)
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:109)
	... 16 more

```

</details>

</details>

