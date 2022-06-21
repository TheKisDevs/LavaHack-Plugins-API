package com.kisman.cc.event.events;

import com.kisman.cc.event.Event;
import net.minecraft.entity.MoverType;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 23:26 of 15.06.2022
 */
public class EventPlayerMove extends Event {
    public MoverType type;
    public double x, y, z;

    public EventPlayerMove(MoverType type, double x, double y, double z) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getName() {
        return "player_move";
    }
}
