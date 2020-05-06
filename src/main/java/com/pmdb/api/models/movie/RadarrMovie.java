package com.pmdb.api.models.movie;

import javax.persistence.Id;
import java.util.Date;

public class RadarrMovie {
    @Id
    private Long id;
    private String sortTitle;
    private Long sizeOnDisk;
    private Boolean downloaded;
    private Boolean monitored;
    private Date lastInfoSync;
    private String imdbId;
    private Long tmdbId;

    public RadarrMovie() {
    }

    public RadarrMovie(Long id, String sortTitle, Long sizeOnDisk, Boolean downloaded, Boolean monitored, Date lastInfoSync, String imdbId, Long tmdbId) {
        this.id = id;
        this.sortTitle = sortTitle;
        this.sizeOnDisk = sizeOnDisk;
        this.downloaded = downloaded;
        this.monitored = monitored;
        this.lastInfoSync = lastInfoSync;
        this.imdbId = imdbId;
        this.tmdbId = tmdbId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSortTitle() {
        return sortTitle;
    }

    public void setSortTitle(String sortTitle) {
        this.sortTitle = sortTitle;
    }

    public Long getSizeOnDisk() {
        return sizeOnDisk;
    }

    public void setSizeOnDisk(Long sizeOnDisk) {
        this.sizeOnDisk = sizeOnDisk;
    }

    public Boolean getDownloaded() {
        return downloaded;
    }

    public void setDownloaded(Boolean downloaded) {
        this.downloaded = downloaded;
    }

    public Boolean getMonitored() {
        return monitored;
    }

    public void setMonitored(Boolean monitored) {
        this.monitored = monitored;
    }

    public Date getLastInfoSync() {
        return lastInfoSync;
    }

    public void setLastInfoSync(Date lastInfoSync) {
        this.lastInfoSync = lastInfoSync;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public Long getTmdbId() {
        return tmdbId;
    }

    public void setTmdbId(Long tmdbId) {
        this.tmdbId = tmdbId;
    }

    @Override
    public String toString() {
        return "RadarrMovie{" +
                "id=" + id +
                ", sortTitle='" + sortTitle + '\'' +
                ", sizeOnDisk=" + sizeOnDisk +
                ", downloaded=" + downloaded +
                ", monitored=" + monitored +
                ", lastInfoSync=" + lastInfoSync +
                ", imdbId='" + imdbId + '\'' +
                ", tmdbId=" + tmdbId +
                '}';
    }
}
