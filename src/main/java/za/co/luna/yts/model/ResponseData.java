package za.co.luna.yts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@Data
@JsonPropertyOrder({
        "movie_count",
        "limit",
        "page_number",
        "movies"
})
public class ResponseData {
    @JsonProperty("movie_count")
    private long movieCount;
    private long limit;
    @JsonProperty("page_number")
    private long pageNumber;
    private List<Movie> movies;

}
