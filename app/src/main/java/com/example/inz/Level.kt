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
        btnLevelKlasa2.setOnClickListener {
            val klasa2Intent = Intent(this, klasa2::class.java)
            startActivity(klasa2Intent)
        }
        btnLevelKlasa3.setOnClickListener {
            val klasa3Intent = Intent(this, klasa3::class.java)
            startActivity(klasa3Intent)
        }
    }
}
