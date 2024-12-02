package com.toure.pulse.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class User(
    val userId: Int,
    val login : String,
    val email : String,
    val password : String,
    val loggedIn: Boolean = false
)
