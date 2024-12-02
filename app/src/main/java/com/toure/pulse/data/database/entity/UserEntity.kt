package com.toure.pulse.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val userId: Int,

    val login : String,
    val email : String,
    val password : String,

    @ColumnInfo(defaultValue = "False")
    val loggedIn: Boolean
)
