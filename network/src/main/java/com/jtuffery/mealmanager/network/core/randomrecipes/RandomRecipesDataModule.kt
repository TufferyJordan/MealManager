package com.jtuffery.mealmanager.network.core.randomrecipes

import com.jtuffery.mealmanager.core.randomrecipes.data.datasource.RandomRecipesDataSource
import com.jtuffery.mealmanager.network.NAMED_RETROFIT_SPOONACULAR
import com.jtuffery.mealmanager.network.core.randomrecipes.datasource.NetworkRandomRecipesDataSource
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit

val randomRecipesDataModule = module {
    single<RandomRecipesApi> {
        val retrofit = get<Retrofit>(named(NAMED_RETROFIT_SPOONACULAR))
        retrofit.create(RandomRecipesApi::class.java)
    }

    single<RandomRecipesDataSource> { NetworkRandomRecipesDataSource(get()) }
}