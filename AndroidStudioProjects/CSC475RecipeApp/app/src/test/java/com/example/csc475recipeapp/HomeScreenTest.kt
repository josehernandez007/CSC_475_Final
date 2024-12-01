package com.example.csc475recipeapp

import androidx.compose.ui.test.junit4.createComposeRule
import com.example.csc475recipeapp.ui.screens.HomeScreen
import com.example.csc475recipeapp.ui.viewmodel.RecipeViewModel
import org.junit.Rule
import org.junit.Test

class HomeScreenTest {
    @get:Rule
    val composeTestRule = androidx.compose.ui.test.junit4.createComposeRule()

    @Test
    fun testHomeScreenDisplaysLoading() {
        composeTestRule.setContent {
            HomeScreen(recipeViewModel = RecipeViewModel())
        }
    }
}