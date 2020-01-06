package com.example.inz.k2Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k2_17.*

class k2_17 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k2_17)

        tvK2_17Answer.visibility = View.GONE
        tvK2_17Correct.visibility= View.GONE
        tvK2_17Wrong.visibility=View.GONE
        secondK2_17Layout.visibility=View.GONE

        btnK2_17A.setOnClickListener {  //poprawna odpowiedz
            tvK2_17Wrong.visibility = View.GONE
            tvK2_17Answer.visibility = View.VISIBLE
            tvK2_17Correct.visibility = View.VISIBLE

            btnK2_17A.setEnabled(false)
            btnK2_17B.setEnabled(false)
            btnK2_17C.setEnabled(false)
            btnK2_17D.setEnabled(false)

            secondK2_17Layout.visibility =View.VISIBLE

            secondK2_17Layout.setOnClickListener {
                finish()
            }
            btnK2_17Confirm.setOnClickListener {
                finish()
            }

        }
        btnK2_17B.setOnClickListener {
            tvK2_17Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_17Wrong.visibility=View.GONE
            },3000)
        }
        btnK2_17C.setOnClickListener {
            tvK2_17Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_17Wrong.visibility=View.GONE
            },3000)

        }
        btnK2_17D.setOnClickListener {
            tvK2_17Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK2_17Wrong.visibility=View.GONE
            },3000)

        }
    }
}



