package com.jtuffery.mealmanager.navigation

import kotlinx.coroutines.flow.Flow

interface Navigator {
    val navIntentFlow: Flow<NavIntent>
    fun handle(navIntent: NavIntent)
}