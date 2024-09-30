package com.birdeveloper.flowwell

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performScrollToNode
import com.birdeveloper.flowwell.ui.components.FeaturedCollectionsGrid
import com.birdeveloper.flowwell.ui.components.featuredCollections
import org.junit.Rule
import org.junit.Test

class FeaturedCollectionsGridTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun featuredCollectionsGrid_displaysAllItems() {
        composeTestRule.setContent {
            FeaturedCollectionsGrid()
        }

        // Verifies that all items in the grid are displayed
        featuredCollections.forEach { item ->
            composeTestRule
                .onNodeWithText(item.title)
                .assertIsDisplayed()
        }
    }

    @Test
    fun featuredCollectionsGrid_isScrollable() {
        composeTestRule.setContent {
            FeaturedCollectionsGrid()
        }

        // Checks if the grid is scrollable horizontally
        composeTestRule
            .onRoot(useUnmergedTree = true)
            .performScrollToNode(hasText("Cardio")) // One of the grid item texts
    }
}