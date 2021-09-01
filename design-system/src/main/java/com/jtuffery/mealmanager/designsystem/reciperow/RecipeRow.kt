package com.jtuffery.mealmanager.designsystem.reciperow

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Composition
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.jtuffery.mealmanager.designsystem.theme.MealManagerTheme


@Composable
fun RandomRecipeRow(item: RecipeRowUiModel, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if(item.imageUrl.isEmpty()) {
            Image(
                painter = ColorPainter(Color.Blue),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxHeight()
                    .aspectRatio(4f / 3f)
                    .clip(MaterialTheme.shapes.small)
            )
        } else {
            Image(
                painter = rememberImagePainter(
                    data = item.imageUrl,
                    builder = {
                        crossfade(true)
                    }
                ),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxHeight()
                    .aspectRatio(4f / 3f)
                    .clip(MaterialTheme.shapes.small)
            )
        }
        Column {
            Text(
                text = item.title,
                style = MaterialTheme.typography.h6,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 8.dp)
            )
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                val tagStyle = MaterialTheme.typography.overline.toSpanStyle().copy(
                    background = MaterialTheme.colors.primary.copy(alpha = 0.1f)
                )
                val annotatedString = buildAnnotatedString {
                    item.dishStyles.forEachIndexed { index, s ->
                        withStyle(tagStyle) { append(s.uppercase()) }
                        if(index != item.dishStyles.size - 1) append(" · ")
                    }
                }
                Text(
                    text = annotatedString,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RandomRecipeRowLightPreview() {
    MealManagerTheme {
        RandomRecipeRow(item = RecipeRowUiModel(
            10,
            "Item N°10",
            listOf(
                "soup",
                "starter"
            ),
            ""
        ))
    }
}

@Preview(showBackground = true)
@Composable
fun RandomRecipeRowDarkPreview() {
    MealManagerTheme(darkTheme = true) {
        RandomRecipeRow(item = RecipeRowUiModel(
            10,
            "Item N°10",
            listOf(
                "soup",
                "starter"
            ),
            ""
        ))
    }
}
