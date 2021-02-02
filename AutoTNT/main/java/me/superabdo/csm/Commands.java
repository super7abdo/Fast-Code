package me.superabdo.csm;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    static Main plugin;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("tnt")) {

            if (plugin.ATNT == false){

                plugin.ATNT = true;

                p.sendMessage(ChatColor.GREEN + "Auto TNT Enabled!");

            }else{

                if (plugin.ATNT == true){

                    plugin.ATNT = false;

                    p.sendMessage(ChatColor.RED + "Auto TNT Disabled!");

                }
            }



        }
        return true;


    }
}
