package com.jtuffery.mealmanager.core.randomrecipes.domain.usecase

import com.jtuffery.mealmanager.core.randomrecipes.domain.model.RandomRecipesEntity
import com.jtuffery.mealmanager.core.randomrecipes.domain.repository.RandomRecipesRepository
import kotlinx.coroutines.flow.Flow

interface RandomRecipesFlow: Flow<RandomRecipesEntity>

fun getRandomRecipesFlowFactory(repository: RandomRecipesRepository): RandomRecipesFlow =
    object: RandomRecipesFlow, Flow<RandomRecipesEntity> by repository.randomRecipesFlow { }