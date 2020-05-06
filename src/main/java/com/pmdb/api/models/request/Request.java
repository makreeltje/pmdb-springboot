package com.pmdb.api.models.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "adult",
        "backdropPath",
        "genreIds",
        "originalLanguage",
        "originalTitle",
        "overview",
        "popularity",
        "posterPath",
        "releaseDate",
        "title",
        "video",
        "voteAverage",
        "voteCount",
        "alreadyInCp",
        "trailer",
        "homepage",
        "rootPathOverride",
        "qualityOverride",
        "type",
        "releaseDates",
        "digitalReleaseDate",
        "id",
        "approved",
        "denied",
        "deniedReason",
        "requested",
        "requestId",
        "available",
        "plexUrl",
        "embyUrl",
        "quality",
        "imdbId",
        "theTvDbId",
        "theMovieDbId",
        "subscribed",
        "showSubscribe"
})
public class Request {

    @JsonProperty("adult")
    private Boolean adult;
    @JsonProperty("backdropPath")
    private String backdropPath;
    @JsonProperty("genreIds")
    private List<Object> genreIds = null;
    @JsonProperty("originalLanguage")
    private String originalLanguage;
    @JsonProperty("originalTitle")
    private String originalTitle;
    @JsonProperty("overview")
    private String overview;
    @JsonProperty("popularity")
    private Double popularity;
    @JsonProperty("posterPath")
    private String posterPath;
    @JsonProperty("releaseDate")
    private String releaseDate;
    @JsonProperty("title")
    private String title;
    @JsonProperty("video")
    private Boolean video;
    @JsonProperty("voteAverage")
    private Double voteAverage;
    @JsonProperty("voteCount")
    private Integer voteCount;
    @JsonProperty("alreadyInCp")
    private Boolean alreadyInCp;
    @JsonProperty("trailer")
    private Object trailer;
    @JsonProperty("homepage")
    private Object homepage;
    @JsonProperty("rootPathOverride")
    private Integer rootPathOverride;
    @JsonProperty("qualityOverride")
    private Integer qualityOverride;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("releaseDates")
    private Object releaseDates;
    @JsonProperty("digitalReleaseDate")
    private Object digitalReleaseDate;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("approved")
    private Boolean approved;
    @JsonProperty("denied")
    private Boolean denied;
    @JsonProperty("deniedReason")
    private Object deniedReason;
    @JsonProperty("requested")
    private Boolean requested;
    @JsonProperty("requestId")
    private Integer requestId;
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("plexUrl")
    private String plexUrl;
    @JsonProperty("embyUrl")
    private Object embyUrl;
    @JsonProperty("quality")
    private String quality;
    @JsonProperty("imdbId")
    private Object imdbId;
    @JsonProperty("theTvDbId")
    private Object theTvDbId;
    @JsonProperty("theMovieDbId")
    private String theMovieDbId;
    @JsonProperty("subscribed")
    private Boolean subscribed;
    @JsonProperty("showSubscribe")
    private Boolean showSubscribe;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("adult")
    public Boolean getAdult() {
        return adult;
    }

    @JsonProperty("adult")
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    @JsonProperty("backdropPath")
    public String getBackdropPath() {
        return backdropPath;
    }

    @JsonProperty("backdropPath")
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    @JsonProperty("genreIds")
    public List<Object> getGenreIds() {
        return genreIds;
    }

    @JsonProperty("genreIds")
    public void setGenreIds(List<Object> genreIds) {
        this.genreIds = genreIds;
    }

    @JsonProperty("originalLanguage")
    public String getOriginalLanguage() {
        return originalLanguage;
    }

    @JsonProperty("originalLanguage")
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    @JsonProperty("originalTitle")
    public String getOriginalTitle() {
        return originalTitle;
    }

    @JsonProperty("originalTitle")
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    @JsonProperty("overview")
    public String getOverview() {
        return overview;
    }

    @JsonProperty("overview")
    public void setOverview(String overview) {
        this.overview = overview;
    }

    @JsonProperty("popularity")
    public Double getPopularity() {
        return popularity;
    }

    @JsonProperty("popularity")
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    @JsonProperty("posterPath")
    public String getPosterPath() {
        return posterPath;
    }

    @JsonProperty("posterPath")
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    @JsonProperty("releaseDate")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("releaseDate")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("video")
    public Boolean getVideo() {
        return video;
    }

    @JsonProperty("video")
    public void setVideo(Boolean video) {
        this.video = video;
    }

    @JsonProperty("voteAverage")
    public Double getVoteAverage() {
        return voteAverage;
    }

