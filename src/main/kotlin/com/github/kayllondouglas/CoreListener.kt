package com.github.kayllondouglas

import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent

class CoreListener : Listener {

  fun onJoin(event: PlayerJoinEvent) {
    val player = event.getPlayer()
    player.sendMessage("")
  }

}
