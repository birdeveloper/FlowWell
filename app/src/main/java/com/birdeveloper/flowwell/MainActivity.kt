package com.birdeveloper.flowwell

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.birdeveloper.flowwell.ui.screens.ResponsiveFlowWellApp
import com.birdeveloper.flowwell.ui.theme.FlowWellTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val windowSizeClass = calculateWindowSizeClass(this)
            ResponsiveFlowWellApp(windowSizeClass)
        }
    }
}

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Preview
@Composable
fun PreviewFlowWellApp() {
    val context = LocalContext.current
    val windowSizeClass = calculateWindowSizeClass(context as Activity)
    ResponsiveFlowWellApp(windowSizeClass)
}