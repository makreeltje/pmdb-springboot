package com.pmdb.api.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pmdb.api.models.movie.Movie;
import com.pmdb.api.repository.movie.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Collection<Movie> getAllMovies() {
        Collection<Movie> movies = movieRepository.findAll();
        return movies;
    }

    @Override
    public Optional<Movie> findById(Long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        return movie;
    }

    @Override
    public Optional<Movie> findExternalMovie(Long id) {
        RestTemplate rt = new RestTemplate();
        String url = "https://radarr.meelsnet.nl/api/movie/" + id + "?apikey=c7ceb5496f2a40b3ac4787fc468ec6f9";
        ResponseEntity<String> resp = rt.getForEntity(url, String.class);
        Gson gson = new GsonBuilder().create();
        Movie m = gson.fromJson(resp.getBody(), Movie.class);


        /*Gson gson = new Gson();
        String text = String.format("https://radarr.meelsnet.nl/api/movie/{0}?apikey=c7ceb5496f2a40b3ac4787fc468ec6f9", id);
        Movie obj = null;
        URL url = new URL(text);
        obj = gson.fromJson(String.valueOf(url), Movie.class);*/

        return Optional.ofNullable(m);
    }
}
