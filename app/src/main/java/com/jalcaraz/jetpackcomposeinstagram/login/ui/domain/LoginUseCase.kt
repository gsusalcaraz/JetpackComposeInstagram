package com.jalcaraz.jetpackcomposeinstagram.login.ui.domain

import com.jalcaraz.jetpackcomposeinstagram.login.ui.data.network.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val repository: LoginRepository){
//    private val repository = LoginRepository()

    suspend operator fun invoke(user: String, password: String): Boolean {
//        return repository.doLogin(user, password)
        return repository.doLogin(user, password)
    }
}