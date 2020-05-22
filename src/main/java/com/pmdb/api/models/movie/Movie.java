package com.pmdb.api.models.movie;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "movies")
public class Movie {

    // Properties from Radarr
    @Id
    private Long id;
    @JsonProperty("sort_title")
    private String sortTitle;
    @JsonProperty("size_on_disk")
    private Long sizeOnDisk;
    private Boolean downloaded;
    private Boolean monitored;
    @JsonProperty("last_info_sync")
    private Date lastInfoSync;
    @JsonProperty("imdb_id")
    private String imdbId;
    @JsonProperty("tmdb_id")
    private Long tmdbId;

    // Properties from Tmdb
    @JsonProperty("backdrop_path")
    private String backdropPath;
    private Long budget;
    private String homepage;
    @Column(columnDefinition = "text")
    private String overview;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("release_date")
    private Date releaseDate;
    private Long revenue;
    private Long runtime;
    private String status;
    private String title;
    @JsonProperty("vote_average")
    private Double voteAverage;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movieId")
    @JsonProperty("production_companies")
    private List<ProductionCompany> productionCompanies;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movieId")
    private List<Genre> genres;

    public Movie() {

    }

    public Movie(Long id, String sortTitle, Long sizeOnDisk, Boolean downloaded, Boolean monitored, Date lastInfoSync, String imdbId, Long tmdbId, String backdropPath, Long budget, String homepage, String overview, String posterPath, Date releaseDate, Long revenue, Long runtime, String status, String title, Double voteAverage, List<ProductionCompany> productionCompanies, List<Genre> genres) {
        this.id = id;
        this.sortTitle = sortTitle;
        this.sizeOnDisk = sizeOnDisk;
        this.downloaded = downloaded;
        this.monitored = monitored;
        this.lastInfoSync = lastInfoSync;
        this.imdbId = imdbId;
        this.tmdbId = tmdbId;
        this.backdropPath = backdropPath;
        this.budget = budget;
        this.homepage = homepage;
        this.overview = overview;
        this.posterPath = posterPath;
        this.releaseDate = releaseDate;
        this.revenue = revenue;
        this.runtime = runtime;
        this.status = status;
        this.title = title;
        this.voteAverage = voteAverage;
        this.productionCompanies = productionCompanies;
        this.genres = genres;
    }

    public Movie(RadarrMovie radarrMovie, TmdbMovie tmdbMovie)
    {
        // RadarrMovie properties
        this.id = radarrMovie.getId();
        this.sortTitle = radarrMovie.getSortTitle();
        this.sizeOnDisk = radarrMovie.getSizeOnDisk();
        this.downloaded = radarrMovie.getDownloaded();
        this.monitored = radarrMovie.getMonitored();
        this.lastInfoSync = radarrMovie.getLastInfoSync();
        this.imdbId = radarrMovie.getImdbId();
        this.tmdbId = radarrMovie.getTmdbId();

        // TmdbMovie properties
        this.backdropPath = tmdbMovie.getBackdropPath();
        this.budget = tmdbMovie.getBudget();
        this.genres = (List<Genre>) tmdbMovie.getGenres();
        this.homepage = tmdbMovie.getHomepage();
        this.overview = tmdbMovie.getOverview();
        this.posterPath = tmdbMovie.getPosterPath();
        this.productionCompanies = (List<ProductionCompany>) tmdbMovie.getProductionCompanies();
        this.releaseDate = tmdbMovie.getReleaseDate();
        this.revenue = tmdbMovie.getRevenue();
        this.runtime = tmdbMovie.getRuntime();
        this.status = tmdbMovie.getStatus();
        this.title = tmdbMovie.getTitle();
        this.voteAverage = tmdbMovie.getVoteAverage();
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

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    public Long getRuntime() {
        return runtime;
    }

    public void setRuntime(Long runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public List<ProductionCompany> getProductionCompanies() {
        return productionCompanies;
    }

    public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", sortTitle='" + sortTitle + '\'' +
                ", sizeOnDisk=" + sizeOnDisk +
                ", downloaded=" + downloaded +
                ", monitored=" + monitored +
                ", lastInfoSync=" + lastInfoSync +
                ", imdbId='" + imdbId + '\'' +
                ", tmdbId=" + tmdbId +
                ", backdropPath='" + backdropPath + '\'' +
                ", budget=" + budget +
                ", homepage='" + homepage + '\'' +
                ", overview='" + overview + '\'' +
                ", posterPath='" + posterPath + '\'' +
                ", releaseDate=" + releaseDate +
                ", revenue=" + revenue +
                ", runtime=" + runtime +
                ", status='" + status + '\'' +
                ", title='" + title + '\'' +
                ", voteAverage=" + voteAverage +
                ", productionCompanies=" + productionCompanies +
                ", genres=" + genres +
                '}';
    }
}
