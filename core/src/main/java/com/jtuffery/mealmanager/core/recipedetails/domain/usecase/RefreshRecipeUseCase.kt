package com.jtuffery.mealmanager.core.recipedetails.domain.usecase

import com.jtuffery.mealmanager.core.recipedetails.domain.repository.RecipeDetailsRepository

interface RefreshRecipeUseCase {
    operator fun invoke(id: Int)
}

fun getRefreshRecipeUseCaseFactory(repository: RecipeDetailsRepository) =
    object : RefreshRecipeUseCase {
        override fun invoke(id: Int) {
            repository.refreshRecipe(id)
        }
    }