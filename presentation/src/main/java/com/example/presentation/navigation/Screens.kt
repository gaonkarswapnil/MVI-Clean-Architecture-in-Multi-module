package com.example.presentation.navigation

import kotlinx.serialization.Serializable

//@Serializable
sealed class Screens(val route: String) {

//    @Serializable
    object ListOfUsers: Screens("list_of_user")
}