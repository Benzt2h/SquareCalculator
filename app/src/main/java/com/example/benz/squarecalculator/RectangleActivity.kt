package com.example.benz.squarecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_rectangle.*

class RectangleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        btnSum.setOnClickListener({
            if(edHeigth.text.toString()!=""&&edWidth.text.toString()!=""){
                tvSum.text=(edHeigth.text.toString().toDouble()*edWidth.text.toString().toDouble()).toString()+" ซม."
                Toast.makeText(this,"คำตอบเท่ากับ ${tvSum.text}", Toast.LENGTH_LONG).show()
            }else Toast.makeText(this,"ใส่ค่าที่ต้องการคำนวณก่อน", Toast.LENGTH_LONG).show()
        })
    }
}
