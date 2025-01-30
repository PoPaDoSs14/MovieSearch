package com.example.moviesearch.data

import com.example.moviesearch.domain.Movie
import com.example.moviesearch.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    val api: ApiFactory
): Repository {

    override suspend fun getMovies(search: String): Movie = api.api.getMovies(name = search, TODO())
}