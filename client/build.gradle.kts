plugins {
  id("docling-java-shared")
}

dependencies {
  api(platform(libs.jackson.bom))
  api(project(":docling-api"))
  compileOnly(libs.jackson.databind)
  compileOnly(libs.jackson2.databind)

  testImplementation(platform(libs.testcontainers.bom))
  testImplementation(libs.testcontainers.junit.jupiter)
  testImplementation(project(":docling-testcontainers"))
}
