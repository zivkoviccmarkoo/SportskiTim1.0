package com.example.sportskitim10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sportskitim10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.btnIgrac.setOnClickListener {
            val intent = Intent(this, Igrac::class.java)
            startActivity(intent)
        }
        binding.btnTim.setOnClickListener {
            val intent = Intent(this, Tim::class.java)
            startActivity(intent)
        }
        binding.btnDodajutim.setOnClickListener {
            val intent = Intent(this, IgracUTimu::class.java)
            startActivity(intent)
        }

    }
}