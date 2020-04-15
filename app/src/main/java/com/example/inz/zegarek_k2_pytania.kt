package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_zegarek_k2_pytania.*

class zegarek_k2_pytania : AppCompatActivity() {

    var correctAnswersOverall = 0
    var badAnswersOverall = 0
    var minmap = mapOf(1 to "05", 2 to "10", 3 to "15", 4 to "20", 5 to "25", 6 to "30", 7 to "35", 8 to "40", 9 to "45",
        10 to "50", 11 to "55" , 12 to "00" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zegarek_k2_pytania)
        tvZegarPytaniak2Question.setText("Która jest godzina?")
        tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
        losowanie()
    }
    fun losowanie(){
        btnZegarPytaniak2btn1.setBackgroundResource(R.drawable.default_button)
        btnZegarPytaniak2btn2.setBackgroundResource(R.drawable.default_button)
        btnZegarPytaniak2btn3.setBackgroundResource(R.drawable.default_button)
        btnZegarPytaniak2btn4.setBackgroundResource(R.drawable.default_button)
        ivGodzina1k2.visibility=View.GONE
        ivGodzina2k2.visibility=View.GONE
        ivGodzina3k2.visibility=View.GONE
        ivGodzina4k2.visibility=View.GONE
        ivGodzina5k2.visibility=View.GONE
        ivGodzina6k2.visibility=View.GONE
        ivGodzina7k2.visibility=View.GONE
        ivGodzina8k2.visibility=View.GONE
        ivGodzina9k2.visibility=View.GONE
        ivGodzina10k2.visibility=View.GONE
        ivGodzina11k2.visibility=View.GONE
        ivGodzina12k2.visibility=View.GONE
        ivMinuta1k2.visibility=View.GONE
        ivMinuta2k2.visibility=View.GONE
        ivMinuta3k2.visibility=View.GONE
        ivMinuta4k2.visibility=View.GONE
        ivMinuta5k2.visibility=View.GONE
        ivMinuta6k2.visibility=View.GONE
        ivMinuta7k2.visibility=View.GONE
        ivMinuta8k2.visibility=View.GONE
        ivMinuta9k2.visibility=View.GONE
        ivMinuta10k2.visibility=View.GONE
        ivMinuta11k2.visibility=View.GONE
        ivMinuta12k2.visibility=View.GONE

        var zegar = (1..1).random()
        when(zegar){
            1->git()
        }

    }
    fun git(){
        ivZegarPytanie2_k2.visibility = View.VISIBLE
        var AnsNr = (1..4).random()
        var godzinaans = (1..24).random()
        var minutyans = (1..12).random()
        godzinadisplayer(godzinaans)
        minutadisplayer(minutyans)
        when (AnsNr){
            1-> {

                btnZegarPytaniak2btn1.setText(godzinaans.toString() + ":" + minmap[minutyans])
                var godzina = (1..24).random()
                var minuty = (1..12).random()
                btnZegarPytaniak2btn2.setText(godzina.toString() + ":" + minmap[minuty])
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnZegarPytaniak2btn3.setText(godzina.toString() + ":" + minmap[minuty])
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnZegarPytaniak2btn4.setText(godzina.toString() + ":" + minmap[minuty])
                listner(AnsNr)
            }
            2-> {
                var godzina = (1..24).random()
                var minuty = (1..12).random()
                btnZegarPytaniak2btn1.setText(godzina.toString() + ":" + minmap[minuty])
                btnZegarPytaniak2btn2.setText(godzinaans.toString() + ":" + minmap[minutyans])
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnZegarPytaniak2btn3.setText(godzina.toString() + ":" + minmap[minuty])
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnZegarPytaniak2btn4.setText(godzina.toString() + ":" + minmap[minuty])
                listner(AnsNr)
            }
            3-> {
                var godzina = (1..24).random()
                var minuty = (1..12).random()
                btnZegarPytaniak2btn1.setText(godzina.toString() + ":" + minmap[minuty])
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnZegarPytaniak2btn2.setText(godzina.toString() + ":" + minmap[minuty])
                btnZegarPytaniak2btn3.setText(godzinaans.toString() + ":" + minmap[minutyans])
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnZegarPytaniak2btn4.setText(godzina.toString() + ":" + minmap[minuty])
                listner(AnsNr)
            }
            4->{
                var godzina = (1..24).random()
                var minuty = (1..12).random()
                btnZegarPytaniak2btn1.setText(godzina.toString() + ":" + minmap[minuty])
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnZegarPytaniak2btn2.setText(godzina.toString() + ":" + minmap[minuty])
                godzina = (1..24).random()
                minuty = (1..12).random()
                btnZegarPytaniak2btn3.setText(godzina.toString() + ":" + minmap[minuty])
                btnZegarPytaniak2btn4.setText(godzinaans.toString() + ":" + minmap[minutyans])
                listner(AnsNr)
            }
        }

    }
    fun listner(AnsNr: Int){
        when (AnsNr){
            1->{
                btnZegarPytaniak2btn1.setOnClickListener {
                    correctAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                    losowanie()
                }
                btnZegarPytaniak2btn2.setOnClickListener {
                    btnZegarPytaniak2btn2.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

                }
                btnZegarPytaniak2btn3.setOnClickListener {
                    btnZegarPytaniak2btn3.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

                }
                btnZegarPytaniak2btn4.setOnClickListener {
                    btnZegarPytaniak2btn4.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
            }
            2->{
                btnZegarPytaniak2btn1.setOnClickListener {
                    btnZegarPytaniak2btn1.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
                btnZegarPytaniak2btn2.setOnClickListener {
                    correctAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\n Złe odpowiedzi: " + badAnswersOverall.toString())
                    losowanie()
                }
                btnZegarPytaniak2btn3.setOnClickListener {
                    btnZegarPytaniak2btn3.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
                btnZegarPytaniak2btn4.setOnClickListener {
                    btnZegarPytaniak2btn4.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
            }
            3->{
                btnZegarPytaniak2btn1.setOnClickListener {
                    btnZegarPytaniak2btn1.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
                btnZegarPytaniak2btn2.setOnClickListener {
                    btnZegarPytaniak2btn2.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
                btnZegarPytaniak2btn3.setOnClickListener {
                    correctAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                    losowanie()
                }
                btnZegarPytaniak2btn4.setOnClickListener {
                    btnZegarPytaniak2btn4.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
            }
            4->{
                btnZegarPytaniak2btn1.setOnClickListener {
                    btnZegarPytaniak2btn1.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

                }
                btnZegarPytaniak2btn2.setOnClickListener {
                    btnZegarPytaniak2btn2.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

                }
                btnZegarPytaniak2btn3.setOnClickListener {
                    btnZegarPytaniak2btn3.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

                }
                btnZegarPytaniak2btn4.setOnClickListener {
                    correctAnswersOverall++
                    tvZegarPytaniak2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                    losowanie()
                }
            }
        }
    }

    fun godzinadisplayer(godzina:Int){
        when(godzina){
            1,13->ivGodzina1k2.visibility=View.VISIBLE
            2,14->ivGodzina2k2.visibility=View.VISIBLE
            3,15->ivGodzina3k2.visibility=View.VISIBLE
            4,16->ivGodzina4k2.visibility=View.VISIBLE
            5,17->ivGodzina5k2.visibility=View.VISIBLE
            6,18->ivGodzina6k2.visibility=View.VISIBLE
            7,19->ivGodzina7k2.visibility=View.VISIBLE
            8,20->ivGodzina8k2.visibility=View.VISIBLE
            9,21->ivGodzina9k2.visibility=View.VISIBLE
            10,22->ivGodzina10k2.visibility=View.VISIBLE
            11,23->ivGodzina11k2.visibility=View.VISIBLE
            12,24->ivGodzina12k2.visibility=View.VISIBLE
        }
    }

    fun minutadisplayer(minuta:Int){
        when(minuta){
            1->ivMinuta1k2.visibility=View.VISIBLE
            2->ivMinuta2k2.visibility=View.VISIBLE
            3->ivMinuta3k2.visibility=View.VISIBLE
            4->ivMinuta4k2.visibility=View.VISIBLE
            5->ivMinuta5k2.visibility=View.VISIBLE
            6->ivMinuta6k2.visibility=View.VISIBLE
            7->ivMinuta7k2.visibility=View.VISIBLE
            8->ivMinuta8k2.visibility=View.VISIBLE
            9->ivMinuta9k2.visibility=View.VISIBLE
            10->ivMinuta10k2.visibility=View.VISIBLE
            11->ivMinuta11k2.visibility=View.VISIBLE
            12->ivMinuta12k2.visibility=View.VISIBLE

        }
    }
}
