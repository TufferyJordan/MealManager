package com.jtuffery.mealmanager.randomrecipes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jtuffery.mealmanager.core.randomrecipes.domain.usecase.RandomRecipesFlow
import com.jtuffery.mealmanager.core.randomrecipes.domain.usecase.RefreshRandomRecipesUseCase
import com.jtuffery.mealmanager.designsystem.reciperow.RecipeRowUiModel
import com.jtuffery.mealmanager.navigation.NavIntent
import com.jtuffery.mealmanager.navigation.Navigator
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class RandomRecipesViewModel(
    private val refreshRandomRecipesUseCase: RefreshRandomRecipesUseCase,
    private val navigator: Navigator,
    randomRecipesFlow: RandomRecipesFlow
) : ViewModel() {
    val uim = randomRecipesFlow.map { recipes ->
        RandomRecipesUiModel(
            recipes.recipeList.map { recipe ->
                RecipeRowUiModel(
                    recipe.id,
                    recipe.title,
                    recipe.dishTypes.take(3),
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
        navigator.handle(NavIntent.RecipeDetails(id))
    }
}