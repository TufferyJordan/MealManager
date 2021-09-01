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

    implementation(Libs.Koin.android)
    implementation(Libs.Koin.core)
    implementation(Libs.Koin.compose)

    implementation(Libs.Coil.compose)

    implementation(Libs.Compose.ui)
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.activity)

    implementation(project(Modules.core))
    implementation(project(Modules.network))
    implementation(project(Modules.designSystem))
    implementation(project(Modules.Component.appInfos))

    implementation(Libs.Compose.toolingPreview)
    debugImplementation(Libs.Compose.toolingDebug)
}