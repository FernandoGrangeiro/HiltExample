package com.asd.login.data.datasource

import retrofit2.Response

interface LoginRemoteDataSourceViewContract {

    suspend fun getTeste(): Response<Any>

}