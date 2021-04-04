package com.asd.login.domain.usecase

import com.asd.login.domain.repository.LoginRepositoryViewContract
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val loginRepositoryViewContract: LoginRepositoryViewContract): LoginUseCaseContract {

    override suspend fun getTeste() = loginRepositoryViewContract.getTeste()
}