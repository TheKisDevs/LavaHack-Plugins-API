package com.kisman.cc.features.module;

import com.kisman.cc.settings.Setting;
import com.kisman.cc.settings.types.SettingGroup;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 20:54 of 08.06.2022
 */
@SuppressWarnings({"unused", "BooleanMethodIsAlwaysInverted"})
public class Module {
    public static Minecraft mc = Minecraft.getMinecraft();
    public Module(String name, Category category) {}
    public Module(String name, Category category, boolean subscribes) {}
    public Module(String name, String description, Category category) {}
    public Module(String name, String description, Category category, int key, boolean subscribes) {}
    public void setToggled(boolean toggled) {}
    public void toggle() {}
    public Setting register(Setting set) {return null;}
    public SettingGroup register(SettingGroup group) {return null;}
    public void setDescription(String description) {}
    public void setKey(int key) {}
    public boolean isToggled() {return false;}
    public void onEnable() {}
    public void onDisable() {}
    public void setDisplayInfo(String displayInfo) {}
    public void setDisplayInfo(Supplier<String> fun) {}
    public void update() {}
    public boolean isVisible() {return false;}
    public boolean isBeta() {return false;}
}
