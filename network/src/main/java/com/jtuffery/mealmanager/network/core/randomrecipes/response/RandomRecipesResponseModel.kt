package com.jtuffery.mealmanager.network.core.randomrecipes.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RandomRecipesResponseModel(
    @SerialName("recipes")
    val recipes: List<RandomRecipeResponseModel>
)
