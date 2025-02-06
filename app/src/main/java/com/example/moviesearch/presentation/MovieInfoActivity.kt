package com.example.moviesearch.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesearch.App
import com.example.moviesearch.databinding.ActivityMovieInfoBinding
import com.example.moviesearch.domain.Movie
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

        val movieName = intent.getStringExtra("EXTRA_MOVIE_NAME")

        if (movieName != null) {
            viewModel.getMovie(movieName) { movie ->
                showMovieGenres(movie)
            }
        }
    }

    private fun showMovieGenres(movie: Movie?) {
        if (movie != null) {
            val genres = movie.docs.flatMap { it.genres }.joinToString(", ") { it.name }
            binding.movieGenres.text = genres
        } else {
            binding.movieGenres.text = "Жанры не найдены"
        }
    }
}