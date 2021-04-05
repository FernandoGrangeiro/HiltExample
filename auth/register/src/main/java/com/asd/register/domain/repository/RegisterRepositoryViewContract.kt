package com.asd.register.domain.repository

import retrofit2.Response

interface RegisterRepositoryViewContract {
    suspend fun getTeste(): Response<Any>
}