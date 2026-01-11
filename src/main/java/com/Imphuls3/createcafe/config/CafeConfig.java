package com.Imphuls3.createcafe.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.Imphuls3.createcafe.CreateCafe;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class CafeConfig {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path CONFIG_PATH = FabricLoader.getInstance().getConfigDir().resolve("createcafe.json");

    public static boolean giveEmptyCups = true;
    public static int effectDuration = 10;

    public static void load() {
        if (Files.exists(CONFIG_PATH)) {
            try (Reader reader = Files.newBufferedReader(CONFIG_PATH)) {
                ConfigData data = GSON.fromJson(reader, ConfigData.class);
                if (data != null) {
                    giveEmptyCups = data.giveEmptyCups;
                    effectDuration = Math.max(0, data.effectDuration);
                }
            } catch (IOException | JsonSyntaxException e) {
                CreateCafe.LOGGER.warn("Failed to read config, using defaults.", e);
            }
        } else {
            save();
        }
    }

    public static void save() {
        ConfigData data = new ConfigData(giveEmptyCups, effectDuration);
        try (Writer writer = Files.newBufferedWriter(CONFIG_PATH)) {
            GSON.toJson(data, writer);
        } catch (IOException e) {
            CreateCafe.LOGGER.warn("Failed to write config.", e);
        }
    }

    private static class ConfigData {
        boolean giveEmptyCups;
        int effectDuration;

        ConfigData(boolean giveEmptyCups, int effectDuration) {
            this.giveEmptyCups = giveEmptyCups;
            this.effectDuration = effectDuration;
        }
    }
}
