plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `embedded-kotlin`
}

repositories {
    google()
    mavenCentral()
    jcenter()
}

gradlePlugin {
    plugins {
        register("default-configuration") {
            id = "default-configuration"
            implementationClass = "plugins.DefaultConfigurationPlugin"
        }
    }
    plugins {
        register("compose-configuration") {
            id = "compose-configuration"
            implementationClass = "plugins.ComposeConfigurationPlugin"
        }
    }
}

dependencies {
    implementation("com.android.tools.build:gradle:7.0.1")
    //implementation(kotlin("android-extensions"))
    implementation(kotlin("gradle-plugin", "1.5.21"))
}