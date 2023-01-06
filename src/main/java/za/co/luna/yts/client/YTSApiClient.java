package za.co.luna.yts.client;
import africa.luna.yts.json.Yts;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Map;

@RegisterRestClient(configKey="yts-api")
public interface YTSApiClient {

    @GET
    @Path("/list_movies.json")
    public Uni<Yts> getMovies(@RestQuery Map<String, String> filter);
}
