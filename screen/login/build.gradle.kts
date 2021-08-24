plugins {
    id(Plugins.Id.androidLibrary)
    id(Plugins.Id.defaultConfiguration)
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

    implementation(project(Modules.core))
    implementation(project(Modules.designSystem))
    implementation(project(Modules.navigation))

    implementation(Libs.Compose.toolingPreview)
    debugImplementation(Libs.Compose.toolingDebug)
}