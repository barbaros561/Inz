package com.example.inz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTapToContinue.blink()

        mainLayout.setOnClickListener {
            val mainMenuIntent = Intent(this, MainMenuActyvity::class.java)
            startActivity(mainMenuIntent)
            finish()

        }

    }

    private fun View.blink(
        times: Int = Animation.INFINITE,
        duration: Long = 700L,
        offset: Long = 20L,
        minAlpha: Float = 0.0f,
        maxAlpha: Float =1.0f,
        repeatMode: Int = Animation.REVERSE
    ){
        startAnimation(AlphaAnimation(minAlpha,maxAlpha).also {
            it.duration = duration
            it.startOffset = offset
            it.repeatMode = repeatMode
            it.repeatCount = times
        })
    }

}
