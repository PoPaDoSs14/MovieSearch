package com.example.moviesearch.data

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Inject

class ApiFactory @Inject constructor() {

    private val BASE_URL: String = "https://movie-database-alternative.p.rapidapi.com/?s=Avengers%20Endgame&r=json&page=1"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    val api: Api = retrofit.create(Api::class.java)

}