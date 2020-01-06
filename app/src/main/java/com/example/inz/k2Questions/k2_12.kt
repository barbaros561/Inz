package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_12.*

class k2_12 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_12)

        tvK2_12Answer.visibility = View.GONE
        tvK2_12Correct.visibility=View.GONE
        tvK2_12Wrong.visibility=View.GONE
        secondK2_12Layout.visibility=View.GONE

        btnK2_12A.setOnClickListener {  //poprawna odpowiedz
            tvK2_12Wrong.visibility = View.GONE
            tvK2_12Answer.visibility = View.VISIBLE
            tvK2_12Correct.visibility = View.VISIBLE

            btnK2_12A.setEnabled(false)
            btnK2_12B.setEnabled(false)
            btnK2_12C.setEnabled(false)
            btnK2_12D.setEnabled(false)

            secondK2_12Layout.visibility =View.VISIBLE

            secondK2_12Layout.setOnClickListener {
                finish()
            }
            btnK2_12Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_12B.setOnClickListener {
            tvK2_12Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_12Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_12C.setOnClickListener {
            tvK2_12Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_12Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_12D.setOnClickListener {
            tvK2_12Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_12Wrong.visibility=View.GONE
            },3000)

        }
    }
}



