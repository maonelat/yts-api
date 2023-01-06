package za.co.luna.yts.model;

import java.io.IOException;
import java.util.Arrays;

public enum Type {
    WEB("web"),BLURAY("bluray");

    private final String desc;

    Type(String desc) {
        this.desc = desc;
    }

    public String toValue() {
        return desc;
    }

    public static Type forValue(String value) {
        return Arrays.stream(Type.values()).filter(type -> value.equalsIgnoreCase(type.toValue())).findFirst().orElseThrow();
    }
}
