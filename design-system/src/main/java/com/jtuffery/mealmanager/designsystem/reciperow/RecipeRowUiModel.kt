package com.jtuffery.mealmanager.designsystem.reciperow

data class RecipeRowUiModel (
    val id: Int,
    val title: String,
    val dishStyles: List<String>,
    val imageUrl: String
)