object Versions {
    val gradleVersion = "7.0.1"
    val kotlinVersion = "1.5.10"
    val kotlinSerialization = "1.2.2"
    val coroutinesVersion = "1.3.9"

    object Android {
        val compileSdk = 31
        val targetSdk = 31
        val minSdk = 21
        val versionCode = 1
        val versionName = "1.0.0"
    }

    object AndroidX {
        val core = "1.6.0"
        val appCompat = "1.3.1"
        object Lifecycle {
            val runtime = "2.4.0-alpha03"
        }
    }

    object Koin {
        val core = "3.1.2"
    }

    object Google {
        val material = "1.4.0"
    }

    object Compose {
        val coreVersion = "1.0.1"
        val activity = "1.3.1"
        object Navigation {
            val core = "2.4.0-alpha07"
        }
    }

    object DataStore {
        val preferences = "1.0.0"
    }

    object Retrofit {
        val retrofit = "2.9.0"
        val serializationConverter = "0.8.0"
    }

    object OkHttp {
        val okhttp = "4.9.0"
    }

    object Coil {
        val compose = "1.3.2"
    }
}