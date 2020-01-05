package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_5.*

class k1_5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_5)

        tvK1_5Answer.visibility = View.GONE
        tvK1_5Correct.visibility=View.GONE
        tvK1_5Wrong.visibility=View.GONE
        secondK1_5Layout.visibility=View.GONE

        btnK1_5A.setOnClickListener {//poprawna odpowiedz
            tvK1_5Wrong.visibility = View.GONE
            tvK1_5Answer.visibility = View.VISIBLE
            tvK1_5Correct.visibility = View.VISIBLE

            btnK1_5A.setEnabled(false)
            btnK1_5B.setEnabled(false)
            btnK1_5C.setEnabled(false)
            btnK1_5D.setEnabled(false)

            secondK1_5Layout.visibility =View.VISIBLE

            secondK1_5Layout.setOnClickListener {
                finish()
            }
            btnK1_5Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_5B.setOnClickListener {
            tvK1_5Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_5Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_5C.setOnClickListener {
            tvK1_5Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_5Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_5D.setOnClickListener {
            tvK1_5Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_5Wrong.visibility=View.GONE
            },3000)

        }
    }
}

