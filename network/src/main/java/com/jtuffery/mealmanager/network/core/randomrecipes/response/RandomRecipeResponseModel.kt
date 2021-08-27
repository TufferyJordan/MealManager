package com.jtuffery.mealmanager.network.core.randomrecipes.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RandomRecipeResponseModel(
    @SerialName("title")
    val title: String,
    @SerialName("image")
    val imageUrl: String = "",
    @SerialName("id")
    val id: Int
)
