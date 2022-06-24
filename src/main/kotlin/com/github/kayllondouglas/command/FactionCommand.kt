package com.github.kayllondouglas.command

import cn.nukkit.Player
import cn.nukkit.command.Command
import cn.nukkit.command.CommandSender

class FactionCommand() : Command("f") {

    override fun execute(sender: CommandSender?, label: String?, args: Array<String>?): Boolean {
        if (sender !is Player) return false
        val player = sender as? Player
        player?.sendMessage("test")
        return true;
    }

}
