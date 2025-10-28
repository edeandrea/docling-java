plugins {
  id("docling-java-shared")
}

dependencies {
  api(platform(libs.jackson.bom))
  api(libs.jackson.annotations)
  implementation(libs.jackson.databind)
  implementation(libs.jackson2.databind)
  testImplementation(project(":docling-testcontainers"))
}
