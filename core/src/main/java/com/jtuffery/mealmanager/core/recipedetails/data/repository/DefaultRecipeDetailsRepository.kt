package com.jtuffery.mealmanager.core.recipedetails.data.repository

import com.jtuffery.mealmanager.core.recipedetails.data.datasource.RecipeDetailsDataSource
import com.jtuffery.mealmanager.core.recipedetails.domain.repository.RecipeDetailsRepository
import com.jtuffery.mealmanager.core.shared.domain.model.RecipeEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

class DefaultRecipeDetailsRepository(
    private val dataSource: RecipeDetailsDataSource,
): RecipeDetailsRepository {
    override val recipeFlow = MutableSharedFlow<RecipeEntity>(0, 1)

    private val scope = CoroutineScope(Dispatchers.IO + Job())

    override fun refreshRecipe(id: Int) {
        scope.launch {
            val recipe = dataSource.getRecipe(id)
            recipe?.let { recipeFlow.tryEmit(recipe) }
        }
    }
}