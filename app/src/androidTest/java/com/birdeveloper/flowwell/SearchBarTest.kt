package com.birdeveloper.flowwell

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.birdeveloper.flowwell.ui.components.SearchBar
import org.junit.Rule
import org.junit.Test

class SearchBarTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun searchBar_displaysPlaceholderText() {
        composeTestRule.setContent {
            SearchBar(query = "", onQueryChanged = {})
        }

        // Checks that the placeholder text is displayed initially
        composeTestRule
            .onNode(hasText("Search")) // Assuming the placeholder text is "Search"
            .assertIsDisplayed()
    }

    @Test
    fun searchBar_updatesOnTextChange() {
        var text = ""
        composeTestRule.setContent {
            SearchBar(
                query = text,
                onQueryChanged = { newText -> text = newText }
            )
        }

        val inputText = "Mindfulness"

        composeTestRule
            .onNode(hasText("Search")) // Assuming the placeholder text is "Search"
            .performTextInput(inputText)

        composeTestRule
            .onNodeWithText(inputText)
            .assertIsDisplayed()
    }
}