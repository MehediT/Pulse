package com.toure.pulse.domain.repository

import com.toure.pulse.domain.model.UserModel
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    /**
     * Get all `users` form database
     * */
    fun getUsers() : Flow<List<UserModel>>
    /**
     * Get all `users` form database like `email`
     * */
    fun getUserByEmail(email : String) : Flow<List<UserModel>>
    /**
     * Insert a user form database
     * */
    suspend fun insertUser(user : UserModel)
    /**
     * Update a user form database
     * */
    suspend fun updateUser(user : UserModel)
    /**
     * Delete a user form database
     * */
    suspend fun deleteUser(user : UserModel)

    /**
     * Check if a user already exist form the database by `email` or `login`
     */
    suspend fun checkUser(email: String, login: String): Int
    /**
     * Authenticate a user by their email and password
     * Returns the UserEntity if found, otherwise null
     */
    suspend fun authenticateUser(email: String, password: String): UserModel?
    /**
     * Get all `users` form database like `email`
     * */
    suspend fun updateLoginState(userId: Int, state: Boolean)

    /**
     * Get the login state of a user
     * */
    suspend fun getLoginState(userId: Int): Boolean
}