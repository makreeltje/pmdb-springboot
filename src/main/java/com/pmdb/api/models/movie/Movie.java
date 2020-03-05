package com.pmdb.api.models.movie;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String sortTitle;
    private String cleanTitle;
    private String slugTitle;

    private String sizeOnDisk;

    private String status;

    private String overview;

    private Date inCinemas;

    private Date physicalRelease;

    private String website;

    private Boolean downloaded;

    private String youTubeTrailerId;

    private String studio;

    private Boolean isAvailable;

    private Date added;

    public Movie() {
    }

    public Movie(Integer id, String title, String sortTitle, String cleanTitle, String slugTitle, String sizeOnDisk, String status, String overview, Date inCinemas, Date physicalRelease, String website, Boolean downloaded, String youTubeTrailerId, String studio, Boolean isAvailable, Date added) {
        this.id = id;
        this.title = title;
        this.sortTitle = sortTitle;
        this.cleanTitle = cleanTitle;
        this.slugTitle = slugTitle;
        this.sizeOnDisk = sizeOnDisk;
        this.status = status;
        this.overview = overview;
        this.inCinemas = inCinemas;
        this.physicalRelease = physicalRelease;
        this.website = website;
        this.downloaded = downloaded;
        this.youTubeTrailerId = youTubeTrailerId;
        this.studio = studio;
        this.isAvailable = isAvailable;
        this.added = added;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getSlugTitle() {
        return slugTitle;
    }

    public void setSlugTitle(String slugTitle) {
        this.slugTitle = slugTitle;
    }

    public String getSizeOnDisk() {
        return sizeOnDisk;
    }

    public void setSizeOnDisk(String sizeOnDisk) {
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

    public Date getInCinemas() {
        return inCinemas;
    }

    public void setInCinemas(Date inCinemas) {
        this.inCinemas = inCinemas;
    }

    public Date getPhysicalRelease() {
        return physicalRelease;
    }

    public void setPhysicalRelease(Date physicalRelease) {
        this.physicalRelease = physicalRelease;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Boolean getDownloaded() {
        return downloaded;
    }

    public void setDownloaded(Boolean downloaded) {
        this.downloaded = downloaded;
    }

    public String getYouTubeTrailerId() {
        return youTubeTrailerId;
    }

    public void setYouTubeTrailerId(String youTubeTrailerId) {
        this.youTubeTrailerId = youTubeTrailerId;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sortTitle='" + sortTitle + '\'' +
                ", cleanTitle='" + cleanTitle + '\'' +
                ", slugTitle='" + slugTitle + '\'' +
                ", sizeOnDisk='" + sizeOnDisk + '\'' +
                ", status='" + status + '\'' +
                ", overview='" + overview + '\'' +
                ", inCinemas=" + inCinemas +
                ", physicalRelease=" + physicalRelease +
                ", website='" + website + '\'' +
                ", downloaded=" + downloaded +
                ", youTubeTrailerId='" + youTubeTrailerId + '\'' +
                ", studio='" + studio + '\'' +
                ", isAvailable=" + isAvailable +
                ", added=" + added +
                '}';
    }
}
