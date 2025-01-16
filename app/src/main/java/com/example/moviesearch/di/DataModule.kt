package com.example.moviesearch.di

import com.example.moviesearch.data.Api
import com.example.moviesearch.data.RepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DataModule {

    @Binds
    abstract fun bindApi(api: Api): Api
}