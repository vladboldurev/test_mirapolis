package ru.miropolis.config;

import org.aeonbits.owner.Config;


@Config.Sources({"classpath:config/ServerConfig.properties",})
public interface ServerConfig  extends Config{
    @DefaultValue("true")
    boolean fastSetValue();

    @DefaultValue("")
    String baseUrl();

    @DefaultValue("chrome")
    String browser();

    @DefaultValue("1400x900")
    String browserSize();

}
