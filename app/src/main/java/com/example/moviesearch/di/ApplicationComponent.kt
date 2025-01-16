package com.example.moviesearch.di

import com.example.moviesearch.presentation.FindMovieViewModel
import com.example.moviesearch.presentation.MovieListViewModel
import dagger.Component
import dagger.Module

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {


    fun inject(viewModel: MovieListViewModel)

    fun inject(viewModel: FindMovieViewModel)

}