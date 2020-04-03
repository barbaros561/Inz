package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_geometria_k1_pytania.*
//import kotlinx.android.synthetic.main.activity_inf_quiz_k1.*

class geometria_k1_pytania : AppCompatActivity() {

    var correctAnswersOverall = 0
    var badAnswersOverall = 0
    val figury = arrayListOf("koło", "trójkąt", "kwadrat", "prostokąt")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geometria_k1_pytania)

        tvGeoQuizk1Question.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
        btnGeoQuizk1btn1.setBackgroundResource(R.drawable.default_button)
        btnGeoQuizk1btn2.setBackgroundResource(R.drawable.default_button)
        btnGeoQuizk1btn3.setBackgroundResource(R.drawable.default_button)
        btnGeoQuizk1btn4.setBackgroundResource(R.drawable.default_button)
        tvGeoQuizk1Question.setText("Jaka to figura?")
        tvGeoQuizk1Question.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Qyes)
        btnGeoQuizk1btn1.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnGeoQuizk1btn2.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnGeoQuizk1btn3.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnGeoQuizk1btn4.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        losowanie()

    }

    fun losowanie(){
        btnGeoQuizk1btn1.setBackgroundResource(R.drawable.default_button)
        btnGeoQuizk1btn2.setBackgroundResource(R.drawable.default_button)
        btnGeoQuizk1btn3.setBackgroundResource(R.drawable.default_button)
        btnGeoQuizk1btn4.setBackgroundResource(R.drawable.default_button)
        var figura = (1..4).random()

        when (figura) {
            1 -> ivGeoQuizkolo.visibility = View.VISIBLE
            2 -> ivGeoQuiztrojkat.visibility = View.VISIBLE
            3 -> ivGeoQuizkwadrat.visibility = View.VISIBLE
            4 -> ivGeoQuizprostokat.visibility = View.VISIBLE
        }
        var AnsNr = (1..4).random()
        var tmp = figura - 1
        if (AnsNr == 1) {
            btnGeoQuizk1btn1.setText(figury[tmp])
            btnGeoQuizk1btn2.setText(figury[(tmp + 1) % 4])
            btnGeoQuizk1btn3.setText(figury[(tmp + 2) % 4])
            btnGeoQuizk1btn4.setText(figury[(tmp + 3) % 4])
            listner(AnsNr)
        } else if (AnsNr == 2) {
            var tmp2 = tmp - 1

            if (tmp2 < 0) {
                tmp2 = (tmp2 + 4) % 4
            }
            btnGeoQuizk1btn1.setText(figury[tmp2])
            btnGeoQuizk1btn2.setText(figury[tmp])
            btnGeoQuizk1btn3.setText(figury[(tmp + 1) % 4])
            btnGeoQuizk1btn4.setText(figury[(tmp + 2) % 4])
            listner(AnsNr)
        } else if (AnsNr == 3) {
            var tmp2 = tmp - 2
            if (tmp2 < 0) {
                tmp2 = (tmp2 + 4) % 4
            }
            btnGeoQuizk1btn1.setText(figury[tmp2])
            tmp2 = tmp - 1
            if (tmp2 < 0) {
                tmp2 = (tmp2 + 4) % 4
            }
            btnGeoQuizk1btn2.setText(figury[tmp2])
            btnGeoQuizk1btn3.setText(figury[tmp])
            btnGeoQuizk1btn4.setText(figury[(tmp + 1) % 4])
            listner(AnsNr)
        } else if (AnsNr == 4){
            var tmp2 = tmp - 3
            if (tmp2 < 0) {
                tmp2 = (tmp2 + 4) % 4
            }
            btnGeoQuizk1btn1.setText(figury[tmp2])
            tmp2 = tmp - 2
            if (tmp2 < 0) {
                tmp2 = (tmp2 + 4) % 4
            }
            btnGeoQuizk1btn2.setText(figury[tmp2])
            tmp2 = tmp - 1
            if (tmp2 < 0) {
                tmp = (tmp2 + 4) % 4
            }
            btnGeoQuizk1btn3.setText(figury[tmp2])
            btnGeoQuizk1btn4.setText(figury[tmp])
            listner(AnsNr)
        }



    }
    fun listner(AnsNr: Int) {
        if (AnsNr == 1) {
            btnGeoQuizk1btn1.setOnClickListener {
                correctAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                ivGeoQuizkolo.visibility = View.GONE
                ivGeoQuizkwadrat.visibility = View.GONE
                ivGeoQuizprostokat.visibility = View.GONE
                ivGeoQuiztrojkat.visibility = View.GONE
                losowanie()
            }
            btnGeoQuizk1btn2.setOnClickListener {
                btnGeoQuizk1btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk1btn3.setOnClickListener {
                btnGeoQuizk1btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk1btn4.setOnClickListener {
                btnGeoQuizk1btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else if (AnsNr == 2) {
            btnGeoQuizk1btn1.setOnClickListener {
                btnGeoQuizk1btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk1btn2.setOnClickListener {
                correctAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\n Złe odpowiedzi: " + badAnswersOverall.toString())
                ivGeoQuizkolo.visibility = View.GONE
                ivGeoQuizkwadrat.visibility = View.GONE
                ivGeoQuizprostokat.visibility = View.GONE
                ivGeoQuiztrojkat.visibility = View.GONE
                losowanie()
            }
            btnGeoQuizk1btn3.setOnClickListener {
                btnGeoQuizk1btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk1btn4.setOnClickListener {
                btnGeoQuizk1btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else if (AnsNr == 3) {
            btnGeoQuizk1btn1.setOnClickListener {
                btnGeoQuizk1btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk1btn2.setOnClickListener {
                btnGeoQuizk1btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk1btn3.setOnClickListener {
                correctAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                ivGeoQuizkolo.visibility = View.GONE
                ivGeoQuizkwadrat.visibility = View.GONE
                ivGeoQuizprostokat.visibility = View.GONE
                ivGeoQuiztrojkat.visibility = View.GONE
                losowanie()
            }
            btnGeoQuizk1btn4.setOnClickListener {
                btnGeoQuizk1btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else {
            btnGeoQuizk1btn1.setOnClickListener {
                btnGeoQuizk1btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk1btn2.setOnClickListener {
                btnGeoQuizk1btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk1btn3.setOnClickListener {
                btnGeoQuizk1btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnGeoQuizk1btn4.setOnClickListener {
                correctAnswersOverall++
                tvGeoQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                ivGeoQuizkolo.visibility = View.GONE
                ivGeoQuizkwadrat.visibility = View.GONE
                ivGeoQuizprostokat.visibility = View.GONE
                ivGeoQuiztrojkat.visibility = View.GONE
                losowanie()
            }
        }

    }

}
