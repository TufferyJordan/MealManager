object Libs {
    object AndroidX {
        val core = "androidx.core:core-ktx:${Versions.AndroidX.core}"
        val appCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appCompat}"
        object Lifecycle {
            val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.Lifecycle.runtime}"
        }
    }
    object Google {
        val material = "com.google.android.material:material:${Versions.Google}"
    }
    object Compose {
        val ui = "androidx.compose.ui:ui:${Versions.Compose.coreVersion}"
        val material = "androidx.compose.material:material:${Versions.Compose.coreVersion}"
        val activity = "androidx.activity:activity-compose:${Versions.Compose.activity}"

        val toolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.Compose.coreVersion}"
        val toolingDebug = "androidx.compose.ui:ui-tooling:${Versions.Compose.coreVersion}"
    }
}