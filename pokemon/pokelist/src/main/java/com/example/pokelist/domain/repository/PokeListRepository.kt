package com.example.pokelist.domain.repository

import com.example.pokelist.data.datasource.PokeListRemoteDataSourceContract
import com.example.pokelist.data.response.PokeListResponse
import retrofit2.Response
import javax.inject.Inject

class PokeListRepository @Inject constructor(private val pokeListRemoteDataSourceContract: PokeListRemoteDataSourceContract) :
    PokeListRepositoryContract {

    override suspend fun getPokeList(): Response<PokeListResponse> =
        pokeListRemoteDataSourceContract.getPokeList()
}

