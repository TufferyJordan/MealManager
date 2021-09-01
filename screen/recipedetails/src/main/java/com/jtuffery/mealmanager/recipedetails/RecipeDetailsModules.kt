package com.jtuffery.mealmanager.recipedetails

import com.jtuffery.mealmanager.core.recipedetails.recipeDetailsDomainModule
import com.jtuffery.mealmanager.network.core.recipedetails.recipeDetailsDataModule
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val recipeDetailsScreenModule = module {
    viewModel { (id: Int) ->
        RecipeDetailsViewModel(get(), get(), id)
    }
}

val recipeDetailsModules = recipeDetailsScreenModule + recipeDetailsDomainModule + recipeDetailsDataModule