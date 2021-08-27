package com.jtuffery.mealmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.MainThread
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jtuffery.mealmanager.designsystem.theme.MealManagerTheme
import com.jtuffery.mealmanager.login.LoginScreen
import com.jtuffery.mealmanager.navigation.NavIntent
import com.jtuffery.mealmanager.navigation.Navigator
import com.jtuffery.mealmanager.randomrecipes.RandomRecipesScreen
import com.jtuffery.mealmanager.splash.SplashScreen
import kotlinx.coroutines.flow.*
import org.koin.androidx.compose.get

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MealManagerTheme {
                MainActivityScreen(this)
            }
        }
    }
}

@Composable
fun MainActivityScreen(lifecycleOwner: LifecycleOwner) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "MealManager",
                        style = MaterialTheme.typography.h4
                    )
                }
            )
        }
    ) { innerPadding ->
        val navController = rememberNavController()
        val navigator = get<Navigator>()
        navigator.navIntentFlow.observe(lifecycleOwner) {
            navController.navigate(it.name)
        }
        MainActivityNavHost(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Composable
fun MainActivityNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = NavIntent.RandomRecipes.name,
        modifier = modifier
    ) {
        composable(NavIntent.RandomRecipes.name) {
            RandomRecipesScreen()
        }
    }
}

@MainThread
inline fun <T> Flow<T>.observe(
    owner: LifecycleOwner,
    minActiveState: Lifecycle.State = Lifecycle.State.STARTED,
    crossinline collector: suspend (T) -> Unit
) = flowWithLifecycle(owner.lifecycle, minActiveState)
    .onEach { collector(it) }
    .launchIn(owner.lifecycleScope)