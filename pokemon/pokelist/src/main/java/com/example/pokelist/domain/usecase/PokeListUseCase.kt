package com.example.pokelist.domain.usecase

import com.example.pokelist.domain.repository.PokeListRepositoryContract
import javax.inject.Inject

class PokeListUseCase @Inject constructor(private val pokeListRepositoryContract: PokeListRepositoryContract) :
    PokeListUseCaseContract {

    override suspend fun getPokeList() = pokeListRepositoryContract.getPokeList()
}