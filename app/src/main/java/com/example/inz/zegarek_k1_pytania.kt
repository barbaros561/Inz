package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_zegarek_k1_pytania.*

class zegarek_k1_pytania : AppCompatActivity() {

    var correctAnswersOverall = 0
    var badAnswersOverall = 0
    var minmap = mapOf(1 to "05", 2 to "10", 3 to "15", 4 to "20", 5 to "25", 6 to "30", 7 to "35", 8 to "40", 9 to "45",
        10 to "50", 11 to "55" , 12 to "00" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zegarek_k1_pytania)
        tvZegarPytaniak1Question.setText("Która jest godzina?")
        tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
        losowanie()
    }
    fun losowanie(){
        btnZegarPytaniak1btn1.setBackgroundResource(R.drawable.default_button)
        btnZegarPytaniak1btn2.setBackgroundResource(R.drawable.default_button)
        btnZegarPytaniak1btn3.setBackgroundResource(R.drawable.default_button)
        btnZegarPytaniak1btn4.setBackgroundResource(R.drawable.default_button)
        ivGodzina1k1.visibility=View.GONE
        ivGodzina2k1.visibility=View.GONE
        ivGodzina3k1.visibility=View.GONE
        ivGodzina4k1.visibility=View.GONE
        ivGodzina5k1.visibility=View.GONE
        ivGodzina6k1.visibility=View.GONE
        ivGodzina7k1.visibility=View.GONE
        ivGodzina8k1.visibility=View.GONE
        ivGodzina9k1.visibility=View.GONE
        ivGodzina10k1.visibility=View.GONE
        ivGodzina11k1.visibility=View.GONE
        ivGodzina12k1.visibility=View.GONE
        ivMinuta1k1.visibility=View.GONE
        ivMinuta2k1.visibility=View.GONE
        ivMinuta3k1.visibility=View.GONE
        ivMinuta4k1.visibility=View.GONE
        ivMinuta5k1.visibility=View.GONE
        ivMinuta6k1.visibility=View.GONE
        ivMinuta7k1.visibility=View.GONE
        ivMinuta8k1.visibility=View.GONE
        ivMinuta9k1.visibility=View.GONE
        ivMinuta10k1.visibility=View.GONE
        ivMinuta11k1.visibility=View.GONE
        ivMinuta12k1.visibility=View.GONE

        var zegar = (1..1).random()
        when(zegar){
            1->git()
        }

    }
    fun git(){
        ivZegarPytanie1_k1.visibility = View.VISIBLE
        var AnsNr = (1..4).random()
        var godzinaans = (1..12).random()
        var minutyans = (1..12).random()
        godzinadisplayer(godzinaans)
        minutadisplayer(minutyans)
        when (AnsNr){
            1-> {

                btnZegarPytaniak1btn1.setText(godzinaans.toString() + ":" + minmap[minutyans])
                var godzina = (1..12).random()
                var minuty = (1..12).random()
                btnZegarPytaniak1btn2.setText(godzina.toString() + ":" + minmap[minuty])
                godzina = (1..12).random()
                minuty = (1..12).random()
                btnZegarPytaniak1btn3.setText(godzina.toString() + ":" + minmap[minuty])
                godzina = (1..12).random()
                minuty = (1..12).random()
                btnZegarPytaniak1btn4.setText(godzina.toString() + ":" + minmap[minuty])
                listner(AnsNr)
            }
            2-> {
                var godzina = (1..12).random()
                var minuty = (1..12).random()
                btnZegarPytaniak1btn1.setText(godzina.toString() + ":" + minmap[minuty])
                btnZegarPytaniak1btn2.setText(godzinaans.toString() + ":" + minmap[minutyans])
                godzina = (1..12).random()
                minuty = (1..12).random()
                btnZegarPytaniak1btn3.setText(godzina.toString() + ":" + minmap[minuty])
                godzina = (1..12).random()
                minuty = (1..12).random()
                btnZegarPytaniak1btn4.setText(godzina.toString() + ":" + minmap[minuty])
                listner(AnsNr)
            }
            3-> {
                var godzina = (1..12).random()
                var minuty = (1..12).random()
                btnZegarPytaniak1btn1.setText(godzina.toString() + ":" + minmap[minuty])
                godzina = (1..12).random()
                minuty = (1..12).random()
                btnZegarPytaniak1btn2.setText(godzina.toString() + ":" + minmap[minuty])
                btnZegarPytaniak1btn3.setText(godzinaans.toString() + ":" + minmap[minutyans])
                godzina = (1..12).random()
                minuty = (1..12).random()
                btnZegarPytaniak1btn4.setText(godzina.toString() + ":" + minmap[minuty])
                listner(AnsNr)
            }
            4->{
                var godzina = (1..12).random()
                var minuty = (1..12).random()
                btnZegarPytaniak1btn1.setText(godzina.toString() + ":" + minmap[minuty])
                godzina = (1..12).random()
                minuty = (1..12).random()
                btnZegarPytaniak1btn2.setText(godzina.toString() + ":" + minmap[minuty])
                godzina = (1..12).random()
                minuty = (1..12).random()
                btnZegarPytaniak1btn3.setText(godzina.toString() + ":" + minmap[minuty])
                btnZegarPytaniak1btn4.setText(godzinaans.toString() + ":" + minmap[minutyans])
                listner(AnsNr)
            }
        }

    }
    fun listner(AnsNr: Int){
        when (AnsNr){
            1->{
                btnZegarPytaniak1btn1.setOnClickListener {
                    correctAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                    losowanie()
                }
                btnZegarPytaniak1btn2.setOnClickListener {
                    btnZegarPytaniak1btn2.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

                }
                btnZegarPytaniak1btn3.setOnClickListener {
                    btnZegarPytaniak1btn3.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

                }
                btnZegarPytaniak1btn4.setOnClickListener {
                    btnZegarPytaniak1btn4.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
            }
            2->{
                btnZegarPytaniak1btn1.setOnClickListener {
                    btnZegarPytaniak1btn1.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
                btnZegarPytaniak1btn2.setOnClickListener {
                    correctAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\n Złe odpowiedzi: " + badAnswersOverall.toString())
                    losowanie()
                }
                btnZegarPytaniak1btn3.setOnClickListener {
                    btnZegarPytaniak1btn3.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
                btnZegarPytaniak1btn4.setOnClickListener {
                    btnZegarPytaniak1btn4.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
            }
            3->{
                btnZegarPytaniak1btn1.setOnClickListener {
                    btnZegarPytaniak1btn1.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
                btnZegarPytaniak1btn2.setOnClickListener {
                    btnZegarPytaniak1btn2.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
                btnZegarPytaniak1btn3.setOnClickListener {
                    correctAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                    losowanie()
                }
                btnZegarPytaniak1btn4.setOnClickListener {
                    btnZegarPytaniak1btn4.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                }
            }
            4->{
                btnZegarPytaniak1btn1.setOnClickListener {
                    btnZegarPytaniak1btn1.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

                }
                btnZegarPytaniak1btn2.setOnClickListener {
                    btnZegarPytaniak1btn2.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

                }
                btnZegarPytaniak1btn3.setOnClickListener {
                    btnZegarPytaniak1btn3.setBackgroundResource(R.drawable.wrong_button)
                    badAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

                }
                btnZegarPytaniak1btn4.setOnClickListener {
                    correctAnswersOverall++
                    tvZegarPytaniak1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                    losowanie()
                }
            }
        }
    }

    fun godzinadisplayer(godzina:Int){
        when(godzina){
            1->ivGodzina1k1.visibility=View.VISIBLE
            2->ivGodzina2k1.visibility=View.VISIBLE
            3->ivGodzina3k1.visibility=View.VISIBLE
            4->ivGodzina4k1.visibility=View.VISIBLE
            5->ivGodzina5k1.visibility=View.VISIBLE
            6->ivGodzina6k1.visibility=View.VISIBLE
            7->ivGodzina7k1.visibility=View.VISIBLE
            8->ivGodzina8k1.visibility=View.VISIBLE
            9->ivGodzina9k1.visibility=View.VISIBLE
            10->ivGodzina10k1.visibility=View.VISIBLE
            11->ivGodzina11k1.visibility=View.VISIBLE
            12->ivGodzina12k1.visibility=View.VISIBLE
        }
    }

    fun minutadisplayer(minuta:Int){
        when(minuta){
            1->ivMinuta1k1.visibility=View.VISIBLE
            2->ivMinuta2k1.visibility=View.VISIBLE
            3->ivMinuta3k1.visibility=View.VISIBLE
            4->ivMinuta4k1.visibility=View.VISIBLE
            5->ivMinuta5k1.visibility=View.VISIBLE
            6->ivMinuta6k1.visibility=View.VISIBLE
            7->ivMinuta7k1.visibility=View.VISIBLE
            8->ivMinuta8k1.visibility=View.VISIBLE
            9->ivMinuta9k1.visibility=View.VISIBLE
            10->ivMinuta10k1.visibility=View.VISIBLE
            11->ivMinuta11k1.visibility=View.VISIBLE
            12->ivMinuta12k1.visibility=View.VISIBLE

        }
    }
}

