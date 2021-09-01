package com.jtuffery.mealmanager.network.core.recipedetails

import com.jtuffery.mealmanager.core.recipedetails.data.datasource.RecipeDetailsDataSource
import com.jtuffery.mealmanager.network.NAMED_RETROFIT_SPOONACULAR
import com.jtuffery.mealmanager.network.core.recipedetails.datasource.NetworkRecipeDetailsDataSource
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit

val recipeDetailsDataModule = module {
    single {
        val retrofit: Retrofit = get(named(NAMED_RETROFIT_SPOONACULAR))
        retrofit.create(RecipeDetailsApi::class.java)
    }

    single<RecipeDetailsDataSource> { NetworkRecipeDetailsDataSource(get()) }
}