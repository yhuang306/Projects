package com.example.java_web_final_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChineseDrama {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String dramaName;
    private String directorName;
    private String actorName;
    private String actressName;
    private Integer year;

    private String imageUrl;

    public ChineseDrama(){}

    public ChineseDrama(Integer id, String dramaName, String directorName, String actorName, String actressName, Integer year, String imageUrl) {
        this.id = id;
        this.dramaName = dramaName;
        this.directorName = directorName;
        this.actorName = actorName;
        this.actressName = actressName;
        this.year = year;
        this.imageUrl = imageUrl;
    }

    public ChineseDrama(String dramaName, String directorName, String actorName, String actressName, Integer year, String imageUrl) {
        this.dramaName = dramaName;
        this.directorName = directorName;
        this.actorName = actorName;
        this.actressName = actressName;
        this.year = year;
        this.imageUrl = imageUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDramaName() {
        return dramaName;
    }

    public void setDramaName(String dramaName) {
        this.dramaName = dramaName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActressName() {
        return actressName;
    }

    public void setActressName(String actressName) {
        this.actressName = actressName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "ChineseDrama{" +
                "id=" + id +
                ", dramaName='" + dramaName + '\'' +
                ", directorName='" + directorName + '\'' +
                ", actorName='" + actorName + '\'' +
                ", actressName='" + actressName + '\'' +
                ", year=" + year +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
