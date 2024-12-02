package com.toure.pulse.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.toure.pulse.data.database.entity.UserEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    /**
     * Fetch all `users` form database
     * */
    @Query("select * from users")
    fun getUsers() : Flow<List<UserEntity>>
    /**
     * Fetch all `users` form database like `email`
     * */
    @Query("select * from users where email like :email")
    fun getUserByEmail(email : String) : Flow<List<UserEntity>>

    /**
     * Insert a user form database
     * */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user : UserEntity)
    /**
     * Update a user form database
     * */
    @Update(onConflict = OnConflictStrategy.ABORT)
    suspend fun updateUser(user : UserEntity)
    /**
     * Delete a user form database
     * */
    @Delete
    suspend fun deleteUser(user : UserEntity)

    /**
     * Check if a user already exist form the database by `email` or `login`
     */
    @Query("SELECT Count(*) FROM users WHERE email = :email AND login = :login")
    suspend fun checkUser(email: String, login: String): Int
    /**
     * Authenticate a user by their email and password
     * Returns the UserEntity if found, otherwise null
     */
    @Query("SELECT * FROM users WHERE email = :email AND password = :password")
    suspend fun authenticateUser(email: String, password: String): UserEntity?
    /**
     * Fetch all `users` form database like `email`
     * */
    @Query("UPDATE users SET loggedIn = :state WHERE userId = :userId")
    suspend fun updateLoginState(userId: Int, state: Boolean)

    /**
     * Get the login state of a user
     * */
    @Query("SELECT loggedIn FROM users WHERE userId = :userId")
    suspend fun getLoginState(userId: Int): Boolean
}