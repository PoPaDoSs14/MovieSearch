package com.example.moviesearch.di

import com.example.moviesearch.presentation.FindMovieActivity
import com.example.moviesearch.presentation.FindMovieViewModel
import com.example.moviesearch.presentation.MovieListActivity
import com.example.moviesearch.presentation.MovieListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AbstractDataModule::class, DomainModule::class, DataModule::class])
interface ApplicationComponent {

    fun inject(activity: FindMovieActivity)

    fun inject(activity: MovieListActivity)


    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(

        ): ApplicationComponent
    }

}