package com.toure.pulse.domain.model

data class ProgressMetric(
    val metricId: String,
    val userId: String,
    val date: String, // Format: YYYY-MM-DD
    val weightKg: Double,
    val bodyFatPercentage: Double?,
    val muscleMassKg: Double?
)

