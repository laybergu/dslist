package com.laybergu.dslist.entities; 

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Title;
    
    @Column(name = "release_year")
    private Integer Year;
    private String Genre;
    private String Platforms;
    private Double Score;
    private String ImgUrl;

    @Column(columnDefinition = "TEXT")
    private String ShortDescription;
    
    @Column(columnDefinition = "TEXT")
    private String LongDescription;

    public Game() {
    }

    public Game(
            Long id,
            String title,
            Integer year,
            String genre,
            String platforms,
            Double score,
            String imgUrl,
            String shortDescription,
            String longDescription) {
        Id = id;
        Title = title;
        Year = year;
        Genre = genre;
        Platforms = platforms;
        Score = score;
        ImgUrl = imgUrl;
        ShortDescription = shortDescription;
        LongDescription = longDescription;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getPlatforms() {
        return Platforms;
    }

    public void setPlatforms(String platforms) {
        Platforms = platforms;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        Score = score;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }

    public String getShortDescription() {
        return ShortDescription;
    }

    public void setShortDescription(String shortDescription) {
        ShortDescription = shortDescription;
    }

    public String getLongDescription() {
        return LongDescription;
    }

    public void setLongDescription(String longDescription) {
        LongDescription = longDescription;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        if (Id == null) {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        return true;
    }
}
