package com.birdeveloper.flowwell.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FlowWellBottomNavigation(
    modifier: Modifier = Modifier,
    selectedItem: Int = 0,
    onItemSelected: (Int) -> Unit
) {
    NavigationBar(modifier = modifier) {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home") },
            selected = selectedItem == 0,
            onClick = { onItemSelected(0) }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
            label = { Text("Profile") },
            selected = selectedItem == 1,
            onClick = { onItemSelected(1) }
        )
    }
}