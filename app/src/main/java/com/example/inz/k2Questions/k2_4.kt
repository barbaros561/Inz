package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_4.*

class k2_4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_4)

        tvK2_4Answer.visibility = View.GONE
        tvK2_4Correct.visibility=View.GONE
        tvK2_4Wrong.visibility=View.GONE
        secondK2_4Layout.visibility=View.GONE

        btnK2_4A.setOnClickListener {  //poprawna odpowiedz
            tvK2_4Wrong.visibility = View.GONE
            tvK2_4Answer.visibility = View.VISIBLE
            tvK2_4Correct.visibility = View.VISIBLE

            btnK2_4A.setEnabled(false)
            btnK2_4B.setEnabled(false)
            btnK2_4C.setEnabled(false)
            btnK2_4D.setEnabled(false)

            secondK2_4Layout.visibility =View.VISIBLE

            secondK2_4Layout.setOnClickListener {
                finish()
            }
            btnK2_4Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_4B.setOnClickListener {
            tvK2_4Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_4Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_4C.setOnClickListener {
            tvK2_4Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_4Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_4D.setOnClickListener {
            tvK2_4Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_4Wrong.visibility=View.GONE
            },3000)

        }
    }
}


