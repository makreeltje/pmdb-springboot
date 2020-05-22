package com.pmdb.api.models.movie;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "production_companies")
public class ProductionCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String logoPath;
    @JsonIgnore
    private Long movieId;
    private String name;
    private String originCountry;

    public ProductionCompany() {

    }

    public ProductionCompany(Long id, String logoPath, Long movieId, String name, String originCountry) {
        this.id = id;
        this.logoPath = logoPath;
        this.movieId = movieId;
        this.name = name;
        this.originCountry = originCountry;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    @Override
    public String toString() {
        return "ProductionCompany{" +
                "id=" + id +
                ", logoPath='" + logoPath + '\'' +
                ", movieId=" + movieId +
                ", name='" + name + '\'' +
                ", originCountry='" + originCountry + '\'' +
                '}';
    }
}
