package com.app.textviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a="value"
        val b=intent.getStringExtra(a)
        val c=findViewById<TextView>(R.id.Output)
        c.text=b

    }

    val a = "value"
    fun Input(views: View){
        val id=findViewById<TextView>(R.id.Input)
        val p=id.text.toString()
        val intkeActivity=Intent(this, MainActivity::class.java)
        intkeActivity.apply { putExtra(a,p) }
        startActivity(intkeActivity)

    }
}