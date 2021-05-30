package com.example.pokelist.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokelist.domain.usecase.PokeListUseCaseContract
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokeListViewModel @Inject constructor(
    private val pokeListUseCaseContract: PokeListUseCaseContract
) : ViewModel() {

    fun getPokeList() = viewModelScope.launch {
        pokeListUseCaseContract.getPokeList().let {
            it.body()?.let {
                Log.d("asdasda", it.results.size.toString())
            }
        }
    }
}