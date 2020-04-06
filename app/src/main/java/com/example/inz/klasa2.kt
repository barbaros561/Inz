package com.example.inz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_klasa2.*

class klasa2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_klasa2)

        btnKlasa2Liczby.setOnClickListener {
            val k2_liczby = Intent(this, liczbyK2::class.java)
            startActivity(k2_liczby)
        }

        btnKlasa2Quiz.setOnClickListener {
            val k2_quiz = Intent(this, InfQuizK2::class.java)
            startActivity(k2_quiz)
        }

    }
}
