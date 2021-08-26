package com.jtuffery.mealmanager.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.jtuffery.mealmanager.designsystem.theme.MealManagerTheme
import org.koin.androidx.compose.getViewModel

@Composable
fun LoginScreen(loginViewModel: LoginViewModel = getViewModel()) {
    val uim by loginViewModel.uim.collectAsState(LoginUim(emptyList()))
    LoginListAndRefresh(
        onRefresh = { loginViewModel.refresh() },
        titleList = uim.titleList
    )
}

@Composable
fun LoginListAndRefresh(
    onRefresh: () -> Unit,
    titleList: List<String>
) {
    Column {
        Button(onClick = { onRefresh() }) {
            Text(text = "Refresh")
        }
        LazyColumn(content = {
            items(titleList) { item ->
                Text(text = item, style = MaterialTheme.typography.h6)
            }
        })
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    MealManagerTheme {
        LoginListAndRefresh(
            {},
            listOf(
                "Recipe 1",
                "Recipe 2",
                "Recipe 3",
                "Recipe 4",
                "Recipe 5",
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreviewDark() {
    MealManagerTheme(true) {
        LoginListAndRefresh(
            {},
            listOf(
                "Recipe 1",
                "Recipe 2",
                "Recipe 3",
                "Recipe 4",
                "Recipe 5",
            )
        )
    }
}