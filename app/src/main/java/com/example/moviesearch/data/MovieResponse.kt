package com.example.moviesearch.data

import com.example.moviesearch.domain.Search
import com.google.gson.annotations.SerializedName

class MovieResponse(

    @SerializedName("Search")
    val Searchs: List<Search>,

    @SerializedName("totalResults")
    val totalResults: String,

    @SerializedName("Response")
    val Response: String
) {

}