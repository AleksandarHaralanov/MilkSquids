package com.haralanov.milksquids;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.Material;
import org.bukkit.entity.Squid;

public class PlayerInteractEntityListener implements Listener {

    @EventHandler
    public void onPlayerInteractWithEntity(PlayerInteractEntityEvent event) {
        if (event.getPlayer().getInventory().getItemInHand().getType() == Material.BUCKET && event.getRightClicked() instanceof Squid) {
            event.getPlayer().getInventory().getItemInHand().setType(Material.MILK_BUCKET);
        }
    }
}