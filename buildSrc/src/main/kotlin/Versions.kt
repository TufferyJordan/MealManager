object Versions {
    val gradleVersion = "7.0.1"
    val kotlinVersion = "1.5.10"

    object Android {
        val compileSdk = 30
        val targetSdk = 30
        val minSdk = 21
        val versionCode = 1
        val versionName = "1.0.0"
    }
    object AndroidX {
        val core = "1.6.0"
        val appCompat = "1.3.1"
        object Lifecycle {
            val runtime = "2.3.1"
        }
    }
    object Google {
        val material = "1.4.0"
    }
    object Compose {
        val coreVersion = "1.0.1"
        val activity = "1.3.1"
    }
}