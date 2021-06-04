package com.example.pokelist.data.datasource

import com.example.pokelist.data.api.PokeListService
import com.example.pokelist.data.response.PokeListResponse
import retrofit2.Response
import javax.inject.Inject

class PokeListRemoteDataSource @Inject constructor(private val pokeListService: PokeListService) :
    PokeListRemoteDataSourceContract {

    override suspend fun getPokeList(): Response<PokeListResponse> = pokeListService.getPokeList()
}