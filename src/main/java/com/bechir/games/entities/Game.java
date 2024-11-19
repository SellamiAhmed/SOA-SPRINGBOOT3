package com.bechir.games.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGame;
    @JsonProperty("nomGame")
    private String nomGame;
    private String rating;
    private Date releaseDate;
    @ManyToOne
    private Studio studio;
    @OneToOne(fetch = FetchType.LAZY)
    private Image image;

    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY)
    @JsonManagedReference
    @JsonProperty("images")
    private List<Image> images;

    public Game() {
        super();
    }

    public Game(String nomGame, String rating, Date releaseDate) {
        super();
        this.nomGame = nomGame;
        this.rating = rating;
        this.releaseDate = releaseDate;
    }

    public Long getIdGame() {
        return idGame;
    }

    public void setIdGame(Long idGame) {
        this.idGame = idGame;
    }

    public String getNomGame() {
        return nomGame;
    }

    public void setNomGame(String nomGame) {
        this.nomGame = nomGame;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Game [idGame=" + idGame + ", nomGame=" +
                nomGame + ", rating=" + rating
                + ", releaseDate=" + releaseDate + "]";
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}