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

        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardResponseBill = findViewById<TextView>(R.id.flashcard_reponse_bill)
        val flashcardResponseBush = findViewById<TextView>(R.id.flashcard_reponse_bush)
        val flashcardResponseObama = findViewById<TextView>(R.id.flashcard_reponse_obama)


//       // flashcardQuestion.setOnClickListener{
//            flashcardQuestion.visibility= View.INVISIBLE
//            flashcardreponse.visibility= View.VISIBLE
//        }
        flashcardResponseBill.setOnClickListener {
            flashcardResponseBill.findViewById<View>(R.id.flashcard_reponse_bill)
                .setBackgroundColor(getResources().getColor(R.color.red, null))
            //flashcardResponseBush.findViewById<View>(R.id.flashcard_reponse_bush).setBackgroundColor(getResources().getColor(R.color.red, null))
            flashcardResponseObama.findViewById<View>(R.id.flashcard_reponse_obama)
                .setBackgroundColor(getResources().getColor(R.color.green, null))
        }

        flashcardResponseBush.setOnClickListener {
            flashcardResponseBush.findViewById<View>(R.id.flashcard_reponse_bush)
                .setBackgroundColor(getResources().getColor(R.color.red, null))
            //flashcardResponseBush.findViewById<View>(R.id.flashcard_reponse_bush).setBackgroundColor(getResources().getColor(R.color.red, null))
            flashcardResponseObama.findViewById<View>(R.id.flashcard_reponse_obama)
                .setBackgroundColor(getResources().getColor(R.color.green, null))
        }

        flashcardResponseObama.setOnClickListener {
            flashcardResponseObama.findViewById<View>(R.id.flashcard_reponse_obama)
                .setBackgroundColor(getResources().getColor(R.color.green, null))
        }
    }
}