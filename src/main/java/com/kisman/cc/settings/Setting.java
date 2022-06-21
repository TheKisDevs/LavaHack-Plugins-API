package com.kisman.cc.settings;

import com.kisman.cc.features.module.Module;

import com.kisman.cc.settings.types.number.NumberType;
import com.kisman.cc.util.Colour;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 21:19 of 08.06.2022
 */
public class Setting {
    public Setting(String type) {}
    public Setting(String name, Module parent, int key) {}
    public Setting(String name, Module parent, String sval, String dString, boolean opening) {}
    public Setting(String name, Module parent, String sval, String dString, boolean opening, boolean onlyOneWord) {}
    public Setting(String name, Module parent, String title) {}
    public Setting(String name, Module parent, String sval, ArrayList<String> options) {}
    public Setting(String name, Module parent, String sval, List<String> options) {}
    public Setting(String name, Module parent, Enum options) {}
    public Setting(String name, Module parent, boolean bval) {}
    public Setting(String name, Module parent, double dval, double min, double max, NumberType numberType) {}
    public Setting(String name, Module parent, double dval, double min, double max, boolean onlyint) {}
    public Setting(String name, Module parent, String title, Colour colour) {}
    public Setting(String name, Module parent, Colour colour) {}
    public Setting(String name, Module parent, String title, Entity entity) {}
    public Setting(String name, Module parent, String title, ItemStack[] items) {}
    public Setting(String name, Module parent) {}
    public Setting setDisplayInfo(Supplier<String> displayInfoSupplier) {return null;}
    public Setting setDisplayInfo(String displayInfo) {return null; }
    public String getDisplayInfo() {return null;}
    public Enum getEnumByName() {return null;}
    public boolean checkValString(String str) {return false;}
    public boolean isVisible() {return false;}
    public Setting setVisible(Supplier<Boolean> suppliner) {return null;}
    public String[] getStringValues() {return null;}
    public String getStringFromIndex(int index) {return null;}
    public int getSelectedIndex() {return 0;}
    public NumberType getNumberType() {return null;}
    public void setNumberType(NumberType numberType) {}
    public Entity getEntity() {return null;}
    public int getValInt() {return 0;}
    public int getKey() {return 0;}
    public void setKey(int key) {}
    public Colour getColour() {return null;}
    public void setColour(Colour colour) {}
    public Enum<?> getValEnum() {return null;}
    public void setValEnum(Enum<?> enum_) {}
    public String getdString() {return null;}
    public int getIndex() {return 0;}
    public void setIndex(int index) {}
    public String getTitle() {return null;}
    public void setTitle(String title) {}
    public String getName() {return null;}
    public Setting setName(String name) {return null;}
    public Module getParentMod() {return null;}
    public String getValString() {return null;}
    public Setting setValString(String in) {return null;}
    public ArrayList<String> getOptions() {return null;}
    public Setting setOptions(String... options) {return null;}
    public Setting setOptions(List<String> options) {return null;}
    public boolean getValBoolean() {return false;}
    public Setting setValBoolean(boolean in) {return null;}
    public double getValDouble() {return 0;}
    public float getValFloat() {return 0;}
    public long getValLong() {return 0;}
    public Setting setValDouble(double in) {return null;}
    public double getMin() {return 0;}
    public double getMax() {return 0;}
    public Setting setMin(double min) {return null;}
    public Setting setMax(double max) {return null;}
    public Setting setType(String type) {return null;}
    public boolean isPreview() {return false;}
    public boolean isBind() {return false;}
    public boolean isCategory() {return false;}
    public boolean isGroup() {return false;}
    public boolean isString() {return false;}
    public boolean isVoid() {return false;}
    public boolean isCombo() {return false;}
    public boolean isCheck() {return false;}
    public boolean isSlider() {return false;}
    public boolean isLine() {return false;}
    public boolean isColorPicker() {return false;}
    public boolean onlyInt() {return false;}
}
