package com.example.moviesearch.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Votes(
    val await: Int,
    val filmCritics: Int,
    val imdb: Int,
    val kp: String,
    val russianFilmCritics: Int,
    val tmdb: Int
) : Parcelable