package com.minecolonies.minecoloniesbot.modules.core.config;

import com.minecolonies.minecoloniesbot.qsml.BaseConfig;
import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

/**
 * The core section of the main config file.
 */
@ConfigSerializable
public class CoreConfig extends BaseConfig
{
    @Setting(value = "bot-token", comment = "The token for your bot, Do Not Lose Or Share")
    public String botToken = "bot token here please";

    @Setting(value = "bot-prefix", comment = "Prefix used before all bot commands")
    public String commandPrefix = "!";

    @Setting(value = "owner-id", comment = "Used to identify the owner of the bot, use your SnowFlake ID (Non-negative long)")
    public String ownerID = "owner id here please";
}