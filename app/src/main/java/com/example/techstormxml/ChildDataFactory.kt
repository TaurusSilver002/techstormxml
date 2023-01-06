package com.example.techstormxml

import java.util.*

object ChildDataFactory {


    fun getChildrenBrainTesasers() : List<ItemCard>{
        val children = mutableListOf<ItemCard>()

        children.add(ItemCard(R.drawable.image_1, "CODE-BEE"))
        children.add(ItemCard(R.drawable.image_2, "OMEGATRIX"))
        children.add(ItemCard(R.drawable.image_3, "WEB-O-LOGY"))
        return children
    }
    fun getChildrenideaPresentation() : List<ItemCard>{
        val children = mutableListOf<ItemCard>()

        children.add(ItemCard(R.drawable.image_2, "TECHNOMANIA"))
        children.add(ItemCard(R.drawable.image_5, " APP-MANIA"))

        return children
    }fun rovers() : List<ItemCard>{
        val children = mutableListOf<ItemCard>()

        children.add(ItemCard(R.drawable.image_3, "RO NAVIGATOR"))
        children.add(ItemCard(R.drawable.image_2, "RO SOCCER"))
        children.add(ItemCard(R.drawable.image_1, "RO COMBAT(light)"))
        children.add(ItemCard(R.drawable.image_4, "RO COMBAT(heavy)"))
        children.add(ItemCard(R.drawable.image_3, "RO- PUZZLE"))
        children.add(ItemCard(R.drawable.image_2, "RO-TERRANCE"))
        children.add(ItemCard(R.drawable.image_3, "POWER-PULL"))
        return children
    }fun games() : List<ItemCard>{
        val children = mutableListOf<ItemCard>()

        children.add(ItemCard(R.drawable.image_1, "FIFA"))
        children.add(ItemCard(R.drawable.image_2, "PES"))
        children.add(ItemCard(R.drawable.image_3, "KHET(Intra-College)"))
        return children
    }fun creativeevents() : List<ItemCard>{
        val children = mutableListOf<ItemCard>()

        children.add(ItemCard(R.drawable.image_5, " PASSION WITH REELS"))

        return children
    }
    fun gamesextra() : List<ItemCard>{
        val children = mutableListOf<ItemCard>()

        children.add(ItemCard(R.drawable.image_4, "VALORANT"))

        return children
    }
}