package com.dongyang.final20202865

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.videolist.*

class VideolistActivity : AppCompatActivity() {
    var sql = "select * from ejhTBL"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.videolist)
        this.setTitle("20202865 엄지희")

        var vlist : ArrayList<VideoC> = arrayListOf()
        var myHelper : MyDBHelper = MyDBHelper(this)

        var sqlDB = myHelper.readableDatabase
        var cursor = sqlDB.rawQuery(sql, null)
        while (cursor.moveToNext()) {
            vlist.add(
                VideoC(cursor.getInt(0), cursor.getString(1), cursor.getString(2),
                    cursor.getString(3), cursor.getString(4),
                    cursor.getString(5), cursor.getString(6)) )
        }
        cursor.close()
        sqlDB.close()

        var adapter1 = ListViewAdapter(vlist)
        listView1.adapter = adapter1
        listView1.setOnItemClickListener { adapterView, view, i, l ->
            var intent2 = Intent(applicationContext, JasehiActivity::class.java)
            intent2.putExtra("videoId", vlist.get(i).videoId.toString())
            intent2.putExtra("video", vlist.get(i).video)
            intent2.putExtra("content", vlist.get(i).content)
            startActivity(intent2)
        }

        rg.setOnCheckedChangeListener { group, checkedId ->
            if (rbRank.isChecked) {
                sql = "select * from ejhTBL order by rank"
                var vlist : ArrayList<VideoC> = arrayListOf()
                var myHelper : MyDBHelper = MyDBHelper(this)

                var sqlDB = myHelper.readableDatabase
                var cursor = sqlDB.rawQuery(sql, null)
                while (cursor.moveToNext()) {
                    vlist.add(
                        VideoC(cursor.getInt(0), cursor.getString(1), cursor.getString(2),
                            cursor.getString(3), cursor.getString(4),
                            cursor.getString(5), cursor.getString(6)) )
                }
                cursor.close()
                sqlDB.close()

                var adapter1 = ListViewAdapter(vlist)
                listView1.adapter = adapter1
                listView1.setOnItemClickListener { adapterView, view, i, l ->
                    var intent2 = Intent(applicationContext, JasehiActivity::class.java)
                    intent2.putExtra("videoId", vlist.get(i).videoId.toString())
                    intent2.putExtra("video", vlist.get(i).video)
                    intent2.putExtra("content", vlist.get(i).content)
                    startActivity(intent2)
                }
            }
            else {
                sql = "select * from ejhTBL order by rate DESC"
                var vlist : ArrayList<VideoC> = arrayListOf()
                var myHelper : MyDBHelper = MyDBHelper(this)

                var sqlDB = myHelper.readableDatabase
                var cursor = sqlDB.rawQuery(sql, null)
                while (cursor.moveToNext()) {
                    vlist.add(
                        VideoC(cursor.getInt(0), cursor.getString(1), cursor.getString(2),
                            cursor.getString(3), cursor.getString(4),
                            cursor.getString(5), cursor.getString(6)) )
                }
                cursor.close()
                sqlDB.close()

                var adapter1 = ListViewAdapter(vlist)
                listView1.adapter = adapter1
                listView1.setOnItemClickListener { adapterView, view, i, l ->
                    var intent2 = Intent(applicationContext, JasehiActivity::class.java)
                    intent2.putExtra("videoId", vlist.get(i).videoId.toString())
                    intent2.putExtra("video", vlist.get(i).video)
                    intent2.putExtra("content", vlist.get(i).content)
                    startActivity(intent2)
                }
            }
        }
    }
}