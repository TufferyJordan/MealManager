package com.jtuffery.mealmanager.core.recipedetails

import com.jtuffery.mealmanager.core.recipedetails.data.repository.DefaultRecipeDetailsRepository
import com.jtuffery.mealmanager.core.recipedetails.domain.repository.RecipeDetailsRepository
import com.jtuffery.mealmanager.core.recipedetails.domain.usecase.getRecipeDetailsFlowFactory
import com.jtuffery.mealmanager.core.recipedetails.domain.usecase.getRefreshRecipeUseCaseFactory
import org.koin.dsl.module

val recipeDetailsDomainModule = module {
    single<RecipeDetailsRepository> { DefaultRecipeDetailsRepository(get()) }
    factory { getRecipeDetailsFlowFactory(get()) }
    factory { getRefreshRecipeUseCaseFactory(get()) }
}