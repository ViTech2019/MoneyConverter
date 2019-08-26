package com.vlgames.converter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nextActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
    //get shekel from dollar
    fun convertDollarToShekel(view: View) {
        val editText = findViewById<View>(R.id.convertDollar) as EditText
        val shekels = Integer.parseInt(editText.text.toString())
        val dollar = 3.5369
        val result = (shekels * dollar).toFloat()
        Toast.makeText(this@MainActivity, result.toString(), Toast.LENGTH_LONG).show()
    }
    //get shekel from euro
    fun convertEuroToShekel(view: View) {
        val editText = findViewById<View>(R.id.convertEuro) as EditText
        val shekels = Integer.parseInt(editText.text.toString())
        val euro = 3.9668
        val result = (shekels * euro).toFloat()
        Toast.makeText(this@MainActivity, result.toString(), Toast.LENGTH_LONG).show()
    }
    //get shekel from pound
    fun convertBritishPoundToShekel(view: View) {
        val editText = findViewById<View>(R.id.convertBritishPound) as EditText
        val shekels = Integer.parseInt(editText.text.toString())
        val pound = 4.4082
        val result = (shekels * pound).toFloat()
        Toast.makeText(this@MainActivity, result.toString(), Toast.LENGTH_LONG).show()
    }



}
