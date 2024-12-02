package com.toure.pulse.domain.model

data class Exercise(
    val exerciseId: String,
    val name: String,
    val description: String,
    val targetMuscleGroup: String, // e.g., Chest, Legs, Back
    val reps: Int,
    val sets: Int,
    val restTimeSeconds: Int
)

