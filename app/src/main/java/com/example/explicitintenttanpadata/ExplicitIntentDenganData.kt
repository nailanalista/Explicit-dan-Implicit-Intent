package com.example.explicitintenttanpadata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ExplicitIntentDenganData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_dengan_data)

        val tvintentdata = findViewById<TextView>(R.id.tv_explicit_intent_data)
        val dapatData = intent.getStringExtra("NAMA")

        tvintentdata.text = dapatData
    }
}