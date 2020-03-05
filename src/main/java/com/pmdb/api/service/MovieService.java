package com.pmdb.api.service;

import com.pmdb.api.models.movie.Movie;

import java.util.Collection;
import java.util.Optional;

public interface MovieService {
    Collection<Movie> getAllMovies();
    public Optional<Movie> findById(Long id);
}
