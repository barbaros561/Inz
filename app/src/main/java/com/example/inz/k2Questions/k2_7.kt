package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_7.*

class k2_7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_7)

        tvK2_7Answer.visibility = View.GONE
        tvK2_7Correct.visibility=View.GONE
        tvK2_7Wrong.visibility=View.GONE
        secondK2_7Layout.visibility=View.GONE

        btnK2_7A.setOnClickListener {  //poprawna odpowiedz
            tvK2_7Wrong.visibility = View.GONE
            tvK2_7Answer.visibility = View.VISIBLE
            tvK2_7Correct.visibility = View.VISIBLE

            btnK2_7A.setEnabled(false)
            btnK2_7B.setEnabled(false)
            btnK2_7C.setEnabled(false)
            btnK2_7D.setEnabled(false)

            secondK2_7Layout.visibility =View.VISIBLE

            secondK2_7Layout.setOnClickListener {
                finish()
            }
            btnK2_7Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_7B.setOnClickListener {
            tvK2_7Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_7Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_7C.setOnClickListener {
            tvK2_7Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_7Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_7D.setOnClickListener {
            tvK2_7Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_7Wrong.visibility=View.GONE
            },3000)

        }
    }
}



