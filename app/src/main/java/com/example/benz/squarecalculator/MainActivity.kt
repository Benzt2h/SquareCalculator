package com.example.benz.squarecalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSquare.setOnClickListener(this)
        btnRectangle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var intent : Intent
        if(v == btnSquare){
            intent = Intent(this, SquareActivity::class.java)
            startActivity(intent)
        }else if(v == btnRectangle){
            intent = Intent(this, RectangleActivity::class.java)
            startActivity(intent)
        }
        /*when (v?.id){
            R.id.btnSquare ->{
                intent = Intent(this, SquareActivity::class.java)
                startActivity(intent)
            }
            else ->{
                intent = Intent(this, RectangleActivity::class.java)
                startActivity(intent)
            }
        }*/
    }
}
