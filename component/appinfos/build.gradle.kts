plugins {
    id(Plugins.Id.androidLibrary)
    id(Plugins.Id.defaultConfiguration)
    kotlin(Plugins.Kotlin.kotlinxSerialization) version Versions.kotlinVersion
}

dependencies {
    implementation(Libs.serialization)
    implementation(project(Modules.core))
}