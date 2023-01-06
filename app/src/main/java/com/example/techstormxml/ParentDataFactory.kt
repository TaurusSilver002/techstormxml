package com.example.techstormxml

import java.util.*

object ParentDataFactory {

    fun getParents() : List<parentItemCard>{
        val parents = mutableListOf<parentItemCard>()

        parents.add(parentItemCard("BRAIN TEASER", ChildDataFactory.getChildrenBrainTesasers()))
            parents.add(parentItemCard("IDEA PRESENTATION", ChildDataFactory.getChildrenideaPresentation()))
            parents.add(parentItemCard("ROVERS", ChildDataFactory.rovers()))
            parents.add(parentItemCard("GAMES", ChildDataFactory.games()))
            parents.add(parentItemCard("CREATIVE EVENTS", ChildDataFactory.creativeevents()))
            parents.add(parentItemCard("GAMES-EXTRA", ChildDataFactory.gamesextra()))

        return parents
    }
}