package ai.docling.client;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import ai.docling.client.DoclingClient.DoclingClientBuilder;

class DoclingClientBuilderFactoryTests {
  @Test
  void correctBuilderWhenBothArePresent() {
    assertThat(DoclingClientBuilderFactory.<DoclingClient, DoclingClientBuilder>newBuilder())
        .isNotNull()
        .isExactlyInstanceOf(DoclingJackson3Client.Builder.class);
  }

  @ParameterizedTest
  @MethodSource("correctBuilderArguments")
  void correctBuilder(String classToHide, Class<?> expectedBuilderClass) {
    var classLoader = new DelegatingClassLoader(classToHide, Thread.currentThread().getContextClassLoader());

    assertThat(DoclingClientBuilderFactory.<DoclingClient, DoclingClientBuilder>newBuilder(classLoader))
        .isNotNull()
        .isExactlyInstanceOf(expectedBuilderClass);
  }

  static Stream<Arguments> correctBuilderArguments() {
    return Stream.of(
        Arguments.of("com.fasterxml.jackson.databind.json.JsonMapper", DoclingJackson3Client.Builder.class),
        Arguments.of("tools.jackson.databind.json.JsonMapper", DoclingJackson2Client.Builder.class)
    );
  }

  private static class DelegatingClassLoader extends ClassLoader {
    private final String classToHide;
    private final ClassLoader parent;

    public DelegatingClassLoader(String classToHide, ClassLoader parent) {
      super(parent);

      this.classToHide = classToHide;
      this.parent = parent;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
      if (classToHide.equals(name)) {
        throw new ClassNotFoundException("Class %s not found".formatted(classToHide));
      }

      return super.loadClass(name);
    }
  }
}
