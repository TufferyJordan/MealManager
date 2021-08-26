package com.jtuffery.mealmanager.appinfos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiKeysEntity(
    @SerialName("spoonacular_apikey")
    val spoonacular: String
)