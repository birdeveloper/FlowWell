package com.birdeveloper.flowwell

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.birdeveloper.flowwell.ui.screens.HomeScreen
import org.junit.Rule
import org.junit.Test

class HomeScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun searchBar_exists() {
        composeTestRule.setContent {
            HomeScreen()
        }
        composeTestRule
            .onNode(hasText("Search")) // Assuming the placeholder text is "Search"
            .assertIsDisplayed()
    }

    @Test
    fun homeScreen_hasScrollableContent() {
        composeTestRule.setContent {
            HomeScreen()
        }

        composeTestRule
            .onRoot(useUnmergedTree = true)
            .performScrollToNode(hasText("Mindfulness")) // One of the grid item texts
    }
}