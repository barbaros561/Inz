package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_11.*

class k2_11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_11)

        tvK2_11Answer.visibility = View.GONE
        tvK2_11Correct.visibility=View.GONE
        tvK2_11Wrong.visibility=View.GONE
        secondK2_11Layout.visibility=View.GONE

        btnK2_11A.setOnClickListener {  //poprawna odpowiedz
            tvK2_11Wrong.visibility = View.GONE
            tvK2_11Answer.visibility = View.VISIBLE
            tvK2_11Correct.visibility = View.VISIBLE

            btnK2_11A.setEnabled(false)
            btnK2_11B.setEnabled(false)
            btnK2_11C.setEnabled(false)
            btnK2_11D.setEnabled(false)

            secondK2_11Layout.visibility =View.VISIBLE

            secondK2_11Layout.setOnClickListener {
                finish()
            }
            btnK2_11Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_11B.setOnClickListener {
            tvK2_11Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_11Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_11C.setOnClickListener {
            tvK2_11Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_11Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_11D.setOnClickListener {
            tvK2_11Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_11Wrong.visibility=View.GONE
            },3000)

        }
    }
}



