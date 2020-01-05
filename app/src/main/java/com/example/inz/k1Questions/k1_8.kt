package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_8.*

class k1_8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_8)

        tvK1_8Answer.visibility = View.GONE
        tvK1_8Correct.visibility=View.GONE
        tvK1_8Wrong.visibility=View.GONE
        secondK1_8Layout.visibility=View.GONE

        btnK1_8A.setOnClickListener {  //poprawna odpowiedz
            tvK1_8Wrong.visibility = View.GONE
            tvK1_8Answer.visibility = View.VISIBLE
            tvK1_8Correct.visibility = View.VISIBLE

            btnK1_8A.setEnabled(false)
            btnK1_8B.setEnabled(false)
            btnK1_8C.setEnabled(false)
            btnK1_8D.setEnabled(false)

            secondK1_8Layout.visibility =View.VISIBLE

            secondK1_8Layout.setOnClickListener {
                finish()
            }
            btnK1_8Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_8B.setOnClickListener {
            tvK1_8Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_8Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_8C.setOnClickListener {
            tvK1_8Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_8Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_8D.setOnClickListener {
            tvK1_8Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_8Wrong.visibility=View.GONE
            },3000)

        }
    }
}

