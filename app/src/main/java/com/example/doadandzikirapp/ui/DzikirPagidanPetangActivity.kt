package com.example.doadandzikirapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doadandzikirapp.R
import com.example.doadandzikirapp.databinding.ActivityDzikirPagidanPetangBinding
import com.example.doadandzikirapp.ui.detail.DzikirPagiActivity
import com.example.doadandzikirapp.ui.detail.DzikirPetangActivity

class DzikirPagidanPetangActivity : AppCompatActivity() {

    lateinit var binding: ActivityDzikirPagidanPetangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagidanPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir - Pagi dan Petang"

        binding.apply {
            imgBtnDzikirPagi.setOnClickListener{
                val intentPagi = Intent(this@DzikirPagidanPetangActivity,DzikirPagiActivity::class.java)
                startActivity(intentPagi)
            }
            imgBtnDzikirPetang.setOnClickListener{
                val intentPetang = Intent(this@DzikirPagidanPetangActivity,DzikirPetangActivity::class.java)
                startActivity(intentPetang)
            }
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}