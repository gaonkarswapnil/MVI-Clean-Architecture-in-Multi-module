package com.example.presentation.viewmodel

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecase.UserUseCase
import com.example.presentation.intent.UserIntent
import com.example.presentation.state.UserState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    val useCase: UserUseCase
): ViewModel(){

    private val _state = MutableStateFlow(UserState())
    val state: StateFlow<UserState> = _state.asStateFlow()


    fun processIntent(intent: UserIntent) {
        viewModelScope.launch {
            when (intent) {
                is UserIntent.FetchUsers -> fetchUsers()

            }
        }
    }

    private suspend fun fetchUsers() {
        _state.value = UserState(loading = true, error = null)
        try{
            _state.value = UserState(loading = false, users = useCase())
        }catch (e: Exception){
            _state.value = UserState(loading = false, error = e.message)
        }
    }

}