package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_19.*

class k2_19 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_19)

        tvK2_19Answer.visibility = View.GONE
        tvK2_19Correct.visibility=View.GONE
        tvK2_19Wrong.visibility=View.GONE
        secondK2_19Layout.visibility=View.GONE

        btnK2_19A.setOnClickListener {  //poprawna odpowiedz
            tvK2_19Wrong.visibility = View.GONE
            tvK2_19Answer.visibility = View.VISIBLE
            tvK2_19Correct.visibility = View.VISIBLE

            btnK2_19A.setEnabled(false)
            btnK2_19B.setEnabled(false)
            btnK2_19C.setEnabled(false)
            btnK2_19D.setEnabled(false)

            secondK2_19Layout.visibility =View.VISIBLE

            secondK2_19Layout.setOnClickListener {
                finish()
            }
            btnK2_19Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_19B.setOnClickListener {
            tvK2_19Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_19Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_19C.setOnClickListener {
            tvK2_19Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_19Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_19D.setOnClickListener {
            tvK2_19Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_19Wrong.visibility=View.GONE
            },3000)

        }
    }
}



