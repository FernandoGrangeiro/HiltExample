package com.example.pokelist.domain.repository

import com.example.pokelist.data.response.PokeListResponse
import retrofit2.Response

interface PokeListRepositoryContract {
    suspend fun getPokeList(): Response<PokeListResponse>
}