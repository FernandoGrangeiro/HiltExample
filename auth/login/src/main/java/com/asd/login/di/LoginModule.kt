package com.asd.login.di

import com.asd.login.data.api.LoginService
import com.asd.login.data.datasource.LoginRemoteDataSource
import com.asd.login.data.datasource.LoginRemoteDataSourceViewContract
import com.asd.login.domain.repository.LoginRepository
import com.asd.login.domain.repository.LoginRepositoryViewContract
import com.asd.login.domain.usecase.LoginUseCase
import com.asd.login.domain.usecase.LoginUseCaseContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LoginModule {
    @Provides
    @Singleton
    fun provideLoginService(retrofit: Retrofit): LoginService =
        retrofit.create(LoginService::class.java)

    @Provides
    @Singleton
    fun provideLoginRemoteDataSourceContract(loginRemoteDataSourceViewContract: LoginRemoteDataSource): LoginRemoteDataSourceViewContract =
        loginRemoteDataSourceViewContract

    @Provides
    @Singleton
    fun provideLoginRepositoryContract(loginRepositoryViewContract: LoginRepository): LoginRepositoryViewContract =
        loginRepositoryViewContract

    @Provides
    @Singleton
    fun provideLoginUseCaseContract(loginUseCase: LoginUseCase): LoginUseCaseContract =
        loginUseCase
}