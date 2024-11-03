package com.example.midtermbtueasy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.email_edit_text)
        val nextButton = findViewById<Button>(R.id.NextBtn)

        nextButton.setOnClickListener {
            val enteredEmail = emailEditText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("EMAIL_EXTRA", enteredEmail)
            startActivity(intent)
        }
    }
}