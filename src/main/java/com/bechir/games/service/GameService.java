
package com.bechir.games.service;

import java.util.List;

import com.bechir.games.entities.Game;
import com.bechir.games.entities.Studio;

public interface GameService {
	Game saveGame(Game p);
	
	Game updateGame(Game p);
	void deleteGame(Game p);
	Game getGame(Long id);
	List<Game> findByNomGame(String nom);
	List<Game> findByNomGameContains(String nom);
	void deleteGameById(Long id);
	List<Game> getAllGames();
	List<Game> findByStudio (Studio studio);
	List<Game> findByRating(String nom, String rating);
	List<Game> findByStudioIdStudio(Long id);
	List<Game> trierGamesNomsRating();
	List<Game> findByOrderByNomGameAsc();



}
