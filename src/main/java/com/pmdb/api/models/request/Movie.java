package com.pmdb.api.models.request;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

public class Movie {

    private Boolean adult;
    private String backdropPath;
    private List<Object> genreIds = null;
    private String originalLanguage;
    private String originalTitle;
    private String overview;
    private Double popularity;
    private String posterPath;
    private String releaseDate;
    private String title;
    private Boolean video;
    private Double voteAverage;
    private Integer voteCount;
    private Boolean alreadyInCp;
    private Object trailer;
    private Object homepage;
    private Integer rootPathOverride;
    private Integer qualityOverride;
    private Integer type;
    private Object releaseDates;
    private Object digitalReleaseDate;
    private Integer id;
    private Boolean approved;
    private Boolean denied;
    private Object deniedReason;
    private Boolean requested;
    private Integer requestId;
    private Boolean available;
    private String plexUrl;
    private Object embyUrl;
    private String quality;
    private Object imdbId;
    private Object theTvDbId;
    private String theMovieDbId;
    private Boolean subscribed;
    private Boolean showSubscribe;

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public List<Object> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Object> genreIds) {
        this.genreIds = genreIds;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Boolean getAlreadyInCp() {
        return alreadyInCp;
    }

    public void setAlreadyInCp(Boolean alreadyInCp) {
        this.alreadyInCp = alreadyInCp;
    }

    public Object getTrailer() {
        return trailer;
    }

    public void setTrailer(Object trailer) {
        this.trailer = trailer;
    }

    public Object getHomepage() {
        return homepage;
    }

    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    public Integer getRootPathOverride() {
        return rootPathOverride;
    }

    public void setRootPathOverride(Integer rootPathOverride) {
        this.rootPathOverride = rootPathOverride;
    }

    public Integer getQualityOverride() {
        return qualityOverride;
    }

    public void setQualityOverride(Integer qualityOverride) {
        this.qualityOverride = qualityOverride;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Object getReleaseDates() {
        return releaseDates;
    }

    public void setReleaseDates(Object releaseDates) {
        this.releaseDates = releaseDates;
    }

    public Object getDigitalReleaseDate() {
        return digitalReleaseDate;
    }

    public void setDigitalReleaseDate(Object digitalReleaseDate) {
        this.digitalReleaseDate = digitalReleaseDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Boolean getDenied() {
        return denied;
    }

    public void setDenied(Boolean denied) {
        this.denied = denied;
    }

    public Object getDeniedReason() {
        return deniedReason;
    }

    public void setDeniedReason(Object deniedReason) {
        this.deniedReason = deniedReason;
    }

    public Boolean getRequested() {
        return requested;
    }

    public void setRequested(Boolean requested) {
        this.requested = requested;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getPlexUrl() {
        return plexUrl;
    }

    public void setPlexUrl(String plexUrl) {
        this.plexUrl = plexUrl;
    }

    public Object getEmbyUrl() {
        return embyUrl;
    }

    public void setEmbyUrl(Object embyUrl) {
        this.embyUrl = embyUrl;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Object getImdbId() {
        return imdbId;
    }

    public void setImdbId(Object imdbId) {
        this.imdbId = imdbId;
    }

    public Object getTheTvDbId() {
        return theTvDbId;
    }

    public void setTheTvDbId(Object theTvDbId) {
        this.theTvDbId = theTvDbId;
    }

    public String getTheMovieDbId() {
        return theMovieDbId;
    }

    public void setTheMovieDbId(String theMovieDbId) {
        this.theMovieDbId = theMovieDbId;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public Boolean getShowSubscribe() {
        return showSubscribe;
    }

    public void setShowSubscribe(Boolean showSubscribe) {
        this.showSubscribe = showSubscribe;
    }
}
