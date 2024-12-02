package com.toure.pulse.domain.model

data class Workout(
    val workoutId: String,
    val name: String,
    val durationMinutes: Int,
    val exercises: List<Exercise>
)