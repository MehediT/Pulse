package com.toure.pulse.domain.model

data class WorkoutSession(
    val sessionId: String,
    val userId: String,
    val workoutId: String,
    val date: String, // Format: YYYY-MM-DD
    val durationMinutes: Int,
    val caloriesBurned: Double
)