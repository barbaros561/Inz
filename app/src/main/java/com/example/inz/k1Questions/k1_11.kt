package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_11.*

class k1_11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_11)

        tvK1_11Answer.visibility = View.GONE
        tvK1_11Correct.visibility=View.GONE
        tvK1_11Wrong.visibility=View.GONE
        secondK1_11Layout.visibility=View.GONE

        btnK1_11A.setOnClickListener {  //poprawna odpowiedz
            tvK1_11Wrong.visibility = View.GONE
            tvK1_11Answer.visibility = View.VISIBLE
            tvK1_11Correct.visibility = View.VISIBLE

            btnK1_11A.setEnabled(false)
            btnK1_11B.setEnabled(false)
            btnK1_11C.setEnabled(false)
            btnK1_11D.setEnabled(false)

            secondK1_11Layout.visibility =View.VISIBLE

            secondK1_11Layout.setOnClickListener {
                finish()
            }
            btnK1_11Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_11B.setOnClickListener {
            tvK1_11Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_11Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_11C.setOnClickListener {
            tvK1_11Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_11Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_11D.setOnClickListener {
            tvK1_11Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_11Wrong.visibility=View.GONE
            },3000)

        }
    }
}
