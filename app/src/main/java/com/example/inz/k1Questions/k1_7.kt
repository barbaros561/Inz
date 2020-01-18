package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_7.*

class k1_7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_7)


        tvK1_7Correct.visibility=View.GONE
        tvK1_7Wrong.visibility=View.GONE
        secondK1_7Layout.visibility=View.GONE

        btnK1_7D.setOnClickListener {  //poprawna odpowiedz
            btnK1_7D.setBackgroundResource(R.drawable.correct_button)

            tvK1_7Wrong.visibility = View.GONE
            tvK1_7Correct.visibility = View.VISIBLE

            btnK1_7A.setEnabled(false)
            btnK1_7B.setEnabled(false)
            btnK1_7C.setEnabled(false)
            btnK1_7D.setEnabled(false)

            secondK1_7Layout.visibility =View.VISIBLE

            secondK1_7Layout.setOnClickListener {
                finish()
            }
            btnK1_7Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_7B.setOnClickListener {
            btnK1_7B.setBackgroundResource(R.drawable.wrong_button)

            tvK1_7Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_7Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_7C.setOnClickListener {
            btnK1_7C.setBackgroundResource(R.drawable.wrong_button)
            tvK1_7Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_7Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_7A.setOnClickListener {
            btnK1_7A.setBackgroundResource(R.drawable.wrong_button)
            tvK1_7Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_7Wrong.visibility=View.GONE
            },3000)

        }
    }
}

