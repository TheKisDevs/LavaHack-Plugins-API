package com.kisman.cc;

import com.kisman.cc.features.hud.HudModuleManager;
import com.kisman.cc.features.module.ModuleManager;
import com.kisman.cc.settings.SettingsManager;
import me.zero.alpine.bus.EventBus;
import me.zero.alpine.bus.EventManager;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 20:50 of 08.06.2022
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class Kisman {
    public static final EventBus EVENT_BUS = new EventManager();
    public static final Kisman instance = new Kisman();

    public final ModuleManager moduleManager = new ModuleManager();
    public final HudModuleManager hudModuleManager = new HudModuleManager();
    public final SettingsManager settingsManager = new SettingsManager();
}
