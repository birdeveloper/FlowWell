package com.birdeveloper.flowwell.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.birdeveloper.flowwell.R

data class Category(val name: String, @DrawableRes val imageRes: Int)

val categories = listOf(
    Category("Yoga", R.drawable.yoga_image),
    Category("Meditation", R.drawable.meditation_image),
    Category("Breathing", R.drawable.breathing_image),
    Category("Stretching", R.drawable.stretching_image)
)

@Composable
fun CategoryRow(modifier: Modifier = Modifier) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(
            count = categories.size,
            itemContent = { index ->
                val category = categories[index]
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(category.imageRes),
                        contentDescription = category.name,
                        modifier = Modifier
                            .size(88.dp)
                            .clip(CircleShape)
                            .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
                    )
                    Text(text = category.name, style = MaterialTheme.typography.bodyMedium)
                }
            }

        )
    }
}