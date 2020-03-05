package com.pmdb.api.service;

import com.pmdb.api.models.movie.Movie;
import com.pmdb.api.repository.movie.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
