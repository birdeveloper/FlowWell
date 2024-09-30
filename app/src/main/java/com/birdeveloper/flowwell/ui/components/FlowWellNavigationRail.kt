package com.birdeveloper.flowwell.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun FlowWellNavigationRail(
    selectedItem: Int = 0,
    onItemSelected: (Int) -> Unit
) {
    NavigationRail {
        NavigationRailItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home") },
            selected = selectedItem == 0,
            onClick = { onItemSelected(0) }
        )
        NavigationRailItem(
            icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
            label = { Text("Profile") },
            selected = selectedItem == 1,
            onClick = { onItemSelected(1) }
        )
    }
}