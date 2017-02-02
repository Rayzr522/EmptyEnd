package com.rayzr522.emptyend;

import org.bukkit.World.Environment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Rayzr
 */
public class EmptyEnd extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onSpawn(CreatureSpawnEvent e) {
        if (e.getLocation().getWorld().getEnvironment() == Environment.THE_END && e.getSpawnReason() == SpawnReason.NATURAL || e.getSpawnReason() == SpawnReason.CHUNK_GEN) {
            e.setCancelled(true);
        }

    }

}
