package com.asd.register.data.api

import retrofit2.Response
import retrofit2.http.GET

interface RegisterService {

    @GET("hello")
    suspend fun teste(): Response<Any>
}