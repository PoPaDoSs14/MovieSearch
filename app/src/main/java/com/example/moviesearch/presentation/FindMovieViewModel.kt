package com.example.moviesearch.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesearch.data.RepositoryImpl
import com.example.moviesearch.domain.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class FindMovieViewModel @Inject constructor(
    val repo: RepositoryImpl
): ViewModel() {


    fun getMovies(): List<Movie>{
        var movies = mutableListOf<Movie>()
        viewModelScope.launch(Dispatchers.IO){
            movies = repo.getMovies().toMutableList()
        }
        return movies.toList()
    }

    fun test(){
        Log.d("TEST", this.toString())
    }
}