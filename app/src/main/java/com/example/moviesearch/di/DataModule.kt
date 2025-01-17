package com.example.moviesearch.di

import com.example.moviesearch.data.Api
import com.example.moviesearch.data.RepositoryImpl
import com.example.moviesearch.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DataModule {

    @Binds
    abstract fun provideRepo(impl: RepositoryImpl): Repository
}