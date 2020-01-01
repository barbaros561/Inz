package com.example.inz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_menu_actyvity.*

class MainMenuActyvity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu_actyvity)

        btnMainMenuScreenGraj.setOnClickListener {
            val grajIntent = Intent(this, Level::class.java)
            startActivity(grajIntent)
        }

        btnMainMenuScreenSettings.setOnClickListener {
            val settingsIntent = Intent(this, Settings::class.java)
            startActivity(settingsIntent)
        }


    }
}
