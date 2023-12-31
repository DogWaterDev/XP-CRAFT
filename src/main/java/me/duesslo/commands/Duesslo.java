package me.duesslo.commands;

import com.destroystokyo.paper.ParticleBuilder;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.Style;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Duesslo implements CommandExecutor {
    @Override
    public synchronized boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = Bukkit.getPlayer("Duesslo");
        p.displayName(Component.text("Funny Magic Man").color(NamedTextColor.GOLD));
        p.customName(Component.text("Funny Magic Man").color(NamedTextColor.DARK_GREEN).style(Style.style(TextDecoration.BOLD)));
        p.playerListName(Component.text("Duesslo").color(NamedTextColor.DARK_RED).style(Style.style(TextDecoration.OBFUSCATED)));   
        return true;
        }
    }
