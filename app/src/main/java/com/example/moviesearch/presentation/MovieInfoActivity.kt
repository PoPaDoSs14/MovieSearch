package com.example.moviesearch.presentation

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesearch.App
import com.example.moviesearch.databinding.ActivityMovieInfoBinding
import com.example.moviesearch.domain.Doc
import com.example.moviesearch.domain.Movie
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

        val doc: Doc? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra(DOC_EXTRA, Doc::class.java)
        } else {
            intent.getParcelableExtra(DOC_EXTRA)
        }
        showMovieDetails(doc)

    }

    private fun showMovieDetails(doc: Doc?) {
        if (doc != null) {
            binding.movieTitle.text = doc.name
            binding.movieReleaseYear.text = doc.releaseYears.toString()
            binding.movieRating.text = doc.rating.toString()

            val genres = doc.genres.joinToString(", ") { it.name }
            binding.movieGenres.text = genres
        } else {
            binding.movieTitle.text = MOVIE_TITLE
            binding.movieReleaseYear.text = MOVIE_RELEASE
            binding.movieRating.text = MOVIE_RATING
            binding.movieGenres.text = MOVIE_GENRES
        }
    }


    companion object{
        const val DOC_EXTRA = "EXTRA_MOVIE_DOC"

        const val MOVIE_TITLE = "Название не найдено"
        const val MOVIE_RELEASE = "Год не найден"
        const val MOVIE_RATING = "Рейтинг не найден"
        const val MOVIE_GENRES = "Жанры не найдены"
    }
}