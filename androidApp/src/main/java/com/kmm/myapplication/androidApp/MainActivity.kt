package com.kmm.myapplication.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kmm.myapplication.shared.Greeting
import android.widget.TextView
import com.kmm.myapplication.shared.HelloWorld

fun greet(): String {
    return Greeting().greeting()
}

fun helloWorld() : String {
    return HelloWorld().helloWorld()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = helloWorld()
    }
}
