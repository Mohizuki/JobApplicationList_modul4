package com.example.juliapp.ui.home

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.juliapp.databinding.ActivityHomeDetailBinding

class HomeDetailActivity : AppCompatActivity() {

    private var _binding: ActivityHomeDetailBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val EXTRA_NAME = "name"
        const val EXTRA_IMAGE = "image"
        const val EXTRA_SEX = "sex"
        const val EXTRA_AGE = "age"
        const val EXTRA_DESCRIPTION = "desc"
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityHomeDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.imageDetail
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val name = binding.nameDetail
        name.text = intent.getStringExtra(EXTRA_NAME)

        val sex = binding.sexDetail
        sex.text = intent.getStringExtra(EXTRA_SEX)

        val age = binding.sexDetail
        age.text = intent.getStringExtra(EXTRA_AGE)

        val description = binding.descDetail
        description.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }
}