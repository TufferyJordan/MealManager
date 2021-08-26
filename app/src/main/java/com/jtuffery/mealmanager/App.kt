package com.jtuffery.mealmanager

import android.app.Application
import com.jtuffery.mealmanager.login.loginModules
import com.jtuffery.mealmanager.network.networkModule
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.InternalSerializationApi
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

@ExperimentalSerializationApi
@InternalSerializationApi
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            val screensModules = loginModules
            modules(
                mainModule +
                        networkModule +
                        screensModules
            )
        }
    }
}