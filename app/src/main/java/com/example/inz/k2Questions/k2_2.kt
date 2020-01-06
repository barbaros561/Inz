package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_2.*

class k2_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_2)

        tvK2_2Answer.visibility = View.GONE
        tvK2_2Correct.visibility=View.GONE
        tvK2_2Wrong.visibility=View.GONE
        secondK2_2Layout.visibility=View.GONE

        btnK2_2A.setOnClickListener {  //poprawna odpowiedz
            tvK2_2Wrong.visibility = View.GONE
            tvK2_2Answer.visibility = View.VISIBLE
            tvK2_2Correct.visibility = View.VISIBLE

            btnK2_2A.setEnabled(false)
            btnK2_2B.setEnabled(false)
            btnK2_2C.setEnabled(false)
            btnK2_2D.setEnabled(false)

            secondK2_2Layout.visibility =View.VISIBLE

            secondK2_2Layout.setOnClickListener {
                finish()
            }
            btnK2_2Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_2B.setOnClickListener {
            tvK2_2Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_2Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_2C.setOnClickListener {
            tvK2_2Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_2Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_2D.setOnClickListener {
            tvK2_2Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_2Wrong.visibility=View.GONE
            },3000)

        }
    }
}


