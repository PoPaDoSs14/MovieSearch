package com.example.moviesearch.domain

interface Repository {

    suspend fun getMovies(): List<Movie>
}