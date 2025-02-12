package com.example.moviesearch.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesearch.data.RepositoryImpl
import com.example.moviesearch.domain.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MovieInfoViewModel @Inject constructor(
    val repo: RepositoryImpl
): ViewModel() {



}