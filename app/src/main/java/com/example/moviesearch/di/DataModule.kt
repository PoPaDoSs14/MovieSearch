package com.example.moviesearch.di

import com.example.moviesearch.data.ApiFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    @Singleton
    fun provideApiKey(): String {
        return "api-test"
    }

    @Provides
    @Singleton
    fun provideApiFactory(apiKey: String): ApiFactory {
        return ApiFactory(apiKey)
    }
}