package com.bechir.games.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bechir.games.entities.Game;
import com.bechir.games.entities.Studio;
import com.bechir.games.repos.GameRepository;
import com.bechir.games.repos.ImageRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameServiceImpl implements GameService {
	@Autowired
	GameRepository gameRepository;

	@Autowired
	ImageRepository imageRepository;

	@Override
	public void deleteGame(Game p) {
		gameRepository.delete(p);
	}

	@Override
	public void deleteGameById(Long id) {
		gameRepository.deleteById(id);
	}

	@Override
	public Game saveGame(Game p) {
		return gameRepository.save(p);
	}

	@Override
	public Game updateGame(Game p) {
		// Long oldGameImageId = this.getGame(p.getIdGame()).getImage().getIdImage();
		// Long newGameImageId = p.getImage().getIdImage();

		Game updatedgame = gameRepository.save(p);

		// if (oldGameImageId != newGameImageId)
		// imageRepository.deleteById(oldGameImageId);

		return updatedgame;
	}

	@Override
	@Transactional
	public Game getGame(Long id) {
		Game p = gameRepository.findById(id).orElse(null);
		if (p != null) {
			p.getImages().size(); // Force initialization of the images field
		}
		return p;
	}

	@Override
	public List<Game> getAllGames() {
		List<Game> pls = gameRepository.findAll();
		return pls;
	}

	@Override
	public List<Game> findByNomGame(String nom) {
		return gameRepository.findByNomGame(nom);
	}

	@Override
	public List<Game> findByNomGameContains(String nom) {
		return gameRepository.findByNomGameContains(nom);
	}

	@Override
	public List<Game> findByRating(String nom, String rating) {
		return gameRepository.findByRating(nom, rating);
	}

	@Override
	public List<Game> findByStudio(Studio studio) {
		return gameRepository.findByStudio(studio);
	}

	@Override
	public List<Game> findByStudioIdStudio(Long id) {
		return gameRepository.findByStudioIdStudio(id);
	}

	@Override
	public List<Game> findByOrderByNomGameAsc() {
		return gameRepository.findByOrderByNomGameAsc();
	}

	@Override
	public List<Game> trierGamesNomsRating() {
		return gameRepository.trierGamesNomsRating();
	}

}