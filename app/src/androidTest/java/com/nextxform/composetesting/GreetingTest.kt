package com.nextxform.composetesting

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.assertValueEquals
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.isNotDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onChild
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import org.junit.Rule
import org.junit.Test


class GreetingTest{
    @get:Rule val composeRule =  createComposeRule()

//    TODO: onNodeWithContentDescription
//    TODO: onNodeWithTag
//    TODO: onRoot
//    TODO: onAllNodes
//    TODO: onAllNodesWithContentDescription
//    TODO: onAllNodesWithTag
//    TODO: onAllNodesWithText

    @Test
    fun onNodeWithTextExample(){
        composeRule.setContent {
            Greeting("name")
        }

        composeRule.onNodeWithText("Hello name").isDisplayed()
    }

    @Test
    fun onNodeWithTagExample(){
        composeRule.setContent {
            Greeting("name")
        }

        composeRule.onNodeWithContentDescription("Hello name").isNotDisplayed()
    }

    @Test
    fun onRootExample(){
        composeRule.setContent { Greeting("name") }
        composeRule.onRoot().isDisplayed()
    }
}