package com.jtuffery.mealmanager.core.test.data.repository

import com.jtuffery.mealmanager.core.test.data.datasource.TestDataSource
import com.jtuffery.mealmanager.core.test.domain.model.TestsEntity
import com.jtuffery.mealmanager.core.test.domain.repository.TestRepository
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

@ExperimentalCoroutinesApi
class DefaultTestRepository(
    private val dataSource: TestDataSource
) : TestRepository {
    override val testFlow = MutableStateFlow(TestsEntity(emptyList()))

    private val scope = CoroutineScope(Dispatchers.IO + Job())

    override fun refreshTest() {
        scope.launch {
            val result = dataSource.getTests()
            result?.let { testFlow.value = it }
        }
    }

}