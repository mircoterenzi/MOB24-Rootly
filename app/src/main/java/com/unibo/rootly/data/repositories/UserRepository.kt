package com.unibo.rootly.data.repositories

import androidx.annotation.WorkerThread
import com.unibo.rootly.data.database.User
import com.unibo.rootly.data.database.daos.UserDao

class UserRepository(
    private val userDao: UserDao
) {
    @WorkerThread
    suspend fun insert(user: User) :Long = userDao.insertUser(user)
    @WorkerThread
    fun getUserByUsername(username: String) = userDao.getUserByUsername(username)

    @WorkerThread
    fun getUserById(userId: Int): User? = userDao.getUserById(userId)
}