package com.example.moviesearch.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MovieListViewModel @Inject constructor(): ViewModel() {


    fun test(){
        Log.d("MovieListViewModel", "MovieListViewModel")
    }

}