package com.github.kayllondouglas

import cn.nukkit.plugin.PluginBase
import com.github.kayllondouglas.command.FactionCommand

class Core : PluginBase() {

    override fun onEnable() {
        dataFolder.mkdirs()
        this.server.commandMap.register("f", FactionCommand())
        logger.info("§aTempestCore is now enabled, version [" + description.version + "].")
    }

    override fun onDisable() {
        logger.info("§cTempestCore is now disabled.")
    }

    companion object {
        val instance = this
    }
}
