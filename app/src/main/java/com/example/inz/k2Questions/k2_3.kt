package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_3.*

class k2_3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_3)

        tvK2_3Answer.visibility = View.GONE
        tvK2_3Correct.visibility=View.GONE
        tvK2_3Wrong.visibility=View.GONE
        secondK2_3Layout.visibility=View.GONE

        btnK2_3A.setOnClickListener {  //poprawna odpowiedz
            tvK2_3Wrong.visibility = View.GONE
            tvK2_3Answer.visibility = View.VISIBLE
            tvK2_3Correct.visibility = View.VISIBLE

            btnK2_3A.setEnabled(false)
            btnK2_3B.setEnabled(false)
            btnK2_3C.setEnabled(false)
            btnK2_3D.setEnabled(false)

            secondK2_3Layout.visibility =View.VISIBLE

            secondK2_3Layout.setOnClickListener {
                finish()
            }
            btnK2_3Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_3B.setOnClickListener {
            tvK2_3Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_3Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_3C.setOnClickListener {
            tvK2_3Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_3Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_3D.setOnClickListener {
            tvK2_3Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_3Wrong.visibility=View.GONE
            },3000)

        }
    }
}


