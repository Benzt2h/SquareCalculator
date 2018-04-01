package com.example.benz.squarecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_square.*

class SquareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)

        btnSum.setOnClickListener({
            if (edNumber.text.toString() != "") {
                var number: Double = edNumber.text.toString().toDouble()
                tvSum.text = (number*number).toString()+" ซม."
                Toast.makeText(this,"คำตอบเท่ากับ ${tvSum.text}", Toast.LENGTH_LONG).show()
            }else Toast.makeText(this,"ใส่ค่าที่ต้องการคำนวณก่อน", Toast.LENGTH_LONG).show()
        })
    }
}
