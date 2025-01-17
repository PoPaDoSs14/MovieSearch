package com.example.moviesearch.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesearch.App
import com.example.moviesearch.databinding.ActivityMainBinding
import javax.inject.Inject

class FindMovieActivity @Inject constructor() : AppCompatActivity() {

    @Inject
    lateinit var viewModel: FindMovieViewModel

    private val component by lazy {
        (application as App).component
    }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.test()

    }
}