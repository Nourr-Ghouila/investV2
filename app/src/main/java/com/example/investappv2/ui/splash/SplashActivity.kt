package com.example.investappv2.ui.splash

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.investappv2.R
import com.example.investappv2.databinding.ActivitySplashBinding
import kotlin.jvm.java

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Animation du logo
        val animation = AnimationUtils.loadAnimation(this, R.anim.logo_animation)
        binding.logoImage.startAnimation(animation)

        // Attendre 1.5s puis passer à l'écran suivant
        binding.root.postDelayed({

            // Aller vers Onboarding (provisoire, en attendant LoginActivity)
            startActivity(Intent(this, OnboardingActivity::class.java))
            finish()

        }, 1500)
    }
}