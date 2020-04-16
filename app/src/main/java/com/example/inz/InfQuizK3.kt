package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_inf_quiz_k3.*

class InfQuizK3 : AppCompatActivity() {

    private var correctAnswersOverall = 0
    private var badAnswersOverall = 0
    private val liczbyporadkowe = mapOf(
        1 to "Pierwszy", 2 to "Drugi", 3 to "Trzeci", 4 to "Czwarty", 5 to "Piąty", 6 to "Szósty", 7 to "Siódmy", 8 to "Ósmy",
        9 to "Dziewąty", 10 to "Dziesiąty", 11 to "Jedenasty", 12 to "Dwunasty", 13 to "Trzynasty",14 to "Czternasty",
        15 to "Piętnasy", 16 to "Szesnasty", 17 to "Siedemnasty", 18 to "Osiemnasty", 19 to "Dziewiętnasty", 20 to "Dwudziesty",
        21 to "Dwudziesty pierwszy", 22 to "Dwudziesty drugi", 23 to "Dwudziesty trzeci", 24 to "Dwudziesty czwarty",
        25 to "Dwudziesty piąty", 26 to "Dwudziesty szósty", 27 to "Dwudziesty siódmy", 28 to "Dwudziesty ósmy")
    private var minmap = mapOf(1 to "05", 2 to "10", 3 to "15", 4 to "20", 5 to "25", 6 to "30", 7 to "35", 8 to "40", 9 to "45",
        10 to "50", 11 to "55" , 12 to "00" )
    private val wartosc = mapOf(1 to "pole", 2 to "obwód")
    private val pi = "\u03C0"
    private val parzyste = arrayListOf(2,4,6,8,10,12,14,16)

