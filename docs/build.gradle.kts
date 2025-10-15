plugins {
  id("docling-java-shared")
}

tasks.withType<PublishToMavenRepository>().configureEach {
  enabled = false
}

tasks.withType<PublishToMavenLocal>().configureEach {
  enabled = false
}
