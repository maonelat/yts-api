package za.co.luna.yts.model;

import java.io.IOException;
import java.util.Arrays;

public enum MpaRating {
    EMPTY(""), PG("PG");

    private final String desc;

    MpaRating(String desc) {
        this.desc = desc;
    }

    public String toValue() {
        return desc;
    }

    public static MpaRating forValue(String value) {
        return Arrays.stream(MpaRating.values()).filter(mpaRating -> value.equalsIgnoreCase(mpaRating.toValue())).findFirst().orElseThrow();
    }
}
