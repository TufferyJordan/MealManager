package com.jtuffery.mealmanager.randomrecipes

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jtuffery.mealmanager.core.randomrecipes.domain.usecase.RandomRecipesFlow
import com.jtuffery.mealmanager.core.randomrecipes.domain.usecase.RefreshRandomRecipesUseCase
import com.jtuffery.mealmanager.designsystem.reciperow.RecipeRowUiModel
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class RandomRecipesViewModel(
    private val refreshRandomRecipesUseCase: RefreshRandomRecipesUseCase,
    private val randomRecipesFlow: RandomRecipesFlow
): ViewModel() {
    val uim = randomRecipesFlow.map {  recipes ->
        RandomRecipesUiModel(
            recipes.randomRecipeList.map { recipe ->
                RecipeRowUiModel(
                    recipe.id,
                    recipe.title,
                    recipe.imageUrl
                )
            }
        )
    }

    init {
        viewModelScope.launch {
            refreshRandomRecipesUseCase()
        }
    }

    fun onItemClick(id: Int) {
        Log.d("Random Recipe", "Click on item $id")
    }
}