package com.pmdb.api.models.serie;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "series")
public class Series {

    @Id
    private Long id;
    private String title;
    private String sortTitle;
    private String cleanTitle;
    private Long seasonCount;
    private Long totalEpisodeCount;
    private Long episodeCount;
    private Long episodeFileCount;
    private Long sizeOnDisk;
    private String status;
    @Column(columnDefinition = "text")
    private String overview;
    private String network;
    private String airTime;
    private Boolean monitored;
    private String tvdbId;
    private String imdbId;
    private Date firstAired;
    private Date lastInfoSync;
    private String certification;
    private Date added;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "seriesId")
    private List<Episode> episodes = new ArrayList<>();

    public Series(Long id, String title, String sortTitle, String cleanTitle, Long seasonCount, Long totalEpisodeCount, Long episodeCount, Long episodeFileCount, Long sizeOnDisk, String status, String overview, String network, String airTime, Boolean monitored, String tvdbId, String imdbId, Date firstAired, Date lastInfoSync, String certification, Date added, List<Episode> episodes) {
        this.id = id;
        this.title = title;
        this.sortTitle = sortTitle;
        this.cleanTitle = cleanTitle;
        this.seasonCount = seasonCount;
        this.totalEpisodeCount = totalEpisodeCount;
        this.episodeCount = episodeCount;
        this.episodeFileCount = episodeFileCount;
        this.sizeOnDisk = sizeOnDisk;
        this.status = status;
        this.overview = overview;
        this.network = network;
        this.airTime = airTime;
        this.monitored = monitored;
        this.tvdbId = tvdbId;
        this.imdbId = imdbId;
        this.firstAired = firstAired;
        this.lastInfoSync = lastInfoSync;
        this.certification = certification;
        this.added = added;
        this.episodes = episodes;
    }

    public Series() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSortTitle() {
        return sortTitle;
    }

    public void setSortTitle(String sortTitle) {
        this.sortTitle = sortTitle;
    }

    public String getCleanTitle() {
        return cleanTitle;
    }

    public void setCleanTitle(String cleanTitle) {
        this.cleanTitle = cleanTitle;
    }

    public Long getSeasonCount() {
        return seasonCount;
    }

    public void setSeasonCount(Long seasonCount) {
        this.seasonCount = seasonCount;
    }

    public Long getTotalEpisodeCount() {
        return totalEpisodeCount;
    }

    public void setTotalEpisodeCount(Long totalEpisodeCount) {
        this.totalEpisodeCount = totalEpisodeCount;
    }

    public Long getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(Long episodeCount) {
        this.episodeCount = episodeCount;
    }

    public Long getEpisodeFileCount() {
        return episodeFileCount;
    }

    public void setEpisodeFileCount(Long episodeFileCount) {
        this.episodeFileCount = episodeFileCount;
    }

    public Long getSizeOnDisk() {
        return sizeOnDisk;
    }

    public void setSizeOnDisk(Long sizeOnDisk) {
        this.sizeOnDisk = sizeOnDisk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getAirTime() {
        return airTime;
    }

    public void setAirTime(String airTime) {
        this.airTime = airTime;
    }

    public Boolean getMonitored() {
        return monitored;
    }

    public void setMonitored(Boolean monitored) {
        this.monitored = monitored;
    }

    public String getTvdbId() {
        return tvdbId;
    }

    public void setTvdbId(String tvdbId) {
        this.tvdbId = tvdbId;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public Date getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(Date firstAired) {
        this.firstAired = firstAired;
    }

    public Date getLastInfoSync() {
        return lastInfoSync;
    }

    public void setLastInfoSync(Date lastInfoSync) {
        this.lastInfoSync = lastInfoSync;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sortTitle='" + sortTitle + '\'' +
                ", cleanTitle='" + cleanTitle + '\'' +
                ", seasonCount=" + seasonCount +
                ", totalEpisodeCount=" + totalEpisodeCount +
                ", episodeCount=" + episodeCount +
                ", episodeFileCount=" + episodeFileCount +
                ", sizeOnDisk=" + sizeOnDisk +
                ", status='" + status + '\'' +
                ", overview='" + overview + '\'' +
                ", network='" + network + '\'' +
                ", airTime='" + airTime + '\'' +
                ", monitored=" + monitored +
                ", tvdbId='" + tvdbId + '\'' +
                ", imdbId='" + imdbId + '\'' +
                ", firstAired=" + firstAired +
                ", lastInfoSync=" + lastInfoSync +
                ", certification='" + certification + '\'' +
                ", added=" + added +
                ", episodes=" + episodes +
                '}';
    }
}
