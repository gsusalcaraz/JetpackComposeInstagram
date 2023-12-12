package com.jalcaraz.jetpackcomposeinstagram.login.ui.data.network

import com.jalcaraz.jetpackcomposeinstagram.core.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginClient {
   // @GET("/v3/f78c9d33-28b1-4f81-9cf1-6d6ff78fa014")
    @GET("/v3/8f8d382e-cdca-42e0-84b6-cbbf193b1d0c")
    suspend fun doLogin(): Response<LoginResponse>

}