package com.jtuffery.mealmanager

import com.jtuffery.mealmanager.navigation.NavIntent
import com.jtuffery.mealmanager.navigation.Navigator
import kotlinx.coroutines.flow.MutableSharedFlow
import org.koin.dsl.module

class AppNavigator : Navigator {
    override val navIntentFlow = MutableSharedFlow<NavIntent>(0, 1)

    override fun handle(navIntent: NavIntent) {
        navIntentFlow.tryEmit(navIntent)
    }
}

val navigatorModule = module {
    single<Navigator> { AppNavigator() }
}