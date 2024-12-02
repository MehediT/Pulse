package com.toure.pulse.domain.usecase.user

import com.toure.pulse.domain.model.UserModel
import com.toure.pulse.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class GetUsersUseCase(private val userRepository: UserRepository) {
    fun execute(): Flow<List<UserModel>> {
        return userRepository.getUsers()
    }
}


