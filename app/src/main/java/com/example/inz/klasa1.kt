package com.example.inz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_klasa1.*

class klasa1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_klasa1)

        btnK1_1.setOnClickListener {
            val k1_1Intent = Intent(this, k1_1::class.java)
            startActivity(k1_1Intent)
        }
    }
}
