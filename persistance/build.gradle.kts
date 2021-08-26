plugins {
    id(Plugins.Id.androidLibrary)
    id(Plugins.Id.defaultConfiguration)
}

dependencies {
    implementation(project(Modules.core))
    implementation(Libs.DataStore.preferences)
    implementation(Libs.serialization)
}