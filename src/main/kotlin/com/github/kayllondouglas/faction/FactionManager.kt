package com.github.kayllondouglas.faction

import com.github.kayllondouglas.Core
import java.util.UUID

class FactionManager(core: Core) {

    object FactionsMap : HashMap<String, Faction>()

    fun getFaction(name: String): Faction? = FactionsMap[name]

    fun deleteFaction(name: String) = FactionsMap.remove(name)

    fun getTag(name: String) = getFaction(name)?.tag

    fun getMember(name: String, uuid: UUID) = getFaction(name)?.members?.get(uuid)

    fun getMemberRole(factionName: String, uuid: UUID) = getFaction(factionName)?.members?.get(uuid)?.role

}