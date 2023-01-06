package za.co.luna.yts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class APIResponse {
    private String status;
    @JsonProperty("status_message")
    private String statusMessage;
    @JsonProperty("data")
    private ResponseData responseData;
    @JsonProperty(value = "@meta")
    private Meta meta;
}
