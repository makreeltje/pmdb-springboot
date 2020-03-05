package com.pmdb.api.repository.movie;

import com.pmdb.api.models.movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    Collection<Movie> getAllMovies();

}
