package com.jtuffery.mealmanager.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jtuffery.mealmanager.core.test.domain.usecase.RefreshTestsUseCase
import com.jtuffery.mealmanager.core.test.domain.usecase.TestsFlow
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class LoginViewModel(
    private val refreshTestsUseCase: RefreshTestsUseCase,
    testsFlow: TestsFlow
): ViewModel() {
    val uim: Flow<LoginUim> = testsFlow.map { entity ->
        LoginUim(
            entity.testList.map { it.title }
        )
    }

    fun refresh() {
        viewModelScope.launch {
            refreshTestsUseCase()
        }
    }
}