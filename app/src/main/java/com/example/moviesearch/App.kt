package com.example.moviesearch

import android.app.Application
import com.example.moviesearch.di.DaggerApplicationComponent

class App(): Application() {

    val component by lazy {
        DaggerApplicationComponent
            .factory()
            .create()
    }
}