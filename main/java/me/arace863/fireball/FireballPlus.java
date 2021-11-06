package me.arace863.fireball;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class FireballPlus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&b[Fireballs+]&r &ahas been enabled on version " + this.getDescription().getVersion() + ", &cMade by ARace863"));

        this.getServer().getPluginManager().registerEvents(new FireballEvent(this), this);

        this.saveDefaultConfig();

        Cooldown.setupCooldown();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
