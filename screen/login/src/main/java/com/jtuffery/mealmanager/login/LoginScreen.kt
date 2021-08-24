package com.jtuffery.mealmanager.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jtuffery.mealmanager.designsystem.theme.MealManagerTheme

@Composable
fun LoginScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Text(text = "LoginScreen", style = MaterialTheme.typography.h5)
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    MealManagerTheme {
        LoginScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreviewDark() {
    MealManagerTheme(true) {
        LoginScreen()
    }
}