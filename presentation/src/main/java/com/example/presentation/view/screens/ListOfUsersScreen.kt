package com.example.presentation.view.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.presentation.intent.UserIntent
import com.example.presentation.viewmodel.UserViewModel
import androidx.compose.material3.CircularProgressIndicator

@Composable
fun ListOfUsersScreens(modifier: Modifier = Modifier) {
    val viewModel: UserViewModel = hiltViewModel()

    val data by viewModel.state.collectAsState()
    LaunchedEffect(viewModel) {
        viewModel.processIntent(UserIntent.FetchUsers)
    }

    Log.d("LISTOFUSERS", "ON  VIEW")

    when{
        data.loading ->{
            CircularProgressIndicator(
                modifier = Modifier.fillMaxSize()
            )
        }

        data.error!=null -> {
            Log.d("LISTOFUSERS", data.error.toString())
        }

        else -> {
            Log.d("LISTOFUSERS", data.users.toString())
        }

    }

}