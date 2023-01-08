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
            else if (currentitem.strng=="OMEGATRIX") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.yahoo.com"))
            }
            else if (currentitem.strng=="OMEGATRIX") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.filehippo.com"))
            }
            else if (currentitem.strng=="WEB-O-LOGY") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.geeksforgeeks.com"))
            }
            else if (currentitem.strng=="TECHNOMANIA") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.leetcode.com"))
            }
            else if (currentitem.strng=="APP-MANIA") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.linkedin.com"))
            }
            else if (currentitem.strng=="RO NAVIGATOR") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.twitter.com"))
            }
            else if (currentitem.strng=="RO SOCCER") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.youtube.com"))
            }
            else if (currentitem.strng=="RO COMBAT(light)") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.instagram.com"))
            }
            else if (currentitem.strng=="RO COMBAT(light)") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.facebbok.com"))
            }
            else if (currentitem.strng=="RO COMBAT(heavy)") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.microsoft.com"))
            }
            else if (currentitem.strng=="RO-PUZZLE") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.pininterest.com"))
            }
            else if (currentitem.strng=="RO-TERRANCE") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.nasa.com"))
            }
            else if (currentitem.strng=="POWER PULL") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://dev-koushikdas.github.io/techstorm2.23/index.html"))
            }
            else if (currentitem.strng=="POWER PULL") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://dev-koushikdas.github.io/techstorm2.23/index.html"))
            }
            else if (currentitem.strng=="FIFA") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://dev-koushikdas.github.io/techstorm2.23/index.html"))
            }
            else if (currentitem.strng=="PES") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://dev-koushikdas.github.io/techstorm2.23/index.html"))
            }
            else if (currentitem.strng=="PASSION WITH REELS") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://dev-koushikdas.github.io/techstorm2.23/index.html"))
            }
            else{
                browserIntent =Intent(Intent.ACTION_VIEW, Uri.parse("https://dev-koushikdas.github.io/techstorm2.23/index.html"))
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