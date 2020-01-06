package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_14.*

class k2_14 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_14)

        tvK2_14Answer.visibility = View.GONE
        tvK2_14Correct.visibility=View.GONE
        tvK2_14Wrong.visibility=View.GONE
        secondK2_14Layout.visibility=View.GONE

        btnK2_14A.setOnClickListener {  //poprawna odpowiedz
            tvK2_14Wrong.visibility = View.GONE
            tvK2_14Answer.visibility = View.VISIBLE
            tvK2_14Correct.visibility = View.VISIBLE

            btnK2_14A.setEnabled(false)
            btnK2_14B.setEnabled(false)
            btnK2_14C.setEnabled(false)
            btnK2_14D.setEnabled(false)

            secondK2_14Layout.visibility =View.VISIBLE

            secondK2_14Layout.setOnClickListener {
                finish()
            }
            btnK2_14Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_14B.setOnClickListener {
            tvK2_14Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_14Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_14C.setOnClickListener {
            tvK2_14Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_14Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_14D.setOnClickListener {
            tvK2_14Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_14Wrong.visibility=View.GONE
            },3000)

        }
    }
}



