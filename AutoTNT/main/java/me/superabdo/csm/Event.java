package me.superabdo.csm;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class Event implements Listener {

    Main plugin;


    @EventHandler
    public void onPlace(BlockPlaceEvent e){


        Player p = e.getPlayer();

        Block tnt = (Block) e.getBlock();

        if (tnt.getType() == Material.TNT) {

            if (plugin.ATNT == true) {

                e.setCancelled(true);

                World wo = p.getWorld();

                wo.spawnEntity(tnt.getLocation(), EntityType.PRIMED_TNT);

            } else
                {
                return;
            }
        }
    }
}
