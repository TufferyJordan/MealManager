package com.jtuffery.mealmanager.randomrecipes

import com.jtuffery.mealmanager.designsystem.reciperow.RecipeRowUiModel

data class RandomRecipesUiModel(
    val recipesList : List<RecipeRowUiModel>
)

fun generateMockRandomRecipes() = RandomRecipesUiModel(
    listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15).map {
        RecipeRowUiModel(it,"Item n°$it", listOf("soup", "starter"),"")
    }
)