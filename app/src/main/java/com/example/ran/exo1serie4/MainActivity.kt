package com.example.ran.exo1serie4

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val orientation=resources.configuration.orientation
        if (orientation==Configuration.ORIENTATION_PORTRAIT) {
            val Img = findViewById(R.id.imageView5) as ImageView
            val Img2 = findViewById(R.id.imageView6) as ImageView
            val Img3 = findViewById(R.id.imageView7) as ImageView
            val Img4 = findViewById(R.id.imageView8) as ImageView
            val drawble = resources.getDrawable(R.drawable.amir, theme)
            Img.setImageDrawable(drawble)
            Img.setOnClickListener {

                val intent = Intent(this, Main2Activity::class.java)
                intent.putExtra("tirte", "titre du livre ")
                intent.putExtra("des", "Description1 ")
                startActivity(intent)
            }
            Img2.setImageDrawable(resources.getDrawable(R.drawable.barack, theme))
            Img2.setOnClickListener {

                val intent = Intent(this, Main2Activity::class.java)
                intent.putExtra("tirte", "titre du livre2 ")
                intent.putExtra("des", "Description2 ")
                startActivity(intent)
            }
    l.        Img3.setImageDrawable(resources.getDrawable(R.drawable.elif, theme))
            Img3.setOnClickListener {

                val intent = Intent(this, Main2Activity::class.java)
                intent.putExtra("tirte", "titre du livre3 ")
                intent.putExtra("des", "Description3 ")
                startActivity(intent)
            }
        }
       // fragment
    }
}
