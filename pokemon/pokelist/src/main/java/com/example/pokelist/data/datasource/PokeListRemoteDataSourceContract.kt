package com.example.pokelist.data.datasource

import com.example.pokelist.data.response.PokeListResponse
import retrofit2.Response

interface PokeListRemoteDataSourceContract {
    suspend fun getPokeList(): Response<PokeListResponse>
}