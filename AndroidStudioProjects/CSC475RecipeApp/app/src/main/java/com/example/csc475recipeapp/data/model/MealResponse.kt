package com.example.csc475recipeapp.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MealResponse(
    @SerialName("meals")
    val meals: List<Meal>
)