package com.example.recipeapp.model

import androidx.annotation.DrawableRes

data class Recipe(
    val id: Int = 0,
    val name: String = "",
    val type: String = "",
    val serves: Int = 0,
    val difficulty: String = "",
    val ingredients: List<String> = listOf(),
    val preparationSteps: List<String> = listOf(),
    @DrawableRes val image: Int = 0

)
