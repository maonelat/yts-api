package za.co.luna.yts.model;

import java.io.IOException;
import java.util.Arrays;

public enum Stat {
    OK("ok"),
    ERROR("error");

    private final String desc;

    Stat(String desc) {
        this.desc = desc;
    }

    public String toValue() {
        return desc;
    }

    public static Stat forValue(String value) {
        return Arrays.stream(Stat.values()).filter(stat -> value.equalsIgnoreCase(stat.toValue())).findFirst().orElseThrow();
    }
}
