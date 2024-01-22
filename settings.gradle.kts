enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {maven {
        url = uri("https://maven.pkg.github.com/BottleRocketStudios/kmp-ignite")
        credentials {
            username = System.getenv("REPO_READ_USER")
            password = System.getenv("REPO_READ_TOKEN")
        }
    }
//        mavenLocal()
        google()
        mavenCentral()
    }
}

rootProject.name = "Launchpad_Utils"
include(":kmp-launchpad-utils")