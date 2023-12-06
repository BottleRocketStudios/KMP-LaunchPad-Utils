enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        // Developer NOTE: Use mavenLocal() for debugging as necessary.
        mavenLocal()
        google()
        mavenCentral()
    }
}

rootProject.name = "Launchpad_Utils"
include(":kmp-launchpad-utils")