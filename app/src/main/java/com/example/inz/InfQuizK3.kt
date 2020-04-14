package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_inf_quiz_k3.*

class InfQuizK3 : AppCompatActivity() {

    var correctAnswersOverall = 0
    var badAnswersOverall = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inf_quiz_k3)
        ivInfQuizk3kolo.visibility = View.GONE
        ivInfQuizk3kwadrat.visibility = View.GONE
        ivInfQuizk3prostokat.visibility = View.GONE
        ivInfQuizk3Trojkat.visibility = View.GONE
        tvInfQuizK3KoloPromien.visibility = View.GONE
        tvInfQuizK3KwadratRight.visibility = View.GONE
        tvInfQuizK3KwadratTop.visibility = View.GONE
        tvInfQuizK3ProstokatRight.visibility = View.GONE
        tvInfQuizK3ProstokatTop.visibility = View.GONE
        tvInfQuizK3TrojkatPodstawa.visibility = View.GONE
        tvInfQuizK3TrojkatWysokosc.visibility = View.GONE
        tvInfQuizK3TrojkatBok3.visibility=View.GONE
        tvInfQuizK3TrojkatBok2.visibility=View.GONE
        tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

        losowanie()
    }

    fun losowanie(){
        btnInfQuizk3btn1.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk3btn2.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk3btn3.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk3btn4.setBackgroundResource(R.drawable.default_button)
        var los = (1..1).random()
        when (los){
            1->liczby()
        }

    }
    fun liczby(){
        btnInfQuizk3btn1.textSize=resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk3btn2.textSize=resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk3btn3.textSize=resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk3btn4.textSize=resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        tvInfQuizk3Question.textSize=resources.getDimension(R.dimen.font_size_dni_miesiace_Qyes)
        var typ = (1..4).random()
        when (typ){
            1-> {
                var rnd1 = (100..1000).random()
                var rnd2 = (100..1000).random()
                while (rnd1 + rnd2 > 1000) {
                    rnd1 = (100..1000).random()
                    rnd2 = (100..1000).random()
                }
                var ans = rnd1 + rnd2
                tvInfQuizk3Question.setText(rnd1.toString() + " + " + rnd2.toString() + " = ")
                var AnsNr = (1..4).random()
                when (AnsNr){
                    1->{
                        btnInfQuizk3btn1.setText(ans.toString())
                        btnInfQuizk3btn2.setText((ans+10).toString())
                        btnInfQuizk3btn3.setText((ans+20).toString())
                        btnInfQuizk3btn4.setText((ans+30).toString())
                        listner(AnsNr)
                    }
                    2->{
                        btnInfQuizk3btn1.setText((ans-10).toString())
                        btnInfQuizk3btn2.setText(ans.toString())
                        btnInfQuizk3btn3.setText((ans+10).toString())
                        btnInfQuizk3btn4.setText((ans+20).toString())
                        listner(AnsNr)
                    }
                    3->{
                        btnInfQuizk3btn1.setText((ans-20).toString())
                        btnInfQuizk3btn2.setText((ans-10).toString())
                        btnInfQuizk3btn3.setText(ans.toString())
                        btnInfQuizk3btn4.setText((ans+10).toString())
                        listner(AnsNr)
                    }
                    4->{
                        btnInfQuizk3btn1.setText((ans-30).toString())
                        btnInfQuizk3btn2.setText((ans-20).toString())
                        btnInfQuizk3btn3.setText((ans-10).toString())
                        btnInfQuizk3btn4.setText(ans.toString())
                        listner(AnsNr)
                    }
                }
            }
            2->{
                var rnd1 = (500..1000).random()
                var rnd2 = (100..500).random()
                while (rnd1 - rnd2 < 0) {
                    rnd1 = (500..1000).random()
                    rnd2 = (100..500).random()
                }
                var ans = rnd1 - rnd2
                tvInfQuizk3Question.setText(rnd1.toString() + " - " + rnd2.toString() + " = ")
                var AnsNr = (1..4).random()
                when (AnsNr){
                    1->{
                        btnInfQuizk3btn1.setText(ans.toString())
                        btnInfQuizk3btn2.setText((ans+10).toString())
                        btnInfQuizk3btn3.setText((ans+20).toString())
                        btnInfQuizk3btn4.setText((ans+30).toString())
                        listner(AnsNr)
                    }
                    2->{
                        btnInfQuizk3btn1.setText((ans-10).toString())
                        btnInfQuizk3btn2.setText(ans.toString())
                        btnInfQuizk3btn3.setText((ans+10).toString())
                        btnInfQuizk3btn4.setText((ans+20).toString())
                        listner(AnsNr)
                    }
                    3->{
                        btnInfQuizk3btn1.setText((ans-20).toString())
                        btnInfQuizk3btn2.setText((ans-10).toString())
                        btnInfQuizk3btn3.setText(ans.toString())
                        btnInfQuizk3btn4.setText((ans+10).toString())
                        listner(AnsNr)
                    }
                    4->{
                        btnInfQuizk3btn1.setText((ans-30).toString())
                        btnInfQuizk3btn2.setText((ans-20).toString())
                        btnInfQuizk3btn3.setText((ans-10).toString())
                        btnInfQuizk3btn4.setText(ans.toString())
                        listner(AnsNr)
                    }
                }
            }
            3->{
                var rnd1 = (1..10).random()
                var rnd2 = (0..10).random()
                while (rnd1 * rnd2 > 100) {
                    rnd1 = (1..10).random()
                    rnd2 = (0..10).random()
                }
                var ans = rnd1 * rnd2
                tvInfQuizk3Question.setText(rnd1.toString() + " x " + rnd2.toString() + " = ")
                var AnsNr = (1..4).random()
                when (AnsNr){
                    1->{
                        btnInfQuizk3btn1.setText(ans.toString())
                        btnInfQuizk3btn2.setText((ans+10).toString())
                        btnInfQuizk3btn3.setText((ans-8).toString())
                        btnInfQuizk3btn4.setText((ans+2).toString())
                        listner(AnsNr)
                    }
                    2->{
                        btnInfQuizk3btn1.setText((ans+2).toString())
                        btnInfQuizk3btn2.setText(ans.toString())
                        btnInfQuizk3btn3.setText((ans+10).toString())
                        btnInfQuizk3btn4.setText((ans-8).toString())
                        listner(AnsNr)
                    }
                    3->{
                        btnInfQuizk3btn1.setText((ans-8).toString())
                        btnInfQuizk3btn2.setText((ans+2).toString())
                        btnInfQuizk3btn3.setText(ans.toString())
                        btnInfQuizk3btn4.setText((ans+10).toString())
                        listner(AnsNr)
                    }
                    4->{
                        btnInfQuizk3btn1.setText((ans+10).toString())
                        btnInfQuizk3btn2.setText((ans-8).toString())
                        btnInfQuizk3btn3.setText((ans+2).toString())
                        btnInfQuizk3btn4.setText(ans.toString())
                        listner(AnsNr)
                    }
                }
            }
            4->{
                var rnd1 = (10..100).random()
                var rnd2 = (1..25).random()
                while (rnd1%rnd2 != 0){
                    rnd1 = (10..100).random()
                    rnd2 = (1..25).random()
                }
                var ans = rnd1/rnd2
                tvInfQuizk3Question.setText(rnd1.toString() + " / " + rnd2.toString() + " = ")
                var AnsNr = (1..4).random()
                when (AnsNr){
                    1->{
                        btnInfQuizk3btn1.setText(ans.toString())
                        btnInfQuizk3btn2.setText((ans+1).toString())
                        btnInfQuizk3btn3.setText((ans+2).toString())
                        btnInfQuizk3btn4.setText((ans+3).toString())
                        listner(AnsNr)
                    }
                    2->{
                        btnInfQuizk3btn1.setText((ans-1).toString())
                        btnInfQuizk3btn2.setText(ans.toString())
                        btnInfQuizk3btn3.setText((ans+1).toString())
                        btnInfQuizk3btn4.setText((ans+2).toString())
                        listner(AnsNr)
                    }
                    3->{
                        btnInfQuizk3btn1.setText((ans+2).toString())
                        btnInfQuizk3btn2.setText((ans-1).toString())
                        btnInfQuizk3btn3.setText(ans.toString())
                        btnInfQuizk3btn4.setText((ans+1).toString())
                        listner(AnsNr)
                    }
                    4->{
                        btnInfQuizk3btn1.setText((ans+1).toString())
                        btnInfQuizk3btn2.setText((ans+2).toString())
                        btnInfQuizk3btn3.setText((ans-1).toString())
                        btnInfQuizk3btn4.setText(ans.toString())
                        listner(AnsNr)
                    }
                }
            }
        }
    }



    fun listner(AnsNr: Int){
       when (AnsNr){
           1->{
               btnInfQuizk3btn1.setOnClickListener {
                   correctAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                   losowanie()
               }
               btnInfQuizk3btn2.setOnClickListener {
                   btnInfQuizk3btn2.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

               }
               btnInfQuizk3btn3.setOnClickListener {
                   btnInfQuizk3btn3.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

               }
               btnInfQuizk3btn4.setOnClickListener {
                   btnInfQuizk3btn4.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
               }
           }
           2->{
               btnInfQuizk3btn1.setOnClickListener {
                   btnInfQuizk3btn1.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
               }
               btnInfQuizk3btn2.setOnClickListener {
                   correctAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\n Złe odpowiedzi: " + badAnswersOverall.toString())
                   losowanie()
               }
               btnInfQuizk3btn3.setOnClickListener {
                   btnInfQuizk3btn3.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
               }
               btnInfQuizk3btn4.setOnClickListener {
                   btnInfQuizk3btn4.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
               }
           }
           3->{
               btnInfQuizk3btn1.setOnClickListener {
                   btnInfQuizk3btn1.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
               }
               btnInfQuizk3btn2.setOnClickListener {
                   btnInfQuizk3btn2.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
               }
               btnInfQuizk3btn3.setOnClickListener {
                   correctAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                   losowanie()
               }
               btnInfQuizk3btn4.setOnClickListener {
                   btnInfQuizk3btn4.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
               }
           }
           4->{
               btnInfQuizk3btn1.setOnClickListener {
                   btnInfQuizk3btn1.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

               }
               btnInfQuizk3btn2.setOnClickListener {
                   btnInfQuizk3btn2.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

               }
               btnInfQuizk3btn3.setOnClickListener {
                   btnInfQuizk3btn3.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

               }
               btnInfQuizk3btn4.setOnClickListener {
                   correctAnswersOverall++
                   tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                   losowanie()
               }
           }
       }
    }
}
