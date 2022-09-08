package com.marcusjohansen.myessentials;

import com.marcusjohansen.myessentials.commands.FeedCommand;
import com.marcusjohansen.myessentials.events.onJoinLeaveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyEssentials extends JavaPlugin{

    @Override
    public void onEnable() {
        //Runs on server startup
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new onJoinLeaveEvent(), this);

        getCommand("feed").setExecutor(new FeedCommand());
    }

}
