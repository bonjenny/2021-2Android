package com.dongyang.final20202865

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.jasehi.*

class JasehiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jasehi)
        this.setTitle("20202865 엄지희")

        var intent2 = getIntent()
        jVideo.text = intent2.getStringExtra("video")
        jContent.text = intent2.getStringExtra("content")
        var videoId = intent2.getStringExtra("videoId")
        var src = resources.getIdentifier("com.dongyang.final20202865:drawable/s"+videoId, null, null)
        jImage.setImageResource(src)
    }
}