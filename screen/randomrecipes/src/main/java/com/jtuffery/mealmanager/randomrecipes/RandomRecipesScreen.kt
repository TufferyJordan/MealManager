package com.jtuffery.mealmanager.randomrecipes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jtuffery.mealmanager.designsystem.reciperow.RandomRecipeRow
import com.jtuffery.mealmanager.designsystem.theme.MealManagerTheme
import org.koin.androidx.compose.getViewModel

@Composable
fun RandomRecipesScreenWithViewModel(
    viewModel: RandomRecipesViewModel = getViewModel()
) {
    val uim by viewModel.uim.collectAsState(
        initial = RandomRecipesUiModel(
            emptyList()
        )
    )
    RandomRecipesScreen(
        onItemClick = viewModel::onItemClick,
        uim = uim
    )
}

@Composable
fun RandomRecipesScreen(
    onItemClick: (Int) -> Unit,
    uim: RandomRecipesUiModel
) {
    LazyColumn(content = {
        itemsIndexed(uim.recipesList) { index, item ->
            RandomRecipeRow(
                item = item,
                modifier = Modifier.clickable { onItemClick(item.id) }
            )
            if(index < uim.recipesList.size - 1)
                Divider(color = Color.Transparent, thickness = 8.dp)
        }
    })
}

@Preview(showBackground = true)
@Composable
fun RandomRecipesScreenPreview() {
    MealManagerTheme {
        RandomRecipesScreen(
            onItemClick = {},
            uim = generateMockRandomRecipes()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RandomRecipesScreenPreviewDark() {
    MealManagerTheme(true) {
        RandomRecipesScreen(
            onItemClick = {},
            uim = generateMockRandomRecipes()
        )
    }
}