package me.duesslo.commands;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TellJoke implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage(Component.text("Here's your joke," + sender.getName() + ".").color(NamedTextColor.DARK_GREEN));
        sender.sendMessage(Component.text("Why did the chicken cross the road?").color(NamedTextColor.WHITE));
        sender.sendMessage(Component.text("To get to the idiot's house.").color(NamedTextColor.DARK_RED));
        sender.sendMessage(Component.text("Knock Knock, buddy.").color(NamedTextColor.GOLD));
        return true;
    }
}
