package com.pmdb.api.models.serie;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "episodes")
public class Episode {

    @Id
    private Long id;
    private Long seriesId;
    private Long seasonNumber;
    private Long episodeNumber;
    private String title;
    private Date airDate;
    @Column(columnDefinition = "text")
    private String overview;
    private Boolean hasFile;
    private Boolean monitored;

    public Episode(Long id, Long seriesId, Long seasonNumber, Long episodeNumber, String title, Date airDate, String overview, Boolean hasFile, Boolean monitored) {
        this.id = id;
        this.seriesId = seriesId;
        this.seasonNumber = seasonNumber;
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.airDate = airDate;
        this.overview = overview;
        this.hasFile = hasFile;
        this.monitored = monitored;
    }

    public Episode() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public Long getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(Long seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public Long getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(Long episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getAirDate() {
        return airDate;
    }

    public void setAirDate(Date airDate) {
        this.airDate = airDate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Boolean getHasFile() {
        return hasFile;
    }

    public void setHasFile(Boolean hasFile) {
        this.hasFile = hasFile;
    }

    public Boolean getMonitored() {
        return monitored;
    }

    public void setMonitored(Boolean monitored) {
        this.monitored = monitored;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "id=" + id +
                ", seriesId=" + seriesId +
                ", seasonNumber=" + seasonNumber +
                ", episodeNumber=" + episodeNumber +
                ", title='" + title + '\'' +
                ", airDate=" + airDate +
                ", overview='" + overview + '\'' +
                ", hasFile=" + hasFile +
                ", monitored=" + monitored +
                '}';
    }
}
