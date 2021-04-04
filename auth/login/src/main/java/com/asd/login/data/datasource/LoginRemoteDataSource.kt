package com.asd.login.data.datasource

import com.asd.login.data.api.LoginService
import retrofit2.Response
import javax.inject.Inject

class LoginRemoteDataSource @Inject constructor(private val loginService: LoginService) :
    LoginRemoteDataSourceViewContract {
    override suspend fun getTeste(): Response<Any> = loginService.teste()
}