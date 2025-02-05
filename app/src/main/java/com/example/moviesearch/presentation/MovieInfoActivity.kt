package com.example.moviesearch.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.moviesearch.App
import com.example.moviesearch.R
import com.example.moviesearch.databinding.ActivityMovieInfoBinding
import javax.inject.Inject

class MovieInfoActivity : AppCompatActivity() {

    @Inject()
    private lateinit var viewModel: MovieInfoViewModel

    private lateinit var binding: ActivityMovieInfoBinding

    private val component by lazy {
        (application as App).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component.inject(this)
        binding = ActivityMovieInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val movieName = intent.getStringExtra("EXTRA_MOVIE_NAME")
        if (movieName != null) {
            binding.movieTitle.text = movieName
        } else {
            binding.movieTitle.text = "Название фильма не указано"
        }
    }
}