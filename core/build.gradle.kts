plugins {
    id(Plugins.Id.androidLibrary)
    id(Plugins.Id.defaultConfiguration)
}

dependencies {
    implementation(Libs.coroutines)
    implementation(Libs.coroutinesCore)
    implementation(Libs.serialization)

    implementation(Libs.Koin.core)
}