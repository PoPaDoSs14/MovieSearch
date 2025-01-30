package com.example.moviesearch.data

import com.example.moviesearch.domain.Doc
import com.google.gson.annotations.SerializedName

data class MovieResponse(

    @SerializedName("docs")
    val movies: List<Doc>,

    @SerializedName("totalResults")
    val totalResults: String,

    @SerializedName("Response")
    val response: String
) {
    fun isResponseSuccessful(): Boolean {
        return response.equals("True", ignoreCase = true)
    }

    fun getTotalResultsCount(): Int {
        return totalResults.toIntOrNull() ?: 0
    }
}