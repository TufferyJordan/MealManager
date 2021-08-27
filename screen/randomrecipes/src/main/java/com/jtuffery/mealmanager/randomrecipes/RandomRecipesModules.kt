package com.jtuffery.mealmanager.randomrecipes

import com.jtuffery.mealmanager.core.randomrecipes.randomRecipesDomainModule
import com.jtuffery.mealmanager.network.core.randomrecipes.randomRecipesDataModule
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val randomRecipesScreenModule = module {
    viewModel { RandomRecipesViewModel(get(), get()) }
}

val randomRecipesModules = randomRecipesDataModule +
        randomRecipesDomainModule +
        randomRecipesScreenModule