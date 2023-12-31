package me.duesslo.eventlisteners.listeners;


import me.duesslo.eventlisteners.EventListeners;
import me.duesslo.eventlisteners.EventListeners.*;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.ComponentLike;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.Style;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;



public class PlayerJoinListener implements Listener {
    @EventHandler
    public synchronized void onPlayerJoin(PlayerJoinEvent event) {

        System.out.println("A player has joined the server.");
        Player p = event.getPlayer();
        try {
            wait(500);

        } catch (InterruptedException e) {
            System.out.println("An error occured. \n Stack: \n" + e.getStackTrace());
        }
        event.joinMessage(Component.text("Hello " + event.getPlayer().getName() + "! Welcome to XP-Craft").color(NamedTextColor.GOLD).decorate(TextDecoration.BOLD, TextDecoration.UNDERLINED));

        try {
            wait(500);

        } catch (InterruptedException e) {
            System.out.println("An error occured. \n Stack: \n" + e.getStackTrace());
        }
        EventListeners.sendLinkMessage(p, Component.text("Michaelninder ---> YouTube").color(NamedTextColor.DARK_RED),"https://www.youtube.com/channel/UCuCufc0JqfTFMvLzhdDXeYQ");
        EventListeners.sendLinkMessage(p, Component.text("Michaelninder ---> TikTok").color(NamedTextColor.BLACK),"https://www.tiktok.com/@michaelninder?lang=de-DE");
        EventListeners.sendLinkMessage(p, Component.text("Duesslo (the magic man) ---> GitHub").color(NamedTextColor.DARK_PURPLE),"https://www.github.com/DogWaterDev");
    }
}
