package com.example.homework27.di

import com.example.homework27.data.network.NewsRepositoryImpl
import com.example.homework27.domain.NewsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun getNewsRepository(impl: NewsRepositoryImpl): NewsRepository
}