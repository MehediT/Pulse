package com.toure.pulse.domain.usecase.user

import com.toure.pulse.domain.model.UserModel
import com.toure.pulse.domain.repository.UserRepository

class AuthenticateUserUseCase(private val userRepository: UserRepository) {
    suspend fun execute(email: String, password: String): UserModel? {
        return userRepository.authenticateUser(email, password)
    }
}