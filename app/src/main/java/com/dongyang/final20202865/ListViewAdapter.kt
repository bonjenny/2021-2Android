package com.dongyang.final20202865

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.rowitem.view.*

class ListViewAdapter(var vlist: ArrayList<VideoC>) : BaseAdapter() {
    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var rowItemView = view
        if (rowItemView == null) {
            rowItemView = View.inflate(parent?.context, R.layout.rowitem, null)
        }
        val video1 = vlist[position]
        val sajinResid = parent!!.resources.getIdentifier("com.dongyang.final20202865:drawable/s"+video1.videoId.toString(), null, null)
        rowItemView!!.itemImage.setImageResource(sajinResid)
        rowItemView.itemRank.text = "순위 "+video1.rank
        rowItemView.itemVideo.text = "영화제목 "+video1.video
        rowItemView.itemGrade.text = "등급 "+video1.grade
        rowItemView.itemTime.text = "러닝타임 "+video1.time
        rowItemView.itemRate.text = "평점 "+video1.rate

        return rowItemView
    }
    override fun getItem(p0: Int): Any { return vlist[p0] }
    override fun getItemId(p0: Int): Long { return p0.toLong() }
    override fun getCount(): Int { return vlist.size }
}