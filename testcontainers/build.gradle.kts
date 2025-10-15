plugins {
  id("docling-java-shared")
}

dependencies {
  api(platform(libs.testcontainers.bom))
  api("org.testcontainers:junit-jupiter")
}
