package com.jtuffery.mealmanager.core.test

import com.jtuffery.mealmanager.core.test.data.repository.DefaultTestRepository
import com.jtuffery.mealmanager.core.test.domain.repository.TestRepository
import com.jtuffery.mealmanager.core.test.domain.usecase.RefreshTestsUseCase
import com.jtuffery.mealmanager.core.test.domain.usecase.getRefreshTestsUseCaseFactory
import com.jtuffery.mealmanager.core.test.domain.usecase.getTestsFlowFactory
import org.koin.dsl.module

val testDomainModule = module {
    single<TestRepository> { DefaultTestRepository(get()) }
    factory { getRefreshTestsUseCaseFactory(get()) }
    factory { getTestsFlowFactory(get()) }
}