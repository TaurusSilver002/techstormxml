package com.example.techstormxml

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.BaseAdapter
import android.widget.ImageView

class galleryAdapter(var context: Context , var arrayList: ArrayList<galleryitem>) : BaseAdapter(){


    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
   }

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getView(position: Int, convertView: View?, parent:ViewGroup?): View {
        var view:View = View.inflate(context ,R.layout.photolist , null)
        var icons:ImageView =view.findViewById(R.id.gallery)
        var galleryitem:galleryitem=arrayList.get(position)
        icons.setImageResource(galleryitem.icons!!)
        return view
    }
}