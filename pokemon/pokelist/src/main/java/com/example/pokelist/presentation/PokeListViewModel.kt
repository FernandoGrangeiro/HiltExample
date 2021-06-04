package com.example.pokelist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokelist.data.response.PokeListResponse
import com.example.pokelist.domain.usecase.PokeListUseCaseContract
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokeListViewModel @Inject constructor(
    private val pokeListUseCaseContract: PokeListUseCaseContract
) : ViewModel() {

    private val _pokelist = MutableLiveData<PokeListResponse>()
    val pokelist = _pokelist

    fun getPokeList() = viewModelScope.launch {
        pokeListUseCaseContract.getPokeList().let {
            it.body()?.let {
                _pokelist.value = it
            }
        }
    }
}