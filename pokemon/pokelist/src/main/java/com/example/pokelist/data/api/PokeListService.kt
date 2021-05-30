package com.example.pokelist.data.api

import com.example.pokelist.data.response.PokeListResponse
import retrofit2.Response
import retrofit2.http.GET

interface PokeListService {

    @GET("pokemon?limit=151")
    suspend fun getPokeList(): Response<PokeListResponse>
}