package com.example.moviesearch.di

import com.example.moviesearch.presentation.FindMovieActivity
import com.example.moviesearch.presentation.FindMovieViewModel
import com.example.moviesearch.presentation.MovieListViewModel
import dagger.Component

@Component(modules = [AbstractDataModule::class, DomainModule::class, DataModule::class])
interface ApplicationComponent {


    fun inject(viewModel: MovieListViewModel)

    fun inject(viewModel: FindMovieViewModel)

    fun inject(activity: FindMovieActivity)


    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(

        ): ApplicationComponent
    }

}