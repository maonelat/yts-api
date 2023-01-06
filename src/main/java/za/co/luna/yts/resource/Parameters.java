package za.co.luna.yts.resource;

import org.jboss.resteasy.reactive.RestQuery;

public class Parameters {

    @RestQuery
    String limit;
    @RestQuery
    String page;
    @RestQuery
    String quality;
    @RestQuery
    String minimum_rating;
    @RestQuery
    String query_term;

}
