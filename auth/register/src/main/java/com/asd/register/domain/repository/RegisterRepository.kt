package com.asd.register.domain.repository

import com.asd.register.data.datasource.RegisterRemoteDataSourceViewContract
import retrofit2.Response
import javax.inject.Inject

class RegisterRepository @Inject constructor(private val registerRemoteDataSourceViewContract: RegisterRemoteDataSourceViewContract) :
    RegisterRepositoryViewContract {
    override suspend fun getTeste(): Response<Any> = registerRemoteDataSourceViewContract.getTeste()
}

