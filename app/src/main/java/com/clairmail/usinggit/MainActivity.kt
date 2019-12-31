package com.clairmail.usinggit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val textView: TextView = findViewById(R.id.textView)
   private val textView2: TextView = findViewById(R.id.textView2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setting TextView
        textView.text = " First Change"
        
        //setting 2nd TextView
        textView2.text = "Second Change"
    }
}
