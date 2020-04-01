package com.pmdb.api.repository.serie;

import com.pmdb.api.models.serie.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, Long> {

}
