package com.birdeveloper.flowwell.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.birdeveloper.flowwell.R

data class CollectionItem(val title: String, @DrawableRes val imageRes: Int)

val featuredCollections = listOf(
    CollectionItem("Mindfulness", R.drawable.mindfulness_image),
    CollectionItem("Quick Yoga", R.drawable.quick_yoga_image),
    CollectionItem("Sleep Better", R.drawable.sleep_better_image),
    CollectionItem("Cardio", R.drawable.cardio_image),
    CollectionItem("Mindfulness", R.drawable.mindfulness_image),
    CollectionItem("Quick Yoga", R.drawable.quick_yoga_image),
    CollectionItem("Sleep Better", R.drawable.sleep_better_image),
    CollectionItem("Cardio", R.drawable.cardio_image)
)

@Composable
fun FeaturedCollectionsGrid(modifier: Modifier = Modifier) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.height(500.dp)
    ) {
        items(
            count = featuredCollections.size,
            itemContent = { index ->
                val collection = featuredCollections[index]
                Card(
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    Column {
                        Image(
                            painter = painterResource(collection.imageRes),
                            contentDescription = collection.title,
                            modifier = Modifier.size(height = 200.dp, width = 250.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = collection.title,
                            style = MaterialTheme.typography.titleMedium,
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        )
    }
}