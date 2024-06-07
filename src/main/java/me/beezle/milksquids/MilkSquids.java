package me.beezle.milksquids;

import org.bukkit.plugin.java.JavaPlugin;

public class MilkSquids extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EntityHandler(), this);
        System.out.print("[MilkSquids v1.0.0] Enabled.");
    }

    @Override
    public void onDisable() {
        System.out.print("[MilkSquids v1.0.0] Disabled.");
    }
}