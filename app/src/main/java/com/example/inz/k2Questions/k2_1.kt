package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_1.*

class k2_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_1)

        tvK2_1Answer.visibility = View.GONE
        tvK2_1Correct.visibility=View.GONE
        tvK2_1Wrong.visibility=View.GONE
        secondK2_1Layout.visibility=View.GONE

        btnK2_1A.setOnClickListener {  //poprawna odpowiedz
            tvK2_1Wrong.visibility = View.GONE
            tvK2_1Answer.visibility = View.VISIBLE
            tvK2_1Correct.visibility = View.VISIBLE

            btnK2_1A.setEnabled(false)
            btnK2_1B.setEnabled(false)
            btnK2_1C.setEnabled(false)
            btnK2_1D.setEnabled(false)

            secondK2_1Layout.visibility =View.VISIBLE

            secondK2_1Layout.setOnClickListener {
                finish()
            }
            btnK2_1Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_1B.setOnClickListener {
            tvK2_1Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_1Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_1C.setOnClickListener {
            tvK2_1Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_1Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_1D.setOnClickListener {
            tvK2_1Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_1Wrong.visibility=View.GONE
            },3000)

        }
    }
}
