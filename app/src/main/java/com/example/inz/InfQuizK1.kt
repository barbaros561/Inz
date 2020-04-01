package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inf_quiz_k1.*

class InfQuizK1 : AppCompatActivity() {

    var correctAnswersOverall = 0
    var badAnswersOverall = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inf_quiz_k1)
        tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())
        picker()


    }

    fun picker() {
        btnInfQuizk1btn1.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk1btn2.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk1btn3.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk1btn4.setBackgroundResource(R.drawable.default_button)

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
            tvInfQuizk1Question.setText(" " + rnd1.toString() + " + " + rnd2.toString() + " = ")
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
            tvInfQuizk1Question.setText(" " + rnd1.toString() + " - " + rnd2.toString() + " = ")
            sortansw(Odp, answ)
            listner(Odp)
        }


    }
    fun sortansw(Odp : Int, answ : Int){
        if (Odp == 1) {
            btnInfQuizk1btn1.setText(answ.toString())
            btnInfQuizk1btn2.setText((answ + 1).toString())
            btnInfQuizk1btn3.setText((answ + 2).toString())
            btnInfQuizk1btn4.setText((answ + 3).toString())
            listner(1)
        } else if (Odp == 2) {
            btnInfQuizk1btn1.setText((answ - 1).toString())
            btnInfQuizk1btn2.setText(answ.toString())
            btnInfQuizk1btn3.setText((answ + 1).toString())
            btnInfQuizk1btn4.setText((answ + 2).toString())
            listner(2)
        } else if (Odp == 3) {
            btnInfQuizk1btn1.setText((answ - 2).toString())
            btnInfQuizk1btn2.setText((answ - 1).toString())
            btnInfQuizk1btn3.setText((answ).toString())
            btnInfQuizk1btn4.setText((answ + 1).toString())
            listner(3)
        } else {
            btnInfQuizk1btn1.setText((answ - 3).toString())
            btnInfQuizk1btn2.setText((answ - 2).toString())
            btnInfQuizk1btn3.setText((answ - 1).toString())
            btnInfQuizk1btn4.setText(answ.toString())
            listner(4)

        }
    }
    fun listner(AnsNr : Int){
        if ( AnsNr == 1 ) {
            btnInfQuizk1btn1.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())
                picker()
            }
            btnInfQuizk1btn2.setOnClickListener {
                btnInfQuizk1btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn3.setOnClickListener {
                btnInfQuizk1btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn4.setOnClickListener {
                btnInfQuizk1btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else if ( AnsNr == 2) {
            btnInfQuizk1btn1.setOnClickListener {
                btnInfQuizk1btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn2.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())
                picker()
            }
            btnInfQuizk1btn3.setOnClickListener {
                btnInfQuizk1btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn4.setOnClickListener {
                btnInfQuizk1btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else if (AnsNr == 3) {
            btnInfQuizk1btn1.setOnClickListener {
                btnInfQuizk1btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn2.setOnClickListener {
                btnInfQuizk1btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn3.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())
                picker()
            }
            btnInfQuizk1btn4.setOnClickListener {
                btnInfQuizk1btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else {
            btnInfQuizk1btn1.setOnClickListener {
                btnInfQuizk1btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn2.setOnClickListener {
                btnInfQuizk1btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn3.setOnClickListener {
                btnInfQuizk1btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn4.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + " ; Złe odpowiedzi: " + badAnswersOverall.toString())
                picker()
            }
        }
    }

}
