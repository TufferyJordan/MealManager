package com.jtuffery.mealmanager.splash

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jtuffery.mealmanager.designsystem.theme.MealManagerTheme
import com.jtuffery.mealmanager.navigation.MockNavigator
import com.jtuffery.mealmanager.navigation.NavIntent
import com.jtuffery.mealmanager.navigation.Navigator
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import org.koin.androidx.compose.get

@Composable
fun SplashScreen(navigator: Navigator = get()) {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "SplashScreen", style = MaterialTheme.typography.h5)
            Button(onClick = {
                navigator.handle(NavIntent.Login)
            }) {
                Text(text = "Click me to go to login !")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenLightPreview() {
    MealManagerTheme {
        SplashScreen(object : Navigator {
            override val navIntentFlow: Flow<NavIntent>
                get() = MutableSharedFlow()

            override fun handle(navIntent: NavIntent) {}
        })
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenDarkPreview() {
    MealManagerTheme(true) {
        SplashScreen(MockNavigator())
    }
}