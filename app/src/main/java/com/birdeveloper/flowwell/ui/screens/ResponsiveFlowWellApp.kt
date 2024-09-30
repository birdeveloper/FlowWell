package com.birdeveloper.flowwell.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass

@Composable
fun ResponsiveFlowWellApp(windowSizeClass: WindowSizeClass) {
    when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> FlowWellApp() // Portrait mode
        WindowWidthSizeClass.Expanded -> FlowWellLandscapeApp() // Landscape mode
    }
}