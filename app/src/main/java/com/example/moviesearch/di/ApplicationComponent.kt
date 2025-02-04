package com.example.moviesearch.di

import com.example.moviesearch.presentation.FindMovieActivity
import com.example.moviesearch.presentation.FindMovieViewModel
import com.example.moviesearch.presentation.MovieInfoActivity
import com.example.moviesearch.presentation.MovieListActivity
import com.example.moviesearch.presentation.MovieListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AbstractDataModule::class, DomainModule::class, DataModule::class])
interface ApplicationComponent {

    // Методы для внедрения зависимостей в Activity
    fun inject(activity: FindMovieActivity)
    fun inject(activity: MovieListActivity)
    fun inject(activity: MovieInfoActivity)

    // Другие инъекции, если необходимы

    @Component.Factory
    interface ApplicationComponentFactory {
        /**
         * Создает экземпляр ApplicationComponent.
         * Параметры можно добавить здесь, если требуется передавать зависимости.
         */
        fun create(): ApplicationComponent
    }
}
