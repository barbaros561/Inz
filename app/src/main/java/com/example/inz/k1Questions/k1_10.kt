package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_10.*

class k1_10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_10)

        tvK1_10Answer.visibility = View.GONE
        tvK1_10Correct.visibility=View.GONE
        tvK1_10Wrong.visibility=View.GONE
        secondK1_10Layout.visibility=View.GONE

        btnK1_10A.setOnClickListener {  //poprawna odpowiedz
            tvK1_10Wrong.visibility = View.GONE
            tvK1_10Answer.visibility = View.VISIBLE
            tvK1_10Correct.visibility = View.VISIBLE

            btnK1_10A.setEnabled(false)
            btnK1_10B.setEnabled(false)
            btnK1_10C.setEnabled(false)
            btnK1_10D.setEnabled(false)

            secondK1_10Layout.visibility =View.VISIBLE

            secondK1_10Layout.setOnClickListener {
                finish()
            }
            btnK1_10Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_10B.setOnClickListener {
            tvK1_10Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_10Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_10C.setOnClickListener {
            tvK1_10Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_10Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_10D.setOnClickListener {
            tvK1_10Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_10Wrong.visibility=View.GONE
            },3000)

        }
    }
}

