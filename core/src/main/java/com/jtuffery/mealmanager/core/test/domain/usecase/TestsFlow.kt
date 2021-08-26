package com.jtuffery.mealmanager.core.test.domain.usecase

import com.jtuffery.mealmanager.core.test.domain.model.TestsEntity
import com.jtuffery.mealmanager.core.test.domain.repository.TestRepository
import kotlinx.coroutines.flow.Flow

interface TestsFlow: Flow<TestsEntity>

fun getTestsFlowFactory(repository: TestRepository): TestsFlow =
    object: TestsFlow, Flow<TestsEntity> by repository.testFlow { }