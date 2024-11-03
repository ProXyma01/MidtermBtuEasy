package com.example.midtermbtueasy

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private var counter = 1

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.received_text_view)
        val counterTextView = findViewById<TextView>(R.id.counter)
        val incrementButton = findViewById<Button>(R.id.increment)

        val enteredEmail = intent.getStringExtra("EMAIL_EXTRA") ?: ""
        textView.text = if (enteredEmail.isNotEmpty()) {
            "Welcome back $enteredEmail"
        } else {
            "Welcome Guest"
        }

        counterTextView.text = counter.toString()

        incrementButton.setOnClickListener {
            counter *= 2
            counterTextView.text = counter.toString()
        }
    }
}