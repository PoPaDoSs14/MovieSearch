package com.example.moviesearch.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesearch.databinding.ActivityMainBinding
import javax.inject.Inject

class FindMovieActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: FindMovieViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}