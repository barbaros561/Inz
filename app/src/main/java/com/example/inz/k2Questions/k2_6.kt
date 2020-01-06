package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_6.*

class k2_6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_6)

        tvK2_6Answer.visibility = View.GONE
        tvK2_6Correct.visibility=View.GONE
        tvK2_6Wrong.visibility=View.GONE
        secondK2_6Layout.visibility=View.GONE

        btnK2_6A.setOnClickListener {  //poprawna odpowiedz
            tvK2_6Wrong.visibility = View.GONE
            tvK2_6Answer.visibility = View.VISIBLE
            tvK2_6Correct.visibility = View.VISIBLE

            btnK2_6A.setEnabled(false)
            btnK2_6B.setEnabled(false)
            btnK2_6C.setEnabled(false)
            btnK2_6D.setEnabled(false)

            secondK2_6Layout.visibility =View.VISIBLE

            secondK2_6Layout.setOnClickListener {
                finish()
            }
            btnK2_6Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_6B.setOnClickListener {
            tvK2_6Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_6Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_6C.setOnClickListener {
            tvK2_6Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_6Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_6D.setOnClickListener {
            tvK2_6Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_6Wrong.visibility=View.GONE
            },3000)

        }
    }
}



