package com.jtuffery.mealmanager.network.core.randomrecipes.datasource

import com.jtuffery.mealmanager.core.randomrecipes.data.datasource.RandomRecipesDataSource
import com.jtuffery.mealmanager.core.randomrecipes.data.model.RandomRecipesDataModel
import com.jtuffery.mealmanager.network.core.randomrecipes.RandomRecipesApi
import com.jtuffery.mealmanager.network.core.randomrecipes.response.RandomRecipesResponseModel
import com.jtuffery.mealmanager.network.core.shared.response.toDataModel

class NetworkRandomRecipesDataSource(
    private val randomRecipesApi: RandomRecipesApi
): RandomRecipesDataSource {
    override suspend fun getRandomRecipes(): RandomRecipesDataModel? {
        val response = randomRecipesApi.getRandomReceipts(100)
        return response.body()?.toDataModel()
    }
}

fun RandomRecipesResponseModel.toDataModel() = RandomRecipesDataModel(
    recipes.map { it.toDataModel() }
)