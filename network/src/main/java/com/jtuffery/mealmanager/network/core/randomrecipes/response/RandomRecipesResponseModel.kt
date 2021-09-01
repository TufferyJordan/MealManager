package com.jtuffery.mealmanager.network.core.randomrecipes.response

import com.jtuffery.mealmanager.network.core.shared.response.RecipeResponseModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RandomRecipesResponseModel(
    @SerialName("recipes")
    val recipes: List<RecipeResponseModel>
)
