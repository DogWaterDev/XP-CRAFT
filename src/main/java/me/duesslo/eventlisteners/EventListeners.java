package me.duesslo.eventlisteners;

import me.duesslo.commands.*;
import me.duesslo.eventlisteners.listeners.*;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.event.ClickEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class EventListeners extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin has started...");

        getServer().getPluginManager().registerEvents(new XPCraftListeners(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerBedLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerMoveListener(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        getServer().getPluginManager().registerEvents(new HangingBreakByEntityListener(), this);
        Objects.requireNonNull(getCommand("spawn")).setExecutor(new TpSpawn());
        Objects.requireNonNull(getCommand("joke")).setExecutor(new TellJoke());
        Objects.requireNonNull(getCommand("jail")).setExecutor(new Jail());
        Objects.requireNonNull(getCommand("duesslo")).setExecutor(new Duesslo());
        Objects.requireNonNull(getCommand("discord")).setExecutor(new Discord());
        Objects.requireNonNull(getCommand("tutorial")).setExecutor(new Tutorial());
        //getCommand("afk").setExecutor(new Afk());
        Objects.requireNonNull(getCommand("recipes")).setExecutor(new Recipes());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Duesslo's XP-Craft is stopping....");
    }

    public static void sendLinkMessage(Player player, Component text, String url) {
        TextComponent msgc = (TextComponent) text;
        msgc = msgc.clickEvent(ClickEvent.clickEvent(ClickEvent.Action.OPEN_URL,url));
        player.sendMessage(msgc);
    }
}
