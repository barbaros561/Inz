package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_liczby_k2.*

class liczbyK2 : AppCompatActivity() {

    var correctansoverall = 0
    var badansoverall = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liczby_k2)
        btnLiczbyk2btn1.textSize = resources.getDimension(R.dimen.font_40sp)
        btnLiczbyk2btn2.textSize = resources.getDimension(R.dimen.font_40sp)
        btnLiczbyk2btn3.textSize = resources.getDimension(R.dimen.font_40sp)
        btnLiczbyk2btn4.textSize = resources.getDimension(R.dimen.font_40sp)
        tvLiczbyk2Question.textSize = resources.getDimension(R.dimen.font_32sp)

        tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n" + "Złe odpowiedzi: " + badansoverall.toString())
        picker()

    }

    fun sortansw(Odp: Int, answ :Int){
        if (Odp == 1) {
            btnLiczbyk2btn1.setText(answ.toString())
            btnLiczbyk2btn2.setText((answ + 1).toString())
            btnLiczbyk2btn3.setText((answ + 2).toString())
            btnLiczbyk2btn4.setText((answ + 3).toString())
            listner(1)
        } else if (Odp == 2) {
            btnLiczbyk2btn1.setText((answ - 1).toString())
            btnLiczbyk2btn2.setText(answ.toString())
            btnLiczbyk2btn3.setText((answ + 1).toString())
            btnLiczbyk2btn4.setText((answ + 2).toString())
            listner(2)
        } else if (Odp == 3) {
            btnLiczbyk2btn1.setText((answ - 2).toString())
            btnLiczbyk2btn2.setText((answ - 1).toString())
            btnLiczbyk2btn3.setText((answ).toString())
            btnLiczbyk2btn4.setText((answ + 1).toString())
            listner(3)
        } else {
            btnLiczbyk2btn1.setText((answ - 3).toString())
            btnLiczbyk2btn2.setText((answ - 2).toString())
            btnLiczbyk2btn3.setText((answ - 1).toString())
            btnLiczbyk2btn4.setText(answ.toString())
            listner(4)

        }

    }
    fun listner(AnsNr : Int) {
        if( AnsNr == 1){
            btnLiczbyk2btn1.setOnClickListener {
                //btn1.setBackgroundResource(R.drawable.correct_button)
                picker()
                correctansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n" + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk2btn2.setOnClickListener {
                btnLiczbyk2btn2.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n" + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk2btn3.setOnClickListener {
                btnLiczbyk2btn3.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk2btn4.setOnClickListener {
                btnLiczbyk2btn4.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n" + "Złe odpowiedzi: " + badansoverall.toString())
            }
        } else if (AnsNr == 2){
            btnLiczbyk2btn1.setOnClickListener {
                btnLiczbyk2btn1.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk2btn2.setOnClickListener {
                //  btn2.setBackgroundResource(R.drawable.correct_button)
                picker()
                correctansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk2btn3.setOnClickListener {
                btnLiczbyk2btn3.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk2btn4.setOnClickListener {
                btnLiczbyk2btn4.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
        } else if (AnsNr == 3){
            btnLiczbyk2btn1.setOnClickListener {
                btnLiczbyk2btn1.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk2btn2.setOnClickListener {
                btnLiczbyk2btn2.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk2btn3.setOnClickListener {
                //  btn3.setBackgroundResource(R.drawable.correct_button)
                picker()
                correctansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk2btn4.setOnClickListener {
                btnLiczbyk2btn4.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }

        } else {
            btnLiczbyk2btn1.setOnClickListener {
                btnLiczbyk2btn1.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk2btn2.setOnClickListener {
                btnLiczbyk2btn2.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk2btn3.setOnClickListener {
                btnLiczbyk2btn3.setBackgroundResource(R.drawable.wrong_button)
                badansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
            btnLiczbyk2btn4.setOnClickListener {
                //btn4.setBackgroundResource(R.drawable.correct_button)
                picker()
                correctansoverall++
                tvLiczbyk2Score.setText("Poprawne odpowiedzi: " + correctansoverall.toString() + "\n"  + "Złe odpowiedzi: " + badansoverall.toString())
            }
        }
    }
    fun picker(){
        // btn1.setTextColor(resources.getColor(R.color.black))
        //btn2.setTextColor(resources.getColor(R.color.black))
        //btn3.setTextColor(resources.getColor(R.color.black))
        // btn4.setTextColor(resources.getColor(R.color.black))
        btnLiczbyk2btn1.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk2btn2.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk2btn3.setBackgroundResource(R.drawable.default_button)
        btnLiczbyk2btn4.setBackgroundResource(R.drawable.default_button)

        var rnd1 : Int
        var rnd2 : Int
        //var rnd3 : Int
        var answ : Int
        var Dzialanie = (1..4).random()
        if (Dzialanie == 1) {
            rnd1 = (0..100).random()
            rnd2 = (0..100).random()
            while (rnd1 + rnd2 > 100) {
                rnd1 = (0..100).random()
                rnd2 = (0..100).random()
            }
            answ = rnd1 + rnd2
            var Odp = (1..4).random()
            tvLiczbyk2Question.setText(" " + rnd1.toString() + " + " + rnd2.toString() + " = ")
            sortansw(Odp, answ)
            listner(Odp)

        }
        else if (Dzialanie == 2) {
            rnd1 = (0..100).random()
            rnd2 = (0..100).random()
            while (rnd1 - rnd2 < 0) {
                rnd1 = (0..100).random()
                rnd2 = (0..100).random()
            }
            answ = rnd1 - rnd2
            var Odp = (1..4).random()
            tvLiczbyk2Question.setText(" " + rnd1.toString() + " - " + rnd2.toString() + " = ")
            sortansw(Odp, answ)
            listner(Odp)
        }
        else if (Dzialanie == 3) {
            rnd1 = (0..10).random()
            rnd2 = (0..10).random()
            while (rnd1 * rnd2 >= 30) {
                rnd1 = (0..10).random()
                rnd2 = (0..10).random()
            }
            answ = rnd1 * rnd2
            var Odp = (1..4).random()
            tvLiczbyk2Question.setText(" " + rnd1.toString() + " x " + rnd2.toString() + " = ")
            sortansw(Odp, answ)
            listner(Odp)
        }
        else if (Dzialanie == 4) {
            rnd1 = (1..30).random()
            rnd2 = (1..10).random()
            while ((rnd1/rnd2) !in (1..30)) {
                rnd1 = (0..10).random()
                rnd2 = (0..10).random()
            }
            answ = rnd1 / rnd2
            var Odp = (1..4).random()
            tvLiczbyk2Question.setText(" " + rnd1.toString() + " : " + rnd2.toString() + " = ")
            sortansw(Odp, answ)
            listner(Odp)
        }

    }
}
