package com.jtuffery.mealmanager.designsystem.reciperow

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.jtuffery.mealmanager.designsystem.theme.MealManagerTheme


@Composable
fun RandomRecipeRow(item: RecipeRowUiModel, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = rememberImagePainter(
                data = item.imageUrl,
                builder = {
                    crossfade(true)
                }
            ),
            contentDescription = null,
            modifier = Modifier.size(80.dp)
        )
        Text(
            text = item.title,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RandomRecipeRowLightPreview() {
    MealManagerTheme {
        RandomRecipeRow(item = RecipeRowUiModel(10, "Item N°10", ""))
    }
}

@Preview(showBackground = true)
@Composable
fun RandomRecipeRowDarkPreview() {
    MealManagerTheme(darkTheme = true) {
        RandomRecipeRow(item = RecipeRowUiModel(10, "Item N°10", ""))
    }
}
