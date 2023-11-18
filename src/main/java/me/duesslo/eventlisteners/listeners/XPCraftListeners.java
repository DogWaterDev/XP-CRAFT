package me.duesslo.eventlisteners.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;

public class XPCraftListeners implements Listener {
    @EventHandler
    public void onEXPchange(PlayerExpChangeEvent event) {
        Player p = event.getPlayer();
        int exp = p.getLevel();

        p.setMaxHealth(Math.floor(20 + exp/5));
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player p = event.getPlayer();
        p.setMaxHealth(20);
    }
}
