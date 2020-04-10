package com.example.inz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_klasa3.*

class klasa3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_klasa3)

        btnKlasa3Liczby.setOnClickListener {
            val k3_liczby = Intent(this, liczbyK3::class.java)
            startActivity(k3_liczby)
        }
        btnKlasa3Quiz.setOnClickListener {
            val k3_Quiz = Intent(this, InfQuizK3::class.java)
            startActivity(k3_Quiz)
        }
        btnKlasa3Geometria.setOnClickListener {
            val k3_Geometria = Intent(this, geometriaK3::class.java)
            startActivity(k3_Geometria)
        }

    }
}
