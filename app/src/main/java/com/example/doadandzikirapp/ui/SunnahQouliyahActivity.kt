package com.example.doadandzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doadandzikirapp.R
import com.example.doadandzikirapp.databinding.ActivityDetailArtikelBinding
import com.example.doadandzikirapp.databinding.ActivitySunnahQouliyahBinding

class SunnahQouliyahActivity : AppCompatActivity() {

    lateinit var binding: ActivitySunnahQouliyahBinding

    companion object{
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySunnahQouliyahBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}