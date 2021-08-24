package com.jtuffery.mealmanager.navigation

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow

class MockNavigator: Navigator {
    override val navIntentFlow: Flow<NavIntent>
        get() = MutableSharedFlow()

    override fun handle(navIntent: NavIntent) { }
}