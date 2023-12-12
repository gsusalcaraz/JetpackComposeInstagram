package com.jalcaraz.jetpackcomposeinstagram.login.ui.domain

import com.jalcaraz.jetpackcomposeinstagram.login.ui.data.network.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user: String, password: String): Boolean {
        return repository.doLogin(user, password)
    }
}