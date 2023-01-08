package com.example.techstormxml

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.imageview.ShapeableImageView

class CardAdapter(private val itemCardList: List<parentItemCard>) : RecyclerView.Adapter<CardAdapter.CardViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item1,parent,false)
        return CardViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentitem = itemCardList[position]
        holder.cardName.text = currentitem.title
        holder.recyclerView.apply {
            layoutManager = LinearLayoutManager(holder.recyclerView.context, RecyclerView.HORIZONTAL, false)
            adapter = CardChildAdapter(currentitem.children)

        }

    }

    override fun getItemCount(): Int {
        return itemCardList.size
    }
    class CardViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){
            val recyclerView : RecyclerView = itemView.findViewById(R.id.rv_child)
            var cardName : TextView = itemview.findViewById((R.id.tvOrderId))

    }

}