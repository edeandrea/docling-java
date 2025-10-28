plugins {
  id("docling-java-shared")
}

dependencies {
  implementation(platform(libs.jackson.bom))
  implementation(libs.jackson.annotations)
  implementation(libs.jackson.databind)
  implementation(libs.jackson2.databind)
  testImplementation(project(":docling-testcontainers"))
}
