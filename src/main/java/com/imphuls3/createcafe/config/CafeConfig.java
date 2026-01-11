package com.imphuls3.createcafe.config;

/**
 * Simple configuration class for Create Cafe.
 * In a production mod, this would use Cloth Config or similar.
 */
public class CafeConfig {
    // Default values
    public static boolean giveEmptyCups = true;
    public static int effectDuration = 10; // in seconds

    public static boolean shouldGiveEmptyCups() {
        return giveEmptyCups;
    }

    public static int getEffectDuration() {
        return effectDuration;
    }

    public static int getEffectDurationTicks() {
        return effectDuration * 20;
    }
}
