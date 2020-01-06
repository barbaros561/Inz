package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_16.*

class k1_16 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_16)

        tvK1_16Answer.visibility = View.GONE
        tvK1_16Correct.visibility=View.GONE
        tvK1_16Wrong.visibility=View.GONE
        secondK1_16Layout.visibility=View.GONE

        btnK1_16A.setOnClickListener {  //poprawna odpowiedz
            tvK1_16Wrong.visibility = View.GONE
            tvK1_16Answer.visibility = View.VISIBLE
            tvK1_16Correct.visibility = View.VISIBLE

            btnK1_16A.setEnabled(false)
            btnK1_16B.setEnabled(false)
            btnK1_16C.setEnabled(false)
            btnK1_16D.setEnabled(false)

            secondK1_16Layout.visibility =View.VISIBLE

            secondK1_16Layout.setOnClickListener {
                finish()
            }
            btnK1_16Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_16B.setOnClickListener {
            tvK1_16Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_16Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_16C.setOnClickListener {
            tvK1_16Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_16Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_16D.setOnClickListener {
            tvK1_16Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_16Wrong.visibility=View.GONE
            },3000)

        }
    }
}

