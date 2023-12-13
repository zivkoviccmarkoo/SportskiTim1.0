package com.example.sportskitim10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sportskitim10.databinding.ActivityIgracBinding
import com.example.sportskitim10.databinding.ActivityMainBinding

class Igrac : AppCompatActivity() {

    lateinit var binding: ActivityIgracBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_igrac)

        binding.btnDodaj.setOnClickListener {
            val intent = Intent(this, DodajIgraca::class.java)
            startActivity(intent)
        }
        binding.btnNatrag.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}