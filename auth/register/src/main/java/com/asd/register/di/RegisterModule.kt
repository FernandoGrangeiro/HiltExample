package com.asd.register.di

import com.asd.register.data.api.RegisterService
import com.asd.register.data.datasource.RegisterRemoteDataSource
import com.asd.register.data.datasource.RegisterRemoteDataSourceViewContract
import com.asd.register.domain.repository.RegisterRepository
import com.asd.register.domain.repository.RegisterRepositoryViewContract
import com.asd.register.domain.usecase.RegisterUseCase
import com.asd.register.domain.usecase.RegisterUseCaseContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RegisterModule {
    @Provides
    @Singleton
    fun provideRegisterService(retrofit: Retrofit): RegisterService =
        retrofit.create(RegisterService::class.java)

    @Provides
    @Singleton
    fun provideRegisterRemoteDataSourceContract(registerRemoteDataSourceViewContract: RegisterRemoteDataSource): RegisterRemoteDataSourceViewContract =
        registerRemoteDataSourceViewContract

    @Provides
    @Singleton
    fun provideRegisterRepositoryContract(registerRepositoryViewContract: RegisterRepository): RegisterRepositoryViewContract =
        registerRepositoryViewContract

    @Provides
    @Singleton
    fun provideRegisterUseCaseContract(registerUseCase: RegisterUseCase): RegisterUseCaseContract =
        registerUseCase
}