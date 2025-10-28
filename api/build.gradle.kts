plugins {
  id("docling-java-shared")
}

dependencies {
  implementation(platform(libs.jackson.bom))
  implementation(libs.jackson.annotations)
  implementation(libs.jackson.databind)
  testImplementation(project(":docling-testcontainers"))
}
