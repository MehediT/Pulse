package com.toure.pulse.domain.usecase.user

import com.toure.pulse.domain.model.UserModel
import com.toure.pulse.domain.repository.UserRepository

class UpdateUserUseCase(private val userRepository: UserRepository) {
    suspend fun execute(user: UserModel) {
        userRepository.updateUser(user)
    }
}