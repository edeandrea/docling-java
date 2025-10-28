plugins {
  id("docling-java-shared")
}

dependencies {
  api(project(":docling-api"))
  api(platform(libs.jackson.bom))
  compileOnly(libs.jackson.databind)
  compileOnly(libs.jackson2.databind)

  testImplementation(platform(libs.testcontainers.bom))
  testImplementation(libs.testcontainers.junit.jupiter)
  testImplementation(project(":docling-testcontainers"))
}
