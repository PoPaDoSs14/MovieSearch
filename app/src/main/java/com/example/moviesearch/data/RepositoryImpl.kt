package com.example.moviesearch.data

import com.example.moviesearch.domain.Movie
import com.example.moviesearch.domain.Repository
import com.example.moviesearch.domain.Search
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    val api: ApiFactory
): Repository {

    override suspend fun getMovies(search: String): Movie = api.api.getMovies(search = search)
}