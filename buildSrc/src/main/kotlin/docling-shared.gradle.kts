group = "ai.docling"

// Set the project version
// 1) Look at the version property
// 2) If not set, null, or unspecified, look at .github/project.yml and read the release.current-version key
// 3) If still not set, throw an exception
version = findProperty("version")?.toString()?.trim()?.takeIf { !it.isNullOrBlank() && (it != "unspecified") }
    ?: readReleaseCurrentVersion()
    ?: throw GradleException("Unable to determine project version. Either .github/project.yml is missing, 'release.current-version' is not set in it, or -Pversion was not specified on the command line.")

// Reads .github/project.yml and sets the project version from key release.current-version.
// It also exposes the value as a Gradle property named "version" (extra) so other plugins/scripts
// that call property("version") see the correct value.
fun readReleaseCurrentVersion(): String? {
  val yamlFile = rootProject.layout.projectDirectory.dir(".github").file("project.yml")

  if (yamlFile.asFile.exists()) {
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
  }

  return null
}
