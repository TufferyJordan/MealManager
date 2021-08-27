package com.jtuffery.mealmanager.core.randomrecipes

import com.jtuffery.mealmanager.core.randomrecipes.data.repository.DefaultRandomRecipesRepository
import com.jtuffery.mealmanager.core.randomrecipes.domain.repository.RandomRecipesRepository
import com.jtuffery.mealmanager.core.randomrecipes.domain.usecase.getRefreshRandomRecipesUseCaseFactory
import com.jtuffery.mealmanager.core.randomrecipes.domain.usecase.getRandomRecipesFlowFactory
import org.koin.dsl.module

val randomRecipesDomainModule = module {
    single<RandomRecipesRepository> { DefaultRandomRecipesRepository(get()) }
    factory { getRefreshRandomRecipesUseCaseFactory(get()) }
    factory { getRandomRecipesFlowFactory(get()) }
}