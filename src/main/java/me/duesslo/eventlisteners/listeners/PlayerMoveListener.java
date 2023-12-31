package me.duesslo.eventlisteners.listeners;
import me.duesslo.Parkour;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
public class PlayerMoveListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent ev) {
        Player player = ev.getPlayer();
        Block from = ev.getFrom().getBlock();
        Block to = ev.getTo().getBlock();
        if (Parkour.c1.getNearbyPlayers(5).contains(player)) {
            Parkour.c1.isEnabled = true;
        }
        if (Parkour.c1.getNearbyPlayers(2).contains(player)) {
            Parkour.c2.isEnabled = true;
        }
    }
}
