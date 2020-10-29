/* I modified this file by adding the actions of the features I added in the layout file
 */
package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pressButton = findViewById<android.widget.Button>(R.id.pressButton)
        val textView2 = findViewById<android.widget.TextView>(R.id.textView2)
        val seekbar2 = findViewById<android.widget.SeekBar>(R.id.seekBar2)

        pressButton.setOnClickListener {
            val rand = java.util.Random().nextInt(seekbar2.progress)
            textView2.text = rand.toString()
        }
    }
}