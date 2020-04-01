package com.pmdb.api.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pmdb.api.models.movie.Movie;
import com.pmdb.api.repository.movie.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Optional;

@Service
@EnableScheduling
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;
    private DateService dateService;

    @Value("${api.radarr}")
    private String radarrApi;
    @Value("${url.radarr}")
    private String radarrUrl;


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

/*    @Override
    public Optional<Movie> findExternalMovie(Long id) {
        RestTemplate rt = new RestTemplate();
        String url = radarrUrl + "movie/" + id + "?apikey=" + radarrApi;
        ResponseEntity<String> resp = rt.getForEntity(url, String.class);
        Gson gson = new GsonBuilder().create();
        Movie m = gson.fromJson(resp.getBody(), Movie.class);
        if (!movieRepository.existsByCleanTitle(m.getCleanTitle())) {
            movieRepository.save(m);
        }
        return Optional.ofNullable(m);
    }*/

    @Override
    @Scheduled(fixedRateString = "${fixedDelay.in.milliseconds}")
    public void updateExternalMovies() {
        RestTemplate rt = new RestTemplate();

        String url = radarrUrl + "movie/?apikey=" + radarrApi;
        ResponseEntity<String> resp = rt.getForEntity(url, String.class);
        Gson gson = new Gson();
        Movie[] mArray = gson.fromJson(resp.getBody(), Movie[].class);
        int addedItems = 0;
        int updatedItems = 0;

        for (Movie mElement : mArray) {

            if (!movieRepository.existsById(mElement.getId())) {
                movieRepository.save(mElement);
                addedItems++;
            }

            Optional<Movie> m = movieRepository.findById(mElement.getId());

            String strDateElement = dateService.ConvertDate(mElement.getLastInfoSync());
            String strDateM = dateService.ConvertDate(m.get().getLastInfoSync());

            if (!strDateElement.equals(strDateM)) {
                movieRepository.deleteById(mElement.getId());
                movieRepository.save(mElement);
                updatedItems++;
            }
        }
        System.out.println("[Movie] Added items:   " + addedItems);
        System.out.println("[Movie] Updated items: " + updatedItems);
    }
}
