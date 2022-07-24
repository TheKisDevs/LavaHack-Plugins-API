package the.kis.devs.api.settings;

import com.kisman.cc.features.module.Module;
import com.kisman.cc.settings.Setting;
import com.kisman.cc.settings.types.number.NumberType;
import com.kisman.cc.util.Colour;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author _kisman_
 * @since 17:29 of 08.06.2022
 */
@SuppressWarnings("unused")
public class SettingAPI extends Setting {
    public SettingAPI(String type) {super(type);}
    public SettingAPI(String name, Module parent, int key) {super(name, parent, key);}
    public SettingAPI(String name, Module parent, String sval, String dString, boolean opening) {super(name, parent, sval, dString, opening);}
    public SettingAPI(String name, Module parent, String sval, String dString, boolean opening, boolean onlyOneWord) {super(name, parent, sval, dString, opening, onlyOneWord);}
    public SettingAPI(String name, Module parent, String title) {super(name, parent, title);}
    public SettingAPI(String name, Module parent, String sval, ArrayList<String> options) {super(name, parent, sval, options);}
    public SettingAPI(String name, Module parent, String sval, List<String> options) {super(name, parent, sval, options);}
    public SettingAPI(String name, Module parent, Enum<?> options) {super(name, parent, options);}
    public SettingAPI(String name, Module parent, boolean bval) {super(name, parent, bval);}
    public SettingAPI(String name, Module parent, double dval, double min, double max, NumberType numberType) {super(name, parent, dval, min, max, numberType);}
    public SettingAPI(String name, Module parent, double dval, double min, double max, boolean onlyint) {super(name, parent, dval, min, max, onlyint);}
    public SettingAPI(String name, Module parent, String title, Colour colour) {super(name, parent, title, colour);}
    public SettingAPI(String name, Module parent, Colour colour) {super(name, parent, colour);}
    public SettingAPI(String name, Module parent, String title, Entity entity) {super(name, parent, title, entity);}
    public SettingAPI(String name, Module parent, String title, ItemStack[] items) {super(name, parent, title, items);}
    public SettingAPI(String name, Module parent) {super(name, parent);}
    public SettingAPI setDisplayInfo(Supplier<String> displayInfoSupplier) {super.setDisplayInfo(displayInfoSupplier); return this;}
    public SettingAPI setDisplayInfo(String displayInfo) {super.setDisplayInfo(displayInfo); return this;}
    public String getDisplayInfo() {return super.getDisplayInfo();}
    public Enum<?> getEnumByName() {return super.getEnumByName();}
    public boolean checkValString(String str) {return super.checkValString(str);}
    public boolean isVisible() {return super.isVisible();}
    public SettingAPI setVisible(Supplier<Boolean> suppliner) {super.setVisible(suppliner); return this;}
    public String[] getStringValues() {return super.getStringValues();}
    public String getStringFromIndex(int index) {return super.getStringFromIndex(index);}
    public int getSelectedIndex() {return super.getSelectedIndex();}
    public NumberType getNumberType() {return super.getNumberType();}
    public void setNumberType(NumberType numberType) {super.setNumberType(numberType);}
    public Entity getEntity() {return super.getEntity();}
    public int getValInt() {return super.getValInt();}
    public int getKey() {return super.getKey();}
    public void setKey(int key) {super.setKey(key);}
    public Colour getColour() {return super.getColour();}
    public void setColour(Colour colour) {super.setColour(colour);}
    public Enum<?> getValEnum() {return super.getValEnum();}
    public void setValEnum(Enum<?> enum_) {super.setValEnum(enum_);}
    public String getdString() {return super.getdString();}
    public int getIndex() {return super.getIndex();}
    public void setIndex(int index) {super.setIndex(index);}
    public String getTitle() {return super.getTitle();}
    public SettingAPI setTitle(String title) {super.setTitle(title); return this;}
    public String getName() {return super.getName();}
    public SettingAPI setName(String name) {super.setName(name); return this;}
    public Module getParentMod() {return super.getParentMod();}
    public String getValString() {return super.getValString();}
    public SettingAPI setValString(String in) {super.setValString(in); return this;}
    public ArrayList<String> getOptions() {return super.getOptions();}
    public SettingAPI setOptions(String... options) {super.setOptions(options); return this;}
    public SettingAPI setOptions(List<String> options) {super.setOptions(options); return this;}
    public boolean getValBoolean() {return super.getValBoolean();}
    public SettingAPI setValBoolean(boolean in) {super.setValBoolean(in); return this;}
    public double getValDouble() {return super.getValDouble();}
    public float getValFloat() {return super.getValFloat();}
    public long getValLong() {return super.getValLong();}
    public SettingAPI setValDouble(double in) {super.setValDouble(in); return this;}
    public double getMin() {return super.getMin();}
    public double getMax() {return super.getMax();}
    public SettingAPI setMin(double min) {super.setMin(min); return this;}
    public SettingAPI setMax(double max) {super.setMax(max); return this;}
    public SettingAPI setType(String type) {super.setType(type); return this;}
    public boolean isPreview() {return super.isPreview();}
    public boolean isBind() {return super.isBind();}
    public boolean isCategory() {return super.isCategory();}
    public boolean isGroup() {return super.isGroup();}
    public boolean isString() {return super.isString();}
    public boolean isVoid() {return super.isVoid();}
    public boolean isCombo() {return super.isCombo();}
    public boolean isCheck() {return super.isCheck();}
    public boolean isSlider() {return super.isSlider();}
    public boolean isLine() {return super.isLine();}
    public boolean isColorPicker() {return super.isColorPicker();}
    public boolean onlyInt() {return super.onlyInt();}
}
