package com.example.moviesearch.data

import com.example.moviesearch.domain.Movie
import com.example.moviesearch.domain.Repository
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    val api: Api
): Repository {

    override suspend fun getMovies(): List<Movie> = api.getMovies()
}