package com.jtuffery.mealmanager.recipedetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jtuffery.mealmanager.core.recipedetails.domain.usecase.RecipeDetailsFlow
import com.jtuffery.mealmanager.core.recipedetails.domain.usecase.RefreshRecipeUseCase
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class RecipeDetailsViewModel(
    private val refreshRecipeUseCase: RefreshRecipeUseCase,
    recipeDetailsFlow: RecipeDetailsFlow,
    private val id: Int
): ViewModel() {
    val uim = recipeDetailsFlow.map {
        RecipeDetailsUiModel(
            it.title,
            it.imageUrl
        )
    }

    init {
        viewModelScope.launch {
            refreshRecipeUseCase(id)
        }
    }
}