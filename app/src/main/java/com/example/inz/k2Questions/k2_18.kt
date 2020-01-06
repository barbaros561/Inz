package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_18.*

class k2_18 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_18)

        tvK2_18Answer.visibility = View.GONE
        tvK2_18Correct.visibility=View.GONE
        tvK2_18Wrong.visibility=View.GONE
        secondK2_18Layout.visibility=View.GONE

        btnK2_18A.setOnClickListener {  //poprawna odpowiedz
            tvK2_18Wrong.visibility = View.GONE
            tvK2_18Answer.visibility = View.VISIBLE
            tvK2_18Correct.visibility = View.VISIBLE

            btnK2_18A.setEnabled(false)
            btnK2_18B.setEnabled(false)
            btnK2_18C.setEnabled(false)
            btnK2_18D.setEnabled(false)

            secondK2_18Layout.visibility =View.VISIBLE

            secondK2_18Layout.setOnClickListener {
                finish()
            }
            btnK2_18Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_18B.setOnClickListener {
            tvK2_18Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_18Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_18C.setOnClickListener {
            tvK2_18Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_18Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_18D.setOnClickListener {
            tvK2_18Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_18Wrong.visibility=View.GONE
            },3000)

        }
    }
}



