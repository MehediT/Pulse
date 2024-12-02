package com.toure.pulse.domain.usecase.user

import com.toure.pulse.domain.repository.UserRepository
import com.toure.pulse.domain.model.UserModel

class DeleteUserUseCase(private val userRepository: UserRepository) {
    suspend fun execute(user: UserModel) {
        userRepository.deleteUser(user)
    }
}