package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/emulator.properties"})
public interface MobileConfig extends Config {

    @Key("serverUrl")
    String serverUrl();

    @Key("appUrl")
    String appUrl();

    @Key("appPath")
    String appPath();
}