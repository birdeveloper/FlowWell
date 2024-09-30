package com.birdeveloper.flowwell.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.birdeveloper.flowwell.ui.components.CategoryRow
import com.birdeveloper.flowwell.ui.components.FeaturedCollectionsGrid
import com.birdeveloper.flowwell.ui.components.SearchBar

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(bottom = 56.dp)
    ) {
        var query by remember { mutableStateOf("") }
        SearchBar(
            query = query,
            onQueryChanged = { query = it }
        )
        Spacer(modifier = Modifier.height(16.dp))
        CategoryRow()
        Spacer(modifier = Modifier.height(16.dp))
        FeaturedCollectionsGrid()
    }
}