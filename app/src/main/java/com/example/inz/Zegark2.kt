package com.example.inz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_zegark2.*

class Zegark2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zegark2)

        btnZegarPytaniak2.setOnClickListener {
            val zegar_k2_pytania = Intent(this,zegarek_k2_pytania::class.java)
            startActivity(zegar_k2_pytania)
        }
        btnZegarNaukak2.setOnClickListener {
            val zegar_k2_nauka = Intent(this, zegarek_k2_nauka::class.java)
            startActivity(zegar_k2_nauka)
        }

    }
}
