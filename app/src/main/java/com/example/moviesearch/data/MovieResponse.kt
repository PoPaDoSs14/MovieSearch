package com.example.moviesearch.data

import com.example.moviesearch.domain.Search
import com.google.gson.annotations.SerializedName

data class MovieResponse(

    @SerializedName("Search")
    val searchResults: List<Search>,

    @SerializedName("totalResults")
    val totalResults: String,

    @SerializedName("Response")
    val response: String
) {
    fun isResponseSuccessful(): Boolean {
        return response.equals("True", ignoreCase = true)
    }
}