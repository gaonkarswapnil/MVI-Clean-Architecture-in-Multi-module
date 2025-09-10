package com.example.mviincleanarchitecture

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.presentation.navigation.SetUp

@Composable
fun AppHost(modifier: Modifier = Modifier) {
    val navHostController = rememberNavController()
    SetUp(navHostController)
}