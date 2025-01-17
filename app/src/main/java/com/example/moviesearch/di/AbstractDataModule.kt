package com.example.moviesearch.di

import com.example.moviesearch.data.RepositoryImpl
import com.example.moviesearch.domain.Repository
import dagger.Binds
import dagger.Module

@Module
abstract class AbstractDataModule {

    @Binds
    abstract fun provideRepo(impl: RepositoryImpl): Repository
}