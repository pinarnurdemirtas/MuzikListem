package com.example.muziklistem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class music : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)

        val sarkiAdi = intent.getStringExtra("sarkiname")
        val sanatciAdi = intent.getStringExtra("sanatci")
        val sarkiId = intent.getIntExtra("id", 0)

        // Verileri göster
        val textViewSarkiAdi = findViewById<TextView>(R.id.sarki)
        textViewSarkiAdi.text = sarkiAdi

        val textViewSanatciAdi = findViewById<TextView>(R.id.sanatci)
        textViewSanatciAdi.text = sanatciAdi

        val imageViewSarkiResim = findViewById<ImageView>(R.id.foto)
        imageViewSarkiResim.setImageResource(sarkiId)




        

    }
}