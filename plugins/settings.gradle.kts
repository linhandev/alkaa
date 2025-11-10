dependencyResolutionManagement {
    repositories {
        maven("/path/to/local/build/repo")
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
