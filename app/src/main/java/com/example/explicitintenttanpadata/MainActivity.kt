package com.example.explicitintenttanpadata

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPindah = findViewById<Button>(R.id.btn_pindah)

        btnPindah.setOnClickListener {
            val intentKita = Intent(this, ActivityBaru::class.java)
            startActivity(intentKita)
        }

        val btnPindahDenganData = findViewById<Button>(R.id.btn_pindah_data)

        btnPindahDenganData.setOnClickListener {
            val intentKita = Intent(this, ExplicitIntentDenganData::class.java).apply {
                putExtra("NAMA", "Naila Nalista")
            }
            startActivity(intentKita)
        }

        val btnOpenLink = findViewById<Button>(R.id.btn_open_link)

        btnOpenLink.setOnClickListener {
            val urlSaya: Uri = Uri.parse("https://www.google.com")
            val intentKita = Intent(Intent.ACTION_VIEW, urlSaya)
            startActivity(intentKita)
        }
    }
}