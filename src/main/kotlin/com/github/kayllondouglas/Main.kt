package com.github.kayllondouglas;

import cn.nukkit.plugin.PluginBase

class Main: PluginBase() {
  
  override fun onEnable() {
    this.getLogger().info("§aTempestCore is now enabled, version [" + this.getDescription().getVersion() + "]") 
  }

}
