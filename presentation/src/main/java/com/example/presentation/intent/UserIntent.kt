package com.example.presentation.intent

sealed class UserIntent {
    object FetchUsers: UserIntent()
}