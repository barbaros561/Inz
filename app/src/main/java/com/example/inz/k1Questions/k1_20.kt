package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_20.*

class k1_20 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_20)

        tvK1_20Correct.visibility=View.GONE
        tvK1_20Wrong.visibility=View.GONE
        secondK1_20Layout.visibility=View.GONE

        btnK1_20D.setOnClickListener {  //poprawna odpowiedz
            btnK1_20D.setBackgroundResource(R.drawable.correct_button)
            tvK1_20Wrong.visibility = View.GONE
            tvK1_20Correct.visibility = View.VISIBLE
            ivK1_20Question.visibility = View.GONE

            btnK1_20A.setEnabled(false)
            btnK1_20B.setEnabled(false)
            btnK1_20C.setEnabled(false)
            btnK1_20D.setEnabled(false)

            secondK1_20Layout.visibility =View.VISIBLE

            secondK1_20Layout.setOnClickListener {
                finish()
            }
            btnK1_20Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_20B.setOnClickListener {
            btnK1_20B.setBackgroundResource(R.drawable.wrong_button)
            tvK1_20Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_20Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_20C.setOnClickListener {
            btnK1_20C.setBackgroundResource(R.drawable.wrong_button)
            tvK1_20Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_20Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_20A.setOnClickListener {
            btnK1_20A.setBackgroundResource(R.drawable.wrong_button)
            tvK1_20Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_20Wrong.visibility=View.GONE
            },3000)

        }
    }
}
