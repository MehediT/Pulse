package com.toure.pulse.domain.usecase.user

import com.toure.pulse.domain.repository.UserRepository

class CheckUserExistenceUseCase(private val userRepository: UserRepository) {
    suspend fun execute(email: String, login: String): Int {
        return userRepository.checkUser(email, login)
    }
}