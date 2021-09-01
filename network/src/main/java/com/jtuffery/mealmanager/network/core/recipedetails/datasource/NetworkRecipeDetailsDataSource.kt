package com.jtuffery.mealmanager.network.core.recipedetails.datasource

import com.jtuffery.mealmanager.core.recipedetails.data.datasource.RecipeDetailsDataSource
import com.jtuffery.mealmanager.core.shared.data.model.RecipeDataModel
import com.jtuffery.mealmanager.network.core.recipedetails.RecipeDetailsApi
import com.jtuffery.mealmanager.network.core.shared.response.toDataModel

class NetworkRecipeDetailsDataSource(
    private val api: RecipeDetailsApi
): RecipeDetailsDataSource {
    override suspend fun getRecipe(id: Int): RecipeDataModel? {
        val response = api.getRecipe(id)
        return response.body()?.toDataModel()
    }
}