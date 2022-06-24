package com.github.kayllondouglas.faction

import java.util.*

class FactionManager() {
    companion object {

        object FactionsMap : HashMap<String, Faction>()

        fun getFaction(name: String) = FactionsMap[name]

        fun deleteFaction(name: String) = FactionsMap.remove(name)

        fun createFaction(name: String, faction: Faction) = FactionsMap.put(name, faction)

        fun getTag(name: String) = getFaction(name)?.tag

        fun getMember(name: String, uuid: UUID) = getFaction(name)?.members?.get(uuid)

        fun getMemberRole(factionName: String, uuid: UUID) = getFaction(factionName)?.members?.get(uuid)?.role
    }
}