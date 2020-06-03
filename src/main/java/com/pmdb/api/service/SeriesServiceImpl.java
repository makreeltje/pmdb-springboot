package com.pmdb.api.service;

import com.google.gson.Gson;
import com.pmdb.api.models.serie.Episode;
import com.pmdb.api.models.serie.Series;
import com.pmdb.api.repository.serie.EpisodeRepository;
import com.pmdb.api.repository.serie.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Optional;

@Service
@EnableScheduling
public class SeriesServiceImpl implements SeriesService {


    @Autowired
    private SeriesRepository seriesRepository;
    @Autowired
    private EpisodeRepository episodeRepository;

    // Radarr properties
    @Value("${sonarr.api.key}")
    private String sonarrKey;
    @Value("${sonarr.api.url}")
    private String sonarrUrl;

    private int addedEpisodes = 0;

    @Override
    //@Scheduled(fixedRateString = "${fixedDelay.in.milliseconds}")
    public void updateExternalSeries() {
        RestTemplate rt = new RestTemplate();

        String url = sonarrUrl + "series/?apikey=" + sonarrKey;
        ResponseEntity<String> resp = rt.getForEntity(url, String.class);
        Gson gson = new Gson();
        Series[] sArray = gson.fromJson(resp.getBody(), Series[].class);
        int addedItems = 0;
        int updatedItems = 0;

        for (Series sElement : sArray) {
            if (!seriesRepository.existsById(sElement.getId())) {
                seriesRepository.save(sElement);
                updateExternalEpisodes(sElement.getId());
                addedItems++;
            }

            Optional<Series> s = seriesRepository.findById(sElement.getId());
            SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
            String strDateElement = formatter.format(sElement.getLastInfoSync());
            String strDateS = null;
            if(s.isPresent()){
                strDateS = formatter.format(s.get().getLastInfoSync());
            }


            if (!strDateElement.equals(strDateS)) {
                seriesRepository.deleteById(sElement.getId());
                seriesRepository.save(sElement);
                updateExternalEpisodes(sElement.getId());
                updatedItems++;
            }
        }
        System.out.println("[Serie] Added items:   " + addedItems);
        System.out.println("[Serie] Updated items: " + updatedItems);
        System.out.println("[Episo] Added items:   " + addedEpisodes);
        addedEpisodes = 0;
    }

    private void updateExternalEpisodes(Long id) {
        RestTemplate rt = new RestTemplate();

        String url = sonarrUrl + "episode?seriesId=" + id + "&apikey=" + sonarrKey;
        ResponseEntity<String> resp = rt.getForEntity(url, String.class);
        Gson gson = new Gson();
        Episode[] eArray = gson.fromJson(resp.getBody(), Episode[].class);

        for (Episode eElement : eArray) {
            if (!episodeRepository.existsById(eElement.getId())) {
                episodeRepository.save(eElement);
                addedEpisodes++;
            }
        }
    }
}
