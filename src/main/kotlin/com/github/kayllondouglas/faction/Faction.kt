package com.github.kayllondouglas.faction

import java.util.UUID

data class Faction(
    val tag: String,
    val description: String,
    var members: HashMap<UUID, FactionMember>
)
