package dev.ali.ApiMovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.ali.ApiMovies.models.Movies;

public interface MovieRepository extends JpaRepository<Movies, Long> {

    
} 
