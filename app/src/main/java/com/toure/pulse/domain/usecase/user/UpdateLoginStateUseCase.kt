package com.toure.pulse.domain.usecase.user

import com.toure.pulse.domain.repository.UserRepository

class UpdateLoginStateUseCase(private val userRepository: UserRepository) {
    suspend fun execute(userId: Int, state: Boolean) {
        userRepository.updateLoginState(userId, state)
    }
}