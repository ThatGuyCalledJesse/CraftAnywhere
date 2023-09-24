package com.jesse.craftanywhere;

import org.bukkit.plugin.java.JavaPlugin;

public final class CraftAnywhere extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[CA] CraftAnywhere is enabled!");
        this.getCommand("craft").setExecutor(new CraftCommand());
        this.getCommand("enchanting").setExecutor(new EnchantCommand());
    }

}
