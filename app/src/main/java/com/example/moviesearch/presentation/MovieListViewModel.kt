package com.example.moviesearch.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesearch.data.RepositoryImpl
import com.example.moviesearch.domain.Movie
import kotlinx.coroutines.launch
import javax.inject.Inject

class MovieListViewModel @Inject constructor(
    val repositoryImpl: RepositoryImpl
): ViewModel() {

    lateinit var movie: Movie

    init {
        getMovies()
    }


    fun test(){
        Log.d("MovieListViewModel", "MovieListViewModel")
    }

    fun getMovies() {
        viewModelScope.launch {
            movie = repositoryImpl.getMovies()
        }
    }

}