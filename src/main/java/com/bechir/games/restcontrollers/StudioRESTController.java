package com.bechir.games.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bechir.games.entities.Studio;
import com.bechir.games.repos.StudioRepository;

@RestController
@RequestMapping("/api/studio")
@CrossOrigin("*")
public class StudioRESTController {
	@Autowired
	StudioRepository studioRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Studio> getAllStudios() {
		return studioRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Studio getStudioById(@PathVariable("id") Long id) {
		return studioRepository.findById(id).get();
	}

	// POST REQUEST THAT GETS THE the studio as a request body and saves it to the database
	@RequestMapping(method = RequestMethod.POST)
	public Studio createStudio(@RequestBody Studio studio) {
		return studioRepository.save(studio);
	}


}
