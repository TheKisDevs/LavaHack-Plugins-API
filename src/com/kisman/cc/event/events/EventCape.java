package com.kisman.cc.event.events;

import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ResourceLocation;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 19:09 of 09.06.2022
 */
public class EventCape {
    private final NetworkPlayerInfo info;
    private ResourceLocation resLoc = null;

    public EventCape(NetworkPlayerInfo info) {
        this.info = info;
    }

    public NetworkPlayerInfo getInfo() {
        return info;
    }

    public ResourceLocation getResLoc() {
        return resLoc;
    }

    public void setResLoc(ResourceLocation resLoc) {
        this.resLoc = resLoc;
    }
}
