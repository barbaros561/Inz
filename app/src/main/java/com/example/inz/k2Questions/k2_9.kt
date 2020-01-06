package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_9.*

class k2_9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_9)

        tvK2_9Answer.visibility = View.GONE
        tvK2_9Correct.visibility=View.GONE
        tvK2_9Wrong.visibility=View.GONE
        secondK2_9Layout.visibility=View.GONE

        btnK2_9A.setOnClickListener {  //poprawna odpowiedz
            tvK2_9Wrong.visibility = View.GONE
            tvK2_9Answer.visibility = View.VISIBLE
            tvK2_9Correct.visibility = View.VISIBLE

            btnK2_9A.setEnabled(false)
            btnK2_9B.setEnabled(false)
            btnK2_9C.setEnabled(false)
            btnK2_9D.setEnabled(false)

            secondK2_9Layout.visibility =View.VISIBLE

            secondK2_9Layout.setOnClickListener {
                finish()
            }
            btnK2_9Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_9B.setOnClickListener {
            tvK2_9Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_9Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_9C.setOnClickListener {
            tvK2_9Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_9Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_9D.setOnClickListener {
            tvK2_9Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_9Wrong.visibility=View.GONE
            },3000)

        }
    }
}



