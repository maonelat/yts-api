package za.co.luna.yts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Meta {
    private long serverTime;
    @JsonProperty("server_timezone")
    private String serverTimezone;
    @JsonProperty("api_version")
    private long apiVersion;
    @JsonProperty("execution_time")
    private String executionTime;
}
