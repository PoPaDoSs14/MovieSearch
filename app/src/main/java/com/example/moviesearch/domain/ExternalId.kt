package com.example.moviesearch.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ExternalId(
    val imdb: String,
    val kpHD: String,
    val tmdb: Int
) : Parcelable