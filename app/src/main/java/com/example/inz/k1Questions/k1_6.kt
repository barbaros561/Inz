package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_6.*

class k1_6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_6)

        tvK1_6Correct.visibility=View.GONE
        tvK1_6Wrong.visibility=View.GONE
        secondK1_6Layout.visibility=View.GONE

        btnK1_6C.setOnClickListener {  //poprawna odpowiedz
            btnK1_6C.setBackgroundResource(R.drawable.correct_button)
            tvK1_6Wrong.visibility = View.GONE
            tvK1_6Correct.visibility = View.VISIBLE
            ivK1_6Question.visibility = View.GONE

            btnK1_6A.setEnabled(false)
            btnK1_6B.setEnabled(false)
            btnK1_6C.setEnabled(false)
            btnK1_6D.setEnabled(false)

            secondK1_6Layout.visibility =View.VISIBLE

            secondK1_6Layout.setOnClickListener {
                finish()
            }
            btnK1_6Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_6B.setOnClickListener {
            btnK1_6B.setBackgroundResource(R.drawable.wrong_button)
            tvK1_6Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_6Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_6A.setOnClickListener {
            btnK1_6A.setBackgroundResource(R.drawable.wrong_button)
            tvK1_6Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_6Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_6D.setOnClickListener {
            btnK1_6D.setBackgroundResource(R.drawable.wrong_button)
            tvK1_6Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_6Wrong.visibility=View.GONE
            },3000)

        }
    }
}
