package com.logzinga.crouchdeath;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class CrouchDeath extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
        public void onPlayerSneak(PlayerToggleSneakEvent e){
            Player player = e.getPlayer();
            player.setHealth(0);
            player.sendMessage(ChatColor.RED + "dont sneak asshole");
    }


}