    private val miesiace = mapOf(
        0 to "Grudzień",
        1 to "Styczeń",
        2 to "Luty",
        3 to "Marzec",
        4 to "Kwiecień",
        5 to "Maj",
        6 to "Czerwiec",
        7 to "Lipiec",
        8 to "Sierpień",
        9 to "Wrzesień",
        10 to "Październik",
        11 to "Listopad",
        12 to "Grudzień",
        13 to "Styczeń"
    )
    private val rzymMap = mapOf(0 to "XII", 1 to "I", 2 to "II", 3 to "III", 4 to "IV", 5 to "V", 6 to "VI", 7 to "VII", 8 to "VIII", 9 to "IX",
        10 to "X", 11 to "XI", 12 to "XII")
    private val cmSI = mapOf(1 to "mm", 2 to "cm", 3 to "m" )
    private val kgSI = mapOf(1 to "g", 2 to "dag", 3 to "kg")
    private val lSI = mapOf(1 to "ml", 2 to "l")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inf_quiz_k3)

        tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
        losowanie()

    }

    private fun losowanie(){
        btnInfQuizk3btn1.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk3btn2.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk3btn3.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk3btn4.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk3btn5.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk3btn1.visibility = VISIBLE
        btnInfQuizk3btn2.visibility = VISIBLE
        btnInfQuizk3btn5.visibility = GONE
        ivInfQuizk3kolo.visibility = GONE
        ivInfQuizk3kwadrat.visibility = GONE
        ivInfQuizk3prostokat.visibility = GONE
        ivInfQuizk3Trojkat.visibility = GONE
        tvInfQuizK3KoloPromien.visibility = GONE
        tvInfQuizK3KwadratRight.visibility = GONE
        tvInfQuizK3KwadratTop.visibility = GONE
        tvInfQuizK3ProstokatRight.visibility = GONE
        tvInfQuizK3ProstokatTop.visibility = GONE
        tvInfQuizK3TrojkatPodstawa.visibility = GONE
        tvInfQuizK3TrojkatWysokosc.visibility = GONE
        tvInfQuizK3TrojkatBok3.visibility= GONE
        tvInfQuizK3TrojkatBok2.visibility= GONE
        ivInfQuizK3zegary_pusty.visibility= GONE
        ivInfQuizK3Godzina1.visibility= GONE
        ivInfQuizK3Godzina2.visibility= GONE
        ivInfQuizK3Godzina3.visibility= GONE
        ivInfQuizK3Godzina4.visibility= GONE
        ivInfQuizK3Godzina5.visibility= GONE
        ivInfQuizK3Godzina6.visibility= GONE
        ivInfQuizK3Godzina7.visibility= GONE
        ivInfQuizK3Godzina8.visibility= GONE
        ivInfQuizK3Godzina9.visibility= GONE
        ivInfQuizK3Godzina10.visibility= GONE
        ivInfQuizK3Godzina11.visibility= GONE
        ivInfQuizK3Godzina12.visibility= GONE
        ivInfQuizK3Minuta1.visibility= GONE
        ivInfQuizK3Minuta2.visibility= GONE
        ivInfQuizK3Minuta3.visibility= GONE
        ivInfQuizK3Minuta4.visibility= GONE
        ivInfQuizK3Minuta5.visibility= GONE
        ivInfQuizK3Minuta6.visibility= GONE
        ivInfQuizK3Minuta7.visibility= GONE
        ivInfQuizK3Minuta8.visibility= GONE
        ivInfQuizK3Minuta9.visibility= GONE
        ivInfQuizK3Minuta10.visibility= GONE
        ivInfQuizK3Minuta11.visibility= GONE
        ivInfQuizK3Minuta12.visibility= GONE

        when ((1..6).random()){
            1->liczby()
            2->geometria()
            3->zegarek()
            4->porownywanie()
            5->daty()
            6->przeliczanie()
        }

    }
    private fun liczby(){
        tvInfQuizk3Question.textSize=resources.getDimension(R.dimen.font_24sp)
        val typ = (1..4).random()
        when (typ){
            1-> {
                btnInfQuizk3btn1.textSize=resources.getDimension(R.dimen.font_14sp)
                btnInfQuizk3btn2.textSize=resources.getDimension(R.dimen.font_14sp)
                btnInfQuizk3btn3.textSize=resources.getDimension(R.dimen.font_14sp)
                btnInfQuizk3btn4.textSize=resources.getDimension(R.dimen.font_14sp)
                var rnd1 = (100..1000).random()
                var rnd2 = (100..1000).random()
                while (rnd1 + rnd2 > 1000) {
                    rnd1 = (100..1000).random()
                    rnd2 = (100..1000).random()
                }
                val ans = rnd1 + rnd2
                tvInfQuizk3Question.text = rnd1.toString() + " + " + rnd2.toString() + " = "
                val AnsNr = (1..4).random()
                when (AnsNr){
                    1->{
                        btnInfQuizk3btn1.text = ans.toString()
                        btnInfQuizk3btn2.text = (ans+10).toString()
                        btnInfQuizk3btn3.text = (ans+20).toString()
                        btnInfQuizk3btn4.text = (ans+30).toString()
                        listner(AnsNr)
                    }
                    2->{
                        btnInfQuizk3btn1.text = (ans-10).toString()
                        btnInfQuizk3btn2.text = ans.toString()
                        btnInfQuizk3btn3.text = (ans+10).toString()
                        btnInfQuizk3btn4.text = (ans+20).toString()
                        listner(AnsNr)
                    }
                    3->{
                        btnInfQuizk3btn1.text = (ans-20).toString()
                        btnInfQuizk3btn2.text = (ans-10).toString()
                        btnInfQuizk3btn3.text = ans.toString()
                        btnInfQuizk3btn4.text = (ans+10).toString()
                        listner(AnsNr)
                    }
                    4->{
                        btnInfQuizk3btn1.text = (ans-30).toString()
                        btnInfQuizk3btn2.text = (ans-20).toString()
                        btnInfQuizk3btn3.text = (ans-10).toString()
                        btnInfQuizk3btn4.text = ans.toString()
                        listner(AnsNr)
                    }
                }
            }
            2->{
                btnInfQuizk3btn1.textSize=resources.getDimension(R.dimen.font_14sp)
                btnInfQuizk3btn2.textSize=resources.getDimension(R.dimen.font_14sp)
                btnInfQuizk3btn3.textSize=resources.getDimension(R.dimen.font_14sp)
                btnInfQuizk3btn4.textSize=resources.getDimension(R.dimen.font_14sp)
                var rnd1 = (500..1000).random()
                var rnd2 = (100..500).random()
                while (rnd1 - rnd2 < 0) {
                    rnd1 = (500..1000).random()
                    rnd2 = (100..500).random()
                }
                val ans = rnd1 - rnd2
                tvInfQuizk3Question.text = rnd1.toString() + " - " + rnd2.toString() + " = "
                val AnsNr = (1..4).random()
                when (AnsNr){
                    1->{
                        btnInfQuizk3btn1.text = ans.toString()
                        btnInfQuizk3btn2.text = (ans+10).toString()
                        btnInfQuizk3btn3.text = (ans+20).toString()
                        btnInfQuizk3btn4.text = (ans+30).toString()
                        listner(AnsNr)
                    }
                    2->{
                        btnInfQuizk3btn1.text = (ans-10).toString()
                        btnInfQuizk3btn2.text = ans.toString()
                        btnInfQuizk3btn3.text = (ans+10).toString()
                        btnInfQuizk3btn4.text = (ans+20).toString()
                        listner(AnsNr)
                    }
                    3->{
                        btnInfQuizk3btn1.text = (ans-20).toString()
                        btnInfQuizk3btn2.text = (ans-10).toString()
                        btnInfQuizk3btn3.text = ans.toString()
                        btnInfQuizk3btn4.text = (ans+10).toString()
                        listner(AnsNr)
                    }
                    4->{
                        btnInfQuizk3btn1.text = (ans-30).toString()
                        btnInfQuizk3btn2.text = (ans-20).toString()
                        btnInfQuizk3btn3.text = (ans-10).toString()
                        btnInfQuizk3btn4.text = ans.toString()
                        listner(AnsNr)
                    }
                }
            }
            3->{
                btnInfQuizk3btn1.textSize=resources.getDimension(R.dimen.font_40sp)
                btnInfQuizk3btn2.textSize=resources.getDimension(R.dimen.font_40sp)
                btnInfQuizk3btn3.textSize=resources.getDimension(R.dimen.font_40sp)
                btnInfQuizk3btn4.textSize=resources.getDimension(R.dimen.font_40sp)
                var rnd1 = (1..10).random()
                var rnd2 = (0..10).random()
                while (rnd1 * rnd2 > 100) {
                    rnd1 = (1..10).random()
                    rnd2 = (0..10).random()
                }
                val ans = rnd1 * rnd2
                tvInfQuizk3Question.text = rnd1.toString() + " x " + rnd2.toString() + " = "
                val AnsNr = (1..4).random()
                when (AnsNr){
                    1->{
                        btnInfQuizk3btn1.text = ans.toString()
                        btnInfQuizk3btn2.text = (ans+10).toString()
                        btnInfQuizk3btn3.text = (ans-8).toString()
                        btnInfQuizk3btn4.text = (ans+2).toString()
                        listner(AnsNr)
                    }
                    2->{
                        btnInfQuizk3btn1.text = (ans+2).toString()
                        btnInfQuizk3btn2.text = ans.toString()
                        btnInfQuizk3btn3.text = (ans+10).toString()
                        btnInfQuizk3btn4.text = (ans-8).toString()
                        listner(AnsNr)
                    }
                    3->{
                        btnInfQuizk3btn1.text = (ans-8).toString()
                        btnInfQuizk3btn2.text = (ans+2).toString()
                        btnInfQuizk3btn3.text = ans.toString()
                        btnInfQuizk3btn4.text = (ans+10).toString()
                        listner(AnsNr)
                    }
                    4->{
                        btnInfQuizk3btn1.text = (ans+10).toString()
                        btnInfQuizk3btn2.text = (ans-8).toString()
                        btnInfQuizk3btn3.text = (ans+2).toString()
                        btnInfQuizk3btn4.text = ans.toString()
                        listner(AnsNr)
                    }
                }
            }
            4->{
                btnInfQuizk3btn1.textSize=resources.getDimension(R.dimen.font_40sp)
                btnInfQuizk3btn2.textSize=resources.getDimension(R.dimen.font_40sp)
                btnInfQuizk3btn3.textSize=resources.getDimension(R.dimen.font_40sp)
                btnInfQuizk3btn4.textSize=resources.getDimension(R.dimen.font_40sp)
                var rnd1 = (10..100).random()
                var rnd2 = (1..25).random()
                while (rnd1%rnd2 != 0){
                    rnd1 = (10..100).random()
                    rnd2 = (1..25).random()
                }
                var ans = rnd1/rnd2
                tvInfQuizk3Question.text = rnd1.toString() + " / " + rnd2.toString() + " = "
                var AnsNr = (1..4).random()
                when (AnsNr){
                    1->{
                        btnInfQuizk3btn1.text = ans.toString()
                        btnInfQuizk3btn2.text = (ans+1).toString()
                        btnInfQuizk3btn3.text = (ans+2).toString()
                        btnInfQuizk3btn4.text = (ans+3).toString()
                        listner(AnsNr)
                    }
                    2->{
                        btnInfQuizk3btn1.text = (ans-1).toString()
                        btnInfQuizk3btn2.text = ans.toString()
                        btnInfQuizk3btn3.text = (ans+1).toString()
                        btnInfQuizk3btn4.text = (ans+2).toString()
                        listner(AnsNr)
                    }
                    3->{
                        btnInfQuizk3btn1.text = (ans+2).toString()
                        btnInfQuizk3btn2.text = (ans-1).toString()
                        btnInfQuizk3btn3.text = ans.toString()
                        btnInfQuizk3btn4.text = (ans+1).toString()
                        listner(AnsNr)
                    }
                    4->{
                        btnInfQuizk3btn1.text = (ans+1).toString()
                        btnInfQuizk3btn2.text = (ans+2).toString()
                        btnInfQuizk3btn3.text = (ans-1).toString()
                        btnInfQuizk3btn4.text = ans.toString()
                        listner(AnsNr)
                    }
                }
            }
        }
    }
    private fun geometria(){
        btnInfQuizk3btn1.textSize = resources.getDimension(R.dimen.font_14sp)
        btnInfQuizk3btn2.textSize = resources.getDimension(R.dimen.font_14sp)
        btnInfQuizk3btn3.textSize = resources.getDimension(R.dimen.font_14sp)
        btnInfQuizk3btn4.textSize = resources.getDimension(R.dimen.font_14sp)
        tvInfQuizk3Question.textSize= resources.getDimension(R.dimen.font_14sp)
        var figura = (1..4).random()
        var AnsNr = (1..4).random()
        var typ = (1..2).random()
        when(typ){
            1->{
                tvInfQuizk3Question.text = "Oblicz " + wartosc[typ].toString() + " podanej figury"
                when(figura){
                    1->{
                        ivInfQuizk3kolo.visibility=VISIBLE
                        tvInfQuizK3KoloPromien.visibility=VISIBLE
                        var r = (2..10).random()
                        tvInfQuizK3KoloPromien.text = r.toString()
                        var Odp=r*r
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.text = Odp.toString() + pi + " cm\u00B2"
                                btnInfQuizk3btn2.text = (2 * r).toString() + pi + " cm"
                                btnInfQuizk3btn3.text = r.toString() + pi + " cm"
                                btnInfQuizk3btn4.text = ((r * r) / 2).toString() + pi + " cm\u00B2"
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.text = r.toString() + pi  + " cm"
                                btnInfQuizk3btn2.text = Odp.toString() + pi + " cm\u00B2"
                                btnInfQuizk3btn3.text = ((r*r)/2).toString() + pi + " cm\u00B2"
                                btnInfQuizk3btn4.text = (2*r).toString() + pi + " cm"
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.text = (2*r).toString() + pi + " cm"
                                btnInfQuizk3btn2.text = ((r*r)/2).toString() + pi + " cm\u00B2"
                                btnInfQuizk3btn3.text = Odp.toString() + pi + " cm\u00B2"
                                btnInfQuizk3btn4.text = r.toString() + pi  + " cm"
                                listner(AnsNr)

                            }
                            4->{
                                btnInfQuizk3btn1.text = ((r*r)/2).toString() + pi + " cm\u00B2"
                                btnInfQuizk3btn2.text = r.toString() + pi  + " cm"
                                btnInfQuizk3btn3.text = (2*r).toString() + pi + " cm"
                                btnInfQuizk3btn4.text = Odp.toString() + pi + " cm\u00B2"
                                listner(AnsNr)
                            }
                        }
                    }
                    2->{
                        ivInfQuizk3Trojkat.visibility=VISIBLE
                        tvInfQuizK3TrojkatPodstawa.visibility=VISIBLE
                        tvInfQuizK3TrojkatWysokosc.visibility=VISIBLE
                        tvInfQuizK3TrojkatBok2.visibility=VISIBLE
                        tvInfQuizK3TrojkatBok3.visibility=VISIBLE
                        var h = (1..10).random()
                        var x = (0..7).random()
                        var a = parzyste[x]
                        var b = (1..10).random()
                        var c = (1..10).random()
                        tvInfQuizK3TrojkatPodstawa.text = a.toString()
                        tvInfQuizK3TrojkatWysokosc.text = h.toString()
                        tvInfQuizK3TrojkatBok2.text = b.toString()
                        tvInfQuizK3TrojkatBok3.text = c.toString()
                        var Obw = (a+b+c)
                        var Odp = (a*h)/2
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.text = Odp.toString() + " cm\u00B2"
                                btnInfQuizk3btn2.text = (a*h).toString() + " cm"
                                btnInfQuizk3btn3.text = (Obw).toString() + " cm"
                                btnInfQuizk3btn4.text = (a+h+h+a).toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.text = (Obw).toString() + " cm"
                                btnInfQuizk3btn2.text = Odp.toString() + " cm\u00B2"
                                btnInfQuizk3btn3.text = (a*h).toString() + " cm"
                                btnInfQuizk3btn4.text = (a+h+h+a).toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.text = (a+h+h+a).toString() + " cm\u00B2"
                                btnInfQuizk3btn2.text = (a*a).toString() + " cm"
                                btnInfQuizk3btn3.text = Odp.toString() + " cm\u00B2"
                                btnInfQuizk3btn4.text = (Obw).toString() + " cm"
                                listner(AnsNr)
                            }
                            4->{
                                btnInfQuizk3btn1.text = (a*a).toString() + " cm"
                                btnInfQuizk3btn2.text = (Obw).toString() + " cm"
                                btnInfQuizk3btn3.text = (a+h+h+a).toString() + " cm\u00B2"
                                btnInfQuizk3btn4.text = Odp.toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                        }
                    }
                    3->{
                        ivInfQuizk3kwadrat.visibility=VISIBLE
                        tvInfQuizK3KwadratRight.visibility=VISIBLE
                        tvInfQuizK3KwadratTop.visibility=VISIBLE
                        var a = (1..10).random()
                        tvInfQuizK3KwadratTop.text = a.toString()
                        tvInfQuizK3KwadratRight.text = a.toString()
                        var Odp = a * a
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.text = Odp.toString() + " cm\u00B2"
                                btnInfQuizk3btn2.text = ((a*a)/2).toString()  + " cm"
                                btnInfQuizk3btn3.text = (a+a+a+a).toString()  + " cm"
                                btnInfQuizk3btn4.text = (3*a).toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.text = (3*a).toString() + " cm\u00B2"
                                btnInfQuizk3btn2.text = Odp.toString() + " cm\u00B2"
                                btnInfQuizk3btn3.text = ((a*a)/2).toString()  + " cm"
                                btnInfQuizk3btn4.text = (a+a+a+a).toString()  + " cm"
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.text = (a+a+a+a).toString()  + " cm"
                                btnInfQuizk3btn2.text = (3*a).toString() + " cm\u00B2"
                                btnInfQuizk3btn3.text = Odp.toString() + " cm\u00B2"
                                btnInfQuizk3btn4.text = ((a*a)/2).toString()  + " cm"
                                listner(AnsNr)
                            }
                            4->{
                                btnInfQuizk3btn1.text = ((a*a)/2).toString()  + " cm"
                                btnInfQuizk3btn2.text = (a+a+a+a).toString()  + " cm"
                                btnInfQuizk3btn3.text = (3*a).toString() + " cm\u00B2"
                                btnInfQuizk3btn4.text = Odp.toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                        }
                    }
                    4->{
                        ivInfQuizk3prostokat.visibility=VISIBLE
                        tvInfQuizK3ProstokatRight.visibility=VISIBLE
                        tvInfQuizK3ProstokatTop.visibility=VISIBLE
                        var a = (6..10).random()
                        var b = (1..5).random()
                        tvInfQuizK3ProstokatTop.text = a.toString()
                        tvInfQuizK3ProstokatRight.text = b.toString()
                        var Odp = a * b
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.text = Odp.toString() + " cm\u00B2"
                                btnInfQuizk3btn2.text = (a*(a+b)).toString() + " cm\u00B2"
                                btnInfQuizk3btn3.text = (a+a+b+b).toString()  + " cm"
                                btnInfQuizk3btn4.text = (a+b).toString()  + " cm"
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.text = (a+b).toString()  + " cm"
                                btnInfQuizk3btn2.text = Odp.toString() + " cm\u00B2"
                                btnInfQuizk3btn3.text = (a*(a+b)).toString() + " cm\u00B2"
                                btnInfQuizk3btn4.text = (a+a+b+b).toString()  + " cm"
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.text = (a+a+b+b).toString()  + " cm"
                                btnInfQuizk3btn2.text = (a+b).toString()  + " cm"
                                btnInfQuizk3btn3.text = Odp.toString() + " cm\u00B2"
                                btnInfQuizk3btn4.text = (a*(a+b)).toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                            4->{
                                btnInfQuizk3btn1.text = (a*(a+b)).toString() + " cm\u00B2"
                                btnInfQuizk3btn2.text = (a+a+b+b).toString()  + " cm"
                                btnInfQuizk3btn3.text = (a+b).toString()  + " cm"
                                btnInfQuizk3btn4.text = Odp.toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                        }
                    }
                }
            }
            2->{
                tvInfQuizk3Question.text = "Oblicz " + wartosc[typ].toString() + " podanej figury"
                when(figura){
                    1->{
                        ivInfQuizk3kolo.visibility=VISIBLE
                        tvInfQuizK3KoloPromien.visibility=VISIBLE
                        var r = (2..10).random()
                        tvInfQuizK3KoloPromien.text = r.toString()
                        var Odp=2*r
                        when(AnsNr){
                            1  -> {

                                btnInfQuizk3btn1.text = Odp.toString() + pi + " cm"
                                btnInfQuizk3btn2.text = (r*r).toString() + pi + " cm\u00B2"
                                btnInfQuizk3btn3.text = r.toString() + pi + " cm"
                                btnInfQuizk3btn4.text = ((r*r)/2).toString() + pi + " cm\u00B2"
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.text = r.toString() + pi  + " cm"
                                btnInfQuizk3btn2.text = Odp.toString() + pi + " cm"
                                btnInfQuizk3btn3.text = ((r*r)/2).toString() + pi + " cm\u00B2"
                                btnInfQuizk3btn4.text = (r*r).toString() + pi + " cm\u00B2"
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.text = (r*r).toString() + pi + " cm\u00B2"
                                btnInfQuizk3btn2.text = ((r*r)/2).toString() + pi + " cm\u00B2"
                                btnInfQuizk3btn3.text = Odp.toString() + pi + " cm"
                                btnInfQuizk3btn4.text = r.toString() + pi  + " cm"
                                listner(AnsNr)

                            }
                            4->{
                                btnInfQuizk3btn1.text = ((r*r)/2).toString() + pi + " cm\u00B2"
                                btnInfQuizk3btn2.text = r.toString() + pi  + " cm"
                                btnInfQuizk3btn3.text = (r*r).toString() + pi + " cm\u00B2"
                                btnInfQuizk3btn4.text = Odp.toString() + pi + " cm"
                                listner(AnsNr)
                            }
                        }
                    }
                    2->{
                        ivInfQuizk3Trojkat.visibility=VISIBLE
                        tvInfQuizK3TrojkatPodstawa.visibility=VISIBLE
                        tvInfQuizK3TrojkatWysokosc.visibility=VISIBLE
                        tvInfQuizK3TrojkatBok2.visibility=VISIBLE
                        tvInfQuizK3TrojkatBok3.visibility=VISIBLE
                        var h = (1..10).random()
                        var x = (0..7).random()
                        var a = parzyste[x]
                        var b = (1..10).random()
                        var c = (1..10).random()
                        tvInfQuizK3TrojkatPodstawa.text = a.toString()
                        tvInfQuizK3TrojkatWysokosc.text = h.toString()
                        tvInfQuizK3TrojkatBok2.text = b.toString()
                        tvInfQuizK3TrojkatBok3.text = c.toString()
                        var Obw = (a+b+c)
                        var Odp = (a*h)/2
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.text = Obw.toString() + " cm"
                                btnInfQuizk3btn2.text = (a*h).toString() + " cm"
                                btnInfQuizk3btn3.text = Odp.toString() + " cm\u00B2"
                                btnInfQuizk3btn4.text = (a+h+h+a).toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.text = Odp.toString() + " cm\u00B2"
                                btnInfQuizk3btn2.text = Obw.toString() + " cm"
                                btnInfQuizk3btn3.text = (a+a+a).toString() + " cm"
                                btnInfQuizk3btn4.text = (a+h+h+a).toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.text = (a+h+h+a).toString() + " cm\u00B2"
                                btnInfQuizk3btn2.text = (a*a).toString() + " cm"
                                btnInfQuizk3btn3.text = Obw.toString() + " cm"
                                btnInfQuizk3btn4.text = Odp.toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                            4->{
                                btnInfQuizk3btn1.text = (a*a).toString() + " cm"
                                btnInfQuizk3btn2.text = Odp.toString() + " cm\u00B2"
                                btnInfQuizk3btn3.text = (a+h+h+a).toString() + " cm"
                                btnInfQuizk3btn4.text = Obw.toString() + " cm"
                                listner(AnsNr)
                            }
                        }
                    }
                    3->{
                        ivInfQuizk3kwadrat.visibility=VISIBLE
                        tvInfQuizK3KwadratRight.visibility=VISIBLE
                        tvInfQuizK3KwadratTop.visibility=VISIBLE
                        var a = (1..10).random()
                        tvInfQuizK3KwadratTop.text = a.toString()
                        tvInfQuizK3KwadratRight.text = a.toString()
                        var Odp = a + a + a + a
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.text = Odp.toString() + " cm"
                                btnInfQuizk3btn2.text = ((a*a)/2).toString()  + " cm"
                                btnInfQuizk3btn3.text = (a*a).toString() + " cm\u00B2"
                                btnInfQuizk3btn4.text = (3*a).toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.text = (3*a).toString() + " cm\u00B2"
                                btnInfQuizk3btn2.text = Odp.toString() + " cm"
                                btnInfQuizk3btn3.text = ((a*a)/2).toString()  + " cm"
                                btnInfQuizk3btn4.text = (a*a).toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.text = (a*a).toString() + " cm\u00B2"
                                btnInfQuizk3btn2.text = (3*a).toString() + " cm\u00B2"
                                btnInfQuizk3btn3.text = Odp.toString() + " cm"
                                btnInfQuizk3btn4.text = ((a*a)/2).toString()  + " cm"
                                listner(AnsNr)
                            }
                            4->{
                                btnInfQuizk3btn1.text = ((a*a)/2).toString()  + " cm"
                                btnInfQuizk3btn2.text = (a*a).toString() + " cm\u00B2"
                                btnInfQuizk3btn3.text = (3*a).toString() + " cm\u00B2"
                                btnInfQuizk3btn4.text = Odp.toString() + " cm"
                                listner(AnsNr)
                            }
                        }
                    }
                    4->{
                        ivInfQuizk3prostokat.visibility=VISIBLE
                        tvInfQuizK3ProstokatRight.visibility=VISIBLE
                        tvInfQuizK3ProstokatTop.visibility=VISIBLE
                        var a = (6..10).random()
                        var b = (1..5).random()
                        tvInfQuizK3ProstokatTop.text = a.toString()
                        tvInfQuizK3ProstokatRight.text = b.toString()
                        var Odp = a + b + a + b
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.text = Odp.toString() + " cm"
                                btnInfQuizk3btn2.text = (a*(a+b)).toString() + " cm\u00B2"
                                btnInfQuizk3btn3.text = (a*b).toString() + " cm\u00B2"
                                btnInfQuizk3btn4.text = (a+b).toString()  + " cm"
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.text = (a+b).toString()  + " cm"
                                btnInfQuizk3btn2.text = Odp.toString() + " cm"
                                btnInfQuizk3btn3.text = (a*(a+b)).toString() + " cm\u00B2"
                                btnInfQuizk3btn4.text = (a*b).toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.text = (a*b).toString() + " cm\u00B2"
                                btnInfQuizk3btn2.text = (a+b).toString()  + " cm"
                                btnInfQuizk3btn3.text = Odp.toString() + " cm"
                                btnInfQuizk3btn4.text = (a*(a+b)).toString() + " cm\u00B2"
                                listner(AnsNr)
                            }
                            4->{
                                btnInfQuizk3btn1.text = (a*(a+b)).toString() + " cm\u00B2"
                                btnInfQuizk3btn2.text = (a*b).toString() + " cm\u00B2"
                                btnInfQuizk3btn3.text = (a+b).toString()  + " cm"
                                btnInfQuizk3btn4.text = Odp.toString() + " cm"
                                listner(AnsNr)
                            }
                        }
                    }
                }
            }
        }
    }
    private fun zegarek(){
        btnInfQuizk3btn1.textSize=resources.getDimension(R.dimen.font_24sp)
        btnInfQuizk3btn2.textSize=resources.getDimension(R.dimen.font_24sp)
        btnInfQuizk3btn3.textSize=resources.getDimension(R.dimen.font_24sp)
        btnInfQuizk3btn4.textSize=resources.getDimension(R.dimen.font_24sp)
        tvInfQuizk3Question.textSize= resources.getDimension(R.dimen.font_14sp)
        ivInfQuizK3zegary_pusty.visibility = VISIBLE
        var AnsNr = (1..4).random()
        var godzinaans = (1..24).random()
        var minutyans = (1..12).random()
        godzinadisplayer(godzinaans)
        minutadisplayer(minutyans)
        tvInfQuizk3Question.text = "Która jest godzina?"
        when (AnsNr){
            1-> {
                btnInfQuizk3btn1.text = godzinaans.toString() + ":" + minmap[minutyans]
                var godzina = (1..24).random()
                var minuty = (1..12).random()
                btnInfQuizk3btn2.text = godzina.toString() + ":" + minmap[minuty]
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnInfQuizk3btn3.text = godzina.toString() + ":" + minmap[minuty]
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnInfQuizk3btn4.text = godzina.toString() + ":" + minmap[minuty]
                listner(AnsNr)
            }
            2-> {
                var godzina = (1..24).random()
                var minuty = (1..12).random()
                btnInfQuizk3btn1.text = godzina.toString() + ":" + minmap[minuty]
                btnInfQuizk3btn2.text = godzinaans.toString() + ":" + minmap[minutyans]
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnInfQuizk3btn3.text = godzina.toString() + ":" + minmap[minuty]
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnInfQuizk3btn4.text = godzina.toString() + ":" + minmap[minuty]
                listner(AnsNr)
            }
            3-> {
                var godzina = (1..24).random()
                var minuty = (1..12).random()
                btnInfQuizk3btn1.text = godzina.toString() + ":" + minmap[minuty]
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnInfQuizk3btn2.text = godzina.toString() + ":" + minmap[minuty]
                btnInfQuizk3btn3.text = godzinaans.toString() + ":" + minmap[minutyans]
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnInfQuizk3btn4.text = godzina.toString() + ":" + minmap[minuty]
                listner(AnsNr)
            }
            4-> {
                var godzina = (1..24).random()
                var minuty = (1..12).random()
                btnInfQuizk3btn1.text = godzina.toString() + ":" + minmap[minuty]
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnInfQuizk3btn2.text = godzina.toString() + ":" + minmap[minuty]
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnInfQuizk3btn3.text = godzina.toString() + ":" + minmap[minuty]
                btnInfQuizk3btn4.text = godzinaans.toString() + ":" + minmap[minutyans]
                listner(AnsNr)
            }
        }

    }
    private fun godzinadisplayer(godzina:Int){
        when(godzina){
            1,13->ivInfQuizK3Godzina1.visibility=VISIBLE
            2,14->ivInfQuizK3Godzina2.visibility=VISIBLE
            3,15->ivInfQuizK3Godzina3.visibility=VISIBLE
            4,16->ivInfQuizK3Godzina4.visibility=VISIBLE
            5,17->ivInfQuizK3Godzina5.visibility=VISIBLE
            6,18->ivInfQuizK3Godzina6.visibility=VISIBLE
            7,19->ivInfQuizK3Godzina7.visibility=VISIBLE
            8,20->ivInfQuizK3Godzina8.visibility=VISIBLE
            9,21->ivInfQuizK3Godzina9.visibility=VISIBLE
            10,22->ivInfQuizK3Godzina10.visibility=VISIBLE
            11,23->ivInfQuizK3Godzina11.visibility=VISIBLE
            12,24->ivInfQuizK3Godzina12.visibility=VISIBLE
        }
    }
    private fun minutadisplayer(minuta:Int){
        when(minuta){
            1->ivInfQuizK3Minuta1.visibility=VISIBLE
            2->ivInfQuizK3Minuta2.visibility=VISIBLE
            3->ivInfQuizK3Minuta3.visibility=VISIBLE
            4->ivInfQuizK3Minuta4.visibility=VISIBLE
            5->ivInfQuizK3Minuta5.visibility=VISIBLE
            6->ivInfQuizK3Minuta6.visibility=VISIBLE
            7->ivInfQuizK3Minuta7.visibility=VISIBLE
            8->ivInfQuizK3Minuta8.visibility=VISIBLE
            9->ivInfQuizK3Minuta9.visibility=VISIBLE
            10->ivInfQuizK3Minuta10.visibility=VISIBLE
            11->ivInfQuizK3Minuta11.visibility=VISIBLE
            12->ivInfQuizK3Minuta12.visibility=VISIBLE

        }
    }
    private fun porownywanie(){
        tvInfQuizk3Question.textSize = resources.getDimension(R.dimen.font_24sp)
        btnInfQuizk3btn3.textSize = resources.getDimension(R.dimen.font_40sp)
        btnInfQuizk3btn4.textSize = resources.getDimension(R.dimen.font_40sp)
        btnInfQuizk3btn5.textSize = resources.getDimension(R.dimen.font_40sp)
        btnInfQuizk3btn1.visibility= GONE
        btnInfQuizk3btn2.visibility= GONE
        btnInfQuizk3btn5.visibility= VISIBLE
        var liczba1 = (500..1000).random()
        var liczba2 = (500..1000).random()
        tvInfQuizk3Question.text = liczba1.toString() + " ? " + liczba2.toString()
        btnInfQuizk3btn5.text = "="
        btnInfQuizk3btn4.text = "<"
        btnInfQuizk3btn3.text = ">"
        if(liczba1 > liczba2){
            listner(3)
        } else if (liczba1 < liczba2){
            listner(4)
        } else {
            listner(5)
        }
    }
    private fun daty() {
        tvInfQuizk3Question.textSize = resources.getDimension(R.dimen.font_14sp)
        btnInfQuizk3btn3.textSize = resources.getDimension(R.dimen.font_10sp)
        btnInfQuizk3btn4.textSize = resources.getDimension(R.dimen.font_10sp)
        btnInfQuizk3btn5.textSize = resources.getDimension(R.dimen.font_10sp)
        btnInfQuizk3btn1.visibility = GONE
        btnInfQuizk3btn2.visibility = GONE
        btnInfQuizk3btn5.visibility = VISIBLE
        var miech = (1..12).random()
        var dzien = (1..28).random()
        var typ = (1..2).random()
        var AnsNr = (3..5).random()
        when(typ){
            1->{
                tvInfQuizk3Question.text = "Jaka to data " + rzymMap[miech] + "." + dzien.toString() + "?"
                when (AnsNr){
                    3->{
                        btnInfQuizk3btn3.text = liczbyporadkowe[dzien] + " " + miesiace[miech]
                        btnInfQuizk3btn4.text = liczbyporadkowe[dzien] + " " + miesiace[miech + 1]
                        btnInfQuizk3btn5.text = liczbyporadkowe[dzien] + " " + miesiace[miech - 1]
                        listner(AnsNr)
                    }
                    4->{
                        btnInfQuizk3btn3.text = liczbyporadkowe[dzien] + " " + miesiace[miech - 1]
                        btnInfQuizk3btn4.text = (liczbyporadkowe[dzien] + " " + miesiace[miech])
                        btnInfQuizk3btn5.text = liczbyporadkowe[dzien] + " " + miesiace[miech + 1]
                        listner(AnsNr)
                    }
                    5->{
                        btnInfQuizk3btn3.text = liczbyporadkowe[dzien] + " " + miesiace[miech + 1]
                        btnInfQuizk3btn4.text = liczbyporadkowe[dzien] + " " + miesiace[miech - 1]
                        btnInfQuizk3btn5.text = liczbyporadkowe[dzien] + " " + miesiace[miech]
                        listner(AnsNr)
                    }
                }
            }
            2->{
                tvInfQuizk3Question.text = "Jaka to data " + miech.toString() + "." + dzien.toString() + "?"
                when (AnsNr){
                    3->{
                        btnInfQuizk3btn3.text = liczbyporadkowe[dzien] + " " + miesiace[miech]
                        btnInfQuizk3btn4.text = liczbyporadkowe[dzien] + " " + miesiace[miech + 1]
                        btnInfQuizk3btn5.text = liczbyporadkowe[dzien] + " " + miesiace[miech - 1]
                        listner(AnsNr)
                    }
                    4->{
                        btnInfQuizk3btn3.text = liczbyporadkowe[dzien] + " " + miesiace[miech - 1]
                        btnInfQuizk3btn4.text = liczbyporadkowe[dzien] + " " + miesiace[miech]
                        btnInfQuizk3btn5.text = liczbyporadkowe[dzien] + " " + miesiace[miech + 1]
                        listner(AnsNr)
                    }
                    5->{
                        btnInfQuizk3btn3.text = liczbyporadkowe[dzien] + " " + miesiace[miech + 1]
                        btnInfQuizk3btn4.text = liczbyporadkowe[dzien] + " " + miesiace[miech - 1]
                        btnInfQuizk3btn5.text = liczbyporadkowe[dzien] + " " + miesiace[miech]
                        listner(AnsNr)
                    }
                }
            }
        }
    }
    private fun przeliczanie(){
        btnInfQuizk3btn1.visibility = GONE
        btnInfQuizk3btn2.visibility = GONE
        btnInfQuizk3btn3.textSize = resources.getDimension(R.dimen.font_10sp)
        btnInfQuizk3btn4.textSize = resources.getDimension(R.dimen.font_10sp)
        tvInfQuizk3Question.textSize= resources.getDimension(R.dimen.font_32sp)
        var miara = (1..3).random()
            when(miara){
                1->{    // długośc
                    //val typ = 1
                    val typ = (1..3).random()
                    when(typ){
                        1->{    // mm
                            val wCo = (1..2).random()
                            when(wCo){
                                1->{ //mm ->cm
                                    val ans = 100
                                    val AnsNr =(3..4).random()
                                    tvInfQuizk3Question.text = ans.toString()+cmSI[1]+" to:"
                                    when(AnsNr){
                                        3->{
                                            btnInfQuizk3btn3.text = "" + (ans/10).toString() + cmSI[2]
                                            btnInfQuizk3btn4.text = "" + (ans/100).toString() + cmSI[2]
                                            listner(AnsNr)
                                        }
                                        4->{
                                            btnInfQuizk3btn3.text = "" + (ans/100).toString() + cmSI[2]
                                            btnInfQuizk3btn4.text = "" + (ans/10).toString() + cmSI[2]
                                            listner(AnsNr)
                                        }
                                    }
                                }
                                2->{ //mm->m
                                    val ans = 1000
                                    val AnsNr =(3..4).random()
                                    tvInfQuizk3Question.text = ans.toString()+cmSI[1]+" to:"
                                    when (AnsNr){
                                        3->{
                                            btnInfQuizk3btn3.text = "1" + cmSI[3]
                                            btnInfQuizk3btn4.text = "10" + cmSI[2]
                                            listner(AnsNr)
                                        }
                                        4->{
                                            btnInfQuizk3btn3.text = "10" + cmSI[2]
                                            btnInfQuizk3btn4.text = "1" + cmSI[3]
                                            listner(AnsNr)
                                        }
                                    }
                                }
                            }
                        }
                        2->{    //cm
                            var wCo = (1..2).random()
                            when (wCo){
                                1->{ //cm->mm
                                    val ans = 1
                                    val AnsNr = (3..4).random()
                                    tvInfQuizk3Question.text = ans.toString()+cmSI[2]+" to:"
                                    when(AnsNr){
                                        3->{
                                            btnInfQuizk3btn3.text = (ans*10).toString() + cmSI[1]
                                            btnInfQuizk3btn4.text = (ans*100).toString() + cmSI[1]
                                            listner(AnsNr)
                                        }
                                        4->{
                                            btnInfQuizk3btn3.text = (ans*100).toString() + cmSI[1]
                                            btnInfQuizk3btn4.text = (ans*10).toString() + cmSI[1]
                                            listner(AnsNr)
                                        }
                                    }
                                }
                                2->{ //cm->m
                                    val ans = 100
                                    val AnsNr = (3..4).random()
                                    tvInfQuizk3Question.text = ans.toString()+cmSI[2]+" to:"
                                    when(AnsNr){
                                        3->{
                                            btnInfQuizk3btn3.text = (ans/100).toString() + cmSI[3]
                                            btnInfQuizk3btn4.text = (ans/10).toString() + cmSI[3]
                                            listner(AnsNr)
                                        }
                                        4->{
                                            btnInfQuizk3btn3.text = (ans/10).toString() + cmSI[3]
                                            btnInfQuizk3btn4.text = (ans/100).toString() + cmSI[3]
                                            listner(AnsNr)
                                        }
                                    }
                                }
                            }
                        }
                        3->{ //metry
                            val wCo= (1..2).random()
                            when (wCo){
                                1->{ // m->mm
                                    val ans = 1
                                    val AnsNr=(3..4).random()
                                    tvInfQuizk3Question.text = ans.toString()+cmSI[3]+" to:"
                                    when (AnsNr){
                                        3->{
                                            btnInfQuizk3btn3.text = (ans*1000).toString() + cmSI[1]
                                            btnInfQuizk3btn4.text = (ans*100).toString() + cmSI[1]
                                            listner(AnsNr)
                                        }
                                        4->{
                                            btnInfQuizk3btn3.text = (ans*100).toString() + cmSI[1]
                                            btnInfQuizk3btn4.text = (ans*1000).toString() + cmSI[1]
                                            listner(AnsNr)
                                        }
                                    }
                                }
                                2->{    // m -> cm
                                    val ans = (1..10).random()
                                    val AnsNr = (3..4).random()
                                    tvInfQuizk3Question.text = ans.toString()+cmSI[3]+" to:"
                                    when (AnsNr){
                                        3->{
                                            btnInfQuizk3btn3.text = (ans*100).toString() + cmSI[2]
                                            btnInfQuizk3btn4.text = (ans*10).toString() + cmSI[2]
                                            listner(AnsNr)
                                        }
                                        4->{
                                            btnInfQuizk3btn3.text = (ans*10).toString() + cmSI[2]
                                            btnInfQuizk3btn4.text = (ans*100).toString() + cmSI[2]
                                            listner(AnsNr)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                2->{    // ciężar
                    //val typ = 1
                    val typ = (1..3).random()
                    when(typ){
                        1->{    // g
                            val wCo = (1..2).random()
                            when(wCo){
                                1->{ //g ->dkg
                                    val ans = 100
                                    val AnsNr =(3..4).random()
                                    tvInfQuizk3Question.text = ans.toString()+kgSI[1]+" to:"
                                    when(AnsNr){
                                        3->{
                                            btnInfQuizk3btn3.text = "" + (ans/10).toString() + kgSI[2]
                                            btnInfQuizk3btn4.text = "" + (ans/100).toString() + kgSI[2]
                                            listner(AnsNr)
                                        }
                                        4->{
                                            btnInfQuizk3btn3.text = "" + (ans/100).toString() + kgSI[2]
                                            btnInfQuizk3btn4.text = "" + (ans/10).toString() + kgSI[2]
                                            listner(AnsNr)
                                        }
                                    }
                                }
                                2->{ //g->kg
                                    val ans = 1000
                                    val AnsNr =(3..4).random()
                                    tvInfQuizk3Question.text = ans.toString()+kgSI[1]+" to:"
                                    when (AnsNr){
                                        3->{
                                            btnInfQuizk3btn3.text = "1" + kgSI[3]
                                            btnInfQuizk3btn4.text = "10" + kgSI[2]
                                            listner(AnsNr)
                                        }
                                        4->{
                                            btnInfQuizk3btn3.text = "10" + kgSI[2]
                                            btnInfQuizk3btn4.text = "1" + kgSI[3]
                                            listner(AnsNr)
                                        }
                                    }
                                }
                            }
                        }
                        2->{    // dkg
                            var wCo = (1..2).random()
                            when (wCo){
                                1->{ //dkg->g
                                    val ans = 1
                                    val AnsNr = (3..4).random()
                                    tvInfQuizk3Question.text = ans.toString()+kgSI[2]+" to:"
                                    when(AnsNr){
                                        3->{
                                            btnInfQuizk3btn3.text = (ans*10).toString() + kgSI[1]
                                            btnInfQuizk3btn4.text = (ans*100).toString() + kgSI[1]
                                            listner(AnsNr)
                                        }
                                        4->{
                                            btnInfQuizk3btn3.text = (ans*100).toString() + kgSI[1]
                                            btnInfQuizk3btn4.text = (ans*10).toString() + kgSI[1]
                                            listner(AnsNr)
                                        }
                                    }
                                }
                                2->{ //dkg->kg
                                    val ans = 100
                                    val AnsNr = (3..4).random()
                                    tvInfQuizk3Question.text = ans.toString()+kgSI[2]+" to:"
                                    when(AnsNr){
                                        3->{
                                            btnInfQuizk3btn3.text = (ans/100).toString() + kgSI[3]
                                            btnInfQuizk3btn4.text = (ans/10).toString() + kgSI[3]
                                            listner(AnsNr)
                                        }
                                        4->{
                                            btnInfQuizk3btn3.text = (ans/10).toString() + kgSI[3]
                                            btnInfQuizk3btn4.text = (ans/100).toString() + kgSI[3]
                                            listner(AnsNr)
                                        }
                                    }
                                }
                            }
                        }
                        3->{ // kilogramy
                            val wCo= (1..2).random()
                            when (wCo){
                                1->{ // kg -> g
                                    val ans = 1
                                    val AnsNr=(3..4).random()
                                    tvInfQuizk3Question.text = ans.toString()+kgSI[3]+" to:"
                                    when (AnsNr){
                                        3->{
                                            btnInfQuizk3btn3.text = (ans*1000).toString() + kgSI[1]
                                            btnInfQuizk3btn4.text = (ans*100).toString() + kgSI[1]
                                            listner(AnsNr)
                                        }
                                        4->{
                                            btnInfQuizk3btn3.text = (ans*100).toString() + kgSI[1]
                                            btnInfQuizk3btn4.text = (ans*1000).toString() + kgSI[1]
                                            listner(AnsNr)
                                        }
                                    }
                                }
                                2->{    // kg -> dag
                                    val ans = (1..10).random()
                                    val AnsNr = (3..4).random()
                                    tvInfQuizk3Question.text = ans.toString()+kgSI[3]+" to:"
                                    when (AnsNr){
                                        3->{
                                            btnInfQuizk3btn3.text = (ans*100).toString() + kgSI[2]
                                            btnInfQuizk3btn4.text = (ans*10).toString() + kgSI[2]
                                            listner(AnsNr)
                                        }
                                        4->{
                                            btnInfQuizk3btn3.text = (ans*10).toString() + kgSI[2]
                                            btnInfQuizk3btn4.text = (ans*100).toString() + kgSI[2]
                                            listner(AnsNr)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                3->{    // pojemnosc
                    var typ = (1..2).random()
                    when(typ){
                        1->{    // ml -> l
                            val ans = 1000
                            val AnsNr =(3..4).random()
                            tvInfQuizk3Question.text = ans.toString()+lSI[1]+" to:"
                            when (AnsNr){
                                3->{
                                    btnInfQuizk3btn3.text = "1" + lSI[2]
                                    btnInfQuizk3btn4.text = "10" + lSI[2]
                                    listner(AnsNr)
                                }
                                4->{
                                    btnInfQuizk3btn3.text = "10" + lSI[2]
                                    btnInfQuizk3btn4.text = "1" + lSI[2]
                                    listner(AnsNr)
                                }
                            }
                        }
                        2->{ // kg -> g
                            val ans = 1
                            val AnsNr=(3..4).random()
                            tvInfQuizk3Question.text = ans.toString()+lSI[2]+" to:"
                            when (AnsNr){
                                3->{
                                    btnInfQuizk3btn3.text = (ans*1000).toString() + lSI[1]
                                    btnInfQuizk3btn4.text = (ans*100).toString() + lSI[1]
                                    listner(AnsNr)
                                }
                                4->{
                                    btnInfQuizk3btn3.text = (ans*100).toString() + lSI[1]
                                    btnInfQuizk3btn4.text = (ans*1000).toString() + lSI[1]
                                    listner(AnsNr)
                                }
                            }
                        }
                    }
                }
            }

    }

    private fun listner(AnsNr: Int){
       when (AnsNr){
           1->{
               btnInfQuizk3btn1.setOnClickListener {
                   correctAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
                   losowanie()
               }
               btnInfQuizk3btn2.setOnClickListener {
                   btnInfQuizk3btn2.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()

               }
               btnInfQuizk3btn3.setOnClickListener {
                   btnInfQuizk3btn3.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()

               }
               btnInfQuizk3btn4.setOnClickListener {
                   btnInfQuizk3btn4.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
               }
           }
           2->{
               btnInfQuizk3btn1.setOnClickListener {
                   btnInfQuizk3btn1.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
               }
               btnInfQuizk3btn2.setOnClickListener {
                   correctAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\n Złe odpowiedzi: " + badAnswersOverall.toString()
                   losowanie()
               }
               btnInfQuizk3btn3.setOnClickListener {
                   btnInfQuizk3btn3.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
               }
               btnInfQuizk3btn4.setOnClickListener {
                   btnInfQuizk3btn4.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
               }
           }
           3->{
               btnInfQuizk3btn1.setOnClickListener {
                   btnInfQuizk3btn1.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
               }
               btnInfQuizk3btn2.setOnClickListener {
                   btnInfQuizk3btn2.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
               }
               btnInfQuizk3btn3.setOnClickListener {
                   correctAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
                   losowanie()
               }
               btnInfQuizk3btn4.setOnClickListener {
                   btnInfQuizk3btn4.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
               }
               btnInfQuizk3btn5.setOnClickListener {
                   btnInfQuizk3btn5.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
               }
           }
           4->{
               btnInfQuizk3btn1.setOnClickListener {
                   btnInfQuizk3btn1.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()

               }
               btnInfQuizk3btn2.setOnClickListener {
                   btnInfQuizk3btn2.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()

               }
               btnInfQuizk3btn3.setOnClickListener {
                   btnInfQuizk3btn3.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()

               }
               btnInfQuizk3btn4.setOnClickListener {
                   correctAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
                   losowanie()
               }
               btnInfQuizk3btn5.setOnClickListener {
                   btnInfQuizk3btn5.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
               }
           }
           5->{
               btnInfQuizk3btn3.setOnClickListener {
                   btnInfQuizk3btn3.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()

               }
               btnInfQuizk3btn4.setOnClickListener {
                   btnInfQuizk3btn4.setBackgroundResource(R.drawable.wrong_button)
                   badAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
                   losowanie()
               }
               btnInfQuizk3btn5.setOnClickListener {
                   correctAnswersOverall++
                   tvInfQuizk3Score.text = "Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString()
                   losowanie()              }

           }
       }
    }
}
