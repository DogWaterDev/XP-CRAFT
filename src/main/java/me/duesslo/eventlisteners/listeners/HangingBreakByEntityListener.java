package me.duesslo.eventlisteners.listeners;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;

import java.awt.*;

public class HangingBreakByEntityListener implements Listener {
    @EventHandler
    public void onBreak(HangingBreakByEntityEvent event) {
        System.out.println("hanging break event");
        if (event.getRemover() instanceof Player) {
            Player p = (Player) event.getRemover();
            if (p.getGameMode() == GameMode.ADVENTURE) {
                p.sendMessage(Component.text("You are not allowed to break this block!", TextColor.color(255, 0, 0)));
                event.setCancelled(true);
            }
        }



    }
}
