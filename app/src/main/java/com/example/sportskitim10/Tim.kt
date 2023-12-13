package com.example.sportskitim10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sportskitim10.databinding.ActivityIgracBinding
import com.example.sportskitim10.databinding.ActivityTimBinding

class Tim : AppCompatActivity() {
    lateinit var binding: ActivityTimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tim)
        binding.btnDodaj.setOnClickListener {
            val intent = Intent(this, DodajTim::class.java)
            startActivity(intent)
        }
        binding.btnNatrag.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}