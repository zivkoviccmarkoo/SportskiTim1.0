package com.example.sportskitim10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sportskitim10.databinding.ActivityDodajIgracaBinding
import com.example.sportskitim10.databinding.ActivityIgracBinding

class DodajIgraca : AppCompatActivity() {
    lateinit var binding: ActivityDodajIgracaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dodaj_igraca)
        binding.btnNatrag.setOnClickListener {
            val intent = Intent(this, Igrac::class.java)
            startActivity(intent)
        }
    }
}