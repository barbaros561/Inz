package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_3.*

class k1_3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_3)

        tvK1_3Answer.visibility = View.GONE
        tvK1_3Correct.visibility=View.GONE
        tvK1_3Wrong.visibility=View.GONE
        secondK1_3Layout.visibility=View.GONE

        btnK1_3A.setOnClickListener {//poprawna odpowiedz
            tvK1_3Wrong.visibility = View.GONE
            tvK1_3Answer.visibility = View.VISIBLE
            tvK1_3Correct.visibility = View.VISIBLE

            btnK1_3A.setEnabled(false)
            btnK1_3B.setEnabled(false)
            btnK1_3C.setEnabled(false)
            btnK1_3D.setEnabled(false)

            secondK1_3Layout.visibility =View.VISIBLE

            secondK1_3Layout.setOnClickListener {
                finish()
            }
            btnK1_3Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_3B.setOnClickListener {
            tvK1_3Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_3Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_3C.setOnClickListener {
            tvK1_3Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_3Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_3D.setOnClickListener {
            tvK1_3Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_3Wrong.visibility=View.GONE
            },3000)

        }
    }
}