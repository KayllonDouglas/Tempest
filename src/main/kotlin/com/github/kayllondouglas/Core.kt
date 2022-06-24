package com.github.kayllondouglas

import cn.nukkit.plugin.PluginBase
import com.github.kayllondouglas.command.FactionCommand
import com.github.kayllondouglas.faction.FactionManager

class Core : PluginBase() {

    private lateinit var factionManager: FactionManager

    override fun onEnable() {
        dataFolder.mkdirs()
        this.server.commandMap.register("f", FactionCommand())
        initManagers()
        logger.info("§aTempestCore is now enabled, version [" + description.version + "].")
    }

    private fun initManagers() {
        factionManager = FactionManager(this)
    }

    override fun onDisable() {
        logger.info("§cTempestCore is now disabled.")
    }

}
