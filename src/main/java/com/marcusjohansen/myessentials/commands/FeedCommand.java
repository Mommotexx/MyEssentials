package com.marcusjohansen.myessentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("myessentials.feed")) {
                p.setFoodLevel(20);
                p.sendMessage(ChatColor.GREEN + "Your hunger has been restored");
            } else {
                p.sendMessage(ChatColor.RED + "You don't have the required permission to use this command!");
            }

        }
        return true;
    }
}
