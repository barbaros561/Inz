package com.example.inz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_geometria_k1.*

class geometriaK1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geometria_k1)

        btnGeometriaNaukak1.setOnClickListener {
            val geo_k1_nau = Intent(this, geometria_k1_nauka::class.java)
            startActivity(geo_k1_nau)
        }
        btnGeometriaPytaniak1.setOnClickListener {
            val geo_k1_pyt = Intent(this, geometria_k1_pytania::class.java)
            startActivity(geo_k1_pyt)
        }

    }
}
