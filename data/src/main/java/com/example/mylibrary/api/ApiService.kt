package com.example.mylibrary.api

import com.example.mylibrary.dto.UserDTO
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun listOfUsers(): Response<List<UserDTO>>

}