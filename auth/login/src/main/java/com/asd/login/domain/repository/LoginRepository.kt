package com.asd.login.domain.repository

import com.asd.login.data.datasource.LoginRemoteDataSourceViewContract
import retrofit2.Response
import javax.inject.Inject

class LoginRepository @Inject constructor(private val loginRemoteDataSourceViewContract: LoginRemoteDataSourceViewContract) :
    LoginRepositoryViewContract {
    override suspend fun getTeste(): Response<Any> = loginRemoteDataSourceViewContract.getTeste()
}

