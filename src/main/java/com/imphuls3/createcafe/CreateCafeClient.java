package com.imphuls3.createcafe;

import net.fabricmc.api.ClientModInitializer;

public class CreateCafeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Client-side initialization
        CreateCafe.LOGGER.info("Create Cafe client initialized!");
    }
}
