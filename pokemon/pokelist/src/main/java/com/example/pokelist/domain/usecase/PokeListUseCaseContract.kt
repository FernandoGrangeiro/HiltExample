package com.example.pokelist.domain.usecase

import com.example.pokelist.data.response.PokeListResponse
import retrofit2.Response

interface PokeListUseCaseContract {
    suspend fun getPokeList(): Response<PokeListResponse>
}