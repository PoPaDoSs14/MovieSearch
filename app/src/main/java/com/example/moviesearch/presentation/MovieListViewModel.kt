package com.example.moviesearch.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesearch.data.RepositoryImpl
import com.example.moviesearch.domain.Movie
import kotlinx.coroutines.launch
import javax.inject.Inject

class MovieListViewModel @Inject constructor(
    val repositoryImpl: RepositoryImpl
) : ViewModel() {

    private val _movie = MutableLiveData<Movie>()
    val movie: LiveData<Movie> get() = _movie

    init {
        getMovies()
    }

    fun getMovies() {
        viewModelScope.launch {
            _movie.value = repositoryImpl.getMovies()
        }
    }

    fun test(){
        Log.d("MovieListViewModel", "MovieListViewModel")
    }
}