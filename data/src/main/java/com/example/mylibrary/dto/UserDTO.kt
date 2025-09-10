package com.example.mylibrary.dto

data class UserDTO(
    val address: AddressDTO,
    val company: CompanyDTO,
    val email: String,
    val id: Int,
    val name: String,
    val phone: String,
    val username: String,
    val website: String
)