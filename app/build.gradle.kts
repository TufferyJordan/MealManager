plugins {
    id(Plugins.Id.androidApplication)
    kotlin(Plugins.Kotlin.android)
    kotlin(Plugins.Kotlin.androidExt)
    kotlin(Plugins.Kotlin.kotlinxSerialization) version Versions.kotlinVersion
}

android {
    compileSdk = Versions.Android.compileSdk
    defaultConfig {
        applicationId = "com.jtuffery.mealmanager"
        minSdk = Versions.Android.minSdk
        targetSdk = Versions.Android.targetSdk
        versionCode = Versions.Android.versionCode
        versionName = Versions.Android.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.Compose.coreVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Libs.AndroidX.core)
    implementation(Libs.AndroidX.appCompat)
    implementation(Libs.AndroidX.Lifecycle.viewModel)
    implementation(Libs.AndroidX.Lifecycle.liveData)
    implementation(Libs.AndroidX.Lifecycle.runtime)
    implementation(Libs.Google.material)

    implementation(Libs.Compose.ui)
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.activity)
    implementation(Libs.Compose.Navigation.core)

    implementation(Libs.Koin.core)
    implementation(Libs.Koin.android)
    implementation(Libs.Koin.compose)

    implementation(project(Modules.core))
    implementation(project(Modules.designSystem))
    implementation(project(Modules.network))
    implementation(project(Modules.common))
    implementation(project(Modules.persistance))

    implementation(project(Modules.Screens.login))
    implementation(project(Modules.Screens.splash))
    implementation(project(Modules.Screens.randomRecipes))
    implementation(project(Modules.Screens.recipeDetails))

    implementation(project(Modules.Component.appInfos))
    implementation(project(Modules.Component.navigation))

    implementation(Libs.serialization)

    implementation(Libs.Compose.toolingPreview)
    debugImplementation(Libs.Compose.toolingDebug )
}