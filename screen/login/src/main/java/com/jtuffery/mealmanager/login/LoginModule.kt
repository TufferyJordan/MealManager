package com.jtuffery.mealmanager.login

import com.jtuffery.mealmanager.core.test.testDomainModule
import com.jtuffery.mealmanager.network.core.test.testDataModule
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val loginScreenModule = module {
    viewModel { LoginViewModel(get(), get()) }
}

val loginModules = testDataModule + testDomainModule + loginScreenModule