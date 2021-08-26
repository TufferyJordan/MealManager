package com.jtuffery.mealmanager.core.test.domain.repository

import com.jtuffery.mealmanager.core.test.domain.model.TestsEntity
import kotlinx.coroutines.flow.Flow

interface TestRepository {
    val testFlow: Flow<TestsEntity>
    fun refreshTest()
}