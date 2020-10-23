package com.example.memorygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Level2 : AppCompatActivity() {
    var current:Int = -1;
    var points:Int = 2;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level2)

        val imv1: ImageView = findViewById<ImageView>(R.id.imv1)
        val imv2: ImageView = findViewById<ImageView>(R.id.imv2)
        val imv3: ImageView = findViewById<ImageView>(R.id.imv3)
        val imv4: ImageView = findViewById<ImageView>(R.id.imv4)
        val imv5: ImageView = findViewById<ImageView>(R.id.imv5)
        val imv6: ImageView = findViewById<ImageView>(R.id.imv6)

        blind()

        imv1.setOnClickListener{
            imv1.setImageResource(R.drawable.pikachu)
            if(current == -1)
            {
                current = 1
            }else if(current == 3){
                points = points + 1;
                current = -1
                next()
            }else{
                blind();
                points = 2;
                current = -1;
            }

            puntaje()
        }

        imv2.setOnClickListener{
            imv2.setImageResource(R.drawable.bulbasaur)
            if(current == -1)
            {
                current = 2
            }else if(current == 4){
                points = points + 1;
                current = -1
                next()
            }else{
                blind();
                points = 2;
                current = -1;
            }

            puntaje()
        }

        imv3.setOnClickListener{
            imv3.setImageResource(R.drawable.pikachu)
            if(current == -1)
            {
                current = 3
            }else if(current == 1){
                points = points + 1;
                current = -1
                next()
            }else{
                blind();
                points = 2;
                current = -1;
            }

            puntaje()
        }

        imv4.setOnClickListener{
            imv4.setImageResource(R.drawable.bulbasaur)
            if(current == -1)
            {
                current = 4
            }else if(current == 2){
                points = points + 1;
                current = -1
                next()
            }else{
                blind();
                points = 2;
                current = -1;
            }

            puntaje()
        }

        imv5.setOnClickListener{
            imv5.setImageResource(R.drawable.squirtle)
            if(current == -1)
            {
                current = 5
            }else if(current == 6){
                points = points + 1;
                current = -1
                next()
            }else{
                blind();
                points = 2;
                current = -1;
            }

            puntaje()
        }

        imv6.setOnClickListener{
            imv6.setImageResource(R.drawable.squirtle)
            if(current == -1)
            {
                current = 6
            }else if(current == 5){
                points = points + 1;
                current = -1
                next()
            }else{
                blind();
                points = 2;
                current = -1;
            }

            puntaje()
        }
    }

    fun blind(){
        val imv1: ImageView = findViewById<ImageView>(R.id.imv1)
        val imv2: ImageView = findViewById<ImageView>(R.id.imv2)
        val imv3: ImageView = findViewById<ImageView>(R.id.imv3)
        val imv4: ImageView = findViewById<ImageView>(R.id.imv4)
        val imv5: ImageView = findViewById<ImageView>(R.id.imv5)
        val imv6: ImageView = findViewById<ImageView>(R.id.imv6)

        imv1.setImageResource(R.drawable.pokeball)
        imv2.setImageResource(R.drawable.pokeball)
        imv3.setImageResource(R.drawable.pokeball)
        imv4.setImageResource(R.drawable.pokeball)
        imv5.setImageResource(R.drawable.pokeball)
        imv6.setImageResource(R.drawable.pokeball)
    }

    fun next(){
        if(points > 4){
            val intent = Intent(this, Win::class.java)
            startActivity(intent)
        }
    }

    fun puntaje(){
        var txtPuntaje = findViewById<TextView>(R.id.textView3)

        txtPuntaje.text = "Puntaje: " + points
    }
}