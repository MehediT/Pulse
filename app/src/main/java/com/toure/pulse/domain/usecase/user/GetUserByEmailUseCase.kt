package com.toure.pulse.domain.usecase.user

import com.toure.pulse.domain.model.UserModel
import com.toure.pulse.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class GetUserByEmailUseCase(private val userRepository: UserRepository) {
    fun execute(email: String): Flow<List<UserModel>> {
        return userRepository.getUserByEmail(email)
    }
}