package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_13.*

class k2_13 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_13)

        tvK2_13Answer.visibility = View.GONE
        tvK2_13Correct.visibility=View.GONE
        tvK2_13Wrong.visibility=View.GONE
        secondK2_13Layout.visibility=View.GONE

        btnK2_13A.setOnClickListener {  //poprawna odpowiedz
            tvK2_13Wrong.visibility = View.GONE
            tvK2_13Answer.visibility = View.VISIBLE
            tvK2_13Correct.visibility = View.VISIBLE

            btnK2_13A.setEnabled(false)
            btnK2_13B.setEnabled(false)
            btnK2_13C.setEnabled(false)
            btnK2_13D.setEnabled(false)

            secondK2_13Layout.visibility =View.VISIBLE

            secondK2_13Layout.setOnClickListener {
                finish()
            }
            btnK2_13Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_13B.setOnClickListener {
            tvK2_13Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_13Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_13C.setOnClickListener {
            tvK2_13Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_13Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_13D.setOnClickListener {
            tvK2_13Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_13Wrong.visibility=View.GONE
            },3000)

        }
    }
}



