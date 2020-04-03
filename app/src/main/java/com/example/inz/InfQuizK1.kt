package com.example.inz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_inf_quiz_k1.*

class InfQuizK1 : AppCompatActivity() {

    var correctAnswersOverall = 0
    var badAnswersOverall = 0
    val dnitygodnia =
        arrayListOf("poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    val miesiace = arrayListOf(
        "Styczeń",
        "Luty",
        "Marzec",
        "Kwiecień",
        "Maj",
        "Czerwiec",
        "Lipiec",
        "Sierpień",
        "Wrzesień",
        "Paźzdziernik",
        "Listopad",
        "Grudzień"
    )
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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inf_quiz_k1)
        tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
        btnInfQuizk1btn1.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk1btn2.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk1btn3.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk1btn4.setBackgroundResource(R.drawable.default_button)
        losowanie()


    }

    fun losowanie() {
        btnInfQuizk1btn1.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk1btn2.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk1btn3.setBackgroundResource(R.drawable.default_button)
        btnInfQuizk1btn4.setBackgroundResource(R.drawable.default_button)
        var typPytnia = (1..5).random()
        when (typPytnia) {
            1 -> liczby()
            2 -> dnitygodnia()
            3 -> miesiace()
            4 -> poryroku()
            5 -> miary()
        }
    }

    fun liczby() {
        tvInfQuizk1Question.textSize = resources.getDimension(R.dimen.font_size_liczby_Ques)
        btnInfQuizk1btn1.textSize = resources.getDimension(R.dimen.font_size_liczby_Ans)
        btnInfQuizk1btn2.textSize = resources.getDimension(R.dimen.font_size_liczby_Ans)
        btnInfQuizk1btn3.textSize = resources.getDimension(R.dimen.font_size_liczby_Ans)
        btnInfQuizk1btn4.textSize = resources.getDimension(R.dimen.font_size_liczby_Ans)
        var rnd1: Int
        var rnd2: Int
        var answ: Int
        var dzialanie = (1..2).random()
        if (dzialanie == 1) {
            rnd1 = (0..10).random()
            rnd2 = (0..10).random()
            while (rnd1 + rnd2 > 10) {
                rnd1 = (0..10).random()
                rnd2 = (0..10).random()
            }
            answ = rnd1 + rnd2
            var Odp = (1..4).random()
            tvInfQuizk1Question.setText(" " + rnd1.toString() + " + " + rnd2.toString() + " = ")
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
            tvInfQuizk1Question.setText(" " + rnd1.toString() + " - " + rnd2.toString() + " = ")
            sortliczby(Odp, answ)
        }
    }

    fun sortliczby(Odp: Int, answ: Int) {
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

    fun listner(AnsNr: Int) {
        if (AnsNr == 1) {
            btnInfQuizk1btn1.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                ivwiosna.visibility = View.GONE
                ivlato.visibility = View.GONE
                ivjesien.visibility = View.GONE
                ivzima.visibility = View.GONE
                losowanie()
            }
            btnInfQuizk1btn2.setOnClickListener {
                btnInfQuizk1btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn3.setOnClickListener {
                btnInfQuizk1btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn4.setOnClickListener {
                btnInfQuizk1btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else if (AnsNr == 2) {
            btnInfQuizk1btn1.setOnClickListener {
                btnInfQuizk1btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn2.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\n Złe odpowiedzi: " + badAnswersOverall.toString())
                ivwiosna.visibility = View.GONE
                ivlato.visibility = View.GONE
                ivjesien.visibility = View.GONE
                ivzima.visibility = View.GONE
                losowanie()
            }
            btnInfQuizk1btn3.setOnClickListener {
                btnInfQuizk1btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn4.setOnClickListener {
                btnInfQuizk1btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else if (AnsNr == 3) {
            btnInfQuizk1btn1.setOnClickListener {
                btnInfQuizk1btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn2.setOnClickListener {
                btnInfQuizk1btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn3.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                ivwiosna.visibility = View.GONE
                ivlato.visibility = View.GONE
                ivjesien.visibility = View.GONE
                ivzima.visibility = View.GONE
                losowanie()
            }
            btnInfQuizk1btn4.setOnClickListener {
                btnInfQuizk1btn4.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
        } else {
            btnInfQuizk1btn1.setOnClickListener {
                btnInfQuizk1btn1.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn2.setOnClickListener {
                btnInfQuizk1btn2.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn3.setOnClickListener {
                btnInfQuizk1btn3.setBackgroundResource(R.drawable.wrong_button)
                badAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())

            }
            btnInfQuizk1btn4.setOnClickListener {
                correctAnswersOverall++
                tvInfQuizk1Score.setText("Poprawne odpowiedzi: " + correctAnswersOverall.toString() + "\nZłe odpowiedzi: " + badAnswersOverall.toString())
                ivwiosna.visibility = View.GONE
                ivlato.visibility = View.GONE
                ivjesien.visibility = View.GONE
                ivzima.visibility = View.GONE
                losowanie()
            }
        }

    }

    fun dnitygodnia() {
        tvInfQuizk1Question.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Qyes)
        btnInfQuizk1btn1.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk1btn2.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk1btn3.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk1btn4.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        var dzien = (1..7).random()
        var typ = (1..2).random()
        var AnsNr = (1..4).random()

        var tmp: Int
        if (typ == 1) {  // który dzień tygodnia
            tmp = dzien - 1
            tvInfQuizk1Question.setText(dnitygodnia[tmp] + " to który dzień tygodnia?")
            if (AnsNr == 1) {
                btnInfQuizk1btn1.setText(liczbyporadkowe[tmp])
                btnInfQuizk1btn2.setText(liczbyporadkowe[(tmp + 1) % 7])
                btnInfQuizk1btn3.setText(liczbyporadkowe[(tmp + 2) % 7])
                btnInfQuizk1btn4.setText(liczbyporadkowe[(tmp + 3) % 7])
                listner(AnsNr)
            } else if (AnsNr == 2) {
                var tmp2 = tmp - 1

                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 7) % 7
                }
                btnInfQuizk1btn1.setText(liczbyporadkowe[tmp2])
                btnInfQuizk1btn2.setText(liczbyporadkowe[tmp])
                btnInfQuizk1btn3.setText(liczbyporadkowe[(tmp + 1) % 7])
                btnInfQuizk1btn4.setText(liczbyporadkowe[(tmp + 2) % 7])
                listner(AnsNr)
            } else if (AnsNr == 3) {
                var tmp2 = tmp - 2
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 7) % 7
                }
                btnInfQuizk1btn1.setText(liczbyporadkowe[tmp2])
                tmp2 = tmp - 1
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 7) % 7
                }
                btnInfQuizk1btn2.setText(liczbyporadkowe[tmp2])
                btnInfQuizk1btn3.setText(liczbyporadkowe[tmp])
                btnInfQuizk1btn4.setText(liczbyporadkowe[(tmp + 1) % 7])
                listner(AnsNr)
            } else if (AnsNr == 4){
                var tmp2 = tmp - 3
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 7) % 7
                }
                btnInfQuizk1btn1.setText(liczbyporadkowe[tmp2])
                tmp2 = tmp - 2
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 7) % 7
                }
                btnInfQuizk1btn2.setText(liczbyporadkowe[tmp2])
                tmp2 = tmp - 1
                if (tmp2 < 0) {
                    tmp = (tmp2 + 7) % 7
                }
                btnInfQuizk1btn3.setText(liczbyporadkowe[tmp2])
                btnInfQuizk1btn4.setText(liczbyporadkowe[tmp])
                listner(AnsNr)
            }


        } else {     // jaki dzień nastepny
            tmp = dzien - 1
            tvInfQuizk1Question.setText("Jaki jest " + liczbyporadkowe[tmp] + " dzień tygodnia?")
            if (AnsNr == 1) {
                btnInfQuizk1btn1.setText(dnitygodnia[tmp])
                btnInfQuizk1btn2.setText(dnitygodnia[(tmp + 1) % 7])
                btnInfQuizk1btn3.setText(dnitygodnia[(tmp + 2) % 7])
                btnInfQuizk1btn4.setText(dnitygodnia[(tmp + 3) % 7])
                listner(AnsNr)
            } else if (AnsNr == 2) {
                var tmp2 = tmp - 1

                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 7) % 7
                }
                btnInfQuizk1btn1.setText(dnitygodnia[tmp2])
                btnInfQuizk1btn2.setText(dnitygodnia[tmp])
                btnInfQuizk1btn3.setText(dnitygodnia[(tmp + 1) % 7])
                btnInfQuizk1btn4.setText(dnitygodnia[(tmp + 2) % 7])
                listner(AnsNr)
            } else if (AnsNr == 3) {
                var tmp2 = tmp - 2
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 7) % 7
                }
                btnInfQuizk1btn1.setText(dnitygodnia[tmp2])
                tmp2 = tmp - 1
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 7) % 7
                }
                btnInfQuizk1btn2.setText(dnitygodnia[tmp2])
                btnInfQuizk1btn3.setText(dnitygodnia[tmp])
                btnInfQuizk1btn4.setText(dnitygodnia[(tmp + 1) % 7])
                listner(AnsNr)
            } else if (AnsNr == 4){
                var tmp2 = tmp - 3
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 7) % 7
                }
                btnInfQuizk1btn1.setText(dnitygodnia[tmp2])
                tmp2 = tmp - 2
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 7) % 7
                }
                btnInfQuizk1btn2.setText(dnitygodnia[tmp2])
                tmp2 = tmp - 1
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 7) % 7
                }
                btnInfQuizk1btn3.setText(dnitygodnia[tmp2])
                btnInfQuizk1btn4.setText(dnitygodnia[tmp])
                listner(AnsNr)
            }
        }
    }

    fun miesiace() {
        tvInfQuizk1Question.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Qyes)
        btnInfQuizk1btn1.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk1btn2.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk1btn3.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk1btn4.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        var miesiac = (1..12).random()
        var typ = (1..2).random()
        var AnsNr = (1..4).random()
        var tmp: Int
        if (typ == 1) {  // który dzień tygodnia
            tmp = miesiac - 1
            tvInfQuizk1Question.setText(miesiace[tmp] + " to który miesiąc?")
            if (AnsNr == 1) {
                btnInfQuizk1btn1.setText(liczbyporadkowe[tmp])
                btnInfQuizk1btn2.setText(liczbyporadkowe[(tmp + 1) % 12])
                btnInfQuizk1btn3.setText(liczbyporadkowe[(tmp + 2) % 12])
                btnInfQuizk1btn4.setText(liczbyporadkowe[(tmp + 3) % 12])
                listner(AnsNr)
            } else if (AnsNr == 2) {
                var tmp2 = tmp - 1

                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn1.setText(liczbyporadkowe[tmp2])
                btnInfQuizk1btn2.setText(liczbyporadkowe[tmp])
                btnInfQuizk1btn3.setText(liczbyporadkowe[(tmp + 1) % 12])
                btnInfQuizk1btn4.setText(liczbyporadkowe[(tmp + 2) % 12])
                listner(AnsNr)
            } else if (AnsNr == 3) {
                var tmp2 = tmp - 2
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn1.setText(liczbyporadkowe[tmp2])
                tmp2 = tmp - 1
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn2.setText(liczbyporadkowe[tmp2])
                btnInfQuizk1btn3.setText(liczbyporadkowe[tmp])
                btnInfQuizk1btn4.setText(liczbyporadkowe[(tmp + 1) % 12])
                listner(AnsNr)
            } else if (AnsNr == 4){
                var tmp2 = tmp - 3
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn1.setText(liczbyporadkowe[tmp2])
                tmp2 = tmp - 2
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn2.setText(liczbyporadkowe[tmp2])
                tmp2 = tmp - 1
                if (tmp2 < 0) {
                    tmp = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn3.setText(liczbyporadkowe[tmp2])
                btnInfQuizk1btn4.setText(liczbyporadkowe[tmp])
                listner(AnsNr)
            }


        } else {     // jaki dzień nastepny
            tmp = miesiac - 1
            tvInfQuizk1Question.setText("Jaki jest " + liczbyporadkowe[tmp] + " miesiąc?")
            if (AnsNr == 1) {
                btnInfQuizk1btn1.setText(miesiace[tmp])
                btnInfQuizk1btn2.setText(miesiace[(tmp + 1) % 12])
                btnInfQuizk1btn3.setText(miesiace[(tmp + 2) % 12])
                btnInfQuizk1btn4.setText(miesiace[(tmp + 3) % 12])
                listner(AnsNr)
            } else if (AnsNr == 2) {
                var tmp2 = tmp - 1

                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn1.setText(miesiace[tmp2])
                btnInfQuizk1btn2.setText(miesiace[tmp])
                btnInfQuizk1btn3.setText(miesiace[(tmp + 1) % 12])
                btnInfQuizk1btn4.setText(miesiace[(tmp + 2) % 12])
                listner(AnsNr)
            } else if (AnsNr == 3) {
                var tmp2 = tmp - 2
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn1.setText(miesiace[tmp2])
                tmp2 = tmp - 1
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn2.setText(miesiace[tmp2])
                btnInfQuizk1btn3.setText(miesiace[tmp])
                btnInfQuizk1btn4.setText(miesiace[(tmp + 1) % 12])
                listner(AnsNr)
            } else if (AnsNr == 4){
                var tmp2 = tmp - 3
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn1.setText(miesiace[tmp2])
                tmp2 = tmp - 2
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn2.setText(miesiace[tmp2])
                tmp2 = tmp - 1
                if (tmp2 < 0) {
                    tmp2 = (tmp2 + 12) % 12
                }
                btnInfQuizk1btn3.setText(miesiace[tmp2])
                btnInfQuizk1btn4.setText(miesiace[tmp])
                listner(AnsNr)
            }
        }
    }

    fun poryroku() {
        tvInfQuizk1Question.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Qyes)
        btnInfQuizk1btn1.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk1btn2.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk1btn3.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        btnInfQuizk1btn4.textSize = resources.getDimension(R.dimen.font_size_dni_miesiace_Ans)
        var pora = (1..4).random()
        tvInfQuizk1Question.setText("Jaka to pora roku?")
        when (pora) {
            1 -> ivwiosna.visibility = View.VISIBLE
            2 -> ivlato.visibility = View.VISIBLE
            3 -> ivjesien.visibility = View.VISIBLE
            4 -> ivzima.visibility = View.VISIBLE
        }
        var AnsNr = (1..4).random()
        var tmp = pora - 1
        if (AnsNr == 1) {
            btnInfQuizk1btn1.setText(poryroku[tmp])
            btnInfQuizk1btn2.setText(poryroku[(tmp + 1) % 4])
            btnInfQuizk1btn3.setText(poryroku[(tmp + 2) % 4])
            btnInfQuizk1btn4.setText(poryroku[(tmp + 3) % 4])
            listner(AnsNr)
        } else if (AnsNr == 2) {
            var tmp2 = tmp - 1

            if (tmp2 < 0) {
                tmp2 = (tmp2 + 4) % 4
            }
            btnInfQuizk1btn1.setText(poryroku[tmp2])
            btnInfQuizk1btn2.setText(poryroku[tmp])
            btnInfQuizk1btn3.setText(poryroku[(tmp + 1) % 4])
            btnInfQuizk1btn4.setText(poryroku[(tmp + 2) % 4])
            listner(AnsNr)
        } else if (AnsNr == 3) {
            var tmp2 = tmp - 2
            if (tmp2 < 0) {
                tmp2 = (tmp2 + 4) % 4
            }
            btnInfQuizk1btn1.setText(poryroku[tmp2])
            tmp2 = tmp - 1
            if (tmp2 < 0) {
                tmp2 = (tmp2 + 4) % 4
            }
            btnInfQuizk1btn2.setText(poryroku[tmp2])
            btnInfQuizk1btn3.setText(poryroku[tmp])
            btnInfQuizk1btn4.setText(poryroku[(tmp + 1) % 4])
            listner(AnsNr)
        } else if (AnsNr == 4){
            var tmp2 = tmp - 3
            if (tmp2 < 0) {
                tmp2 = (tmp2 + 4) % 4
            }
            btnInfQuizk1btn1.setText(poryroku[tmp2])
            tmp2 = tmp - 2
            if (tmp2 < 0) {
                tmp2 = (tmp2 + 4) % 4
            }
            btnInfQuizk1btn2.setText(poryroku[tmp2])
            tmp2 = tmp - 1
            if (tmp2 < 0) {
                tmp = (tmp2 + 4) % 4
            }
            btnInfQuizk1btn3.setText(poryroku[tmp2])
            btnInfQuizk1btn4.setText(poryroku[tmp])
            listner(AnsNr)
        }


    }

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

}
