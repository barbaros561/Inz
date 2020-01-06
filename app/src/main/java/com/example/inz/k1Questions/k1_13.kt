package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_13.*

class k1_13 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_13)

        tvK1_13Answer.visibility = View.GONE
        tvK1_13Correct.visibility=View.GONE
        tvK1_13Wrong.visibility= View.GONE
        secondK1_13Layout.visibility=View.GONE

        btnK1_13A.setOnClickListener {  //poprawna odpowiedz
            tvK1_13Wrong.visibility = View.GONE
            tvK1_13Answer.visibility = View.VISIBLE
            tvK1_13Correct.visibility = View.VISIBLE

            btnK1_13A.setEnabled(false)
            btnK1_13B.setEnabled(false)
            btnK1_13C.setEnabled(false)
            btnK1_13D.setEnabled(false)

            secondK1_13Layout.visibility =View.VISIBLE

            secondK1_13Layout.setOnClickListener {
                finish()
            }
            btnK1_13Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_13B.setOnClickListener {
            tvK1_13Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_13Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_13C.setOnClickListener {
            tvK1_13Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_13Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_13D.setOnClickListener {
            tvK1_13Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_13Wrong.visibility=View.GONE
            },3000)

        }
    }
}
