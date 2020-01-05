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

        btnK1_1.setOnClickListener {
            val k1_1Intent = Intent(this, k1_1::class.java)
            startActivity(k1_1Intent)
        }
        btnK1_2.setOnClickListener {
            val k1_2Intent = Intent(this, k1_2::class.java)
            startActivity(k1_2Intent)
        }
        btnK1_3.setOnClickListener {
            val k1_3Intent = Intent(this, k1_3::class.java)
            startActivity(k1_3Intent)
        }
        btnK1_4.setOnClickListener {
            val k1_4Intent = Intent(this, k1_4::class.java)
            startActivity(k1_4Intent)
        }
        btnK1_5.setOnClickListener {
            val k1_5Intent = Intent(this, k1_5::class.java)
            startActivity(k1_5Intent)
        }
        btnK1_6.setOnClickListener {
            val k1_6Intent = Intent(this, k1_6::class.java)
            startActivity(k1_6Intent)
        }
        btnK1_7.setOnClickListener {
            val k1_7Intent = Intent(this, k1_7::class.java)
            startActivity(k1_7Intent)
        }
        btnK1_8.setOnClickListener {
            val k1_8Intent = Intent(this, k1_8::class.java)
            startActivity(k1_8Intent)
        }
        btnK1_9.setOnClickListener {
            val k1_9Intent = Intent(this, k1_9::class.java)
            startActivity(k1_9Intent)
        }
        btnK1_10.setOnClickListener {
            val k1_10Intent = Intent(this, k1_10::class.java)
            startActivity(k1_10Intent)
        }
        btnK1_11.setOnClickListener {
            val k1_11Intent = Intent(this, k1_11::class.java)
            startActivity(k1_11Intent)
        }
        btnK1_12.setOnClickListener {
            val k1_12Intent = Intent(this, k1_12::class.java)
            startActivity(k1_12Intent)
        }

    }
}
