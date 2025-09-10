package com.example.presentation.state

import com.example.domain.model.User

data class UserState (
    val loading: Boolean = false,
    val users: List<User> = emptyList(),
    val error: String? = null
)