package com.kisman.cc.gui.csgo.components;

import java.util.function.Function;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 21:26 of 08.06.2022
 */
public class Slider {
    public enum NumberType {
        PERCENT(null),
        TIME(null),
        DECIMAL(null),
        INTEGER(null);

        NumberType(Function<Number, String> formatter) {}

        public Function<Number, String> getFormatter() {
            return null;
        }
    }
}
