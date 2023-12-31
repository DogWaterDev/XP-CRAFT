package me.duesslo.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.io.BukkitObjectInputStream;

public class Jail implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!sender.hasPermission("duesslo.jail")) {
            return false;
        }

        Player prisoner = null;
        try {
            prisoner = Bukkit.getPlayer(String.valueOf(args[0]));
        } catch (Exception e) {
            System.out.println("Player " + sender + "attempted to use command 'Jail', but target was not found.");
            sender.sendMessage("bro wtf that person doesnt exist");
        }
        try {
            if (!(prisoner == null)) {
                prisoner.teleport(new Location(Bukkit.getWorld("Build"), 84, -29, 353));
                prisoner.setOp(false);
            }
        } catch (Exception e) {
            System.out.println("Error occured. Stack trace: " + e.getStackTrace());
        }


        return true;
    }
}
