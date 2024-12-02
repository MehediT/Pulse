package com.toure.pulse.domain.model

data class TargetMuscle(
    val bodyPartId: String,
    val name: String,
    val description: String,
    val targetMuscleGroup: String, // e.g., Chest, Legs, Back
    val muscleImageId: Int,
)