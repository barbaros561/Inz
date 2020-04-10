package com.example.inz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_geometria_k3.*

class geometriaK3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geometria_k3)

        btnGeometriaPytaniak3.setOnClickListener {
            val k3_geo_pyt = Intent(this, geometria_k3_pytania::class.java)
            startActivity(k3_geo_pyt)
        }
    }
}
