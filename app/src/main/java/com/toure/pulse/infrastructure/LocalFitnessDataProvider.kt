package com.toure.pulse.infrastructure
//
//import com.toure.pulse.R
//import com.toure.pulse.domain.model.Exercise
//import com.toure.pulse.domain.model.FitnessGoal
//import com.toure.pulse.domain.model.NutritionEntry
//import com.toure.pulse.domain.model.ProgressMetric
//import com.toure.pulse.domain.model.TargetMuscle
//import com.toure.pulse.domain.model.User
//import com.toure.pulse.domain.model.UserProfile
//import com.toure.pulse.domain.model.Workout
//import com.toure.pulse.domain.model.WorkoutPlan
//import com.toure.pulse.domain.model.WorkoutSession

object LocalFitnessDataProvider {

//    val sampleUsers = listOf(
//        User(
//            userId = 1,
//            email = "alice.johnson@gmail.com",
//            login = "johnsonA",
//            password = "1234567890",
//        ),
//        User(
//            userId = 2,
//            email = "sample@gmail.com",
//            login = "sample",
//            password = "sample_pwd"
//        ),
//    )
//
//    val sampleUserProfiles = listOf(
//        UserProfile(
//            userId = "u001",
//            name = "Alice Johnson",
//            age = 28,
//            gender = "Female",
//            heightCm = 165.0,
//            weightKg = 60.0,
//            activityLevel = "Never Active"
//        ),
//        UserProfile(
//            userId = "u002",
//            name = "Sample Toure",
//            age = 22,
//            gender = "Male",
//            heightCm = 175.0,
//            weightKg = 60.0,
//            activityLevel = "Moderately Active"
//        )
//    )
//
//    val targetMuscles = listOf(
//        TargetMuscle(
//            bodyPartId = "m001",
//            name = "Pectorals",
//            description = "The chest muscles, responsible for pushing movements.",
//            targetMuscleGroup = "Chest",
//            muscleImageId = R.drawable.chest_muscle // Replace with actual drawable resource ID
//        ),
//        TargetMuscle(
//            bodyPartId = "m002",
//            name = "Quadriceps",
//            description = "The large muscles at the front of the thigh, important for leg movements.",
//            targetMuscleGroup = "Legs",
//            muscleImageId = R.drawable.quadriceps_muscle // Replace with actual drawable resource ID
//        ),
//        TargetMuscle(
//            bodyPartId = "m003",
//            name = "Latissimus Dorsi",
//            description = "The broad back muscles, responsible for pulling movements.",
//            targetMuscleGroup = "Back",
//            muscleImageId = R.drawable.back_muscle // Replace with actual drawable resource ID
//        ),
//        TargetMuscle(
//            bodyPartId = "m004",
//            name = "Biceps",
//            description = "The muscles at the front of the upper arm, used in curling motions.",
//            targetMuscleGroup = "Arms",
//            muscleImageId = R.drawable.biceps_muscle // Replace with actual drawable resource ID
//        ),
//        TargetMuscle(
//            bodyPartId = "m005",
//            name = "Triceps",
//            description = "The muscles at the back of the upper arm, important for extension movements.",
//            targetMuscleGroup = "Arms",
//            muscleImageId = R.drawable.triceps_muscle // Replace with actual drawable resource ID
//        ),
//        TargetMuscle(
//            bodyPartId = "m006",
//            name = "Hamstrings",
//            description = "The muscles at the back of the thigh, crucial for running and jumping.",
//            targetMuscleGroup = "Legs",
//            muscleImageId = R.drawable.hamstrings_muscle // Replace with actual drawable resource ID
//        ),
//        TargetMuscle(
//            bodyPartId = "m007",
//            name = "Glutes",
//            description = "The muscles of the buttocks, essential for hip movements.",
//            targetMuscleGroup = "Legs",
//            muscleImageId = R.drawable.glutes_muscle // Replace with actual drawable resource ID
//        ),
//        TargetMuscle(
//            bodyPartId = "m008",
//            name = "Abdominals",
//            description = "The core muscles at the front of the torso, critical for stabilization.",
//            targetMuscleGroup = "Core",
//            muscleImageId = R.drawable.abs_muscle // Replace with actual drawable resource ID
//        ),
//        TargetMuscle(
//            bodyPartId = "m009",
//            name = "Deltoids",
//            description = "The shoulder muscles, used for lifting and rotational movements.",
//            targetMuscleGroup = "Shoulders",
//            muscleImageId = R.drawable.deltoids_muscle // Replace with actual drawable resource ID
//        ),
//        TargetMuscle(
//            bodyPartId = "m010",
//            name = "Calves",
//            description = "The muscles at the back of the lower leg, important for walking and jumping.",
//            targetMuscleGroup = "Legs",
//            muscleImageId = R.drawable.calves_muscle // Replace with actual drawable resource ID
//        )
//    )
//
//    val sampleExercises = listOf(
//        Exercise(
//            exerciseId = "e101",
//            name = "Push-ups",
//            description = "Strength exercise targeting chest and triceps.",
//            targetMuscleGroup = "Chest",
//            reps = 12,
//            sets = 3,
//            restTimeSeconds = 60
//        ),
//        Exercise(
//            exerciseId = "e102",
//            name = "Squats",
//            description = "Compound exercise for lower body strength.",
//            targetMuscleGroup = "Legs",
//            reps = 15,
//            sets = 4,
//            restTimeSeconds = 90
//        ),
//        Exercise(
//            exerciseId = "e103",
//            name = "Plank",
//            description = "Core stabilization exercise.",
//            targetMuscleGroup = "Core",
//            reps = 1,
//            sets = 3,
//            restTimeSeconds = 60
//        )
//    )
//
//    val sampleWorkouts = listOf(
//        Workout(
//            workoutId = "w001",
//            name = "Full Body Beginner",
//            durationMinutes = 30,
//            exercises = sampleExercises
//        ),
//        Workout(
//            workoutId = "w002",
//            name = "Leg Day Focus",
//            durationMinutes = 45,
//            exercises = sampleExercises.filter { it.targetMuscleGroup == "Legs" }
//        )
//    )
//
//    val sampleWorkoutPlans = listOf(
//        WorkoutPlan(
//            planId = "p001",
//            name = "Beginner Fitness Plan",
//            description = "A simple plan to get you started with regular workouts.",
//            goal = "General Fitness",
//            workouts = sampleWorkouts
//        )
//    )
//
//    val sampleSessions = listOf(
//        WorkoutSession(
//            sessionId = "s001",
//            userId = "u001",
//            workoutId = "w001",
//            date = "2024-11-18",
//            durationMinutes = 30,
//            caloriesBurned = 200.0
//        ),
//        WorkoutSession(
//            sessionId = "s002",
//            userId = "u001",
//            workoutId = "w002",
//            date = "2024-11-19",
//            durationMinutes = 45,
//            caloriesBurned = 350.0
//        )
//    )
//
//    val sampleNutritionEntries = listOf(
//        NutritionEntry(
//            entryId = "n001",
//            userId = "u001",
//            date = "2024-11-18",
//            mealType = "Breakfast",
//            calories = 300,
//            protein = 20.0,
//            carbs = 35.0,
//            fats = 10.0
//        ),
//        NutritionEntry(
//            entryId = "n002",
//            userId = "u001",
//            date = "2024-11-18",
//            mealType = "Lunch",
//            calories = 600,
//            protein = 40.0,
//            carbs = 50.0,
//            fats = 20.0
//        )
//    )
//
//    val sampleGoals = listOf(
//        FitnessGoal(
//            goalId = "g001",
//            userId = "u001",
//            goalType = "Weight Loss",
//            targetValue = 55.0, // Target weight in kg
//            currentProgress = 60.0
//        )
//    )
//
//    val sampleProgressMetrics = listOf(
//        ProgressMetric(
//            metricId = "m001",
//            userId = "u001",
//            date = "2024-11-18",
//            weightKg = 60.0,
//            bodyFatPercentage = 25.0,
//            muscleMassKg = 20.0
//        )
//    )
}
