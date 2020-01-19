package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_14.*

class k1_14 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_14)

        tvK1_14Correct.visibility=View.GONE
        tvK1_14Wrong.visibility=View.GONE
        secondK1_14Layout.visibility=View.GONE

        btnK1_14C.setOnClickListener {  //poprawna odpowiedz
            btnK1_14C.setBackgroundResource(R.drawable.correct_button)
            tvK1_14Wrong.visibility = View.GONE
            tvK1_14Correct.visibility = View.VISIBLE
            ivK1_14Question.visibility = View.GONE

            btnK1_14A.setEnabled(false)
            btnK1_14B.setEnabled(false)
            btnK1_14C.setEnabled(false)
            btnK1_14D.setEnabled(false)

            secondK1_14Layout.visibility =View.VISIBLE

            secondK1_14Layout.setOnClickListener {
                finish()
            }
            btnK1_14Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_14B.setOnClickListener {
            btnK1_14B.setBackgroundResource(R.drawable.wrong_button)
            tvK1_14Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_14Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_14A.setOnClickListener {
            btnK1_14A.setBackgroundResource(R.drawable.wrong_button)
            tvK1_14Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_14Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_14D.setOnClickListener {
            btnK1_14D.setBackgroundResource(R.drawable.wrong_button)
            tvK1_14Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_14Wrong.visibility=View.GONE
            },3000)

        }
    }
}
