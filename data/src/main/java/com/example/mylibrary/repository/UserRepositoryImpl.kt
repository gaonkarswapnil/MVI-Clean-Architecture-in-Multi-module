package com.example.mylibrary.repository

import com.example.domain.model.User
import com.example.domain.repository.UserRepository
import com.example.mylibrary.api.ApiService
import com.example.mylibrary.mapper.toDomain
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val apiService: ApiService
): UserRepository {
    override suspend fun listOfUsers(): List<User> {
        val response = apiService.listOfUsers()

        if (response.isSuccessful ){
            response.body().let { listOfUserDto ->
                if(listOfUserDto != null){
                    return listOfUserDto.map {
                        it.toDomain()
                    }
                } else{
                    throw Exception("Response Body is null")
                }
            }
        }else{
            throw Exception("Response UnSuccessful")
        }
    }
}

