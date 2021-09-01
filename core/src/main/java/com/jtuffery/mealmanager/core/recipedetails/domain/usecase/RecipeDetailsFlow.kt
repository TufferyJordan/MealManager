package com.jtuffery.mealmanager.core.recipedetails.domain.usecase

import com.jtuffery.mealmanager.core.recipedetails.domain.repository.RecipeDetailsRepository
import com.jtuffery.mealmanager.core.shared.domain.model.RecipeEntity
import kotlinx.coroutines.flow.Flow

interface RecipeDetailsFlow : Flow<RecipeEntity>

fun getRecipeDetailsFlowFactory(repository: RecipeDetailsRepository) : RecipeDetailsFlow =
    object: RecipeDetailsFlow, Flow<RecipeEntity> by repository.recipeFlow {}