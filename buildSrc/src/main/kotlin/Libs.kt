object Libs {
    val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinSerialization}"
    val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"

    object AndroidX {
        val core = "androidx.core:core-ktx:${Versions.AndroidX.core}"
        val appCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appCompat}"

        object Lifecycle {
            val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.Lifecycle.runtime}"
            val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.AndroidX.Lifecycle.runtime}"
            val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.Lifecycle.runtime}"
        }
    }

    object Koin {
        val core = "io.insert-koin:koin-core:${Versions.Koin.core}"
        val android = "io.insert-koin:koin-android:${Versions.Koin.core}"
        val compose = "io.insert-koin:koin-androidx-compose:${Versions.Koin.core}"
    }

    object Google {
        val material = "com.google.android.material:material:${Versions.Google.material}"
    }

    object Compose {
        val ui = "androidx.compose.ui:ui:${Versions.Compose.coreVersion}"
        val material = "androidx.compose.material:material:${Versions.Compose.coreVersion}"
        val activity = "androidx.activity:activity-compose:${Versions.Compose.activity}"

        val toolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.Compose.coreVersion}"
        val toolingDebug = "androidx.compose.ui:ui-tooling:${Versions.Compose.coreVersion}"

        object Navigation {
            val core = "androidx.navigation:navigation-compose:${Versions.Compose.Navigation.core}"
        }
    }

    object DataStore {
        val preferences = "androidx.datastore:datastore-preferences:${Versions.DataStore.preferences}"
    }

    object Retrofit {
        val retrofit = "com.squareup.retrofit2:retrofit:${Versions.Retrofit.retrofit}"
        val serializationConverter = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.Retrofit.serializationConverter}"
    }

    object OkHttp {
        val okhttp = "com.squareup.okhttp3:okhttp:${Versions.OkHttp.okhttp}"
    }

    object Coil {
        val compose = "io.coil-kt:coil-compose:${Versions.Coil.compose}"
    }
}