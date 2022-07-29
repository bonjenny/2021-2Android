package com.dongyang.final20202865

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDBHelper(var context: Context) : SQLiteOpenHelper (context, "ejhDB", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        var tableCreSql = "CREATE TABLE ejhTBL (videoId integer primary key autoincrement, video varchar(20), rank varchar(10), " +
                "time varchar(10), rate varchar(10), grade varchar(20), content varchar(200));"
        p0!!.execSQL(tableCreSql)
        p0!!.execSQL("INSERT INTO ejhTBL(video, rank, time, rate, grade, content) values ('타짜', '1', '139분', '9.2', '19', '범죄 정치계에서 잔뼈가 굵은 타짜 이철희와 이제 막 정치계에 입문한 초짜들이 각종 현안에 대해 성역 없는 이야기를 나누는 프로그램');")
        p0!!.execSQL("INSERT INTO ejhTBL(video, rank, time, rate, grade, content) values ('호빗:다섯군대전투', '2', '144분', '9.6', '모두', '판타지 빌보 배긴스, 참나무 방패 소린, 난쟁이 족이 떠난 거대한 여정 끝, 난쟁이 족은 원래 자신들의 터전이던 에레보르에 있는 엄청난 보물을 되찾지만 이는 무시무시한 용 스마우그가 호수마을의 무기력한 주민들을 공격하게 되는 결과를 낳는다.');")
        p0!!.execSQL("INSERT INTO ejhTBL(video, rank, time, rate, grade, content) values ('매트릭스', '3', '136분', '9.5', '모두', 'SF 키아누 리브스, 로렌스 피시번 출연');")
        p0!!.execSQL("INSERT INTO ejhTBL(video, rank, time, rate, grade, content) values ('엄지희', '4', '학번', '20202865', '나이 21', '재밌음');")
    }
    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0!!.execSQL("DROP TABLE if exists ejhTBL")
        onCreate(p0)
    }
}