package com.example.muziklistem

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sarkilar = ArrayList<sarki>()
        sarkilar.add(sarki("Mübhem", "Mabel Matiz", R.drawable.a))
        sarkilar.add(sarki("Kusura Bakma","Tuğkan", R.drawable.b))
        sarkilar.add(sarki("Oyun Bozan","Mor ve Ötesi", R.drawable.c))
        sarkilar.add(sarki("Söyle","Seksendört", R.drawable.d))
        sarkilar.add(sarki("Neden?","Gece Yolcuları", R.drawable.e))
        sarkilar.add(sarki("Duvar","Zeynep", R.drawable.f))
        sarkilar.add(sarki("Alev Alev","Feridun Düzağaç", R.drawable.g))
        sarkilar.add(sarki("Alüst Olmuşum","Mavi Gri", R.drawable.j))
        sarkilar.add(sarki("Napim Tabiatım Böyle","Teoman", R.drawable.k))
        sarkilar.add(sarki("Anıları Sakla","Batuhan Korel", R.drawable.l))


        val adapter = adapterclass(this, sarkilar)
        val listview = findViewById<ListView>(R.id.listview)
        listview.adapter = adapter

        listview.setOnItemClickListener { parent, view, position, id ->
            val selectedSarki = sarkilar[position]
            val intent = Intent(this, music::class.java)
            intent.putExtra("sarkiname", selectedSarki.ad)
            intent.putExtra("sanatci", selectedSarki.sanatcii)
            intent.putExtra("id", selectedSarki.id)
            startActivity(intent)



        }

    }
}


