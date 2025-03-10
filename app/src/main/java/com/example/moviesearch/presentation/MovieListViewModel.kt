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
    private val repositoryImpl: RepositoryImpl
) : ViewModel() {

    private val _movie = MutableLiveData<Movie>()
    val movie: LiveData<Movie> get() = _movie

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> get() = _errorMessage

    init {
        getMovies(BASE_SEARCH)
    }

    fun getMovies(search: String) {
        viewModelScope.launch {
            try {
                _movie.value = repositoryImpl.getMovies(search = search)
            } catch (e: Exception) {
                Log.e("MovieListViewModel", "Ошибка получения фильмов: ${e.message}")
                _errorMessage.value = "Ошибка получения фильмов: ${e.message}"
            }
        }
    }

    companion object {
        const val BASE_SEARCH = ""
    }
}