package me.duesslo.commands;

import me.duesslo.eventlisteners.EventListeners;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class Discord implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        EventListeners.sendLinkMessage(Bukkit.getPlayer(commandSender.getName()),Component.text("Zum Discord-Server", TextColor.color(30, 30, 255)), "https://discord.gg/EbBQgzXQsF");
        return true;
    }
}
