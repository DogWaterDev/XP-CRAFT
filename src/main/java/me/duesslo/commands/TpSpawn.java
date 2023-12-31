package me.duesslo.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpSpawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage("Welcome to Spawn Island, " + sender.getName());
        Player p = Bukkit.getPlayer(sender.getName());
        p.teleport(new Location(p.getWorld(),-162, 252, 114));
        return true;
    }
}
