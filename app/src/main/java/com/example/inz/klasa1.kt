package com.example.inz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.inz.k1Questions.*
import kotlinx.android.synthetic.main.activity_klasa1.*

class klasa1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_klasa1)

        btnKlasa1Quiz.setOnClickListener {
            val k1_Quiz = Intent(this, InfQuizK1::class.java)
            startActivity(k1_Quiz)
        }
        btnKlasa1Zegar.setOnClickListener {
            val k1_Zegar = Intent(this, Zegark1::class.java)
            startActivity(k1_Zegar)
        }
        btnKlasa1Geometria.setOnClickListener {
            val k1_Geometria = Intent(this, geometriaK1::class.java)
            startActivity(k1_Geometria)
        }

    }
}
