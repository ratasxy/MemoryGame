package com.example.memorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.content.Intent
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    var current:Int = -1;
    var points:Int = 0;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imv1:ImageView = findViewById<ImageView>(R.id.imv1)
        var imv2:ImageView = findViewById<ImageView>(R.id.imv2)
        var imv3:ImageView = findViewById<ImageView>(R.id.imv3)
        var imv4:ImageView = findViewById<ImageView>(R.id.imv4)

        blind()

        imv1.setOnClickListener{
            imv1.setImageResource(R.drawable.pikachu)
            if(current == -1)
            {
                current = 1
            }else if(this.current == 3){
                this.points = this.points + 1
                current = -1;
                next()
            }else{
                blind();
                this.points = 0;
                current = -1
            }

            puntaje()
        }

        imv2.setOnClickListener{
            imv2.setImageResource(R.drawable.bulbasaur)
            if(this.current == -1)
            {
                this.current = 2
            }else if(this.current == 4){
                this.points = this.points + 1;
                current = -1
                next()
            }else{
                blind();
                this.points = 0;
                current = -1
            }

            puntaje()
        }

        imv3.setOnClickListener{
            imv3.setImageResource(R.drawable.pikachu)
            if(this.current == -1)
            {
                this.current = 3
            }else if(this.current == 1){
                this.points = this.points + 1;
                current = -1
                next()
            }else{
                blind();
                this.points = 0;
                current = -1
            }

            puntaje()
        }

        imv4.setOnClickListener{
            imv4.setImageResource(R.drawable.bulbasaur)
            if(this.current == -1)
            {
                this.current = 4
            }else if(this.current == 2){
                this.points = points + 1;
                current = -1
                next()
            }else{
                blind();
                points = 0;
                current = -1
            }

            puntaje()
        }
    }

    fun blind(){
        var imv1:ImageView = findViewById<ImageView>(R.id.imv1)
        var imv2:ImageView = findViewById<ImageView>(R.id.imv2)
        var imv3:ImageView = findViewById<ImageView>(R.id.imv3)
        var imv4:ImageView = findViewById<ImageView>(R.id.imv4)

        imv1.setImageResource(R.drawable.pokeball)
        imv2.setImageResource(R.drawable.pokeball)
        imv3.setImageResource(R.drawable.pokeball)
        imv4.setImageResource(R.drawable.pokeball)
    }

    fun next(){
        if(this.points > 1){
            val intent = Intent(this, Level2::class.java)
            startActivity(intent)
        }
    }

    fun puntaje(){
        var txtPuntaje = findViewById<TextView>(R.id.textView3)

        txtPuntaje.text = "Puntaje: " + this.points
    }
}