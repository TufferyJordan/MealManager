package com.jtuffery.mealmanager.core.test.domain.usecase

import com.jtuffery.mealmanager.core.test.domain.repository.TestRepository

interface RefreshTestsUseCase {
    operator fun invoke(): Unit
}

fun getRefreshTestsUseCaseFactory(repository: TestRepository) = object: RefreshTestsUseCase {
    override fun invoke() {
        repository.refreshTest()
    }
}