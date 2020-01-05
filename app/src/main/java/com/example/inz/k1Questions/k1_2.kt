package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_2.*

class k1_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_2)

        tvK1_2Answer.visibility = View.GONE
        tvK1_2Correct.visibility=View.GONE
        tvK1_2Wrong.visibility=View.GONE
        secondK1_2Layout.visibility=View.GONE

        btnK1_2A.setOnClickListener {   //popranwa odpowiedz
            tvK1_2Wrong.visibility = View.GONE
            tvK1_2Answer.visibility = View.VISIBLE
            tvK1_2Correct.visibility = View.VISIBLE

            btnK1_2A.setEnabled(false)
            btnK1_2B.setEnabled(false)
            btnK1_2C.setEnabled(false)
            btnK1_2D.setEnabled(false)

            secondK1_2Layout.visibility =View.VISIBLE

            secondK1_2Layout.setOnClickListener {
                finish()
            }
            btnK1_2Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_2B.setOnClickListener {
            tvK1_2Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_2Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_2C.setOnClickListener {
            tvK1_2Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_2Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_2D.setOnClickListener {
            tvK1_2Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_2Wrong.visibility=View.GONE
            },3000)

        }
    }
}