package com.example.mylibrary.di

import com.example.domain.repository.UserRepository
import com.example.mylibrary.repository.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ObjectHelper {

    @Provides
    @Singleton
    fun provideUserObject(user: UserRepositoryImpl): UserRepository{
        return user
    }

}