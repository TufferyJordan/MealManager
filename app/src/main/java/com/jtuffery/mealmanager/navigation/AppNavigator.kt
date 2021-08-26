package com.jtuffery.mealmanager.navigation

import kotlinx.coroutines.flow.MutableSharedFlow

class AppNavigator : Navigator {
    override val navIntentFlow = MutableSharedFlow<NavIntent>(0, 1)

    override fun handle(navIntent: NavIntent) {
        navIntentFlow.tryEmit(navIntent)
    }
}