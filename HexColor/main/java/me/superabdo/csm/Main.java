package me.superabdo.csm;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin{



    @Override
    public void onEnable() {

        getLogger().info("HexColor Enabled");

        getServer().getPluginManager().registerEvents(new Event(), this);

    }



}
