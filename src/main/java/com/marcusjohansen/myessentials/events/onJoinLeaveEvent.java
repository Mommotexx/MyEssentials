package com.marcusjohansen.myessentials.events;

import com.marcusjohansen.myessentials.MyEssentials;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

public class onJoinLeaveEvent implements Listener {
    Plugin plugin = MyEssentials.getPlugin(MyEssentials.class);
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        String joinmessage = plugin.getConfig().getString("custom-join-message");
        if(!joinmessage.equals("none")) {
            e.setJoinMessage(ChatColor.YELLOW + joinmessage);
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        String leavemessage = plugin.getConfig().getString("custom-quit-message");
        if(!leavemessage.equals("none")) {
            e.setQuitMessage(ChatColor.YELLOW + leavemessage);
        }
    }

}
