package com.jtuffery.mealmanager

import android.app.Application
import com.jtuffery.mealmanager.network.networkModule
import com.jtuffery.mealmanager.randomrecipes.randomRecipesModules
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
            val screensModules = randomRecipesModules
            modules(
                mainModule +
                        networkModule +
                        screensModules
            )
        }
    }
}