    @JsonProperty("voteAverage")
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    @JsonProperty("voteCount")
    public Integer getVoteCount() {
        return voteCount;
    }

    @JsonProperty("voteCount")
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @JsonProperty("alreadyInCp")
    public Boolean getAlreadyInCp() {
        return alreadyInCp;
    }

    @JsonProperty("alreadyInCp")
    public void setAlreadyInCp(Boolean alreadyInCp) {
        this.alreadyInCp = alreadyInCp;
    }

    @JsonProperty("trailer")
    public Object getTrailer() {
        return trailer;
    }

    @JsonProperty("trailer")
    public void setTrailer(Object trailer) {
        this.trailer = trailer;
    }

    @JsonProperty("homepage")
    public Object getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    @JsonProperty("rootPathOverride")
    public Integer getRootPathOverride() {
        return rootPathOverride;
    }

    @JsonProperty("rootPathOverride")
    public void setRootPathOverride(Integer rootPathOverride) {
        this.rootPathOverride = rootPathOverride;
    }

    @JsonProperty("qualityOverride")
    public Integer getQualityOverride() {
        return qualityOverride;
    }

    @JsonProperty("qualityOverride")
    public void setQualityOverride(Integer qualityOverride) {
        this.qualityOverride = qualityOverride;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("releaseDates")
    public Object getReleaseDates() {
        return releaseDates;
    }

    @JsonProperty("releaseDates")
    public void setReleaseDates(Object releaseDates) {
        this.releaseDates = releaseDates;
    }

    @JsonProperty("digitalReleaseDate")
    public Object getDigitalReleaseDate() {
        return digitalReleaseDate;
    }

    @JsonProperty("digitalReleaseDate")
    public void setDigitalReleaseDate(Object digitalReleaseDate) {
        this.digitalReleaseDate = digitalReleaseDate;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("approved")
    public Boolean getApproved() {
        return approved;
    }

    @JsonProperty("approved")
    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    @JsonProperty("denied")
    public Boolean getDenied() {
        return denied;
    }

    @JsonProperty("denied")
    public void setDenied(Boolean denied) {
        this.denied = denied;
    }

    @JsonProperty("deniedReason")
    public Object getDeniedReason() {
        return deniedReason;
    }

    @JsonProperty("deniedReason")
    public void setDeniedReason(Object deniedReason) {
        this.deniedReason = deniedReason;
    }

    @JsonProperty("requested")
    public Boolean getRequested() {
        return requested;
    }

    @JsonProperty("requested")
    public void setRequested(Boolean requested) {
        this.requested = requested;
    }

    @JsonProperty("requestId")
    public Integer getRequestId() {
        return requestId;
    }

    @JsonProperty("requestId")
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @JsonProperty("plexUrl")
    public String getPlexUrl() {
        return plexUrl;
    }

    @JsonProperty("plexUrl")
    public void setPlexUrl(String plexUrl) {
        this.plexUrl = plexUrl;
    }

    @JsonProperty("embyUrl")
    public Object getEmbyUrl() {
        return embyUrl;
    }

    @JsonProperty("embyUrl")
    public void setEmbyUrl(Object embyUrl) {
        this.embyUrl = embyUrl;
    }

    @JsonProperty("quality")
    public String getQuality() {
        return quality;
    }

    @JsonProperty("quality")
    public void setQuality(String quality) {
        this.quality = quality;
    }

    @JsonProperty("imdbId")
    public Object getImdbId() {
        return imdbId;
    }

    @JsonProperty("imdbId")
    public void setImdbId(Object imdbId) {
        this.imdbId = imdbId;
    }

    @JsonProperty("theTvDbId")
    public Object getTheTvDbId() {
        return theTvDbId;
    }

    @JsonProperty("theTvDbId")
    public void setTheTvDbId(Object theTvDbId) {
        this.theTvDbId = theTvDbId;
    }

    @JsonProperty("theMovieDbId")
    public String getTheMovieDbId() {
        return theMovieDbId;
    }

    @JsonProperty("theMovieDbId")
    public void setTheMovieDbId(String theMovieDbId) {
        this.theMovieDbId = theMovieDbId;
    }

    @JsonProperty("subscribed")
    public Boolean getSubscribed() {
        return subscribed;
    }

    @JsonProperty("subscribed")
    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    @JsonProperty("showSubscribe")
    public Boolean getShowSubscribe() {
        return showSubscribe;
    }

    @JsonProperty("showSubscribe")
    public void setShowSubscribe(Boolean showSubscribe) {
        this.showSubscribe = showSubscribe;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
