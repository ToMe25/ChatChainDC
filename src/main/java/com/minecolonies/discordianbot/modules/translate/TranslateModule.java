package com.minecolonies.discordianbot.modules.translate;

import com.minecolonies.discordianbot.qsml.modulespec.StandardModule;
import uk.co.drnaylor.quickstart.annotations.ModuleData;

/**
 * Translate module for our bot.
 */
@ModuleData(id = TranslateModule.ID,
  name = "Translate")
public class TranslateModule extends StandardModule
{
    /**
     * This modules ID string.
     */
    public static final String ID = "TRANSLATE";

    @Override
    public void enable()
    {
        getLogger().info("Translate Module Started");
    }
}
