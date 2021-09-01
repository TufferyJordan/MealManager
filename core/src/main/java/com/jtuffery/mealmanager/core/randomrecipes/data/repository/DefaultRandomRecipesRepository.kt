package com.jtuffery.mealmanager.core.randomrecipes.data.repository

import com.jtuffery.mealmanager.core.randomrecipes.data.datasource.RandomRecipesDataSource
import com.jtuffery.mealmanager.core.randomrecipes.domain.model.RandomRecipesEntity
import com.jtuffery.mealmanager.core.randomrecipes.domain.repository.RandomRecipesRepository
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow

@ExperimentalCoroutinesApi
class DefaultRandomRecipesRepository(
    private val dataSource: RandomRecipesDataSource
) : RandomRecipesRepository {
    override val randomRecipesFlow = MutableSharedFlow<RandomRecipesEntity>(0, 1)

    private val scope = CoroutineScope(Dispatchers.IO + Job())

    override fun refreshRandomRecipes() {
        scope.launch {
            val result = dataSource.getRandomRecipes()
            result?.let { randomRecipesFlow.tryEmit(it) }
        }
    }
}