package com.github.kayllondouglas

import cn.nukkit.utils.Config
import cn.nukkit.plugin.PluginBase

import java.io.File

class Main : PluginBase() {

  var configuration: Config? = null

  override fun onEnable() {
    this.getDataFolder().mkdirs()
    configuration = Config(File(this.getDataFolder(), "Configuration.json"), Config.JSON)
    this.getLogger().info("§aTempestCore is now enabled, version [" + this.getDescription().getVersion() + "].")
  }

  override fun onDisable() {
    this.getLogger().info("§cTempestCore is now disabled.")
  }
  
}
