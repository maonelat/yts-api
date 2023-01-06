package za.co.luna.yts.service;

import africa.luna.yts.json.Data;
import africa.luna.yts.json.Yts;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.smallrye.mutiny.Uni;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import za.co.luna.yts.client.YTSApiClient;
import za.co.luna.yts.model.APIResponse;
import za.co.luna.yts.model.ResponseData;
import za.co.luna.yts.model.Stat;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@ApplicationScoped
public class MoviesService {

    @RestClient
    private YTSApiClient ytsApiClient;
    @Inject
    ObjectMapper objectMapper;

    public Uni<ResponseData> getMovies(Map<String, String> params) {

//        Uni<Yts> ytsMovies = ytsApiClient.getMovies(params);
        return  ytsApiClient.getMovies(params).onItem().transform(yts -> {
            if(Stat.OK.toValue().equalsIgnoreCase(yts.getStatus())){
                Data data = yts.getData();
                ResponseData responseData = objectMapper.convertValue(data, ResponseData.class);
//                log.info(responseData.toString());
                return responseData;
            }else{
                throw new RuntimeException(yts.getStatusMessage());
            }
        });
    }
}
