package com.example.csc475recipeapp

import com.example.csc475recipeapp.data.network.MealApiClient
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertTrue
import org.junit.Test

class MealApiClientTest {

    @Test
    fun testGetRandomRecipe() = runBlocking {
        val meals = MealApiClient.getRandomRecipe()
        assertTrue(meals.isNotEmpty())
    }

}