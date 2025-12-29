package ai.docling.serve.api.convert.request.target;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class S3TargetTests {
  private static final S3Target FULL_TARGET = S3Target.builder()
      .endpoint("s3.amazonaws.com")
      .accessKey("my-access-key")
      .secretKey("my-secret-key")
      .bucket("my-bucket")
      .build();

  @Test
  void endpointRequired() {
    assertThatThrownBy(() -> FULL_TARGET.toBuilder().endpoint(null).build())
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("endpoint is marked non-null but is null");
  }

  @Test
  void accessKeyRequired() {
    assertThatThrownBy(() -> FULL_TARGET.toBuilder().accessKey(null).build())
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("accessKey is marked non-null but is null");
  }

  @Test
  void secretKeyRequired() {
    assertThatThrownBy(() -> FULL_TARGET.toBuilder().secretKey(null).build())
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("secretKey is marked non-null but is null");
  }

  @Test
  void bucketRequired() {
    assertThatThrownBy(() -> FULL_TARGET.toBuilder().bucket(null).build())
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("bucket is marked non-null but is null");
  }

  @Test
  void verifySSLDefaultCorrect() {
    assertThat(FULL_TARGET)
        .usingRecursiveComparison()
        .isEqualTo(S3Target.builder()
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
    assertThat(S3Target.builder()
            .endpoint("s3.amazonaws.com")
            .accessKey("my-access-key")
            .secretKey("my-secret-key")
            .bucket("my-bucket")
            .verifySsl(false)
            .keyPrefix("prefix")
            .build())
        .extracting(
            S3Target::getEndpoint,
            S3Target::getAccessKey,
            S3Target::getSecretKey,
            S3Target::getBucket,
            S3Target::isVerifySsl,
            S3Target::getKeyPrefix
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
