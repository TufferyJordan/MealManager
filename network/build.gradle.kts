plugins {
    id(Plugins.Id.androidLibrary)
    id(Plugins.Id.defaultConfiguration)
}

dependencies {
    implementation(project(Modules.core))
}