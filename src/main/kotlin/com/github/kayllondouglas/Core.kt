package com.github.kayllondouglas

import cn.nukkit.plugin.PluginBase
import com.github.kayllondouglas.CoreListener

class Core : PluginBase() {

  override fun onEnable() {
    server.pluginManager.registerEvents(CoreListener(), this)
    dataFolder.mkdirs()
    logger.info("§aTempestCore is now enabled, version [" + description.version + "].")
  }

  override fun onDisable() {
    logger.info("§cTempestCore is now disabled.")
  }
}
