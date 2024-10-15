package com.bechir.games;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bechir.games.repos.GameRepository;
@SpringBootTest
class GamesApplicationTests {

	@Autowired
	private GameRepository gameRepository;
}