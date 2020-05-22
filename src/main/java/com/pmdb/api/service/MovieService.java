package com.pmdb.api.service;

import com.pmdb.api.models.movie.Movie;

import java.util.Collection;
import java.util.Optional;

public interface MovieService {
    Collection<Movie> getAllMovies();
    Optional<Movie> findById(Long id);

//    Optional<Movie> findExternalMovie(Long id) throws MalformedURLException;


    void updateMovies();
}
