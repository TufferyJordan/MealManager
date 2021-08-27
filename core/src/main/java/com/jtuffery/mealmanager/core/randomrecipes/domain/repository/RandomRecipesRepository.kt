package com.jtuffery.mealmanager.core.randomrecipes.domain.repository

import com.jtuffery.mealmanager.core.randomrecipes.domain.model.RandomRecipesEntity
import kotlinx.coroutines.flow.Flow

interface RandomRecipesRepository {
    val randomRecipesFlow: Flow<RandomRecipesEntity>
    fun refreshRandomRecipes()
}