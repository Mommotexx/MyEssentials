package com.marcusjohansen.myessentials;

import com.marcusjohansen.myessentials.commands.FeedCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("feed").setExecutor(new FeedCommand());
    }

}
