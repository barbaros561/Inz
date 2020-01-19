package com.example.inz.k1Questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.inz.R
import kotlinx.android.synthetic.main.activity_k1_19.*

class k1_19 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k1_19)

        tvK1_19Correct.visibility=View.GONE
        tvK1_19Wrong.visibility=View.GONE
        secondK1_19Layout.visibility=View.GONE

        btnK1_19C.setOnClickListener {  //poprawna odpowiedz
            btnK1_19C.setBackgroundResource(R.drawable.correct_button)
            tvK1_19Wrong.visibility = View.GONE
            tvK1_19Answer.visibility = View.VISIBLE
            tvK1_19Correct.visibility = View.VISIBLE

            btnK1_19A.setEnabled(false)
            btnK1_19B.setEnabled(false)
            btnK1_19C.setEnabled(false)
            btnK1_19D.setEnabled(false)

            secondK1_19Layout.visibility =View.VISIBLE

            secondK1_19Layout.setOnClickListener {
                finish()
            }
            btnK1_19Confirm.setOnClickListener {
                finish()
            }

        }
        btnK1_19B.setOnClickListener {
            btnK1_19B.setBackgroundResource(R.drawable.wrong_button)
            tvK1_19Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_19Wrong.visibility=View.GONE
            },3000)
        }
        btnK1_19A.setOnClickListener {
            btnK1_19A.setBackgroundResource(R.drawable.wrong_button)
            tvK1_19Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_19Wrong.visibility=View.GONE
            },3000)

        }
        btnK1_19D.setOnClickListener {
            btnK1_19D.setBackgroundResource(R.drawable.wrong_button)
            tvK1_19Wrong.visibility=View.VISIBLE
            Handler().postDelayed({
                tvK1_19Wrong.visibility=View.GONE
            },3000)

        }
    }
}
