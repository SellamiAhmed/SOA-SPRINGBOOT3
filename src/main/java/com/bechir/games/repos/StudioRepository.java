package com.bechir.games.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bechir.games.entities.Studio;

@RepositoryRestResource(path = "studio")
@CrossOrigin("http://localhost:4200/") // pour autoriser angular
public interface StudioRepository extends JpaRepository<Studio, Long> {

}
