package me.superabdo.csm;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin{


    public static Boolean ATNT = false;

    @Override
    public void onEnable() {

        getLogger().info("Auto TNT Enabled");

        getCommand("tnt").setExecutor(new Commands());

        getServer().getPluginManager().registerEvents(new Event(), this);

    }



}
