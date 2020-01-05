package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_1.*

class k1_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_1)
        tvK1_1Answer.visibility = View.GONE
        tvK1_1Correct.visibility=View.GONE
        tvK1_1Wrong.visibility=View.GONE
        secondK1_1Layout.visibility=View.GONE

        btnK1_1A.setOnClickListener {  //poprawna odpowiedz
            tvK1_1Wrong.visibility = View.GONE
            tvK1_1Answer.visibility = View.VISIBLE
            tvK1_1Correct.visibility = View.VISIBLE

            btnK1_1A.setEnabled(false)
            btnK1_1B.setEnabled(false)
            btnK1_1C.setEnabled(false)
            btnK1_1D.setEnabled(false)

            secondK1_1Layout.visibility =View.VISIBLE

            secondK1_1Layout.setOnClickListener {
                finish()
            }
            btnK1_1Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_1B.setOnClickListener {
            tvK1_1Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_1Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_1C.setOnClickListener {
            tvK1_1Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_1Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_1D.setOnClickListener {
            tvK1_1Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_1Wrong.visibility=View.GONE
            },3000)

        }
    }
}
