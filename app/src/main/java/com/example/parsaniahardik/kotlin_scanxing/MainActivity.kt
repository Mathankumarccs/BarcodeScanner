package com.example.parsaniahardik.kotlin_scanxing

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var btn: Button? = null
    private var submit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt1 = findViewById(R.id.tvresult) as EditText
        txt = findViewById(R.id.txt) as EditText
        submit=findViewById(R.id.submit) as Button
        btn = findViewById(R.id.btn) as Button

        btn!!.setOnClickListener {
            val intent = Intent(this, ScanActivity::class.java)
            startActivity(intent)
        }

        submit!!.setOnClickListener { val intent1=Intent(this,DBHelper::class.java)
        startActivity(intent1)
        }

    }

    companion object {

        var txt1: EditText? = null
        var txt: EditText? = null
    }
}
