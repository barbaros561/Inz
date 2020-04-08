package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_liczby_k3.*

class liczbyK3 : AppCompatActivity() {

    var correctansoverall = 0
    var badansoverall = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liczby_k3)
        tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
        btnLiczbyk3btn1.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk3btn2.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk3btn3.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk3btn4.setBackgroundResource(R.drawable.default_button)
        picker()
    }
    fun sortansw(Odp: Int, answ :Int){
        if (Odp == 1) {
            btnLiczbyk3btn1.setText(answ.toString())
            btnLiczbyk3btn2.setText((answ + 1).toString())
            btnLiczbyk3btn3.setText((answ + 2).toString())
            btnLiczbyk3btn4.setText((answ + 3).toString())
            listner(1)
        } else if (Odp == 2) {
            btnLiczbyk3btn1.setText((answ - 1).toString())
            btnLiczbyk3btn2.setText(answ.toString())
            btnLiczbyk3btn3.setText((answ + 1).toString())
            btnLiczbyk3btn4.setText((answ + 2).toString())
            listner(2)
        } else if (Odp == 3) {
            btnLiczbyk3btn1.setText((answ - 2).toString())
            btnLiczbyk3btn2.setText((answ - 1).toString())
            btnLiczbyk3btn3.setText((answ).toString())
            btnLiczbyk3btn4.setText((answ + 1).toString())
            listner(3)
        } else {
            btnLiczbyk3btn1.setText((answ - 3).toString())
            btnLiczbyk3btn2.setText((answ - 2).toString())
            btnLiczbyk3btn3.setText((answ - 1).toString())
            btnLiczbyk3btn4.setText(answ.toString())
            listner(4)

        }

    }
    fun listner(AnsNr : Int) {
        if( AnsNr == 1){
            btnLiczbyk3btn1.setOnClickListener {
                //btn1.setBackgroundResource(R.drawable.correct_button)
                picker()
                correctansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n" + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk3btn2.setOnClickListener {
                btnLiczbyk3btn2.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n" + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk3btn3.setOnClickListener {
                btnLiczbyk3btn3.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk3btn4.setOnClickListener {
                btnLiczbyk3btn4.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n" + "Złe odpowiedzi: " + badansoverall.toString())
            }
        } else if (AnsNr == 2){
            btnLiczbyk3btn1.setOnClickListener {
                btnLiczbyk3btn1.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk3btn2.setOnClickListener {
                //  btn2.setBackgroundResource(R.drawable.correct_button)
                picker()
                correctansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk3btn3.setOnClickListener {
                btnLiczbyk3btn3.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk3btn4.setOnClickListener {
                btnLiczbyk3btn4.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
        } else if (AnsNr == 3){
            btnLiczbyk3btn1.setOnClickListener {
                btnLiczbyk3btn1.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk3btn2.setOnClickListener {
                btnLiczbyk3btn2.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk3btn3.setOnClickListener {
                //  btn3.setBackgroundResource(R.drawable.correct_button)
                picker()
                correctansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk3btn4.setOnClickListener {
                btnLiczbyk3btn4.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }

        } else {
            btnLiczbyk3btn1.setOnClickListener {
                btnLiczbyk3btn1.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk3btn2.setOnClickListener {
                btnLiczbyk3btn2.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk3btn3.setOnClickListener {
                btnLiczbyk3btn3.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk3btn4.setOnClickListener {
                //btn4.setBackgroundResource(R.drawable.correct_button)
                picker()
                correctansoverall++
                tvLiczbyk3Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
        }
    }
    fun picker(){
        // btn1.setTextColor(resources.getColor(R.color.black))
        //btn2.setTextColor(resources.getColor(R.color.black))
        //btn3.setTextColor(resources.getColor(R.color.black))
        // btn4.setTextColor(resources.getColor(R.color.black))
        btnLiczbyk3btn1.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk3btn2.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk3btn3.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk3btn4.setBackgroundResource(R.drawable.default_button)

        var rnd1 : Int
        var rnd2 : Int
        //var rnd3 : Int
        var answ : Int
        var Dzialanie = (1..4).random()
        if (Dzialanie == 1) {
            rnd1 = (0..1000).random()
            rnd2 = (0..1000).random()
            while (rnd1 + rnd2 > 100) {
                rnd1 = (0..1000).random()
                rnd2 = (0..1000).random()
            }
            answ = rnd1 + rnd2
            var Odp = (1..4).random()
            tvLiczbyk3Question.setText(" " + rnd1.toString() + " + " + rnd2.toString() + " = ")
            sortansw(Odp, answ)
            listner(Odp)

        }
        else if (Dzialanie == 2) {
            rnd1 = (0..1000).random()
            rnd2 = (0..1000).random()
            while (rnd1 - rnd2 < 0) {
                rnd1 = (0..1000).random()
                rnd2 = (0..1000).random()
            }
            answ = rnd1 - rnd2
            var Odp = (1..4).random()
            tvLiczbyk3Question.setText(" " + rnd1.toString() + " - " + rnd2.toString() + " = ")
            sortansw(Odp, answ)
            listner(Odp)
        }
        else if (Dzialanie == 3) {
            rnd1 = (1..10).random()
            rnd2 = (0..10).random()
            while (rnd1 * rnd2 >= 100) {
                rnd1 = (1..10).random()
                rnd2 = (0..10).random()
            }
            answ = rnd1 * rnd2
            var Odp = (1..4).random()
            tvLiczbyk3Question.setText(" " + rnd1.toString() + " x " + rnd2.toString() + " = ")
            sortansw(Odp, answ)
            listner(Odp)
        }
        else if (Dzialanie == 4) {
            rnd1 = (1..100).random()
            rnd2 = (1..50).random()
            while (rnd1%rnd2 != 0) {
                rnd1 = (1..100).random()
                rnd2 = (1..10).random()
            }
            answ = rnd1 / rnd2
            var Odp = (1..4).random()
            tvLiczbyk3Question.setText(" " + rnd1.toString() + " : " + rnd2.toString() + " = ")
            sortansw(Odp, answ)
            listner(Odp)
        }

    }
}
