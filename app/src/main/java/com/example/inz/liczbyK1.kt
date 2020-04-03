package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_liczby_k1.*

class liczbyK1 : AppCompatActivity() {

    var correctAnswersOverall = 0
    var badAnswersOverall = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liczby_k1)
        tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
        btnLiczbyk1btn1.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk1btn2.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk1btn3.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk1btn4.setBackgroundResource(R.drawable.default_button)
        picker()
    }
    fun picker() {
        btnLiczbyk1btn1.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk1btn2.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk1btn3.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk1btn4.setBackgroundResource(R.drawable.default_button)

        var rnd1: Int
        var rnd2: Int
        var answ: Int
        var Dzialanie = (1..2).random()
        if (Dzialanie == 1) {
            rnd1 = (0..10).random()
            rnd2 = (0..10).random()
            while (rnd1 + rnd2 > 10) {
                rnd1 = (0..10).random()
                rnd2 = (0..10).random()
            }
            answ = rnd1 + rnd2
            var Odp = (1..4).random()
            tvLiczbyk1Question.setText(" " + rnd1.toString() + " + " + rnd2.toString() + " = ")
            sortansw(Odp, answ)
            listner(Odp)
        }else if (Dzialanie == 2) {
            rnd1 = (0..10).random()
            rnd2 = (0..10).random()
            while (rnd1 - rnd2 < 0) {
                rnd1 = (0..10).random()
                rnd2 = (0..10).random()
            }
            answ = rnd1 - rnd2
            var Odp = (1..4).random()
            tvLiczbyk1Question.setText(" " + rnd1.toString() + " - " + rnd2.toString() + " = ")
            sortansw(Odp, answ)
            listner(Odp)
        }


    }
    fun sortansw(Odp : Int, answ : Int){
        if (Odp == 1) {
            btnLiczbyk1btn1.setText(answ.toString())
            btnLiczbyk1btn2.setText((answ + 1).toString())
            btnLiczbyk1btn3.setText((answ + 2).toString())
            btnLiczbyk1btn4.setText((answ + 3).toString())
            listner(1)
        } else if (Odp == 2) {
            btnLiczbyk1btn1.setText((answ - 1).toString())
            btnLiczbyk1btn2.setText(answ.toString())
            btnLiczbyk1btn3.setText((answ + 1).toString())
            btnLiczbyk1btn4.setText((answ + 2).toString())
            listner(2)
        } else if (Odp == 3) {
            btnLiczbyk1btn1.setText((answ - 2).toString())
            btnLiczbyk1btn2.setText((answ - 1).toString())
            btnLiczbyk1btn3.setText((answ).toString())
            btnLiczbyk1btn4.setText((answ + 1).toString())
            listner(3)
        } else {
            btnLiczbyk1btn1.setText((answ - 3).toString())
            btnLiczbyk1btn2.setText((answ - 2).toString())
            btnLiczbyk1btn3.setText((answ - 1).toString())
            btnLiczbyk1btn4.setText(answ.toString())
            listner(4)

        }
    }
    fun listner(AnsNr : Int){
        if ( AnsNr == 1 ) {
            btnLiczbyk1btn1.setOnClickListener {
                correctAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                picker()
            }
            btnLiczbyk1btn2.setOnClickListener {
                btnLiczbyk1btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnLiczbyk1btn3.setOnClickListener {
                btnLiczbyk1btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnLiczbyk1btn4.setOnClickListener {
                btnLiczbyk1btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else if ( AnsNr == 2) {
            btnLiczbyk1btn1.setOnClickListener {
                btnLiczbyk1btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnLiczbyk1btn2.setOnClickListener {
                correctAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                picker()
            }
            btnLiczbyk1btn3.setOnClickListener {
                btnLiczbyk1btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnLiczbyk1btn4.setOnClickListener {
                btnLiczbyk1btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else if (AnsNr == 3) {
            btnLiczbyk1btn1.setOnClickListener {
                btnLiczbyk1btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnLiczbyk1btn2.setOnClickListener {
                btnLiczbyk1btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnLiczbyk1btn3.setOnClickListener {
                correctAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                picker()
            }
            btnLiczbyk1btn4.setOnClickListener {
                btnLiczbyk1btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else {
            btnLiczbyk1btn1.setOnClickListener {
                btnLiczbyk1btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnLiczbyk1btn2.setOnClickListener {
                btnLiczbyk1btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnLiczbyk1btn3.setOnClickListener {
                btnLiczbyk1btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnLiczbyk1btn4.setOnClickListener {
                correctAnswersOverall++
                tvLiczbyk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                picker()
            }
        }
    }

}

