plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "docling-java"
include("docling-api", "docling-serve-client", "docs", "docling-testing", "docling-testcontainers")
