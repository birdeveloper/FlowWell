package com.birdeveloper.flowwell.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.birdeveloper.flowwell.ui.components.FlowWellNavigationRail
import com.birdeveloper.flowwell.ui.theme.FlowWellTheme

@Composable
fun FlowWellLandscapeApp() {
    var selectedItem by remember { mutableStateOf(0) }

    FlowWellTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Row {
                FlowWellNavigationRail(selectedItem = selectedItem, onItemSelected = { selectedItem = it })

                Box(modifier = Modifier.fillMaxSize()) {
                    when (selectedItem) {
                        0 -> HomeScreen()
                        1 -> ProfileScreen()
                    }
                }
            }
        }
    }
}