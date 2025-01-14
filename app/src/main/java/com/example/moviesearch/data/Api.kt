package com.example.moviesearch.data

import com.example.moviesearch.domain.Movie
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface Api {

    @GET("test")
    suspend fun getMovies(): List<Movie>
}