package com.pmdb.api.service;

import com.google.gson.Gson;
import com.pmdb.api.models.request.Request;
import com.pmdb.api.repository.request.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.Collection;

public class RequestServiceImpl implements RequestService {

    @Autowired
    private RequestRepository requestRepository;

    // Ombi properties
    @Value("${ombi.api.key}")
    private String ombiKey;
    @Value("${ombi.api.url}")
    private String ombiUrl;
    @Value("${ombi.search.movie}")
    private String ombiSearchMovie;

    public Request[] searchMovie(String searchTerm) {
        Request[] result = getRequestArray(ombiUrl + ombiSearchMovie + "/" + searchTerm);

        return result;
    }

    private Request[] getRequestArray(String url) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("apiKey", ombiKey);
        HttpEntity entity = new HttpEntity(headers);
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> resp = rt.exchange(url, HttpMethod.GET, entity, String.class);
        Gson gson = new Gson();
        Request[] requests = gson.fromJson(resp.getBody(), Request[].class);

        return requests;
    }
}
