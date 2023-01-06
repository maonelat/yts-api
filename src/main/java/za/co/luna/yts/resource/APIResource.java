package za.co.luna.yts.resource;

import io.smallrye.mutiny.Uni;
import lombok.extern.slf4j.Slf4j;
import za.co.luna.yts.model.APIResponse;
import za.co.luna.yts.model.ResponseData;
import za.co.luna.yts.service.MoviesService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletionStage;

@Slf4j
@Path("/api")
public class APIResource {

    @Inject
    private MoviesService moviesService;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Movies API.";
    }

    @GET
    @Path("/movies")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<ResponseData> movies(Parameters parameters) {
//        return Uni.createFrom().item(() -> moviesService.getMovies());
        Map<String, String> params = new HashMap<>();
        if(null!=parameters.limit)
            params.put("limit",parameters.limit);
        if(null!=parameters.page)
            params.put("page",parameters.page);
        if(null!=parameters.minimum_rating)
            params.put("minimum_rating",parameters.minimum_rating);
        if(null!=parameters.quality)
            params.put("quality",parameters.quality);
        if(null!=parameters.query_term)
            params.put("query_term",parameters.query_term);
        return moviesService.getMovies(params);
    }
}