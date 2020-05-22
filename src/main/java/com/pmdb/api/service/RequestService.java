package com.pmdb.api.service;

import com.pmdb.api.models.request.Movie;
import com.pmdb.api.payload.request.MovieRequest;
import org.springframework.http.ResponseEntity;

import java.util.Collection;

public interface RequestService {
    Collection<Movie> searchMovie(String searchTerm);
    Collection<Movie> popularMovie();
    ResponseEntity<?> requestMovie(MovieRequest movieRequest);
}
