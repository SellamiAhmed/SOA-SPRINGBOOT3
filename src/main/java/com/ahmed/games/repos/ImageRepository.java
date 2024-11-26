package com.ahmed.games.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.games.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}