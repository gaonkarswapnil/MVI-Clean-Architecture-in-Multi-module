package com.example.mylibrary.mapper

import com.example.domain.model.Address
import com.example.domain.model.Company
import com.example.domain.model.Geo
import com.example.domain.model.User
import com.example.mylibrary.dto.AddressDTO
import com.example.mylibrary.dto.CompanyDTO
import com.example.mylibrary.dto.GeoDTO
import com.example.mylibrary.dto.UserDTO

fun UserDTO.toDomain(): User{
    return User(
        address = address.toDomain(),
        company = company.toDomain(),
        email = email,
        id = id,
        name = name,
        phone = phone,
        username = username,
        website = website
    )
}

fun AddressDTO.toDomain(): Address{
    return Address(
        city = city,
        geo = geo.toDomain(),
        street = street,
        suite = suite,
        zipcode = zipcode
    )
}

fun GeoDTO.toDomain(): Geo{
    return Geo(
        lat = lat,
        lng = lng
    )
}

fun CompanyDTO.toDomain(): Company {
    return Company(
        bs = bs,
        catchPhrase = catchPhrase,
        name = name
    )
}