package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_12.*

class k1_12 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_12)

        tvK1_12Correct.visibility=View.GONE
        tvK1_12Wrong.visibility=View.GONE
        secondK1_12Layout.visibility=View.GONE

        btnK1_12A.setOnClickListener {  //poprawna odpowiedz
            btnK1_12A.setBackgroundResource(R.drawable.correct_button)
            tvK1_12Wrong.visibility = View.GONE
            tvK1_12Correct.visibility = View.VISIBLE

            btnK1_12A.setEnabled(false)
            btnK1_12B.setEnabled(false)
            btnK1_12C.setEnabled(false)
            btnK1_12D.setEnabled(false)

            secondK1_12Layout.visibility =View.VISIBLE

            secondK1_12Layout.setOnClickListener {
                finish()
            }
            btnK1_12Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_12B.setOnClickListener {
            btnK1_12B.setBackgroundResource(R.drawable.wrong_button)
            tvK1_12Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_12Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_12C.setOnClickListener {
            btnK1_12C.setBackgroundResource(R.drawable.wrong_button)
            tvK1_12Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_12Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_12D.setOnClickListener {
            btnK1_12D.setBackgroundResource(R.drawable.wrong_button)
            tvK1_12Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_12Wrong.visibility=View.GONE
            },3000)

        }
    }
}

