package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_inf_quiz_k3.*

class InfQuizK3 : AppCompatActivity() {

    var correctAnswersOverall = 0
    var badAnswersOverall = 0
    val liczbyporadkowe = mapOf(
        1 to "Pierwszy", 2 to "Drugi", 3 to "Trzeci", 4 to "Czwarty", 5 to "Piąty", 6 to "Szósty", 7 to "Siódmy", 8 to "Ósmy",
        9 to "Dziewąty", 10 to "Dziesiąty", 11 to "Jedenasty", 12 to "Dwunasty", 13 to "Trzynasty",14 to "Czternasty",
        15 to "Piętnasy", 16 to "Szesnasty", 17 to "Siedemnasty", 18 to "Osiemnasty", 19 to "Dziewiętnasty", 20 to "Dwudziesty",
        21 to "Dwudziesty pierwszy", 22 to "Dwudziesty drugi", 23 to "Dwudziesty trzeci", 24 to "Dwudziesty czwarty",
        25 to "Dwudziesty piąty", 26 to "Dwudziesty szósty", 27 to "Dwudziesty siódmy", 28 to "Dwudziesty ósmy")
    var minmap = mapOf(1 to "05", 2 to "10", 3 to "15", 4 to "20", 5 to "25", 6 to "30", 7 to "35", 8 to "40", 9 to "45",
        10 to "50", 11 to "55" , 12 to "00" )
    val wartosc = mapOf(1 to "pole", 2 to "obwód")
    val pi = "\u03C0"
    val parzyste = arrayListOf(2,4,6,8,10,12,14,16)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inf_quiz_k3)


        tvInfQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

        losowanie()
    }

    fun losowanie(){
        btnInfQuizk3btn1.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk3btn2.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk3btn3.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk3btn4.setBackgroundResource(R.drawable.default_button)
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
        ivInfQuizK3zegary_pusty.visibility=View.GONE
        ivInfQuizK3Godzina1.visibility=View.GONE
        ivInfQuizK3Godzina2.visibility=View.GONE
        ivInfQuizK3Godzina3.visibility=View.GONE
        ivInfQuizK3Godzina4.visibility=View.GONE
        ivInfQuizK3Godzina5.visibility=View.GONE
        ivInfQuizK3Godzina6.visibility=View.GONE
        ivInfQuizK3Godzina7.visibility=View.GONE
        ivInfQuizK3Godzina8.visibility=View.GONE
        ivInfQuizK3Godzina9.visibility=View.GONE
        ivInfQuizK3Godzina10.visibility=View.GONE
        ivInfQuizK3Godzina11.visibility=View.GONE
        ivInfQuizK3Godzina12.visibility=View.GONE
        ivInfQuizK3Minuta1.visibility=View.GONE
        ivInfQuizK3Minuta2.visibility=View.GONE
        ivInfQuizK3Minuta3.visibility=View.GONE
        ivInfQuizK3Minuta4.visibility=View.GONE
        ivInfQuizK3Minuta5.visibility=View.GONE
        ivInfQuizK3Minuta6.visibility=View.GONE
        ivInfQuizK3Minuta7.visibility=View.GONE
        ivInfQuizK3Minuta8.visibility=View.GONE
        ivInfQuizK3Minuta9.visibility=View.GONE
        ivInfQuizK3Minuta10.visibility=View.GONE
        ivInfQuizK3Minuta11.visibility=View.GONE
        ivInfQuizK3Minuta12.visibility=View.GONE
        //var los = (1..2).random()
        var los = 2
        when (los){
            1->liczby()
            2->geometria()
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
    fun zegarek(){}
    fun geometria(){
        var figura = (1..4).random()
        var AnsNr = (1..4).random()
        var typ = (1..2).random()
        when(typ){
            1->{
                tvInfQuizk3Question.setText("Oblicz " + wartosc[typ].toString() + " podanej figury")
                when(figura){
                    1->{
                        ivInfQuizk3kolo.visibility=View.VISIBLE
                        tvInfQuizK3KoloPromien.visibility=View.VISIBLE
                        var r = (2..10).random()
                        tvInfQuizK3KoloPromien.setText(r.toString())
                        var Odp=r*r
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.setText(Odp.toString() + pi + " cm\u00B2")
                                btnInfQuizk3btn2.setText((2 * r).toString() + pi + " cm")
                                btnInfQuizk3btn3.setText(r.toString() + pi + " cm")
                                btnInfQuizk3btn4.setText(((r * r) / 2).toString() + pi + " cm\u00B2")
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.setText(r.toString() + pi  + " cm" )
                                btnInfQuizk3btn2.setText(Odp.toString() + pi + " cm\u00B2")
                                btnInfQuizk3btn3.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                                btnInfQuizk3btn4.setText((2*r).toString() + pi + " cm")
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.setText((2*r).toString() + pi + " cm")
                                btnInfQuizk3btn2.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                                btnInfQuizk3btn3.setText(Odp.toString() + pi + " cm\u00B2")
                                btnInfQuizk3btn4.setText(r.toString() + pi  + " cm" )
                                listner(AnsNr)

                            }
                            4->{
                                btnInfQuizk3btn1.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                                btnInfQuizk3btn2.setText(r.toString() + pi  + " cm" )
                                btnInfQuizk3btn3.setText((2*r).toString() + pi + " cm" )
                                btnInfQuizk3btn4.setText(Odp.toString() + pi + " cm\u00B2")
                                listner(AnsNr)
                            }
                        }
                    }
                    2->{
                        ivInfQuizk3Trojkat.visibility=View.VISIBLE
                        tvInfQuizK3TrojkatPodstawa.visibility=View.VISIBLE
                        tvInfQuizK3TrojkatWysokosc.visibility=View.VISIBLE
                        tvInfQuizK3TrojkatBok2.visibility=View.VISIBLE
                        tvInfQuizK3TrojkatBok3.visibility=View.VISIBLE
                        var h = (1..10).random()
                        var x = (0..7).random()
                        var a = parzyste[x]
                        var b = (1..10).random()
                        var c = (1..10).random()
                        tvInfQuizK3TrojkatPodstawa.setText(a.toString())
                        tvInfQuizK3TrojkatWysokosc.setText(h.toString())
                        tvInfQuizK3TrojkatBok2.setText(b.toString())
                        tvInfQuizK3TrojkatBok3.setText(c.toString())
                        var Obw = (a+b+c)
                        var Odp = (a*h)/2
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.setText(Odp.toString() + " cm\u00B2")
                                btnInfQuizk3btn2.setText((a*h).toString() + " cm")
                                btnInfQuizk3btn3.setText((Obw).toString() + " cm")
                                btnInfQuizk3btn4.setText((a+h+h+a).toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.setText((Obw).toString() + " cm")
                                btnInfQuizk3btn2.setText(Odp.toString() + " cm\u00B2")
                                btnInfQuizk3btn3.setText((a*h).toString() + " cm")
                                btnInfQuizk3btn4.setText((a+h+h+a).toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.setText((a+h+h+a).toString() + " cm\u00B2")
                                btnInfQuizk3btn2.setText((a*a).toString() + " cm")
                                btnInfQuizk3btn3.setText(Odp.toString() + " cm\u00B2")
                                btnInfQuizk3btn4.setText((Obw).toString() + " cm")
                                listner(AnsNr)
                            }
                            4->{
                                btnInfQuizk3btn1.setText((a*a).toString() + " cm")
                                btnInfQuizk3btn2.setText((Obw).toString() + " cm")
                                btnInfQuizk3btn3.setText((a+h+h+a).toString() + " cm\u00B2")
                                btnInfQuizk3btn4.setText(Odp.toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                        }
                    }
                    3->{
                        ivInfQuizk3kwadrat.visibility=View.VISIBLE
                        tvInfQuizK3KwadratRight.visibility=View.VISIBLE
                        tvInfQuizK3KwadratTop.visibility=View.VISIBLE
                        var a = (1..10).random()
                        tvInfQuizK3KwadratTop.setText(a.toString())
                        tvInfQuizK3KwadratRight.setText(a.toString())
                        var Odp = a * a
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.setText(Odp.toString() + " cm\u00B2")
                                btnInfQuizk3btn2.setText(((a*a)/2).toString()  + " cm")
                                btnInfQuizk3btn3.setText((a+a+a+a).toString()  + " cm")
                                btnInfQuizk3btn4.setText((3*a).toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.setText((3*a).toString() + " cm\u00B2")
                                btnInfQuizk3btn2.setText(Odp.toString() + " cm\u00B2")
                                btnInfQuizk3btn3.setText(((a*a)/2).toString()  + " cm")
                                btnInfQuizk3btn4.setText((a+a+a+a).toString()  + " cm")
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.setText((a+a+a+a).toString()  + " cm")
                                btnInfQuizk3btn2.setText((3*a).toString() + " cm\u00B2")
                                btnInfQuizk3btn3.setText(Odp.toString() + " cm\u00B2")
                                btnInfQuizk3btn4.setText(((a*a)/2).toString()  + " cm")
                                listner(AnsNr)
                            }
                            4->{
                                btnInfQuizk3btn1.setText(((a*a)/2).toString()  + " cm")
                                btnInfQuizk3btn2.setText((a+a+a+a).toString()  + " cm")
                                btnInfQuizk3btn3.setText((3*a).toString() + " cm\u00B2")
                                btnInfQuizk3btn4.setText(Odp.toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                        }
                    }
                    4->{
                        ivInfQuizk3prostokat.visibility=View.VISIBLE
                        tvInfQuizK3ProstokatRight.visibility=View.VISIBLE
                        tvInfQuizK3ProstokatTop.visibility=View.VISIBLE
                        var a = (6..10).random()
                        var b = (1..5).random()
                        tvInfQuizK3ProstokatTop.setText(a.toString())
                        tvInfQuizK3ProstokatRight.setText(b.toString())
                        var Odp = a * b
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.setText(Odp.toString() + " cm\u00B2")
                                btnInfQuizk3btn2.setText((a*(a+b)).toString() + " cm\u00B2")
                                btnInfQuizk3btn3.setText((a+a+b+b).toString()  + " cm")
                                btnInfQuizk3btn4.setText((a+b).toString()  + " cm")
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.setText((a+b).toString()  + " cm")
                                btnInfQuizk3btn2.setText(Odp.toString() + " cm\u00B2")
                                btnInfQuizk3btn3.setText((a*(a+b)).toString() + " cm\u00B2")
                                btnInfQuizk3btn4.setText((a+a+b+b).toString()  + " cm")
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.setText((a+a+b+b).toString()  + " cm")
                                btnInfQuizk3btn2.setText((a+b).toString()  + " cm")
                                btnInfQuizk3btn3.setText(Odp.toString() + " cm\u00B2")
                                btnInfQuizk3btn4.setText((a*(a+b)).toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                            4->{
                                btnInfQuizk3btn1.setText((a*(a+b)).toString() + " cm\u00B2")
                                btnInfQuizk3btn2.setText((a+a+b+b).toString()  + " cm")
                                btnInfQuizk3btn3.setText((a+b).toString()  + " cm")
                                btnInfQuizk3btn4.setText(Odp.toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                        }
                    }
                }
            }
            2->{
                tvInfQuizk3Question.setText("Oblicz " + wartosc[typ].toString() + " podanej figury")
                when(figura){
                    1->{
                        ivInfQuizk3kolo.visibility=View.VISIBLE
                        tvInfQuizK3KoloPromien.visibility=View.VISIBLE
                        var r = (2..10).random()
                        tvInfQuizK3KoloPromien.setText(r.toString())
                        var Odp=2*r
                        when(AnsNr){
                            1  -> {

                                btnInfQuizk3btn1.setText(Odp.toString() + pi + " cm")
                                btnInfQuizk3btn2.setText((r*r).toString() + pi + " cm\u00B2")
                                btnInfQuizk3btn3.setText(r.toString() + pi + " cm" )
                                btnInfQuizk3btn4.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.setText(r.toString() + pi  + " cm" )
                                btnInfQuizk3btn2.setText(Odp.toString() + pi + " cm")
                                btnInfQuizk3btn3.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                                btnInfQuizk3btn4.setText((r*r).toString() + pi + " cm\u00B2")
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.setText((r*r).toString() + pi + " cm\u00B2")
                                btnInfQuizk3btn2.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                                btnInfQuizk3btn3.setText(Odp.toString() + pi + " cm")
                                btnInfQuizk3btn4.setText(r.toString() + pi  + " cm" )
                                listner(AnsNr)

                            }
                            4->{
                                btnInfQuizk3btn1.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                                btnInfQuizk3btn2.setText(r.toString() + pi  + " cm" )
                                btnInfQuizk3btn3.setText((r*r).toString() + pi + " cm\u00B2" )
                                btnInfQuizk3btn4.setText(Odp.toString() + pi + " cm")
                                listner(AnsNr)
                            }
                        }
                    }
                    2->{
                        ivInfQuizk3Trojkat.visibility=View.VISIBLE
                        tvInfQuizK3TrojkatPodstawa.visibility=View.VISIBLE
                        tvInfQuizK3TrojkatWysokosc.visibility=View.VISIBLE
                        tvInfQuizK3TrojkatBok2.visibility=View.VISIBLE
                        tvInfQuizK3TrojkatBok3.visibility=View.VISIBLE
                        var h = (1..10).random()
                        var x = (0..7).random()
                        var a = parzyste[x]
                        var b = (1..10).random()
                        var c = (1..10).random()
                        tvInfQuizK3TrojkatPodstawa.setText(a.toString())
                        tvInfQuizK3TrojkatWysokosc.setText(h.toString())
                        tvInfQuizK3TrojkatBok2.setText(b.toString())
                        tvInfQuizK3TrojkatBok3.setText(c.toString())
                        var Obw = (a+b+c)
                        var Odp = (a*h)/2
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.setText(Obw.toString() + " cm")
                                btnInfQuizk3btn2.setText((a*h).toString() + " cm")
                                btnInfQuizk3btn3.setText(Odp.toString() + " cm\u00B2")
                                btnInfQuizk3btn4.setText((a+h+h+a).toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.setText(Odp.toString() + " cm\u00B2")
                                btnInfQuizk3btn2.setText(Obw.toString() + " cm")
                                btnInfQuizk3btn3.setText((a+a+a).toString() + " cm")
                                btnInfQuizk3btn4.setText((a+h+h+a).toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.setText((a+h+h+a).toString() + " cm\u00B2")
                                btnInfQuizk3btn2.setText((a*a).toString() + " cm")
                                btnInfQuizk3btn3.setText(Obw.toString() + " cm")
                                btnInfQuizk3btn4.setText(Odp.toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                            4->{
                                btnInfQuizk3btn1.setText((a*a).toString() + " cm")
                                btnInfQuizk3btn2.setText(Odp.toString() + " cm\u00B2")
                                btnInfQuizk3btn3.setText((a+h+h+a).toString() + " cm")
                                btnInfQuizk3btn4.setText(Obw.toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                        }
                    }
                    3->{
                        ivInfQuizk3kwadrat.visibility=View.VISIBLE
                        tvInfQuizK3KwadratRight.visibility=View.VISIBLE
                        tvInfQuizK3KwadratTop.visibility=View.VISIBLE
                        var a = (1..10).random()
                        tvInfQuizK3KwadratTop.setText(a.toString())
                        tvInfQuizK3KwadratRight.setText(a.toString())
                        var Odp = a + a + a + a
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.setText(Odp.toString() + " cm")
                                btnInfQuizk3btn2.setText(((a*a)/2).toString()  + " cm")
                                btnInfQuizk3btn3.setText((a*a).toString() + " cm\u00B2")
                                btnInfQuizk3btn4.setText((3*a).toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.setText((3*a).toString() + " cm\u00B2")
                                btnInfQuizk3btn2.setText(Odp.toString() + " cm")
                                btnInfQuizk3btn3.setText(((a*a)/2).toString()  + " cm")
                                btnInfQuizk3btn4.setText((a*a).toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.setText((a*a).toString() + " cm\u00B2")
                                btnInfQuizk3btn2.setText((3*a).toString() + " cm\u00B2")
                                btnInfQuizk3btn3.setText(Odp.toString() + " cm")
                                btnInfQuizk3btn4.setText(((a*a)/2).toString()  + " cm")
                                listner(AnsNr)
                            }
                            4->{
                                btnInfQuizk3btn1.setText(((a*a)/2).toString()  + " cm")
                                btnInfQuizk3btn2.setText((a*a).toString() + " cm\u00B2")
                                btnInfQuizk3btn3.setText((3*a).toString() + " cm\u00B2")
                                btnInfQuizk3btn4.setText(Odp.toString() + " cm")
                                listner(AnsNr)
                            }
                        }
                    }
                    4->{
                        ivInfQuizk3prostokat.visibility=View.VISIBLE
                        tvInfQuizK3ProstokatRight.visibility=View.VISIBLE
                        tvInfQuizK3ProstokatTop.visibility=View.VISIBLE
                        var a = (6..10).random()
                        var b = (1..5).random()
                        tvInfQuizK3ProstokatTop.setText(a.toString())
                        tvInfQuizK3ProstokatRight.setText(b.toString())
                        var Odp = a + b + a + b
                        when(AnsNr){
                            1  -> {
                                btnInfQuizk3btn1.setText(Odp.toString() + " cm")
                                btnInfQuizk3btn2.setText((a*(a+b)).toString() + " cm\u00B2")
                                btnInfQuizk3btn3.setText((a*b).toString() + " cm\u00B2")
                                btnInfQuizk3btn4.setText((a+b).toString()  + " cm")
                                listner(AnsNr)
                            }
                            2->{
                                btnInfQuizk3btn1.setText((a+b).toString()  + " cm")
                                btnInfQuizk3btn2.setText(Odp.toString() + " cm")
                                btnInfQuizk3btn3.setText((a*(a+b)).toString() + " cm\u00B2")
                                btnInfQuizk3btn4.setText((a*b).toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                            3-> {
                                btnInfQuizk3btn1.setText((a*b).toString() + " cm\u00B2")
                                btnInfQuizk3btn2.setText((a+b).toString()  + " cm")
                                btnInfQuizk3btn3.setText(Odp.toString() + " cm")
                                btnInfQuizk3btn4.setText((a*(a+b)).toString() + " cm\u00B2")
                                listner(AnsNr)
                            }
                            4->{
                                btnInfQuizk3btn1.setText((a*(a+b)).toString() + " cm\u00B2")
                                btnInfQuizk3btn2.setText((a*b).toString() + " cm\u00B2")
                                btnInfQuizk3btn3.setText((a+b).toString()  + " cm")
                                btnInfQuizk3btn4.setText(Odp.toString() + " cm")
                                listner(AnsNr)
                            }
                        }
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
