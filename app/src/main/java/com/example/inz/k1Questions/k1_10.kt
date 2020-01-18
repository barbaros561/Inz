package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_10.*

class k1_10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_10)

        tvK1_10Correct.visibility=View.GONE
        tvK1_10Wrong.visibility=View.GONE
        secondK1_10Layout.visibility=View.GONE


        btnK1_10A.setOnClickListener {  //poprawna odpowiedz
            btnK1_10A.setBackgroundResource(R.drawable.correct_button)
            tvK1_10Wrong.visibility = View.GONE
            tvK1_10Correct.visibility = View.VISIBLE
            ivK1_10Question.visibility=View.GONE

            btnK1_10A.setEnabled(false)
            btnK1_10B.setEnabled(false)
            btnK1_10C.setEnabled(false)
            btnK1_10D.setEnabled(false)

            secondK1_10Layout.visibility =View.VISIBLE

            secondK1_10Layout.setOnClickListener {
                finish()
            }
            btnK1_10Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_10B.setOnClickListener {
            btnK1_10B.setBackgroundResource(R.drawable.wrong_button)
            tvK1_10Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_10Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_10C.setOnClickListener {
            btnK1_10C.setBackgroundResource(R.drawable.wrong_button)
            tvK1_10Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_10Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_10D.setOnClickListener {
            btnK1_10D.setBackgroundResource(R.drawable.wrong_button)
            tvK1_10Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_10Wrong.visibility=View.GONE
            },3000)

        }
    }
}

