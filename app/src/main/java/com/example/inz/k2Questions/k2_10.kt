package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_10.*

class k2_10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_10)

        tvK2_10Answer.visibility = View.GONE
        tvK2_10Correct.visibility=View.GONE
        tvK2_10Wrong.visibility=View.GONE
        secondK2_10Layout.visibility=View.GONE

        btnK2_10A.setOnClickListener {  //poprawna odpowiedz
            tvK2_10Wrong.visibility = View.GONE
            tvK2_10Answer.visibility = View.VISIBLE
            tvK2_10Correct.visibility = View.VISIBLE

            btnK2_10A.setEnabled(false)
            btnK2_10B.setEnabled(false)
            btnK2_10C.setEnabled(false)
            btnK2_10D.setEnabled(false)

            secondK2_10Layout.visibility =View.VISIBLE

            secondK2_10Layout.setOnClickListener {
                finish()
            }
            btnK2_10Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_10B.setOnClickListener {
            tvK2_10Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_10Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_10C.setOnClickListener {
            tvK2_10Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_10Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_10D.setOnClickListener {
            tvK2_10Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_10Wrong.visibility=View.GONE
            },3000)

        }
    }
}



