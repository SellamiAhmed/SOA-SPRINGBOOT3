package com.bechir.games.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bechir.games.entities.Game;
import com.bechir.games.service.GameService;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class GameRestController {
	@Autowired
	GameService gameService;

	@RequestMapping(value="/all",method = RequestMethod.GET)
	public List<Game> getAllGames() {
		return gameService.getAllGames();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
	public Game getGameById(@PathVariable("id") Long id) {
		System.out.println(id);

		return gameService.getGame(id);
	}

	@RequestMapping(value= "/addgame",method = RequestMethod.POST)
	public Game createGame(@RequestBody Game game) {
		return gameService.saveGame(game);
	}

	@RequestMapping(value="/updategame",method = RequestMethod.PUT)
	public Game updateGame(@RequestBody Game gameDTO) {
		return gameService.updateGame(gameDTO);
	}

	@RequestMapping(value = "delgame/{id}", method = RequestMethod.DELETE)
	public void deleteGame(@PathVariable("id") Long id) {
		gameService.deleteGameById(id);
	}

	@RequestMapping(value = "/gamesbystudio/{idStudio}", method = RequestMethod.GET)
	public List<Game> getGamesByStudioId(@PathVariable("idStudio") Long idStudio) {
		return gameService.findByStudioIdStudio(idStudio);
	}

	@RequestMapping(value = "/gamesbyname/{nom}", method = RequestMethod.GET)
	public List<Game> findByNomGameContains(@PathVariable("nom") String nom) {
		return gameService.findByNomGameContains(nom);
	}

}