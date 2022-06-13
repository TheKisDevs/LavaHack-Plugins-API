package com.kisman.cc.event;

import com.kisman.cc.Kisman;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 19:06 of 09.06.2022
 */
public class Event {
    private Era era;
    public Event() {}
    public Event(Era era) {this.era = era;}
    public Era getEra() {return era;}
    public void setEra(Era era) {this.era = era;}

    //Shadow class
    public enum Era {
        PRE,
        POST,
        PERI
    }

//    public LuaValue toLua() {return CoerceJavaToLua.coerce(this);}
    public String getName() {return "other_event";}
    public boolean isPre() {return era.equals(Era.PRE);}
    public boolean isPost() {return era.equals(Era.POST);}
    public String getEraString() {return era.name();}
    public void post() {
        Kisman.EVENT_BUS.post(this);}
}
