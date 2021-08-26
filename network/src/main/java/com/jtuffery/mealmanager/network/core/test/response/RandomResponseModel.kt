package com.jtuffery.mealmanager.network.core.test.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RandomResponseModel(
    @SerialName("recipes")
    val recipes: List<RandomItemResponseModel>
)
