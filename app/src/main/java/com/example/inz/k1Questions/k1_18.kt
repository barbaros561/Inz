package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_18.*

class k1_18 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_18)

        tvK1_18Answer.visibility = View.GONE
        tvK1_18Correct.visibility=View.GONE
        tvK1_18Wrong.visibility=View.GONE
        secondK1_18Layout.visibility=View.GONE

        btnK1_18A.setOnClickListener {  //poprawna odpowiedz
            tvK1_18Wrong.visibility = View.GONE
            tvK1_18Answer.visibility = View.VISIBLE
            tvK1_18Correct.visibility = View.VISIBLE

            btnK1_18A.setEnabled(false)
            btnK1_18B.setEnabled(false)
            btnK1_18C.setEnabled(false)
            btnK1_18D.setEnabled(false)

            secondK1_18Layout.visibility =View.VISIBLE

            secondK1_18Layout.setOnClickListener {
                finish()
            }
            btnK1_18Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_18B.setOnClickListener {
            tvK1_18Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_18Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_18C.setOnClickListener {
            tvK1_18Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_18Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_18D.setOnClickListener {
            tvK1_18Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_18Wrong.visibility=View.GONE
            },3000)

        }
    }
}
