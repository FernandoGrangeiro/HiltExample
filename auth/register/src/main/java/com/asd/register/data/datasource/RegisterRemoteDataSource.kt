package com.asd.register.data.datasource

import com.asd.register.data.api.RegisterService
import retrofit2.Response
import javax.inject.Inject

class RegisterRemoteDataSource @Inject constructor(private val registerService: RegisterService) :
    RegisterRemoteDataSourceViewContract {
    override suspend fun getTeste(): Response<Any> = registerService.teste()
}