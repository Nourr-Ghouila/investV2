package com.example.investappv2.ui.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.investappv2.R
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ---- TEST FIREBASE ----
        val db = Firebase.firestore

        val testData = hashMapOf(
            "message" to "Hello Invest",
            "timestamp" to System.currentTimeMillis()
        )

        db.collection("test")
            .add(testData)
            .addOnSuccessListener { document ->
                Log.d("FIREBASE_TEST", "Document ajouté : ${document.id}")
            }
            .addOnFailureListener { e ->
                Log.e("FIREBASE_TEST", "Erreur Firestore : ", e)
            }
    }
}