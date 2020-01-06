package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_8.*

class k2_8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_8)

        tvK2_8Answer.visibility = View.GONE
        tvK2_8Correct.visibility=View.GONE
        tvK2_8Wrong.visibility=View.GONE
        secondK2_8Layout.visibility=View.GONE

        btnK2_8A.setOnClickListener {  //poprawna odpowiedz
            tvK2_8Wrong.visibility = View.GONE
            tvK2_8Answer.visibility = View.VISIBLE
            tvK2_8Correct.visibility = View.VISIBLE

            btnK2_8A.setEnabled(false)
            btnK2_8B.setEnabled(false)
            btnK2_8C.setEnabled(false)
            btnK2_8D.setEnabled(false)

            secondK2_8Layout.visibility =View.VISIBLE

            secondK2_8Layout.setOnClickListener {
                finish()
            }
            btnK2_8Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_8B.setOnClickListener {
            tvK2_8Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_8Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_8C.setOnClickListener {
            tvK2_8Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_8Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_8D.setOnClickListener {
            tvK2_8Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_8Wrong.visibility=View.GONE
            },3000)

        }
    }
}



