package za.co.luna.yts.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Movie {
    private long id;
    private String url;
//    private String imdbCode;
    private String title;
    @JsonProperty("title_english")
    private String titleEnglish;
//    private String titleLong;
//    private String slug;
    private long year;
    private double rating;
    private long runtime;
    private String[] genres;
    private String summary;
//    private String descriptionFull;
//    private String synopsis;
//    private String ytTrailerCode;
    private String language;
    @JsonProperty("mpa_rating")
    private String mpaRating;
//    private String backgroundImage;
//    private String backgroundImageOriginal;
    @JsonProperty("small_cover_image")
    private String smallCoverImage;
    @JsonProperty("medium_cover_image")
    private String mediumCoverImage;
//    private String largeCoverImage;
    private String state;
    private List<Torrent> torrents;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING)
    @JsonProperty("date_uploaded")
    private LocalDateTime dateUploaded;
//    private long dateUploadedUnix;
}
