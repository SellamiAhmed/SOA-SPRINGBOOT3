package com.bechir.games.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bechir.games.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}