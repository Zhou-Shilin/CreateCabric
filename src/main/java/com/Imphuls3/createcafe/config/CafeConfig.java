package com.Imphuls3.createcafe.config;

/**
 * Configuration for Create Cafe mod.
 * For Fabric, we use simple static values that could be extended with a config library.
 */
public class CafeConfig {
    // Whether drinks should give empty cups after drinking them
    public static boolean giveEmptyCups = true;
    
    // The duration of the effect that drinks give (in seconds)
    public static int effectDuration = 10;

    public static void init() {
        // Configuration initialization
        // In a full implementation, this would load from a config file
    }
}
