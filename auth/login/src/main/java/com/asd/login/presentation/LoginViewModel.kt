package com.asd.login.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asd.login.domain.usecase.LoginUseCase
import com.asd.login.domain.usecase.LoginUseCaseContract
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCaseContract
) : ViewModel() {
    fun getTeste() = viewModelScope.launch {
        loginUseCase.getTeste().let {
            Log.d("asdasda", "asdasdasd")
        }
    }
}