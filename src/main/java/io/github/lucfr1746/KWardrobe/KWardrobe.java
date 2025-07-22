package io.github.lucfr1746.KWardrobe;

import io.github.lucfr1746.KWardrobe.Metrics.UpdateChecker;
import io.github.lucfr1746.KWardrobe.Metrics.bStatsMetrics;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class KWardrobe extends JavaPlugin {

    private static KWardrobe plugin;

    @Override
    public void onEnable() {
        plugin = this;
    // Metrics
        new UpdateChecker(this);
        new bStatsMetrics(this, 26382);
    }

    @Override
    public void onDisable() {
    }

    public static Plugin getInstance() {
        return plugin;
    }
}
