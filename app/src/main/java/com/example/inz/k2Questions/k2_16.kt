package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_16.*

class k2_16 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_16)

        tvK2_16Answer.visibility = View.GONE
        tvK2_16Correct.visibility=View.GONE
        tvK2_16Wrong.visibility=View.GONE
        secondK2_16Layout.visibility=View.GONE

        btnK2_16A.setOnClickListener {  //poprawna odpowiedz
            tvK2_16Wrong.visibility = View.GONE
            tvK2_16Answer.visibility = View.VISIBLE
            tvK2_16Correct.visibility = View.VISIBLE

            btnK2_16A.setEnabled(false)
            btnK2_16B.setEnabled(false)
            btnK2_16C.setEnabled(false)
            btnK2_16D.setEnabled(false)

            secondK2_16Layout.visibility =View.VISIBLE

            secondK2_16Layout.setOnClickListener {
                finish()
            }
            btnK2_16Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_16B.setOnClickListener {
            tvK2_16Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_16Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_16C.setOnClickListener {
            tvK2_16Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_16Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_16D.setOnClickListener {
            tvK2_16Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_16Wrong.visibility=View.GONE
            },3000)

        }
    }
}



