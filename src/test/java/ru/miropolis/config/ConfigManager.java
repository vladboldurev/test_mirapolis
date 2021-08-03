package ru.miropolis.config;

import org.aeonbits.owner.ConfigCache;

public class ConfigManager {

    public static ServerConfig getServerConfig() {
        return ConfigCache.getOrCreate(ServerConfig.class);
    }

    public static AccountConfig getAccountManager() {
        return ConfigCache.getOrCreate(AccountConfig.class);
    }

}