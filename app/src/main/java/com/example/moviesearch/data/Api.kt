package com.example.moviesearch.data

import com.example.moviesearch.domain.Movie
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
import javax.inject.Inject

interface Api {
    @GET("v1.4/search")
    suspend fun getMovies(
        @Query("name") name: String,
        @Header("X-API-KEY") apiKey: String
    ): Movie
}