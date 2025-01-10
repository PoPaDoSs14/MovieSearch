package com.example.moviesearch.domain

data class Movie(
    val Response: String,
    val Search: List<Search>,
    val totalResults: String
)