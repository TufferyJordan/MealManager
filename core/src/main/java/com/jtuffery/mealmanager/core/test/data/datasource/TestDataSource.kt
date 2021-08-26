package com.jtuffery.mealmanager.core.test.data.datasource

import com.jtuffery.mealmanager.core.test.data.model.TestsDataModel

interface TestDataSource {
    suspend fun getTests(): TestsDataModel?
}