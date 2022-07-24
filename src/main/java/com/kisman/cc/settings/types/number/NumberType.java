package com.kisman.cc.settings.types.number;

import java.util.function.Function;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 11:51 of 21.06.2022
 */
public enum NumberType {
    PERCENT(null),
    TIME(null),
    DECIMAL(null),
    INTEGER(null);

    private Function<Number, String> formatter;

    NumberType(Function<Number, String> formatter) {
        this.formatter = formatter;
    }

    public Function<Number, String> getFormatter() {
        return formatter;
    }
}
