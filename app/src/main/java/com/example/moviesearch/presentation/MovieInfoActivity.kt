package com.example.moviesearch.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesearch.App
import com.example.moviesearch.databinding.ActivityMovieInfoBinding
import javax.inject.Inject

class MovieInfoActivity : AppCompatActivity() {

    @Inject()
    private lateinit var viewModel: MovieInfoViewModel

    private lateinit var binding: ActivityMovieInfoBinding

    lateinit var movieName: String

    private val component by lazy {
        (application as App).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component.inject(this)
        binding = ActivityMovieInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getMovieName()


    }

    private fun getMovieName() {
        movieName = intent.getStringExtra("EXTRA_MOVIE_NAME")!!
        if (movieName != null) {
            binding.movieTitle.text = movieName
        } else {
            binding.movieTitle.text = "Название фильма не указано"
        }
    }
}