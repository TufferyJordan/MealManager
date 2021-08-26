package com.jtuffery.mealmanager.network.core.test.datasource

import com.jtuffery.mealmanager.core.test.data.datasource.TestDataSource
import com.jtuffery.mealmanager.core.test.data.model.TestDataModel
import com.jtuffery.mealmanager.core.test.data.model.TestsDataModel
import com.jtuffery.mealmanager.network.core.test.TestApi
import com.jtuffery.mealmanager.network.core.test.response.RandomResponseModel

class NetworkTestDataSource(
    private val testApi: TestApi
): TestDataSource {
    override suspend fun getTests(): TestsDataModel? {
        val response = testApi.getRandomReceipts(10)
        return response.body()?.toDataModel()
    }
}

fun RandomResponseModel.toDataModel() = TestsDataModel(
    recipes.map { TestDataModel(it.title) }
)