package com.asd.register.data.datasource

import retrofit2.Response

interface RegisterRemoteDataSourceViewContract {

    suspend fun getTeste(): Response<Any>

}