package com.example.calculatorv02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = ""
        var b = 0
        var c = ""
        var d : Double = 0.0
        button31.setOnClickListener {
            textView.setText("0")
        }
        button12.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "7")
            } else {
                textView.setText(textView.text.toString() + "7")
            }
        }
        button13.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "8")
            } else {
                textView.setText(textView.text.toString() + "8")
            }
        }
        button14.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "9")
            } else {
                textView.setText(textView.text.toString() + "9")
            }
        }
        button16.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "4")
            } else {
                textView.setText(textView.text.toString() + "4")
            }
        }
        button17.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "5")
            } else {
                textView.setText(textView.text.toString() + "5")
            }
        }
        button18.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "6")
            } else {
                textView.setText(textView.text.toString() + "6")
            }
        }
        button20.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "1")
            } else {
                textView.setText(textView.text.toString() + "1")
            }
        }
        button21.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "2")
            } else {
                textView.setText(textView.text.toString() + "2")
            }
        }
        button22.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "3")
            } else {
                textView.setText(textView.text.toString() + "3")
            }
        }
        button33.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("0")
            } else {
                textView.setText(textView.text.toString() + "0")
            }
        }
        button32.setOnClickListener {
            c = "/"
            a = textView.text.toString()
            textView.setText("0")
        }
        button15.setOnClickListener {
            c = "*"
            a = textView.text.toString()
            textView.setText("0")
        }
        button19.setOnClickListener {
            c = "-"
            a = textView.text.toString()
            textView.setText("0")
        }
        button23.setOnClickListener {
            c = "+"
            a = textView.text.toString()
            textView.setText("0")
        }
        button30.setOnClickListener {
            c = "%"
            a = textView.text.toString()
            textView.setText("0")
        }
        button35.setOnClickListener {
            if (c == "/") {
                d = (a.toString().toDouble() / textView.text.toString().toDouble())
                textView.setText(d.toString())
            } else if (c == "*") {
                d = (a.toString().toDouble() * textView.text.toString().toDouble())
                textView.setText(d.toString())
            } else if (c == "-") {
                d = (a.toString().toDouble() - textView.text.toString().toDouble())
                textView.setText(d.toString())
            } else if (c == "+") {
                d = (a.toString().toDouble() + textView.text.toString().toDouble())
                textView.setText(d.toString())
            }else if (c == "%") {
                d = (a.toString().toDouble() % textView.text.toString().toDouble())
                textView.setText(d.toString())
            }
        }
        button23.setOnClickListener{
            if (c == "-")
                d = (a.toString().toDouble() / textView.text.toString().toDouble())
            textView.setText(d.toString())
        }
        button34.setOnClickListener {
            if (!textView.text.toString().contains(".")) {
                textView.text = textView.text.toString() + "."
            }
        }
    }
}

