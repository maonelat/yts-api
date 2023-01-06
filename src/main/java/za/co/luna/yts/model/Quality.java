package za.co.luna.yts.model;

import java.io.IOException;
import java.util.Arrays;

public enum Quality {
    THE_1080_P("1080p"), THE_720_P("720p"),THE_2160p("2160p"), THE_3D("3D");

    private final String desc;

    Quality(String desc) {
        this.desc = desc;
    }

    public String toValue() {
        return desc;
    }

    public static Quality forValue(String value) {
        return Arrays.stream(Quality.values()).filter(quality -> value.equalsIgnoreCase(quality.toValue())).findFirst().orElseThrow();
    }
}
