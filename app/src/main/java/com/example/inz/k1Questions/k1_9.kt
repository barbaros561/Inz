package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_9.*

class k1_9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_9)

        tvK1_9Answer.visibility = View.GONE
        tvK1_9Correct.visibility=View.GONE
        tvK1_9Wrong.visibility=View.GONE
        secondK1_9Layout.visibility=View.GONE

        btnK1_9A.setOnClickListener {  //poprawna odpowiedz
            tvK1_9Wrong.visibility = View.GONE
            tvK1_9Answer.visibility = View.VISIBLE
            tvK1_9Correct.visibility = View.VISIBLE

            btnK1_9A.setEnabled(false)
            btnK1_9B.setEnabled(false)
            btnK1_9C.setEnabled(false)
            btnK1_9D.setEnabled(false)

            secondK1_9Layout.visibility =View.VISIBLE

            secondK1_9Layout.setOnClickListener {
                finish()
            }
            btnK1_9Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_9B.setOnClickListener {
            tvK1_9Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_9Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_9C.setOnClickListener {
            tvK1_9Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_9Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_9D.setOnClickListener {
            tvK1_9Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_9Wrong.visibility=View.GONE
            },3000)

        }
    }
}

