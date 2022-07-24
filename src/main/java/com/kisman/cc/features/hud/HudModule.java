package com.kisman.cc.features.hud;

import com.kisman.cc.features.module.Category;
import com.kisman.cc.features.module.Module;
import com.kisman.cc.settings.Setting;
import com.kisman.cc.settings.types.SettingGroup;

import java.util.function.Supplier;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 21:03 of 08.06.2022
 */
@SuppressWarnings("unused")
public class HudModule extends Module {
    public HudModule(String name, String description) {super(name, description, Category.RENDER);}
    public HudModule(String name, String description, boolean drag) {this(name, description);}
    public HudModule(String name) {
        this(name, "");
    }
    public HudModule(String name, boolean drag) {this(name);}
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
    public double getX() {return 0;}
    public void setX(double x) {}
    public double getY() {return 0;}
    public void setY(double y) {}
    public double getW() {return 0;}
    public void setW(double w) {}
    public double getH() {return 0;}
    public void setH(double h) {}
}
