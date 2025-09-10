package com.example.domain.usecase

import com.example.domain.model.User
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class UserUseCase @Inject constructor(
    val userRepository: UserRepository
){

    suspend operator fun invoke(): List<User>{
        return userRepository.listOfUsers()
    }


}