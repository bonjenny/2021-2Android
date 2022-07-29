package com.dongyang.final20202865

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setTitle("20202865 엄지희")

        button1.setOnClickListener {
            var intent1 = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(intent1)
        }
        button2.setOnClickListener {
            var intent1 = Intent(applicationContext, VideolistActivity::class.java)
            startActivity(intent1)
        }
    }
}
