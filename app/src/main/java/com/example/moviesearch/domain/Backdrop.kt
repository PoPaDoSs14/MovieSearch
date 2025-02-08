package com.example.moviesearch.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Backdrop(
    val previewUrl: String,
    val url: String
) : Parcelable