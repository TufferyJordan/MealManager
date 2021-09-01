package com.jtuffery.mealmanager.core.shared.domain.model

data class RecipeEntity(
    val id: Int,
    val title: String,
    val dishTypes: List<String>,
    val imageUrl: String
)
