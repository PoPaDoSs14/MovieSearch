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

        val movie = intent.getStringExtra("EXTRA_MOVIE_NAME")

    }

    private fun showMovieDetails(movie: Movie?) {
        if (movie != null && movie.docs.isNotEmpty()) {
            val firstDoc = movie.docs.first()


            binding.movieTitle.text = firstDoc.name
            binding.movieReleaseYear.text = firstDoc.releaseYears.toString()
            binding.movieRating.text = firstDoc.rating.toString()

            val genres = firstDoc.genres.joinToString(", ") { it.name }
            binding.movieGenres.text = genres
        } else {
            binding.movieTitle.text = "Название не найдено"
            binding.movieReleaseYear.text = "Год не найден"
            binding.movieRating.text = "Рейтинг не найден"
            binding.movieGenres.text = "Жанры не найдены"
        }
    }
}