package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_15.*

class k1_15 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_15)

        tvK1_15Correct.visibility=View.GONE
        tvK1_15Wrong.visibility=View.GONE
        secondK1_15Layout.visibility=View.GONE

        btnK1_15D.setOnClickListener {  //poprawna odpowiedz
            btnK1_15D.setBackgroundResource(R.drawable.correct_button)
            tvK1_15Wrong.visibility = View.GONE
            tvK1_15Correct.visibility = View.VISIBLE
            ivK1_15Question.visibility = View.GONE

            btnK1_15A.setEnabled(false)
            btnK1_15B.setEnabled(false)
            btnK1_15C.setEnabled(false)
            btnK1_15D.setEnabled(false)

            secondK1_15Layout.visibility =View.VISIBLE

            secondK1_15Layout.setOnClickListener {
                finish()
            }
            btnK1_15Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_15B.setOnClickListener {
            btnK1_15B.setBackgroundResource(R.drawable.wrong_button)
            tvK1_15Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_15Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_15C.setOnClickListener {
            btnK1_15C.setBackgroundResource(R.drawable.wrong_button)
            tvK1_15Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_15Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_15A.setOnClickListener {
            btnK1_15A.setBackgroundResource(R.drawable.wrong_button)
            tvK1_15Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_15Wrong.visibility=View.GONE
            },3000)

        }
    }
}

