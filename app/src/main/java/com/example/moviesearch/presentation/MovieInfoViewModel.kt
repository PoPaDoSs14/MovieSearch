package com.example.moviesearch.presentation

import androidx.lifecycle.ViewModel
import com.example.moviesearch.data.RepositoryImpl
import javax.inject.Inject

class MovieInfoViewModel @Inject constructor(
    val repo: RepositoryImpl
): ViewModel() {
}