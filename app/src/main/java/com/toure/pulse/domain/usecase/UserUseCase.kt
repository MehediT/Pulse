package com.toure.pulse.domain.usecase

import com.toure.pulse.domain.repository.UserRepository
import com.toure.pulse.domain.usecase.user.AuthenticateUserUseCase
import com.toure.pulse.domain.usecase.user.CheckUserExistenceUseCase
import com.toure.pulse.domain.usecase.user.DeleteUserUseCase
import com.toure.pulse.domain.usecase.user.GetLoginStateUseCase
import com.toure.pulse.domain.usecase.user.GetUserByEmailUseCase
import com.toure.pulse.domain.usecase.user.GetUsersUseCase
import com.toure.pulse.domain.usecase.user.InsertUserUseCase
import com.toure.pulse.domain.usecase.user.UpdateLoginStateUseCase
import com.toure.pulse.domain.usecase.user.UpdateUserUseCase

class UserUseCase(
    private val userRepository: UserRepository,

    val getUsers: GetUsersUseCase = GetUsersUseCase(userRepository),
    val getUserByEmail: GetUserByEmailUseCase = GetUserByEmailUseCase(userRepository),
    val insertUser: InsertUserUseCase = InsertUserUseCase(userRepository),
    val updateUser: UpdateUserUseCase = UpdateUserUseCase(userRepository),
    val deleteUser: DeleteUserUseCase = DeleteUserUseCase(userRepository),
    val checkUserExistence: CheckUserExistenceUseCase = CheckUserExistenceUseCase(userRepository),
    val authenticateUser: AuthenticateUserUseCase = AuthenticateUserUseCase(userRepository),
    val updateLoginState: UpdateLoginStateUseCase = UpdateLoginStateUseCase(userRepository),
    val getLoginState: GetLoginStateUseCase = GetLoginStateUseCase(userRepository),
)

