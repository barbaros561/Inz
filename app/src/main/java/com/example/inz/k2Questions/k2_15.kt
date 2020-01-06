package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_15.*

class k2_15 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_15)

        tvK2_15Answer.visibility = View.GONE
        tvK2_15Correct.visibility=View.GONE
        tvK2_15Wrong.visibility=View.GONE
        secondK2_15Layout.visibility=View.GONE

        btnK2_15A.setOnClickListener {  //poprawna odpowiedz
            tvK2_15Wrong.visibility = View.GONE
            tvK2_15Answer.visibility = View.VISIBLE
            tvK2_15Correct.visibility = View.VISIBLE

            btnK2_15A.setEnabled(false)
            btnK2_15B.setEnabled(false)
            btnK2_15C.setEnabled(false)
            btnK2_15D.setEnabled(false)

            secondK2_15Layout.visibility =View.VISIBLE

            secondK2_15Layout.setOnClickListener {
                finish()
            }
            btnK2_15Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_15B.setOnClickListener {
            tvK2_15Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_15Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_15C.setOnClickListener {
            tvK2_15Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_15Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_15D.setOnClickListener {
            tvK2_15Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_15Wrong.visibility=View.GONE
            },3000)

        }
    }
}



