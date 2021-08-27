package com.jtuffery.mealmanager.core.randomrecipes.data.datasource

import com.jtuffery.mealmanager.core.randomrecipes.data.model.RandomRecipesDataModel

interface RandomRecipesDataSource {
    suspend fun getRandomRecipes(): RandomRecipesDataModel?
}