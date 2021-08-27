package com.jtuffery.mealmanager.network.core.randomrecipes.datasource

import com.jtuffery.mealmanager.core.randomrecipes.data.datasource.RandomRecipesDataSource
import com.jtuffery.mealmanager.core.randomrecipes.data.model.RandomRecipeDataModel
import com.jtuffery.mealmanager.core.randomrecipes.data.model.RandomRecipesDataModel
import com.jtuffery.mealmanager.network.core.randomrecipes.RandomRecipesApi
import com.jtuffery.mealmanager.network.core.randomrecipes.response.RandomRecipesResponseModel

class NetworkRandomRecipesDataSource(
    private val randomRecipesApi: RandomRecipesApi
): RandomRecipesDataSource {
    override suspend fun getRandomRecipes(): RandomRecipesDataModel? {
        val response = randomRecipesApi.getRandomReceipts(100)
        return response.body()?.toDataModel()
    }
}

fun RandomRecipesResponseModel.toDataModel() = RandomRecipesDataModel(
    recipes.map { RandomRecipeDataModel(
        it.id,
        it.title,
        it.imageUrl
    ) }
)