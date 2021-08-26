package com.jtuffery.mealmanager.network.core.test.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RandomItemResponseModel(
    @SerialName("title")
    val title: String
)
