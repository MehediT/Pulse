package com.toure.pulse.domain.model

data class UserProfile(
    val userId: String,
    val name: String,
    val age: Int,
    val gender: String,
    val heightCm: Double, // in cm
    val weightKg: Double, // in kg
    val activityLevel: String // e.g., Sedentary, Active, Very Active
)