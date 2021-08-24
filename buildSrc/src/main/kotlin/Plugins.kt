object Plugins {
    // use id()
    object Id {
        const val androidApplication = "com.android.application"
        const val androidLibrary = "com.android.library"

        const val defaultConfiguration = "default-configuration"
    }

    // use kotlin()
    object Kotlin {
        const val android = "android"
        const val androidExt = "android.extensions"
        const val kapt = "kapt"
        const val kotlinxSerialization = "plugin.serialization"
    }
}