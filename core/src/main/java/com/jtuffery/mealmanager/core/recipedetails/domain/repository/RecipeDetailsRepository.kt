package com.jtuffery.mealmanager.core.recipedetails.domain.repository

import com.jtuffery.mealmanager.core.shared.domain.model.RecipeEntity
import kotlinx.coroutines.flow.Flow

interface RecipeDetailsRepository {
    val recipeFlow: Flow<RecipeEntity>
    fun refreshRecipe(id: Int)
}