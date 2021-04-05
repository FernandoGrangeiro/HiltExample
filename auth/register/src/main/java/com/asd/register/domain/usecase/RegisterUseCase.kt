package com.asd.register.domain.usecase

import com.asd.register.domain.repository.RegisterRepositoryViewContract
import javax.inject.Inject

class RegisterUseCase @Inject constructor(private val registerRepositoryViewContract: RegisterRepositoryViewContract) :
    RegisterUseCaseContract {

    override suspend fun getTeste() = registerRepositoryViewContract.getTeste()
}