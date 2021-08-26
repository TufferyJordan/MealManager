package plugins

import Versions
import com.android.build.gradle.AppExtension
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Gradle Plugin defining a default configuration for a build.gradle.kts of a module
 */
class DefaultConfigurationPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.plugins.apply("kotlin-android")
        project.plugins.apply("kotlin-parcelize")

        // Configure common android build parameters.
        val androidExtension = project.extensions.getByName("android")

        if (androidExtension is BaseExtension) {
            androidExtension.apply {
                compileSdkVersion(Versions.Android.compileSdk)

                defaultConfig {
                    targetSdk = Versions.Android.targetSdk
                    minSdk = Versions.Android.minSdk
                    versionCode = 1
                    versionName = "1.0.0"

                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                    vectorDrawables {
                        useSupportLibrary = true
                    }
                }

                val proguardFile = "proguard-rules.pro"
                when (this) {
                    is LibraryExtension -> defaultConfig { consumerProguardFiles(proguardFile) }
                    is AppExtension -> buildTypes {
                        getByName("debug") {
                            isDebuggable = true
                        }
                        getByName("release") {
                            isMinifyEnabled = false
                            isDebuggable = false
                            proguardFiles(
                                getDefaultProguardFile("proguard-android-optimize.txt"),
                                proguardFile
                            )
                        }
                    }
                }

                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_1_8
                    targetCompatibility = JavaVersion.VERSION_1_8
                }

                testOptions.unitTests.isIncludeAndroidResources = true
            }
        }
    }
}