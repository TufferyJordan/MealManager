package com.jtuffery.mealmanager.network.core.shared.response

import com.jtuffery.mealmanager.core.shared.data.model.RecipeDataModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RecipeResponseModel(
    @SerialName("title")
    val title: String,
    @SerialName("image")
    val imageUrl: String = "",
    @SerialName("dishTypes")
    val dishTypes: List<String>,
    @SerialName("id")
    val id: Int
)

fun RecipeResponseModel.toDataModel(): RecipeDataModel =
    RecipeDataModel(id, title, dishTypes, imageUrl)
