package com.toure.pulse.domain.usecase.user

import com.toure.pulse.domain.repository.UserRepository

class GetLoginStateUseCase(private val userRepository: UserRepository) {
    suspend fun execute(userId: Int): Boolean {
        return userRepository.getLoginState(userId)
    }
}