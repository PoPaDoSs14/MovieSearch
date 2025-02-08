package com.example.moviesearch.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Doc(
    val ageRating: Int,
    val alternativeName: String,
    val backdrop: Backdrop,
    val countries: List<Country>,
    val description: String,
    val enName: String,
    val externalId: ExternalId,
    val genres: List<Genre>,
    val id: Int,
    val isSeries: Boolean,
    val logo: Logo,
    val movieLength: Int,
    val name: String,
    val names: List<Name>,
    val poster: Poster,
    val rating: Rating,
    val ratingMpaa: String,
    val releaseYears: List<ReleaseYear>,
    val seriesLength: Int,
    val shortDescription: String,
    val status: String,
    val ticketsOnSale: Boolean,
    val top10: Int,
    val top250: Int,
    val totalSeriesLength: Int,
    val type: String,
    val typeNumber: Int,
    val votes: Votes,
    val year: Int
) : Parcelable