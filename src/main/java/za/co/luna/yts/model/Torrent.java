package za.co.luna.yts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class Torrent {
    private String url;
//    private String hash;
    private String quality;
    private String type;
//    private long seeds;
//    private long peers;
    private String size;
//    @JsonProperty("size_bytes")
//    private long sizeBytes;
    @JsonProperty("date_uploaded")
    private String dateUploaded;
//    private long dateUploadedUnix;

}
