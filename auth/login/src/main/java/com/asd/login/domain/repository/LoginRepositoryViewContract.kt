package com.asd.login.domain.repository

import retrofit2.Response

interface LoginRepositoryViewContract {

    suspend fun getTeste(): Response<Any>

}