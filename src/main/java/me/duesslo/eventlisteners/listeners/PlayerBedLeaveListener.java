package me.duesslo.eventlisteners.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class PlayerBedLeaveListener implements Listener {


    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {
        Player p = event.getPlayer();
        p.sendMessage("wakey wakey it's wednesday... 3 HOURS AFTER YOUR ALARM?!?!?!?!?");
    }
}
