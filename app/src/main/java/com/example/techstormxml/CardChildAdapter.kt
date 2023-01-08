package com.example.techstormxml

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView


class CardChildAdapter(private val itemCardList : List<ItemCard>) : RecyclerView.Adapter<CardChildAdapter.CardChildViewHolder>(){
//
//    private lateinit var mListener : onItemClickListener
//
//    interface onItemClickListener{
//
//        fun onItemClick(position : Int)
//
//    }
//    fun setOnItemClickListener(listener: onItemClickListener){
//
//        mListener = listener
//
//    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  CardChildViewHolder{
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return CardChildViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CardChildViewHolder, position: Int) {
        val currentitem = itemCardList[position]
        holder.titleImage.setImageResource(currentitem.titleImage)
        holder.cardName.text = currentitem.strng
        holder.itemView.setOnClickListener {
            val a = currentitem.strng
            val bundle = Bundle()
            val browserIntent : Intent
            if (currentitem.strng=="CODE-BEE") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.google.com"))
            }
            else{
                browserIntent =Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.w3schools.com"))
            }

            startActivity(it!!.context,browserIntent,bundle)
            Toast.makeText(it!!.context, "You Clicked $a", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return itemCardList.size
    }
    class CardChildViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){
        var titleImage : ShapeableImageView = itemview.findViewById((R.id.title_image))
        var cardName : TextView = itemview.findViewById(R.id.cardName)



        }



}