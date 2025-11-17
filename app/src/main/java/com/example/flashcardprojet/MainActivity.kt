package com.example.flashcardprojet

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val flashcardquestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardreponse = findViewById<TextView>(R.id.flashcard_reponse)

        flashcardquestion.setOnClickListener{
            flashcardquestion.visibility= View.INVISIBLE
            flashcardreponse.visibility= View.VISIBLE
        }
         flashcardreponse.setOnClickListener {
             flashcardreponse.visibility= View.VISIBLE
             flashcardquestion.visibility= View.INVISIBLE
         }
    }

}