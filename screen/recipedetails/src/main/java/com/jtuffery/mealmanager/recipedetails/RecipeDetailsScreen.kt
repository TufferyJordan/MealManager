package com.jtuffery.mealmanager.recipedetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import com.jtuffery.mealmanager.designsystem.theme.MealManagerTheme
import org.koin.androidx.compose.getViewModel
import org.koin.core.parameter.parametersOf

@Composable
fun RecipeDetailsScreenWithViewModel(
    id: Int,
    viewModel: RecipeDetailsViewModel = getViewModel { parametersOf(id) }
) {
    val uim by viewModel.uim.collectAsState(null)
    uim?.let {
        RecipeDetailsScreen(it)
    }
}

@Composable
fun RecipeDetailsScreen(
    uim: RecipeDetailsUiModel
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(5f / 3f)
        ) {
            Image(
                painter = rememberImagePainter(
                    data = uim.imageUrl,
                    builder = {
                        crossfade(true)
                    }
                ),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .align(Alignment.BottomCenter)
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(
                                Color.Transparent,
                                MaterialTheme.colors.background,
                            )
                        )
                    )
            )
            Text(
                text = uim.title,
                style = MaterialTheme.typography.h5.copy(color = MaterialTheme.colors.onSurface ),
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(
                        start = 8.dp,
                        end = 8.dp,
                        bottom = 8.dp
                    )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecipeDetailsScreenLightPreview() {
    MealManagerTheme {
        RecipeDetailsScreen(uim = RecipeDetailsUiModel(
            title = "Recipe Title",
            imageUrl = "https://picsum.photos/200"
        ))
    }
}

@Preview(showBackground = true)
@Composable
fun RecipeDetailsScreenDarkPreview() {
    MealManagerTheme(darkTheme = true) {
        RecipeDetailsScreen(uim = RecipeDetailsUiModel(
            title = "Recipe Title",
            imageUrl = "https://picsum.photos/200"
        ))
    }
}