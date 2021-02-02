package me.superabdo.csm;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Event implements Listener {

    Main plugin;


    @EventHandler
    public void HexChat(AsyncPlayerChatEvent e){

        e.setMessage(ChatColor.Hex(e.getPlayer(), e.getMessage()));

        e.setMessage(ChatColor.colorize(e.getPlayer(), e.getMessage()));


    }

}
