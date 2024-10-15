package com.bechir.games.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bechir.games.entities.Game;
import com.bechir.games.entities.Studio;

@RepositoryRestResource(path ="rest")
public interface GameRepository extends JpaRepository<Game, Long> {

	 List<Game> findByNomGame(String nom);
	 List<Game> findByNomGameContains(String nom); 

	 
	 @Query("select p from Game p where p.nomGame like %:nom and p.rating > :rating")
	 List<Game> findByRating (@Param("nom") String nom,@Param("rating") String rating);
	 
	 @Query("select p from Game p where p.studio = ?1")
	 List<Game> findByStudio (Studio studio);
	 
	 List<Game> findByStudioIdStudio(Long id);
	 
	 List<Game> findByOrderByNomGameAsc();
	 
	 @Query("select p from Game p order by p.nomGame ASC, p.rating DESC")
	 List<Game> trierGamesNomsRating ();

}
