package com.toure.pulse.infrastructure.database.repository

import com.toure.pulse.infrastructure.database.dao.UserDao
import com.toure.pulse.infrastructure.database.entity.UserEntity
import com.toure.pulse.domain.model.UserModel
import com.toure.pulse.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UserDbRepository(
    private val userDao: UserDao
) : UserRepository {
    override fun getUsers(): Flow<List<UserModel>> = userDao.getUsers().map { userEntities -> userEntities.map{ it.convertToModel()} }

    override fun getUserByEmail(email: String): Flow<List<UserModel>> = userDao.getUserByEmail(email).map { userEntities -> userEntities.map{ it.convertToModel()} }

    override suspend fun insertUser(user: UserModel) =userDao.insertUser(user.convertToEntity())

    override suspend fun updateUser(user: UserModel) = userDao.updateUser(user.convertToEntity())

    override suspend fun deleteUser(user: UserModel) = userDao.deleteUser(user.convertToEntity())

    override suspend fun checkUser(email: String, login: String): Int  = userDao.checkUser(email, login)

    override suspend fun authenticateUser(email: String, password: String): UserModel? = userDao.authenticateUser(email, password)?.convertToModel()

    override suspend fun updateLoginState(userId: Int, state: Boolean) = userDao.updateLoginState(userId, state)

    override suspend fun getLoginState(userId: Int): Boolean = userDao.getLoginState(userId)
}

fun UserModel.convertToEntity() = UserEntity(userId, login,email,password,loggedIn)
fun UserEntity.convertToModel() = UserModel(userId, login,email,password,loggedIn)
