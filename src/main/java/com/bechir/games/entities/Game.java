package com.bechir.games.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
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
}