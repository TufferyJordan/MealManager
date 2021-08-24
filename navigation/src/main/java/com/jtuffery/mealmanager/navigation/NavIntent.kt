package com.jtuffery.mealmanager.navigation

sealed class NavIntent(val name: String) {
    object Splash: NavIntent("splash")
    object Login: NavIntent("login")
    object Main: NavIntent("main")
}