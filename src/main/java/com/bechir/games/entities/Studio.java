package com.bechir.games.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Studio {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStudio;
	private String nomStudio;
	private String descriptionStudio;
	@JsonIgnore
	@OneToMany(mappedBy = "studio")
	private List<Game> games;

	public Studio(String nomStudio, String descriptionStudio, List<Game> games) {
		super();
		this.nomStudio = nomStudio;
		this.descriptionStudio = descriptionStudio;
		this.games = games;
	}

	public Long getIdStudio() {
		return idStudio;
	}

	public void setIdStudio(Long idStudio) {
		this.idStudio = idStudio;
	}

	public String getNomStudio() {
		return nomStudio;
	}

	public void setNomStudio(String nomStudio) {
		this.nomStudio = nomStudio;
	}

	public String getDescriptionStudio() {
		return descriptionStudio;
	}

	public void setDescriptionStudio(String descriptionStudio) {
		this.descriptionStudio = descriptionStudio;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}
}
