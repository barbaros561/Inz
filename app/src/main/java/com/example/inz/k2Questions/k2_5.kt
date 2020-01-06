package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_5.*

class k2_5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_5)

        tvK2_5Answer.visibility = View.GONE
        tvK2_5Correct.visibility=View.GONE
        tvK2_5Wrong.visibility=View.GONE
        secondK2_5Layout.visibility=View.GONE

        btnK2_5A.setOnClickListener {  //poprawna odpowiedz
            tvK2_5Wrong.visibility = View.GONE
            tvK2_5Answer.visibility = View.VISIBLE
            tvK2_5Correct.visibility = View.VISIBLE

            btnK2_5A.setEnabled(false)
            btnK2_5B.setEnabled(false)
            btnK2_5C.setEnabled(false)
            btnK2_5D.setEnabled(false)

            secondK2_5Layout.visibility =View.VISIBLE

            secondK2_5Layout.setOnClickListener {
                finish()
            }
            btnK2_5Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_5B.setOnClickListener {
            tvK2_5Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_5Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_5C.setOnClickListener {
            tvK2_5Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_5Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_5D.setOnClickListener {
            tvK2_5Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_5Wrong.visibility=View.GONE
            },3000)

        }
    }
}



