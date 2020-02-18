package com.abjayon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i("Main Activity", "This is test log.")

            Toast.makeText(this, "Button1 was clicked.", Toast.LENGTH_SHORT).show()
        }

        btnSendMsgToNextActivity.setOnClickListener{
            val message = etUserMessage.text.toString()
//            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            //explicit intent
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("userMsg", message) //send data to Second Activity
            startActivity(intent)

        }
    }
}
