plugins {
    id(Plugins.Id.androidLibrary)
    id(Plugins.Id.composeConfiguration)
}

dependencies {
    implementation(Libs.AndroidX.core)
    implementation(Libs.AndroidX.appCompat)
    implementation(Libs.AndroidX.Lifecycle.viewModel)
    implementation(Libs.AndroidX.Lifecycle.liveData)
    implementation(Libs.Google.material)

    implementation(Libs.Compose.ui)
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.activity)

    implementation(Libs.Koin.core)
    implementation(Libs.Koin.android)
    implementation(Libs.Koin.compose)

    implementation(project(Modules.core))
    implementation(project(Modules.designSystem))
    implementation(project(Modules.Component.navigation))

    implementation(Libs.Compose.toolingPreview)
    debugImplementation(Libs.Compose.toolingDebug)
}