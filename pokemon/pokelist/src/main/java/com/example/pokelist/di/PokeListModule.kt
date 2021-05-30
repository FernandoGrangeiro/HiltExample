package com.example.pokelist.di

import com.asd.networkModule.Teste
import com.example.pokelist.data.api.PokeListService
import com.example.pokelist.data.datasource.PokeListRemoteDataSource
import com.example.pokelist.data.datasource.PokeListRemoteDataSourceContract
import com.example.pokelist.domain.repository.PokeListRepository
import com.example.pokelist.domain.repository.PokeListRepositoryContract
import com.example.pokelist.domain.usecase.PokeListUseCase
import com.example.pokelist.domain.usecase.PokeListUseCaseContract
import com.example.pokelist.presentation.adapter.PokeListAdapter
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class PokeListModule {
    @Provides
    @Singleton
    fun providePokeListService(@Teste retrofit: Retrofit): PokeListService =
        retrofit.create(PokeListService::class.java)

    @Provides
    @Singleton
    fun providePokeListRemoteDataSourceContract(pokeListRemoteDataSourceContract: PokeListRemoteDataSource): PokeListRemoteDataSourceContract =
        pokeListRemoteDataSourceContract

    @Provides
    @Singleton
    fun providePokeListRepositoryContract(pokeListRepositoryContract: PokeListRepository): PokeListRepositoryContract =
        pokeListRepositoryContract

    @Provides
    @Singleton
    fun providePokeListUseCaseContract(pokeListUseCase: PokeListUseCase): PokeListUseCaseContract =
        pokeListUseCase

    @Provides
    @Singleton
    fun providePokeListAdapter(): PokeListAdapter = PokeListAdapter(listOf())
}