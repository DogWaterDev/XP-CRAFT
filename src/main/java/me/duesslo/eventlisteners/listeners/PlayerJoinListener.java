package me.duesslo.eventlisteners.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        System.out.println("A player has joined the server.");
        event.setJoinMessage("Hello! Welcome to XP-Craft.");
    }
}
