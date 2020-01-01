package com.example.inz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_level.*

class Level : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

        btnLevelKlasa1.setOnClickListener {
            val klasa1Intent = Intent(this, klasa1::class.java)
            startActivity(klasa1Intent)
        }

    }
}
