package com.example.papierkamiennozyce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val papier = findViewById<Button>(R.id.papier)
        val kamien = findViewById<Button>(R.id.kamien)
        val nozyce = findViewById<Button>(R.id.nozyce)
        val dlugosc = Toast.LENGTH_LONG

        papier.setOnClickListener {
            val wyborgracza = "papier"
            val wynik : Int = Random.nextInt(from=1, until=4)
            when (wynik) {
                1 -> {val tekst = "Wybrałeś $wyborgracza, komputer wybrał papier. Remis"
                    Toast.makeText(this, tekst, dlugosc).show()}
                2 -> {val tekst = "Wybrałeś $wyborgracza, komputer wybrał kamień. Zwycięstwo!"
                    Toast.makeText(this, tekst, dlugosc).show()}
                3 -> {val tekst = "Wybrałeś $wyborgracza, komputer wybrał nożyce. Porażka..."
                    Toast.makeText(this, tekst, dlugosc).show()}
            }
        }
        kamien.setOnClickListener {
            val wyborgracza = "kamień"
            val wynik : Int = Random.nextInt(from=1, until=4)
            when (wynik) {
                1 -> {val tekst = "Wybrałeś $wyborgracza, komputer wybrał papier. Porażka..."
                    Toast.makeText(this, tekst, dlugosc).show()}
                2 -> {val tekst = "Wybrałeś $wyborgracza, komputer wybrał kamień. Remis!"
                    Toast.makeText(this, tekst, dlugosc).show()}
                3 -> {val tekst = "Wybrałeś $wyborgracza, komputer wybrał nożyce. Zwycięstwo!"
                    Toast.makeText(this, tekst, dlugosc).show()}
            }
        }
        nozyce.setOnClickListener {
            val wyborgracza = "nożyce"
            val wynik : Int = Random.nextInt(from=1, until=4)
            when (wynik) {
                1 -> {val tekst = "Wybrałeś $wyborgracza, komputer wybrał papier. Zwycięstwo!"
                    Toast.makeText(this, tekst, dlugosc).show()}
                2 -> {val tekst = "Wybrałeś $wyborgracza, komputer wybrał kamień. Porażka..."
                    Toast.makeText(this, tekst, dlugosc).show()}
                3 -> {val tekst = "Wybrałeś $wyborgracza, komputer wybrał nożyce. Remis"
                    Toast.makeText(this, tekst, dlugosc).show()}
            }
        }
    }
}