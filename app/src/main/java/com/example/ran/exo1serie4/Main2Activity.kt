package com.example.ran.exo1serie4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_blank)
        val String =intent.extras.get("tirte")
        val String2 =intent.extras.get("des")
        val text= findViewById<TextView>(R.id.textView)
        val text2= findViewById<TextView>(R.id.textView2)
        text.text=String.toString()
        text2.text=String2.toString()


    }
}
