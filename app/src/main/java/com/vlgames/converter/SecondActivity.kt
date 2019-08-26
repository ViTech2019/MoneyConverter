package com.vlgames.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    //get dollar from shekel
    fun convertShekelToDollar(view: View) {
        val editText = findViewById<View>(R.id.convertDollar) as EditText
        val shekels = Integer.parseInt(editText.text.toString())
        val dollar = 3.5369
        val result = (shekels / dollar).toFloat()
        Toast.makeText(this@SecondActivity, result.toString(), Toast.LENGTH_LONG).show()
    }
    // get euro from shekel
    fun convertShekelToEuro(view: View) {
        val editText = findViewById<View>(R.id.convertEuro) as EditText
        val shekels = Integer.parseInt(editText.text.toString())
        val euro = 3.9668
        val result = (shekels / euro).toFloat()
        Toast.makeText(this@SecondActivity, result.toString(), Toast.LENGTH_LONG).show()
    }
    //get pound from shekel
    fun convertShekelToBritishPound(view: View) {
        val editText = findViewById<View>(R.id.convertBritishPound) as EditText
        val shekels = Integer.parseInt(editText.text.toString())
        val pound = 4.4082
        val result = (shekels / pound).toFloat()
        Toast.makeText(this@SecondActivity, result.toString(), Toast.LENGTH_LONG).show()
    }
}
