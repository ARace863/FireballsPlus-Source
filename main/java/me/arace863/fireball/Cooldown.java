/*
  Made by ARace863

  This plugin is protected by the Apache 2.0 License
  You may not repost this plugin or sell it by any means.
 */

package me.arace863.fireball;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class Cooldown {
    public static HashMap<UUID, Double> cooldowns;

    public Cooldown() {
    }

    public static void setupCooldown() {
        cooldowns = new HashMap();
    }

    public static void setCooldown(Player player, int seconds) {
        double delay = (double)(System.currentTimeMillis() + (long)(seconds * 1000));
        cooldowns.put(player.getUniqueId(), delay);
    }

    public static boolean checkCooldown(Player player) {
        return !cooldowns.containsKey(player.getUniqueId()) || (Double)cooldowns.get(player.getUniqueId()) <= (double)System.currentTimeMillis();
    }
}
