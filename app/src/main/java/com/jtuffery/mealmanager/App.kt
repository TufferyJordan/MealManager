package com.jtuffery.mealmanager

import android.app.Application
import com.jtuffery.mealmanager.network.networkModule
import com.jtuffery.mealmanager.randomrecipes.randomRecipesModules
import com.jtuffery.mealmanager.recipedetails.recipeDetailsModules
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
            val screensModules = randomRecipesModules + recipeDetailsModules
            modules(
                mainModule +
                        networkModule +
                        screensModules
            )
        }
    }
}