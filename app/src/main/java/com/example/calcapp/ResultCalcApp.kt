package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result_calc_app.*

class ResultCalcApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_calc_app)

        val value1 = intent.getDoubleExtra("VALUE1",0.0)

        textView.text = "$value1"
    }
}