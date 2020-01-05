package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_4.*

class k1_4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_4)

        tvK1_4Answer.visibility = View.GONE
        tvK1_4Correct.visibility=View.GONE
        tvK1_4Wrong.visibility=View.GONE
        secondK1_4Layout.visibility=View.GONE

        btnK1_4A.setOnClickListener { // poprawna odpowiedz
            tvK1_4Wrong.visibility = View.GONE
            tvK1_4Answer.visibility = View.VISIBLE
            tvK1_4Correct.visibility = View.VISIBLE

            btnK1_4A.setEnabled(false)
            btnK1_4B.setEnabled(false)
            btnK1_4C.setEnabled(false)
            btnK1_4D.setEnabled(false)

            secondK1_4Layout.visibility =View.VISIBLE

            secondK1_4Layout.setOnClickListener {
                finish()
            }
            btnK1_4Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_4B.setOnClickListener {
            tvK1_4Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_4Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_4C.setOnClickListener {
            tvK1_4Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_4Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_4D.setOnClickListener {
            tvK1_4Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_4Wrong.visibility=View.GONE
            },3000)

        }
    }
}
