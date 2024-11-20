package com.toure.pulse.model

data class WorkoutPlan(
    val planId: String,
    val name: String,
    val description: String,
    val goal: String, // e.g., Weight Loss, Muscle Gain, Endurance
    val workouts: List<Workout>
)