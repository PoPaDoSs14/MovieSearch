package com.example.moviesearch.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesearch.data.RepositoryImpl
import com.example.moviesearch.domain.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class MovieInfoViewModel @Inject constructor(
    val repo: RepositoryImpl
): ViewModel() {


    fun getMovie(search: String): Movie {
        var movie: Movie? = null
        viewModelScope.launch(Dispatchers.IO){
            movie = repo.getMovies(search)
        }
        return movie?: throw RuntimeException("movies == null")
    }
}