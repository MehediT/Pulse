package com.toure.pulse.domain.model

data class FitnessGoal(
    val goalId: String,
    val userId: String,
    val goalType: String, // e.g., Weight Loss, Strength, Flexibility
    val targetValue: Double, // e.g., Target weight in kg or minutes of exercise
    val currentProgress: Double
)

