package me.mooy1.infinityexpansion.utils;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;

import java.text.DecimalFormat;

public final class LoreUtils {

    public static final int SERVER_TICK = 20;

    public static final int CUSTOM_TICKER_DELAY = SlimefunPlugin.getCfg().getInt("URID.custom-ticker-delay");

    public static final float SERVER_TICK_RATIO = (float) SERVER_TICK / CUSTOM_TICKER_DELAY;

    private LoreUtils() {}

    public static String energyPerSecond(int energy) {
        return "&8\u21E8 &e\u26A1 &7" + format(Math.round(energy * SERVER_TICK_RATIO)) + " J/s";
    }
    public static String energyBuffer(int energy) {
        return "&8\u21E8 &e\u26A1 &7" + format(energy) + " Buffer";
    }

    public static String energyPer(int energy) {
        return "&8\u21E8 &e\u26A1 &7" + format(energy) + " J ";
    }

    public static String speed(int speed) {
        return "&8\u21E8 &b\u26A1 &7Speed: &b" + speed + 'x';
    }

    public static String storesItem(int amount) {
        return "&7Stores: &e" + format(amount) + " &7items";
    }

    public static String storedItems(int amount, int max) {
        return "&7Stored: &e" + format(amount) + " / " + max;
    }

    public static String storedItem(String id) {
        if (id == null || id.equals("")) {
            id = "None";
        }

        return "&7Item: &e" + id;
    }

    public static String roundHundreds(float number) {
        return format(Math.round(number * 100) / 100);
    }

    public static final DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###");

    public static String format(int number) {
        return decimalFormat.format(number);
    }
}