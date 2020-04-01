package com.pmdb.api.repository.serie;

import com.pmdb.api.models.serie.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepository extends JpaRepository<Episode, Long> {

}
