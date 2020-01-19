package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_17.*

class k1_17 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_17)

        tvK1_17Correct.visibility=View.GONE
        tvK1_17Wrong.visibility=View.GONE
        secondK1_17Layout.visibility=View.GONE

        btnK1_17B.setOnClickListener {  //poprawna odpowiedz
            btnK1_17B.setBackgroundResource(R.drawable.correct_button)
            tvK1_17Wrong.visibility = View.GONE
            tvK1_17Answer.visibility = View.VISIBLE
            tvK1_17Correct.visibility = View.VISIBLE

            btnK1_17A.setEnabled(false)
            btnK1_17B.setEnabled(false)
            btnK1_17C.setEnabled(false)
            btnK1_17D.setEnabled(false)

            secondK1_17Layout.visibility =View.VISIBLE

            secondK1_17Layout.setOnClickListener {
                finish()
            }
            btnK1_17Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_17A.setOnClickListener {
            btnK1_17A.setBackgroundResource(R.drawable.wrong_button)
            tvK1_17Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_17Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_17C.setOnClickListener {
            btnK1_17C.setBackgroundResource(R.drawable.wrong_button)
            tvK1_17Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_17Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_17D.setOnClickListener {
            btnK1_17D.setBackgroundResource(R.drawable.wrong_button)
            tvK1_17Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_17Wrong.visibility=View.GONE
            },3000)

        }
    }
}
