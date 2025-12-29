package ai.docling.serve.api.convert.request.source;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class S3SourceTests {
  private static final S3Source FULL_SOURCE = S3Source.builder()
      .endpoint("s3.amazonaws.com")
      .accessKey("my-access-key")
      .secretKey("my-secret-key")
      .bucket("my-bucket")
      .build();

  @Test
  void endpointRequired() {
    assertThatThrownBy(() -> FULL_SOURCE.toBuilder().endpoint(null).build())
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("endpoint is marked non-null but is null");
  }

  @Test
  void accessKeyRequired() {
    assertThatThrownBy(() -> FULL_SOURCE.toBuilder().accessKey(null).build())
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("accessKey is marked non-null but is null");
  }

  @Test
  void secretKeyRequired() {
    assertThatThrownBy(() -> FULL_SOURCE.toBuilder().secretKey(null).build())
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("secretKey is marked non-null but is null");
  }

  @Test
  void bucketRequired() {
    assertThatThrownBy(() -> FULL_SOURCE.toBuilder().bucket(null).build())
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("bucket is marked non-null but is null");
  }

  @Test
  void verifySSLDefaultCorrect() {
    assertThat(FULL_SOURCE)
        .usingRecursiveComparison()
        .isEqualTo(S3Source.builder()
            .endpoint("s3.amazonaws.com")
            .accessKey("my-access-key")
            .secretKey("my-secret-key")
            .bucket("my-bucket")
            .verifySsl(true)
            .keyPrefix(null)
            .build()
        );
  }

  @Test
  void verifyBuilderCorrect() {
    assertThat(S3Source.builder()
            .endpoint("s3.amazonaws.com")
            .accessKey("my-access-key")
            .secretKey("my-secret-key")
            .bucket("my-bucket")
            .verifySsl(false)
            .keyPrefix("prefix")
            .build())
        .extracting(
            S3Source::getEndpoint,
            S3Source::getAccessKey,
            S3Source::getSecretKey,
            S3Source::getBucket,
            S3Source::isVerifySsl,
            S3Source::getKeyPrefix
        )
        .containsExactly(
            "s3.amazonaws.com",
            "my-access-key",
            "my-secret-key",
            "my-bucket",
            false,
            "prefix"
        );
  }
}
