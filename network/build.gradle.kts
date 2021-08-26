plugins {
    id(Plugins.Id.androidLibrary)
    id(Plugins.Id.defaultConfiguration)
    kotlin(Plugins.Kotlin.kotlinxSerialization) version Versions.kotlinVersion
}

dependencies {
    implementation(Libs.serialization)
    implementation(Libs.coroutines)

    implementation(Libs.Koin.core)
    implementation(Libs.Koin.android)

    implementation(project(Modules.core))
    implementation(project(Modules.common))
    implementation(project(Modules.Component.appInfos))

    implementation(Libs.OkHttp.okhttp)

    implementation(Libs.Retrofit.retrofit)
    implementation(Libs.Retrofit.serializationConverter)
}