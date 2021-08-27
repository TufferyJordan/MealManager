package com.jtuffery.mealmanager.core.randomrecipes.domain.usecase

import com.jtuffery.mealmanager.core.randomrecipes.domain.repository.RandomRecipesRepository

interface RefreshRandomRecipesUseCase {
    operator fun invoke(): Unit
}

fun getRefreshRandomRecipesUseCaseFactory(repository: RandomRecipesRepository) = object: RefreshRandomRecipesUseCase {
    override fun invoke() {
        repository.refreshRandomRecipes()
    }
}