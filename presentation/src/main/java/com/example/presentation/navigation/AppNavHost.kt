package com.example.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.presentation.view.screens.ListOfUsersScreens

@Composable
fun SetUp(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navHostController,
        startDestination = Screens.ListOfUsers.route
    ){
        composable(Screens.ListOfUsers.route){
            ListOfUsersScreens()
        }
    }
}