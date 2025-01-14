package com.example.moviesearch.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesearch.data.RepositoryImpl
import com.example.moviesearch.domain.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FindMovieViewModel(
    val repo: RepositoryImpl
): ViewModel() {


    fun getMovies(): List<Movie>{
        var movies = mutableListOf<Movie>()
        viewModelScope.launch(Dispatchers.IO){
            movies = repo.getMovies().toMutableList()
        }
        return movies.toList()
    }
}