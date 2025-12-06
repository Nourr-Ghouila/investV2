package com.example.investappv2.ui.onboarding

import kotlin.jvm.java


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.investappv2.databinding.ActivityOnboardingBinding
import com.example.investappv2.ui.main.MainActivity

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            // Vérifier si l'utilisateur est déjà connecté
            // Pour l'instant, on va directement à MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Fermer OnboardingActivity
        }
    }
}