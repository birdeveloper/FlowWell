package com.birdeveloper.flowwell.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.birdeveloper.flowwell.ui.navigation.FlowWellBottomNavigation
import com.birdeveloper.flowwell.ui.theme.FlowWellTheme

@Composable
fun FlowWellApp() {
    var selectedItem by remember { mutableStateOf(0) }

    FlowWellTheme {
        Scaffold(
            bottomBar = {
                FlowWellBottomNavigation(selectedItem = selectedItem, onItemSelected = { selectedItem = it })
            }
        ) { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                when (selectedItem) {
                    0 -> HomeScreen()
                    1 -> ProfileScreen() // Placeholder composable for the Profile screen
                }
            }
        }
    }
}