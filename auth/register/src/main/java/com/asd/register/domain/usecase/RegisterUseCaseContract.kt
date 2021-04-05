package com.asd.register.domain.usecase

import retrofit2.Response

interface RegisterUseCaseContract {
    suspend fun getTeste(): Response<Any>
}