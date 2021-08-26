package com.jtuffery.mealmanager.network.core.test

import com.jtuffery.mealmanager.core.test.data.datasource.TestDataSource
import com.jtuffery.mealmanager.network.NAMED_RETROFIT_SPOONACULAR
import com.jtuffery.mealmanager.network.core.test.datasource.NetworkTestDataSource
import org.koin.core.qualifier.named
import org.koin.core.scope.get
import org.koin.dsl.module
import retrofit2.Retrofit

val testDataModule = module {
    single<TestApi> {
        val retrofit = get<Retrofit>(named(NAMED_RETROFIT_SPOONACULAR))
        retrofit.create(TestApi::class.java)
    }

    single<TestDataSource> { NetworkTestDataSource(get()) }
}