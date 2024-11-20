package com.toure.pulse.model

data class NutritionEntry(
    val entryId: String,
    val userId: String,
    val date: String, // Format: YYYY-MM-DD
    val mealType: String, // e.g., Breakfast, Lunch, Snack
    val calories: Int,
    val protein: Double, // in grams
    val carbs: Double, // in grams
    val fats: Double // in grams
)