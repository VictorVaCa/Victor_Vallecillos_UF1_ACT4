package com.example.victor_vallecillos_uf1_act4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogcat = findViewById<Button>(R.id.buttonLogcat);

        buttonLogcat.setOnClickListener{
            Log.d("Missatge","Botó apretat");
        }


        val buttonToast = findViewById<Button>(R.id.buttonToast);

        buttonToast.setOnClickListener{
            Toast.makeText(this, "Botó apretat", Toast.LENGTH_SHORT).show();
        }
    }
}