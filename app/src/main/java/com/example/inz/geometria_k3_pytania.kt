package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_geometria_k3_pytania.*

class geometria_k3_pytania : AppCompatActivity() {

    var correctAnswersOverall = 0
    var badAnswersOverall = 0
    val figury = mapOf(1 to "koło",2 to "trójkąt", 3 to "kwadrat", 4 to "prostokąt")
    val wartosc = mapOf(1 to "pole", 2 to "obwód")
    val parzyste = arrayListOf(2,4,6,8,10,12,14,16)
    val pi = "\u03C0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geometria_k3_pytania)
        ivGeoQuizk3kolo.visibility = View.GONE
        ivGeoQuizk3kwadrat.visibility = View.GONE
        ivGeoQuizk3prostokat.visibility = View.GONE
        ivGeoQuizk3trojkat.visibility = View.GONE
        tvGeoQuizK3KoloPromien.visibility = View.GONE
        tvGeoQuizK3KwadratRight.visibility = View.GONE
        tvGeoQuizK3KwadratTop.visibility = View.GONE
        tvGeoQuizK3ProstokatRight.visibility = View.GONE
        tvGeoQuizK3ProstokatTop.visibility = View.GONE
        tvGeoQuizK3TrojkatPodstawa.visibility = View.GONE
        tvGeoQuizK3TrojkatWysokosc.visibility = View.GONE
        tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
        losowanie()
    }
    fun losowanie(){
        btnGeoQuizk3btn1.setBackgroundResource(R.drawable.default_button)
        btnGeoQuizk3btn2.setBackgroundResource(R.drawable.default_button)
        btnGeoQuizk3btn3.setBackgroundResource(R.drawable.default_button)
        btnGeoQuizk3btn4.setBackgroundResource(R.drawable.default_button)
        btnGeoQuizk3btn1.textSize=resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnGeoQuizk3btn2.textSize=resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnGeoQuizk3btn3.textSize=resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnGeoQuizk3btn4.textSize=resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        tvGeoQuizk3Question.textSize=resources.getDimension(R.dimen.font_size_dni_miesiace_Qyes)
        var figura = (1..4).random()
        var AnsNr = (1..4).random()
        var typ = (1..2).random()
        //var typ = 1
        if (typ == 1) { //pole
            tvGeoQuizk3Question.setText("Oblicz " + wartosc[typ].toString() + " podanej figury")
            if(figura == 1){    //kolo
                ivGeoQuizk3kolo.visibility=View.VISIBLE
                tvGeoQuizK3KoloPromien.visibility=View.VISIBLE
                var r = (2..10).random()
                tvGeoQuizK3KoloPromien.setText(r.toString())
                var Odp = r * r
                if (AnsNr == 1) {
                    btnGeoQuizk3btn1.setText(Odp.toString() + pi + " cm\u00B2")
                    btnGeoQuizk3btn2.setText((2*r).toString() + pi + " cm")
                    btnGeoQuizk3btn3.setText(r.toString() + pi + " cm" )
                    btnGeoQuizk3btn4.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                    listner(AnsNr)
                } else if (AnsNr == 2){
                    btnGeoQuizk3btn1.setText(r.toString() + pi  + " cm" )
                    btnGeoQuizk3btn2.setText(Odp.toString() + pi + " cm\u00B2")
                    btnGeoQuizk3btn3.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                    btnGeoQuizk3btn4.setText((2*r).toString() + pi + " cm")
                    listner(AnsNr)
                } else if (AnsNr==3){
                    btnGeoQuizk3btn1.setText((2*r).toString() + pi + " cm")
                    btnGeoQuizk3btn2.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                    btnGeoQuizk3btn3.setText(Odp.toString() + pi + " cm\u00B2")
                    btnGeoQuizk3btn4.setText(r.toString() + pi  + " cm" )
                    listner(AnsNr)
                }else if (AnsNr==4){
                    btnGeoQuizk3btn1.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                    btnGeoQuizk3btn2.setText(r.toString() + pi  + " cm" )
                    btnGeoQuizk3btn3.setText((2*r).toString() + pi + " cm" )
                    btnGeoQuizk3btn4.setText(Odp.toString() + pi + " cm\u00B2")
                    listner(AnsNr)
                }
            }else if (figura == 2){
                ivGeoQuizk3trojkat.visibility=View.VISIBLE
                tvGeoQuizK3TrojkatPodstawa.visibility=View.VISIBLE
                tvGeoQuizK3TrojkatWysokosc.visibility=View.VISIBLE
                var h = (1..10).random()
                var x = (0..7).random()
                var a = parzyste[x]
                tvGeoQuizK3TrojkatPodstawa.setText(a.toString())
                tvGeoQuizK3TrojkatWysokosc.setText(h.toString())
                var Odp = (a*h)/2
                if (AnsNr==1){
                    btnGeoQuizk3btn1.setText(Odp.toString() + " cm\u00B2")
                    btnGeoQuizk3btn2.setText((a*h).toString() + " cm")
                    btnGeoQuizk3btn3.setText((a+a+a).toString() + " cm")
                    btnGeoQuizk3btn4.setText((a+h+h+a).toString() + " cm\u00B2")
                    listner(AnsNr)
                }else if(AnsNr==2){
                    btnGeoQuizk3btn1.setText((a+a+a).toString() + " cm")
                    btnGeoQuizk3btn2.setText(Odp.toString() + " cm\u00B2")
                    btnGeoQuizk3btn3.setText((a+a+a).toString() + " cm")
                    btnGeoQuizk3btn4.setText((a+h+h+a).toString() + " cm\u00B2")
                    listner(AnsNr)
                }else if(AnsNr==3) {
                    btnGeoQuizk3btn1.setText((a+h+h+a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn2.setText((a*a).toString() + " cm")
                    btnGeoQuizk3btn3.setText(Odp.toString() + " cm\u00B2")
                    btnGeoQuizk3btn4.setText((a+a+a).toString() + " cm")
                    listner(AnsNr)
                }else if (AnsNr==4){
                    btnGeoQuizk3btn1.setText((a*a).toString() + " cm")
                    btnGeoQuizk3btn2.setText((a+a+a).toString() + " cm")
                    btnGeoQuizk3btn3.setText((a+h+h+a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn4.setText(Odp.toString() + " cm\u00B2")
                    listner(AnsNr)
                }
            }else if (figura == 3) {
                ivGeoQuizk3kwadrat.visibility=View.VISIBLE
                tvGeoQuizK3KwadratRight.visibility=View.VISIBLE
                tvGeoQuizK3KwadratTop.visibility=View.VISIBLE
                var a = (1..10).random()
                tvGeoQuizK3KwadratTop.setText(a.toString())
                tvGeoQuizK3KwadratRight.setText(a.toString())
                var Odp = a * a
                if (AnsNr==1){
                    btnGeoQuizk3btn1.setText(Odp.toString() + " cm\u00B2")
                    btnGeoQuizk3btn2.setText(((a*a)/2).toString()  + " cm")
                    btnGeoQuizk3btn3.setText((a+a+a+a).toString()  + " cm")
                    btnGeoQuizk3btn4.setText((3*a).toString() + " cm\u00B2")
                    listner(AnsNr)
                }else if(AnsNr==2){
                    btnGeoQuizk3btn1.setText((3*a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn2.setText(Odp.toString() + " cm\u00B2")
                    btnGeoQuizk3btn3.setText(((a*a)/2).toString()  + " cm")
                    btnGeoQuizk3btn4.setText((a+a+a+a).toString()  + " cm")
                    listner(AnsNr)
                }else if(AnsNr==3) {
                    btnGeoQuizk3btn1.setText((a+a+a+a).toString()  + " cm")
                    btnGeoQuizk3btn2.setText((3*a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn3.setText(Odp.toString() + " cm\u00B2")
                    btnGeoQuizk3btn4.setText(((a*a)/2).toString()  + " cm")
                    listner(AnsNr)
                }else if(AnsNr==4){
                    btnGeoQuizk3btn1.setText(((a*a)/2).toString()  + " cm")
                    btnGeoQuizk3btn2.setText((a+a+a+a).toString()  + " cm")
                    btnGeoQuizk3btn3.setText((3*a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn4.setText(Odp.toString() + " cm\u00B2")
                    listner(AnsNr)
                }
            }else{
                ivGeoQuizk3prostokat.visibility=View.VISIBLE
                tvGeoQuizK3ProstokatRight.visibility=View.VISIBLE
                tvGeoQuizK3ProstokatTop.visibility=View.VISIBLE
                var a = (1..10).random()
                var b = (1..10).random()
                tvGeoQuizK3ProstokatTop.setText(a.toString())
                tvGeoQuizK3ProstokatRight.setText(b.toString())
                var Odp = a * b
                if (AnsNr==1){
                    btnGeoQuizk3btn1.setText(Odp.toString() + " cm\u00B2")
                    btnGeoQuizk3btn2.setText((a*(a+b)).toString() + " cm\u00B2")
                    btnGeoQuizk3btn3.setText((a+a+b+b).toString()  + " cm")
                    btnGeoQuizk3btn4.setText((a+b).toString()  + " cm")
                    listner(AnsNr)
                }else if(AnsNr==2){
                    btnGeoQuizk3btn1.setText((a+b).toString()  + " cm")
                    btnGeoQuizk3btn2.setText(Odp.toString() + " cm\u00B2")
                    btnGeoQuizk3btn3.setText((a*(a+b)).toString() + " cm\u00B2")
                    btnGeoQuizk3btn4.setText((a+a+b+b).toString()  + " cm")
                    listner(AnsNr)
                }else if(AnsNr==3) {
                    btnGeoQuizk3btn1.setText((a+a+b+b).toString()  + " cm")
                    btnGeoQuizk3btn2.setText((a+b).toString()  + " cm")
                    btnGeoQuizk3btn3.setText(Odp.toString() + " cm\u00B2")
                    btnGeoQuizk3btn4.setText((a*(a+b)).toString() + " cm\u00B2")
                    listner(AnsNr)
                }else if (AnsNr==4){
                    btnGeoQuizk3btn1.setText((a*(a+b)).toString() + " cm\u00B2")
                    btnGeoQuizk3btn2.setText((a+a+b+b).toString()  + " cm")
                    btnGeoQuizk3btn3.setText((a+b).toString()  + " cm")
                    btnGeoQuizk3btn4.setText(Odp.toString() + " cm\u00B2")
                    listner(AnsNr)
                }
            }
        }else{  // obwód
            tvGeoQuizk3Question.setText("Oblicz " + wartosc[typ].toString() + " podanej figury")
            if(figura == 1){
                ivGeoQuizk3kolo.visibility=View.VISIBLE
                tvGeoQuizK3KoloPromien.visibility=View.VISIBLE
                var r = (2..10).random()
                tvGeoQuizK3KoloPromien.setText(r.toString())
                var Odp = 2 * r
                if (AnsNr == 1) {
                    btnGeoQuizk3btn1.setText(Odp.toString() + pi + " cm")
                    btnGeoQuizk3btn2.setText((r*r).toString() + pi + " cm\u00B2")
                    btnGeoQuizk3btn3.setText(r.toString() + pi + " cm" )
                    btnGeoQuizk3btn4.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                    listner(AnsNr)
                } else if (AnsNr == 2){
                    btnGeoQuizk3btn1.setText(r.toString() + pi  + " cm" )
                    btnGeoQuizk3btn2.setText(Odp.toString() + pi + " cm")
                    btnGeoQuizk3btn3.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                    btnGeoQuizk3btn4.setText((r*r).toString() + pi + " cm\u00B2")
                    listner(AnsNr)
                } else if (AnsNr==3){
                    btnGeoQuizk3btn1.setText((r*r).toString() + pi + " cm\u00B2")
                    btnGeoQuizk3btn2.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                    btnGeoQuizk3btn3.setText(Odp.toString() + pi + " cm")
                    btnGeoQuizk3btn4.setText(r.toString() + pi  + " cm" )
                    listner(AnsNr)
                }else if (AnsNr==4){
                    btnGeoQuizk3btn1.setText(((r*r)/2).toString() + pi + " cm\u00B2")
                    btnGeoQuizk3btn2.setText(r.toString() + pi  + " cm" )
                    btnGeoQuizk3btn3.setText((r*r).toString() + pi + " cm\u00B2" )
                    btnGeoQuizk3btn4.setText(Odp.toString() + pi + " cm")
                    listner(AnsNr)
                }
            }else if (figura == 2){
                ivGeoQuizk3trojkat.visibility=View.VISIBLE
                tvGeoQuizK3TrojkatPodstawa.visibility=View.VISIBLE
                tvGeoQuizK3TrojkatWysokosc.visibility=View.VISIBLE
                var h = (1..10).random()
                var x = (0..7).random()
                var a = parzyste[x]
                tvGeoQuizK3TrojkatPodstawa.setText(a.toString())
                tvGeoQuizK3TrojkatWysokosc.setText(h.toString())
                var Odp = (a*h)/2
                if (AnsNr==1){  // trójkąt do naprawy
                    btnGeoQuizk3btn1.setText(Odp.toString() + " cm\u00B2")
                    btnGeoQuizk3btn2.setText((a*h).toString() + " cm")
                    btnGeoQuizk3btn3.setText((a+a+a).toString() + " cm")
                    btnGeoQuizk3btn4.setText((a+h+h+a).toString() + " cm\u00B2")
                    listner(AnsNr)
                }else if(AnsNr==2){
                    btnGeoQuizk3btn1.setText((a+a+a).toString() + " cm")
                    btnGeoQuizk3btn2.setText(Odp.toString() + " cm\u00B2")
                    btnGeoQuizk3btn3.setText((a+a+a).toString() + " cm")
                    btnGeoQuizk3btn4.setText((a+h+h+a).toString() + " cm\u00B2")
                    listner(AnsNr)
                }else if(AnsNr==3) {
                    btnGeoQuizk3btn1.setText((a+h+h+a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn2.setText((a*a).toString() + " cm")
                    btnGeoQuizk3btn3.setText(Odp.toString() + " cm\u00B2")
                    btnGeoQuizk3btn4.setText((a+a+a).toString() + " cm")
                    listner(AnsNr)
                }else if (AnsNr==4){
                    btnGeoQuizk3btn1.setText((a*a).toString() + " cm")
                    btnGeoQuizk3btn2.setText((a+a+a).toString() + " cm")
                    btnGeoQuizk3btn3.setText((a+h+h+a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn4.setText(Odp.toString() + " cm\u00B2")
                    listner(AnsNr)
                }
            }else if (figura == 3) {
                ivGeoQuizk3kwadrat.visibility=View.VISIBLE
                tvGeoQuizK3KwadratRight.visibility=View.VISIBLE
                tvGeoQuizK3KwadratTop.visibility=View.VISIBLE
                var a = (1..10).random()
                tvGeoQuizK3KwadratTop.setText(a.toString())
                tvGeoQuizK3KwadratRight.setText(a.toString())
                var Odp = a + a + a + a
                if (AnsNr==1){
                    btnGeoQuizk3btn1.setText(Odp.toString() + " cm")
                    btnGeoQuizk3btn2.setText(((a*a)/2).toString()  + " cm")
                    btnGeoQuizk3btn3.setText((a*a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn4.setText((3*a).toString() + " cm\u00B2")
                    listner(AnsNr)
                }else if(AnsNr==2){
                    btnGeoQuizk3btn1.setText((3*a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn2.setText(Odp.toString() + " cm")
                    btnGeoQuizk3btn3.setText(((a*a)/2).toString()  + " cm")
                    btnGeoQuizk3btn4.setText((a*a).toString() + " cm\u00B2")
                    listner(AnsNr)
                }else if(AnsNr==3) {
                    btnGeoQuizk3btn1.setText((a*a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn2.setText((3*a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn3.setText(Odp.toString() + " cm")
                    btnGeoQuizk3btn4.setText(((a*a)/2).toString()  + " cm")
                    listner(AnsNr)
                }else if(AnsNr==4){
                    btnGeoQuizk3btn1.setText(((a*a)/2).toString()  + " cm")
                    btnGeoQuizk3btn2.setText((a*a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn3.setText((3*a).toString() + " cm\u00B2")
                    btnGeoQuizk3btn4.setText(Odp.toString() + " cm")
                    listner(AnsNr)
                }
            }else{
                ivGeoQuizk3prostokat.visibility=View.VISIBLE
                tvGeoQuizK3ProstokatRight.visibility=View.VISIBLE
                tvGeoQuizK3ProstokatTop.visibility=View.VISIBLE
                var a = (1..10).random()
                var b = (1..10).random()
                tvGeoQuizK3ProstokatTop.setText(a.toString())
                tvGeoQuizK3ProstokatRight.setText(b.toString())
                var Odp = a + a + b + b
                if (AnsNr==1){
                    btnGeoQuizk3btn1.setText(Odp.toString() + " cm")
                    btnGeoQuizk3btn2.setText((a*(a+b)).toString() + " cm\u00B2")
                    btnGeoQuizk3btn3.setText((a*b).toString() + " cm\u00B2")
                    btnGeoQuizk3btn4.setText((a+b).toString()  + " cm")
                    listner(AnsNr)
                }else if(AnsNr==2){
                    btnGeoQuizk3btn1.setText((a+b).toString()  + " cm")
                    btnGeoQuizk3btn2.setText(Odp.toString() + " cm")
                    btnGeoQuizk3btn3.setText((a*(a+b)).toString() + " cm\u00B2")
                    btnGeoQuizk3btn4.setText((a*b).toString() + " cm\u00B2")
                    listner(AnsNr)
                }else if(AnsNr==3) {
                    btnGeoQuizk3btn1.setText((a*b).toString() + " cm\u00B2")
                    btnGeoQuizk3btn2.setText((a+b).toString()  + " cm")
                    btnGeoQuizk3btn3.setText(Odp.toString() + " cm")
                    btnGeoQuizk3btn4.setText((a*(a+b)).toString() + " cm\u00B2")
                    listner(AnsNr)
                }else if (AnsNr==4){
                    btnGeoQuizk3btn1.setText((a*(a+b)).toString() + " cm\u00B2")
                    btnGeoQuizk3btn2.setText((a*b).toString() + " cm\u00B2")
                    btnGeoQuizk3btn3.setText((a+b).toString()  + " cm")
                    btnGeoQuizk3btn4.setText(Odp.toString() + " cm")
                    listner(AnsNr)
                }
            }
        }

    }
    fun listner(AnsNr: Int) {
        if (AnsNr == 1) {
            btnGeoQuizk3btn1.setOnClickListener {
                correctAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                ivGeoQuizk3kolo.visibility = View.GONE
                ivGeoQuizk3kwadrat.visibility = View.GONE
                ivGeoQuizk3prostokat.visibility = View.GONE
                ivGeoQuizk3trojkat.visibility = View.GONE
                tvGeoQuizK3KoloPromien.visibility = View.GONE
                tvGeoQuizK3KwadratRight.visibility = View.GONE
                tvGeoQuizK3KwadratTop.visibility = View.GONE
                tvGeoQuizK3ProstokatRight.visibility = View.GONE
                tvGeoQuizK3ProstokatTop.visibility = View.GONE
                tvGeoQuizK3TrojkatPodstawa.visibility = View.GONE
                tvGeoQuizK3TrojkatWysokosc.visibility = View.GONE
                losowanie()
            }
            btnGeoQuizk3btn2.setOnClickListener {
                btnGeoQuizk3btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk3btn3.setOnClickListener {
                btnGeoQuizk3btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk3btn4.setOnClickListener {
                btnGeoQuizk3btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else if (AnsNr == 2) {
            btnGeoQuizk3btn1.setOnClickListener {
                btnGeoQuizk3btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk3btn2.setOnClickListener {
                correctAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\n Złe odpowiedzi: " + badAnswersOverall.toString())
                ivGeoQuizk3kolo.visibility = View.GONE
                ivGeoQuizk3kwadrat.visibility = View.GONE
                ivGeoQuizk3prostokat.visibility = View.GONE
                ivGeoQuizk3trojkat.visibility = View.GONE
                tvGeoQuizK3KoloPromien.visibility = View.GONE
                tvGeoQuizK3KwadratRight.visibility = View.GONE
                tvGeoQuizK3KwadratTop.visibility = View.GONE
                tvGeoQuizK3ProstokatRight.visibility = View.GONE
                tvGeoQuizK3ProstokatTop.visibility = View.GONE
                tvGeoQuizK3TrojkatPodstawa.visibility = View.GONE
                tvGeoQuizK3TrojkatWysokosc.visibility = View.GONE
                losowanie()
            }
            btnGeoQuizk3btn3.setOnClickListener {
                btnGeoQuizk3btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk3btn4.setOnClickListener {
                btnGeoQuizk3btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else if (AnsNr == 3) {
            btnGeoQuizk3btn1.setOnClickListener {
                btnGeoQuizk3btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk3btn2.setOnClickListener {
                btnGeoQuizk3btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk3btn3.setOnClickListener {
                correctAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                ivGeoQuizk3kolo.visibility = View.GONE
                ivGeoQuizk3kwadrat.visibility = View.GONE
                ivGeoQuizk3prostokat.visibility = View.GONE
                ivGeoQuizk3trojkat.visibility = View.GONE
                tvGeoQuizK3KoloPromien.visibility = View.GONE
                tvGeoQuizK3KwadratRight.visibility = View.GONE
                tvGeoQuizK3KwadratTop.visibility = View.GONE
                tvGeoQuizK3ProstokatRight.visibility = View.GONE
                tvGeoQuizK3ProstokatTop.visibility = View.GONE
                tvGeoQuizK3TrojkatPodstawa.visibility = View.GONE
                tvGeoQuizK3TrojkatWysokosc.visibility = View.GONE
                losowanie()
            }
            btnGeoQuizk3btn4.setOnClickListener {
                btnGeoQuizk3btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else {
            btnGeoQuizk3btn1.setOnClickListener {
                btnGeoQuizk3btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk3btn2.setOnClickListener {
                btnGeoQuizk3btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk3btn3.setOnClickListener {
                btnGeoQuizk3btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk3btn4.setOnClickListener {
                correctAnswersOverall++
                tvGeoQuizk3Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                ivGeoQuizk3kolo.visibility = View.GONE
                ivGeoQuizk3kwadrat.visibility = View.GONE
                ivGeoQuizk3prostokat.visibility = View.GONE
                ivGeoQuizk3trojkat.visibility = View.GONE
                tvGeoQuizK3KoloPromien.visibility = View.GONE
                tvGeoQuizK3KwadratRight.visibility = View.GONE
                tvGeoQuizK3KwadratTop.visibility = View.GONE
                tvGeoQuizK3ProstokatRight.visibility = View.GONE
                tvGeoQuizK3ProstokatTop.visibility = View.GONE
                tvGeoQuizK3TrojkatPodstawa.visibility = View.GONE
                tvGeoQuizK3TrojkatWysokosc.visibility = View.GONE
                losowanie()
            }
        }

    }

}
