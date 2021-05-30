package com.example.pokelist.data.response

data class PokeListResponse(val count: Int, val next: String, val results: List<PokeListItemResponse> )