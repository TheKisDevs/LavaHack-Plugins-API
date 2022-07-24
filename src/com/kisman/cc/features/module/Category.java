package com.kisman.cc.features.module;

//Shadow class
@SuppressWarnings("unused")
public enum Category {
    COMBAT(""),
    CLIENT(""),
    MOVEMENT(""),
    PLAYER(""),
    RENDER(""),
    MISC(""),
    EXPLOIT(""),
    DEBUG(""),
    LUA("");

    private final String name;

    Category(String name) {
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }
}
