package com.asd.login.data.api

import retrofit2.Response
import retrofit2.http.GET

interface LoginService {

    @GET("hello")
    suspend fun teste(): Response<Any>
}