package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import com.google.android.material.snackbar.Snackbar
import android.widget.Button



class MainActivity : AppCompatActivity(), View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {


        val intent = Intent(this, ResultCalcApp::class.java)

        if((editText1.text.length!=0&&editText1.text.toString()!="."&&editText1.text.toString()!="-")&&(editText2.text.length!=0&&editText2.text.toString()!="."&&editText2.text.toString()!="-")) {


            var num1:kotlin.Double=editText1.text.toString().toDouble()
            var num2:kotlin.Double=editText2.text.toString().toDouble()

            when (v.id) {
                R.id.button1 -> intent.putExtra("VALUE1", num1 + num2)
                R.id.button2 -> intent.putExtra("VALUE1", num1 - num2)
                R.id.button3 -> intent.putExtra("VALUE1", num1 * num2)
                R.id.button4 -> intent.putExtra("VALUE1", num1 / num2)
            }

            startActivity(intent)
        }
        else{Snackbar.make(v, "何か数値を入力してください", Snackbar.LENGTH_INDEFINITE)
            .setAction("Action"){
                Log.d("UI_PARTS", "Snackbarをタップした")
            }.show()}




    }
}