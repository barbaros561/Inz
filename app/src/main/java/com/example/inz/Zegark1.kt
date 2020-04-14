package com.example.inz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_zegark1.*

class Zegark1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zegark1)

        btnZegarNaukak1.setOnClickListener {
            val zegar_k1_nauka = Intent(this, zegarek_k1_nauka::class.java)
            startActivity(zegar_k1_nauka)
        }
        btnZegarPytaniak1.setOnClickListener {
            val zegar_k1_pytania = Intent(this, zegarek_k1_pytania::class.java)
            startActivity(zegar_k1_pytania)
        }
    }
}
