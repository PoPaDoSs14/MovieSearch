package com.example.moviesearch.data

import com.example.moviesearch.domain.Movie
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject

interface Api {

    @GET("?")
    suspend fun getMovies(
        @Query("s") search: String = "Avengers Endgame",
        @Query("r") responseFormat: String = "json"
    ): Movie
}