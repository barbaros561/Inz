package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_18.*

class k1_18 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_18)

        tvK1_18Correct.visibility=View.GONE
        tvK1_18Wrong.visibility=View.GONE
        secondK1_18Layout.visibility=View.GONE

        btnK1_18D.setOnClickListener {  //poprawna odpowiedz
            btnK1_18D.setBackgroundResource(R.drawable.correct_button)
            tvK1_18Wrong.visibility = View.GONE
            tvK1_18Correct.visibility = View.VISIBLE
            ivK1_18Question.visibility = View.GONE

            btnK1_18A.setEnabled(false)
            btnK1_18B.setEnabled(false)
            btnK1_18C.setEnabled(false)
            btnK1_18D.setEnabled(false)

            secondK1_18Layout.visibility =View.VISIBLE

            secondK1_18Layout.setOnClickListener {
                finish()
            }
            btnK1_18Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_18B.setOnClickListener {
            btnK1_18B.setBackgroundResource(R.drawable.wrong_button)
            tvK1_18Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_18Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_18C.setOnClickListener {
            btnK1_18C.setBackgroundResource(R.drawable.wrong_button)
            tvK1_18Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_18Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_18A.setOnClickListener {
            btnK1_18A.setBackgroundResource(R.drawable.wrong_button)
            tvK1_18Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_18Wrong.visibility=View.GONE
            },3000)

        }
    }
}
