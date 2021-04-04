package com.asd.login.domain.usecase

import com.asd.login.domain.repository.LoginRepositoryViewContract
import retrofit2.Response
import javax.inject.Inject

interface LoginUseCaseContract{

    suspend fun getTeste(): Response<Any>
}