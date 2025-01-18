package com.example.moviesearch.data

import com.example.moviesearch.domain.Movie
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import javax.inject.Inject

interface Api {

    @GET("")
    suspend fun getMovies(): List<Movie>
}