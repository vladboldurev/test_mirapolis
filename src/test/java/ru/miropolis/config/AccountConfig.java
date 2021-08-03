package ru.miropolis.config;

import org.aeonbits.owner.Config;


@Config.Sources({"classpath:config/AccountConfig.properties",})
public interface AccountConfig  extends Config{
    @DefaultValue("")
    String login();

    @DefaultValue("")
    String password();

}
