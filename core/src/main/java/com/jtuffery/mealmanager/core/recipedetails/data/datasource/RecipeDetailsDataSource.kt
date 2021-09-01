package com.jtuffery.mealmanager.core.recipedetails.data.datasource

import com.jtuffery.mealmanager.core.shared.data.model.RecipeDataModel

interface RecipeDetailsDataSource {
    suspend fun getRecipe(id: Int): RecipeDataModel?
}