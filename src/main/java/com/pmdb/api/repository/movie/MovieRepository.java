package com.pmdb.api.repository.movie;

import com.pmdb.api.models.movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    boolean existsById(Long id);
}
