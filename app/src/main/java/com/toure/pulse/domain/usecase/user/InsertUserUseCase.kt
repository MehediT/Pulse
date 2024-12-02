package com.toure.pulse.domain.usecase.user

import com.toure.pulse.domain.model.UserModel
import com.toure.pulse.domain.repository.UserRepository

class InsertUserUseCase(private val userRepository: UserRepository) {
    suspend fun execute(user: UserModel) {
        userRepository.insertUser(user)
    }
}