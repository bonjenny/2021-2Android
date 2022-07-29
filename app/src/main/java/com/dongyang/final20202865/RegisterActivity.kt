package com.dongyang.final20202865

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        this.setTitle("20202865 엄지희")

        rButton1.setOnClickListener {
            var video = edVideo.text.toString()
            var rank = edRank.text.toString()
            var time = edTime.text.toString()
            var rate = edRate.text.toString()
            var grade = edGrade.text.toString()
            var content = edContent.text.toString()

            var myHelper = MyDBHelper(this)
            var sqlDB = myHelper.writableDatabase
            var insertSql = "insert into ejhTBL(video, rank, time, rate, grade, content) values ('"+video+"','"+rank+"','"+time+"','"+rate+"','"+grade+"','"+content+"');"
            sqlDB.execSQL(insertSql)

            Toast.makeText(applicationContext, "Insert OK", Toast.LENGTH_SHORT).show()
            sqlDB.close()
        }

        rButton2.setOnClickListener {
            edVideo.setText("")
            edRank.setText("")
            edTime.setText("")
            edRate.setText("")
            edGrade.setText("")
            edContent.setText("")
        }
    }
}