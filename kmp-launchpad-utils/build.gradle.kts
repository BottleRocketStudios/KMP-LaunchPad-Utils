plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.dokka)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.ktLint)
    `maven-publish`
}

kotlin {
    applyDefaultHierarchyTemplate()

    androidTarget {
        publishAllLibraryVariants()
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        androidMain.dependencies {
            implementation(libs.firebase.analytics.ktx)
        }
        commonMain.dependencies {
            implementation(libs.kermit)
            implementation(libs.kmp.launchpad.utils.domain)
            implementation(libs.koin.core)
            implementation(libs.kotlin.reflect)
            implementation(libs.kotlin.stdlib.jdk7)
            implementation(libs.kotlinx.coroutines.core)
            implementation(libs.kotlinx.datetime)
            implementation(libs.kotlinx.serialization.json)
            implementation(libs.kvault)
            implementation(libs.napier)
        }
        iosMain.dependencies {}
    }
}

android {
    namespace = "com.bottlerocketstudios.launchpad.utils"
    compileSdk = libs.versions.compile.sdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.min.sdk.get().toInt()
    }
}

ktlint {
    verbose.set(true)
    outputToConsole.set(true)
    ignoreFailures.set(true)
}

group = extra["publishing.group"] as String
version = libs.versions.launchpad.utils.get()

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/BottleRocketStudios/KMP-LaunchPad-Utils")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: System.getenv("LOCAL_GITHUB_USERNAME")
                password = System.getenv("GITHUB_TOKEN") ?: System.getenv("LOCAL_GITHUB_TOKEN")
            }
        }
    }
}
