package com.pmdb.api.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pmdb.api.models.movie.Movie;
import com.pmdb.api.models.movie.RadarrMovie;
import com.pmdb.api.models.movie.TmdbMovie;
import com.pmdb.api.repository.movie.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final MovieRepository movieRepository;

    // Logger
    Logger logger = LoggerFactory.getLogger(MovieService.class);

    // Radarr properties
    @Value("${radarr.api.key}")
    private String radarrKey;
    @Value("${radarr.api.url}")
    private String radarrUrl;
    @Value("${radarr.get.movie}")
    private String radarrGetMovie;
    @Value("${radarr.api.path}")
    private String radarrApiPath;

    // Tmdb properties
    @Value("${tmdb.api.key}")
    private String tmdbKey;
    @Value("${tmdb.api.url}")
    private String tmdbUrl;
    @Value("${tmdb.get.movie}")
    private String tmdbGetMovie;
    @Value("${tmdb.api.path}")
    private String tmdbApiPath;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


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
    @Scheduled(fixedRateString = "${fixedDelay.in.milliseconds}")
    public void updateMovies() {
        logger.info("[Movies] Sync started");
        RadarrMovie[] radarrMovieArray = getRadarrMovieArray(radarrUrl + radarrGetMovie + radarrApiPath + radarrKey);

        int addedItems = 0;
        int updatedItems = 0;

        for (RadarrMovie radarrMovie : radarrMovieArray) {

            if (!movieRepository.existsById(radarrMovie.getId())) {
                TmdbMovie tmdbMovie = getTmdbMovie(tmdbUrl + tmdbGetMovie + radarrMovie.getTmdbId() + tmdbApiPath + tmdbKey);
                Movie movie = new Movie(radarrMovie, tmdbMovie);
                movieRepository.save(movie);
                addedItems++;
            }

            Optional<Movie> m = movieRepository.findById(radarrMovie.getId());

            SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
            String radarrMovieDate = formatter.format(radarrMovie.getLastInfoSync());
            String movieDate = formatter.format(m.get().getLastInfoSync());

            if (!radarrMovieDate.equals(movieDate)) {
                TmdbMovie tmdbMovie = getTmdbMovie(tmdbUrl + tmdbGetMovie + radarrMovie.getTmdbId() + tmdbApiPath + tmdbKey);
                Movie movie = new Movie(radarrMovie, tmdbMovie);
                movieRepository.deleteById(radarrMovie.getId());
                movieRepository.save(movie);
                updatedItems++;
            }
        }
        logger.info("[Movies] " + addedItems + " added");
        logger.info("[Movies] " + updatedItems + " updated");
        logger.info("[Movies] Sync finished");
    }

    private RadarrMovie[] getRadarrMovieArray(String url) {
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> resp = rt.getForEntity(url, String.class);
        Gson gson = new Gson();
        RadarrMovie[] radarrMovieArray = gson.fromJson(resp.getBody(), RadarrMovie[].class);

        return radarrMovieArray;
    }

    private TmdbMovie getTmdbMovie(String url) {
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> resp = rt.getForEntity(url, String.class);
        Gson gson = new Gson();
        TmdbMovie tmdbMovie = gson.fromJson(resp.getBody(), TmdbMovie.class);

        return tmdbMovie;
    }
}
