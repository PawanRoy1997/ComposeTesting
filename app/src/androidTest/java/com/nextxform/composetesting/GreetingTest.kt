package com.nextxform.composetesting

import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test


class GreetingTest{
    @get:Rule val composeRule =  createComposeRule()


    @Test
    fun checkIsDisplayed(){
        composeRule.setContent {
            Greeting("name")
        }

        composeRule.onNodeWithText("Hello name").isDisplayed()
    }
}