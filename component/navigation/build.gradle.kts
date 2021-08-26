plugins {
    id(Plugins.Id.androidLibrary)
    id(Plugins.Id.composeConfiguration)
}

dependencies {
    implementation(Libs.coroutines)
    implementation(project(Modules.core))

    implementation(Libs.Compose.ui)
    implementation(Libs.Compose.activity)
}