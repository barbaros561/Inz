package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_inf_quiz_k2.*

class InfQuizK2 : AppCompatActivity() {
    var correctAnswersOverall = 0
    var badAnswersOverall = 0
    val dnitygodnia =
        arrayListOf("poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    val miesiaceDniMapa = mapOf(
        "Styczeń" to 31,
        "Luty" to 28,
        "Marzec" to 31,
        "Kwiecień" to 30,
        "Maj" to 31,
        "Czerwiec" to 30,
        "Lipiec" to 31,
        "Sierpień" to 31,
        "Wrzesień" to 30,
        "Październik" to 31,
        "Listopad" to 30,
        "Grudzień" to 31
    )

    val miesiace = mapOf(
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
    val rzymMap = mapOf(0 to "XII", 1 to "I", 2 to "II", 3 to "III", 4 to "IV", 5 to "V", 6 to "VI", 7 to "VII", 8 to "VIII", 9 to "IX",
        10 to "X", 11 to "XI", 12 to "XII")
    val poryroku = arrayListOf("wiosna", "lato", "jesień", "zima")
    val miary = arrayListOf("centymetr", "kilogram", "litr", "złot")
    val wartosci = arrayListOf("długość", "wagę", "pojemność", "pieniądze")
    val liczbyporadkowe = arrayListOf(
        "pierwszy",
        "drugi",
        "trzeci",
        "czwarty",
        "piąty",
        "szósty",
        "siódmy",
        "ósmy",
        "dziewąty",
        "dziesiąty",
        "jedenasty",
        "dwunasty"
    )
    val liczby = arrayListOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inf_quiz_k2)
        losowanie()
    }


    fun losowanie() {
        btnInfQuizk2btn1.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk2btn2.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk2btn3.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk2btn4.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk2btn5.setBackgroundResource(R.drawable.default_button)
        //var typPytnia = (1..5).random()
        val typPytnia = 4
        when (typPytnia) {
            1 -> liczby()
            2 -> liczbyRzymskie()
            3 -> miesiace()
            4 -> daty()
            // 5 -> miary()
        }
    }

    fun liczby() {
        tvInfQuizk2Question.textSize = resources.getDimension(R.dimen.font_size_liczby_Ques)
        btnInfQuizk2btn1.textSize = resources.getDimension(R.dimen.font_size_liczby_Ans)
        btnInfQuizk2btn2.textSize = resources.getDimension(R.dimen.font_size_liczby_Ans)
        btnInfQuizk2btn3.textSize = resources.getDimension(R.dimen.font_size_liczby_Ans)
        btnInfQuizk2btn4.textSize = resources.getDimension(R.dimen.font_size_liczby_Ans)
        btnInfQuizk2btn5.visibility = View.GONE
        btnInfQuizk2btn1.visibility = View.VISIBLE
        btnInfQuizk2btn2.visibility = View.VISIBLE
        var rnd1: Int
        var rnd2: Int
        var answ: Int
        var dzialanie = (1..4).random()
        if (dzialanie == 1) {
            rnd1 = (0..10).random()
            rnd2 = (0..10).random()
            while (rnd1 + rnd2 > 10) {
                rnd1 = (0..10).random()
                rnd2 = (0..10).random()
            }
            answ = rnd1 + rnd2
            var Odp = (1..4).random()
            tvInfQuizk2Question.setText(" " + rnd1.toString() + " + " + rnd2.toString() + " = ")
            sortliczby(Odp, answ)
        } else if (dzialanie == 2) {
            rnd1 = (0..10).random()
            rnd2 = (0..10).random()
            while (rnd1 - rnd2 < 0) {
                rnd1 = (0..10).random()
                rnd2 = (0..10).random()
            }
            answ = rnd1 - rnd2
            var Odp = (1..4).random()
            tvInfQuizk2Question.setText(" " + rnd1.toString() + " - " + rnd2.toString() + " = ")
            sortliczby(Odp, answ)
        } else if (dzialanie == 3) {
            rnd1 = (0..10).random()
            rnd2 = (0..10).random()
            while (rnd1 * rnd2 > 30) {
                rnd1 = (0..10).random()
                rnd2 = (0..10).random()
            }
            answ = rnd1 * rnd2
            var Odp = (1..4).random()
            tvInfQuizk2Question.setText(" " + rnd1.toString() + " x " + rnd2.toString() + " = ")
            sortliczby(Odp, answ)
        } else {
            rnd1 = (0..30).random()
            rnd2 = (1..10).random()
            while (rnd1 / rnd2 !in (0..30)) {
                rnd1 = (0..30).random()
                rnd2 = (1..10).random()
            }
            answ = rnd1 / rnd2
            var Odp = (1..4).random()
            tvInfQuizk2Question.setText(" " + rnd1.toString() + " : " + rnd2.toString() + " = ")
            sortliczby(Odp, answ)
        }
    }

    fun sortliczby(Odp: Int, answ: Int) {
        if (Odp == 1) {
            btnInfQuizk2btn1.setText(answ.toString())
            btnInfQuizk2btn2.setText((answ + 1).toString())
            btnInfQuizk2btn3.setText((answ + 2).toString())
            btnInfQuizk2btn4.setText((answ + 3).toString())
            listner(1)
        } else if (Odp == 2) {
            btnInfQuizk2btn1.setText((answ - 1).toString())
            btnInfQuizk2btn2.setText(answ.toString())
            btnInfQuizk2btn3.setText((answ + 1).toString())
            btnInfQuizk2btn4.setText((answ + 2).toString())
            listner(2)
        } else if (Odp == 3) {
            btnInfQuizk2btn1.setText((answ - 2).toString())
            btnInfQuizk2btn2.setText((answ - 1).toString())
            btnInfQuizk2btn3.setText((answ).toString())
            btnInfQuizk2btn4.setText((answ + 1).toString())
            listner(3)
        } else {
            btnInfQuizk2btn1.setText((answ - 3).toString())
            btnInfQuizk2btn2.setText((answ - 2).toString())
            btnInfQuizk2btn3.setText((answ - 1).toString())
            btnInfQuizk2btn4.setText(answ.toString())
            listner(4)

        }
    }

    fun listner(AnsNr: Int) {
        if (AnsNr == 1) {
            btnInfQuizk2btn1.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                losowanie()
            }
            btnInfQuizk2btn2.setOnClickListener {
                btnInfQuizk2btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn3.setOnClickListener {
                btnInfQuizk2btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn4.setOnClickListener {
                btnInfQuizk2btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else if (AnsNr == 2) {
            btnInfQuizk2btn1.setOnClickListener {
                btnInfQuizk2btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn2.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\n Złe odpowiedzi: " + badAnswersOverall.toString())
                losowanie()
            }
            btnInfQuizk2btn3.setOnClickListener {
                btnInfQuizk2btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn4.setOnClickListener {
                btnInfQuizk2btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else if (AnsNr == 3) {
            btnInfQuizk2btn1.setOnClickListener {
                btnInfQuizk2btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn2.setOnClickListener {
                btnInfQuizk2btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn3.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                losowanie()
            }
            btnInfQuizk2btn4.setOnClickListener {
                btnInfQuizk2btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn5.setOnClickListener {
                btnInfQuizk2btn5.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
            }
        } else if (AnsNr == 4){
            btnInfQuizk2btn1.setOnClickListener {
                btnInfQuizk2btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn2.setOnClickListener {
                btnInfQuizk2btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn3.setOnClickListener {
                btnInfQuizk2btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn4.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                losowanie()
            }
            btnInfQuizk2btn5.setOnClickListener {
                btnInfQuizk2btn5.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
            }
        }else {
            btnInfQuizk2btn1.setOnClickListener {
                btnInfQuizk2btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn2.setOnClickListener {
                btnInfQuizk2btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn3.setOnClickListener {
                btnInfQuizk2btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk2btn4.setOnClickListener {
                btnInfQuizk2btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
            }

            btnInfQuizk2btn5.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk2Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                losowanie()
            }
        }


    }

    fun miesiace() {
        tvInfQuizk2Question.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Qyes)
        btnInfQuizk2btn1.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk2btn2.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk2btn3.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk2btn4.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk2btn1.visibility = View.GONE
        btnInfQuizk2btn2.visibility = View.GONE
        btnInfQuizk2btn5.visibility = View.GONE
        var miesiac = (1..12).random()
        //var miesiac = 5
        while (miesiac == 2) {
            miesiac = (1..12).random()
        }
        var AnsNr = (3..4).random()
        tvInfQuizk2Question.setText("Ile dni ma " + miesiace[miesiac])
        if (AnsNr == 3) {
            btnInfQuizk2btn3.setText(miesiaceDniMapa[miesiace[miesiac]].toString())
            if (miesiaceDniMapa[miesiace[miesiac]] == 31) {
                btnInfQuizk2btn4.setText("30")
            } else {
                btnInfQuizk2btn4.setText("31")
            }
            listner(AnsNr)
        } else if (AnsNr == 4) {
            btnInfQuizk2btn4.setText(miesiaceDniMapa[miesiace[miesiac]].toString())
            if (miesiaceDniMapa[miesiace[miesiac]] == 31) {
                btnInfQuizk2btn3.setText("30")
            } else {
                btnInfQuizk2btn3.setText("31")

            }
            listner(AnsNr)


        }
    }

    fun liczbyRzymskie(){
        tvInfQuizk2Question.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Qyes)
        btnInfQuizk2btn1.textSize = resources.getDimension(R.dimen.font_size_liczby_Ans)
        btnInfQuizk2btn2.textSize = resources.getDimension(R.dimen.font_size_liczby_Ans)
        btnInfQuizk2btn3.textSize = resources.getDimension(R.dimen.font_size_liczby_Ans)
        btnInfQuizk2btn4.textSize = resources.getDimension(R.dimen.font_size_liczby_Ans)
        btnInfQuizk2btn1.visibility = View.VISIBLE
        btnInfQuizk2btn2.visibility = View.VISIBLE
        btnInfQuizk2btn5.visibility = View.GONE
        var liczba = (1..12).random()
        var AnsNr = (1..4).random()
        tvInfQuizk2Question.setText("Jaka to liczba " + rzymMap[liczba] +" ?")
        if (AnsNr == 1){
            btnInfQuizk2btn1.setText(liczba.toString())
            btnInfQuizk2btn2.setText((liczba+1).toString())
            btnInfQuizk2btn3.setText((liczba+2).toString())
            btnInfQuizk2btn4.setText((liczba+3).toString())
            listner(AnsNr)
        } else if (AnsNr == 2) {
            btnInfQuizk2btn1.setText(((liczba-1)%13).toString())
            btnInfQuizk2btn2.setText(liczba.toString())
            btnInfQuizk2btn3.setText((liczba+1).toString())
            btnInfQuizk2btn4.setText((liczba+2).toString())
            listner(AnsNr)
        } else if (AnsNr == 3) {
            btnInfQuizk2btn1.setText(((liczba-2)%13).toString())
            btnInfQuizk2btn2.setText(((liczba-1)%13).toString())
            btnInfQuizk2btn3.setText(liczba.toString())
            btnInfQuizk2btn4.setText((liczba+1).toString())
            listner(AnsNr)
        } else {
            btnInfQuizk2btn1.setText(((liczba-3)%13).toString())
            btnInfQuizk2btn2.setText(((liczba-2)%13).toString())
            btnInfQuizk2btn3.setText(((liczba-1)%13).toString())
            btnInfQuizk2btn4.setText(liczba.toString())
            listner(AnsNr)
        }

    }
    fun daty(){
        tvInfQuizk2Question.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Qyes)
        btnInfQuizk2btn3.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk2btn4.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk2btn5.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk2btn1.visibility = View.GONE
        btnInfQuizk2btn2.visibility = View.GONE
        btnInfQuizk2btn5.visibility = View.VISIBLE
        var miech = (1..12).random()
        var dzien = (1..29).random()
        var typ = 1
        //var typ = (1..2).random()
        var AnsNr = (3..5).random()
        if (typ == 1) { // rzym
            tvInfQuizk2Question.setText("Jaka to data " + rzymMap[miech] + " " + dzien.toString() +"?")
            if (AnsNr == 3) {
                btnInfQuizk2btn3.setText(dzien.toString() + " " + miesiace[miech])
                btnInfQuizk2btn4.setText(dzien.toString() + " " + miesiace[miech+1])
                btnInfQuizk2btn5.setText(dzien.toString() + " " + miesiace[miech-1])
                listner(AnsNr)
            }else if (AnsNr == 4) {
                btnInfQuizk2btn3.setText(dzien.toString() + " " + miesiace[miech-1])
                btnInfQuizk2btn4.setText(dzien.toString() + " " + miesiace[miech])
                btnInfQuizk2btn5.setText(dzien.toString() + " " + miesiace[miech+1])
                listner(AnsNr)
            }else {
                btnInfQuizk2btn3.setText(dzien.toString() + " " + miesiace[miech+1])
                btnInfQuizk2btn4.setText(dzien.toString() + " " + miesiace[miech-1])
                btnInfQuizk2btn5.setText(dzien.toString() + " " + miesiace[miech])
                listner(AnsNr)
            }


        } else { //arabic

        }


    }
       /*
    fun miary() {
        tvInfQuizk1Question.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Qyes)
        btnInfQuizk1btn1.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk1btn2.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk1btn3.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk1btn4.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        var miara = (1..4).random()
        var typ = (1..2).random()
        var AnsNr = (1..4).random()
        var tmp: Int
        if (typ == 1) {  // jaka miara
            tmp = miara - 1
            tvInfQuizk1Question.setText("Do liczenia czego używamy " +miary[tmp] + "ów?")
            if (AnsNr == 1) {
                btnInfQuizk1btn1.setText(wartosci[tmp])
                btnInfQuizk1btn2.setText(wartosci[(tmp + 1) % 4])
                btnInfQuizk1btn3.setText(wartosci[(tmp + 2) % 4])
                btnInfQuizk1btn4.setText(wartosci[(tmp + 3) % 4])
                listner(AnsNr)
            } else if (AnsNr == 2) {
                var tmp2 = tmp - 1

                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 4) % 4
                }
                btnInfQuizk1btn1.setText(wartosci[tmp2])
                btnInfQuizk1btn2.setText(wartosci[tmp])
                btnInfQuizk1btn3.setText(wartosci[(tmp + 1) % 4])
                btnInfQuizk1btn4.setText(wartosci[(tmp + 2) % 4])
                listner(AnsNr)
            } else if (AnsNr == 3) {
                var tmp2 = tmp - 2
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 4) % 4
                }
                btnInfQuizk1btn1.setText(wartosci[tmp2])
                tmp2 = tmp - 1
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 4) % 4
                }
                btnInfQuizk1btn2.setText(wartosci[tmp2])
                btnInfQuizk1btn3.setText(wartosci[tmp])
                btnInfQuizk1btn4.setText(wartosci[(tmp + 1) % 4])
                listner(AnsNr)
            } else if (AnsNr == 4){
                var tmp2 = tmp - 3
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 4) % 4
                }
                btnInfQuizk1btn1.setText(wartosci[tmp2])
                tmp2 = tmp - 2
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 4) % 4
                }
                btnInfQuizk1btn2.setText(wartosci[tmp2])
                tmp2 = tmp - 1
                if (tmp2 < 0) {
                    tmp = (tmp2 + 4) % 4
                }
                btnInfQuizk1btn3.setText(wartosci[tmp2])
                btnInfQuizk1btn4.setText(wartosci[tmp])
                listner(AnsNr)
            }


        } else {     // jaki dzień nastepny
            tmp = miara - 1
            tvInfQuizk1Question.setText("W czym mierzymy " + wartosci[tmp])
            if (AnsNr == 1) {
                btnInfQuizk1btn1.setText(miary[tmp])
                btnInfQuizk1btn2.setText(miary[(tmp + 1) % 4])
                btnInfQuizk1btn3.setText(miary[(tmp + 2) % 4])
                btnInfQuizk1btn4.setText(miary[(tmp + 3) % 4])
                listner(AnsNr)
            } else if (AnsNr == 2) {
                var tmp2 = tmp - 1

                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 4) % 4
                }
                btnInfQuizk1btn1.setText(miary[tmp2])
                btnInfQuizk1btn2.setText(miary[tmp])
                btnInfQuizk1btn3.setText(miary[(tmp + 1) % 4])
                btnInfQuizk1btn4.setText(miary[(tmp + 2) % 4])
                listner(AnsNr)
            } else if (AnsNr == 3) {
                var tmp2 = tmp - 2
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 4) % 4
                }
                btnInfQuizk1btn1.setText(miary[tmp2])
                tmp2 = tmp - 1
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 4) % 4
                }
                btnInfQuizk1btn2.setText(miary[tmp2])
                btnInfQuizk1btn3.setText(miary[tmp])
                btnInfQuizk1btn4.setText(miary[(tmp + 1) % 4])
                listner(AnsNr)
            } else if (AnsNr == 4){
                var tmp2 = tmp - 3
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 4) % 4
                }
                btnInfQuizk1btn1.setText(miary[tmp2])
                tmp2 = tmp - 2
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 4) % 4
                }
                btnInfQuizk1btn2.setText(miary[tmp2])
                tmp2 = tmp - 1
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn3.setText(miary[tmp2])
                btnInfQuizk1btn4.setText(miary[tmp])
                listner(AnsNr)
            }
        }


    }
    */



}