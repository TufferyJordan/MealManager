plugins {
    id(Plugins.Id.androidLibrary)
    id(Plugins.Id.defaultConfiguration)
}

dependencies {
    implementation(Libs.coroutines)
    implementation(project(Modules.core))

    implementation(Libs.Compose.ui)
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.activity)

}