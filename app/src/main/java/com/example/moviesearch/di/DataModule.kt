package com.example.moviesearch.di

import com.example.moviesearch.data.ApiFactory
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideApiFactory(): ApiFactory{
        return ApiFactory()
    }
}