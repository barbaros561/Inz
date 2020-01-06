package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_20.*

class k2_20 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_20)

        tvK2_20Answer.visibility = View.GONE
        tvK2_20Correct.visibility=View.GONE
        tvK2_20Wrong.visibility=View.GONE
        secondK2_20Layout.visibility=View.GONE

        btnK2_20A.setOnClickListener {  //poprawna odpowiedz
            tvK2_20Wrong.visibility = View.GONE
            tvK2_20Answer.visibility = View.VISIBLE
            tvK2_20Correct.visibility = View.VISIBLE

            btnK2_20A.setEnabled(false)
            btnK2_20B.setEnabled(false)
            btnK2_20C.setEnabled(false)
            btnK2_20D.setEnabled(false)

            secondK2_20Layout.visibility =View.VISIBLE

            secondK2_20Layout.setOnClickListener {
                finish()
            }
            btnK2_20Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_20B.setOnClickListener {
            tvK2_20Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_20Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_20C.setOnClickListener {
            tvK2_20Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_20Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_20D.setOnClickListener {
            tvK2_20Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_20Wrong.visibility=View.GONE
            },3000)

        }
    }
}



