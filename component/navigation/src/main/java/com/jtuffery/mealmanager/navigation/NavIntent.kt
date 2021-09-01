package com.jtuffery.mealmanager.navigation

sealed class NavIntent(
    val name: String
) {
    object Splash: NavIntent("splash") { val route = name }
    object Login: NavIntent("login") { val route = name }
    object RandomRecipes: NavIntent("random-recipes") { val route = name }
    data class RecipeDetails(val id: Int): NavIntent("recipe-details/$id") {
        companion object {
            const val idKey = "id"
            const val route = "recipe-details/{$idKey}"
        }
    }
}