plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "docling-java"
include("api", "client", "docs", "testing", "testcontainers")

project(":api").name = "docling-api"
project(":client").name = "docling-client"
project(":docs").name = "docling-docs"
project(":testing").name = "docling-testing"
project(":testcontainers").name = "docling-testcontainers"
