group = "ai.docling"

// Reads .github/project.yml and sets the project version from key release.current-version.
// It also exposes the value as a Gradle property named "version" (extra) so other plugins/scripts
// that call property("version") see the correct value.

fun readReleaseCurrentVersion(): String? {
  val yamlFile = rootProject.layout.projectDirectory.dir(".github").file("project.yml")

  if (!yamlFile.asFile.exists()) {
    throw GradleException("Missing .github/project.yml file in root project directory. Unable to determine project version.")
  }

  val yaml = org.yaml.snakeyaml.Yaml()

  yamlFile.asFile.inputStream().use { input ->
    val data = yaml.load<Any>(input) ?: return null

    if (data is Map<*, *>) {
      val release = data["release"]

      if (release is Map<*, *>) {
        val current = release["current-version"]

        if (current is String) {
          return current.trim()
        }
      }
    }
  }

  return null
}

version = readReleaseCurrentVersion() ?: property("version").toString()
