package com.pmdb.api.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pmdb.api.models.request.Movie;
import com.pmdb.api.models.request.Request;
import com.pmdb.api.payload.request.MovieRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Service
public class RequestServiceImpl implements RequestService {

    // Logger
    Logger logger = LoggerFactory.getLogger(MovieService.class);

    // Ombi properties
    @Value("${ombi.api.key}")
    private String ombiKey;
    @Value("${ombi.api.url}")
    private String ombiUrl;
    @Value("${ombi.search.movie}")
    private String ombiSearchMovie;
    @Value("${ombi.search.popular}")
    private String ombiPopularMovie;
    @Value("${ombi.request.movie}")
    private String ombiRequestMovie;

    public Collection<Movie> searchMovie(String searchTerm) {
        return getRequestArray(ombiUrl + ombiSearchMovie + "/" + searchTerm);
    }

    public Collection<Movie> popularMovie() {
        return getRequestArray(ombiUrl + ombiPopularMovie);
    }

    private Collection<Movie> getRequestArray(String url) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("apiKey", ombiKey);
        HttpEntity entity = new HttpEntity(headers);
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> resp = rt.exchange(url, HttpMethod.GET, entity, String.class);
        Type requestList = new TypeToken<ArrayList<Movie>>(){}.getType();
        Gson gson = new Gson();

        return gson.fromJson(resp.getBody(), requestList);
    }

    @Override
    public ResponseEntity<?> requestMovie(MovieRequest movieRequest) {
        RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("apiKey", ombiKey);

        HttpEntity<MovieRequest> entity = new HttpEntity(movieRequest, headers);
        logger.info(String.valueOf(rt.exchange(ombiUrl + ombiRequestMovie, HttpMethod.POST, entity, String.class)));
        ResponseEntity<String> resp = rt.exchange(ombiUrl + ombiRequestMovie, HttpMethod.POST, entity, String.class);
        Type requestList = new TypeToken<ArrayList<Request>>(){}.getType();
        Gson gson = new Gson();

        return rt.exchange(ombiUrl + ombiRequestMovie, HttpMethod.POST, entity, String.class);

    }

}
